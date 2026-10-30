package mapper.devs;

import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;

import mathExpressionModel.BinaryExpression;
import mathExpressionModel.BinaryOperator;
import mathExpressionModel.Element;
import mathExpressionModel.InfinityLiteral;
import mathExpressionModel.MathExpression;
import mathExpressionModel.MathExpressionModelFactory;
import mathExpressionModel.ParenthesisExpression;
import mathExpressionModel.UnaryExpression;
import mathExpressionModel.UnaryOperator;
import rules.CFG_MATH_EXPRESSIONBaseListener;
import rules.CFG_MATH_EXPRESSIONParser;

public class MathExpressionMapperListener extends CFG_MATH_EXPRESSIONBaseListener {

    private final MathExpressionModelFactory factory =
            MathExpressionModelFactory.eINSTANCE;

    /**
     * Stack auxiliar para ir armando la expresión matemática
     * a medida que se recorre el árbol de ANTLR.
     */
    private final Stack<MathExpression> stack = new Stack<MathExpression>();

    // =========================================================
    // Binary Expression (+, -)
    // =========================================================

    @Override
    public void exitBinaryMathExpression(
            CFG_MATH_EXPRESSIONParser.BinaryMathExpressionContext ctx) {

        /*
         * La gramática es:
         *
         * binaryMathExpression
         *   : left=mathExpressionTerm
         *     op=binaryMathOperatorLowerPrecedence
         *     right=mathExpressionTerm
         *   ;
         *
         * Como el recorrido es post-order:
         *
         * stack:
         *   ...
         *   left
         *   right  <- top
         *
         * Por eso acá sí corresponde sacar primero right
         * y después left.
         */
        MathExpression right = stack.pop();
        MathExpression left = stack.pop();

        BinaryExpression expr = factory.createBinaryExpression();
        expr.setLeft(left);
        expr.setRight(right);
        expr.setOperator(mapBinaryOperator(ctx.op.getText()));

        stack.push(expr);
    }

    // =========================================================
    // Unary Expression (sqrt)
    // =========================================================

    @Override
    public void exitUnaryMathExpression(
            CFG_MATH_EXPRESSIONParser.UnaryMathExpressionContext ctx) {

        MathExpression operand = stack.pop();

        UnaryExpression expr = factory.createUnaryExpression();
        expr.setOperand(operand);
        expr.setOperator(mapUnaryOperator(ctx.op.getText()));

        stack.push(expr);
    }

    // =========================================================
    // Term (*, /)
    // =========================================================

    @Override
    public void exitMathTerm(
            CFG_MATH_EXPRESSIONParser.MathTermContext ctx) {

        /*
         * Gramática:
         *
         * mathTerm
         *   : left=mathFactor
         *     (op=binaryMathOperatorHigherPrecedence
         *      right=mathFactor)*
         *   ;
         *
         * Ejemplo:
         *
         * velocity \multiplication angle
         *
         * Antes de entrar acá el stack queda:
         *
         *   velocity
         *   angle       <- top
         *
         * Por eso NO podemos hacer directamente:
         *
         *   left = stack.pop()
         *
         * porque obtendríamos angle como operando izquierdo.
         *
         * Primero recuperamos todos los operandos y restauramos
         * su orden original.
         */

        int operandCount = (ctx.getChildCount() + 1) / 2;

        MathExpression[] operands =
                new MathExpression[operandCount];

        /*
         * Se extraen desde el último hacia el primero.
         *
         * Ejemplo:
         * stack = [velocity, angle]
         *
         * operands[1] = angle
         * operands[0] = velocity
         */
        for (int i = operandCount - 1; i >= 0; i--) {
            operands[i] = stack.pop();
        }

        MathExpression left = operands[0];

        /*
         * Construcción de izquierda a derecha.
         *
         * Para:
         *
         * a * b / c
         *
         * queda:
         *
         * (a * b) / c
         *
         * que coincide con la gramática.
         */
        for (int operandIndex = 1;
             operandIndex < operandCount;
             operandIndex++) {

            int operatorChildIndex =
                    (operandIndex * 2) - 1;

            ParseTree opNode =
                    ctx.getChild(operatorChildIndex);

            MathExpression right =
                    operands[operandIndex];

            BinaryExpression be =
                    factory.createBinaryExpression();

            be.setLeft(left);
            be.setRight(right);
            be.setOperator(
                    mapBinaryOperator(opNode.getText())
            );

            left = be;
        }

        stack.push(left);
    }

    // =========================================================
    // Factor (^)
    // =========================================================

    @Override
    public void exitMathFactor(
            CFG_MATH_EXPRESSIONParser.MathFactorContext ctx) {

        /*
         * Gramática:
         *
         * mathFactor
         *   : left=mathExpressionBasicTerm
         *     (op=powerOperator
         *      right=mathExpressionBasicTerm)*
         *   ;
         *
         * Se aplica exactamente la misma corrección que
         * en mathTerm: recuperar los operandos respetando
         * el orden original.
         */

        int operandCount = (ctx.getChildCount() + 1) / 2;

        MathExpression[] operands =
                new MathExpression[operandCount];

        for (int i = operandCount - 1; i >= 0; i--) {
            operands[i] = stack.pop();
        }

        MathExpression left = operands[0];

        for (int operandIndex = 1;
             operandIndex < operandCount;
             operandIndex++) {

            MathExpression right =
                    operands[operandIndex];

            BinaryExpression be =
                    factory.createBinaryExpression();

            be.setLeft(left);
            be.setRight(right);
            be.setOperator(BinaryOperator.POWER);

            left = be;
        }

        stack.push(left);
    }

