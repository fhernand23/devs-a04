package mapper.devs;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import rules.CFG_SET_THEORYBaseListener;
import rules.CFG_SET_THEORYLexer;
import rules.CFG_SET_THEORYParser.BooleanSetSymbolExprContext;
import rules.CFG_SET_THEORYParser.DefCollectionWithImplicitSetExprContext;
import rules.CFG_SET_THEORYParser.DefCollectionWithRangeExprContext;
import rules.CFG_SET_THEORYParser.DefCollectionWithSymbolSetExprContext;
import rules.CFG_SET_THEORYParser.DefWithImplicitSetExprContext;
import rules.CFG_SET_THEORYParser.DefWithRangeExprContext;
import rules.CFG_SET_THEORYParser.DefWithSymbolSetExprContext;
import rules.CFG_SET_THEORYParser.ElementCollectionExprContext;
import rules.CFG_SET_THEORYParser.ElementContext;
import rules.CFG_SET_THEORYParser.ElementDefImplicitSetExprContext;
import rules.CFG_SET_THEORYParser.ElementDefRangeExprContext;
import rules.CFG_SET_THEORYParser.ElementDefSetSymbolExprContext;
import rules.CFG_SET_THEORYParser.ElementDefinitionContext;
import rules.CFG_SET_THEORYParser.ElementIdentifierContext;
import rules.CFG_SET_THEORYParser.ElementListExprContext;
import rules.CFG_SET_THEORYParser.ElementModelSignatureContext;
import rules.CFG_SET_THEORYParser.ElementNumberContext;
import rules.CFG_SET_THEORYParser.ElementParameterContext;
import rules.CFG_SET_THEORYParser.ElementStringContext;
import rules.CFG_SET_THEORYParser.ElementSuchThatExprContext;
import rules.CFG_SET_THEORYParser.ElementTupleContext;
import rules.CFG_SET_THEORYParser.ElementBooleanContext;
import rules.CFG_SET_THEORYParser.EmptySetExprContext;
import rules.CFG_SET_THEORYParser.EmptyTupleExprContext;
import rules.CFG_SET_THEORYParser.InOperatorExprContext;
import rules.CFG_SET_THEORYParser.IntegerSetSymbolExprContext;
import rules.CFG_SET_THEORYParser.NaturalSetSymbolExprContext;
import rules.CFG_SET_THEORYParser.NotInOperatorExprContext;
import rules.CFG_SET_THEORYParser.OperationSetDefinitionExprContext;
import rules.CFG_SET_THEORYParser.OperationSetExprContext;
import rules.CFG_SET_THEORYParser.OperationSetSymbolExprContext;
import rules.CFG_SET_THEORYParser.RangeExprContext;
import rules.CFG_SET_THEORYParser.RealSetSymbolExprContext;
import rules.CFG_SET_THEORYParser.SetAssignmentExprContext;
import rules.CFG_SET_THEORYParser.SetDefinitionExprContext;
import rules.CFG_SET_THEORYParser.SetNameSymbolExprContext;
import rules.CFG_SET_THEORYParser.SetOperationExprContext;
import rules.CFG_SET_THEORYParser.SetOperationParExprContext;
import rules.CFG_SET_THEORYParser.SetOperationParenthesisExprContext;
import rules.CFG_SET_THEORYParser.SetOperationResultExprContext;
import rules.CFG_SET_THEORYParser.SetOperationTermContext;
import rules.CFG_SET_THEORYParser.SetOperatorContext;
import rules.CFG_SET_THEORYParser.TupleCollectionExprContext;
import rules.CFG_SET_THEORYParser.TupleDefinitionExprContext;
import rules.CFG_SET_THEORYParser.TupleExprContext;
import rules.CFG_SET_THEORYParser.TupleSuchThatExprContext;
import setTheoryModel.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import rules.CFG_SET_THEORYParser;

public class SetTheoryMapperListener extends CFG_SET_THEORYBaseListener {

    private final SetTheoryModelFactory factory = SetTheoryModelFactory.eINSTANCE;

    /**
     * Guarda el objeto EMF asociado a cada contexto del parser.
     */
    private final Map<RuleContext, Object> values = new HashMap<RuleContext, Object>();

    private SetExpression rootSet;

    public SetTheoryMapperListener() {
        SetTheoryModelPackage.eINSTANCE.eClass();
    }

