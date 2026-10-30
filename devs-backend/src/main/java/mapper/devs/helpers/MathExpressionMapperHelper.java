package mapper.devs.helpers;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import mapper.devs.MathExpressionMapperListener;
import mathExpressionModel.MathExpression;
import mathExpressionModel.MathExpressionModelPackage;
import rules.CFG_MATH_EXPRESSIONLexer;
import rules.CFG_MATH_EXPRESSIONParser;

public class MathExpressionMapperHelper {

    /**
     * Mapea un ParseTree a una expresión matemática del metamodelo.
     */
    public static MathExpression map(ParseTree ctx) {
        if (ctx == null) return null;

        MathExpressionModelPackage.eINSTANCE.eClass();

        String text = ctx.getText();

        CharStream cs = CharStreams.fromString(text);
        CFG_MATH_EXPRESSIONLexer lexer = new CFG_MATH_EXPRESSIONLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CFG_MATH_EXPRESSIONParser parser = new CFG_MATH_EXPRESSIONParser(tokens);

        ParseTree tree = parser.mathExpression();

        MathExpressionMapperListener listener = new MathExpressionMapperListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        MathExpression result = listener.getRootExpression();

        if (result == null) {
            throw new RuntimeException("MathExpression mapping failed for: " + text);
        }

        return result;
    }

    /**
     * Devuelve la representación EMF del literal 0.
     */
    public static MathExpression createZeroExpression() {
        MathExpressionModelPackage.eINSTANCE.eClass();
        return mapFromText("0");
    }

    /**
     * Igual que map, pero partiendo directamente de un String.
     */
    public static MathExpression mapFromText(String text) {
        MathExpressionModelPackage.eINSTANCE.eClass();

        CharStream cs = CharStreams.fromString(text);
        CFG_MATH_EXPRESSIONLexer lexer = new CFG_MATH_EXPRESSIONLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CFG_MATH_EXPRESSIONParser parser = new CFG_MATH_EXPRESSIONParser(tokens);

        ParseTree tree = parser.mathExpression();

        MathExpressionMapperListener listener = new MathExpressionMapperListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        MathExpression result = listener.getRootExpression();
        if (result == null) {
            throw new RuntimeException("MathExpression mapping failed for: " + text);
        }

        return result;
    }
}