// Generated from CFG_BOOLEAN_EXPRESSION.g4 by ANTLR 4.9.2
package rules;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CFG_BOOLEAN_EXPRESSIONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public static class RootIfThenContext extends RootContext {
		public IfThenConditionContext ifThenCondition() {
			return getRuleContext(IfThenConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EOF, 0); }
		public RootIfThenContext(RootContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRootIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRootIfThen(this);
		}
	}
	public static class RootIfContext extends RootContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EOF, 0); }
		public RootIfContext(RootContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRootIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRootIf(this);
		}
	}
	public static class RootBooleanExprContext extends RootContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EOF, 0); }
		public RootBooleanExprContext(RootContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRootBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRootBooleanExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIfConditionParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIfConditionParExpr(this);
		}
	}
	public static class IfConditionExprContext extends IfConditionContext {
		public IfSymbolContext ifSymbol() {
			return getRuleContext(IfSymbolContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public IfConditionExprContext(IfConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIfConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIfConditionExpr(this);
		}
	}
	public static class IfConditionDefaultExprContext extends IfConditionContext {
		public InOtherCaseSymbolContext inOtherCaseSymbol() {
			return getRuleContext(InOtherCaseSymbolContext.class,0);
		}
		public IfConditionDefaultExprContext(IfConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIfConditionDefaultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIfConditionDefaultExpr(this);
		}
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
	public static class IfThenExprContext extends IfThenConditionContext {
		public IfSymbolContext ifSymbol() {
			return getRuleContext(IfSymbolContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode THENSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.THENSYMBOL, 0); }
		public IfThenExprContext(IfThenConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIfThenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIfThenExpr(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIfThenParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIfThenParExpr(this);
		}
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
	public static class BooleanTermExprContext extends BooleanExpressionContext {
		public BooleanExpressionTermContext bt;
		public BooleanExpressionTermContext booleanExpressionTerm() {
			return getRuleContext(BooleanExpressionTermContext.class,0);
		}
		public BooleanTermExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBooleanTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBooleanTermExpr(this);
		}
	}
	public static class BinaryConditionExprContext extends BooleanExpressionContext {
		public BinaryConditionContext bc;
		public BinaryConditionContext binaryCondition() {
			return getRuleContext(BinaryConditionContext.class,0);
		}
		public BinaryConditionExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBinaryConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBinaryConditionExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBinaryExpr(this);
		}
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
	public static class RelationalTermExprContext extends BooleanExpressionTermContext {
		public RelationalExpressionTermContext rt;
		public RelationalExpressionTermContext relationalExpressionTerm() {
			return getRuleContext(RelationalExpressionTermContext.class,0);
		}
		public RelationalTermExprContext(BooleanExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRelationalTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRelationalTermExpr(this);
		}
	}
	public static class UnaryTermExprContext extends BooleanExpressionTermContext {
		public UnaryConditionContext uc;
		public UnaryConditionContext unaryCondition() {
			return getRuleContext(UnaryConditionContext.class,0);
		}
		public UnaryTermExprContext(BooleanExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterUnaryTermExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitUnaryTermExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterUnaryCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitUnaryCondExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRelationalExpr(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALTOOPERATOR) | (1L << NOTEQUALTOOPERATOR) | (1L << GREATERTHANOPERATOR) | (1L << LESSTHANOPERATOR) | (1L << GREATERTHANOREQUALTOOPERATOR) | (1L << LESSTHANOREQUALTOOPERATOR))) != 0)) {
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
	public static class BasicParenthesisExprContext extends BooleanExpressionBasicTermContext {
		public BooleanExpressionResultContext res;
		public BooleanExpressionResultContext booleanExpressionResult() {
			return getRuleContext(BooleanExpressionResultContext.class,0);
		}
		public BasicParenthesisExprContext(BooleanExpressionBasicTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBasicParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBasicParenthesisExpr(this);
		}
	}
	public static class BasicElementExprContext extends BooleanExpressionBasicTermContext {
		public BooleanExpressionElementContext el;
		public BooleanExpressionElementContext booleanExpressionElement() {
			return getRuleContext(BooleanExpressionElementContext.class,0);
		}
		public BasicElementExprContext(BooleanExpressionBasicTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBasicElementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBasicElementExpr(this);
		}
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
	public static class ElementExprContext extends BooleanExpressionElementContext {
		public ElementContext el;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementExprContext(BooleanExpressionElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementExpr(this);
		}
	}
	public static class ElementDefinitionExprContext extends BooleanExpressionElementContext {
		public ElementDefinitionContext el;
		public ElementDefinitionContext elementDefinition() {
			return getRuleContext(ElementDefinitionContext.class,0);
		}
		public ElementDefinitionExprContext(BooleanExpressionElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementDefinitionExpr(this);
		}
	}
	public static class InfinityExprContext extends BooleanExpressionElementContext {
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public InfinityExprContext(BooleanExpressionElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterInfinityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitInfinityExpr(this);
		}
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
	public static class ParenthesisExprContext extends BooleanExpressionResultContext {
		public BooleanExpressionContext expr;
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ParenthesisExprContext(BooleanExpressionResultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitParenthesisExpr(this);
		}
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
	public static class ActionInfinityContext extends ActionExpressionContext {
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public ActionInfinityContext(ActionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterActionInfinity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitActionInfinity(this);
		}
	}
	public static class ActionElementContext extends ActionExpressionContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ActionElementContext(ActionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterActionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitActionElement(this);
		}
	}
	public static class ActionElementDefinitionContext extends ActionExpressionContext {
		public ElementDefinitionContext elementDefinition() {
			return getRuleContext(ElementDefinitionContext.class,0);
		}
		public ActionElementDefinitionContext(ActionExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterActionElementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitActionElementDefinition(this);
		}
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

	public static class IfSymbolContext extends ParserRuleContext {
		public TerminalNode IFSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.IFSYMBOL, 0); }
		public IfSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIfSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIfSymbol(this);
		}
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

	public static class InOtherCaseSymbolContext extends ParserRuleContext {
		public TerminalNode INOTHERCASESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INOTHERCASESYMBOL, 0); }
		public TerminalNode OTHERWISESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.OTHERWISESYMBOL, 0); }
		public InOtherCaseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOtherCaseSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterInOtherCaseSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitInOtherCaseSymbol(this);
		}
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

	public static class UnaryConditionalOperatorContext extends ParserRuleContext {
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public UnaryConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryConditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterUnaryConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitUnaryConditionalOperator(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBinaryConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBinaryConditionalOperator(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBinaryRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBinaryRelationalOperator(this);
		}
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

	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOTOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.NOTOPERATOR, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterNotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitNotOperator(this);
		}
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

	public static class AndOperatorContext extends ParserRuleContext {
		public TerminalNode ANDOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ANDOPERATOR, 0); }
		public AndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitAndOperator(this);
		}
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

	public static class OrOperatorContext extends ParserRuleContext {
		public TerminalNode OROPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.OROPERATOR, 0); }
		public OrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitOrOperator(this);
		}
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

	public static class EqualToOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EQUALTOOPERATOR, 0); }
		public EqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalToOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterEqualToOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitEqualToOperator(this);
		}
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

	public static class NotEqualToOperatorContext extends ParserRuleContext {
		public TerminalNode NOTEQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.NOTEQUALTOOPERATOR, 0); }
		public NotEqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualToOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterNotEqualToOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitNotEqualToOperator(this);
		}
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

	public static class GreaterThanOperatorContext extends ParserRuleContext {
		public TerminalNode GREATERTHANOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.GREATERTHANOPERATOR, 0); }
		public GreaterThanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterGreaterThanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitGreaterThanOperator(this);
		}
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

	public static class LessThanOperatorContext extends ParserRuleContext {
		public TerminalNode LESSTHANOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LESSTHANOPERATOR, 0); }
		public LessThanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterLessThanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitLessThanOperator(this);
		}
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

	public static class GreaterThanOrEqualToOperatorContext extends ParserRuleContext {
		public TerminalNode GREATERTHANOREQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.GREATERTHANOREQUALTOOPERATOR, 0); }
		public GreaterThanOrEqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greaterThanOrEqualToOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterGreaterThanOrEqualToOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitGreaterThanOrEqualToOperator(this);
		}
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

	public static class LessThanOrEqualToOperatorContext extends ParserRuleContext {
		public TerminalNode LESSTHANOREQUALTOOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LESSTHANOREQUALTOOPERATOR, 0); }
		public LessThanOrEqualToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lessThanOrEqualToOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterLessThanOrEqualToOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitLessThanOrEqualToOperator(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterModelSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitModelSignature(this);
		}
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

	public static class ModelSymbolContext extends ParserRuleContext {
		public TerminalNode UPPERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.UPPERCASEID, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public TerminalNode FULLCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.FULLCASEID, 0); }
		public ModelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterModelSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitModelSymbol(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPERCASEID) | (1L << LOWERCASEID) | (1L << FULLCASEID))) != 0)) ) {
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.HASH, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitParameter(this);
		}
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIdentifier(this);
		}
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LOWERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.LOWERCASEID, 0); }
		public TerminalNode APOSTROPHE() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.APOSTROPHE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitVariable(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterVariableFixedValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitVariableFixedValues(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitParametersList(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDatatypeSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDatatypeSymbol(this);
		}
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

	public static class TrueSymbolContext extends ParserRuleContext {
		public TerminalNode TRUESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.TRUESYMBOL, 0); }
		public TrueSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterTrueSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitTrueSymbol(this);
		}
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

	public static class FalseSymbolContext extends ParserRuleContext {
		public TerminalNode FALSESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.FALSESYMBOL, 0); }
		public FalseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterFalseSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitFalseSymbol(this);
		}
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

	public static class IntegerSymbolContext extends ParserRuleContext {
		public TerminalNode INTEGERSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INTEGERSYMBOL, 0); }
		public IntegerSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIntegerSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIntegerSymbol(this);
		}
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

	public static class RealSymbolContext extends ParserRuleContext {
		public TerminalNode REALSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.REALSYMBOL, 0); }
		public RealSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRealSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRealSymbol(this);
		}
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

	public static class InfinitySymbolContext extends ParserRuleContext {
		public TerminalNode INFINITYSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INFINITYSYMBOL, 0); }
		public InfinitySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitySymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterInfinitySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitInfinitySymbol(this);
		}
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

	public static class StringSymbolContext extends ParserRuleContext {
		public TerminalNode STRINGSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.STRINGSYMBOL, 0); }
		public StringSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterStringSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitStringSymbol(this);
		}
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
	public static class SetExplicitDefinitionExprContext extends SetContext {
		public SetExplicitDefinitionContext se;
		public SetExplicitDefinitionContext setExplicitDefinition() {
			return getRuleContext(SetExplicitDefinitionContext.class,0);
		}
		public SetExplicitDefinitionExprContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetExplicitDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetExplicitDefinitionExpr(this);
		}
	}
	public static class SetImplicitDefinitionExprContext extends SetContext {
		public SetImplicitDefinitionContext si;
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public SetImplicitDefinitionExprContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetImplicitDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetImplicitDefinitionExpr(this);
		}
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
	public static class SetOperationResultExprContext extends SetImplicitDefinitionContext {
		public SetOperationResultContext sr;
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public SetOperationResultExprContext(SetImplicitDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOperationResultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOperationResultExpr(this);
		}
	}
	public static class SetDefinitionExprContext extends SetImplicitDefinitionContext {
		public SetDefinitionContext sd;
		public SetDefinitionContext setDefinition() {
			return getRuleContext(SetDefinitionContext.class,0);
		}
		public SetDefinitionExprContext(SetImplicitDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetDefinitionExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetAssignmentExpr(this);
		}
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
	public static class ElementCollectionExprContext extends SetDefinitionContext {
		public ElementCollectionContext ec;
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public ElementCollectionExprContext(SetDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementCollectionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementCollectionExpr(this);
		}
	}
	public static class TupleCollectionExprContext extends SetDefinitionContext {
		public TupleCollectionContext tc;
		public TupleCollectionContext tupleCollection() {
			return getRuleContext(TupleCollectionContext.class,0);
		}
		public TupleCollectionExprContext(SetDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterTupleCollectionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitTupleCollectionExpr(this);
		}
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
	public static class RealSetSymbolExprContext extends SetSymbolContext {
		public SetOfRealNumbersSymbolContext r;
		public SetOfRealNumbersSymbolContext setOfRealNumbersSymbol() {
			return getRuleContext(SetOfRealNumbersSymbolContext.class,0);
		}
		public RealSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRealSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRealSetSymbolExpr(this);
		}
	}
	public static class BooleanSetSymbolExprContext extends SetSymbolContext {
		public SetOfBooleanAlgebraSymbolContext b;
		public SetOfBooleanAlgebraSymbolContext setOfBooleanAlgebraSymbol() {
			return getRuleContext(SetOfBooleanAlgebraSymbolContext.class,0);
		}
		public BooleanSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterBooleanSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitBooleanSetSymbolExpr(this);
		}
	}
	public static class IntegerSetSymbolExprContext extends SetSymbolContext {
		public SetOfIntegerNumbersSymbolContext z;
		public SetOfIntegerNumbersSymbolContext setOfIntegerNumbersSymbol() {
			return getRuleContext(SetOfIntegerNumbersSymbolContext.class,0);
		}
		public IntegerSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIntegerSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIntegerSetSymbolExpr(this);
		}
	}
	public static class SetNameSymbolExprContext extends SetSymbolContext {
		public SetNameContext n;
		public SetNameContext setName() {
			return getRuleContext(SetNameContext.class,0);
		}
		public SetNameSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetNameSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetNameSymbolExpr(this);
		}
	}
	public static class NaturalSetSymbolExprContext extends SetSymbolContext {
		public SetOfNaturalNumbersSymbolContext nn;
		public SetOfNaturalNumbersSymbolContext setOfNaturalNumbersSymbol() {
			return getRuleContext(SetOfNaturalNumbersSymbolContext.class,0);
		}
		public NaturalSetSymbolExprContext(SetSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterNaturalSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitNaturalSetSymbolExpr(this);
		}
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

	public static class SetNameContext extends ParserRuleContext {
		public TerminalNode UPPERCASEID() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.UPPERCASEID, 0); }
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetName(this);
		}
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

	public static class SetOfIntegerNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETZSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETZSYMBOL, 0); }
		public SetOfIntegerNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfIntegerNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOfIntegerNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOfIntegerNumbersSymbol(this);
		}
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

	public static class SetOfNaturalNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETNSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETNSYMBOL, 0); }
		public SetOfNaturalNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfNaturalNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOfNaturalNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOfNaturalNumbersSymbol(this);
		}
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

	public static class SetOfRealNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETRSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETRSYMBOL, 0); }
		public SetOfRealNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfRealNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOfRealNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOfRealNumbersSymbol(this);
		}
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

	public static class SetOfBooleanAlgebraSymbolContext extends ParserRuleContext {
		public TerminalNode SETBSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETBSYMBOL, 0); }
		public SetOfBooleanAlgebraSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfBooleanAlgebraSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOfBooleanAlgebraSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOfBooleanAlgebraSymbol(this);
		}
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
	public static class EmptySetExprContext extends ElementCollectionContext {
		public EmptySetSymbolContext es;
		public EmptySetSymbolContext emptySetSymbol() {
			return getRuleContext(EmptySetSymbolContext.class,0);
		}
		public EmptySetExprContext(ElementCollectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterEmptySetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitEmptySetExpr(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementListExpr(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementSuchThatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementSuchThatExpr(this);
		}
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
	public static class ElementNumberContext extends ElementContext {
		public NumberSymbolContext num;
		public NumberSymbolContext numberSymbol() {
			return getRuleContext(NumberSymbolContext.class,0);
		}
		public ElementNumberContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementNumber(this);
		}
	}
	public static class ElementIdentifierContext extends ElementContext {
		public IdentifierContext id;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementIdentifierContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementIdentifier(this);
		}
	}
	public static class ElementBooleanContext extends ElementContext {
		public BooleanSymbolContext bool;
		public BooleanSymbolContext booleanSymbol() {
			return getRuleContext(BooleanSymbolContext.class,0);
		}
		public ElementBooleanContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementBoolean(this);
		}
	}
	public static class ElementTupleContext extends ElementContext {
		public TupleContext tup;
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ElementTupleContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementTuple(this);
		}
	}
	public static class ElementParameterContext extends ElementContext {
		public ParameterContext par;
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ElementParameterContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementParameter(this);
		}
	}
	public static class ElementModelSignatureContext extends ElementContext {
		public ModelSignatureContext sig;
		public ModelSignatureContext modelSignature() {
			return getRuleContext(ModelSignatureContext.class,0);
		}
		public ElementModelSignatureContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementModelSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementModelSignature(this);
		}
	}
	public static class ElementStringContext extends ElementContext {
		public StringSymbolContext str;
		public StringSymbolContext stringSymbol() {
			return getRuleContext(StringSymbolContext.class,0);
		}
		public ElementStringContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementString(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterTupleSuchThatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitTupleSuchThatExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitTupleExpr(this);
		}
	}
	public static class EmptyTupleExprContext extends TupleContext {
		public EmptyTupleSymbolContext et;
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public EmptyTupleExprContext(TupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterEmptyTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitEmptyTupleExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterVariableTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitVariableTupleExpr(this);
		}
	}
	public static class EmptyVariableTupleExprContext extends VariableTupleContext {
		public EmptyTupleSymbolContext et;
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public EmptyVariableTupleExprContext(VariableTupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterEmptyVariableTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitEmptyVariableTupleExpr(this);
		}
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
	public static class EmptyVariableTupleFixedValuesExprContext extends VariableTupleFixedValuesContext {
		public EmptyTupleSymbolContext et;
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public EmptyVariableTupleFixedValuesExprContext(VariableTupleFixedValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterEmptyVariableTupleFixedValuesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitEmptyVariableTupleFixedValuesExpr(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterVariableTupleFixedValuesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitVariableTupleFixedValuesExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterTupleDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitTupleDefinitionExpr(this);
		}
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
	public static class ElementDefSetSymbolExprContext extends ElementDefinitionContext {
		public DefinitionWithSetSymbolContext d2;
		public DefinitionWithSetSymbolContext definitionWithSetSymbol() {
			return getRuleContext(DefinitionWithSetSymbolContext.class,0);
		}
		public ElementDefSetSymbolExprContext(ElementDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementDefSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementDefSetSymbolExpr(this);
		}
	}
	public static class ElementDefImplicitSetExprContext extends ElementDefinitionContext {
		public DefinitionWithSetImplicitDefinitionContext d1;
		public DefinitionWithSetImplicitDefinitionContext definitionWithSetImplicitDefinition() {
			return getRuleContext(DefinitionWithSetImplicitDefinitionContext.class,0);
		}
		public ElementDefImplicitSetExprContext(ElementDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementDefImplicitSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementDefImplicitSetExpr(this);
		}
	}
	public static class ElementDefRangeExprContext extends ElementDefinitionContext {
		public DefinitionWithRangeContext d3;
		public DefinitionWithRangeContext definitionWithRange() {
			return getRuleContext(DefinitionWithRangeContext.class,0);
		}
		public ElementDefRangeExprContext(ElementDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterElementDefRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitElementDefRangeExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDefCollectionWithImplicitSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDefCollectionWithImplicitSetExpr(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDefWithImplicitSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDefWithImplicitSetExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDefCollectionWithSymbolSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDefCollectionWithSymbolSetExpr(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDefWithSymbolSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDefWithSymbolSetExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDefWithRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDefWithRangeExpr(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDefCollectionWithRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDefCollectionWithRangeExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRangeExpr(this);
		}
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
	public static class TrueExprContext extends BooleanSymbolContext {
		public TrueSymbolContext t;
		public TrueSymbolContext trueSymbol() {
			return getRuleContext(TrueSymbolContext.class,0);
		}
		public TrueExprContext(BooleanSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitTrueExpr(this);
		}
	}
	public static class FalseExprContext extends BooleanSymbolContext {
		public FalseSymbolContext f;
		public FalseSymbolContext falseSymbol() {
			return getRuleContext(FalseSymbolContext.class,0);
		}
		public FalseExprContext(BooleanSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitFalseExpr(this);
		}
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
	public static class IntegerExprContext extends NumberSymbolContext {
		public IntegerSymbolContext i;
		public IntegerSymbolContext integerSymbol() {
			return getRuleContext(IntegerSymbolContext.class,0);
		}
		public IntegerExprContext(NumberSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIntegerExpr(this);
		}
	}
	public static class RealExprContext extends NumberSymbolContext {
		public RealSymbolContext r;
		public RealSymbolContext realSymbol() {
			return getRuleContext(RealSymbolContext.class,0);
		}
		public RealExprContext(NumberSymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterRealExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitRealExpr(this);
		}
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

	public static class EmptySetSymbolContext extends ParserRuleContext {
		public TerminalNode EMPTYSETSYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EMPTYSETSYMBOL, 0); }
		public EmptySetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptySetSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterEmptySetSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitEmptySetSymbol(this);
		}
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

	public static class EmptyTupleSymbolContext extends ParserRuleContext {
		public TerminalNode EMPTYTUPLESYMBOL() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.EMPTYTUPLESYMBOL, 0); }
		public EmptyTupleSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyTupleSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterEmptyTupleSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitEmptyTupleSymbol(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOperationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOperationExpr(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARTESIANPRODUCTOPERATOR) | (1L << UNIONOPERATOR) | (1L << INTERSECTIONOPERATOR) | (1L << SETDIFFERENCEOPERATOR))) != 0)) {
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
	public static class OperationSetExprContext extends SetOperationTermContext {
		public OperationSetContext s1;
		public OperationSetContext operationSet() {
			return getRuleContext(OperationSetContext.class,0);
		}
		public OperationSetExprContext(SetOperationTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterOperationSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitOperationSetExpr(this);
		}
	}
	public static class SetOperationParExprContext extends SetOperationTermContext {
		public SetOperationExpressionContext par;
		public SetOperationExpressionContext setOperationExpression() {
			return getRuleContext(SetOperationExpressionContext.class,0);
		}
		public SetOperationParExprContext(SetOperationTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOperationParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOperationParExpr(this);
		}
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
	public static class SetOperationParenthesisExprContext extends SetOperationExpressionContext {
		public SetOperationResultContext expr;
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public SetOperationParenthesisExprContext(SetOperationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetOperationParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetOperationParenthesisExpr(this);
		}
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
	public static class OperationSetDefinitionExprContext extends OperationSetContext {
		public SetDefinitionContext sd;
		public SetDefinitionContext setDefinition() {
			return getRuleContext(SetDefinitionContext.class,0);
		}
		public OperationSetDefinitionExprContext(OperationSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterOperationSetDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitOperationSetDefinitionExpr(this);
		}
	}
	public static class OperationSetSymbolExprContext extends OperationSetContext {
		public SetSymbolContext ss;
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public OperationSetSymbolExprContext(OperationSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterOperationSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitOperationSetSymbolExpr(this);
		}
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
	public static class InOperatorExprContext extends BelongsToOperatorContext {
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public InOperatorExprContext(BelongsToOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterInOperatorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitInOperatorExpr(this);
		}
	}
	public static class NotInOperatorExprContext extends BelongsToOperatorContext {
		public NotInOperatorContext notInOperator() {
			return getRuleContext(NotInOperatorContext.class,0);
		}
		public NotInOperatorExprContext(BelongsToOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterNotInOperatorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitNotInOperatorExpr(this);
		}
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

	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode INOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INOPERATOR, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitInOperator(this);
		}
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

	public static class NotInOperatorContext extends ParserRuleContext {
		public TerminalNode NOTINOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.NOTINOPERATOR, 0); }
		public NotInOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notInOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterNotInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitNotInOperator(this);
		}
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
	public static class UnionOpExprContext extends SetOperatorContext {
		public UnionOperatorContext unionOperator() {
			return getRuleContext(UnionOperatorContext.class,0);
		}
		public UnionOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterUnionOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitUnionOpExpr(this);
		}
	}
	public static class IntersectionOpExprContext extends SetOperatorContext {
		public IntersectionOperatorContext intersectionOperator() {
			return getRuleContext(IntersectionOperatorContext.class,0);
		}
		public IntersectionOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIntersectionOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIntersectionOpExpr(this);
		}
	}
	public static class DifferenceOpExprContext extends SetOperatorContext {
		public SetdifferenceOperatorContext setdifferenceOperator() {
			return getRuleContext(SetdifferenceOperatorContext.class,0);
		}
		public DifferenceOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterDifferenceOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitDifferenceOpExpr(this);
		}
	}
	public static class CartesianProductOpExprContext extends SetOperatorContext {
		public CartesianProductOperatorContext cartesianProductOperator() {
			return getRuleContext(CartesianProductOperatorContext.class,0);
		}
		public CartesianProductOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterCartesianProductOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitCartesianProductOpExpr(this);
		}
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

	public static class CartesianProductOperatorContext extends ParserRuleContext {
		public TerminalNode CARTESIANPRODUCTOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.CARTESIANPRODUCTOPERATOR, 0); }
		public CartesianProductOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesianProductOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterCartesianProductOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitCartesianProductOperator(this);
		}
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

	public static class UnionOperatorContext extends ParserRuleContext {
		public TerminalNode UNIONOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.UNIONOPERATOR, 0); }
		public UnionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterUnionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitUnionOperator(this);
		}
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

	public static class IntersectionOperatorContext extends ParserRuleContext {
		public TerminalNode INTERSECTIONOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.INTERSECTIONOPERATOR, 0); }
		public IntersectionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterIntersectionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitIntersectionOperator(this);
		}
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

	public static class SetdifferenceOperatorContext extends ParserRuleContext {
		public TerminalNode SETDIFFERENCEOPERATOR() { return getToken(CFG_BOOLEAN_EXPRESSIONParser.SETDIFFERENCEOPERATOR, 0); }
		public SetdifferenceOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdifferenceOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).enterSetdifferenceOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_BOOLEAN_EXPRESSIONListener ) ((CFG_BOOLEAN_EXPRESSIONListener)listener).exitSetdifferenceOperator(this);
		}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0220\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\5\2\u00a8\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00b3\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00bf\n\4\3\5\3\5\5\5\u00c3"+
		"\n\5\3\6\3\6\3\6\3\6\7\6\u00c9\n\6\f\6\16\6\u00cc\13\6\3\7\3\7\5\7\u00d0"+
		"\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00d9\n\t\f\t\16\t\u00dc\13\t\3\n"+
		"\3\n\5\n\u00e0\n\n\3\13\3\13\3\13\5\13\u00e5\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u00ee\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00f8"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0100\n\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011a\n\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3!\3!\3!\5!\u0129\n!\3\"\3\"\3\"\7\"\u012e\n\"\f\""+
		"\16\"\u0131\13\"\3#\3#\3#\3#\3#\3#\5#\u0139\n#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\5*\u0149\n*\3+\3+\5+\u014d\n+\3,\3,\3,\3,\3-\3-\5"+
		"-\u0155\n-\3.\3.\3.\3.\3.\5.\u015c\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u016c\n\64\f\64\16\64\u016f\13"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u017a\n\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0183\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\7\67\u018f\n\67\f\67\16\67\u0192\13\67\3\67"+
		"\3\67\3\67\5\67\u0197\n\67\38\38\38\38\78\u019d\n8\f8\168\u01a0\138\3"+
		"8\38\38\58\u01a5\n8\39\39\39\39\79\u01ab\n9\f9\169\u01ae\139\39\39\39"+
		"\59\u01b3\n9\3:\3:\3:\7:\u01b8\n:\f:\16:\u01bb\13:\3;\3;\3;\5;\u01c0\n"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01ca\n<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u01d4"+
		"\n=\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01de\n>\3?\3?\3?\3?\3?\5?\u01e5\n?\3?"+
		"\3?\3@\3@\5@\u01eb\n@\3A\3A\5A\u01ef\nA\3B\3B\3C\3C\3D\3D\3D\3D\7D\u01f9"+
		"\nD\fD\16D\u01fc\13D\3E\3E\5E\u0200\nE\3F\3F\3F\3F\3G\3G\5G\u0208\nG\3"+
		"H\3H\5H\u020c\nH\3I\3I\3J\3J\3K\3K\3K\3K\5K\u0216\nK\3L\3L\3M\3M\3N\3"+
		"N\3O\3O\3O\2\2P\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\2\7\3\2\31"+
		"\32\3\2\3\5\4\2$$\64\64\4\2\65\6599\4\2\66\66::\2\u0214\2\u00a7\3\2\2"+
		"\2\4\u00b2\3\2\2\2\6\u00be\3\2\2\2\b\u00c2\3\2\2\2\n\u00c4\3\2\2\2\f\u00cf"+
		"\3\2\2\2\16\u00d1\3\2\2\2\20\u00d4\3\2\2\2\22\u00df\3\2\2\2\24\u00e4\3"+
		"\2\2\2\26\u00e6\3\2\2\2\30\u00ed\3\2\2\2\32\u00ef\3\2\2\2\34\u00f1\3\2"+
		"\2\2\36\u00f3\3\2\2\2 \u00f7\3\2\2\2\"\u00ff\3\2\2\2$\u0101\3\2\2\2&\u0103"+
		"\3\2\2\2(\u0105\3\2\2\2*\u0107\3\2\2\2,\u0109\3\2\2\2.\u010b\3\2\2\2\60"+
		"\u010d\3\2\2\2\62\u010f\3\2\2\2\64\u0111\3\2\2\2\66\u0119\3\2\2\28\u011b"+
		"\3\2\2\2:\u011d\3\2\2\2<\u0120\3\2\2\2>\u0122\3\2\2\2@\u0128\3\2\2\2B"+
		"\u012a\3\2\2\2D\u0138\3\2\2\2F\u013a\3\2\2\2H\u013c\3\2\2\2J\u013e\3\2"+
		"\2\2L\u0140\3\2\2\2N\u0142\3\2\2\2P\u0144\3\2\2\2R\u0148\3\2\2\2T\u014c"+
		"\3\2\2\2V\u014e\3\2\2\2X\u0154\3\2\2\2Z\u015b\3\2\2\2\\\u015d\3\2\2\2"+
		"^\u015f\3\2\2\2`\u0161\3\2\2\2b\u0163\3\2\2\2d\u0165\3\2\2\2f\u0179\3"+
		"\2\2\2h\u0182\3\2\2\2j\u0184\3\2\2\2l\u0196\3\2\2\2n\u01a4\3\2\2\2p\u01b2"+
		"\3\2\2\2r\u01b4\3\2\2\2t\u01bf\3\2\2\2v\u01c9\3\2\2\2x\u01d3\3\2\2\2z"+
		"\u01dd\3\2\2\2|\u01df\3\2\2\2~\u01ea\3\2\2\2\u0080\u01ee\3\2\2\2\u0082"+
		"\u01f0\3\2\2\2\u0084\u01f2\3\2\2\2\u0086\u01f4\3\2\2\2\u0088\u01ff\3\2"+
		"\2\2\u008a\u0201\3\2\2\2\u008c\u0207\3\2\2\2\u008e\u020b\3\2\2\2\u0090"+
		"\u020d\3\2\2\2\u0092\u020f\3\2\2\2\u0094\u0215\3\2\2\2\u0096\u0217\3\2"+
		"\2\2\u0098\u0219\3\2\2\2\u009a\u021b\3\2\2\2\u009c\u021d\3\2\2\2\u009e"+
		"\u009f\5\6\4\2\u009f\u00a0\7\2\2\3\u00a0\u00a8\3\2\2\2\u00a1\u00a2\5\4"+
		"\3\2\u00a2\u00a3\7\2\2\3\u00a3\u00a8\3\2\2\2\u00a4\u00a5\5\b\5\2\u00a5"+
		"\u00a6\7\2\2\3\u00a6\u00a8\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7\u00a1\3\2"+
		"\2\2\u00a7\u00a4\3\2\2\2\u00a8\3\3\2\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab"+
		"\5\b\5\2\u00ab\u00b3\3\2\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\79\2\2"+
		"\u00ae\u00af\5\b\5\2\u00af\u00b0\7:\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3"+
		"\5\34\17\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00b1\3\2\2\2"+
		"\u00b3\5\3\2\2\2\u00b4\u00b5\5\32\16\2\u00b5\u00b6\5\b\5\2\u00b6\u00b7"+
		"\7\30\2\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\79\2\2"+
		"\u00ba\u00bb\5\b\5\2\u00bb\u00bc\7:\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00bf"+
		"\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b8\3\2\2\2\u00bf\7\3\2\2\2\u00c0"+
		"\u00c3\5\n\6\2\u00c1\u00c3\5\f\7\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c3\t\3\2\2\2\u00c4\u00ca\5\f\7\2\u00c5\u00c6\5 \21\2\u00c6\u00c7"+
		"\5\f\7\2\u00c7\u00c9\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\13\3\2\2\2\u00cc\u00ca\3\2\2"+
		"\2\u00cd\u00d0\5\20\t\2\u00ce\u00d0\5\16\b\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\r\3\2\2\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\5\f\7"+
		"\2\u00d3\17\3\2\2\2\u00d4\u00da\5\22\n\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7"+
		"\5\22\n\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\21\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00e0\5\24\13\2\u00de\u00e0\5\26\f\2\u00df\u00dd\3\2\2"+
		"\2\u00df\u00de\3\2\2\2\u00e0\23\3\2\2\2\u00e1\u00e5\5h\65\2\u00e2\u00e5"+
		"\5t;\2\u00e3\u00e5\5N(\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00e7\79\2\2\u00e7\u00e8\5\b\5\2"+
		"\u00e8\u00e9\7:\2\2\u00e9\27\3\2\2\2\u00ea\u00ee\5N(\2\u00eb\u00ee\5h"+
		"\65\2\u00ec\u00ee\5t;\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00f0\7\27\2\2\u00f0\33\3\2\2\2"+
		"\u00f1\u00f2\t\2\2\2\u00f2\35\3\2\2\2\u00f3\u00f4\5$\23\2\u00f4\37\3\2"+
		"\2\2\u00f5\u00f8\5&\24\2\u00f6\u00f8\5(\25\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8!\3\2\2\2\u00f9\u0100\5*\26\2\u00fa\u0100\5,\27\2"+
		"\u00fb\u0100\5.\30\2\u00fc\u0100\5\60\31\2\u00fd\u0100\5\62\32\2\u00fe"+
		"\u0100\5\64\33\2\u00ff\u00f9\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3"+
		"\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"#\3\2\2\2\u0101\u0102\7#\2\2\u0102%\3\2\2\2\u0103\u0104\7$\2\2\u0104\'"+
		"\3\2\2\2\u0105\u0106\7%\2\2\u0106)\3\2\2\2\u0107\u0108\7&\2\2\u0108+\3"+
		"\2\2\2\u0109\u010a\7\'\2\2\u010a-\3\2\2\2\u010b\u010c\7(\2\2\u010c/\3"+
		"\2\2\2\u010d\u010e\7)\2\2\u010e\61\3\2\2\2\u010f\u0110\7*\2\2\u0110\63"+
		"\3\2\2\2\u0111\u0112\7+\2\2\u0112\65\3\2\2\2\u0113\u011a\58\35\2\u0114"+
		"\u0115\58\35\2\u0115\u0116\79\2\2\u0116\u0117\5B\"\2\u0117\u0118\7:\2"+
		"\2\u0118\u011a\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u011a\67"+
		"\3\2\2\2\u011b\u011c\t\3\2\2\u011c9\3\2\2\2\u011d\u011e\7\63\2\2\u011e"+
		"\u011f\7\4\2\2\u011f;\3\2\2\2\u0120\u0121\7\4\2\2\u0121=\3\2\2\2\u0122"+
		"\u0123\7\4\2\2\u0123\u0124\7\62\2\2\u0124?\3\2\2\2\u0125\u0129\5> \2\u0126"+
		"\u0129\5D#\2\u0127\u0129\5<\37\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2"+
		"\2\u0128\u0127\3\2\2\2\u0129A\3\2\2\2\u012a\u012f\5:\36\2\u012b\u012c"+
		"\7\64\2\2\u012c\u012e\5:\36\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130C\3\2\2\2\u0131\u012f\3"+
		"\2\2\2\u0132\u0139\5F$\2\u0133\u0139\5H%\2\u0134\u0139\5J&\2\u0135\u0139"+
		"\5L\'\2\u0136\u0139\5N(\2\u0137\u0139\5P)\2\u0138\u0132\3\2\2\2\u0138"+
		"\u0133\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0137\3\2\2\2\u0139E\3\2\2\2\u013a\u013b\7\21\2\2\u013bG\3"+
		"\2\2\2\u013c\u013d\7\22\2\2\u013dI\3\2\2\2\u013e\u013f\7\7\2\2\u013fK"+
		"\3\2\2\2\u0140\u0141\7\b\2\2\u0141M\3\2\2\2\u0142\u0143\7\33\2\2\u0143"+
		"O\3\2\2\2\u0144\u0145\7\6\2\2\u0145Q\3\2\2\2\u0146\u0149\5T+\2\u0147\u0149"+
		"\5V,\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149S\3\2\2\2\u014a\u014d"+
		"\5X-\2\u014b\u014d\5\u0086D\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2"+
		"\u014dU\3\2\2\2\u014e\u014f\5Z.\2\u014f\u0150\7=\2\2\u0150\u0151\5T+\2"+
		"\u0151W\3\2\2\2\u0152\u0155\5f\64\2\u0153\u0155\5j\66\2\u0154\u0152\3"+
		"\2\2\2\u0154\u0153\3\2\2\2\u0155Y\3\2\2\2\u0156\u015c\5\\/\2\u0157\u015c"+
		"\5^\60\2\u0158\u015c\5`\61\2\u0159\u015c\5b\62\2\u015a\u015c\5d\63\2\u015b"+
		"\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015a\3\2\2\2\u015c[\3\2\2\2\u015d\u015e\7\3\2\2\u015e]\3\2"+
		"\2\2\u015f\u0160\7\23\2\2\u0160_\3\2\2\2\u0161\u0162\7\24\2\2\u0162a\3"+
		"\2\2\2\u0163\u0164\7\25\2\2\u0164c\3\2\2\2\u0165\u0166\7\26\2\2\u0166"+
		"e\3\2\2\2\u0167\u0168\7\67\2\2\u0168\u016d\5h\65\2\u0169\u016a\7\64\2"+
		"\2\u016a\u016c\5h\65\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0171\78\2\2\u0171\u017a\3\2\2\2\u0172\u0173\7\67\2\2\u0173\u0174\5h"+
		"\65\2\u0174\u0175\7>\2\2\u0175\u0176\5t;\2\u0176\u0177\78\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u017a\5\u0082B\2\u0179\u0167\3\2\2\2\u0179\u0172\3\2\2"+
		"\2\u0179\u0178\3\2\2\2\u017ag\3\2\2\2\u017b\u0183\5<\37\2\u017c\u0183"+
		"\5\u0080A\2\u017d\u0183\5~@\2\u017e\u0183\5\66\34\2\u017f\u0183\5P)\2"+
		"\u0180\u0183\5l\67\2\u0181\u0183\5:\36\2\u0182\u017b\3\2\2\2\u0182\u017c"+
		"\3\2\2\2\u0182\u017d\3\2\2\2\u0182\u017e\3\2\2\2\u0182\u017f\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183i\3\2\2\2\u0184\u0185\7\67\2\2"+
		"\u0185\u0186\5l\67\2\u0186\u0187\7>\2\2\u0187\u0188\5r:\2\u0188\u0189"+
		"\78\2\2\u0189k\3\2\2\2\u018a\u018b\79\2\2\u018b\u0190\5h\65\2\u018c\u018d"+
		"\7\64\2\2\u018d\u018f\5h\65\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0193\u0194\7:\2\2\u0194\u0197\3\2\2\2\u0195\u0197\5\u0084C\2"+
		"\u0196\u018a\3\2\2\2\u0196\u0195\3\2\2\2\u0197m\3\2\2\2\u0198\u0199\7"+
		"9\2\2\u0199\u019e\5> \2\u019a\u019b\7\64\2\2\u019b\u019d\5> \2\u019c\u019a"+
		"\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7:\2\2\u01a2\u01a5\3\2"+
		"\2\2\u01a3\u01a5\5\u0084C\2\u01a4\u0198\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"o\3\2\2\2\u01a6\u01a7\79\2\2\u01a7\u01ac\5@!\2\u01a8\u01a9\7\64\2\2\u01a9"+
		"\u01ab\5@!\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0"+
		"\7:\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b3\5\u0084C\2\u01b2\u01a6\3\2\2\2"+
		"\u01b2\u01b1\3\2\2\2\u01b3q\3\2\2\2\u01b4\u01b9\5t;\2\u01b5\u01b6\t\4"+
		"\2\2\u01b6\u01b8\5t;\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01bas\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01c0\5v<\2\u01bd\u01c0\5x=\2\u01be\u01c0\5z>\2\u01bf\u01bc\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0u\3\2\2\2\u01c1\u01c2\5h\65\2"+
		"\u01c2\u01c3\5\u008eH\2\u01c3\u01c4\5T+\2\u01c4\u01ca\3\2\2\2\u01c5\u01c6"+
		"\5f\64\2\u01c6\u01c7\5\u008eH\2\u01c7\u01c8\5T+\2\u01c8\u01ca\3\2\2\2"+
		"\u01c9\u01c1\3\2\2\2\u01c9\u01c5\3\2\2\2\u01caw\3\2\2\2\u01cb\u01cc\5"+
		"h\65\2\u01cc\u01cd\5\u008eH\2\u01cd\u01ce\5Z.\2\u01ce\u01d4\3\2\2\2\u01cf"+
		"\u01d0\5f\64\2\u01d0\u01d1\5\u008eH\2\u01d1\u01d2\5Z.\2\u01d2\u01d4\3"+
		"\2\2\2\u01d3\u01cb\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d4y\3\2\2\2\u01d5\u01d6"+
		"\5h\65\2\u01d6\u01d7\5\u008eH\2\u01d7\u01d8\5|?\2\u01d8\u01de\3\2\2\2"+
		"\u01d9\u01da\5f\64\2\u01da\u01db\5\u008eH\2\u01db\u01dc\5|?\2\u01dc\u01de"+
		"\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd\u01d9\3\2\2\2\u01de{\3\2\2\2\u01df"+
		"\u01e0\t\5\2\2\u01e0\u01e1\5\u0080A\2\u01e1\u01e4\7\64\2\2\u01e2\u01e5"+
		"\5\u0080A\2\u01e3\u01e5\5N(\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2"+
		"\u01e5\u01e6\3\2\2\2\u01e6\u01e7\t\6\2\2\u01e7}\3\2\2\2\u01e8\u01eb\5"+
		"F$\2\u01e9\u01eb\5H%\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\177"+
		"\3\2\2\2\u01ec\u01ef\5J&\2\u01ed\u01ef\5L\'\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef\u0081\3\2\2\2\u01f0\u01f1\7\t\2\2\u01f1\u0083\3\2"+
		"\2\2\u01f2\u01f3\7\n\2\2\u01f3\u0085\3\2\2\2\u01f4\u01fa\5\u0088E\2\u01f5"+
		"\u01f6\5\u0094K\2\u01f6\u01f7\5\u0088E\2\u01f7\u01f9\3\2\2\2\u01f8\u01f5"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u0087\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0200\5\u008cG\2\u01fe\u0200"+
		"\5\u008aF\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0089\3\2\2"+
		"\2\u0201\u0202\79\2\2\u0202\u0203\5\u0086D\2\u0203\u0204\7:\2\2\u0204"+
		"\u008b\3\2\2\2\u0205\u0208\5X-\2\u0206\u0208\5Z.\2\u0207\u0205\3\2\2\2"+
		"\u0207\u0206\3\2\2\2\u0208\u008d\3\2\2\2\u0209\u020c\5\u0090I\2\u020a"+
		"\u020c\5\u0092J\2\u020b\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u008f"+
		"\3\2\2\2\u020d\u020e\7\35\2\2\u020e\u0091\3\2\2\2\u020f\u0210\7\36\2\2"+
		"\u0210\u0093\3\2\2\2\u0211\u0216\5\u0096L\2\u0212\u0216\5\u0098M\2\u0213"+
		"\u0216\5\u009aN\2\u0214\u0216\5\u009cO\2\u0215\u0211\3\2\2\2\u0215\u0212"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216\u0095\3\2\2\2\u0217"+
		"\u0218\7\37\2\2\u0218\u0097\3\2\2\2\u0219\u021a\7 \2\2\u021a\u0099\3\2"+
		"\2\2\u021b\u021c\7!\2\2\u021c\u009b\3\2\2\2\u021d\u021e\7\"\2\2\u021e"+
		"\u009d\3\2\2\2,\u00a7\u00b2\u00be\u00c2\u00ca\u00cf\u00da\u00df\u00e4"+
		"\u00ed\u00f7\u00ff\u0119\u0128\u012f\u0138\u0148\u014c\u0154\u015b\u016d"+
		"\u0179\u0182\u0190\u0196\u019e\u01a4\u01ac\u01b2\u01b9\u01bf\u01c9\u01d3"+
		"\u01dd\u01e4\u01ea\u01ee\u01fa\u01ff\u0207\u020b\u0215";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}