    public SetExpression getRootSet() {
        return rootSet;
    }

    private Object getValue(RuleContext ctx) {
        return values.get(ctx);
    }

    private void setValue(RuleContext ctx, Object value) {
        values.put(ctx, value);
    }

    // =========================================================
    // ROOT
    // =========================================================

    @Override
    public void exitSetAssignmentExpr(SetAssignmentExprContext ctx) {
        SetExplicitDefinition explicit = factory.createSetExplicitDefinition();
        explicit.setSymbol((SetSymbol) getValue(ctx.s));
        explicit.setDefinition((SetImplicitDefinition) getValue(ctx.rhs));

        setValue(ctx, explicit);
        rootSet = explicit;
    }

    // =========================================================
    // IMPLICIT DEFINITION
    // =========================================================

    @Override
    public void exitSetDefinitionExpr(SetDefinitionExprContext ctx) {
        SetImplicitDefinition implicit = factory.createSetImplicitDefinition();
        implicit.setOperation(null);
        implicit.setDefinition((SetDefinition) getValue(ctx.sd));

        setValue(ctx, implicit);
        rootSet = implicit;
    }

    @Override
    public void exitSetOperationResultExpr(SetOperationResultExprContext ctx) {
        SetImplicitDefinition implicit = factory.createSetImplicitDefinition();
        implicit.setDefinition(null);
        implicit.setOperation((SetOperationResult) getValue(ctx.sr));

        setValue(ctx, implicit);
        rootSet = implicit;
    }

    // =========================================================
    // SET DEFINITION
    // =========================================================

    @Override
    public void exitElementCollectionExpr(ElementCollectionExprContext ctx) {
        ElementCollection ec = (ElementCollection) getValue(ctx.ec);

        SetDefinition sd = factory.createSetDefinition();

        if (shouldNormalizeTupleElementCollection(ec)) {
            TupleCollection tc = toTupleCollection(ec);

            sd.setElementCollection(null);
            sd.setTupleCollection(tc);
        } else {
            sd.setTupleCollection(null);
            sd.setElementCollection(ec);
        }

        setValue(ctx, sd);
    }
    
    private boolean shouldNormalizeTupleElementCollection(ElementCollection ec) {
        if (ec == null) return false;
        if (ec.isIsEmpty()) return false;
        if (ec.getElements().size() != 1) return false;

        Element only = ec.getElements().get(0);

        return only != null
                && only.getType() == ElementType.TUPLE
                && only.getTuple() != null;
    }

    private TupleCollection toTupleCollection(ElementCollection ec) {
        TupleCollection tc = factory.createTupleCollection();

        Element tupleElement = ec.getElements().get(0);
        Tuple tuple = tupleElement.getTuple();

        tc.getTuples().add(tuple);

        ElementDefinition ed = ec.getDefinition();

        if (ed != null) {
            TupleDefinition td = factory.createTupleDefinition();
            td.getDefinitions().add(ed);
            tc.setDefinition(td);
        }

        return tc;
    }

    @Override
    public void exitTupleCollectionExpr(TupleCollectionExprContext ctx) {
        SetDefinition sd = factory.createSetDefinition();
        sd.setElementCollection(null);
        sd.setTupleCollection((TupleCollection) getValue(ctx.tc));

        setValue(ctx, sd);
    }

    // =========================================================
    // ELEMENT COLLECTION
    // =========================================================

    @Override
    public void exitElementListExpr(ElementListExprContext ctx) {
        ElementCollection col = factory.createElementCollection();

        col.eUnset(SetTheoryModelPackage.Literals.ELEMENT_COLLECTION__IS_EMPTY);
        col.setIsEmpty(false);

        Element first = (Element) getValue(ctx.e1);
        if (first == null) {
            throw new IllegalStateException("ElementCollection first element is null: " + ctx.e1.getText());
        }
        col.getElements().add(first);

        for (ElementContext ectx : ctx.e2) {
            Element e = (Element) getValue(ectx);
            if (e == null) {
                throw new IllegalStateException("ElementCollection element is null: " + ectx.getText());
            }
            col.getElements().add(e);
        }

        setValue(ctx, col);
    }

