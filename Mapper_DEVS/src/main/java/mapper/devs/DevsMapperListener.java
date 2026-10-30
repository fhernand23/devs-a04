package mapper.devs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import devsModel.AtomicModel;
import devsModel.BooleanValue;
import devsModel.CoupledModel;
import devsModel.DevsModel;
import devsModel.DevsModelFactory;
import devsModel.DevsSpecification;
import devsModel.ExpressionValue;
import devsModel.ExternalTransitionFunction;
import devsModel.FunctionBody;
import devsModel.FunctionCase;
import devsModel.FunctionResult;
import devsModel.FunctionSentence;
import devsModel.IdentifierResult;
import devsModel.InternalTransitionFunction;
import devsModel.MathValue;
import devsModel.ModelDefinition;
import devsModel.ModelSentence;
import devsModel.OutputFunction;
import devsModel.SelectFunction;
import devsModel.SetSentence;
import devsModel.SetValue;
import devsModel.SingleValueResult;
import devsModel.TimeAdvanceFunction;
import devsModel.TupleResult;

import mapper.devs.helpers.BooleanExpressionMapperHelper;
import mapper.devs.helpers.MathExpressionMapperHelper;
import mapper.devs.helpers.SetTheoryMapperHelper;

import booleanExpressionModel.BinaryCondition;
import booleanExpressionModel.BinaryOperator;
import booleanExpressionModel.BooleanExpression;
import booleanExpressionModel.BooleanExpressionModelFactory;
import booleanExpressionModel.Constant;
import booleanExpressionModel.Expression;
import booleanExpressionModel.ParenthesisExpression;
import booleanExpressionModel.RelationalCondition;
import booleanExpressionModel.RelationalOperator;
import booleanExpressionModel.SetTheoryCondition;
import booleanExpressionModel.UnaryCondition;
import booleanExpressionModel.UnaryOperator;

import mathExpressionModel.InfinityLiteral;
import mathExpressionModel.MathExpression;
import mathExpressionModel.MathExpressionModelFactory;

import setTheoryModel.ElementCollection;
import setTheoryModel.ElementDefinition;
import setTheoryModel.ModelSignature;
import setTheoryModel.OperationSet;
import setTheoryModel.Parameter;
import setTheoryModel.SetDefinition;
import setTheoryModel.SetExplicitDefinition;
import setTheoryModel.SetExpression;
import setTheoryModel.SetImplicitDefinition;
import setTheoryModel.SetOperationResult;
import setTheoryModel.SetOperationTerm;
import setTheoryModel.SetSymbol;
import setTheoryModel.SetSymbolType;
import setTheoryModel.SetTheoryModelFactory;
import setTheoryModel.TupleCollection;
import setTheoryModel.TupleDefinition;

import rules.CFG_DEVS_MODELBaseListener;
import rules.CFG_DEVS_MODELParser;

public class DevsMapperListener extends CFG_DEVS_MODELBaseListener {

    private DevsSpecification root;

    private final DevsModelFactory factory = DevsModelFactory.eINSTANCE;
    private final SetTheoryModelFactory setFactory = SetTheoryModelFactory.eINSTANCE;
    private String currentInputPortFormalName;
    private String currentInputValueFormalName;
    /**
     * Stack auxiliar para saber en qué nodo/modelo estamos durante el recorrido.
     */
    private final Stack<Object> stack = new Stack<Object>();

    /**
     * Tokens del parser DEVS. Se conservan por si algún helper los necesita.
     */
    private final CommonTokenStream tokensDevs;

    /**
     * Referencias al modelo actual para asociar funciones/sentencias sin buscar siempre en el stack.
     */
    private AtomicModel currentAtomic = null;
    private CoupledModel currentCoupled = null;

    public DevsMapperListener(CommonTokenStream tokensDevs) {
        this.tokensDevs = tokensDevs;
        if (this.tokensDevs != null) {
            this.tokensDevs.fill();
        }
    }

    public DevsSpecification getRoot() {
        return root;
    }

    // =========================================================
    // Entrada / salida del documento raíz
    // =========================================================

    @Override
    public void enterDevsSpecification(CFG_DEVS_MODELParser.DevsSpecificationContext ctx) {
        root = factory.createDevsSpecification();
        stack.push(root);
    }

    // =========================================================
    // Atomic model
    // =========================================================

    @Override
    public void enterAtomicModel(CFG_DEVS_MODELParser.AtomicModelContext ctx) {
        AtomicModel model = factory.createAtomicModel();
        currentAtomic = model;
        currentInputPortFormalName = null;
        currentInputValueFormalName = null;
        ModelSignature sig = buildSignature(ctx.sig);
        model.setSignature(sig);
        model.setName(ctx.sig.modelSymbol().getText());

        model.setInputSet(SetTheoryMapperHelper.map(ctx.modelTuple.input));
        model.setOutputSet(SetTheoryMapperHelper.map(ctx.modelTuple.output));
        model.setStateSet(SetTheoryMapperHelper.map(ctx.modelTuple.state));

        ModelDefinition def = factory.createModelDefinition();
        model.setDefinition(def);

        stack.push(model);
    }

    @Override
    public void exitAtomicModel(CFG_DEVS_MODELParser.AtomicModelContext ctx) {
        AtomicModel model = (AtomicModel) stack.pop();

        // Si alguna función quedó solo como sentencia, la volvemos a enlazar al modelo.
        ensureAtomicRequiredFunctions(model);

        /*
         * Resuelve conjuntos simbólicos cuyo contenido no está declarado
         * explícitamente en el texto, pero cuyos valores aparecen de forma
         * consistente en el comportamiento.
         *
         * Ejemplo WORKER:
         *   phase in PHASES
         *   level in LELEVLS
         *   action in ACTIONS
         *
         * A partir de las condiciones:
         *   p = phase_in AND v = Present/Absent
         *   p = level_in AND v = Dark/Light
         *   action = Gone/Reading/Typing/... o action in {...}
         *
         * se agregan SetSentence derivadas al modelo intermedio.
         *
         * Importante: NO modifica el texto de entrada ni el metamodelo
         * computacional. La inferencia queda materializada en devsModel
         * antes de ejecutar ATL.
         */
        resolveSymbolicSetDefinitions(model);

        DevsSpecification spec = (DevsSpecification) stack.peek();
        spec.getModels().add(model);

        currentAtomic = null;
    }

    // =========================================================
    // Coupled model
    // =========================================================

    @Override
    public void enterCoupledModel(CFG_DEVS_MODELParser.CoupledModelContext ctx) {
        CoupledModel model = factory.createCoupledModel();
        currentCoupled = model;

        ModelSignature sig = buildSignature(ctx.sig);
        model.setSignature(sig);
        model.setName(ctx.sig.modelSymbol().getText());

        model.setInputSet(SetTheoryMapperHelper.map(ctx.modelTuple.input));
        model.setOutputSet(SetTheoryMapperHelper.map(ctx.modelTuple.output));
        model.setStateSet(SetTheoryMapperHelper.map(ctx.modelTuple.state));
        model.setComponents(SetTheoryMapperHelper.map(ctx.modelTuple.components));
        model.setEic(SetTheoryMapperHelper.map(ctx.modelTuple.eic));
        model.setEoc(SetTheoryMapperHelper.map(ctx.modelTuple.eoc));
        model.setIc(SetTheoryMapperHelper.map(ctx.modelTuple.ic));

        model.setSelectName(ctx.modelTuple.selectName.getText());

        ModelDefinition def = factory.createModelDefinition();
        model.setDefinition(def);

        stack.push(model);
    }

    @Override
    public void exitCoupledModel(CFG_DEVS_MODELParser.CoupledModelContext ctx) {
        CoupledModel model = (CoupledModel) stack.pop();

        DevsSpecification spec = (DevsSpecification) stack.peek();
        spec.getModels().add(model);

        currentCoupled = null;
    }

    // =========================================================
    // Sentencias de definición de conjuntos
    // =========================================================

    @Override
    public void exitModelSentence(CFG_DEVS_MODELParser.ModelSentenceContext ctx) {
        if (ctx == null) return;
        if (ctx.setExplicitDefinition() == null && ctx.function() == null) return;
        if (ctx.getChildCount() == 0) return;

        String raw = ctx.getText();
        if (raw == null || raw.trim().isEmpty()) return;

        // Acá solo tratamos set definitions explícitas.
        if (ctx.setExplicitDefinition() == null) return;

        CFG_DEVS_MODELParser.SetExplicitDefinitionContext sctx = ctx.setExplicitDefinition();
        if (sctx.getChildCount() < 3) return;

        ParseTree lhsTree = sctx.getChild(0);
        String symbolName = lhsTree.getText();

        int eqIndex = -1;
        for (int i = 0; i < sctx.getChildCount(); i++) {
            if ("=".equals(sctx.getChild(i).getText())) {
                eqIndex = i;
                break;
            }
        }

        if (eqIndex < 0 || eqIndex + 1 >= sctx.getChildCount()) return;

        ParseTree rhsTree = sctx.getChild(eqIndex + 1);

        SetSentence ss = factory.createSetSentence();

        setTheoryModel.SetExplicitDefinition sed = setFactory.createSetExplicitDefinition();

        setTheoryModel.SetSymbol sym = setFactory.createSetSymbol();
        sym.setName(symbolName);
        sym.setType(SetSymbolType.CUSTOM);
        sed.setSymbol(sym);

        SetExpression rhs = SetTheoryMapperHelper.map(rhsTree);
        if (!(rhs instanceof setTheoryModel.SetImplicitDefinition)) {
            throw new RuntimeException(
                    "RHS no es SetImplicitDefinition para: " + sctx.getText()
                    + " | RHS=" + (rhs == null ? "null" : rhs.getClass().getName())
            );
        }

        sed.setDefinition((setTheoryModel.SetImplicitDefinition) rhs);
        ss.setSetDef(sed);

        DevsModel current = findDevsModel();
        current.getDefinition().getSentences().add(ss);
    }

    // =========================================================
    // Funciones de modelos atómicos
    // =========================================================

    @Override
    public void exitDelExtFunction(CFG_DEVS_MODELParser.DelExtFunctionContext ctx) {
       
    	java.util.List<String> inputNames =
    	        getTupleElementTexts(ctx.name.inputTuple);

    	if (inputNames.size() >= 2) {
    	    currentInputPortFormalName = inputNames.get(0);
    	    currentInputValueFormalName = inputNames.get(1);
    	}
    	
    	ExternalTransitionFunction f = factory.createExternalTransitionFunction();
        f.setBody(buildFunctionBody(ctx.body));

        AtomicModel am = currentAtomic != null ? currentAtomic : findAtomicModel();
        am.setDeltaExt(f);

        addFunctionSentence(f);
    }

