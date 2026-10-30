package mapper.devs.helpers;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import booleanExpressionModel.BooleanExpressionModelPackage;
import booleanExpressionModel.Expression;
import mapper.devs.BooleanExpressionMapperListener;
import rules.CFG_BOOLEAN_EXPRESSIONLexer;
import rules.CFG_BOOLEAN_EXPRESSIONParser;

public class BooleanExpressionMapperHelper {

    /**
     * Mapea una expresión booleana tomada desde el árbol DEVS.
     */
    public static Expression mapFromDevs(ParseTree ctx, CommonTokenStream devsTokens) {
        if (ctx == null) return null;
        return mapFromString(ctx.getText());
    }

    /**
     * Convierte un texto a una expresión booleana del metamodelo.
     * Si falla el parseo, devuelve null para no cortar el pipeline.
     */
    public static Expression mapFromString(String raw) {
        if (raw == null) return null;

        BooleanExpressionModelPackage.eINSTANCE.eClass();

        String text = raw.trim();

        // Marcadores especiales que equivalen a "caso por defecto".
        if ("\\inOtherCase".equals(text) || "\\otherwise".equals(text)) {
            return null;
        }

        try {
            CharStream cs = CharStreams.fromString(text);
            CFG_BOOLEAN_EXPRESSIONLexer lexer = new CFG_BOOLEAN_EXPRESSIONLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CFG_BOOLEAN_EXPRESSIONParser parser = new CFG_BOOLEAN_EXPRESSIONParser(tokens);

            // Estrategia fail-fast: si no se puede parsear, lanzamos excepción y hacemos fallback.
            parser.removeErrorListeners();
            parser.setErrorHandler(new BailErrorStrategy());

            ParseTree tree = parser.root();

            BooleanExpressionMapperListener listener = new BooleanExpressionMapperListener(tokens);
            ParseTreeWalker.DEFAULT.walk(listener, tree);

            return listener.getRootExpression();

        } catch (RuntimeException ex) {
            // Se tolera error para no romper el proceso de mapeo completo.
            return null;
        }
    }
}