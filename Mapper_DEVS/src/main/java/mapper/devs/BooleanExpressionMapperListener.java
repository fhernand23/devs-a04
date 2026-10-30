package mapper.devs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;

import booleanExpressionModel.ActionConstant;
import booleanExpressionModel.ActionExpression;
import booleanExpressionModel.BinaryCondition;
import booleanExpressionModel.BinaryOperator;
import booleanExpressionModel.BooleanExpression;
import booleanExpressionModel.BooleanExpressionModelFactory;
import booleanExpressionModel.BooleanTerm;
import booleanExpressionModel.CaseExpression;
import booleanExpressionModel.ConditionalExpression;
import booleanExpressionModel.Constant;
import booleanExpressionModel.Element;
import booleanExpressionModel.ElementDefinition;
import booleanExpressionModel.Expression;
import booleanExpressionModel.ParenthesisExpression;
import booleanExpressionModel.RelationalCondition;
import booleanExpressionModel.RelationalOperator;
import booleanExpressionModel.SetTheoryCondition;
import booleanExpressionModel.UnaryCondition;
import booleanExpressionModel.UnaryOperator;
import rules.CFG_BOOLEAN_EXPRESSIONBaseListener;
import rules.CFG_BOOLEAN_EXPRESSIONParser;

public class BooleanExpressionMapperListener extends CFG_BOOLEAN_EXPRESSIONBaseListener {

    private final BooleanExpressionModelFactory factory =
            BooleanExpressionModelFactory.eINSTANCE;

    @SuppressWarnings("unused")
    private final CommonTokenStream tokens;

    /**
     * Stack principal de expresiones booleanas ya construidas.
     */
    private final Stack<BooleanExpression> expressionStack = new Stack<BooleanExpression>();

    /**
     * Stack de términos booleanos simples que todavía no se combinaron
     * en una condición relacional completa.
     */
    private final Stack<BooleanTerm> termStack = new Stack<BooleanTerm>();

    private Expression rootExpression;

    public BooleanExpressionMapperListener(CommonTokenStream tokens) {
        this.tokens = tokens;
        if (this.tokens != null) {
            this.tokens.fill();
        }
    }

    // =========================================================
    // ROOT
    // =========================================================

    @Override
    public void exitRootIfThen(CFG_BOOLEAN_EXPRESSIONParser.RootIfThenContext ctx) {

        BooleanExpression cond = popBooleanExpressionOrTermAsRelational();

        ConditionalExpression ce = factory.createConditionalExpression();

        CaseExpression mainCase = factory.createCaseExpression();
        mainCase.setCondition(cond);

        /*
         * La nueva regla ifThenCondition solo consume:
         * \if <cond> \then
         *
         * Por eso no hay thenExpr ni elseExpr acá.
         * Dejamos el thenExpression como una constante true
         * para evitar null si esta entrada se usa como root aislado.
         */
        mainCase.setThenExpression(createBooleanConstantExpression(true));

        ce.getCases().add(mainCase);

        rootExpression = ce;
    }

    private BooleanExpression createBooleanConstantExpression(boolean value) {
        Constant c = factory.createConstant();
        c.setValue(value ? "true" : "false");
        return (BooleanExpression) c;
    }

    @Override
    public void exitRootIf(CFG_BOOLEAN_EXPRESSIONParser.RootIfContext ctx) {
        rootExpression = popBooleanExpressionOrTermAsRelational();
    }

    @Override
    public void exitRootBooleanExpr(CFG_BOOLEAN_EXPRESSIONParser.RootBooleanExprContext ctx) {
        rootExpression = popBooleanExpressionOrTermAsRelational();
    }

    /**
     * Devuelve la mejor expresión booleana disponible.
     * Si no hay una expresión completa, envuelve el término actual
     * como comparación contra true.
     */
    private BooleanExpression popBooleanExpressionOrTermAsRelational() {
        if (!expressionStack.isEmpty()) {
            return expressionStack.pop();
        }

        if (!termStack.isEmpty()) {
            return wrapTermAsRelational(termStack.pop());
        }

        // Fallback seguro: true == true
        Constant t = factory.createConstant();
        t.setValue("true");

        RelationalCondition rc = factory.createRelationalCondition();
        rc.setRelationalOperator(RelationalOperator.EQUAL);
        rc.setLeft(t);
        rc.setRight(t);

        return rc;
    }

    // =========================================================
    // ACTION EXPRESSION (then/else)
    // =========================================================