    @Override
    public void exitDelIntFunction(CFG_DEVS_MODELParser.DelIntFunctionContext ctx) {
        InternalTransitionFunction f = factory.createInternalTransitionFunction();

        Expression derivedCondition =
                deriveConditionFromStateTuple(ctx.name.stateTuple);

        f.setBody(buildFunctionBody(ctx.body, derivedCondition));

        AtomicModel am = currentAtomic != null ? currentAtomic : findAtomicModel();
        am.setDeltaInt(f);

        addFunctionSentence(f);
    }

    @Override
    public void exitLambdaFunction(CFG_DEVS_MODELParser.LambdaFunctionContext ctx) {
        OutputFunction f = factory.createOutputFunction();

        Expression derivedCondition =
                deriveConditionFromStateTuple(ctx.name.stateTuple);

        f.setBody(buildFunctionBody(ctx.body, derivedCondition));

        AtomicModel am = currentAtomic != null ? currentAtomic : findAtomicModel();
        am.setLambda(f);

        addFunctionSentence(f);
    }
    @Override
    public void exitTaFunction(CFG_DEVS_MODELParser.TaFunctionContext ctx) {
        TimeAdvanceFunction f = factory.createTimeAdvanceFunction();
        f.setBody(buildFunctionBodyFromTa(ctx.body));

        AtomicModel am = currentAtomic != null ? currentAtomic : findAtomicModel();
        am.setTa(f);

        addFunctionSentence(f);
    }

    // =========================================================
    // Función select de modelos acoplados
    // =========================================================

    @Override
    public void exitSelectFunction(CFG_DEVS_MODELParser.SelectFunctionContext ctx) {
        SelectFunction f = factory.createSelectFunction();

        String dom = ctx.name.setSym.getText();
        f.setDomainSymbol(dom);

        FunctionBody body = factory.createFunctionBody();
        CFG_DEVS_MODELParser.SelectFunctionDescriptionContext b = ctx.body;

        if (b.identifier() != null) {
            FunctionCase fc = factory.createFunctionCase();
            fc.setCondition(createTrueCondition());

            IdentifierResult r = factory.createIdentifierResult();
            r.setIdentifier(b.identifier().getText());

            fc.setResult(r);
            body.getCases().add(fc);

            f.setBody(body);

        } else if (b.selectFunctionDescriptionPreIf() != null) {

            for (CFG_DEVS_MODELParser.SelectFunctionPreIfResultContext rctx
                    : b.selectFunctionDescriptionPreIf().selectFunctionPreIfResult()) {

                FunctionCase fc = factory.createFunctionCase();
                IdentifierResult r = factory.createIdentifierResult();

                if (rctx instanceof CFG_DEVS_MODELParser.SelectFunctionPreIfConditionalResultContext) {
                    CFG_DEVS_MODELParser.SelectFunctionPreIfConditionalResultContext c =
                            (CFG_DEVS_MODELParser.SelectFunctionPreIfConditionalResultContext) rctx;

                    mapBooleanCondition(fc, c.cond);
                    r.setIdentifier(c.identifier().getText());

                } else if (rctx instanceof CFG_DEVS_MODELParser.SelectFunctionPreIfDefaultResultContext) {
                    CFG_DEVS_MODELParser.SelectFunctionPreIfDefaultResultContext d =
                            (CFG_DEVS_MODELParser.SelectFunctionPreIfDefaultResultContext) rctx;

                    markOtherwise(fc);
                    r.setIdentifier(d.identifier().getText());

                } else {
                    fc.setCondition(createTrueCondition());
                    r.setIdentifier("UNKNOWN");
                }

                fc.setResult(r);
                body.getCases().add(fc);
            }

            ensureAtLeastOneCaseForSelect(body);
            sanitizeBodyConditions(body);
            f.setBody(body);

        } else if (b.selectFunctionDescriptionPostIf() != null) {

            for (CFG_DEVS_MODELParser.SelectFunctionPostIfResultContext rctx
                    : b.selectFunctionDescriptionPostIf().selectFunctionPostIfResult()) {

                FunctionCase fc = factory.createFunctionCase();
                mapBooleanCondition(fc, rctx.cond);

                IdentifierResult r = factory.createIdentifierResult();
                r.setIdentifier(rctx.identifier().getText());

                fc.setResult(r);
                body.getCases().add(fc);
            }

            ensureAtLeastOneCaseForSelect(body);
            sanitizeBodyConditions(body);
            f.setBody(body);

        } else if (b.selectFunctionGenericDescription() != null) {

            mapSelectGenericDescription(body, b.selectFunctionGenericDescription());

            ensureAtLeastOneCaseForSelect(body);
            sanitizeBodyConditions(body);
            f.setBody(body);

        } else {
            FunctionCase fc = factory.createFunctionCase();
            fc.setCondition(createTrueCondition());

            IdentifierResult r = factory.createIdentifierResult();
            r.setIdentifier("UNKNOWN");

            fc.setResult(r);
            body.getCases().add(fc);

            f.setBody(body);
        }

        CoupledModel cm = currentCoupled != null ? currentCoupled : findCoupledModel();
        cm.setSelect(f);

        addFunctionSentence(f);
    }
    
    private void mapSelectGenericDescription(
            FunctionBody body,
            CFG_DEVS_MODELParser.SelectFunctionGenericDescriptionContext gctx) {

        if (body == null || gctx == null) return;

        /*
         * Variante pre-if:
         *
         * selectVar,
         *   \if cond \then selectVar \assign modelA,
         *   \inOtherCase selectVar \assign modelB
         */
        if (gctx.selectAssignPreIfList() != null) {
            for (CFG_DEVS_MODELParser.SelectAssignPreIfResultContext rctx
                    : gctx.selectAssignPreIfList().selectAssignPreIfResult()) {

                FunctionCase fc = factory.createFunctionCase();
                IdentifierResult r = factory.createIdentifierResult();

                if (rctx instanceof CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierConditionalResultContext) {
                    CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierConditionalResultContext c =
                            (CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierConditionalResultContext) rctx;

                    mapBooleanCondition(fc, c.cond);
                    r.setIdentifier(c.assignIdentifier().identifier().getText());

                } else if (rctx instanceof CFG_DEVS_MODELParser.SelectAssignPreIfParameterConditionalResultContext) {
                    CFG_DEVS_MODELParser.SelectAssignPreIfParameterConditionalResultContext c =
                            (CFG_DEVS_MODELParser.SelectAssignPreIfParameterConditionalResultContext) rctx;

                    mapBooleanCondition(fc, c.cond);

                    String raw = c.assignParameter().parameter().getText();
                    if (raw != null && raw.startsWith("#")) {
                        raw = raw.substring(1);
                    }

                    r.setIdentifier(raw);

                } else if (rctx instanceof CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierDefaultResultContext) {
                    CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierDefaultResultContext d =
                            (CFG_DEVS_MODELParser.SelectAssignPreIfIdentifierDefaultResultContext) rctx;

                    markOtherwise(fc);
                    r.setIdentifier(d.assignIdentifier().identifier().getText());

                } else if (rctx instanceof CFG_DEVS_MODELParser.SelectAssignPreIfParameterDefaultResultContext) {
                    CFG_DEVS_MODELParser.SelectAssignPreIfParameterDefaultResultContext d =
                            (CFG_DEVS_MODELParser.SelectAssignPreIfParameterDefaultResultContext) rctx;

                    markOtherwise(fc);

                    String raw = d.assignParameter().parameter().getText();
                    if (raw != null && raw.startsWith("#")) {
                        raw = raw.substring(1);
                    }

                    r.setIdentifier(raw);

                } else {
                    fc.setCondition(createTrueCondition());
                    r.setIdentifier("UNKNOWN");
                }

                fc.setResult(r);
                body.getCases().add(fc);
            }
        }

        /*
         * Variante post-if:
         *
         * selectVar,
         *   selectVar \assign modelA \if cond,
         *   selectVar \assign modelB \inOtherCase
         *
         * Esta regla no cambió con labels, por eso se puede seguir usando directo.
         */
        if (gctx.selectAssignPostIfList() != null) {
            for (CFG_DEVS_MODELParser.SelectAssignPostIfResultContext rctx
                    : gctx.selectAssignPostIfList().selectAssignPostIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                if (rctx.cond != null) {
                    mapBooleanCondition(fc, rctx.cond);
                } else {
                    markOtherwise(fc);
                }

                IdentifierResult r = factory.createIdentifierResult();

                if (rctx.assignIdentifier() != null) {
                    r.setIdentifier(rctx.assignIdentifier().identifier().getText());

                } else if (rctx.assignParameter() != null) {
                    String raw = rctx.assignParameter().parameter().getText();

                    if (raw != null && raw.startsWith("#")) {
                        raw = raw.substring(1);
                    }

                    r.setIdentifier(raw);

                } else {
                    r.setIdentifier("UNKNOWN");
                }

                fc.setResult(r);
                body.getCases().add(fc);
            }
        }
    }
    
    // =========================================================
    // Construcción de firma del modelo
    // =========================================================

    private ModelSignature buildSignature(CFG_DEVS_MODELParser.ModelSignatureContext ctx) {
        ModelSignature sig = setFactory.createModelSignature();

        SetSymbol symbol = setFactory.createSetSymbol();
        symbol.setName(ctx.modelSymbol().getText());
        symbol.setType(SetSymbolType.CUSTOM);
        sig.setModelSymbol(symbol);

        if (ctx.parametersList() != null) {
            for (CFG_DEVS_MODELParser.ParameterContext p : ctx.parametersList().parameter()) {
                Parameter param = setFactory.createParameter();

                String raw = p.getText();
                if (raw != null && raw.startsWith("#")) {
                    raw = raw.substring(1);
                }

                param.setName(raw);
                sig.getParameters().add(param);
            }
        }

        return sig;
    }

    // =========================================================
    // Construcción de cuerpos de funciones
    // =========================================================

    private FunctionBody buildFunctionBody(CFG_DEVS_MODELParser.FunctionDescriptionContext ctx) {
        return buildFunctionBody(ctx, null);
    }
    
