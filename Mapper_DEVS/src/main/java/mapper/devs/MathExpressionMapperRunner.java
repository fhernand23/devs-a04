package mapper.devs;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import mathExpressionModel.MathExpression;
import mathExpressionModel.MathExpressionModelPackage;
import rules.CFG_MATH_EXPRESSIONLexer;
import rules.CFG_MATH_EXPRESSIONParser;

public class MathExpressionMapperRunner {

    public static void main(String[] args) throws IOException {

        String input = "x_pos \\addition sigma \\multiplication v_x,y_pos \\addition sigma \\multiplication v_y";

        System.out.println("===== INPUT =====");
        System.out.println(input);

        CharStream cs = CharStreams.fromString(input);
        CFG_MATH_EXPRESSIONLexer lexer = new CFG_MATH_EXPRESSIONLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CFG_MATH_EXPRESSIONParser parser = new CFG_MATH_EXPRESSIONParser(tokens);

        ParseTree tree = parser.mathExpression();

        System.out.println("===== PARSE TREE =====");
        System.out.println(tree.toStringTree(parser));

        MathExpressionMapperListener listener = new MathExpressionMapperListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        MathExpression root = listener.getRootExpression();

        System.out.println("===== Árbol =====");
        MathExpressionMapperListener.printExpression(root, 0);

        // --- EMF init + ResourceSet registry ---
        MathExpressionModelPackage.eINSTANCE.eClass();

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        resSet.getPackageRegistry().put(MathExpressionModelPackage.eNS_URI, MathExpressionModelPackage.eINSTANCE);

        // --- Guardar SOLO XMI ---
        URI xmiURI = URI.createFileURI(new File("mathExpressionModel.xmi").getAbsolutePath());
        Resource xmiResource = resSet.createResource(xmiURI);
        xmiResource.getContents().add(root);
        xmiResource.save(null);

        System.out.println("Modelo EMF guardado en: " + xmiURI.toFileString());

        // --- Validación ---
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(root);
        System.out.println("===== VALIDACIÓN EMF =====");
        System.out.println("Resultado: " + diagnostic);
    }
}