    @Override
    public void exitEmptySetExpr(EmptySetExprContext ctx) {
        ElementCollection col = factory.createElementCollection();

        col.eUnset(SetTheoryModelPackage.Literals.ELEMENT_COLLECTION__IS_EMPTY);
        col.setIsEmpty(true);

        setValue(ctx, col);
    }

    @Override
    public void exitElementSuchThatExpr(ElementSuchThatExprContext ctx) {
        ElementCollection col = factory.createElementCollection();

        col.eUnset(SetTheoryModelPackage.Literals.ELEMENT_COLLECTION__IS_EMPTY);
        col.setIsEmpty(false);

        Element e = (Element) getValue(ctx.e);
        if (e == null) {
            throw new IllegalStateException("ElementSuchThat element is null: " + ctx.e.getText());
        }
        col.getElements().add(e);
        col.setDefinition((setTheoryModel.ElementDefinition) getValue(ctx.def));

        setValue(ctx, col);
    }

    // =========================================================
    // TUPLE COLLECTION
    // =========================================================

    @Override
    public void exitTupleSuchThatExpr(TupleSuchThatExprContext ctx) {
        TupleCollection tc = factory.createTupleCollection();
        tc.getTuples().add((Tuple) getValue(ctx.t));
        tc.setDefinition((TupleDefinition) getValue(ctx.td));

        setValue(ctx, tc);
    }

    // =========================================================
    // TUPLES
    // =========================================================

    @Override
    public void exitTupleExpr(TupleExprContext ctx) {
        Tuple tup = factory.createTuple();

        tup.eUnset(SetTheoryModelPackage.Literals.TUPLE__IS_EMPTY);
        tup.setIsEmpty(false);

        Element first = (Element) getValue(ctx.e1);
        if (first == null) {
            throw new IllegalStateException("Tuple first element is null: " + ctx.e1.getText());
        }
        tup.getElements().add(first);

        for (ElementContext ectx : ctx.e2) {
            Element e = (Element) getValue(ectx);
            if (e == null) {
                throw new IllegalStateException("Tuple element is null: " + ectx.getText());
            }
            tup.getElements().add(e);
        }

        setValue(ctx, tup);
    }

    @Override
    public void exitEmptyTupleExpr(EmptyTupleExprContext ctx) {
        Tuple tup = factory.createTuple();

        tup.eUnset(SetTheoryModelPackage.Literals.TUPLE__IS_EMPTY);
        tup.setIsEmpty(true);

        setValue(ctx, tup);
    }

    // =========================================================
    // TUPLE DEFINITION
    // =========================================================

    @Override
    public void exitTupleDefinitionExpr(TupleDefinitionExprContext ctx) {
        TupleDefinition td = factory.createTupleDefinition();

        setTheoryModel.ElementDefinition first = (setTheoryModel.ElementDefinition) getValue(ctx.ed1);
        if (first == null) {
            throw new IllegalStateException("TupleDefinition first is null: " + ctx.ed1.getText());
        }
        td.getDefinitions().add(first);

        for (ElementDefinitionContext edCtx : ctx.ed2) {
            setTheoryModel.ElementDefinition ed = (setTheoryModel.ElementDefinition) getValue(edCtx);
            if (ed == null) {
                throw new IllegalStateException("TupleDefinition item is null: " + edCtx.getText());
            }
            td.getDefinitions().add(ed);
        }

        setValue(ctx, td);
    }

    // =========================================================
    // ELEMENT DEFINITIONS
    // =========================================================

    @Override
    public void exitElementDefImplicitSetExpr(ElementDefImplicitSetExprContext ctx) {
        setValue(ctx, getValue(ctx.d1));
    }

    @Override
    public void exitElementDefSetSymbolExpr(ElementDefSetSymbolExprContext ctx) {
        setValue(ctx, getValue(ctx.d2));
    }

    @Override
    public void exitElementDefRangeExpr(ElementDefRangeExprContext ctx) {
        setValue(ctx, getValue(ctx.d3));
    }

