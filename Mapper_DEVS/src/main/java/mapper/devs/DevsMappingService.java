package mapper.devs;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.springframework.stereotype.Service;

import booleanExpressionModel.BooleanExpressionModelPackage;
import devsModel.DevsModelPackage;
import devsModel.DevsSpecification;
import mathExpressionModel.MathExpressionModelPackage;
import rules.CFG_DEVS_MODELLexer;
import rules.CFG_DEVS_MODELParser;
import setTheoryModel.SetTheoryModelPackage;

@Service
public class DevsMappingService {

    public DevsMappingResponse map(String source) {

        Path workDir = null;
        String devsModelXmi = null;
        String computationalXmi = null;
        ValidationResultDto intermediateValidation = null;
        ValidationResultDto computationalValidation = null;

        try {
            workDir = Files.createTempDirectory("mapper-devs-web-");
            File intermediateFile = workDir.resolve("devsModel.xmi").toFile();
            File computationalFile = workDir.resolve("devsComputationalModel.xmi").toFile();

            // =====================================================
            // 1. Parsing ANTLR
            // =====================================================
            CharStream charStream = CharStreams.fromString(source);

            CFG_DEVS_MODELLexer lexer = new CFG_DEVS_MODELLexer(charStream);
            SyntaxErrorCollector syntaxErrors = new SyntaxErrorCollector();
            lexer.removeErrorListeners();
            lexer.addErrorListener(syntaxErrors);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CFG_DEVS_MODELParser parser = new CFG_DEVS_MODELParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(syntaxErrors);

            ParseTree tree = parser.devsSpecification();

            if (syntaxErrors.hasErrors()) {
                return new DevsMappingResponse(
                        false,
                        MappingStage.PARSING,
                        "La especificación contiene errores sintácticos.",
                        new ValidationResultDto(false, Diagnostic.ERROR, syntaxErrors.messages()),
                        null,
                        null,
                        null
                );
            }

            // =====================================================
            // 2. Mapper ANTLR -> devsModel
            // =====================================================
            initializeIntermediateMetamodels();

            DevsMapperListener listener = new DevsMapperListener(tokens);
            ParseTreeWalker.DEFAULT.walk(listener, tree);

            DevsSpecification root = listener.getRoot();

            if (root == null) {
                return new DevsMappingResponse(
                        false,
                        MappingStage.INTERMEDIATE_MAPPING,
                        "Mapper_DEVS no generó una DevsSpecification.",
                        null,
                        null,
                        null,
                        null
                );
            }

            saveIntermediateModel(root, intermediateFile);
            devsModelXmi = readXml(intermediateFile.toPath());

            // =====================================================
            // 3. Validación intermedia
            // =====================================================
            Diagnostic intermediateDiagnostic = Diagnostician.INSTANCE.validate(root);
            intermediateValidation = toValidationResult(intermediateDiagnostic);

            if (intermediateDiagnostic.getSeverity() != Diagnostic.OK) {
                return new DevsMappingResponse(
                        false,
                        MappingStage.INTERMEDIATE_VALIDATION,
                        "El modelo intermedio no cumple las restricciones de validación.",
                        intermediateValidation,
                        null,
                        devsModelXmi,
                        null
                );
            }

            // =====================================================
            // 4. ATL -> devsComputationalModel
            // =====================================================
            AtlTransformationRunner.transform(intermediateFile, computationalFile);
            computationalXmi = readXml(computationalFile.toPath());

            // =====================================================
            // 5. Validación computacional
            // =====================================================
            Diagnostic computationalDiagnostic =
                    ComputationalModelValidator.validate(computationalFile);

            computationalValidation = toValidationResult(computationalDiagnostic);

            if (computationalDiagnostic.getSeverity() != Diagnostic.OK) {
                return new DevsMappingResponse(
                        false,
                        MappingStage.COMPUTATIONAL_VALIDATION,
                        "El modelo computacional no cumple las restricciones de validación.",
                        intermediateValidation,
                        computationalValidation,
                        devsModelXmi,
                        computationalXmi
                );
            }

            return new DevsMappingResponse(
                    true,
                    MappingStage.COMPLETED,
                    "Proceso completado correctamente.",
                    intermediateValidation,
                    computationalValidation,
                    devsModelXmi,
                    computationalXmi
            );

        } catch (Exception e) {
            List<String> errors = List.of(
                    e.getClass().getSimpleName() + ": " + String.valueOf(e.getMessage())
            );

            return new DevsMappingResponse(
                    false,
                    MappingStage.ERROR,
                    "Se produjo un error durante el procesamiento.",
                    intermediateValidation,
                    computationalValidation != null
                            ? computationalValidation
                            : new ValidationResultDto(false, Diagnostic.ERROR, errors),
                    devsModelXmi,
                    computationalXmi
            );

        } finally {
            deleteRecursively(workDir);
        }
    }