    /**
     * Convierte la rama then/else a una Expression del metamodelo.
     */
    private Expression mapActionExpression(CFG_BOOLEAN_EXPRESSIONParser.ActionExpressionContext act) {

        if (act == null) {
            return actionConstantExpr("INFINITY");
        }

        if (act instanceof CFG_BOOLEAN_EXPRESSIONParser.ActionInfinityContext) {
            return actionConstantExpr("INFINITY");
        }

        if (act instanceof CFG_BOOLEAN_EXPRESSIONParser.ActionElementContext) {
            String txt = ((CFG_BOOLEAN_EXPRESSIONParser.ActionElementContext) act)
                    .element()
                    .getText();
            return actionConstantExpr(txt);
        }

        if (act instanceof CFG_BOOLEAN_EXPRESSIONParser.ActionElementDefinitionContext) {
            String txt = ((CFG_BOOLEAN_EXPRESSIONParser.ActionElementDefinitionContext) act)
                    .elementDefinition()
                    .getText();
            return actionConstantExpr(txt);
        }

        return actionConstantExpr(act.getText());
    }

    /**
     * Construye una acción simple a partir de un valor textual.
     */
    private Expression actionConstantExpr(String value) {
        ActionConstant ac = factory.createActionConstant();
        ac.setValue(value == null ? "" : value.trim());

        ActionExpression ae = factory.createActionExpression();
        ae.getElements().add(ac);

        return ae;
    }

    // =========================================================
    // BOOLEAN TERMS
    // =========================================================