    @Override
    public void exitDefWithImplicitSetExpr(DefWithImplicitSetExprContext ctx) {
        ElementDefinition ed = factory.createElementDefinition();

        ed.setElement((Element) getValue(ctx.e));
        ed.setElementCollection(null);
        ed.setRange(null);

        SetImplicitDefinition ts = (SetImplicitDefinition) getValue(ctx.s);
        ed.setTargetSet(ts);

        BelongType b = mapBelongs(ctx.op);
        ed.eUnset(SetTheoryModelPackage.Literals.ELEMENT_DEFINITION__BELONGS);
        ed.setBelongs(b);

        if (ts != null && ts.getDefinition() != null) {
            SetDefinition d = ts.getDefinition();
            if (d.getElementCollection() != null) d.setTupleCollection(null);
            if (d.getTupleCollection() != null) d.setElementCollection(null);
        }

        setValue(ctx, ed);
    }

    @Override
    public void exitDefCollectionWithImplicitSetExpr(DefCollectionWithImplicitSetExprContext ctx) {
        ElementDefinition ed = factory.createElementDefinition();

        ed.setElement(null);
        ed.setElementCollection((ElementCollection) getValue(ctx.ec));
        ed.setRange(null);

        SetImplicitDefinition ts = (SetImplicitDefinition) getValue(ctx.s);
        ed.setTargetSet(ts);

        BelongType b = mapBelongs(ctx.op);
        ed.eUnset(SetTheoryModelPackage.Literals.ELEMENT_DEFINITION__BELONGS);
        ed.setBelongs(b);

        if (ts != null && ts.getDefinition() != null) {
            SetDefinition d = ts.getDefinition();
            if (d.getElementCollection() != null) d.setTupleCollection(null);
            if (d.getTupleCollection() != null) d.setElementCollection(null);
        }

        setValue(ctx, ed);
    }

    @Override
    public void exitDefWithSymbolSetExpr(DefWithSymbolSetExprContext ctx) {
        ElementDefinition ed = factory.createElementDefinition();

        ed.setElement((Element) getValue(ctx.e));
        ed.setElementCollection(null);
        ed.setRange(null);

        SetSymbol sym = (SetSymbol) getValue(ctx.s);

        OperationSet os = factory.createOperationSet();
        os.setSymbol(sym);

        SetOperationTerm term = factory.createSetOperationTerm();
        term.setOperationSet(os);

        SetOperationResult sor = factory.createSetOperationResult();
        sor.getTerms().add(term);

        SetImplicitDefinition sid = factory.createSetImplicitDefinition();
        sid.setOperation(sor);
        sid.setDefinition(null);

        ed.setTargetSet(sid);

        ed.eUnset(SetTheoryModelPackage.Literals.ELEMENT_DEFINITION__BELONGS);
        ed.setBelongs(mapBelongs(ctx.op));

        setValue(ctx, ed);
    }

    @Override
    public void exitDefCollectionWithSymbolSetExpr(DefCollectionWithSymbolSetExprContext ctx) {
        ElementDefinition ed = factory.createElementDefinition();

        ed.setElement(null);
        ed.setElementCollection((ElementCollection) getValue(ctx.ec));
        ed.setRange(null);

        SetSymbol sym = (SetSymbol) getValue(ctx.s);

        OperationSet os = factory.createOperationSet();
        os.setSymbol(sym);

        SetOperationTerm term = factory.createSetOperationTerm();
        term.setOperationSet(os);

        SetOperationResult sor = factory.createSetOperationResult();
        sor.getTerms().add(term);

        SetImplicitDefinition sid = factory.createSetImplicitDefinition();
        sid.setOperation(sor);
        sid.setDefinition(null);

        ed.setTargetSet(sid);

        ed.eUnset(SetTheoryModelPackage.Literals.ELEMENT_DEFINITION__BELONGS);
        ed.setBelongs(mapBelongs(ctx.op));

        setValue(ctx, ed);
    }

    @Override
    public void exitDefWithRangeExpr(DefWithRangeExprContext ctx) {
        ElementDefinition ed = factory.createElementDefinition();

        ed.setElement((Element) getValue(ctx.e));
        ed.setElementCollection(null);

        ed.setTargetSet(null);
        ed.setRange((Range) getValue(ctx.r));

        ed.eUnset(SetTheoryModelPackage.Literals.ELEMENT_DEFINITION__BELONGS);
        ed.setBelongs(mapBelongs(ctx.op));
       
        setValue(ctx, ed);
    }

