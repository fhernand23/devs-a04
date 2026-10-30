package mapper.devs;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import booleanExpressionModel.BooleanExpressionModelPackage;
import devsModel.DevsModelPackage;
import devsModel.DevsSpecification;
import mathExpressionModel.MathExpressionModelPackage;
import setTheoryModel.SetTheoryModelPackage;

import rules.CFG_DEVS_MODELLexer;
import rules.CFG_DEVS_MODELParser;

public class DevsMapperRunner {

    public static void main(String[] args) throws Exception {

        // =========================================================
        // Entrada DEVS desde archivo
        // =========================================================

        String exampleName =
                args.length > 0
                        ? args[0]
                        : "AM_HummingbirdFeeder_Test01_MJB";

        String resourcePath =
                "/examples/"
                + exampleName
                + ".txt";

        InputStream inputStream =
                DevsMapperRunner.class
                        .getResourceAsStream(resourcePath);

        if (inputStream == null) {

            throw new IllegalStateException(
                    "No se encontró el archivo DEVS: "
                    + resourcePath
            );
        }

        String input;

        try (InputStream in = inputStream) {

            input = new String(
                    in.readAllBytes(),
                    StandardCharsets.UTF_8
            );
        }

        System.out.println(
                "========================================"
        );

        System.out.println(
                "EJEMPLO DEVS: " + exampleName
        );

        System.out.println(
                "========================================"
        );

        System.out.println(
                "Archivo: " + resourcePath
        );

        System.out.println(
                "\n===== INPUT ====="
        );

        System.out.println(input);


        // =========================================================
        // 1. Parsing con ANTLR
        // =========================================================

        CharStream cs =
                CharStreams.fromString(input);

        CFG_DEVS_MODELLexer lexer =
                new CFG_DEVS_MODELLexer(cs);

        CommonTokenStream tokens =
                new CommonTokenStream(lexer);

        CFG_DEVS_MODELParser parser =
                new CFG_DEVS_MODELParser(tokens);

        ParseTree tree =
                parser.devsSpecification();


        if (parser.getNumberOfSyntaxErrors() > 0) {

            throw new IllegalStateException(
                    "La especificación "
                    + exampleName
                    + " contiene "
                    + parser.getNumberOfSyntaxErrors()
                    + " error(es) sintáctico(s)."
            );
        }


        System.out.println(
                "\n===== PARSE TREE ====="
        );

        System.out.println(
                tree.toStringTree(parser)
        );


        // =========================================================
        // 2. Inicialización de metamodelos
        // =========================================================

        DevsModelPackage.eINSTANCE.eClass();

        SetTheoryModelPackage.eINSTANCE.eClass();

        MathExpressionModelPackage.eINSTANCE.eClass();

        BooleanExpressionModelPackage.eINSTANCE.eClass();


        ResourceSet resSet =
                new ResourceSetImpl();


        // =========================================================
        // Factoría XMI
        // =========================================================

        resSet
            .getResourceFactoryRegistry()
            .getExtensionToFactoryMap()
            .put(
                "xmi",
                new XMIResourceFactoryImpl()
            );


        // =========================================================
        // Registro de paquetes
        // =========================================================

        resSet
            .getPackageRegistry()
            .put(
                DevsModelPackage.eNS_URI,
                DevsModelPackage.eINSTANCE
            );

        resSet
            .getPackageRegistry()
            .put(
                SetTheoryModelPackage.eNS_URI,
                SetTheoryModelPackage.eINSTANCE
            );

        resSet
            .getPackageRegistry()
            .put(
                MathExpressionModelPackage.eNS_URI,
                MathExpressionModelPackage.eINSTANCE
            );

        resSet
            .getPackageRegistry()
            .put(
                BooleanExpressionModelPackage.eNS_URI,
                BooleanExpressionModelPackage.eINSTANCE
            );


        // =========================================================
        // 3. Mapeo ANTLR -> devsModel
        // =========================================================

        DevsMapperListener listener =
                new DevsMapperListener(tokens);

        org.antlr.v4.runtime.tree.ParseTreeWalker.DEFAULT.walk(
                listener,
                tree
        );

        DevsSpecification root =
                listener.getRoot();


        if (root == null) {

            throw new IllegalStateException(
                    "El mapper no generó una raíz DevsSpecification."
            );
        }


        System.out.println(
                "\n===== MAPEADO OK ====="
        );


        // =========================================================
        // 4. Guardado del modelo intermedio
        // =========================================================

        File devsModelFile =
                new File("devsModel.xmi");

        URI xmiURI =
                URI.createFileURI(
                        devsModelFile.getAbsolutePath()
                );

        Resource xmiResource =
                resSet.createResource(xmiURI);

        xmiResource
                .getContents()
                .add(root);


        Map<Object, Object> saveOptions =
                new HashMap<Object, Object>();

        saveOptions.put(
                XMLResource.OPTION_SCHEMA_LOCATION,
                Boolean.FALSE
        );

        saveOptions.put(
                XMLResource.OPTION_SAVE_TYPE_INFORMATION,
                Boolean.TRUE
        );

        xmiResource.save(saveOptions);


        System.out.println(
                "Modelo intermedio guardado en: "
                + xmiURI.toFileString()
        );


        // =========================================================
        // 5. Validación del modelo intermedio
        // =========================================================

        System.out.println(
                "\n===== VALIDACIÓN MODELO INTERMEDIO ====="
        );

        Diagnostic diagnostic =
                Diagnostician.INSTANCE.validate(root);

        printDiagnostic(
                diagnostic,
                ""
        );

        System.out.println(
                "\nSeveridad validación intermedia: "
                + diagnostic.getSeverity()
        );


        /*
         * IMPORTANTE:
         *
         * Las restricciones OCL están llegando como WARNING (2),
         * no necesariamente como ERROR (4).
         *
         * Por eso cualquier severidad distinta de OK invalida
         * el modelo.
         */
        if (diagnostic.getSeverity()
                != Diagnostic.OK) {

            System.err.println(
                    "\nEl modelo intermedio NO cumple "
                    + "las restricciones de validación."
            );

            System.err.println(
                    "El pipeline se detiene antes de ATL."
            );

            return;
        }


        System.out.println(
                "\nModelo intermedio válido"
        );


        // =========================================================
        // 6. Transformación ATL
        // =========================================================

        System.out.println(
                "\n===== TRANSFORMACIÓN ATL ====="
        );

        File computationalModelFile =
                new File(
                        "devsComputationalModel.xmi"
                );


        AtlTransformationRunner.transform(
                devsModelFile,
                computationalModelFile
        );


        System.out.println(
                "Modelo computacional generado en: "
                + computationalModelFile.getAbsolutePath()
        );


        // =========================================================
        // 7. Validación modelo computacional + OCL
        // =========================================================

        System.out.println(
                "\n===== VALIDACIÓN MODELO COMPUTACIONAL ====="
        );


        Diagnostic computationalDiagnostic =
                ComputationalModelValidator.validate(
                        computationalModelFile
                );


        printDiagnostic(
                computationalDiagnostic,
                ""
        );


        System.out.println(
                "\nSeveridad validación computacional: "
                + computationalDiagnostic.getSeverity()
        );


        /*
         * Igual que para el modelo intermedio:
         * cualquier diagnóstico distinto de OK hace
         * inválido al modelo.
         */
        if (computationalDiagnostic.getSeverity()
                != Diagnostic.OK) {

            System.err.println(
                    "\nEl modelo computacional NO cumple "
                    + "las restricciones de validación."
            );

            return;
        }


        System.out.println(
                "\nModelo computacional válido"
        );


        // =========================================================
        // Fin
        // =========================================================

        System.out.println(
                "\n========================================"
        );

        System.out.println(
                "PROCESO COMPLETADO CORRECTAMENTE"
        );

        System.out.println(
                "========================================"
        );

        System.out.println(
                "Ejemplo procesado: "
                + exampleName
        );

        System.out.println(
                "Modelo intermedio: "
                + devsModelFile.getAbsolutePath()
        );

        System.out.println(
                "Modelo computacional: "
                + computationalModelFile.getAbsolutePath()
        );
    }


    // =============================================================
    // Impresión de diagnósticos
    // =============================================================

    private static void printDiagnostic(
            Diagnostic diagnostic,
            String indent) {

        if (diagnostic.getMessage() != null) {

            System.out.println(
                    indent
                    + diagnostic.getMessage()
            );
        }

        for (Diagnostic child
                : diagnostic.getChildren()) {

            printDiagnostic(
                    child,
                    indent + "  "
            );
        }
    }
}