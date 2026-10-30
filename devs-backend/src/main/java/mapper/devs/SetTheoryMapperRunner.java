package mapper.devs;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rules.*;
import setTheoryModel.*;

public class SetTheoryMapperRunner {

    public static void main(String[] args) throws IOException {

        String input = "M = { (detector, DETECTOR), (fixture,FIXTURE(#delta_saving))}";

        System.out.println("===== INPUT =====");
        System.out.println(input);

        CharStream cs = CharStreams.fromString(input);
        CFG_SET_THEORYLexer lexer = new CFG_SET_THEORYLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CFG_SET_THEORYParser parser = new CFG_SET_THEORYParser(tokens);

        ParseTree tree = parser.set();

        System.out.println("===== PARSE TREE =====");
        System.out.println(tree.toStringTree(parser));

        SetTheoryMapperListener listener = new SetTheoryMapperListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        EObject root = listener.getRootSet();

        System.out.println("===== ÁRBOL EMF RESULTANTE =====");
        // SetTheoryMapperListener.printExpression(root, 0);

        // --- EMF init + ResourceSet registry ---
        SetTheoryModelPackage.eINSTANCE.eClass();

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        resSet.getPackageRegistry().put(SetTheoryModelPackage.eNS_URI, SetTheoryModelPackage.eINSTANCE);

        // --- Guardar SOLO XMI ---
        URI xmiURI = URI.createFileURI(new File("setTheoryModel.xmi").getAbsolutePath());
        Resource xmiResource = resSet.createResource(xmiURI);
        if (root != null) xmiResource.getContents().add(root);
        xmiResource.save(null);

        System.out.println("Modelo EMF guardado en: " + xmiURI.toFileString());

        // --- Validación ---
        if (root != null) {
            Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);
            System.out.println("===== VALIDACIÓN EMF =====");
            System.out.println("Resultado: " + diagnostic);
        } else {
            System.out.println("===== VALIDACIÓN EMF =====");
            System.out.println("Root es null (parse/mapeo falló)");
        }
    }
}