    private FunctionBody buildFunctionBody(
            CFG_DEVS_MODELParser.FunctionDescriptionContext ctx,
            Expression inheritedCondition) {

        FunctionBody body = factory.createFunctionBody();

        if (ctx == null) {
            ensureAtLeastOneCase(body);
            sanitizeBodyConditions(body);
            return body;
        }

        /*
         * Caso directo:
         *
         * \delInt((signal, \false)) = (signal, \true);
         *
         * Si inheritedCondition no es null, usamos esa condición.
         * Si no, queda true == true.
         */
        if (ctx.tupleValue() != null) {
            FunctionCase fc = factory.createFunctionCase();
            fc.setResult(buildTupleResult(ctx.tupleValue()));

            fc.setCondition(
                    inheritedCondition != null
                            ? inheritedCondition
                            : createTrueCondition()
            );

            body.getCases().add(fc);

            sanitizeBodyConditions(body);
            return body;
        }

        if (ctx.functionDescriptionPreIf() != null) {
            for (CFG_DEVS_MODELParser.FunctionPreIfResultContext r
                    : ctx.functionDescriptionPreIf().functionPreIfResult()) {

                FunctionCase fc = buildFunctionCaseFromPreIfResult(r, inheritedCondition);
                body.getCases().add(fc);
            }
        }
        
        if (ctx.functionDescriptionPostIf() != null) {
            for (CFG_DEVS_MODELParser.FunctionPostIfResultContext r
                    : ctx.functionDescriptionPostIf().functionPostIfResult()) {

                FunctionCase fc = factory.createFunctionCase();
                mapBooleanCondition(fc, r.cond);
                combineInheritedCondition(fc, inheritedCondition);

                fc.setResult(buildTupleResult(r.result));
                body.getCases().add(fc);
            }
        }
        
        if (ctx.functionGenericDescription() != null) {
            mapGenericTupleDescription(body, ctx.functionGenericDescription());

            ensureAtLeastOneCase(body);
            sanitizeBodyConditions(body);
            return body;
        }

        if (ctx.functionGenericValuesDescription() != null) {
            mapGenericValuesDescription(body, ctx.functionGenericValuesDescription());

            if (inheritedCondition != null) {
                for (FunctionCase fc : body.getCases()) {
                    combineInheritedCondition(fc, inheritedCondition);
                }
            }

            ensureAtLeastOneCase(body);
            sanitizeBodyConditions(body);
            return body;
        }

        ensureAtLeastOneCase(body);

        if (inheritedCondition != null) {
            for (FunctionCase fc : body.getCases()) {
                combineInheritedCondition(fc, inheritedCondition);
            }
        }

        sanitizeBodyConditions(body);
        return body;
    }
    
    private FunctionCase buildFunctionCaseFromPreIfResult(
            CFG_DEVS_MODELParser.FunctionPreIfResultContext r,
            Expression inheritedCondition) {

        FunctionCase fc = factory.createFunctionCase();

        if (r instanceof CFG_DEVS_MODELParser.FunctionPreIfConditionalResultContext) {
            CFG_DEVS_MODELParser.FunctionPreIfConditionalResultContext c =
                    (CFG_DEVS_MODELParser.FunctionPreIfConditionalResultContext) r;

            mapBooleanCondition(fc, c.cond);
            combineInheritedCondition(fc, inheritedCondition);

            fc.setResult(buildTupleResult(c.result));
            return fc;
        }

        if (r instanceof CFG_DEVS_MODELParser.FunctionPreIfDefaultResultContext) {
            CFG_DEVS_MODELParser.FunctionPreIfDefaultResultContext d =
                    (CFG_DEVS_MODELParser.FunctionPreIfDefaultResultContext) r;

            markOtherwise(fc);
            combineInheritedCondition(fc, inheritedCondition);

            fc.setResult(buildTupleResult(d.result));
            return fc;
        }

        fc.setCondition(createTrueCondition());
        fc.setResult(factory.createTupleResult());
        return fc;
    }
    
    private void mapGenericTupleDescription(
            FunctionBody body,
            CFG_DEVS_MODELParser.FunctionGenericDescriptionContext gctx) {

        if (body == null || gctx == null) return;

        String target = gctx.vars != null ? gctx.vars.getText() : null;

        /*
         * Variante pre-if:
         *
         * (action',delta_t_r',sent'),
         *   \if cond \then (action',delta_t_r',sent') \assign (...),
         *   \inOtherCase  (action',delta_t_r',sent') \assign (...)
         */
        if (gctx.functionDescriptionAssignmentPreIf() != null) {

            CFG_DEVS_MODELParser.FunctionDescriptionAssignmentPreIfContext pre =
                    gctx.functionDescriptionAssignmentPreIf();

            for (CFG_DEVS_MODELParser.FunctionAssignPreIfResultContext rctx
                    : pre.functionAssignPreIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                if (target != null) {
                    fc.setAssignedTarget(target);
                }

                CFG_DEVS_MODELParser.AssignTupleContext assignTuple = null;

                if (rctx instanceof CFG_DEVS_MODELParser.FunctionAssignPreIfConditionalResultContext) {
                    CFG_DEVS_MODELParser.FunctionAssignPreIfConditionalResultContext c =
                            (CFG_DEVS_MODELParser.FunctionAssignPreIfConditionalResultContext) rctx;

                    mapBooleanCondition(fc, c.cond);
                    assignTuple = c.assignTuple();

                } else if (rctx instanceof CFG_DEVS_MODELParser.FunctionAssignPreIfDefaultResultContext) {
                    CFG_DEVS_MODELParser.FunctionAssignPreIfDefaultResultContext d =
                            (CFG_DEVS_MODELParser.FunctionAssignPreIfDefaultResultContext) rctx;

                    markOtherwise(fc);
                    assignTuple = d.assignTuple();
                }

                if (assignTuple != null) {
                    FunctionResult tr = buildTupleResult(assignTuple.tupleValue());
                    fc.setResult(tr);
                    body.getCases().add(fc);
                }
            }
        }

        /*
         * Variante post-if:
         *
         * (action',delta_t_r',sent'),
         *   (action',delta_t_r',sent') \assign (...) \if cond,
         *   (action',delta_t_r',sent') \assign (...) \inOtherCase
         */
        if (gctx.functionDescriptionAssignmentPostIf() != null) {

            CFG_DEVS_MODELParser.FunctionDescriptionAssignmentPostIfContext post =
                    gctx.functionDescriptionAssignmentPostIf();

            for (CFG_DEVS_MODELParser.FunctionAssignPostIfResultContext rctx
                    : post.functionAssignPostIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                if (target != null) {
                    fc.setAssignedTarget(target);
                }

                if (rctx.cond != null) {
                    mapBooleanCondition(fc, rctx.cond);
                } else {
                    markOtherwise(fc);
                }

                FunctionResult  tr = buildTupleResult(rctx.assignTuple().tupleValue());
                fc.setResult(tr);

                body.getCases().add(fc);
            }
        }
    }
    
    private void combineInheritedCondition(FunctionCase fc, Expression inheritedCondition) {
        if (fc == null || inheritedCondition == null) return;
        if (fc.isOtherwise()) return;

        Expression current = fc.getCondition();

        if (current == null) {
            fc.setCondition(inheritedCondition);
            return;
        }

        /*
         * Si la condición actual es true == true,
         * la reemplazamos directamente por la heredada.
         */
        if (isTrueCondition(current)) {
            fc.setCondition(inheritedCondition);
            return;
        }

        if (current instanceof BooleanExpression && inheritedCondition instanceof BooleanExpression) {
            BinaryCondition bc = BooleanExpressionModelFactory.eINSTANCE.createBinaryCondition();
            bc.setOperator(BinaryOperator.AND);
            bc.setLeft((BooleanExpression) inheritedCondition);
            bc.setRight((BooleanExpression) current);
            fc.setCondition(bc);
        }
    }
    
    private boolean isTrueCondition(Expression expr) {
        if (!(expr instanceof RelationalCondition)) {
            return false;
        }

        RelationalCondition rc = (RelationalCondition) expr;

        if (rc.getLeft() instanceof Constant &&
            rc.getRight() instanceof Constant) {

            Constant l = (Constant) rc.getLeft();
            Constant r = (Constant) rc.getRight();

            return "true".equals(l.getValue()) && "true".equals(r.getValue());
        }

        return false;
    }
   
    private void mapGenericValuesDescription(
            FunctionBody body,
            CFG_DEVS_MODELParser.FunctionGenericValuesDescriptionContext gctx) {

        if (body == null || gctx == null) return;

        List<CFG_DEVS_MODELParser.VariableFixedValuesContext> outVars =
                getVariableFixedValues(gctx.vars);

        CFG_DEVS_MODELParser.FunctionDescriptionValuesAssignmentPreIfContext pre =
                gctx.functionDescriptionValuesAssignmentPreIf();

        CFG_DEVS_MODELParser.FunctionDescriptionValuesAssignmentPostIfContext post =
                gctx.functionDescriptionValuesAssignmentPostIf();

        if (pre != null) {
            for (CFG_DEVS_MODELParser.FunctionValuesAssignPreIfResultContext rctx
                    : pre.functionValuesAssignPreIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                if (gctx.vars != null) {
                    fc.setAssignedTarget(gctx.vars.getText());
                }

                CFG_DEVS_MODELParser.AssignmentsListContext assignments = null;

                if (rctx instanceof CFG_DEVS_MODELParser.FunctionValuesAssignPreIfConditionalResultContext) {
                    CFG_DEVS_MODELParser.FunctionValuesAssignPreIfConditionalResultContext c =
                            (CFG_DEVS_MODELParser.FunctionValuesAssignPreIfConditionalResultContext) rctx;

                    mapBooleanCondition(fc, c.cond);
                    assignments = c.assignmentsList();

                } else if (rctx instanceof CFG_DEVS_MODELParser.FunctionValuesAssignPreIfDefaultResultContext) {
                    CFG_DEVS_MODELParser.FunctionValuesAssignPreIfDefaultResultContext d =
                            (CFG_DEVS_MODELParser.FunctionValuesAssignPreIfDefaultResultContext) rctx;

                    markOtherwise(fc);
                    assignments = d.assignmentsList();
                }

                Map<String, ExpressionValue> assigned =
                        buildAssignmentsMap(assignments);

                TupleResult tr = buildTupleResultFromFixedValues(outVars, assigned);

                fc.setResult(tr);
                body.getCases().add(fc);
            }
        }

        if (post != null) {
            for (CFG_DEVS_MODELParser.FunctionValuesAssignPostIfResultContext rctx
                    : post.functionValuesAssignPostIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                if (gctx.vars != null) {
                    fc.setAssignedTarget(gctx.vars.getText());
                }

                mapBooleanCondition(fc, rctx.cond);

                Map<String, ExpressionValue> assigned =
                        buildAssignmentsMap(rctx.assignmentsList());

                TupleResult tr = buildTupleResultFromFixedValues(outVars, assigned);

                fc.setResult(tr);
                body.getCases().add(fc);
            }
        }
    }
    
