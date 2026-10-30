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

import booleanExpressionModel.BooleanExpressionModelPackage;
import rules.*;

public class BooleanExpressionMapperRunner {

    public static void main(String[] args) throws IOException {

        String input = 
                "	\\if (p,v) \\equalTo (\"level_in\",\"Light\") \\and action \\equalTo \"Waiving\"			\\then	(\"Reading\", delta_t_r \\substraction e,\\false),\r\n"
                        + "	\\inOtherCase"; 

        System.out.println("===== INPUT =====");
        System.out.println(input);

        CharStream cs = CharStreams.fromString(input);
        CFG_BOOLEAN_EXPRESSIONLexer lexer = new CFG_BOOLEAN_EXPRESSIONLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CFG_BOOLEAN_EXPRESSIONParser parser = new CFG_BOOLEAN_EXPRESSIONParser(tokens);

        ParseTree tree = parser.root();

        System.out.println("===== PARSE TREE =====");
        System.out.println(tree.toStringTree(parser));

        BooleanExpressionMapperListener listener = new BooleanExpressionMapperListener(tokens);
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        EObject root = listener.getRootExpression();

        System.out.println("===== ÁRBOL EMF RESULTANTE =====");
        // BooleanExpressionMapperListener.printExpression(root, 0);

        // --- EMF init + ResourceSet registry ---
        BooleanExpressionModelPackage.eINSTANCE.eClass();

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        resSet.getPackageRegistry().put(BooleanExpressionModelPackage.eNS_URI, BooleanExpressionModelPackage.eINSTANCE);

        // --- Guardar SOLO XMI ---
        URI xmiURI = URI.createFileURI(new File("booleanExpressionModel.xmi").getAbsolutePath());
        Resource xmiResource = resSet.createResource(xmiURI);
        if (root != null) xmiResource.getContents().add(root);
        xmiResource.save(null);

        System.out.println("Modelo EMF guardado en: " + xmiURI.toFileString());

        // --- Validación ---
        System.out.println("===== VALIDACIÓN EMF =====");
        if (root == null) {
            System.out.println("Root es null (parse/mapeo falló). No se puede validar.");
            return;
        }

        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);
        System.out.println("Resultado: " + diagnostic);
    }
}