    @Override
    public void exitDefCollectionWithRangeExpr(DefCollectionWithRangeExprContext ctx) {
        ElementDefinition ed = factory.createElementDefinition();

        ed.setElement(null);
        ed.setElementCollection((ElementCollection) getValue(ctx.ec));

        ed.setTargetSet(null);
        ed.setRange((Range) getValue(ctx.r));

        ed.eUnset(SetTheoryModelPackage.Literals.ELEMENT_DEFINITION__BELONGS);
        ed.setBelongs(mapBelongs(ctx.op));

        setValue(ctx, ed);
    }

    private BelongType mapBelongs(rules.CFG_SET_THEORYParser.BelongsToOperatorContext opCtx) {
        if (opCtx instanceof InOperatorExprContext) return BelongType.IN;
        if (opCtx instanceof NotInOperatorExprContext) return BelongType.NOT_IN;
        return BelongType.IN;
    }

    // =========================================================
    // RANGE
    // =========================================================

    @Override
    public void exitRangeExpr(RangeExprContext ctx) {
        Range r = factory.createRange();

        String firstTok = ctx.getChild(0).getText();
        String lastTok = ctx.getChild(ctx.getChildCount() - 1).getText();

        boolean includeLower = "[".equals(firstTok);
        boolean includeUpper = "]".equals(lastTok);

        r.eUnset(SetTheoryModelPackage.Literals.RANGE__INCLUDE_LOWER);
        r.eUnset(SetTheoryModelPackage.Literals.RANGE__INCLUDE_UPPER);
        r.setIncludeLower(includeLower);
        r.setIncludeUpper(includeUpper);

        double lower = Double.parseDouble(ctx.n1.getText());
        r.setLower(lower);

        if (ctx.n2i != null) {
            r.eUnset(SetTheoryModelPackage.Literals.RANGE__IS_INFINITE);
            r.setIsInfinite(true);
            r.setUpper(Double.POSITIVE_INFINITY);
        } else {
            double upper = Double.parseDouble(ctx.n2n.getText());
            r.eUnset(SetTheoryModelPackage.Literals.RANGE__IS_INFINITE);
            r.setIsInfinite(false);
            r.setUpper(upper);
        }

        setValue(ctx, r);
    }

    // =========================================================
    // SYMBOLS
    // =========================================================

    @Override
    public void exitSetNameSymbolExpr(SetNameSymbolExprContext ctx) {
        SetSymbol symbol = factory.createSetSymbol();
        symbol.setName(ctx.n.getText());
        ((SetSymbol) symbol).setType(SetSymbolType.CUSTOM);
        setValue(ctx, symbol);
    }

    @Override
    public void exitIntegerSetSymbolExpr(IntegerSetSymbolExprContext ctx) {
        SetSymbol symbol = factory.createSetSymbol();
        symbol.setName("ℤ");
        ((SetSymbol) symbol).setType(SetSymbolType.INTEGER);
        setValue(ctx, symbol);
    }

    @Override
    public void exitNaturalSetSymbolExpr(NaturalSetSymbolExprContext ctx) {
        SetSymbol symbol = factory.createSetSymbol();
        symbol.setName("ℕ");
        ((SetSymbol) symbol).setType(SetSymbolType.NATURAL);
        setValue(ctx, symbol);
    }

    @Override
    public void exitRealSetSymbolExpr(RealSetSymbolExprContext ctx) {
        SetSymbol symbol = factory.createSetSymbol();
        symbol.setName("ℝ");
        ((SetSymbol) symbol).setType(SetSymbolType.REAL);
        setValue(ctx, symbol);
    }

    @Override
    public void exitBooleanSetSymbolExpr(BooleanSetSymbolExprContext ctx) {
        SetSymbol symbol = factory.createSetSymbol();
        symbol.setName("𝔹");
        ((SetSymbol) symbol).setType(SetSymbolType.BOOLEAN);
        setValue(ctx, symbol);
    }

    // =========================================================
    // ELEMENTS
    // =========================================================

    @Override
    public void exitElementIdentifier(ElementIdentifierContext ctx) {
        Element e = factory.createElement();
        e.setName(ctx.id.getText());

        e.eUnset(SetTheoryModelPackage.Literals.ELEMENT__TYPE);
        e.setType(ElementType.IDENTIFIER);

        setValue(ctx, e);
    }

    @Override
    public void exitElementTuple(ElementTupleContext ctx) {
        Element e = factory.createElement();
        e.setTuple((Tuple) getValue(ctx.tup));

        e.eUnset(SetTheoryModelPackage.Literals.ELEMENT__TYPE);
        e.setType(ElementType.TUPLE);

        setValue(ctx, e);
    }