    private void initializeIntermediateMetamodels() {
        DevsModelPackage.eINSTANCE.eClass();
        SetTheoryModelPackage.eINSTANCE.eClass();
        MathExpressionModelPackage.eINSTANCE.eClass();
        BooleanExpressionModelPackage.eINSTANCE.eClass();
    }

    private void saveIntermediateModel(
            DevsSpecification root,
            File output) throws IOException {

        ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry()
                .getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());

        resourceSet.getPackageRegistry()
                .put(DevsModelPackage.eNS_URI, DevsModelPackage.eINSTANCE);
        resourceSet.getPackageRegistry()
                .put(SetTheoryModelPackage.eNS_URI, SetTheoryModelPackage.eINSTANCE);
        resourceSet.getPackageRegistry()
                .put(MathExpressionModelPackage.eNS_URI, MathExpressionModelPackage.eINSTANCE);
        resourceSet.getPackageRegistry()
                .put(BooleanExpressionModelPackage.eNS_URI, BooleanExpressionModelPackage.eINSTANCE);

        Resource resource = resourceSet.createResource(
                URI.createFileURI(output.getAbsolutePath())
        );

        resource.getContents().add(root);

        Map<Object, Object> options = new HashMap<>();
        options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.FALSE);
        options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.TRUE);

        resource.save(options);
    }

    private ValidationResultDto toValidationResult(Diagnostic diagnostic) {
        List<String> messages = new ArrayList<>();
        collectDiagnostics(diagnostic, messages, true);

        return new ValidationResultDto(
                diagnostic.getSeverity() == Diagnostic.OK,
                diagnostic.getSeverity(),
                messages
        );
    }

    private void collectDiagnostics(
            Diagnostic diagnostic,
            List<String> messages,
            boolean root) {

        if (!root
                && diagnostic.getMessage() != null
                && !diagnostic.getMessage().isBlank()) {
            messages.add(diagnostic.getMessage());
        }

        for (Diagnostic child : diagnostic.getChildren()) {
            collectDiagnostics(child, messages, false);
        }
    }

    private String readXml(Path path) throws IOException {
        byte[] bytes = Files.readAllBytes(path);

        // Los XMI generados actualmente por EMF declaran ISO-8859-1.
        // Si luego se fuerza UTF-8 al guardar, este método se puede cambiar
        // a StandardCharsets.UTF_8.
        return new String(bytes, StandardCharsets.ISO_8859_1);
    }

    private void deleteRecursively(Path path) {
        if (path == null || !Files.exists(path)) {
            return;
        }

        try (var stream = Files.walk(path)) {
            stream.sorted(Comparator.reverseOrder())
                    .forEach(p -> {
                        try {
                            Files.deleteIfExists(p);
                        } catch (IOException ignored) {
                        }
                    });
        } catch (IOException ignored) {
        }
    }

    private static class SyntaxErrorCollector extends BaseErrorListener {

        private final List<String> messages = new ArrayList<>();

        @Override
        public void syntaxError(
                Recognizer<?, ?> recognizer,
                Object offendingSymbol,
                int line,
                int charPositionInLine,
                String msg,
                RecognitionException e) {

            messages.add(
                    "Línea " + line + ":" + charPositionInLine + " " + msg
            );
        }

        boolean hasErrors() {
            return !messages.isEmpty();
        }

        List<String> messages() {
            return List.copyOf(messages);
        }
    }
}