    // =========================================================
    // Parenthesis
    // =========================================================

    @Override
    public void exitMathExpressionResult(
            CFG_MATH_EXPRESSIONParser.MathExpressionResultContext ctx) {

        MathExpression inner = stack.pop();

        ParenthesisExpression expr =
                factory.createParenthesisExpression();

        expr.setExpression(inner);

        stack.push(expr);
    }

    // =========================================================
    // Element (variable, número o constante)
    // =========================================================

    @Override
    public void exitMathExpressionElement(
            CFG_MATH_EXPRESSIONParser.MathExpressionElementContext ctx) {

        String text = ctx.el.getText();

        if (text != null) {
            text = text.trim();
        }

        /*
         * En algunos casos puede llegar algo como "(9)".
         * Si el contenido interno es numérico,
         * se simplifica al valor.
         */
        if (text != null
                && text.startsWith("(")
                && text.endsWith(")")) {

            String inner =
                    text.substring(
                            1,
                            text.length() - 1
                    ).trim();

            Double innerVal =
                    tryParseDouble(inner);

            if (innerVal != null) {
                text = inner;
            }
        }

        // Infinito
        if ("\\infinity".equals(text)
                || "infinity".equals(text)) {

            InfinityLiteral inf =
                    factory.createInfinityLiteral();

            stack.push(inf);
            return;
        }

        Element element =
                factory.createElement();

        element.setName(text);

        /*
         * Si representa un número,
         * se guarda también su valor numérico.
         */
        Double numericValue =
                tryParseDouble(text);

        if (numericValue != null) {
            element.setValue(numericValue);
        }

        stack.push(element);
    }

    // =========================================================
    // Utils
    // =========================================================

    /**
     * Intenta convertir un texto a Double.
     * También contempla variantes de infinito.
     */
    private Double tryParseDouble(String text) {

        try {

            if ("\\infinity".equals(text)
                    || "infinity".equals(text)) {

                return Double.POSITIVE_INFINITY;
            }

            if ("-\\infinity".equals(text)
                    || "-infinity".equals(text)) {

                return Double.NEGATIVE_INFINITY;
            }

            return Double.parseDouble(text);

        } catch (Exception e) {
            return null;
        }
    }

    private BinaryOperator mapBinaryOperator(
            String opText) {

        switch (opText) {

            case "\\addition":
                return BinaryOperator.ADD;

            case "\\substraction":
                return BinaryOperator.SUBTRACT;

            case "\\multiplication":
                return BinaryOperator.MULTIPLY;

            case "\\division":
                return BinaryOperator.DIVIDE;

            case "\\power":
                return BinaryOperator.POWER;

            default:
                throw new RuntimeException(
                        "Unknown binary operator: "
                        + opText
                );
        }
    }

    private UnaryOperator mapUnaryOperator(
            String opText) {

        switch (opText) {

            case "\\sqrt":
                return UnaryOperator.SQRT;

            default:
                throw new RuntimeException(
                        "Unknown unary operator: "
                        + opText
                );
        }
    }

    // =========================================================
    // ROOT
    // =========================================================

    public MathExpression getRootExpression() {

        if (stack.isEmpty()) {
            return null;
        }

        return stack.peek();
    }

    // =========================================================
    // DEBUG PRINT
    // =========================================================

    /**
     * Imprime la expresión matemática
     * en formato árbol para depuración.
     */
    public static void printExpression(
            MathExpression expr,
            int indent) {

        if (expr == null) {
            return;
        }

        String pad =
                " ".repeat(indent * 2);

        if (expr instanceof Element) {

            Element e =
                    (Element) expr;

            System.out.println(
                    pad
                    + "Element: "
                    + e.getName()
                    + (
                        e.getValue() != null
                        ? " (" + e.getValue() + ")"
                        : ""
                    )
            );

        } else if (expr instanceof BinaryExpression) {

            BinaryExpression be =
                    (BinaryExpression) expr;

            System.out.println(
                    pad
                    + "Binary: "
                    + be.getOperator()
            );

            printExpression(
                    be.getLeft(),
                    indent + 1
            );

            printExpression(
                    be.getRight(),
                    indent + 1
            );

        } else if (expr instanceof UnaryExpression) {

            UnaryExpression ue =
                    (UnaryExpression) expr;

            System.out.println(
                    pad
                    + "Unary: "
                    + ue.getOperator()
            );

            printExpression(
                    ue.getOperand(),
                    indent + 1
            );

        } else if (expr instanceof ParenthesisExpression) {

            System.out.println(
                    pad + "Parenthesis"
            );

            printExpression(
                    ((ParenthesisExpression) expr)
                            .getExpression(),
                    indent + 1
            );

        } else if (expr instanceof InfinityLiteral) {

            System.out.println(
                    pad + "InfinityLiteral"
            );
        }
    }
}