    @Override
    public void exitElementModelSignature(ElementModelSignatureContext ctx) {
        String raw = ctx.sig.getText();

        ModelSignature ms = factory.createModelSignature();

        String name = raw;
        int idx = raw.indexOf('(');
        if (idx >= 0) {
            name = raw.substring(0, idx);
        }

        SetSymbol sym = factory.createSetSymbol();
        sym.setName(name);
        ((SetSymbol) sym).setType(SetSymbolType.CUSTOM);
        ms.setModelSymbol(sym);

        if (idx >= 0) {
            int end = raw.lastIndexOf(')');
            if (end > idx) {
                String inside = raw.substring(idx + 1, end);
                String[] parts = inside.split(",");

                for (String p : parts) {
                    p = p.trim();
                    if (p.startsWith("#")) {
                        p = p.substring(1);
                    }
                    if (!p.isEmpty()) {
                        Parameter param = factory.createParameter();
                        param.setName(p);
                        ms.getParameters().add(param);
                    }
                }
            }
        }

        Element e = factory.createElement();

        e.eUnset(SetTheoryModelPackage.Literals.ELEMENT__TYPE);
        e.setType(ElementType.MODEL_SIGNATURE);
        e.setModelSignature(ms);

        setValue(ctx, e);
    }

    @Override
    public void exitElementString(ElementStringContext ctx) {
        String t = ctx.stringSymbol().getText();
        t = unquote(t);

        Element e = factory.createElement();
        e.eUnset(SetTheoryModelPackage.Literals.ELEMENT__TYPE);
        e.setType(ElementType.STRING);
        e.setName(t);

        setValue(ctx, e);
    }

    @Override
    public void exitElementNumber(ElementNumberContext ctx) {
        Element e = factory.createElement();
        e.eUnset(SetTheoryModelPackage.Literals.ELEMENT__TYPE);
        e.setType(ElementType.NUMBER);
        e.setName(ctx.getText());

        setValue(ctx, e);
    }

    @Override
    public void exitElementBoolean(ElementBooleanContext ctx) {
        Element e = factory.createElement();
        e.eUnset(SetTheoryModelPackage.Literals.ELEMENT__TYPE);
        e.setType(ElementType.BOOLEAN);
        e.setName(ctx.getText());

        setValue(ctx, e);
    }

    @Override
    public void exitElementParameter(ElementParameterContext ctx) {
        Element e = factory.createElement();
        e.eUnset(SetTheoryModelPackage.Literals.ELEMENT__TYPE);
        e.setType(ElementType.PARAMETER);

        String raw = ctx.par.getText();
        if (raw != null && raw.startsWith("#")) {
            raw = raw.substring(1);
        }
        e.setName(raw);

        setValue(ctx, e);
    }

    // =========================================================
    // SET OPERATIONS
    // =========================================================

    public static setTheoryModel.ElementDefinition mapElementDefinition(
            rules.CFG_SET_THEORYParser.ElementDefinitionContext ctx) {

        if (ctx == null) {
            return null;
        }

        SetTheoryMapperListener listener = new SetTheoryMapperListener();

        ParseTreeWalker.DEFAULT.walk(listener, ctx);

        Object value = listener.getValue(ctx);

        if (value instanceof setTheoryModel.ElementDefinition) {
            return (setTheoryModel.ElementDefinition) value;
        }

        throw new IllegalStateException(
                "No se pudo mapear ElementDefinition de SetTheory: "
                + ctx.getText()
                + " | value="
                + (value == null ? "null" : value.getClass().getName())
        );
    }
    
    public static setTheoryModel.ElementDefinition mapElementDefinitionFromText(String text) {
        if (text == null || text.trim().isEmpty()) {
            return null;
        }

        CFG_SET_THEORYLexer lexer =
                new CFG_SET_THEORYLexer(CharStreams.fromString(text));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CFG_SET_THEORYParser parser =
                new CFG_SET_THEORYParser(tokens);

        CFG_SET_THEORYParser.ElementDefinitionContext ctx =
                parser.elementDefinition();

        SetTheoryMapperListener listener = new SetTheoryMapperListener();

        ParseTreeWalker.DEFAULT.walk(listener, ctx);

        Object value = listener.getValue(ctx);

        if (value instanceof setTheoryModel.ElementDefinition) {
            return (setTheoryModel.ElementDefinition) value;
        }

        throw new IllegalStateException(
                "No se pudo mapear ElementDefinition de SetTheory: "
                + text
                + " | value="
                + (value == null ? "null" : value.getClass().getName())
        );
    }
   