    private Map<String, ExpressionValue> buildAssignmentsMap(
            CFG_DEVS_MODELParser.AssignmentsListContext assigns) {

        Map<String, ExpressionValue> assigned =
                new HashMap<String, ExpressionValue>();

        if (assigns == null) {
            return assigned;
        }

        for (CFG_DEVS_MODELParser.AssignElementContext ae : assigns.assignElement()) {

            /*
             * Caso:
             * action' \assign "Reading"
             * delta_t_r' \assign #delta_reading
             * sent' \assign \true
             */
            if (ae.assignValue() != null) {
                CFG_DEVS_MODELParser.AssignValueContext av = ae.assignValue();

                String target = av.variable().getText();
                ExpressionValue value = buildValue(av.value());

                assigned.put(target, value);
                continue;
            }

            /*
             * Caso:
             * action' \assign action
             * delta_t_r' \assign delta_t_r
             */
            if (ae.assignIdentifier() != null) {
                CFG_DEVS_MODELParser.AssignIdentifierContext ai =
                        ae.assignIdentifier();

                String target = ai.variable().getText();
                String source = ai.identifier().getText();

                ExpressionValue value = buildValueFromIdentifier(source);

                assigned.put(target, value);
                continue;
            }

            /*
             * Caso:
             * (action',delta_t_r',sent') \assign (...)
             */
            if (ae.assignTuple() != null) {
                CFG_DEVS_MODELParser.AssignTupleContext at = ae.assignTuple();

                List<String> targets = getVariableNames(at.variableTuple());
                FunctionResult fr = buildTupleResult(at.tupleValue());

                if (fr instanceof TupleResult) {
                    TupleResult tupleResult = (TupleResult) fr;

                    for (int i = 0; i < targets.size()
                            && i < tupleResult.getValues().size(); i++) {

                        assigned.put(targets.get(i), tupleResult.getValues().get(i));
                    }
                } else if (fr instanceof SingleValueResult && targets.size() == 1) {
                    SingleValueResult single = (SingleValueResult) fr;
                    assigned.put(targets.get(0), single.getValue());
                }

                continue;
            }
        }

        return assigned;
    }
    
    private TupleResult buildTupleResultFromFixedValues(
            List<CFG_DEVS_MODELParser.VariableFixedValuesContext> outVars,
            Map<String, ExpressionValue> assigned) {

        TupleResult tr = factory.createTupleResult();

        if (outVars == null) {
            return tr;
        }

        for (CFG_DEVS_MODELParser.VariableFixedValuesContext vfv : outVars) {
            ExpressionValue ev = buildFixedOrAssignedValue(vfv, assigned);

            if (ev == null) {
                throw new RuntimeException(
                        "No pude construir valor para: " + vfv.getText()
                );
            }

            tr.getValues().add(ev);
        }

        return tr;
    }
    
    private List<String> getVariableNames(
            CFG_DEVS_MODELParser.VariableTupleContext ctx) {

        List<String> result = new ArrayList<String>();

        if (ctx == null) {
            return result;
        }

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);

