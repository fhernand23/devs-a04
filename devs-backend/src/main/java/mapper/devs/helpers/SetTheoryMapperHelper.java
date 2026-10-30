package mapper.devs.helpers;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import mapper.devs.SetTheoryMapperListener;
import setTheoryModel.Element;
import setTheoryModel.ElementCollection;
import setTheoryModel.ElementType;
import setTheoryModel.OperationSet;
import setTheoryModel.SetDefinition;
import setTheoryModel.SetExpression;
import setTheoryModel.SetImplicitDefinition;
import setTheoryModel.SetOperationResult;
import setTheoryModel.SetOperationTerm;
import setTheoryModel.SetSymbol;
import setTheoryModel.SetTheoryModelFactory;
import rules.CFG_DEVS_MODELParser;
import rules.CFG_SET_THEORYLexer;
import rules.CFG_SET_THEORYParser;

public class SetTheoryMapperHelper {

    private static final SetTheoryModelFactory factory = SetTheoryModelFactory.eINSTANCE;

    public static SetExpression map(CFG_DEVS_MODELParser.SetInModelContext ctx) {
        if (ctx == null) return null;
        return map((ParseTree) ctx);
    }

    public static SetExpression map(ParseTree ctx) {
        if (ctx == null) return null;
        return mapFromText(ctx.getText());
    }

    /**
     * Hace un preprocesamiento simple de casos comunes y, si no aplica,
     * delega al parser específico de teoría de conjuntos.
     */
    public static SetExpression mapFromText(String text) {
        if (text == null) return null;

        text = text.trim();
        if (text.isEmpty()) return null;

        // Parámetro: #x
        if (text.startsWith("#")) {
            Element el = factory.createElement();
            el.setType(ElementType.PARAMETER);
            el.setName(text.substring(1));
            return wrapElementAsSet(el);
        }

        // Literal string: "abc"
        if (text.startsWith("\"") && text.endsWith("\"") && text.length() >= 2) {
            Element el = factory.createElement();
            el.setType(ElementType.STRING);
            el.setName(text.substring(1, text.length() - 1));
            return wrapElementAsSet(el);
        }

        // Número literal
        if (text.matches("-?\\d+(\\.\\d+)?")) {
            Element el = factory.createElement();
            el.setType(ElementType.NUMBER);
            el.setName(text);
            return wrapElementAsSet(el);
        }

        // Infinito
        if (text.equals("\\infinity") || text.equals("∞") || text.equals("-∞")) {
            Element el = factory.createElement();
            el.setType(ElementType.NUMBER);
            el.setName("∞");
            return wrapElementAsSet(el);
        }

        // Identificador simple: se interpreta como símbolo de conjunto.
        if (text.matches("[a-zA-Z_][a-zA-Z0-9_']*")) {
            return wrapSetSymbol(text);
        }
        // Tupla vacía: \emptyTuple
        if ("\\emptyTuple".equals(text)) {
            setTheoryModel.Tuple tuple = factory.createTuple();
            tuple.eUnset(setTheoryModel.SetTheoryModelPackage.Literals.TUPLE__IS_EMPTY);
            tuple.setIsEmpty(true);

            Element el = factory.createElement();
            el.setType(ElementType.TUPLE);
            el.setTuple(tuple);

            return wrapElementAsSet(el);
        }
        return parseWithSetTheory(text);
    }

    public static SetExpression mapSignature(ParseTree ctx) {
        if (ctx == null) return null;

        String text = ctx.getText();
        if (text == null) return null;
        text = text.trim();

        CharStream cs = CharStreams.fromString(text);
        CFG_SET_THEORYLexer lexer = new CFG_SET_THEORYLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CFG_SET_THEORYParser parser = new CFG_SET_THEORYParser(tokens);

        CFG_SET_THEORYParser.ModelSignatureContext tree = parser.modelSignature();

        SetTheoryMapperListener listener = new SetTheoryMapperListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        SetExpression result = (SetExpression) listener.getRootSet();
        if (result == null) {
            throw new RuntimeException("Signature mapping failed for: " + text);
        }

        return result;
    }

    private static SetExpression parseWithSetTheory(String text) {
        CharStream cs = CharStreams.fromString(text);
        CFG_SET_THEORYLexer lexer = new CFG_SET_THEORYLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CFG_SET_THEORYParser parser = new CFG_SET_THEORYParser(tokens);

        CFG_SET_THEORYParser.SetContext tree = parser.set();

        SetTheoryMapperListener listener = new SetTheoryMapperListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

        SetExpression result = listener.getRootSet();
        if (result == null) {
            throw new RuntimeException("SetTheory mapping failed for: " + text);
        }

        return result;
    }

    /**
     * Envuelve un elemento simple como una definición implícita de conjunto.
     */
    private static SetImplicitDefinition wrapElementAsSet(Element el) {
        ElementCollection ec = factory.createElementCollection();
        ec.setIsEmpty(false);
        ec.getElements().add(el);

        SetDefinition sd = factory.createSetDefinition();
        sd.setElementCollection(ec);

        OperationSet os = factory.createOperationSet();
        os.setDefinition(sd);

        SetOperationTerm term = factory.createSetOperationTerm();
        term.setOperationSet(os);

        SetOperationResult sor = factory.createSetOperationResult();
        sor.getTerms().add(term);

        SetImplicitDefinition sid = factory.createSetImplicitDefinition();
        sid.setOperation(sor);
        sid.setDefinition(null);

        return sid;
    }

    /**
     * Envuelve un símbolo de conjunto simple como expresión de conjunto.
     */
    private static SetImplicitDefinition wrapSetSymbol(String symbolName) {
        SetSymbol symbol = factory.createSetSymbol();
        symbol.setName(symbolName);

        OperationSet os = factory.createOperationSet();
        os.setSymbol(symbol);

        SetOperationTerm term = factory.createSetOperationTerm();
        term.setOperationSet(os);

        SetOperationResult sor = factory.createSetOperationResult();
        sor.getTerms().add(term);

        SetImplicitDefinition sid = factory.createSetImplicitDefinition();
        sid.setOperation(sor);
        sid.setDefinition(null);

        return sid;
    }
}