    @Override
    public void exitSetOperationExpr(SetOperationExprContext ctx) {
        SetOperationResult result = factory.createSetOperationResult();

        result.getTerms().add((SetOperationTerm) getValue(ctx.left));
        for (SetOperationTermContext t : ctx.right) {
            result.getTerms().add((SetOperationTerm) getValue(t));
        }

        for (SetOperatorContext opCtx : ctx.op) {
            SetOperator op = factory.createSetOperator();

            OperatorType type = null;

            if (opCtx instanceof rules.CFG_SET_THEORYParser.UnionOpExprContext) {
                type = OperatorType.UNION;
            } else if (opCtx instanceof rules.CFG_SET_THEORYParser.IntersectionOpExprContext) {
                type = OperatorType.INTERSECTION;
            } else if (opCtx instanceof rules.CFG_SET_THEORYParser.DifferenceOpExprContext) {
                type = OperatorType.DIFFERENCE;
            } else if (opCtx instanceof rules.CFG_SET_THEORYParser.CartesianProductOpExprContext) {
                type = OperatorType.CARTESIAN_PRODUCT;
            }

            if (type == null) {
                throw new IllegalStateException("No pude mapear operador de conjunto: " + opCtx.getText());
            }

            op.eUnset(SetTheoryModelPackage.Literals.SET_OPERATOR__TYPE);
            op.setType(type);

            result.getOperators().add(op);
        }

        setValue(ctx, result);
    }

    @Override
    public void exitOperationSetSymbolExpr(OperationSetSymbolExprContext ctx) {
        OperationSet os = factory.createOperationSet();

        os.eUnset(SetTheoryModelPackage.Literals.OPERATION_SET__DEFINITION);
        os.setDefinition(null);

        os.setSymbol((SetSymbol) getValue(ctx.ss));

        setValue(ctx, os);
    }
    
    @Override
    public void exitOperationSetDefinitionExpr(OperationSetDefinitionExprContext ctx) {
        OperationSet os = factory.createOperationSet();

        os.eUnset(SetTheoryModelPackage.Literals.OPERATION_SET__SYMBOL);
        os.setSymbol(null);

        os.setDefinition((SetDefinition) getValue(ctx.sd));

        setValue(ctx, os);
    }
    
    @Override
    public void exitOperationSetExpr(OperationSetExprContext ctx) {
        SetOperationTerm term = factory.createSetOperationTerm();

        term.eUnset(SetTheoryModelPackage.Literals.SET_OPERATION_TERM__EXPRESSION);
        term.setExpression(null);

        term.setOperationSet((OperationSet) getValue(ctx.s1));

        setValue(ctx, term);
    }

    @Override
    public void exitSetOperationParExpr(SetOperationParExprContext ctx) {
        SetOperationTerm term = factory.createSetOperationTerm();

        Object value = getValue(ctx.par);

        if (!(value instanceof SetOperationResult)) {
            throw new IllegalStateException(
                "No se pudo mapear operación parentizada: "
                + ctx.getText()
                + " | value="
                + (value == null ? "null" : value.getClass().getName())
            );
        }

        term.setExpression((SetOperationResult) value);

        setValue(ctx, term);
    }
    
    @Override
    public void exitSetOperationParenthesisExpr(SetOperationParenthesisExprContext ctx) {
        Object value = getValue(ctx.expr);

        if (!(value instanceof SetOperationResult)) {
            throw new IllegalStateException(
                "No se pudo mapear contenido de operación parentizada: "
                + ctx.getText()
                + " | value="
                + (value == null ? "null" : value.getClass().getName())
            );
        }

        setValue(ctx, value);
    }

    private static String unquote(String s) {
        if (s == null) return null;
        s = s.trim();

        if (s.length() >= 2 && s.startsWith("\"") && s.endsWith("\"")) {
            return s.substring(1, s.length() - 1);
        }

        return s;
    }
}