            if (ch instanceof CFG_DEVS_MODELParser.VariableContext) {
                result.add(ch.getText());
            }
        }

        return result;
    }
    
    private List<CFG_DEVS_MODELParser.VariableFixedValuesContext> getVariableFixedValues(
            CFG_DEVS_MODELParser.VariableTupleFixedValuesContext ctx) {

        List<CFG_DEVS_MODELParser.VariableFixedValuesContext> result =
                new ArrayList<CFG_DEVS_MODELParser.VariableFixedValuesContext>();

        if (ctx == null) return result;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);
            if (ch instanceof CFG_DEVS_MODELParser.VariableFixedValuesContext) {
                result.add((CFG_DEVS_MODELParser.VariableFixedValuesContext) ch);
            }
        }

        return result;
    }

    private ExpressionValue buildFixedOrAssignedValue(
            CFG_DEVS_MODELParser.VariableFixedValuesContext vfv,
            Map<String, ExpressionValue> assigned) {

        if (vfv.variable() != null) {
            String name = vfv.variable().getText();
            ExpressionValue ev = assigned.get(name);

            if (ev != null) return ev;
            return buildValueFromIdentifier(name);
        }

        if (vfv.identifier() != null) {
            String name = vfv.identifier().getText();
            ExpressionValue ev = assigned.get(name);

            if (ev != null) return ev;
            return buildValueFromIdentifier(name);
        }

        if (vfv.datatypeSymbol() != null) {
            String t = vfv.datatypeSymbol().getText();

            if ("\\true".equals(t) || "true".equals(t)) {
                BooleanValue bv = factory.createBooleanValue();
                bv.setLiteralValue(true);
                return bv;
            }

            if ("\\false".equals(t) || "false".equals(t)) {
                BooleanValue bv = factory.createBooleanValue();
                bv.setLiteralValue(false);
                return bv;
            }

            if ("\\infinity".equals(t) || "infinity".equals(t)) {
                InfinityLiteral inf =
                        MathExpressionModelFactory.eINSTANCE.createInfinityLiteral();

                MathValue mv = factory.createMathValue();
                mv.setValue(inf);

                return mv;
            }

            if (t.startsWith("\"") && t.endsWith("\"")) {
                SetExpression s = SetTheoryMapperHelper.map(vfv.datatypeSymbol());

                SetValue sv = factory.createSetValue();
                sv.setValue(s);

                return sv;
            }
        }

        throw new RuntimeException(
                "No pude construir fixed/assigned para: " + vfv.getText()
        );
    }
    
    private ExpressionValue buildValueFromIdentifier(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new RuntimeException("Identificador vacío");
        }

        String n = name.trim();

        // Primero intentamos como expresión matemática en los casos típicos.
        if (isMathLikeIdentifier(n)) {
            try {
                MathExpression m = MathExpressionMapperHelper.mapFromText(n);
                if (m != null) {
                    MathValue mv = factory.createMathValue();
                    mv.setValue(m);
                    return mv;
                }
            } catch (Exception e) {
                // fallback
            }
        }

        // Si no, probamos como conjunto.
        try {
            SetExpression s = SetTheoryMapperHelper.mapFromText(n);
            if (s != null) {
                SetValue sv = factory.createSetValue();
                sv.setValue(s);
                return sv;
            }
        } catch (Exception e) {
            // fallback
        }

        // Último intento como math expression.
        try {
            MathExpression m = MathExpressionMapperHelper.mapFromText(n);
            if (m != null) {
                MathValue mv = factory.createMathValue();
                mv.setValue(m);
                return mv;
            }
        } catch (Exception e) {
            // ignore
        }

        throw new RuntimeException("No sé mapear identificador fijo: " + name);
    }

    private boolean isMathLikeIdentifier(String name) {
        if (name == null) return false;

        if (name.startsWith("#")) return true;
        if ("sigma".equals(name)) return true;
        if ("sigma'".equals(name)) return true;
        if ("e".equals(name)) return true;

        return false;
    } 

    private FunctionBody buildFunctionBodyFromTa(CFG_DEVS_MODELParser.TaFunctionDescriptionContext ctx) {
        FunctionBody body = factory.createFunctionBody();

        if (ctx == null) {
            ensureAtLeastOneCase(body);
            sanitizeBodyConditions(body);
            return body;
        }

        /*
         * Caso genérico:
         *
         * \ta((signal,sent)) = delta_int',
         *      \if \not sent \then delta_int' \assign 0,
         *      \if sent      \then delta_int' \assign \infinity;
         *
         * Importante: este caso va antes que ctx.value(),
         * porque la descripción empieza con un valor/variable: delta_int'
         */
        if (ctx.taFunctionGenericDescription() != null) {
            mapTaGenericDescription(body, ctx.taFunctionGenericDescription());

            ensureAtLeastOneCase(body);
            sanitizeBodyConditions(body);
            return body;
        }

        /*
         * Caso directo:
         *
         * \ta((signal,sent)) = 0;
         * \ta((signal,sent)) = \infinity;
         * \ta((signal,sent)) = sigma;
         * \ta((action,deltatint)) = deltatint;
         */
        if (ctx.value() != null) {
            FunctionCase fc = factory.createFunctionCase();

            SingleValueResult r = factory.createSingleValueResult();

            // En ta, el valor siempre se interpreta como expresión temporal/matemática.
            r.setValue(buildTaSingleValueFromText(ctx.value().getText()));

            fc.setResult(r);
            fc.setCondition(createTrueCondition());

            body.getCases().add(fc);

            sanitizeBodyConditions(body);
            return body;
        }

        /*
         * Caso pre-if:
         *
         * \ta((signal,sent)) =
         *      \if \not sent \then 0,
         *      \if sent      \then \infinity;
         */
        if (ctx.taFunctionDescriptionPreIf() != null) {
            for (CFG_DEVS_MODELParser.TaFunctionPreIfResultContext rctx
                    : ctx.taFunctionDescriptionPreIf().taFunctionPreIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                String resultText = null;

                if (rctx instanceof CFG_DEVS_MODELParser.TaFunctionPreIfConditionalResultContext) {
                    CFG_DEVS_MODELParser.TaFunctionPreIfConditionalResultContext c =
                            (CFG_DEVS_MODELParser.TaFunctionPreIfConditionalResultContext) rctx;

                    mapBooleanCondition(fc, c.cond);
                    resultText = c.result.getText();

                } else if (rctx instanceof CFG_DEVS_MODELParser.TaFunctionPreIfDefaultResultContext) {
                    CFG_DEVS_MODELParser.TaFunctionPreIfDefaultResultContext d =
                            (CFG_DEVS_MODELParser.TaFunctionPreIfDefaultResultContext) rctx;

                    markOtherwise(fc);
                    resultText = d.result.getText();
                }

                SingleValueResult r = factory.createSingleValueResult();
                r.setValue(buildTaSingleValueFromText(resultText));

                fc.setResult(r);
                body.getCases().add(fc);
            }

            ensureAtLeastOneCase(body);
            sanitizeBodyConditions(body);
            return body;
        }

        /*
         * Caso post-if:
         *
         * \ta((signal,sent)) =
         *      0         \if \not sent,
         *      \infinity \if sent;
         */
        if (ctx.taFunctionDescriptionPostIf() != null) {
            for (CFG_DEVS_MODELParser.TaFunctionPostIfResultContext rctx
                    : ctx.taFunctionDescriptionPostIf().taFunctionPostIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                mapBooleanCondition(fc, rctx.cond);

                SingleValueResult r = factory.createSingleValueResult();

                // En ta, también los resultados post-if son MathValue.
                r.setValue(buildTaSingleValueFromText(rctx.result.getText()));

                fc.setResult(r);
                body.getCases().add(fc);
            }

            ensureAtLeastOneCase(body);
            sanitizeBodyConditions(body);
            return body;
        }

        ensureAtLeastOneCase(body);
        sanitizeBodyConditions(body);
        return body;
    }
    
    private void mapTaGenericDescription(
            FunctionBody body,
            CFG_DEVS_MODELParser.TaFunctionGenericDescriptionContext gctx) {

        if (gctx == null) return;

        String target = gctx.var != null ? gctx.var.getText() : null;

        /*
         * Variante pre-if:
         *
         * delta_int',
         *   \if \not sent \then delta_int' \assign 0,
         *   \if sent      \then delta_int' \assign \infinity
         */
        if (gctx.taAssignPreIf() != null) {
            for (CFG_DEVS_MODELParser.TaAssignPreIfResultContext rctx
                    : gctx.taAssignPreIf().taAssignPreIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                if (target != null) {
                    fc.setAssignedTarget(target);
                }

                CFG_DEVS_MODELParser.AssignValueContext assignValue = null;

                if (rctx instanceof CFG_DEVS_MODELParser.TaAssignPreIfConditionalResultContext) {
                    CFG_DEVS_MODELParser.TaAssignPreIfConditionalResultContext c =
                            (CFG_DEVS_MODELParser.TaAssignPreIfConditionalResultContext) rctx;

                    mapBooleanCondition(fc, c.cond);
                    assignValue = c.assignValue();

                } else if (rctx instanceof CFG_DEVS_MODELParser.TaAssignPreIfDefaultResultContext) {
                    CFG_DEVS_MODELParser.TaAssignPreIfDefaultResultContext d =
                            (CFG_DEVS_MODELParser.TaAssignPreIfDefaultResultContext) rctx;

                    markOtherwise(fc);
                    assignValue = d.assignValue();
                }

                if (assignValue != null) {
                    SingleValueResult result = factory.createSingleValueResult();

                    result.setValue(
                            buildTaSingleValueFromText(
                                    assignValue.value().getText()
                            )
                    );

                    fc.setResult(result);
                    body.getCases().add(fc);
                }
            }
        }

        /*
         * Variante post-if:
         *
         * delta_int',
         *   delta_int' \assign 0         \if \not sent,
         *   delta_int' \assign \infinity \if sent
         */
        if (gctx.taAssignPostIf() != null) {
            for (CFG_DEVS_MODELParser.TaAssignPostIfResultContext rctx
                    : gctx.taAssignPostIf().taAssignPostIfResult()) {

                FunctionCase fc = factory.createFunctionCase();

                if (target != null) {
                    fc.setAssignedTarget(target);
                }

                mapBooleanCondition(fc, rctx.cond);

                SingleValueResult result = factory.createSingleValueResult();

                // En ta, el valor asignado siempre se interpreta como tiempo / expresión matemática.
                result.setValue(
                        buildTaSingleValueFromText(
                                rctx.assignValue().value().getText()
                        )
                );

                fc.setResult(result);
                body.getCases().add(fc);
            }
        }
    }
    
    private void mapTaAssignmentsByText(FunctionBody body, String rawText) {
        if (rawText == null) return;

        String[] parts = rawText.split(",");

        for (String part : parts) {
            if (part == null) continue;

            String text = part.trim();

            if (!text.contains("\\assign")) {
                continue;
            }

            int assignIdx = text.indexOf("\\assign");
            int ifIdx = text.indexOf("\\if");

            if (assignIdx < 0 || ifIdx < 0 || ifIdx <= assignIdx) {
                continue;
            }

            String targetText = text.substring(0, assignIdx).trim();
            String valueText = text.substring(assignIdx + "\\assign".length(), ifIdx).trim();
            String condText = text.substring(ifIdx + "\\if".length()).trim();

            FunctionCase fc = factory.createFunctionCase();

            // Guarda el lado izquierdo de:
            // delta_int' \assign 0
            fc.setAssignedTarget(targetText);

            Expression cond = BooleanExpressionMapperHelper.mapFromString(condText);
            fc.setCondition(cond != null ? cond : createTrueCondition());

            SingleValueResult result = factory.createSingleValueResult();
            result.setValue(buildTaSingleValueFromText(valueText));

            fc.setResult(result);
            body.getCases().add(fc);
        }
    }
    
    private ExpressionValue buildTaSingleValueFromText(String valueText) {
        if (valueText == null) {
            throw new RuntimeException("Valor null en ta");
        }

        String text = valueText.trim();

        if ("\\infinity".equals(text) || "infinity".equals(text)) {
            InfinityLiteral inf = MathExpressionModelFactory.eINSTANCE.createInfinityLiteral();

            MathValue mv = factory.createMathValue();
            mv.setValue(inf);

            return mv;
        }

        MathExpression m = MathExpressionMapperHelper.mapFromText(text);

        MathValue mv = factory.createMathValue();
        mv.setValue(m);

        return mv;
    }
    

    // =========================================================
    // Construcción de valores
    // =========================================================

    private ExpressionValue buildValue(CFG_DEVS_MODELParser.ValueContext ctx) {
        if (ctx == null) {
            throw new RuntimeException("Null value context");
        }

        if (ctx.booleanExpression() != null) {
            Expression expr = BooleanExpressionMapperHelper
                    .mapFromDevs(ctx.booleanExpression(), this.tokensDevs);

            if (expr == null) {
                expr = createTrueCondition();
            }

            BooleanValue bv = factory.createBooleanValue();
            bv.setExpression(expr);
            return bv;
        }

        if (ctx.mathExpression() != null) {
            MathExpression m = MathExpressionMapperHelper.map(ctx.mathExpression());

            MathValue mv = factory.createMathValue();
            mv.setValue(m);
            return mv;
        }

        if ("\\infinity".equals(ctx.getText())) {
            InfinityLiteral inf = MathExpressionModelFactory.eINSTANCE.createInfinityLiteral();

            MathValue mv = factory.createMathValue();
            mv.setValue(inf);

            return mv;
        }

        if (ctx.element() != null) {
            CFG_DEVS_MODELParser.ElementContext e = ctx.element();
            String raw = e.getText();

            if (e instanceof CFG_DEVS_MODELParser.ElementNumberContext) {
                MathExpression m = MathExpressionMapperHelper.map(e);

                MathValue mv = factory.createMathValue();
                mv.setValue(m);

                return mv;
            }

            if (e instanceof CFG_DEVS_MODELParser.ElementBooleanContext) {
                BooleanValue bv = factory.createBooleanValue();

                Boolean literal = "\\true".equals(raw)
                        ? Boolean.TRUE
                        : Boolean.FALSE;

                bv.setLiteralValue(literal);

                return bv;
            }
            
            if (raw != null && raw.startsWith("#")) {
                try {
                    MathExpression m = MathExpressionMapperHelper.mapFromText(raw);

                    MathValue mv = factory.createMathValue();
                    mv.setValue(m);

                    return mv;
                } catch (Exception ex) {
                    // fallback
                }
            }

            if (isMathLikeIdentifier(raw)) {
                try {
                    MathExpression m = MathExpressionMapperHelper.mapFromText(raw);

                    MathValue mv = factory.createMathValue();
                    mv.setValue(m);

                    return mv;
                } catch (Exception ex) {
                    // fallback
                }
            }

            SetExpression s = SetTheoryMapperHelper.map(e);
            if (s == null) {
                throw new RuntimeException("Set mapping returned null for: " + ctx.getText());
            }

            SetValue sv = factory.createSetValue();
            sv.setValue(s);
            return sv;
        }

        throw new RuntimeException("Unsupported value type in buildValue(): " + ctx.getText());
    }

    // =========================================================
    // Condiciones booleanas
    // =========================================================

    private Expression deriveConditionFromStateTuple(
            CFG_DEVS_MODELParser.TupleContext stateTupleCtx) {

        if (stateTupleCtx == null) {
            return null;
        }

        java.util.List<String> stateVarNames = getCurrentStateVariableNames();

        if (stateVarNames == null || stateVarNames.isEmpty()) {
            return null;
        }

        java.util.List<String> tupleValues = getTupleElementTexts(stateTupleCtx);

        if (tupleValues == null || tupleValues.isEmpty()) {
            return null;
        }

        BooleanExpression accumulated = null;

        int n = Math.min(stateVarNames.size(), tupleValues.size());

        for (int i = 0; i < n; i++) {
            String expectedVar = stateVarNames.get(i);
            String actual = tupleValues.get(i);

            if (!shouldDeriveTupleRestriction(actual)) {
                continue;
            }
            
            if (expectedVar == null || actual == null) continue;

            expectedVar = expectedVar.trim();
            actual = actual.trim();

            if (expectedVar.isEmpty() || actual.isEmpty()) continue;

            /*
             * Si el elemento de la firma coincide con la variable del estado,
             * no genera restricción.
             *
             * Ejemplo:
             *   state:  (signal, sent)
             *   firma: (signal, \false)
             *
             * signal no genera condición.
             * \false genera sent == false.
             */
            if (expectedVar.equals(actual)) {
                continue;
            }

            RelationalCondition rc = createEqualityCondition(expectedVar, actual);

            if (accumulated == null) {
                accumulated = rc;
            } else {
                BinaryCondition bc = BooleanExpressionModelFactory.eINSTANCE.createBinaryCondition();
                bc.setOperator(BinaryOperator.AND);
                bc.setLeft(accumulated);
                bc.setRight(rc);
                accumulated = bc;
            }
        }

        return accumulated;
    }
    
    private java.util.List<String> getTupleElementTexts(CFG_DEVS_MODELParser.TupleContext tupleCtx) {
        java.util.List<String> result = new java.util.ArrayList<String>();

        if (tupleCtx == null) return result;

        for (int i = 0; i < tupleCtx.getChildCount(); i++) {
            ParseTree ch = tupleCtx.getChild(i);

            if (ch instanceof CFG_DEVS_MODELParser.ElementContext) {
                result.add(ch.getText());
            }
        }

        return result;
    }
    
    private java.util.List<String> getCurrentStateVariableNames() {
        java.util.List<String> result = new java.util.ArrayList<String>();

        DevsModel current = null;

        if (currentAtomic != null) {
            current = currentAtomic;
        } else if (currentCoupled != null) {
            current = currentCoupled;
        } else {
            try {
                current = findDevsModel();
            } catch (Exception e) {
                return result;
            }
        }

        if (!(current instanceof AtomicModel)) {
            return result;
        }

        AtomicModel am = (AtomicModel) current;

        if (am.getDefinition() == null) {
            return result;
        }

        /*
         * Busca la sentencia S = ...
         * y trata de extraer nombres desde la definición.
         */
        for (ModelSentence ms : am.getDefinition().getSentences()) {
            if (!(ms instanceof SetSentence)) continue;

            SetSentence ss = (SetSentence) ms;

            if (ss.getSetDef() == null ||
                ss.getSetDef().getSymbol() == null ||
                ss.getSetDef().getSymbol().getName() == null) {
                continue;
            }

            String stateSetName = getReferencedSetName(am.getStateSet());

            if (stateSetName == null || stateSetName.trim().isEmpty()) {
                return result;
            }

            String name = ss.getSetDef().getSymbol().getName();

            if (!stateSetName.equals(name)) {
                continue;
            }

            collectStateNamesFromSetDefinition(ss.getSetDef().getDefinition(), result);
            break;
        }

        return result;
    }
    
    private String getReferencedSetName(SetExpression expression) {

        if (expression == null) {
            return null;
        }

        if (expression instanceof SetSymbol) {
            SetSymbol symbol = (SetSymbol) expression;
            return symbol.getName();
        }

        if (expression instanceof SetImplicitDefinition) {

            SetImplicitDefinition sid =
                    (SetImplicitDefinition) expression;

            if (sid.getOperation() != null) {

                for (SetOperationTerm term :
                        sid.getOperation().getTerms()) {

                    if (term == null ||
                        term.getOperationSet() == null ||
                        term.getOperationSet().getSymbol() == null) {
                        continue;
                    }

                    String name =
                            term.getOperationSet()
                                .getSymbol()
                                .getName();

                    if (name != null &&
                        !name.trim().isEmpty()) {

                        return name.trim();
                    }
                }
            }
        }

        return null;
    }
    
    private void collectStateNamesFromSetDefinition(
            SetImplicitDefinition def,
            java.util.List<String> result) {

        if (def == null || result == null) return;

        /*
         * Caso explícito:
         * S = { (signal,sent) | ... }
         * S = { (level,sigma) | ... }
         */
        if (def.getDefinition() != null &&
            def.getDefinition().getTupleCollection() != null &&
            !def.getDefinition().getTupleCollection().getTuples().isEmpty()) {

            setTheoryModel.Tuple tuple =
                    def.getDefinition().getTupleCollection().getTuples().get(0);

            for (setTheoryModel.Element e : tuple.getElements()) {
                if (e.getName() != null && !e.getName().trim().isEmpty()) {
                    result.add(e.getName().trim());
                }
            }

            return;
        }

        /*
         * Caso:
         * S = LEVELS \product \R
         *
         * No hay nombres de variables explícitos.
         * No inventamos nada.
         */
        if (def.getOperation() != null) {
            return;
        }
    }
    
    private RelationalCondition createEqualityCondition(String leftName, String rightText) {
        BooleanExpressionModelFactory bf = BooleanExpressionModelFactory.eINSTANCE;

        boolean rightIsBoolean =
                "\\true".equals(rightText) ||
                "\\false".equals(rightText) ||
                "true".equals(rightText) ||
                "false".equals(rightText);

        boolean rightIsString =
                rightText.startsWith("\"") && rightText.endsWith("\"") && rightText.length() >= 2;

        boolean rightIsNumber =
                rightText.matches("-?\\d+(\\.\\d+)?");

        boolean rightIsInfinity =
                "\\infinity".equals(rightText) ||
                "infinity".equals(rightText);

        boolean leftLooksConstant =
                leftName.startsWith("\\") ||
                leftName.startsWith("\"") ||
                leftName.matches("-?\\d+(\\.\\d+)?");

        RelationalCondition rc = bf.createRelationalCondition();
        rc.setRelationalOperator(RelationalOperator.EQUAL);

        /*
         * Lado izquierdo: normalmente variable del estado.
         */
        if (leftLooksConstant) {
            Constant c = bf.createConstant();
            c.setValue(normalizeConstantValue(leftName));
            rc.setLeft(c);
        } else {
            booleanExpressionModel.Element el = bf.createElement();
            el.setName(leftName);
            rc.setLeft(el);
        }

        /*
         * Lado derecho: constante o elemento.
         */
        if (rightIsBoolean || rightIsString || rightIsNumber || rightIsInfinity) {
            Constant c = bf.createConstant();
            c.setValue(normalizeConstantValue(rightText));
            rc.setRight(c);
        } else {
            booleanExpressionModel.Element el = bf.createElement();
            el.setName(rightText);
            rc.setRight(el);
        }

        return rc;
    }
    
    private String normalizeConstantValue(String text) {
        if (text == null) return "";

        String t = text.trim();

        if ("\\true".equals(t)) return "true";
        if ("\\false".equals(t)) return "false";
        if ("\\infinity".equals(t)) return "INFINITY";

        if (t.startsWith("\"") && t.endsWith("\"") && t.length() >= 2) {
            return t.substring(1, t.length() - 1);
        }

        return t;
    }
    
    private void mapBooleanCondition(FunctionCase fc, ParseTree ctx) {
        if (fc == null) return;

        fc.setOtherwise(false);

        if (ctx == null) {
            fc.setCondition(createTrueCondition());
            return;
        }

        String t0 = ctx.getText();
        if (t0 != null && (t0.contains("\\inOtherCase") || t0.contains("\\otherwise"))) {
            markOtherwise(fc);
            return;
        }

        ParseTree be = extractBooleanExpr(ctx);
        if (be != null) {
            Expression cond = BooleanExpressionMapperHelper.mapFromDevs(be, tokensDevs);
            fc.setCondition(cond != null ? cond : createTrueCondition());
            return;
        }

        String raw = (ctx instanceof ParserRuleContext)
                ? ((ParserRuleContext) ctx).getText()
                : ctx.getText();

        raw = raw == null ? "" : raw.trim();

        if (raw.contains("\\inOtherCase") || raw.contains("\\otherwise")) {
            markOtherwise(fc);
            return;
        }

        Expression expr = BooleanExpressionMapperHelper.mapFromString(raw);
        fc.setCondition(expr != null ? expr : createTrueCondition());
    }

    private void markOtherwise(FunctionCase fc) {
        if (fc == null) return;
        fc.setOtherwise(true);
        fc.setCondition(null);
    }
    
    private ParseTree extractBooleanExpr(ParseTree ctx) {
        if (ctx == null) return null;

        if (ctx instanceof CFG_DEVS_MODELParser.IfConditionExprContext) {
            return ((CFG_DEVS_MODELParser.IfConditionExprContext) ctx).booleanExpression();
        }

        if (ctx instanceof CFG_DEVS_MODELParser.IfConditionParExprContext) {
            return ((CFG_DEVS_MODELParser.IfConditionParExprContext) ctx).booleanExpression();
        }

        if (ctx instanceof ParserRuleContext) {
            ParserRuleContext prc = (ParserRuleContext) ctx;
            for (int i = 0; i < prc.getChildCount(); i++) {
                ParseTree ch = prc.getChild(i);
                if (ch instanceof CFG_DEVS_MODELParser.BooleanExpressionContext) {
                    return ch;
                }
            }
        }

        return null;
    }

    /**
     * Condición verdadera por defecto, usada como fallback cuando no hay condición
     * o cuando la condición no pudo mapearse correctamente.
     */
    private Expression createTrueCondition() {
        BooleanExpressionModelFactory bf = BooleanExpressionModelFactory.eINSTANCE;

        Constant t1 = bf.createConstant();
        t1.setValue("true");

        Constant t2 = bf.createConstant();
        t2.setValue("true");

        RelationalCondition rc = bf.createRelationalCondition();
        rc.setRelationalOperator(RelationalOperator.EQUAL);
        rc.setLeft(t1);
        rc.setRight(t2);

        return rc;
    }

    private void sanitizeBodyConditions(FunctionBody body) {
        if (body == null) return;

        for (FunctionCase fc : body.getCases()) {
            if (fc == null) continue;

            if (fc.isOtherwise()) {
                fc.setCondition(null);
                continue;
            }

            Expression cond = fc.getCondition();

            if (cond instanceof BooleanExpression) {
                sanitizeBooleanExpression((BooleanExpression) cond);
            } else if (cond == null) {
                fc.setCondition(createTrueCondition());
            }
        }
    }

    /**
     * Corrige expresiones booleanas incompletas para que EMF no falle en validación
     * ni en serialización.
     */
    private void sanitizeBooleanExpression(BooleanExpression be) {
        if (be == null) return;

        BooleanExpressionModelFactory bf = BooleanExpressionModelFactory.eINSTANCE;

        if (be instanceof RelationalCondition) {
            RelationalCondition rc = (RelationalCondition) be;

            if (rc.getRelationalOperator() == null) {
                rc.setRelationalOperator(RelationalOperator.EQUAL);
            }

            if (rc.getLeft() == null) {
                Constant t = bf.createConstant();
                t.setValue("true");
                rc.setLeft(t);
            }

            if (rc.getRight() == null) {
                Constant t = bf.createConstant();
                t.setValue("true");
                rc.setRight(t);
            }

            return;
        }

        if (be instanceof BinaryCondition) {
            BinaryCondition bc = (BinaryCondition) be;

            if (bc.getOperator() == null) {
                bc.setOperator(BinaryOperator.AND);
            }

            if (bc.getLeft() == null) {
                bc.setLeft((BooleanExpression) createTrueCondition());
            } else {
                sanitizeBooleanExpression(bc.getLeft());
            }

            if (bc.getRight() == null) {
                bc.setRight((BooleanExpression) createTrueCondition());
            } else {
                sanitizeBooleanExpression(bc.getRight());
            }

            return;
        }

        if (be instanceof UnaryCondition) {
            UnaryCondition uc = (UnaryCondition) be;

            if (uc.getOperator() == null) {
                uc.setOperator(UnaryOperator.NOT);
            }

            if (uc.getExpression() == null) {
                uc.setExpression((BooleanExpression) createTrueCondition());
            } else {
                sanitizeBooleanExpression(uc.getExpression());
            }

            return;
        }

        if (be instanceof ParenthesisExpression) {
            ParenthesisExpression pe = (ParenthesisExpression) be;

            if (pe.getInner() == null) {
                pe.setInner((BooleanExpression) createTrueCondition());
            } else {
                sanitizeBooleanExpression(pe.getInner());
            }
        }
    }


    // =========================================================
    // Resolución de conjuntos simbólicos
    // =========================================================

    /**
     * Materializa en el modelo intermedio definiciones derivadas para
     * conjuntos simbólicos CUSTOM cuyo contenido puede recuperarse de
     * las condiciones del comportamiento.
     *
     * No reemplaza definiciones explícitas del usuario.
     */
    private void resolveSymbolicSetDefinitions(AtomicModel model) {
        if (model == null || model.getDefinition() == null) return;

        Map<String, String> variableToSet =
                new LinkedHashMap<String, String>();

        Map<String, String> portToSet =
                new LinkedHashMap<String, String>();

        collectSymbolicDomainBindings(model, variableToSet, portToSet);

        Map<String, LinkedHashSet<String>> inferred =
                new LinkedHashMap<String, LinkedHashSet<String>>();

        for (String setName : variableToSet.values()) {
            if (setName != null && !setName.trim().isEmpty()) {
                inferred.putIfAbsent(
                        setName,
                        new LinkedHashSet<String>()
                );
            }
        }

        collectObservedDomainValues(
                model,
                variableToSet,
                portToSet,
                inferred
        );

        for (Map.Entry<String, LinkedHashSet<String>> entry
                : inferred.entrySet()) {

            String setName = entry.getKey();
            LinkedHashSet<String> values = entry.getValue();

            if (setName == null || setName.trim().isEmpty()) continue;
            if (values == null || values.isEmpty()) continue;

            /*
             * Si el texto ya declaró SET = {...}, no generamos
             * una definición derivada adicional.
             */
            if (hasExplicitSetSentence(model, setName)) continue;

            addDerivedStringSetSentence(model, setName, values);
        }
    }

    /**
     * Recupera asociaciones:
     *
     *   phase  -> PHASES
     *   level  -> LELEVLS
     *   action -> ACTIONS
     *
     * y, cuando la misma comprensión define un puerto:
     *
     *   phase_in  -> PHASES
     *   level_in  -> LELEVLS
     *   action_out -> ACTIONS
     */
    private void collectSymbolicDomainBindings(
            AtomicModel model,
            Map<String, String> variableToSet,
            Map<String, String> portToSet) {

        if (model == null ||
            model.getDefinition() == null ||
            variableToSet == null ||
            portToSet == null) {
            return;
        }

        for (ModelSentence ms : model.getDefinition().getSentences()) {
            if (!(ms instanceof SetSentence)) continue;

            SetSentence ss = (SetSentence) ms;
            SetExplicitDefinition sed = ss.getSetDef();

            if (sed == null || sed.getDefinition() == null) continue;

            SetImplicitDefinition sid = sed.getDefinition();

            if (sid.getDefinition() == null ||
                sid.getDefinition().getTupleCollection() == null) {
                continue;
            }

            TupleCollection tc =
                    sid.getDefinition().getTupleCollection();

            TupleDefinition td = tc.getDefinition();
            if (td == null) continue;

            /*
             * Primero obtenemos los puertos literales de la comprensión:
             *
             * {(p,phase) | p in {"phase_in"} and phase in PHASES}
             */
            LinkedHashSet<String> portNames =
                    new LinkedHashSet<String>();

            String portFormalName = null;

            if (!tc.getTuples().isEmpty() &&
                !tc.getTuples().get(0).getElements().isEmpty()) {

                setTheoryModel.Element first =
                        tc.getTuples()
                          .get(0)
                          .getElements()
                          .get(0);

                if (first.getName() != null) {
                    portFormalName = first.getName().trim();
                }
            }
            
            for (ElementDefinition ed : td.getDefinitions()) {
                if (ed == null ||
                    ed.getElement() == null ||
                    ed.getElement().getName() == null) {
                    continue;
                }

                String variableName =
                        ed.getElement().getName().trim();

                if (variableName.equals(portFormalName)) {
                    portNames.addAll(
                            explicitElementNames(ed.getTargetSet())
                    );
                }
            }

            /*
             * Después vinculamos cada variable cuyo dominio es un
             * SetSymbol CUSTOM.
             */
            for (ElementDefinition ed : td.getDefinitions()) {
                if (ed == null ||
                    ed.getElement() == null ||
                    ed.getElement().getName() == null) {
                    continue;
                }

                String variableName =
                        ed.getElement().getName().trim();

                if (variableName.isEmpty()) continue;

                String setName =
                        directCustomSetSymbolName(ed.getTargetSet());

                if (setName == null || setName.isEmpty()) continue;

                variableToSet.put(variableName, setName);

                /*
                 * p es el nombre formal del puerto, no la variable
                 * transportada; no lo asociamos como dominio.
                 */
                if (!variableName.equals(portFormalName)) {
                    for (String portName : portNames) {
                        if (portName != null &&
                            !portName.trim().isEmpty()) {
                            portToSet.put(
                                    portName.trim(),
                                    setName
                            );
                        }
                    }
                }
            }
        }
    }

    /**
     * Recorre todas las condiciones del comportamiento y acumula
     * valores observados para los conjuntos simbólicos.
     */
    private void collectObservedDomainValues(
            AtomicModel model,
            Map<String, String> variableToSet,
            Map<String, String> portToSet,
            Map<String, LinkedHashSet<String>> inferred) {

        if (model == null || inferred == null) return;

        List<FunctionBody> bodies = new ArrayList<FunctionBody>();

        if (model.getDeltaExt() != null &&
            model.getDeltaExt().getBody() != null) {
            bodies.add(model.getDeltaExt().getBody());
        }

        if (model.getDeltaInt() != null &&
            model.getDeltaInt().getBody() != null) {
            bodies.add(model.getDeltaInt().getBody());
        }

        if (model.getLambda() != null &&
            model.getLambda().getBody() != null) {
            bodies.add(model.getLambda().getBody());
        }

        if (model.getTa() != null &&
            model.getTa().getBody() != null) {
            bodies.add(model.getTa().getBody());
        }

        for (FunctionBody body : bodies) {
            for (FunctionCase fc : body.getCases()) {
                if (fc == null || fc.getCondition() == null) continue;

                /*
                 * Hechos relacionales del caso:
                 *   action = Gone
                 *   p = phase_in
                 *   v = Present
                 */
                Map<String, LinkedHashSet<String>> facts =
                        new LinkedHashMap<String, LinkedHashSet<String>>();

                collectRelationalFacts(
                        fc.getCondition(),
                        facts,
                        variableToSet,
                        inferred
                );

                /*
                 * Caso de variable formal de entrada:
                 *
                 *   p = phase_in AND v = Present
                 *
                 * El nombre "v" por sí solo no dice si pertenece a
                 * PHASES o LELEVLS. El puerto p lo desambigua.
                 */
                Set<String> ports =
                        currentInputPortFormalName == null
                        ? null
                        : facts.get(currentInputPortFormalName);

                Set<String> inputValues =
                        currentInputValueFormalName == null
                        ? null
                        : facts.get(currentInputValueFormalName);

                if (ports != null && inputValues != null) {
                    for (String port : ports) {
                        String setName = portToSet.get(port);
                        if (setName == null) continue;

                        LinkedHashSet<String> values =
                                inferred.computeIfAbsent(
                                        setName,
                                        k -> new LinkedHashSet<String>()
                                );

                        for (String value : inputValues) {
                            if (isUsefulCategoricalValue(value)) {
                                values.add(value);
                            }
                        }
                    }
                }

                /*
                 * Membership explícito:
                 *   action in {"Reading","Waving"}
                 */
                collectMembershipFacts(
                        fc.getCondition(),
                        variableToSet,
                        inferred
                );
            }
        }
    }

    private void collectRelationalFacts(
            Expression expr,
            Map<String, LinkedHashSet<String>> facts,
            Map<String, String> variableToSet,
            Map<String, LinkedHashSet<String>> inferred) {

        if (expr == null || facts == null) return;

        if (expr instanceof RelationalCondition) {
            RelationalCondition rc = (RelationalCondition) expr;

            String leftName = booleanElementName(rc.getLeft());
            String rightName = booleanElementName(rc.getRight());

            String leftValue = booleanConstantValue(rc.getLeft());
            String rightValue = booleanConstantValue(rc.getRight());

            /*
             * variable OP constante
             */
            if (leftName != null && rightValue != null) {
                addFact(facts, leftName, rightValue);
                addObservedValueForVariable(
                        leftName,
                        rightValue,
                        variableToSet,
                        inferred
                );
            }

            /*
             * constante OP variable
             */
            if (rightName != null && leftValue != null) {
                addFact(facts, rightName, leftValue);
                addObservedValueForVariable(
                        rightName,
                        leftValue,
                        variableToSet,
                        inferred
                );
            }

            return;
        }

        if (expr instanceof BinaryCondition) {
            BinaryCondition bc = (BinaryCondition) expr;

            collectRelationalFacts(
                    bc.getLeft(),
                    facts,
                    variableToSet,
                    inferred
            );

            collectRelationalFacts(
                    bc.getRight(),
                    facts,
                    variableToSet,
                    inferred
            );

            return;
        }

        if (expr instanceof UnaryCondition) {
            UnaryCondition uc = (UnaryCondition) expr;

            collectRelationalFacts(
                    uc.getExpression(),
                    facts,
                    variableToSet,
                    inferred
            );

            return;
        }

        if (expr instanceof ParenthesisExpression) {
            ParenthesisExpression pe =
                    (ParenthesisExpression) expr;

            collectRelationalFacts(
                    pe.getInner(),
                    facts,
                    variableToSet,
                    inferred
            );
        }
    }

    private void collectMembershipFacts(
            Expression expr,
            Map<String, String> variableToSet,
            Map<String, LinkedHashSet<String>> inferred) {

        if (expr == null) return;

        if (expr instanceof SetTheoryCondition) {
            SetTheoryCondition sc = (SetTheoryCondition) expr;

            ElementDefinition ed = sc.getDefinition();

            if (ed == null ||
                ed.getElement() == null ||
                ed.getElement().getName() == null) {
                return;
            }

            String variableName =
                    ed.getElement().getName().trim();

            String setName = variableToSet.get(variableName);

            if (setName == null || setName.trim().isEmpty()) {
                return;
            }

            LinkedHashSet<String> values =
                    inferred.computeIfAbsent(
                            setName,
                            k -> new LinkedHashSet<String>()
                    );

            for (String value
                    : explicitElementNames(ed.getTargetSet())) {
                if (isUsefulCategoricalValue(value)) {
                    values.add(value);
                }
            }

            return;
        }

        if (expr instanceof BinaryCondition) {
            BinaryCondition bc = (BinaryCondition) expr;

            collectMembershipFacts(
                    bc.getLeft(),
                    variableToSet,
                    inferred
            );

            collectMembershipFacts(
                    bc.getRight(),
                    variableToSet,
                    inferred
            );

            return;
        }

        if (expr instanceof UnaryCondition) {
            collectMembershipFacts(
                    ((UnaryCondition) expr).getExpression(),
                    variableToSet,
                    inferred
            );

            return;
        }

        if (expr instanceof ParenthesisExpression) {
            collectMembershipFacts(
                    ((ParenthesisExpression) expr).getInner(),
                    variableToSet,
                    inferred
            );
        }
    }

    private void addObservedValueForVariable(
            String variableName,
            String value,
            Map<String, String> variableToSet,
            Map<String, LinkedHashSet<String>> inferred) {

        if (variableName == null ||
            value == null ||
            variableToSet == null ||
            inferred == null) {
            return;
        }

        String setName = variableToSet.get(variableName);
        if (setName == null || setName.trim().isEmpty()) return;

        if (!isUsefulCategoricalValue(value)) return;

        inferred.computeIfAbsent(
                setName,
                k -> new LinkedHashSet<String>()
        ).add(value);
    }

    private boolean isUsefulCategoricalValue(String value) {
        if (value == null) return false;

        String v = value.trim();
        if (v.isEmpty()) return false;

        /*
         * No generamos conjuntos categoriales a partir de valores
         * matemáticos, booleanos ni infinito.
         */
        if (v.matches("-?\\d+(\\.\\d+)?")) return false;

        if ("true".equalsIgnoreCase(v) ||
            "false".equalsIgnoreCase(v)) {
            return false;
        }

        if ("infinity".equalsIgnoreCase(v) ||
            "INFINITY".equals(v) ||
            "∞".equals(v)) {
            return false;
        }

        return true;
    }

    private void addFact(
            Map<String, LinkedHashSet<String>> facts,
            String variableName,
            String value) {

        if (facts == null ||
            variableName == null ||
            value == null) {
            return;
        }

        String n = variableName.trim();
        String v = value.trim();

        if (n.isEmpty() || v.isEmpty()) return;

        facts.computeIfAbsent(
                n,
                k -> new LinkedHashSet<String>()
        ).add(v);
    }

    private String booleanElementName(Object term) {
        if (term instanceof booleanExpressionModel.Element) {
            String name =
                    ((booleanExpressionModel.Element) term).getName();

            return name == null ? null : name.trim();
        }

        return null;
    }

    private String booleanConstantValue(Object term) {
        if (term instanceof Constant) {
            String value = ((Constant) term).getValue();

            return value == null ? null : value.trim();
        }

        return null;
    }

    /**
     * Devuelve el nombre del SetSymbol solamente cuando la definición
     * es una referencia directa a un único símbolo CUSTOM.
     */
    private String directCustomSetSymbolName(
            SetImplicitDefinition sid) {

        if (sid == null ||
            sid.getOperation() == null ||
            sid.getOperation().getTerms().size() != 1) {
            return null;
        }

        SetOperationTerm term =
                sid.getOperation().getTerms().get(0);

        if (term == null ||
            term.getOperationSet() == null ||
            term.getOperationSet().getSymbol() == null) {
            return null;
        }

        SetSymbol symbol =
                term.getOperationSet().getSymbol();

        if (symbol.getType() != SetSymbolType.CUSTOM) {
            return null;
        }

        String name = symbol.getName();
        return name == null ? null : name.trim();
    }

    /**
     * Obtiene los elementos de una definición explícita simple:
     *
     *   {"phase_in"}
     *   {"Reading","Waving"}
     */
    private LinkedHashSet<String> explicitElementNames(
            SetImplicitDefinition sid) {

        LinkedHashSet<String> result =
                new LinkedHashSet<String>();

        if (sid == null ||
            sid.getDefinition() == null ||
            sid.getDefinition().getElementCollection() == null) {
            return result;
        }

        ElementCollection ec =
                sid.getDefinition().getElementCollection();

        for (setTheoryModel.Element e : ec.getElements()) {
            if (e == null || e.getName() == null) continue;

            String name = e.getName().trim();
            if (!name.isEmpty()) {
                result.add(name);
            }
        }

        return result;
    }

    private boolean hasExplicitSetSentence(
            AtomicModel model,
            String setName) {

        if (model == null ||
            model.getDefinition() == null ||
            setName == null) {
            return false;
        }

        for (ModelSentence ms
                : model.getDefinition().getSentences()) {

            if (!(ms instanceof SetSentence)) continue;

            SetSentence ss = (SetSentence) ms;
            SetExplicitDefinition sed = ss.getSetDef();

            if (sed == null ||
                sed.getSymbol() == null ||
                sed.getSymbol().getName() == null) {
                continue;
            }

            if (setName.equals(
                    sed.getSymbol().getName().trim())) {
                return true;
            }
        }

        return false;
    }

    /**
     * Agrega al devsModel una SetSentence derivada:
     *
     *   PHASES = {"Present","Absent"}
     *
     * Esta sentencia se materializa únicamente cuando el conjunto
     * no tenía una definición explícita original.
     */
    private void addDerivedStringSetSentence(
            AtomicModel model,
            String setName,
            Set<String> values) {

        if (model == null ||
            model.getDefinition() == null ||
            setName == null ||
            values == null ||
            values.isEmpty()) {
            return;
        }

        SetSentence sentence =
                factory.createSetSentence();

        SetExplicitDefinition explicit =
                setFactory.createSetExplicitDefinition();

        SetSymbol symbol =
                setFactory.createSetSymbol();

        symbol.setName(setName);
        symbol.setType(SetSymbolType.CUSTOM);
        explicit.setSymbol(symbol);

        ElementCollection collection =
                setFactory.createElementCollection();

        collection.setIsEmpty(false);

        for (String value : values) {
            if (!isUsefulCategoricalValue(value)) continue;

            setTheoryModel.Element element =
                    setFactory.createElement();

            element.setType(setTheoryModel.ElementType.STRING);
            element.setName(value);

            collection.getElements().add(element);
        }

        if (collection.getElements().isEmpty()) {
            return;
        }

        SetDefinition definition =
                setFactory.createSetDefinition();

        definition.setElementCollection(collection);
        definition.setTupleCollection(null);

        SetImplicitDefinition implicit =
                setFactory.createSetImplicitDefinition();

        implicit.setDefinition(definition);
        implicit.setOperation(null);

        explicit.setDefinition(implicit);
        sentence.setSetDef(explicit);

        model.getDefinition().getSentences().add(sentence);
    }

    // =========================================================
    // Helpers de completitud
    // =========================================================

    private void ensureAtLeastOneCase(FunctionBody body) {
        if (!body.getCases().isEmpty()) return;

        FunctionCase fc = factory.createFunctionCase();

        SingleValueResult res = factory.createSingleValueResult();
        MathExpression m = MathExpressionMapperHelper.createZeroExpression();

        MathValue mv = factory.createMathValue();
        mv.setValue(m);

        res.setValue(mv);
        fc.setResult(res);
        fc.setCondition(createTrueCondition());

        body.getCases().add(fc);
    }

    private void ensureAtLeastOneCaseForSelect(FunctionBody body) {
        if (!body.getCases().isEmpty()) return;

        FunctionCase fc = factory.createFunctionCase();
        fc.setCondition(createTrueCondition());

        IdentifierResult r = factory.createIdentifierResult();
        r.setIdentifier("UNKNOWN");
        fc.setResult(r);

        body.getCases().add(fc);
    }

    private FunctionResult buildTupleResult(CFG_DEVS_MODELParser.TupleValueContext ctx) {
        if (ctx.value() == null || ctx.value().isEmpty()) {
            throw new RuntimeException("Empty tuple result");
        }

        if (ctx.value().size() == 1) {
            SingleValueResult r = factory.createSingleValueResult();
            r.setValue(buildValue(ctx.value(0)));
            return r;
        }

        TupleResult t = factory.createTupleResult();

        for (CFG_DEVS_MODELParser.ValueContext v : ctx.value()) {
            ExpressionValue ev = buildValue(v);
            if (ev == null) {
                throw new RuntimeException("Null value inside tuple");
            }
            t.getValues().add(ev);
        }

        return t;
    }

    // =========================================================
    // Registro de sentencias de función
    // =========================================================

    private void addFunctionSentence(devsModel.Function f) {
        if (f == null) return;

        DevsModel current = getCurrentModelForSentences();
        if (current == null || current.getDefinition() == null) return;

        FunctionSentence fs = factory.createFunctionSentence();
        fs.setFunction(f);

        if (fs.getFunction() == null) {
            throw new IllegalStateException(
                    "FunctionSentence.function quedó NULL. ¿Regeneraste el Model Code desde el genmodel?"
            );
        }

        current.getDefinition().getSentences().add(fs);
    }

    /**
     * Asegura que el modelo atómico tenga referenciadas sus funciones principales,
     * incluso si originalmente quedaron solo como sentencias dentro de la definición.
     */
    private void ensureAtomicRequiredFunctions(AtomicModel model) {
        if (model == null || model.getDefinition() == null) return;

        ExternalTransitionFunction dx = model.getDeltaExt();
        InternalTransitionFunction di = model.getDeltaInt();
        OutputFunction la = model.getLambda();
        TimeAdvanceFunction ta = model.getTa();

        if (dx != null && di != null && la != null && ta != null) return;

        for (ModelSentence ms : model.getDefinition().getSentences()) {
            if (!(ms instanceof FunctionSentence)) continue;

            devsModel.Function f = ((FunctionSentence) ms).getFunction();

            if (f instanceof ExternalTransitionFunction && dx == null) {
                dx = (ExternalTransitionFunction) f;
            } else if (f instanceof InternalTransitionFunction && di == null) {
                di = (InternalTransitionFunction) f;
            } else if (f instanceof OutputFunction && la == null) {
                la = (OutputFunction) f;
            } else if (f instanceof TimeAdvanceFunction && ta == null) {
                ta = (TimeAdvanceFunction) f;
            }
        }

        if (model.getDeltaExt() == null && dx != null) model.setDeltaExt(dx);
        if (model.getDeltaInt() == null && di != null) model.setDeltaInt(di);
        if (model.getLambda() == null && la != null) model.setLambda(la);
        if (model.getTa() == null && ta != null) model.setTa(ta);
    }

    private boolean shouldDeriveTupleRestriction(String actual) {
        if (actual == null) return false;

        String t = actual.trim();

        return isLiteralConstantText(t);
    }

    private boolean isLiteralConstantText(String text) {
        if (text == null) return false;

        String t = text.trim();

        if ("\\true".equals(t) || "\\false".equals(t)) return true;
        if ("true".equals(t) || "false".equals(t)) return true;

        if ("\\infinity".equals(t) || "infinity".equals(t)) return true;
        if ("INFINITY".equals(t)) return true;

        if (t.startsWith("\"") && t.endsWith("\"") && t.length() >= 2) return true;

        if (t.matches("-?\\d+(\\.\\d+)?")) return true;

        return false;
    }
 
    // =========================================================
    // Búsquedas de contexto actual
    // =========================================================

    private AtomicModel findAtomicModel() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) instanceof AtomicModel) {
                return (AtomicModel) stack.get(i);
            }
        }
        throw new RuntimeException("AtomicModel not found in stack");
    }

    private CoupledModel findCoupledModel() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) instanceof CoupledModel) {
                return (CoupledModel) stack.get(i);
            }
        }
        throw new RuntimeException("CoupledModel not found in stack");
    }

    private DevsModel findDevsModel() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (stack.get(i) instanceof DevsModel) {
                return (DevsModel) stack.get(i);
            }
        }
        throw new RuntimeException("DevsModel not found in stack");
    }

    private DevsModel getCurrentModelForSentences() {
        if (currentAtomic != null) return currentAtomic;
        if (currentCoupled != null) return currentCoupled;
        return findDevsModel();
    }
}