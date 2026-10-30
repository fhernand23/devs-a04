// Generated from c:/Users/clach/Documents/DevsLangWebEditor/DevsLangWebEditor/CFG_BOOLEAN_EXPRESSION.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CFG_BOOLEAN_EXPRESSIONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UPPERCASEID=1, LOWERCASEID=2, FULLCASEID=3, STRINGSYMBOL=4, INTEGERSYMBOL=5, 
		REALSYMBOL=6, EMPTYSETSYMBOL=7, EMPTYTUPLESYMBOL=8, WHERESYMBOL=9, DELTAEXTNAMESYMBOL=10, 
		DELTAINTNAMESYMBOL=11, LAMBDANAMESYMBOL=12, SELECTNAMESYMBOL=13, TANAMESYMBOL=14, 
		TRUESYMBOL=15, FALSESYMBOL=16, SETZSYMBOL=17, SETNSYMBOL=18, SETRSYMBOL=19, 
		SETBSYMBOL=20, IFSYMBOL=21, THENSYMBOL=22, INOTHERCASESYMBOL=23, OTHERWISESYMBOL=24, 
		INFINITYSYMBOL=25, ASSIGNOPERATOR=26, INOPERATOR=27, NOTINOPERATOR=28, 
		CARTESIANPRODUCTOPERATOR=29, UNIONOPERATOR=30, INTERSECTIONOPERATOR=31, 
		SETDIFFERENCEOPERATOR=32, NOTOPERATOR=33, ANDOPERATOR=34, OROPERATOR=35, 
		EQUALTOOPERATOR=36, NOTEQUALTOOPERATOR=37, GREATERTHANOPERATOR=38, LESSTHANOPERATOR=39, 
		GREATERTHANOREQUALTOOPERATOR=40, LESSTHANOREQUALTOOPERATOR=41, SQRTOPERATOR=42, 
		ADDITIONOPERATOR=43, SUBSTRACTIONOPERATOR=44, MULTIPLICATIONOPERATOR=45, 
		DIVISIONOPERATOR=46, POWEROPERATOR=47, APOSTROPHE=48, HASH=49, COMMA=50, 
		BEGINBRACKET=51, ENDBRACKET=52, BEGINSET=53, ENDSET=54, BEGINPARENTHESES=55, 
		ENDPARENTHESES=56, COLON=57, SEMICOLON=58, EQUAL=59, SUCHTHAT=60, QUOTE=61, 
		IGNOREEMPTY=62;
	public static final int
		RULE_root = 0, RULE_ifCondition = 1, RULE_ifThenCondition = 2, RULE_booleanExpression = 3, 
		RULE_binaryCondition = 4, RULE_booleanExpressionTerm = 5, RULE_unaryCondition = 6, 
		RULE_relationalExpressionTerm = 7, RULE_booleanExpressionBasicTerm = 8, 
		RULE_booleanExpressionElement = 9, RULE_booleanExpressionResult = 10, 
		RULE_actionExpression = 11, RULE_ifSymbol = 12, RULE_inOtherCaseSymbol = 13, 
		RULE_unaryConditionalOperator = 14, RULE_binaryConditionalOperator = 15, 
		RULE_binaryRelationalOperator = 16, RULE_notOperator = 17, RULE_andOperator = 18, 
		RULE_orOperator = 19, RULE_equalToOperator = 20, RULE_notEqualToOperator = 21, 
		RULE_greaterThanOperator = 22, RULE_lessThanOperator = 23, RULE_greaterThanOrEqualToOperator = 24, 
		RULE_lessThanOrEqualToOperator = 25, RULE_modelSignature = 26, RULE_modelSymbol = 27, 
		RULE_parameter = 28, RULE_identifier = 29, RULE_variable = 30, RULE_variableFixedValues = 31, 
		RULE_parametersList = 32, RULE_datatypeSymbol = 33, RULE_trueSymbol = 34, 
		RULE_falseSymbol = 35, RULE_integerSymbol = 36, RULE_realSymbol = 37, 
		RULE_infinitySymbol = 38, RULE_stringSymbol = 39, RULE_set = 40, RULE_setImplicitDefinition = 41, 
		RULE_setExplicitDefinition = 42, RULE_setDefinition = 43, RULE_setSymbol = 44, 
		RULE_setName = 45, RULE_setOfIntegerNumbersSymbol = 46, RULE_setOfNaturalNumbersSymbol = 47, 
		RULE_setOfRealNumbersSymbol = 48, RULE_setOfBooleanAlgebraSymbol = 49, 
		RULE_elementCollection = 50, RULE_element = 51, RULE_tupleCollection = 52, 
		RULE_tuple = 53, RULE_variableTuple = 54, RULE_variableTupleFixedValues = 55, 
		RULE_tupleDefinition = 56, RULE_elementDefinition = 57, RULE_definitionWithSetImplicitDefinition = 58, 
		RULE_definitionWithSetSymbol = 59, RULE_definitionWithRange = 60, RULE_range = 61, 
		RULE_booleanSymbol = 62, RULE_numberSymbol = 63, RULE_emptySetSymbol = 64, 
		RULE_emptyTupleSymbol = 65, RULE_setOperationResult = 66, RULE_setOperationTerm = 67, 
		RULE_setOperationExpression = 68, RULE_operationSet = 69, RULE_belongsToOperator = 70, 
		RULE_inOperator = 71, RULE_notInOperator = 72, RULE_setOperator = 73, 
		RULE_cartesianProductOperator = 74, RULE_unionOperator = 75, RULE_intersectionOperator = 76, 
		RULE_setdifferenceOperator = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "ifCondition", "ifThenCondition", "booleanExpression", "binaryCondition", 
			"booleanExpressionTerm", "unaryCondition", "relationalExpressionTerm", 
			"booleanExpressionBasicTerm", "booleanExpressionElement", "booleanExpressionResult", 
			"actionExpression", "ifSymbol", "inOtherCaseSymbol", "unaryConditionalOperator", 
			"binaryConditionalOperator", "binaryRelationalOperator", "notOperator", 
			"andOperator", "orOperator", "equalToOperator", "notEqualToOperator", 
			"greaterThanOperator", "lessThanOperator", "greaterThanOrEqualToOperator", 
			"lessThanOrEqualToOperator", "modelSignature", "modelSymbol", "parameter", 
			"identifier", "variable", "variableFixedValues", "parametersList", "datatypeSymbol", 
			"trueSymbol", "falseSymbol", "integerSymbol", "realSymbol", "infinitySymbol", 
			"stringSymbol", "set", "setImplicitDefinition", "setExplicitDefinition", 
			"setDefinition", "setSymbol", "setName", "setOfIntegerNumbersSymbol", 
			"setOfNaturalNumbersSymbol", "setOfRealNumbersSymbol", "setOfBooleanAlgebraSymbol", 
			"elementCollection", "element", "tupleCollection", "tuple", "variableTuple", 
			"variableTupleFixedValues", "tupleDefinition", "elementDefinition", "definitionWithSetImplicitDefinition", 
			"definitionWithSetSymbol", "definitionWithRange", "range", "booleanSymbol", 
			"numberSymbol", "emptySetSymbol", "emptyTupleSymbol", "setOperationResult", 
			"setOperationTerm", "setOperationExpression", "operationSet", "belongsToOperator", 
			"inOperator", "notInOperator", "setOperator", "cartesianProductOperator", 
			"unionOperator", "intersectionOperator", "setdifferenceOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'\\emptySet'", "'\\emptyTuple'", 
			"'\\where'", "'\\delExt'", "'\\delInt'", "'\\lambda'", "'\\select'", 
			"'\\ta'", "'\\true'", "'\\false'", "'\\Z'", "'\\N'", "'\\R'", "'\\B'", 
			"'\\if'", "'\\then'", "'\\inOtherCase'", "'\\otherwise'", "'\\infinity'", 
			"'\\assign'", "'\\in'", "'\\notIn'", "'\\product'", "'\\union'", "'\\intersection'", 
			"'\\setDifference'", "'\\not'", "'\\and'", "'\\or'", "'\\equalTo'", "'\\notEqualTo'", 
			"'\\greaterThan'", "'\\lessThan'", "'\\greaterThanOrEqualTo'", "'\\lessThanOrEqualTo'", 
			"'\\sqrt'", "'\\addition'", "'\\substraction'", "'\\multiplication'", 
			"'\\division'", "'\\power'", "'''", "'#'", "','", "'['", "']'", "'{'", 
			"'}'", "'('", "')'", "':'", "';'", "'='", "'|'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "UPPERCASEID", "LOWERCASEID", "FULLCASEID", "STRINGSYMBOL", "INTEGERSYMBOL", 
			"REALSYMBOL", "EMPTYSETSYMBOL", "EMPTYTUPLESYMBOL", "WHERESYMBOL", "DELTAEXTNAMESYMBOL", 
			"DELTAINTNAMESYMBOL", "LAMBDANAMESYMBOL", "SELECTNAMESYMBOL", "TANAMESYMBOL", 
			"TRUESYMBOL", "FALSESYMBOL", "SETZSYMBOL", "SETNSYMBOL", "SETRSYMBOL", 
			"SETBSYMBOL", "IFSYMBOL", "THENSYMBOL", "INOTHERCASESYMBOL", "OTHERWISESYMBOL", 
			"INFINITYSYMBOL", "ASSIGNOPERATOR", "INOPERATOR", "NOTINOPERATOR", "CARTESIANPRODUCTOPERATOR", 
			"UNIONOPERATOR", "INTERSECTIONOPERATOR", "SETDIFFERENCEOPERATOR", "NOTOPERATOR", 
			"ANDOPERATOR", "OROPERATOR", "EQUALTOOPERATOR", "NOTEQUALTOOPERATOR", 
			"GREATERTHANOPERATOR", "LESSTHANOPERATOR", "GREATERTHANOREQUALTOOPERATOR", 
			"LESSTHANOREQUALTOOPERATOR", "SQRTOPERATOR", "ADDITIONOPERATOR", "SUBSTRACTIONOPERATOR", 
			"MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "POWEROPERATOR", "APOSTROPHE", 
			"HASH", "COMMA", "BEGINBRACKET", "ENDBRACKET", "BEGINSET", "ENDSET", 
			"BEGINPARENTHESES", "ENDPARENTHESES", "COLON", "SEMICOLON", "EQUAL", 
			"SUCHTHAT", "QUOTE", "IGNOREEMPTY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CFG_BOOLEAN_EXPRESSION.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CFG_BOOLEAN_EXPRESSIONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	 
		public RootContext() { }
		public void copyFrom(RootContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootIfThenContext extends RootContext {
		public IfThenConditionContext ifThenCondition() {
			return getRuleContext(IfThenConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EOF, 0); }
		public RootIfThenContext(RootContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootIfContext extends RootContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EOF, 0); }
		public RootIfContext(RootContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RootBooleanExprContext extends RootContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EOF, 0); }
		public RootBooleanExprContext(RootContext ctx) { copyFrom(ctx); }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new RootIfThenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				ifThenCondition();
				setState(157);
				match(EOF);
				}
				break;
			case 2:
				_localctx = new RootIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				ifCondition();
				setState(160);
				match(EOF);
				}
				break;
			case 3:
				_localctx = new RootBooleanExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				booleanExpression();
				setState(163);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionContext extends ParserRuleContext {
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
	 
		public IfConditionContext() { }
		public void copyFrom(IfConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionParExprContext extends IfConditionContext {
		public IfSymbolContext ifSymbol() {
			return getRuleContext(IfSymbolContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public IfConditionParExprContext(IfConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionExprContext extends IfConditionContext {
		public IfSymbolContext ifSymbol() {
			return getRuleContext(IfSymbolContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public IfConditionExprContext(IfConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfConditionDefaultExprContext extends IfConditionContext {
		public InOtherCaseSymbolContext inOtherCaseSymbol() {
			return getRuleContext(InOtherCaseSymbolContext.class,0);
		}
		public IfConditionDefaultExprContext(IfConditionContext ctx) { copyFrom(ctx); }
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifCondition);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new IfConditionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				ifSymbol();
				setState(168);
				booleanExpression();
				}
				break;
			case 2:
				_localctx = new IfConditionParExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				ifSymbol();
				setState(171);
				match(BEGINPARENTHESES);
				setState(172);
				booleanExpression();
				setState(173);
				match(ENDPARENTHESES);
				}
				break;
			case 3:
				_localctx = new IfConditionDefaultExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				inOtherCaseSymbol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenConditionContext extends ParserRuleContext {
		public IfThenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenCondition; }
	 
		public IfThenConditionContext() { }
		public void copyFrom(IfThenConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenExprContext extends IfThenConditionContext {
		public IfSymbolContext ifSymbol() {
			return getRuleContext(IfSymbolContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode THENSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.THENSYMBOL, 0); }
		public IfThenExprContext(IfThenConditionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenParExprContext extends IfThenConditionContext {
		public IfSymbolContext ifSymbol() {
			return getRuleContext(IfSymbolContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public TerminalNode THENSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.THENSYMBOL, 0); }
		public IfThenParExprContext(IfThenConditionContext ctx) { copyFrom(ctx); }
	}

	public final IfThenConditionContext ifThenCondition() throws RecognitionException {
		IfThenConditionContext _localctx = new IfThenConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifThenCondition);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IfThenExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				ifSymbol();
				setState(179);
				booleanExpression();
				setState(180);
				match(THENSYMBOL);
				}
				break;
			case 2:
				_localctx = new IfThenParExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				ifSymbol();
				setState(183);
				match(BEGINPARENTHESES);
				setState(184);
				booleanExpression();
				setState(185);
				match(ENDPARENTHESES);
				setState(186);
				match(THENSYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTermExprContext extends BooleanExpressionContext {
		public BooleanExpressionTermContext bt;
		public BooleanExpressionTermContext booleanExpressionTerm() {
			return getRuleContext(BooleanExpressionTermContext.class,0);
		}
		public BooleanTermExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryConditionExprContext extends BooleanExpressionContext {
		public BinaryConditionContext bc;
		public BinaryConditionContext binaryCondition() {
			return getRuleContext(BinaryConditionContext.class,0);
		}
		public BinaryConditionExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanExpression);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BinaryConditionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				((BinaryConditionExprContext)_localctx).bc = binaryCondition();
				}
				break;
			case 2:
				_localctx = new BooleanTermExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				((BooleanTermExprContext)_localctx).bt = booleanExpressionTerm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryConditionContext extends ParserRuleContext {
		public BinaryConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryCondition; }
	 
		public BinaryConditionContext() { }
		public void copyFrom(BinaryConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExprContext extends BinaryConditionContext {
		public BooleanExpressionTermContext left;
		public BooleanExpressionTermContext right;
		public List<BooleanExpressionTermContext> booleanExpressionTerm() {
			return getRuleContexts(BooleanExpressionTermContext.class);
		}
		public BooleanExpressionTermContext booleanExpressionTerm(int i) {
			return getRuleContext(BooleanExpressionTermContext.class,i);
		}
		public List<BinaryConditionalOperatorContext> binaryConditionalOperator() {
			return getRuleContexts(BinaryConditionalOperatorContext.class);
		}
		public BinaryConditionalOperatorContext binaryConditionalOperator(int i) {
			return getRuleContext(BinaryConditionalOperatorContext.class,i);
		}
		public BinaryExprContext(BinaryConditionContext ctx) { copyFrom(ctx); }
	}

	public final BinaryConditionContext binaryCondition() throws RecognitionException {
		BinaryConditionContext _localctx = new BinaryConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryCondition);
		int _la;
		try {
			_localctx = new BinaryExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((BinaryExprContext)_localctx).left = booleanExpressionTerm();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDOPERATOR || _la==OROPERATOR) {
				{
				{
				setState(195);
				binaryConditionalOperator();
				setState(196);
				((BinaryExprContext)_localctx).right = booleanExpressionTerm();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionTermContext extends ParserRuleContext {
		public BooleanExpressionTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpressionTerm; }
	 
		public BooleanExpressionTermContext() { }
		public void copyFrom(BooleanExpressionTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalTermExprContext extends BooleanExpressionTermContext {
		public RelationalExpressionTermContext rt;
		public RelationalExpressionTermContext relationalExpressionTerm() {
			return getRuleContext(RelationalExpressionTermContext.class,0);
		}
		public RelationalTermExprContext(BooleanExpressionTermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryTermExprContext extends BooleanExpressionTermContext {
		public UnaryConditionContext uc;
		public UnaryConditionContext unaryCondition() {
			return getRuleContext(UnaryConditionContext.class,0);
		}
		public UnaryTermExprContext(BooleanExpressionTermContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionTermContext booleanExpressionTerm() throws RecognitionException {
		BooleanExpressionTermContext _localctx = new BooleanExpressionTermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanExpressionTerm);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASEID:
			case LOWERCASEID:
			case FULLCASEID:
			case STRINGSYMBOL:
			case INTEGERSYMBOL:
			case REALSYMBOL:
			case EMPTYSETSYMBOL:
			case EMPTYTUPLESYMBOL:
			case TRUESYMBOL:
			case FALSESYMBOL:
			case INFINITYSYMBOL:
			case HASH:
			case BEGINSET:
			case BEGINPARENTHESES:
				_localctx = new RelationalTermExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((RelationalTermExprContext)_localctx).rt = relationalExpressionTerm();
				}
				break;
			case NOTOPERATOR:
				_localctx = new UnaryTermExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((UnaryTermExprContext)_localctx).uc = unaryCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryConditionContext extends ParserRuleContext {
		public UnaryConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryCondition; }
	 
		public UnaryConditionContext() { }
		public void copyFrom(UnaryConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryCondExprContext extends UnaryConditionContext {
		public UnaryConditionalOperatorContext op;
		public BooleanExpressionTermContext expr;
		public UnaryConditionalOperatorContext unaryConditionalOperator() {
			return getRuleContext(UnaryConditionalOperatorContext.class,0);
		}
		public BooleanExpressionTermContext booleanExpressionTerm() {
			return getRuleContext(BooleanExpressionTermContext.class,0);
		}
		public UnaryCondExprContext(UnaryConditionContext ctx) { copyFrom(ctx); }
	}

	public final UnaryConditionContext unaryCondition() throws RecognitionException {
		UnaryConditionContext _localctx = new UnaryConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryCondition);
		try {
			_localctx = new UnaryCondExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((UnaryCondExprContext)_localctx).op = unaryConditionalOperator();
			setState(208);
			((UnaryCondExprContext)_localctx).expr = booleanExpressionTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionTermContext extends ParserRuleContext {
		public RelationalExpressionTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpressionTerm; }
	 
		public RelationalExpressionTermContext() { }
		public void copyFrom(RelationalExpressionTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends RelationalExpressionTermContext {
		public BooleanExpressionBasicTermContext left;
		public BinaryRelationalOperatorContext op;
		public BooleanExpressionBasicTermContext right;
		public List<BooleanExpressionBasicTermContext> booleanExpressionBasicTerm() {
			return getRuleContexts(BooleanExpressionBasicTermContext.class);
		}
		public BooleanExpressionBasicTermContext booleanExpressionBasicTerm(int i) {
			return getRuleContext(BooleanExpressionBasicTermContext.class,i);
		}
		public List<BinaryRelationalOperatorContext> binaryRelationalOperator() {
			return getRuleContexts(BinaryRelationalOperatorContext.class);
		}
		public BinaryRelationalOperatorContext binaryRelationalOperator(int i) {
			return getRuleContext(BinaryRelationalOperatorContext.class,i);
		}
		public RelationalExprContext(RelationalExpressionTermContext ctx) { copyFrom(ctx); }
	}

	public final RelationalExpressionTermContext relationalExpressionTerm() throws RecognitionException {
		RelationalExpressionTermContext _localctx = new RelationalExpressionTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relationalExpressionTerm);
		int _la;
		try {
			_localctx = new RelationalExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			((RelationalExprContext)_localctx).left = booleanExpressionBasicTerm();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) {
				{
				{
				setState(211);
				((RelationalExprContext)_localctx).op = binaryRelationalOperator();
				setState(212);
				((RelationalExprContext)_localctx).right = booleanExpressionBasicTerm();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionBasicTermContext extends ParserRuleContext {
		public BooleanExpressionBasicTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpressionBasicTerm; }
	 
		public BooleanExpressionBasicTermContext() { }
		public void copyFrom(BooleanExpressionBasicTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BasicParenthesisExprContext extends BooleanExpressionBasicTermContext {
		public BooleanExpressionResultContext res;
		public BooleanExpressionResultContext booleanExpressionResult() {
			return getRuleContext(BooleanExpressionResultContext.class,0);
		}
		public BasicParenthesisExprContext(BooleanExpressionBasicTermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BasicElementExprContext extends BooleanExpressionBasicTermContext {
		public BooleanExpressionElementContext el;
		public BooleanExpressionElementContext booleanExpressionElement() {
			return getRuleContext(BooleanExpressionElementContext.class,0);
		}
		public BasicElementExprContext(BooleanExpressionBasicTermContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionBasicTermContext booleanExpressionBasicTerm() throws RecognitionException {
		BooleanExpressionBasicTermContext _localctx = new BooleanExpressionBasicTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_booleanExpressionBasicTerm);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BasicElementExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				((BasicElementExprContext)_localctx).el = booleanExpressionElement();
				}
				break;
			case 2:
				_localctx = new BasicParenthesisExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((BasicParenthesisExprContext)_localctx).res = booleanExpressionResult();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionElementContext extends ParserRuleContext {
		public BooleanExpressionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpressionElement; }
	 
		public BooleanExpressionElementContext() { }
		public void copyFrom(BooleanExpressionElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementExprContext extends BooleanExpressionElementContext {
		public ElementContext el;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementExprContext(BooleanExpressionElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementDefinitionExprContext extends BooleanExpressionElementContext {
		public ElementDefinitionContext el;
		public ElementDefinitionContext elementDefinition() {
			return getRuleContext(ElementDefinitionContext.class,0);
		}
		public ElementDefinitionExprContext(BooleanExpressionElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InfinityExprContext extends BooleanExpressionElementContext {
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public InfinityExprContext(BooleanExpressionElementContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionElementContext booleanExpressionElement() throws RecognitionException {
		BooleanExpressionElementContext _localctx = new BooleanExpressionElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanExpressionElement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ElementExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((ElementExprContext)_localctx).el = element();
				}
				break;
			case 2:
				_localctx = new ElementDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				((ElementDefinitionExprContext)_localctx).el = elementDefinition();
				}
				break;
			case 3:
				_localctx = new InfinityExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				infinitySymbol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionResultContext extends ParserRuleContext {
		public BooleanExpressionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpressionResult; }
	 
		public BooleanExpressionResultContext() { }
		public void copyFrom(BooleanExpressionResultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisExprContext extends BooleanExpressionResultContext {
		public BooleanExpressionContext expr;
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ParenthesisExprContext(BooleanExpressionResultContext ctx) { copyFrom(ctx); }
	}

	public final BooleanExpressionResultContext booleanExpressionResult() throws RecognitionException {
		BooleanExpressionResultContext _localctx = new BooleanExpressionResultContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleanExpressionResult);
		try {
			_localctx = new ParenthesisExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BEGINPARENTHESES);
			setState(229);
			((ParenthesisExprContext)_localctx).expr = booleanExpression();
			setState(230);
			match(ENDPARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionExpressionContext extends ParserRuleContext {
		public ActionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionExpression; }
	 
		public ActionExpressionContext() { }
		public void copyFrom(ActionExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionInfinityContext extends ActionExpressionContext {
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public ActionInfinityContext(ActionExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionElementContext extends ActionExpressionContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ActionElementContext(ActionExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionElementDefinitionContext extends ActionExpressionContext {
		public ElementDefinitionContext elementDefinition() {
			return getRuleContext(ElementDefinitionContext.class,0);
		}
		public ActionElementDefinitionContext(ActionExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ActionExpressionContext actionExpression() throws RecognitionException {
		ActionExpressionContext _localctx = new ActionExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_actionExpression);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ActionInfinityContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				infinitySymbol();
				}
				break;
			case 2:
				_localctx = new ActionElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				element();
				}
				break;
			case 3:
				_localctx = new ActionElementDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				elementDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfSymbolContext extends ParserRuleContext {
		public TerminalNode IFSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.IFSYMBOL, 0); }
		public IfSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSymbol; }
	}

	public final IfSymbolContext ifSymbol() throws RecognitionException {
		IfSymbolContext _localctx = new IfSymbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IFSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InOtherCaseSymbolContext extends ParserRuleContext {
		public TerminalNode INOTHERCASESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INOTHERCASESYMBOL, 0); }
		public TerminalNode OTHERWISESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.OTHERWISESYMBOL, 0); }
		public InOtherCaseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOtherCaseSymbol; }
	}

	public final InOtherCaseSymbolContext inOtherCaseSymbol() throws RecognitionException {
		InOtherCaseSymbolContext _localctx = new InOtherCaseSymbolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inOtherCaseSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==INOTHERCASESYMBOL || _la==OTHERWISESYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryConditionalOperatorContext extends ParserRuleContext {
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public UnaryConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryConditionalOperator; }
	}

	public final UnaryConditionalOperatorContext unaryConditionalOperator() throws RecognitionException {
		UnaryConditionalOperatorContext _localctx = new UnaryConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unaryConditionalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			notOperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryConditionalOperatorContext extends ParserRuleContext {
		public AndOperatorContext andOperator() {
			return getRuleContext(AndOperatorContext.class,0);
		}
		public OrOperatorContext orOperator() {
			return getRuleContext(OrOperatorContext.class,0);
		}
		public BinaryConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryConditionalOperator; }
	}

	public final BinaryConditionalOperatorContext binaryConditionalOperator() throws RecognitionException {
		BinaryConditionalOperatorContext _localctx = new BinaryConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binaryConditionalOperator);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANDOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				andOperator();
				}
				break;
			case OROPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				orOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryRelationalOperatorContext extends ParserRuleContext {
		public EqualToOperatorContext equalToOperator() {
			return getRuleContext(EqualToOperatorContext.class,0);
		}
		public NotEqualToOperatorContext notEqualToOperator() {
			return getRuleContext(NotEqualToOperatorContext.class,0);
		}
		public GreaterThanOperatorContext greaterThanOperator() {
			return getRuleContext(GreaterThanOperatorContext.class,0);
		}
		public LessThanOperatorContext lessThanOperator() {
			return getRuleContext(LessThanOperatorContext.class,0);
		}
		public GreaterThanOrEqualToOperatorContext greaterThanOrEqualToOperator() {
			return getRuleContext(GreaterThanOrEqualToOperatorContext.class,0);
		}
		public LessThanOrEqualToOperatorContext lessThanOrEqualToOperator() {
			return getRuleContext(LessThanOrEqualToOperatorContext.class,0);
		}
		public BinaryRelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryRelationalOperator; }
	}

	public final BinaryRelationalOperatorContext binaryRelationalOperator() throws RecognitionException {
		BinaryRelationalOperatorContext _localctx = new BinaryRelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_binaryRelationalOperator);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALTOOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				equalToOperator();
				}
				break;
			case NOTEQUALTOOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				notEqualToOperator();
				}
				break;
			case GREATERTHANOPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				greaterThanOperator();
				}
				break;
			case LESSTHANOPERATOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				lessThanOperator();
				}
				break;
			case GREATERTHANOREQUALTOOPERATOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				greaterThanOrEqualToOperator();
				}
				break;
			case LESSTHANOREQUALTOOPERATOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				lessThanOrEqualToOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOTOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.NOTOPERATOR, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_notOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(NOTOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndOperatorContext extends ParserRuleContext {
		public TerminalNode ANDOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ANDOPERATOR, 0); }
		public AndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOperator; }
	}

	public final AndOperatorContext andOperator() throws RecognitionException {
		AndOperatorContext _localctx = new AndOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_andOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(ANDOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrOperatorContext extends ParserRuleContext {
		public TerminalNode OROPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.OROPERATOR, 0); }
		public OrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOperator; }
	}

	public final OrOperatorContext orOperator() throws RecognitionException {
		OrOperatorContext _localctx = new OrOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(OROPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualToOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EQUALTOOPERATOR, 0); }
		public EqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalToOperator; }
	}

	public final EqualToOperatorContext equalToOperator() throws RecognitionException {
		EqualToOperatorContext _localctx = new EqualToOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equalToOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(EQUALTOOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualToOperatorContext extends ParserRuleContext {
		public TerminalNode NOTEQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.NOTEQUALTOOPERATOR, 0); }
		public NotEqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualToOperator; }
	}

	public final NotEqualToOperatorContext notEqualToOperator() throws RecognitionException {
		NotEqualToOperatorContext _localctx = new NotEqualToOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notEqualToOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(NOTEQUALTOOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOperatorContext extends ParserRuleContext {
		public TerminalNode GREATERTHANOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.GREATERTHANOPERATOR, 0); }
		public GreaterThanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOperator; }
	}

	public final GreaterThanOperatorContext greaterThanOperator() throws RecognitionException {
		GreaterThanOperatorContext _localctx = new GreaterThanOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_greaterThanOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(GREATERTHANOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOperatorContext extends ParserRuleContext {
		public TerminalNode LESSTHANOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LESSTHANOPERATOR, 0); }
		public LessThanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOperator; }
	}

	public final LessThanOperatorContext lessThanOperator() throws RecognitionException {
		LessThanOperatorContext _localctx = new LessThanOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lessThanOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LESSTHANOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOrEqualToOperatorContext extends ParserRuleContext {
		public TerminalNode GREATERTHANOREQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.GREATERTHANOREQUALTOOPERATOR, 0); }
		public GreaterThanOrEqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOrEqualToOperator; }
	}

	public final GreaterThanOrEqualToOperatorContext greaterThanOrEqualToOperator() throws RecognitionException {
		GreaterThanOrEqualToOperatorContext _localctx = new GreaterThanOrEqualToOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_greaterThanOrEqualToOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(GREATERTHANOREQUALTOOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOrEqualToOperatorContext extends ParserRuleContext {
		public TerminalNode LESSTHANOREQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LESSTHANOREQUALTOOPERATOR, 0); }
		public LessThanOrEqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOrEqualToOperator; }
	}

	public final LessThanOrEqualToOperatorContext lessThanOrEqualToOperator() throws RecognitionException {
		LessThanOrEqualToOperatorContext _localctx = new LessThanOrEqualToOperatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lessThanOrEqualToOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LESSTHANOREQUALTOOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelSignatureContext extends ParserRuleContext {
		public ModelSymbolContext modelSymbol() {
			return getRuleContext(ModelSymbolContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public ModelSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSignature; }
	}

	public final ModelSignatureContext modelSignature() throws RecognitionException {
		ModelSignatureContext _localctx = new ModelSignatureContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_modelSignature);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				modelSymbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				modelSymbol();
				setState(275);
				match(BEGINPARENTHESES);
				setState(276);
				parametersList();
				setState(277);
				match(ENDPARENTHESES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModelSymbolContext extends ParserRuleContext {
		public TerminalNode UPPERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.UPPERCASEID, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public TerminalNode FULLCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.FULLCASEID, 0); }
		public ModelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSymbol; }
	}

	public final ModelSymbolContext modelSymbol() throws RecognitionException {
		ModelSymbolContext _localctx = new ModelSymbolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_modelSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.HASH, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(HASH);
			setState(284);
			match(LOWERCASEID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LOWERCASEID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public TerminalNode APOSTROPHE() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.APOSTROPHE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LOWERCASEID);
			setState(289);
			match(APOSTROPHE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableFixedValuesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DatatypeSymbolContext datatypeSymbol() {
			return getRuleContext(DatatypeSymbolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableFixedValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFixedValues; }
	}

	public final VariableFixedValuesContext variableFixedValues() throws RecognitionException {
		VariableFixedValuesContext _localctx = new VariableFixedValuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableFixedValues);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				datatypeSymbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_BOOLEAN_EXPRESSIONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_BOOLEAN_EXPRESSIONParser.COMMA, i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			parameter();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(297);
				match(COMMA);
				setState(298);
				parameter();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatatypeSymbolContext extends ParserRuleContext {
		public TrueSymbolContext trueSymbol() {
			return getRuleContext(TrueSymbolContext.class,0);
		}
		public FalseSymbolContext falseSymbol() {
			return getRuleContext(FalseSymbolContext.class,0);
		}
		public IntegerSymbolContext integerSymbol() {
			return getRuleContext(IntegerSymbolContext.class,0);
		}
		public RealSymbolContext realSymbol() {
			return getRuleContext(RealSymbolContext.class,0);
		}
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public StringSymbolContext stringSymbol() {
			return getRuleContext(StringSymbolContext.class,0);
		}
		public DatatypeSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeSymbol; }
	}

	public final DatatypeSymbolContext datatypeSymbol() throws RecognitionException {
		DatatypeSymbolContext _localctx = new DatatypeSymbolContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_datatypeSymbol);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUESYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				trueSymbol();
				}
				break;
			case FALSESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				falseSymbol();
				}
				break;
			case INTEGERSYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				integerSymbol();
				}
				break;
			case REALSYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				realSymbol();
				}
				break;
			case INFINITYSYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				infinitySymbol();
				}
				break;
			case STRINGSYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				stringSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrueSymbolContext extends ParserRuleContext {
		public TerminalNode TRUESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.TRUESYMBOL, 0); }
		public TrueSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueSymbol; }
	}

	public final TrueSymbolContext trueSymbol() throws RecognitionException {
		TrueSymbolContext _localctx = new TrueSymbolContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_trueSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(TRUESYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FalseSymbolContext extends ParserRuleContext {
		public TerminalNode FALSESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.FALSESYMBOL, 0); }
		public FalseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseSymbol; }
	}

	public final FalseSymbolContext falseSymbol() throws RecognitionException {
		FalseSymbolContext _localctx = new FalseSymbolContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_falseSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(FALSESYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerSymbolContext extends ParserRuleContext {
		public TerminalNode INTEGERSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INTEGERSYMBOL, 0); }
		public IntegerSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSymbol; }
	}

	public final IntegerSymbolContext integerSymbol() throws RecognitionException {
		IntegerSymbolContext _localctx = new IntegerSymbolContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_integerSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(INTEGERSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealSymbolContext extends ParserRuleContext {
		public TerminalNode REALSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.REALSYMBOL, 0); }
		public RealSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realSymbol; }
	}

	public final RealSymbolContext realSymbol() throws RecognitionException {
		RealSymbolContext _localctx = new RealSymbolContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_realSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(REALSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InfinitySymbolContext extends ParserRuleContext {
		public TerminalNode INFINITYSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INFINITYSYMBOL, 0); }
		public InfinitySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitySymbol; }
	}

	public final InfinitySymbolContext infinitySymbol() throws RecognitionException {
		InfinitySymbolContext _localctx = new InfinitySymbolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_infinitySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(INFINITYSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringSymbolContext extends ParserRuleContext {
		public TerminalNode STRINGSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.STRINGSYMBOL, 0); }
		public StringSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSymbol; }
	}

	public final StringSymbolContext stringSymbol() throws RecognitionException {
		StringSymbolContext _localctx = new StringSymbolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_stringSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(STRINGSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	 
		public SetContext() { }
		public void copyFrom(SetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetExplicitDefinitionExprContext extends SetContext {
		public SetExplicitDefinitionContext se;
		public SetExplicitDefinitionContext setExplicitDefinition() {
			return getRuleContext(SetExplicitDefinitionContext.class,0);
		}
		public SetExplicitDefinitionExprContext(SetContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetImplicitDefinitionExprContext extends SetContext {
		public SetImplicitDefinitionContext si;
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public SetImplicitDefinitionExprContext(SetContext ctx) { copyFrom(ctx); }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_set);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new SetImplicitDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				((SetImplicitDefinitionExprContext)_localctx).si = setImplicitDefinition();
				}
				break;
			case 2:
				_localctx = new SetExplicitDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				((SetExplicitDefinitionExprContext)_localctx).se = setExplicitDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetImplicitDefinitionContext extends ParserRuleContext {
		public SetImplicitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setImplicitDefinition; }
	 
		public SetImplicitDefinitionContext() { }
		public void copyFrom(SetImplicitDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationResultExprContext extends SetImplicitDefinitionContext {
		public SetOperationResultContext sr;
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public SetOperationResultExprContext(SetImplicitDefinitionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetDefinitionExprContext extends SetImplicitDefinitionContext {
		public SetDefinitionContext sd;
		public SetDefinitionContext setDefinition() {
			return getRuleContext(SetDefinitionContext.class,0);
		}
		public SetDefinitionExprContext(SetImplicitDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final SetImplicitDefinitionContext setImplicitDefinition() throws RecognitionException {
		SetImplicitDefinitionContext _localctx = new SetImplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_setImplicitDefinition);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new SetDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				((SetDefinitionExprContext)_localctx).sd = setDefinition();
				}
				break;
			case 2:
				_localctx = new SetOperationResultExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				((SetOperationResultExprContext)_localctx).sr = setOperationResult();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetExplicitDefinitionContext extends ParserRuleContext {
		public SetExplicitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExplicitDefinition; }
	 
		public SetExplicitDefinitionContext() { }
		public void copyFrom(SetExplicitDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetAssignmentExprContext extends SetExplicitDefinitionContext {
		public SetSymbolContext s;
		public SetImplicitDefinitionContext rhs;
		public TerminalNode EQUAL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EQUAL, 0); }
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public SetAssignmentExprContext(SetExplicitDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final SetExplicitDefinitionContext setExplicitDefinition() throws RecognitionException {
		SetExplicitDefinitionContext _localctx = new SetExplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_setExplicitDefinition);
		try {
			_localctx = new SetAssignmentExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			((SetAssignmentExprContext)_localctx).s = setSymbol();
			setState(333);
			match(EQUAL);
			setState(334);
			((SetAssignmentExprContext)_localctx).rhs = setImplicitDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetDefinitionContext extends ParserRuleContext {
		public SetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDefinition; }
	 
		public SetDefinitionContext() { }
		public void copyFrom(SetDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementCollectionExprContext extends SetDefinitionContext {
		public ElementCollectionContext ec;
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public ElementCollectionExprContext(SetDefinitionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleCollectionExprContext extends SetDefinitionContext {
		public TupleCollectionContext tc;
		public TupleCollectionContext tupleCollection() {
			return getRuleContext(TupleCollectionContext.class,0);
		}
		public TupleCollectionExprContext(SetDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final SetDefinitionContext setDefinition() throws RecognitionException {
		SetDefinitionContext _localctx = new SetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_setDefinition);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ElementCollectionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				((ElementCollectionExprContext)_localctx).ec = elementCollection();
				}
				break;
			case 2:
				_localctx = new TupleCollectionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				((TupleCollectionExprContext)_localctx).tc = tupleCollection();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetSymbolContext extends ParserRuleContext {
		public SetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSymbol; }
	 
		public SetSymbolContext() { }
		public void copyFrom(SetSymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealSetSymbolExprContext extends SetSymbolContext {
		public SetOfRealNumbersSymbolContext r;
		public SetOfRealNumbersSymbolContext setOfRealNumbersSymbol() {
			return getRuleContext(SetOfRealNumbersSymbolContext.class,0);
		}
		public RealSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanSetSymbolExprContext extends SetSymbolContext {
		public SetOfBooleanAlgebraSymbolContext b;
		public SetOfBooleanAlgebraSymbolContext setOfBooleanAlgebraSymbol() {
			return getRuleContext(SetOfBooleanAlgebraSymbolContext.class,0);
		}
		public BooleanSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerSetSymbolExprContext extends SetSymbolContext {
		public SetOfIntegerNumbersSymbolContext z;
		public SetOfIntegerNumbersSymbolContext setOfIntegerNumbersSymbol() {
			return getRuleContext(SetOfIntegerNumbersSymbolContext.class,0);
		}
		public IntegerSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetNameSymbolExprContext extends SetSymbolContext {
		public SetNameContext n;
		public SetNameContext setName() {
			return getRuleContext(SetNameContext.class,0);
		}
		public SetNameSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NaturalSetSymbolExprContext extends SetSymbolContext {
		public SetOfNaturalNumbersSymbolContext nn;
		public SetOfNaturalNumbersSymbolContext setOfNaturalNumbersSymbol() {
			return getRuleContext(SetOfNaturalNumbersSymbolContext.class,0);
		}
		public NaturalSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
	}

	public final SetSymbolContext setSymbol() throws RecognitionException {
		SetSymbolContext _localctx = new SetSymbolContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_setSymbol);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASEID:
				_localctx = new SetNameSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				((SetNameSymbolExprContext)_localctx).n = setName();
				}
				break;
			case SETZSYMBOL:
				_localctx = new IntegerSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				((IntegerSetSymbolExprContext)_localctx).z = setOfIntegerNumbersSymbol();
				}
				break;
			case SETNSYMBOL:
				_localctx = new NaturalSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				((NaturalSetSymbolExprContext)_localctx).nn = setOfNaturalNumbersSymbol();
				}
				break;
			case SETRSYMBOL:
				_localctx = new RealSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				((RealSetSymbolExprContext)_localctx).r = setOfRealNumbersSymbol();
				}
				break;
			case SETBSYMBOL:
				_localctx = new BooleanSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				((BooleanSetSymbolExprContext)_localctx).b = setOfBooleanAlgebraSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetNameContext extends ParserRuleContext {
		public TerminalNode UPPERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.UPPERCASEID, 0); }
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
	}

	public final SetNameContext setName() throws RecognitionException {
		SetNameContext _localctx = new SetNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_setName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(UPPERCASEID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfIntegerNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETZSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETZSYMBOL, 0); }
		public SetOfIntegerNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfIntegerNumbersSymbol; }
	}

	public final SetOfIntegerNumbersSymbolContext setOfIntegerNumbersSymbol() throws RecognitionException {
		SetOfIntegerNumbersSymbolContext _localctx = new SetOfIntegerNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_setOfIntegerNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(SETZSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfNaturalNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETNSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETNSYMBOL, 0); }
		public SetOfNaturalNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfNaturalNumbersSymbol; }
	}

	public final SetOfNaturalNumbersSymbolContext setOfNaturalNumbersSymbol() throws RecognitionException {
		SetOfNaturalNumbersSymbolContext _localctx = new SetOfNaturalNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_setOfNaturalNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(SETNSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfRealNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETRSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETRSYMBOL, 0); }
		public SetOfRealNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfRealNumbersSymbol; }
	}

	public final SetOfRealNumbersSymbolContext setOfRealNumbersSymbol() throws RecognitionException {
		SetOfRealNumbersSymbolContext _localctx = new SetOfRealNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_setOfRealNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(SETRSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfBooleanAlgebraSymbolContext extends ParserRuleContext {
		public TerminalNode SETBSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETBSYMBOL, 0); }
		public SetOfBooleanAlgebraSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfBooleanAlgebraSymbol; }
	}

	public final SetOfBooleanAlgebraSymbolContext setOfBooleanAlgebraSymbol() throws RecognitionException {
		SetOfBooleanAlgebraSymbolContext _localctx = new SetOfBooleanAlgebraSymbolContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_setOfBooleanAlgebraSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(SETBSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementCollectionContext extends ParserRuleContext {
		public ElementCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCollection; }
	 
		public ElementCollectionContext() { }
		public void copyFrom(ElementCollectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptySetExprContext extends ElementCollectionContext {
		public EmptySetSymbolContext es;
		public EmptySetSymbolContext emptySetSymbol() {
			return getRuleContext(EmptySetSymbolContext.class,0);
		}
		public EmptySetExprContext(ElementCollectionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementListExprContext extends ElementCollectionContext {
		public ElementContext e1;
		public ElementContext element;
		public List<ElementContext> e2 = new ArrayList<ElementContext>();
		public TerminalNode BEGINSET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINSET, 0); }
		public TerminalNode ENDSET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDSET, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_BOOLEAN_EXPRESSIONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_BOOLEAN_EXPRESSIONParser.COMMA, i);
		}
		public ElementListExprContext(ElementCollectionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementSuchThatExprContext extends ElementCollectionContext {
		public ElementContext e;
		public ElementDefinitionContext def;
		public TerminalNode BEGINSET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINSET, 0); }
		public TerminalNode SUCHTHAT() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SUCHTHAT, 0); }
		public TerminalNode ENDSET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDSET, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementDefinitionContext elementDefinition() {
			return getRuleContext(ElementDefinitionContext.class,0);
		}
		public ElementSuchThatExprContext(ElementCollectionContext ctx) { copyFrom(ctx); }
	}

	public final ElementCollectionContext elementCollection() throws RecognitionException {
		ElementCollectionContext _localctx = new ElementCollectionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_elementCollection);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ElementListExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(BEGINSET);
				setState(358);
				((ElementListExprContext)_localctx).e1 = element();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(359);
					match(COMMA);
					setState(360);
					((ElementListExprContext)_localctx).element = element();
					((ElementListExprContext)_localctx).e2.add(((ElementListExprContext)_localctx).element);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(ENDSET);
				}
				break;
			case 2:
				_localctx = new ElementSuchThatExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(BEGINSET);
				setState(369);
				((ElementSuchThatExprContext)_localctx).e = element();
				setState(370);
				match(SUCHTHAT);
				setState(371);
				((ElementSuchThatExprContext)_localctx).def = elementDefinition();
				setState(372);
				match(ENDSET);
				}
				break;
			case 3:
				_localctx = new EmptySetExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				((EmptySetExprContext)_localctx).es = emptySetSymbol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementNumberContext extends ElementContext {
		public NumberSymbolContext num;
		public NumberSymbolContext numberSymbol() {
			return getRuleContext(NumberSymbolContext.class,0);
		}
		public ElementNumberContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementIdentifierContext extends ElementContext {
		public IdentifierContext id;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementIdentifierContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementBooleanContext extends ElementContext {
		public BooleanSymbolContext bool;
		public BooleanSymbolContext booleanSymbol() {
			return getRuleContext(BooleanSymbolContext.class,0);
		}
		public ElementBooleanContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementTupleContext extends ElementContext {
		public TupleContext tup;
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ElementTupleContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementParameterContext extends ElementContext {
		public ParameterContext par;
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ElementParameterContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementModelSignatureContext extends ElementContext {
		public ModelSignatureContext sig;
		public ModelSignatureContext modelSignature() {
			return getRuleContext(ModelSignatureContext.class,0);
		}
		public ElementModelSignatureContext(ElementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementStringContext extends ElementContext {
		public StringSymbolContext str;
		public StringSymbolContext stringSymbol() {
			return getRuleContext(StringSymbolContext.class,0);
		}
		public ElementStringContext(ElementContext ctx) { copyFrom(ctx); }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_element);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ElementIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				((ElementIdentifierContext)_localctx).id = identifier();
				}
				break;
			case 2:
				_localctx = new ElementNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				((ElementNumberContext)_localctx).num = numberSymbol();
				}
				break;
			case 3:
				_localctx = new ElementBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				((ElementBooleanContext)_localctx).bool = booleanSymbol();
				}
				break;
			case 4:
				_localctx = new ElementModelSignatureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				((ElementModelSignatureContext)_localctx).sig = modelSignature();
				}
				break;
			case 5:
				_localctx = new ElementStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				((ElementStringContext)_localctx).str = stringSymbol();
				}
				break;
			case 6:
				_localctx = new ElementTupleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(382);
				((ElementTupleContext)_localctx).tup = tuple();
				}
				break;
			case 7:
				_localctx = new ElementParameterContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(383);
				((ElementParameterContext)_localctx).par = parameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleCollectionContext extends ParserRuleContext {
		public TupleCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleCollection; }
	 
		public TupleCollectionContext() { }
		public void copyFrom(TupleCollectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleSuchThatExprContext extends TupleCollectionContext {
		public TupleContext t;
		public TupleDefinitionContext td;
		public TerminalNode BEGINSET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINSET, 0); }
		public TerminalNode SUCHTHAT() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SUCHTHAT, 0); }
		public TerminalNode ENDSET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDSET, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public TupleDefinitionContext tupleDefinition() {
			return getRuleContext(TupleDefinitionContext.class,0);
		}
		public TupleSuchThatExprContext(TupleCollectionContext ctx) { copyFrom(ctx); }
	}

	public final TupleCollectionContext tupleCollection() throws RecognitionException {
		TupleCollectionContext _localctx = new TupleCollectionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_tupleCollection);
		try {
			_localctx = new TupleSuchThatExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(BEGINSET);
			setState(387);
			((TupleSuchThatExprContext)_localctx).t = tuple();
			setState(388);
			match(SUCHTHAT);
			setState(389);
			((TupleSuchThatExprContext)_localctx).td = tupleDefinition();
			setState(390);
			match(ENDSET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
	 
		public TupleContext() { }
		public void copyFrom(TupleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleExprContext extends TupleContext {
		public ElementContext e1;
		public ElementContext element;
		public List<ElementContext> e2 = new ArrayList<ElementContext>();
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_BOOLEAN_EXPRESSIONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_BOOLEAN_EXPRESSIONParser.COMMA, i);
		}
		public TupleExprContext(TupleContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyTupleExprContext extends TupleContext {
		public EmptyTupleSymbolContext et;
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public EmptyTupleExprContext(TupleContext ctx) { copyFrom(ctx); }
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tuple);
		int _la;
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				_localctx = new TupleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(BEGINPARENTHESES);
				setState(393);
				((TupleExprContext)_localctx).e1 = element();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(394);
					match(COMMA);
					setState(395);
					((TupleExprContext)_localctx).element = element();
					((TupleExprContext)_localctx).e2.add(((TupleExprContext)_localctx).element);
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
				match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				_localctx = new EmptyTupleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				((EmptyTupleExprContext)_localctx).et = emptyTupleSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableTupleContext extends ParserRuleContext {
		public VariableTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTuple; }
	 
		public VariableTupleContext() { }
		public void copyFrom(VariableTupleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableTupleExprContext extends VariableTupleContext {
		public VariableContext v1;
		public VariableContext variable;
		public List<VariableContext> v2 = new ArrayList<VariableContext>();
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_BOOLEAN_EXPRESSIONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_BOOLEAN_EXPRESSIONParser.COMMA, i);
		}
		public VariableTupleExprContext(VariableTupleContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyVariableTupleExprContext extends VariableTupleContext {
		public EmptyTupleSymbolContext et;
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public EmptyVariableTupleExprContext(VariableTupleContext ctx) { copyFrom(ctx); }
	}

	public final VariableTupleContext variableTuple() throws RecognitionException {
		VariableTupleContext _localctx = new VariableTupleContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableTuple);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				_localctx = new VariableTupleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(BEGINPARENTHESES);
				setState(407);
				((VariableTupleExprContext)_localctx).v1 = variable();
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(408);
					match(COMMA);
					setState(409);
					((VariableTupleExprContext)_localctx).variable = variable();
					((VariableTupleExprContext)_localctx).v2.add(((VariableTupleExprContext)_localctx).variable);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				_localctx = new EmptyVariableTupleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				((EmptyVariableTupleExprContext)_localctx).et = emptyTupleSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableTupleFixedValuesContext extends ParserRuleContext {
		public VariableTupleFixedValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTupleFixedValues; }
	 
		public VariableTupleFixedValuesContext() { }
		public void copyFrom(VariableTupleFixedValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyVariableTupleFixedValuesExprContext extends VariableTupleFixedValuesContext {
		public EmptyTupleSymbolContext et;
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public EmptyVariableTupleFixedValuesExprContext(VariableTupleFixedValuesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableTupleFixedValuesExprContext extends VariableTupleFixedValuesContext {
		public VariableFixedValuesContext vfv1;
		public VariableFixedValuesContext variableFixedValues;
		public List<VariableFixedValuesContext> vfv2 = new ArrayList<VariableFixedValuesContext>();
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public List<VariableFixedValuesContext> variableFixedValues() {
			return getRuleContexts(VariableFixedValuesContext.class);
		}
		public VariableFixedValuesContext variableFixedValues(int i) {
			return getRuleContext(VariableFixedValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_BOOLEAN_EXPRESSIONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_BOOLEAN_EXPRESSIONParser.COMMA, i);
		}
		public VariableTupleFixedValuesExprContext(VariableTupleFixedValuesContext ctx) { copyFrom(ctx); }
	}

	public final VariableTupleFixedValuesContext variableTupleFixedValues() throws RecognitionException {
		VariableTupleFixedValuesContext _localctx = new VariableTupleFixedValuesContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableTupleFixedValues);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				_localctx = new VariableTupleFixedValuesExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(BEGINPARENTHESES);
				setState(421);
				((VariableTupleFixedValuesExprContext)_localctx).vfv1 = variableFixedValues();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(422);
					match(COMMA);
					setState(423);
					((VariableTupleFixedValuesExprContext)_localctx).variableFixedValues = variableFixedValues();
					((VariableTupleFixedValuesExprContext)_localctx).vfv2.add(((VariableTupleFixedValuesExprContext)_localctx).variableFixedValues);
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
				match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				_localctx = new EmptyVariableTupleFixedValuesExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				((EmptyVariableTupleFixedValuesExprContext)_localctx).et = emptyTupleSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleDefinitionContext extends ParserRuleContext {
		public TupleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleDefinition; }
	 
		public TupleDefinitionContext() { }
		public void copyFrom(TupleDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleDefinitionExprContext extends TupleDefinitionContext {
		public ElementDefinitionContext ed1;
		public ElementDefinitionContext elementDefinition;
		public List<ElementDefinitionContext> ed2 = new ArrayList<ElementDefinitionContext>();
		public List<ElementDefinitionContext> elementDefinition() {
			return getRuleContexts(ElementDefinitionContext.class);
		}
		public ElementDefinitionContext elementDefinition(int i) {
			return getRuleContext(ElementDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_BOOLEAN_EXPRESSIONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_BOOLEAN_EXPRESSIONParser.COMMA, i);
		}
		public List<TerminalNode> ANDOPERATOR() { return getTokens(CFG_BOOLEAN_EXPRESSIONParser.ANDOPERATOR); }
		public TerminalNode ANDOPERATOR(int i) {
			return getToken(CFG_BOOLEAN_EXPRESSIONParser.ANDOPERATOR, i);
		}
		public TupleDefinitionExprContext(TupleDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final TupleDefinitionContext tupleDefinition() throws RecognitionException {
		TupleDefinitionContext _localctx = new TupleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tupleDefinition);
		int _la;
		try {
			_localctx = new TupleDefinitionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			((TupleDefinitionExprContext)_localctx).ed1 = elementDefinition();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDOPERATOR || _la==COMMA) {
				{
				{
				setState(435);
				_la = _input.LA(1);
				if ( !(_la==ANDOPERATOR || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(436);
				((TupleDefinitionExprContext)_localctx).elementDefinition = elementDefinition();
				((TupleDefinitionExprContext)_localctx).ed2.add(((TupleDefinitionExprContext)_localctx).elementDefinition);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementDefinitionContext extends ParserRuleContext {
		public ElementDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDefinition; }
	 
		public ElementDefinitionContext() { }
		public void copyFrom(ElementDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementDefSetSymbolExprContext extends ElementDefinitionContext {
		public DefinitionWithSetSymbolContext d2;
		public DefinitionWithSetSymbolContext definitionWithSetSymbol() {
			return getRuleContext(DefinitionWithSetSymbolContext.class,0);
		}
		public ElementDefSetSymbolExprContext(ElementDefinitionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementDefImplicitSetExprContext extends ElementDefinitionContext {
		public DefinitionWithSetImplicitDefinitionContext d1;
		public DefinitionWithSetImplicitDefinitionContext definitionWithSetImplicitDefinition() {
			return getRuleContext(DefinitionWithSetImplicitDefinitionContext.class,0);
		}
		public ElementDefImplicitSetExprContext(ElementDefinitionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementDefRangeExprContext extends ElementDefinitionContext {
		public DefinitionWithRangeContext d3;
		public DefinitionWithRangeContext definitionWithRange() {
			return getRuleContext(DefinitionWithRangeContext.class,0);
		}
		public ElementDefRangeExprContext(ElementDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final ElementDefinitionContext elementDefinition() throws RecognitionException {
		ElementDefinitionContext _localctx = new ElementDefinitionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementDefinition);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new ElementDefImplicitSetExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				((ElementDefImplicitSetExprContext)_localctx).d1 = definitionWithSetImplicitDefinition();
				}
				break;
			case 2:
				_localctx = new ElementDefSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				((ElementDefSetSymbolExprContext)_localctx).d2 = definitionWithSetSymbol();
				}
				break;
			case 3:
				_localctx = new ElementDefRangeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				((ElementDefRangeExprContext)_localctx).d3 = definitionWithRange();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionWithSetImplicitDefinitionContext extends ParserRuleContext {
		public DefinitionWithSetImplicitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionWithSetImplicitDefinition; }
	 
		public DefinitionWithSetImplicitDefinitionContext() { }
		public void copyFrom(DefinitionWithSetImplicitDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefCollectionWithImplicitSetExprContext extends DefinitionWithSetImplicitDefinitionContext {
		public ElementCollectionContext ec;
		public BelongsToOperatorContext op;
		public SetImplicitDefinitionContext s;
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public DefCollectionWithImplicitSetExprContext(DefinitionWithSetImplicitDefinitionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefWithImplicitSetExprContext extends DefinitionWithSetImplicitDefinitionContext {
		public ElementContext e;
		public BelongsToOperatorContext op;
		public SetImplicitDefinitionContext s;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public DefWithImplicitSetExprContext(DefinitionWithSetImplicitDefinitionContext ctx) { copyFrom(ctx); }
	}

	public final DefinitionWithSetImplicitDefinitionContext definitionWithSetImplicitDefinition() throws RecognitionException {
		DefinitionWithSetImplicitDefinitionContext _localctx = new DefinitionWithSetImplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_definitionWithSetImplicitDefinition);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASEID:
			case LOWERCASEID:
			case FULLCASEID:
			case STRINGSYMBOL:
			case INTEGERSYMBOL:
			case REALSYMBOL:
			case EMPTYTUPLESYMBOL:
			case TRUESYMBOL:
			case FALSESYMBOL:
			case HASH:
			case BEGINPARENTHESES:
				_localctx = new DefWithImplicitSetExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				((DefWithImplicitSetExprContext)_localctx).e = element();
				setState(448);
				((DefWithImplicitSetExprContext)_localctx).op = belongsToOperator();
				setState(449);
				((DefWithImplicitSetExprContext)_localctx).s = setImplicitDefinition();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new DefCollectionWithImplicitSetExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				((DefCollectionWithImplicitSetExprContext)_localctx).ec = elementCollection();
				setState(452);
				((DefCollectionWithImplicitSetExprContext)_localctx).op = belongsToOperator();
				setState(453);
				((DefCollectionWithImplicitSetExprContext)_localctx).s = setImplicitDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionWithSetSymbolContext extends ParserRuleContext {
		public DefinitionWithSetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionWithSetSymbol; }
	 
		public DefinitionWithSetSymbolContext() { }
		public void copyFrom(DefinitionWithSetSymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefCollectionWithSymbolSetExprContext extends DefinitionWithSetSymbolContext {
		public ElementCollectionContext ec;
		public BelongsToOperatorContext op;
		public SetSymbolContext s;
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public DefCollectionWithSymbolSetExprContext(DefinitionWithSetSymbolContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefWithSymbolSetExprContext extends DefinitionWithSetSymbolContext {
		public ElementContext e;
		public BelongsToOperatorContext op;
		public SetSymbolContext s;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public DefWithSymbolSetExprContext(DefinitionWithSetSymbolContext ctx) { copyFrom(ctx); }
	}

	public final DefinitionWithSetSymbolContext definitionWithSetSymbol() throws RecognitionException {
		DefinitionWithSetSymbolContext _localctx = new DefinitionWithSetSymbolContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_definitionWithSetSymbol);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASEID:
			case LOWERCASEID:
			case FULLCASEID:
			case STRINGSYMBOL:
			case INTEGERSYMBOL:
			case REALSYMBOL:
			case EMPTYTUPLESYMBOL:
			case TRUESYMBOL:
			case FALSESYMBOL:
			case HASH:
			case BEGINPARENTHESES:
				_localctx = new DefWithSymbolSetExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				((DefWithSymbolSetExprContext)_localctx).e = element();
				setState(458);
				((DefWithSymbolSetExprContext)_localctx).op = belongsToOperator();
				setState(459);
				((DefWithSymbolSetExprContext)_localctx).s = setSymbol();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new DefCollectionWithSymbolSetExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				((DefCollectionWithSymbolSetExprContext)_localctx).ec = elementCollection();
				setState(462);
				((DefCollectionWithSymbolSetExprContext)_localctx).op = belongsToOperator();
				setState(463);
				((DefCollectionWithSymbolSetExprContext)_localctx).s = setSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionWithRangeContext extends ParserRuleContext {
		public DefinitionWithRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionWithRange; }
	 
		public DefinitionWithRangeContext() { }
		public void copyFrom(DefinitionWithRangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefWithRangeExprContext extends DefinitionWithRangeContext {
		public ElementContext e;
		public BelongsToOperatorContext op;
		public RangeContext r;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public DefWithRangeExprContext(DefinitionWithRangeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefCollectionWithRangeExprContext extends DefinitionWithRangeContext {
		public ElementCollectionContext ec;
		public BelongsToOperatorContext op;
		public RangeContext r;
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public DefCollectionWithRangeExprContext(DefinitionWithRangeContext ctx) { copyFrom(ctx); }
	}

	public final DefinitionWithRangeContext definitionWithRange() throws RecognitionException {
		DefinitionWithRangeContext _localctx = new DefinitionWithRangeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_definitionWithRange);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASEID:
			case LOWERCASEID:
			case FULLCASEID:
			case STRINGSYMBOL:
			case INTEGERSYMBOL:
			case REALSYMBOL:
			case EMPTYTUPLESYMBOL:
			case TRUESYMBOL:
			case FALSESYMBOL:
			case HASH:
			case BEGINPARENTHESES:
				_localctx = new DefWithRangeExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				((DefWithRangeExprContext)_localctx).e = element();
				setState(468);
				((DefWithRangeExprContext)_localctx).op = belongsToOperator();
				setState(469);
				((DefWithRangeExprContext)_localctx).r = range();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new DefCollectionWithRangeExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				((DefCollectionWithRangeExprContext)_localctx).ec = elementCollection();
				setState(472);
				((DefCollectionWithRangeExprContext)_localctx).op = belongsToOperator();
				setState(473);
				((DefCollectionWithRangeExprContext)_localctx).r = range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	 
		public RangeContext() { }
		public void copyFrom(RangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeExprContext extends RangeContext {
		public NumberSymbolContext n1;
		public NumberSymbolContext n2n;
		public InfinitySymbolContext n2i;
		public TerminalNode COMMA() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.COMMA, 0); }
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode BEGINBRACKET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINBRACKET, 0); }
		public List<NumberSymbolContext> numberSymbol() {
			return getRuleContexts(NumberSymbolContext.class);
		}
		public NumberSymbolContext numberSymbol(int i) {
			return getRuleContext(NumberSymbolContext.class,i);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public TerminalNode ENDBRACKET() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDBRACKET, 0); }
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public RangeExprContext(RangeContext ctx) { copyFrom(ctx); }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_range);
		int _la;
		try {
			_localctx = new RangeExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==BEGINBRACKET || _la==BEGINPARENTHESES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(478);
			((RangeExprContext)_localctx).n1 = numberSymbol();
			setState(479);
			match(COMMA);
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERSYMBOL:
			case REALSYMBOL:
				{
				setState(480);
				((RangeExprContext)_localctx).n2n = numberSymbol();
				}
				break;
			case INFINITYSYMBOL:
				{
				setState(481);
				((RangeExprContext)_localctx).n2i = infinitySymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(484);
			_la = _input.LA(1);
			if ( !(_la==ENDBRACKET || _la==ENDPARENTHESES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanSymbolContext extends ParserRuleContext {
		public BooleanSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSymbol; }
	 
		public BooleanSymbolContext() { }
		public void copyFrom(BooleanSymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueExprContext extends BooleanSymbolContext {
		public TrueSymbolContext t;
		public TrueSymbolContext trueSymbol() {
			return getRuleContext(TrueSymbolContext.class,0);
		}
		public TrueExprContext(BooleanSymbolContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseExprContext extends BooleanSymbolContext {
		public FalseSymbolContext f;
		public FalseSymbolContext falseSymbol() {
			return getRuleContext(FalseSymbolContext.class,0);
		}
		public FalseExprContext(BooleanSymbolContext ctx) { copyFrom(ctx); }
	}

	public final BooleanSymbolContext booleanSymbol() throws RecognitionException {
		BooleanSymbolContext _localctx = new BooleanSymbolContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_booleanSymbol);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUESYMBOL:
				_localctx = new TrueExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				((TrueExprContext)_localctx).t = trueSymbol();
				}
				break;
			case FALSESYMBOL:
				_localctx = new FalseExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				((FalseExprContext)_localctx).f = falseSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberSymbolContext extends ParserRuleContext {
		public NumberSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberSymbol; }
	 
		public NumberSymbolContext() { }
		public void copyFrom(NumberSymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerExprContext extends NumberSymbolContext {
		public IntegerSymbolContext i;
		public IntegerSymbolContext integerSymbol() {
			return getRuleContext(IntegerSymbolContext.class,0);
		}
		public IntegerExprContext(NumberSymbolContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealExprContext extends NumberSymbolContext {
		public RealSymbolContext r;
		public RealSymbolContext realSymbol() {
			return getRuleContext(RealSymbolContext.class,0);
		}
		public RealExprContext(NumberSymbolContext ctx) { copyFrom(ctx); }
	}

	public final NumberSymbolContext numberSymbol() throws RecognitionException {
		NumberSymbolContext _localctx = new NumberSymbolContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_numberSymbol);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERSYMBOL:
				_localctx = new IntegerExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				((IntegerExprContext)_localctx).i = integerSymbol();
				}
				break;
			case REALSYMBOL:
				_localctx = new RealExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				((RealExprContext)_localctx).r = realSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptySetSymbolContext extends ParserRuleContext {
		public TerminalNode EMPTYSETSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EMPTYSETSYMBOL, 0); }
		public EmptySetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptySetSymbol; }
	}

	public final EmptySetSymbolContext emptySetSymbol() throws RecognitionException {
		EmptySetSymbolContext _localctx = new EmptySetSymbolContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_emptySetSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(EMPTYSETSYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyTupleSymbolContext extends ParserRuleContext {
		public TerminalNode EMPTYTUPLESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EMPTYTUPLESYMBOL, 0); }
		public EmptyTupleSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyTupleSymbol; }
	}

	public final EmptyTupleSymbolContext emptyTupleSymbol() throws RecognitionException {
		EmptyTupleSymbolContext _localctx = new EmptyTupleSymbolContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_emptyTupleSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(EMPTYTUPLESYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationResultContext extends ParserRuleContext {
		public SetOperationResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperationResult; }
	 
		public SetOperationResultContext() { }
		public void copyFrom(SetOperationResultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationExprContext extends SetOperationResultContext {
		public SetOperationTermContext left;
		public SetOperatorContext setOperator;
		public List<SetOperatorContext> op = new ArrayList<SetOperatorContext>();
		public SetOperationTermContext setOperationTerm;
		public List<SetOperationTermContext> right = new ArrayList<SetOperationTermContext>();
		public List<SetOperationTermContext> setOperationTerm() {
			return getRuleContexts(SetOperationTermContext.class);
		}
		public SetOperationTermContext setOperationTerm(int i) {
			return getRuleContext(SetOperationTermContext.class,i);
		}
		public List<SetOperatorContext> setOperator() {
			return getRuleContexts(SetOperatorContext.class);
		}
		public SetOperatorContext setOperator(int i) {
			return getRuleContext(SetOperatorContext.class,i);
		}
		public SetOperationExprContext(SetOperationResultContext ctx) { copyFrom(ctx); }
	}

	public final SetOperationResultContext setOperationResult() throws RecognitionException {
		SetOperationResultContext _localctx = new SetOperationResultContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_setOperationResult);
		int _la;
		try {
			_localctx = new SetOperationExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			((SetOperationExprContext)_localctx).left = setOperationTerm();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) {
				{
				{
				setState(499);
				((SetOperationExprContext)_localctx).setOperator = setOperator();
				((SetOperationExprContext)_localctx).op.add(((SetOperationExprContext)_localctx).setOperator);
				setState(500);
				((SetOperationExprContext)_localctx).setOperationTerm = setOperationTerm();
				((SetOperationExprContext)_localctx).right.add(((SetOperationExprContext)_localctx).setOperationTerm);
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationTermContext extends ParserRuleContext {
		public SetOperationTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperationTerm; }
	 
		public SetOperationTermContext() { }
		public void copyFrom(SetOperationTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationSetExprContext extends SetOperationTermContext {
		public OperationSetContext s1;
		public OperationSetContext operationSet() {
			return getRuleContext(OperationSetContext.class,0);
		}
		public OperationSetExprContext(SetOperationTermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationParExprContext extends SetOperationTermContext {
		public SetOperationExpressionContext par;
		public SetOperationExpressionContext setOperationExpression() {
			return getRuleContext(SetOperationExpressionContext.class,0);
		}
		public SetOperationParExprContext(SetOperationTermContext ctx) { copyFrom(ctx); }
	}

	public final SetOperationTermContext setOperationTerm() throws RecognitionException {
		SetOperationTermContext _localctx = new SetOperationTermContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_setOperationTerm);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASEID:
			case EMPTYSETSYMBOL:
			case SETZSYMBOL:
			case SETNSYMBOL:
			case SETRSYMBOL:
			case SETBSYMBOL:
			case BEGINSET:
				_localctx = new OperationSetExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				((OperationSetExprContext)_localctx).s1 = operationSet();
				}
				break;
			case BEGINPARENTHESES:
				_localctx = new SetOperationParExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				((SetOperationParExprContext)_localctx).par = setOperationExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationExpressionContext extends ParserRuleContext {
		public SetOperationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperationExpression; }
	 
		public SetOperationExpressionContext() { }
		public void copyFrom(SetOperationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetOperationParenthesisExprContext extends SetOperationExpressionContext {
		public SetOperationResultContext expr;
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public SetOperationParenthesisExprContext(SetOperationExpressionContext ctx) { copyFrom(ctx); }
	}

	public final SetOperationExpressionContext setOperationExpression() throws RecognitionException {
		SetOperationExpressionContext _localctx = new SetOperationExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setOperationExpression);
		try {
			_localctx = new SetOperationParenthesisExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(BEGINPARENTHESES);
			setState(512);
			((SetOperationParenthesisExprContext)_localctx).expr = setOperationResult();
			setState(513);
			match(ENDPARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationSetContext extends ParserRuleContext {
		public OperationSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationSet; }
	 
		public OperationSetContext() { }
		public void copyFrom(OperationSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationSetDefinitionExprContext extends OperationSetContext {
		public SetDefinitionContext sd;
		public SetDefinitionContext setDefinition() {
			return getRuleContext(SetDefinitionContext.class,0);
		}
		public OperationSetDefinitionExprContext(OperationSetContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperationSetSymbolExprContext extends OperationSetContext {
		public SetSymbolContext ss;
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public OperationSetSymbolExprContext(OperationSetContext ctx) { copyFrom(ctx); }
	}

	public final OperationSetContext operationSet() throws RecognitionException {
		OperationSetContext _localctx = new OperationSetContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_operationSet);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new OperationSetDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				((OperationSetDefinitionExprContext)_localctx).sd = setDefinition();
				}
				break;
			case UPPERCASEID:
			case SETZSYMBOL:
			case SETNSYMBOL:
			case SETRSYMBOL:
			case SETBSYMBOL:
				_localctx = new OperationSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				((OperationSetSymbolExprContext)_localctx).ss = setSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BelongsToOperatorContext extends ParserRuleContext {
		public BelongsToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belongsToOperator; }
	 
		public BelongsToOperatorContext() { }
		public void copyFrom(BelongsToOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InOperatorExprContext extends BelongsToOperatorContext {
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public InOperatorExprContext(BelongsToOperatorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInOperatorExprContext extends BelongsToOperatorContext {
		public NotInOperatorContext notInOperator() {
			return getRuleContext(NotInOperatorContext.class,0);
		}
		public NotInOperatorExprContext(BelongsToOperatorContext ctx) { copyFrom(ctx); }
	}

	public final BelongsToOperatorContext belongsToOperator() throws RecognitionException {
		BelongsToOperatorContext _localctx = new BelongsToOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_belongsToOperator);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INOPERATOR:
				_localctx = new InOperatorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				inOperator();
				}
				break;
			case NOTINOPERATOR:
				_localctx = new NotInOperatorExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				notInOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode INOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INOPERATOR, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_inOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(INOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotInOperatorContext extends ParserRuleContext {
		public TerminalNode NOTINOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.NOTINOPERATOR, 0); }
		public NotInOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notInOperator; }
	}

	public final NotInOperatorContext notInOperator() throws RecognitionException {
		NotInOperatorContext _localctx = new NotInOperatorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_notInOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(NOTINOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetOperatorContext extends ParserRuleContext {
		public SetOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperator; }
	 
		public SetOperatorContext() { }
		public void copyFrom(SetOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnionOpExprContext extends SetOperatorContext {
		public UnionOperatorContext unionOperator() {
			return getRuleContext(UnionOperatorContext.class,0);
		}
		public UnionOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntersectionOpExprContext extends SetOperatorContext {
		public IntersectionOperatorContext intersectionOperator() {
			return getRuleContext(IntersectionOperatorContext.class,0);
		}
		public IntersectionOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DifferenceOpExprContext extends SetOperatorContext {
		public SetdifferenceOperatorContext setdifferenceOperator() {
			return getRuleContext(SetdifferenceOperatorContext.class,0);
		}
		public DifferenceOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CartesianProductOpExprContext extends SetOperatorContext {
		public CartesianProductOperatorContext cartesianProductOperator() {
			return getRuleContext(CartesianProductOperatorContext.class,0);
		}
		public CartesianProductOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
	}

	public final SetOperatorContext setOperator() throws RecognitionException {
		SetOperatorContext _localctx = new SetOperatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_setOperator);
		try {
			setState(531);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARTESIANPRODUCTOPERATOR:
				_localctx = new CartesianProductOpExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				cartesianProductOperator();
				}
				break;
			case UNIONOPERATOR:
				_localctx = new UnionOpExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				unionOperator();
				}
				break;
			case INTERSECTIONOPERATOR:
				_localctx = new IntersectionOpExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				intersectionOperator();
				}
				break;
			case SETDIFFERENCEOPERATOR:
				_localctx = new DifferenceOpExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				setdifferenceOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CartesianProductOperatorContext extends ParserRuleContext {
		public TerminalNode CARTESIANPRODUCTOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.CARTESIANPRODUCTOPERATOR, 0); }
		public CartesianProductOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesianProductOperator; }
	}

	public final CartesianProductOperatorContext cartesianProductOperator() throws RecognitionException {
		CartesianProductOperatorContext _localctx = new CartesianProductOperatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_cartesianProductOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(CARTESIANPRODUCTOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnionOperatorContext extends ParserRuleContext {
		public TerminalNode UNIONOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.UNIONOPERATOR, 0); }
		public UnionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOperator; }
	}

	public final UnionOperatorContext unionOperator() throws RecognitionException {
		UnionOperatorContext _localctx = new UnionOperatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(UNIONOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntersectionOperatorContext extends ParserRuleContext {
		public TerminalNode INTERSECTIONOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INTERSECTIONOPERATOR, 0); }
		public IntersectionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionOperator; }
	}

	public final IntersectionOperatorContext intersectionOperator() throws RecognitionException {
		IntersectionOperatorContext _localctx = new IntersectionOperatorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_intersectionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(INTERSECTIONOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetdifferenceOperatorContext extends ParserRuleContext {
		public TerminalNode SETDIFFERENCEOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETDIFFERENCEOPERATOR, 0); }
		public SetdifferenceOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdifferenceOperator; }
	}

	public final SetdifferenceOperatorContext setdifferenceOperator() throws RecognitionException {
		SetdifferenceOperatorContext _localctx = new SetdifferenceOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_setdifferenceOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(SETDIFFERENCEOPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u021e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u00a6\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u00b1\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00bd\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00c1\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c7\b\u0004\n"+
		"\u0004\f\u0004\u00ca\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00ce"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00d7\b\u0007\n\u0007\f\u0007\u00da\t\u0007"+
		"\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u00e3"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00ec\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00f6\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00fe\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u0118\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0127\b\u001f"+
		"\u0001 \u0001 \u0001 \u0005 \u012c\b \n \f \u012f\t \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0137\b!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0003"+
		"(\u0147\b(\u0001)\u0001)\u0003)\u014b\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0003+\u0153\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u015a"+
		"\b,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00052\u016a\b2\n2\f2\u016d\t2\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0178\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u0181\b3\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00055\u018d"+
		"\b5\n5\f5\u0190\t5\u00015\u00015\u00015\u00035\u0195\b5\u00016\u00016"+
		"\u00016\u00016\u00056\u019b\b6\n6\f6\u019e\t6\u00016\u00016\u00016\u0003"+
		"6\u01a3\b6\u00017\u00017\u00017\u00017\u00057\u01a9\b7\n7\f7\u01ac\t7"+
		"\u00017\u00017\u00017\u00037\u01b1\b7\u00018\u00018\u00018\u00058\u01b6"+
		"\b8\n8\f8\u01b9\t8\u00019\u00019\u00019\u00039\u01be\b9\u0001:\u0001:"+
		"\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u01c8\b:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u01d2\b;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u01dc\b<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0003=\u01e3\b=\u0001=\u0001=\u0001>\u0001>\u0003"+
		">\u01e9\b>\u0001?\u0001?\u0003?\u01ed\b?\u0001@\u0001@\u0001A\u0001A\u0001"+
		"B\u0001B\u0001B\u0001B\u0005B\u01f7\bB\nB\fB\u01fa\tB\u0001C\u0001C\u0003"+
		"C\u01fe\bC\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0003E\u0206\bE\u0001"+
		"F\u0001F\u0003F\u020a\bF\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001"+
		"I\u0001I\u0003I\u0214\bI\u0001J\u0001J\u0001K\u0001K\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0000\u0000N\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u0000\u0005\u0001\u0000\u0017\u0018"+
		"\u0001\u0000\u0001\u0003\u0002\u0000\"\"22\u0002\u00003377\u0002\u0000"+
		"4488\u0212\u0000\u00a5\u0001\u0000\u0000\u0000\u0002\u00b0\u0001\u0000"+
		"\u0000\u0000\u0004\u00bc\u0001\u0000\u0000\u0000\u0006\u00c0\u0001\u0000"+
		"\u0000\u0000\b\u00c2\u0001\u0000\u0000\u0000\n\u00cd\u0001\u0000\u0000"+
		"\u0000\f\u00cf\u0001\u0000\u0000\u0000\u000e\u00d2\u0001\u0000\u0000\u0000"+
		"\u0010\u00dd\u0001\u0000\u0000\u0000\u0012\u00e2\u0001\u0000\u0000\u0000"+
		"\u0014\u00e4\u0001\u0000\u0000\u0000\u0016\u00eb\u0001\u0000\u0000\u0000"+
		"\u0018\u00ed\u0001\u0000\u0000\u0000\u001a\u00ef\u0001\u0000\u0000\u0000"+
		"\u001c\u00f1\u0001\u0000\u0000\u0000\u001e\u00f5\u0001\u0000\u0000\u0000"+
		" \u00fd\u0001\u0000\u0000\u0000\"\u00ff\u0001\u0000\u0000\u0000$\u0101"+
		"\u0001\u0000\u0000\u0000&\u0103\u0001\u0000\u0000\u0000(\u0105\u0001\u0000"+
		"\u0000\u0000*\u0107\u0001\u0000\u0000\u0000,\u0109\u0001\u0000\u0000\u0000"+
		".\u010b\u0001\u0000\u0000\u00000\u010d\u0001\u0000\u0000\u00002\u010f"+
		"\u0001\u0000\u0000\u00004\u0117\u0001\u0000\u0000\u00006\u0119\u0001\u0000"+
		"\u0000\u00008\u011b\u0001\u0000\u0000\u0000:\u011e\u0001\u0000\u0000\u0000"+
		"<\u0120\u0001\u0000\u0000\u0000>\u0126\u0001\u0000\u0000\u0000@\u0128"+
		"\u0001\u0000\u0000\u0000B\u0136\u0001\u0000\u0000\u0000D\u0138\u0001\u0000"+
		"\u0000\u0000F\u013a\u0001\u0000\u0000\u0000H\u013c\u0001\u0000\u0000\u0000"+
		"J\u013e\u0001\u0000\u0000\u0000L\u0140\u0001\u0000\u0000\u0000N\u0142"+
		"\u0001\u0000\u0000\u0000P\u0146\u0001\u0000\u0000\u0000R\u014a\u0001\u0000"+
		"\u0000\u0000T\u014c\u0001\u0000\u0000\u0000V\u0152\u0001\u0000\u0000\u0000"+
		"X\u0159\u0001\u0000\u0000\u0000Z\u015b\u0001\u0000\u0000\u0000\\\u015d"+
		"\u0001\u0000\u0000\u0000^\u015f\u0001\u0000\u0000\u0000`\u0161\u0001\u0000"+
		"\u0000\u0000b\u0163\u0001\u0000\u0000\u0000d\u0177\u0001\u0000\u0000\u0000"+
		"f\u0180\u0001\u0000\u0000\u0000h\u0182\u0001\u0000\u0000\u0000j\u0194"+
		"\u0001\u0000\u0000\u0000l\u01a2\u0001\u0000\u0000\u0000n\u01b0\u0001\u0000"+
		"\u0000\u0000p\u01b2\u0001\u0000\u0000\u0000r\u01bd\u0001\u0000\u0000\u0000"+
		"t\u01c7\u0001\u0000\u0000\u0000v\u01d1\u0001\u0000\u0000\u0000x\u01db"+
		"\u0001\u0000\u0000\u0000z\u01dd\u0001\u0000\u0000\u0000|\u01e8\u0001\u0000"+
		"\u0000\u0000~\u01ec\u0001\u0000\u0000\u0000\u0080\u01ee\u0001\u0000\u0000"+
		"\u0000\u0082\u01f0\u0001\u0000\u0000\u0000\u0084\u01f2\u0001\u0000\u0000"+
		"\u0000\u0086\u01fd\u0001\u0000\u0000\u0000\u0088\u01ff\u0001\u0000\u0000"+
		"\u0000\u008a\u0205\u0001\u0000\u0000\u0000\u008c\u0209\u0001\u0000\u0000"+
		"\u0000\u008e\u020b\u0001\u0000\u0000\u0000\u0090\u020d\u0001\u0000\u0000"+
		"\u0000\u0092\u0213\u0001\u0000\u0000\u0000\u0094\u0215\u0001\u0000\u0000"+
		"\u0000\u0096\u0217\u0001\u0000\u0000\u0000\u0098\u0219\u0001\u0000\u0000"+
		"\u0000\u009a\u021b\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0004\u0002"+
		"\u0000\u009d\u009e\u0005\u0000\u0000\u0001\u009e\u00a6\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0003\u0002\u0001\u0000\u00a0\u00a1\u0005\u0000\u0000"+
		"\u0001\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003\u0006\u0003"+
		"\u0000\u00a3\u00a4\u0005\u0000\u0000\u0001\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u009c\u0001\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a6\u0001\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9\u0003\u0006\u0003\u0000"+
		"\u00a9\u00b1\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0018\f\u0000\u00ab"+
		"\u00ac\u00057\u0000\u0000\u00ac\u00ad\u0003\u0006\u0003\u0000\u00ad\u00ae"+
		"\u00058\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00b1\u0003"+
		"\u001a\r\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u0003\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0018\f\u0000\u00b3\u00b4\u0003\u0006\u0003"+
		"\u0000\u00b4\u00b5\u0005\u0016\u0000\u0000\u00b5\u00bd\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0003\u0018\f\u0000\u00b7\u00b8\u00057\u0000\u0000"+
		"\u00b8\u00b9\u0003\u0006\u0003\u0000\u00b9\u00ba\u00058\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0016\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bd"+
		"\u0005\u0001\u0000\u0000\u0000\u00be\u00c1\u0003\b\u0004\u0000\u00bf\u00c1"+
		"\u0003\n\u0005\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u0007\u0001\u0000\u0000\u0000\u00c2\u00c8\u0003"+
		"\n\u0005\u0000\u00c3\u00c4\u0003\u001e\u000f\u0000\u00c4\u00c5\u0003\n"+
		"\u0005\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\t\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0003\u000e\u0007"+
		"\u0000\u00cc\u00ce\u0003\f\u0006\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u000b\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0003\u001c\u000e\u0000\u00d0\u00d1\u0003\n\u0005\u0000\u00d1"+
		"\r\u0001\u0000\u0000\u0000\u00d2\u00d8\u0003\u0010\b\u0000\u00d3\u00d4"+
		"\u0003 \u0010\u0000\u00d4\u00d5\u0003\u0010\b\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u000f\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u0003\u0012\t\u0000\u00dc\u00de\u0003\u0014"+
		"\n\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u0011\u0001\u0000\u0000\u0000\u00df\u00e3\u0003f3\u0000\u00e0"+
		"\u00e3\u0003r9\u0000\u00e1\u00e3\u0003L&\u0000\u00e2\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u0013\u0001\u0000\u0000\u0000\u00e4\u00e5\u00057\u0000"+
		"\u0000\u00e5\u00e6\u0003\u0006\u0003\u0000\u00e6\u00e7\u00058\u0000\u0000"+
		"\u00e7\u0015\u0001\u0000\u0000\u0000\u00e8\u00ec\u0003L&\u0000\u00e9\u00ec"+
		"\u0003f3\u0000\u00ea\u00ec\u0003r9\u0000\u00eb\u00e8\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u0017\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0015\u0000"+
		"\u0000\u00ee\u0019\u0001\u0000\u0000\u0000\u00ef\u00f0\u0007\u0000\u0000"+
		"\u0000\u00f0\u001b\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\"\u0011\u0000"+
		"\u00f2\u001d\u0001\u0000\u0000\u0000\u00f3\u00f6\u0003$\u0012\u0000\u00f4"+
		"\u00f6\u0003&\u0013\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f6\u001f\u0001\u0000\u0000\u0000\u00f7\u00fe"+
		"\u0003(\u0014\u0000\u00f8\u00fe\u0003*\u0015\u0000\u00f9\u00fe\u0003,"+
		"\u0016\u0000\u00fa\u00fe\u0003.\u0017\u0000\u00fb\u00fe\u00030\u0018\u0000"+
		"\u00fc\u00fe\u00032\u0019\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe!\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005!\u0000\u0000\u0100#\u0001\u0000\u0000\u0000\u0101\u0102\u0005\""+
		"\u0000\u0000\u0102%\u0001\u0000\u0000\u0000\u0103\u0104\u0005#\u0000\u0000"+
		"\u0104\'\u0001\u0000\u0000\u0000\u0105\u0106\u0005$\u0000\u0000\u0106"+
		")\u0001\u0000\u0000\u0000\u0107\u0108\u0005%\u0000\u0000\u0108+\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005&\u0000\u0000\u010a-\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005\'\u0000\u0000\u010c/\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0005(\u0000\u0000\u010e1\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005)\u0000\u0000\u01103\u0001\u0000\u0000\u0000\u0111\u0118\u00036"+
		"\u001b\u0000\u0112\u0113\u00036\u001b\u0000\u0113\u0114\u00057\u0000\u0000"+
		"\u0114\u0115\u0003@ \u0000\u0115\u0116\u00058\u0000\u0000\u0116\u0118"+
		"\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000\u0000\u0000\u0117\u0112"+
		"\u0001\u0000\u0000\u0000\u01185\u0001\u0000\u0000\u0000\u0119\u011a\u0007"+
		"\u0001\u0000\u0000\u011a7\u0001\u0000\u0000\u0000\u011b\u011c\u00051\u0000"+
		"\u0000\u011c\u011d\u0005\u0002\u0000\u0000\u011d9\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0005\u0002\u0000\u0000\u011f;\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0005\u0002\u0000\u0000\u0121\u0122\u00050\u0000\u0000\u0122=\u0001"+
		"\u0000\u0000\u0000\u0123\u0127\u0003<\u001e\u0000\u0124\u0127\u0003B!"+
		"\u0000\u0125\u0127\u0003:\u001d\u0000\u0126\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000"+
		"\u0127?\u0001\u0000\u0000\u0000\u0128\u012d\u00038\u001c\u0000\u0129\u012a"+
		"\u00052\u0000\u0000\u012a\u012c\u00038\u001c\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012eA\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0137\u0003D\"\u0000"+
		"\u0131\u0137\u0003F#\u0000\u0132\u0137\u0003H$\u0000\u0133\u0137\u0003"+
		"J%\u0000\u0134\u0137\u0003L&\u0000\u0135\u0137\u0003N\'\u0000\u0136\u0130"+
		"\u0001\u0000\u0000\u0000\u0136\u0131\u0001\u0000\u0000\u0000\u0136\u0132"+
		"\u0001\u0000\u0000\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137C\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0005\u000f\u0000\u0000\u0139E\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0005\u0010\u0000\u0000\u013bG\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0005\u0005\u0000\u0000\u013dI\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0005\u0006\u0000\u0000\u013fK\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0005\u0019\u0000\u0000\u0141M\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u0004\u0000\u0000\u0143O\u0001\u0000\u0000\u0000\u0144\u0147\u0003"+
		"R)\u0000\u0145\u0147\u0003T*\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0146\u0145\u0001\u0000\u0000\u0000\u0147Q\u0001\u0000\u0000\u0000\u0148"+
		"\u014b\u0003V+\u0000\u0149\u014b\u0003\u0084B\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014bS\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0003X,\u0000\u014d\u014e\u0005;\u0000\u0000"+
		"\u014e\u014f\u0003R)\u0000\u014fU\u0001\u0000\u0000\u0000\u0150\u0153"+
		"\u0003d2\u0000\u0151\u0153\u0003h4\u0000\u0152\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153W\u0001\u0000\u0000\u0000"+
		"\u0154\u015a\u0003Z-\u0000\u0155\u015a\u0003\\.\u0000\u0156\u015a\u0003"+
		"^/\u0000\u0157\u015a\u0003`0\u0000\u0158\u015a\u0003b1\u0000\u0159\u0154"+
		"\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000\u0159\u0156"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015aY\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		"\u0001\u0000\u0000\u015c[\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0011"+
		"\u0000\u0000\u015e]\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0012\u0000"+
		"\u0000\u0160_\u0001\u0000\u0000\u0000\u0161\u0162\u0005\u0013\u0000\u0000"+
		"\u0162a\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0014\u0000\u0000\u0164"+
		"c\u0001\u0000\u0000\u0000\u0165\u0166\u00055\u0000\u0000\u0166\u016b\u0003"+
		"f3\u0000\u0167\u0168\u00052\u0000\u0000\u0168\u016a\u0003f3\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016e\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u00056\u0000\u0000\u016f\u0178\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u00055\u0000\u0000\u0171\u0172\u0003f3\u0000\u0172\u0173\u0005<\u0000"+
		"\u0000\u0173\u0174\u0003r9\u0000\u0174\u0175\u00056\u0000\u0000\u0175"+
		"\u0178\u0001\u0000\u0000\u0000\u0176\u0178\u0003\u0080@\u0000\u0177\u0165"+
		"\u0001\u0000\u0000\u0000\u0177\u0170\u0001\u0000\u0000\u0000\u0177\u0176"+
		"\u0001\u0000\u0000\u0000\u0178e\u0001\u0000\u0000\u0000\u0179\u0181\u0003"+
		":\u001d\u0000\u017a\u0181\u0003~?\u0000\u017b\u0181\u0003|>\u0000\u017c"+
		"\u0181\u00034\u001a\u0000\u017d\u0181\u0003N\'\u0000\u017e\u0181\u0003"+
		"j5\u0000\u017f\u0181\u00038\u001c\u0000\u0180\u0179\u0001\u0000\u0000"+
		"\u0000\u0180\u017a\u0001\u0000\u0000\u0000\u0180\u017b\u0001\u0000\u0000"+
		"\u0000\u0180\u017c\u0001\u0000\u0000\u0000\u0180\u017d\u0001\u0000\u0000"+
		"\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000\u0000"+
		"\u0000\u0181g\u0001\u0000\u0000\u0000\u0182\u0183\u00055\u0000\u0000\u0183"+
		"\u0184\u0003j5\u0000\u0184\u0185\u0005<\u0000\u0000\u0185\u0186\u0003"+
		"p8\u0000\u0186\u0187\u00056\u0000\u0000\u0187i\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u00057\u0000\u0000\u0189\u018e\u0003f3\u0000\u018a\u018b"+
		"\u00052\u0000\u0000\u018b\u018d\u0003f3\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u00058\u0000"+
		"\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0195\u0003\u0082A\u0000"+
		"\u0194\u0188\u0001\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000"+
		"\u0195k\u0001\u0000\u0000\u0000\u0196\u0197\u00057\u0000\u0000\u0197\u019c"+
		"\u0003<\u001e\u0000\u0198\u0199\u00052\u0000\u0000\u0199\u019b\u0003<"+
		"\u001e\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u00058\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a3\u0003\u0082A\u0000\u01a2\u0196\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3m\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a5\u00057\u0000\u0000\u01a5\u01aa\u0003>\u001f\u0000\u01a6\u01a7\u0005"+
		"2\u0000\u0000\u01a7\u01a9\u0003>\u001f\u0000\u01a8\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae\u00058\u0000\u0000"+
		"\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01b1\u0003\u0082A\u0000\u01b0"+
		"\u01a4\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"o\u0001\u0000\u0000\u0000\u01b2\u01b7\u0003r9\u0000\u01b3\u01b4\u0007"+
		"\u0002\u0000\u0000\u01b4\u01b6\u0003r9\u0000\u01b5\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8q\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01be\u0003t:\u0000\u01bb\u01be"+
		"\u0003v;\u0000\u01bc\u01be\u0003x<\u0000\u01bd\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bes\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003f3\u0000\u01c0"+
		"\u01c1\u0003\u008cF\u0000\u01c1\u01c2\u0003R)\u0000\u01c2\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0003d2\u0000\u01c4\u01c5\u0003\u008cF"+
		"\u0000\u01c5\u01c6\u0003R)\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c8"+
		"u\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003f3\u0000\u01ca\u01cb\u0003"+
		"\u008cF\u0000\u01cb\u01cc\u0003X,\u0000\u01cc\u01d2\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0003d2\u0000\u01ce\u01cf\u0003\u008cF\u0000\u01cf"+
		"\u01d0\u0003X,\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01c9\u0001"+
		"\u0000\u0000\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d2w\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0003f3\u0000\u01d4\u01d5\u0003\u008cF\u0000"+
		"\u01d5\u01d6\u0003z=\u0000\u01d6\u01dc\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0003d2\u0000\u01d8\u01d9\u0003\u008cF\u0000\u01d9\u01da\u0003z=\u0000"+
		"\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01d3\u0001\u0000\u0000\u0000"+
		"\u01db\u01d7\u0001\u0000\u0000\u0000\u01dcy\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u0007\u0003\u0000\u0000\u01de\u01df\u0003~?\u0000\u01df\u01e2\u0005"+
		"2\u0000\u0000\u01e0\u01e3\u0003~?\u0000\u01e1\u01e3\u0003L&\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0007\u0004\u0000\u0000\u01e5"+
		"{\u0001\u0000\u0000\u0000\u01e6\u01e9\u0003D\"\u0000\u01e7\u01e9\u0003"+
		"F#\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000"+
		"\u0000\u01e9}\u0001\u0000\u0000\u0000\u01ea\u01ed\u0003H$\u0000\u01eb"+
		"\u01ed\u0003J%\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ed\u007f\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005"+
		"\u0007\u0000\u0000\u01ef\u0081\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005"+
		"\b\u0000\u0000\u01f1\u0083\u0001\u0000\u0000\u0000\u01f2\u01f8\u0003\u0086"+
		"C\u0000\u01f3\u01f4\u0003\u0092I\u0000\u01f4\u01f5\u0003\u0086C\u0000"+
		"\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u0085\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01fe\u0003\u008aE\u0000\u01fc"+
		"\u01fe\u0003\u0088D\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fe\u0087\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u00057\u0000\u0000\u0200\u0201\u0003\u0084B\u0000\u0201\u0202\u00058"+
		"\u0000\u0000\u0202\u0089\u0001\u0000\u0000\u0000\u0203\u0206\u0003V+\u0000"+
		"\u0204\u0206\u0003X,\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u008b\u0001\u0000\u0000\u0000\u0207\u020a"+
		"\u0003\u008eG\u0000\u0208\u020a\u0003\u0090H\u0000\u0209\u0207\u0001\u0000"+
		"\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u008d\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0005\u001b\u0000\u0000\u020c\u008f\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005\u001c\u0000\u0000\u020e\u0091\u0001\u0000"+
		"\u0000\u0000\u020f\u0214\u0003\u0094J\u0000\u0210\u0214\u0003\u0096K\u0000"+
		"\u0211\u0214\u0003\u0098L\u0000\u0212\u0214\u0003\u009aM\u0000\u0213\u020f"+
		"\u0001\u0000\u0000\u0000\u0213\u0210\u0001\u0000\u0000\u0000\u0213\u0211"+
		"\u0001\u0000\u0000\u0000\u0213\u0212\u0001\u0000\u0000\u0000\u0214\u0093"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u001d\u0000\u0000\u0216\u0095"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u001e\u0000\u0000\u0218\u0097"+
		"\u0001\u0000\u0000\u0000\u0219\u021a\u0005\u001f\u0000\u0000\u021a\u0099"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0005 \u0000\u0000\u021c\u009b\u0001"+
		"\u0000\u0000\u0000*\u00a5\u00b0\u00bc\u00c0\u00c8\u00cd\u00d8\u00dd\u00e2"+
		"\u00eb\u00f5\u00fd\u0117\u0126\u012d\u0136\u0146\u014a\u0152\u0159\u016b"+
		"\u0177\u0180\u018e\u0194\u019c\u01a2\u01aa\u01b0\u01b7\u01bd\u01c7\u01d1"+
		"\u01db\u01e2\u01e8\u01ec\u01f8\u01fd\u0205\u0209\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}