    @Override
    public void exitElementExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementExprContext ctx) {
        String text = ctx.el.getText();

        if ("\\true".equals(text) || "\\false".equals(text)) {
            Constant c = factory.createConstant();
            c.setValue(text.substring(1));
            termStack.push(c);
            return;
        }

        if (isQuotedString(text)) {
            Constant c = factory.createConstant();
            c.setValue(unquote(text));
            termStack.push(c);
            return;
        }

        Element el = factory.createElement();
        el.setName(text);
        termStack.push(el);
    }

    @Override
    public void exitElementDefinitionExpr(CFG_BOOLEAN_EXPRESSIONParser.ElementDefinitionExprContext ctx) {
        try {
            setTheoryModel.ElementDefinition setDefinition =
                    SetTheoryMapperListener.mapElementDefinitionFromText(ctx.el.getText());

            SetTheoryCondition condition = factory.createSetTheoryCondition();
            condition.setDefinition(setDefinition);

            expressionStack.push(condition);

        } catch (Exception ex) {
            ElementDefinition def = factory.createElementDefinition();
            def.setDefinition(ctx.el.getText());
            termStack.push(def);
        }
    }
    
    @Override
    public void exitInfinityExpr(CFG_BOOLEAN_EXPRESSIONParser.InfinityExprContext ctx) {
        Constant c = factory.createConstant();
        c.setValue("INFINITY");
        termStack.push(c);
    }

    // =========================================================
    // RELATIONAL
    // =========================================================

    @Override
    public void exitRelationalExpr(CFG_BOOLEAN_EXPRESSIONParser.RelationalExprContext ctx) {
        int opCount = ctx.binaryRelationalOperator().size();

        if (opCount == 0) {
            if (!termStack.isEmpty()) {
                expressionStack.push(wrapTermAsRelational(termStack.pop()));
            }
            return;
        }

        /*
         * Por ahora tomamos el primer operador relacional.
         * Ejemplo:
         *   a \equalTo b
         */
        String opText = ctx.binaryRelationalOperator(0).getText();

        BooleanTerm right = termStack.pop();
        BooleanTerm left = termStack.pop();

        RelationalOperator op = parseRelationalOperator(opText);

        /*
         * Mejora:
         *
         *   (p,signal) \equalTo ("signal_in","moving")
         *
         * se mapea como:
         *
         *   p == "signal_in" AND signal == "moving"
         *
         * En vez de guardar la tupla completa como Element("(p,signal)").
         */
        BooleanExpression tupleExpanded = tryBuildTupleRelationalCondition(left, right, op);
        if (tupleExpanded != null) {
            expressionStack.push(tupleExpanded);
            return;
        }

        RelationalCondition rc = factory.createRelationalCondition();
        rc.setLeft(left);
        rc.setRight(right);
        rc.setRelationalOperator(op);

        expressionStack.push(rc);
    }
    
    private BooleanExpression tryBuildTupleRelationalCondition(
            BooleanTerm left,
            BooleanTerm right,
            RelationalOperator op) {

        String leftText = termToRawText(left);
        String rightText = termToRawText(right);

        if (!isTupleText(leftText) || !isTupleText(rightText)) {
            return null;
        }

        List<String> leftParts = splitTupleText(leftText);
        List<String> rightParts = splitTupleText(rightText);

        if (leftParts == null || rightParts == null) {
            return null;
        }

        if (leftParts.size() != rightParts.size()) {
            return null;
        }

        if (leftParts.isEmpty()) {
            return null;
        }

        /*
         * Para igualdad de tuplas:
         *
         *   (a,b) == (1,2)
         *
         * equivale a:
         *
         *   a == 1 AND b == 2
         *
         * Para desigualdad:
         *
         *   (a,b) != (1,2)
         *
         * equivale a:
         *
         *   a != 1 OR b != 2
         */
        BinaryOperator joinOperator =
                op == RelationalOperator.NOT_EQUAL
                        ? BinaryOperator.OR
                        : BinaryOperator.AND;

        RelationalOperator elementOperator =
                op == RelationalOperator.NOT_EQUAL
                        ? RelationalOperator.NOT_EQUAL
                        : op;

        BooleanExpression acc = null;

        for (int i = 0; i < leftParts.size(); i++) {
            RelationalCondition rc = factory.createRelationalCondition();

            rc.setLeft(createBooleanTermFromText(leftParts.get(i)));
            rc.setRight(createBooleanTermFromText(rightParts.get(i)));
            rc.setRelationalOperator(elementOperator);

            if (acc == null) {
                acc = rc;
            } else {
                BinaryCondition bc = factory.createBinaryCondition();
                bc.setLeft(acc);
                bc.setRight(rc);
                bc.setOperator(joinOperator);

                acc = bc;
            }
        }

        return acc;
    }
   
    private String termToRawText(BooleanTerm term) {
        if (term == null) return null;

        if (term instanceof Element) {
            return ((Element) term).getName();
        }

        if (term instanceof Constant) {
            String v = ((Constant) term).getValue();

            if ("true".equals(v)) return "\\true";
            if ("false".equals(v)) return "\\false";
            if ("INFINITY".equals(v)) return "\\infinity";

            return v;
        }

        if (term instanceof ElementDefinition) {
            return ((ElementDefinition) term).getDefinition();
        }

        return null;
    }
    
    private boolean isTupleText(String text) {
        if (text == null) return false;

        String t = text.trim();

        return t.startsWith("(")
                && t.endsWith(")")
                && hasTopLevelComma(t);
    }
    
    private boolean hasTopLevelComma(String text) {
        if (text == null) return false;

        int depth = 0;
        boolean inString = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '"') {
                inString = !inString;
                continue;
            }

            if (inString) continue;

            if (c == '(' || c == '{' || c == '[') {
                depth++;
            } else if (c == ')' || c == '}' || c == ']') {
                depth--;
            } else if (c == ',' && depth == 1) {
                return true;
            }
        }

        return false;
    }
    
    private List<String> splitTupleText(String text) {
        List<String> result = new ArrayList<String>();

        if (!isTupleText(text)) {
            return result;
        }

        String inner = text.trim();
        inner = inner.substring(1, inner.length() - 1);

        int depth = 0;
        boolean inString = false;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < inner.length(); i++) {
            char c = inner.charAt(i);

            if (c == '"') {
                inString = !inString;
                current.append(c);
                continue;
            }

            if (!inString) {
                if (c == '(' || c == '{' || c == '[') {
                    depth++;
                    current.append(c);
                    continue;
                }

                if (c == ')' || c == '}' || c == ']') {
                    depth--;
                    current.append(c);
                    continue;
                }

                if (c == ',' && depth == 0) {
                    result.add(current.toString().trim());
                    current.setLength(0);
                    continue;
                }
            }

            current.append(c);
        }

        String last = current.toString().trim();
        if (!last.isEmpty()) {
            result.add(last);
        }

        return result;
    }
    
    private BooleanTerm createBooleanTermFromText(String text) {
        String t = text == null ? "" : text.trim();

        if ("\\true".equals(t) || "true".equals(t)) {
            Constant c = factory.createConstant();
            c.setValue("true");
            return c;
        }

        if ("\\false".equals(t) || "false".equals(t)) {
            Constant c = factory.createConstant();
            c.setValue("false");
            return c;
        }

        if ("\\infinity".equals(t) || "INFINITY".equals(t) || "infinity".equals(t)) {
            Constant c = factory.createConstant();
            c.setValue("INFINITY");
            return c;
        }

        if (isQuotedString(t)) {
            Constant c = factory.createConstant();
            c.setValue(unquote(t));
            return c;
        }

        if (t.matches("-?\\d+(\\.\\d+)?")) {
            Constant c = factory.createConstant();
            c.setValue(t);
            return c;
        }

        Element el = factory.createElement();
        el.setName(t);
        return el;
    }
    
    /**
     * Envuelve un término suelto como una condición equivalente a:
     * término == true
     */
    private RelationalCondition wrapTermAsRelational(BooleanTerm t) {
        RelationalCondition wrap = factory.createRelationalCondition();
        wrap.setRelationalOperator(RelationalOperator.EQUAL);

        if (t == null) {
            Constant c0 = factory.createConstant();
            c0.setValue("true");
            wrap.setLeft(c0);
            wrap.setRight(c0);
            return wrap;
        }

        wrap.setLeft(t);

        Constant c = factory.createConstant();
        c.setValue("true");
        wrap.setRight(c);

        return wrap;
    }

    // =========================================================
    // UNARY / BINARY
    // =========================================================

    @Override
    public void exitUnaryCondExpr(CFG_BOOLEAN_EXPRESSIONParser.UnaryCondExprContext ctx) {
        UnaryCondition un = factory.createUnaryCondition();
        un.setOperator(UnaryOperator.NOT);

        BooleanExpression inner = popBooleanExpressionOrTermAsRelational();
        un.setExpression(inner);

        expressionStack.push(un);
    }

    @Override
    public void exitBinaryExpr(CFG_BOOLEAN_EXPRESSIONParser.BinaryExprContext ctx) {
        int opCount = ctx.binaryConditionalOperator().size();

        if (opCount == 0) {
            // Si no hubo operador pero quedó un término suelto, lo convertimos en expresión.
            if (expressionStack.isEmpty() && !termStack.isEmpty()) {
                expressionStack.push(wrapTermAsRelational(termStack.pop()));
            }
            return;
        }

        BooleanExpression[] parts = new BooleanExpression[opCount + 1];
        for (int i = opCount; i >= 0; i--) {
            parts[i] = popBooleanExpressionOrTermAsRelational();
        }

        BooleanExpression acc = parts[0];

        for (int i = 0; i < opCount; i++) {
            String opText = ctx.binaryConditionalOperator(i).getText();

            BinaryCondition bc = factory.createBinaryCondition();
            bc.setLeft(acc);
            bc.setRight(parts[i + 1]);
            bc.setOperator(parseBinaryOperator(opText));

            acc = bc;
        }

        expressionStack.push(acc);
    }

    // =========================================================
    // PARENTHESIS
    // =========================================================

    @Override
    public void exitParenthesisExpr(CFG_BOOLEAN_EXPRESSIONParser.ParenthesisExprContext ctx) {
        BooleanExpression inner = popBooleanExpressionOrTermAsRelational();

        ParenthesisExpression pe = factory.createParenthesisExpression();
        pe.setInner(inner);

        expressionStack.push(pe);
    }

    // =========================================================
    // Operators
    // =========================================================

    private RelationalOperator parseRelationalOperator(String text) {
        if ("\\equalTo".equals(text)) return RelationalOperator.EQUAL;
        if ("\\notEqualTo".equals(text)) return RelationalOperator.NOT_EQUAL;
        if ("\\greaterThan".equals(text)) return RelationalOperator.GREATER;
        if ("\\lessThan".equals(text)) return RelationalOperator.LESS;
        if ("\\greaterThanOrEqualTo".equals(text)) return RelationalOperator.GREATER_EQUAL;
        if ("\\lessThanOrEqualTo".equals(text)) return RelationalOperator.LESS_EQUAL;

        return RelationalOperator.EQUAL;
    }

    private BinaryOperator parseBinaryOperator(String text) {
        if ("\\and".equals(text)) return BinaryOperator.AND;
        if ("\\or".equals(text)) return BinaryOperator.OR;

        return BinaryOperator.AND;
    }

    // =========================================================
    // String helpers
    // =========================================================

    private boolean isQuotedString(String s) {
        return s != null && s.length() >= 2 && s.startsWith("\"") && s.endsWith("\"");
    }

    private String unquote(String s) {
        if (!isQuotedString(s)) return s;
        return s.substring(1, s.length() - 1);
    }

    public Expression getRootExpression() {
        return rootExpression;
    }
}