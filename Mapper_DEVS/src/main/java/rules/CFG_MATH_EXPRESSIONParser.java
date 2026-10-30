// Generated from CFG_MATH_EXPRESSION.g4 by ANTLR 4.4


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
public class CFG_MATH_EXPRESSIONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

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
	public static final String[] tokenNames = {
		"<INVALID>", "UPPERCASEID", "LOWERCASEID", "FULLCASEID", "STRINGSYMBOL", 
		"INTEGERSYMBOL", "REALSYMBOL", "'\\emptySet'", "'\\emptyTuple'", "'\\where'", 
		"'\\delExt'", "'\\delInt'", "'\\lambda'", "'\\select'", "'\\ta'", "'\\true'", 
		"'\\false'", "'\\Z'", "'\\N'", "'\\R'", "'\\B'", "'\\if'", "'\\then'", 
		"'\\inOtherCase'", "'\\otherwise'", "'\\infinity'", "'\\assign'", "'\\in'", 
		"'\\notIn'", "'\\product'", "'\\union'", "'\\intersection'", "'\\setDifference'", 
		"'\\not'", "'\\and'", "'\\or'", "'\\equalTo'", "'\\notEqualTo'", "'\\greaterThan'", 
		"'\\lessThan'", "'\\greaterThanOrEqualTo'", "'\\lessThanOrEqualTo'", "'\\sqrt'", 
		"'\\addition'", "'\\substraction'", "'\\multiplication'", "'\\division'", 
		"'\\power'", "'''", "'#'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'", 
		"':'", "';'", "'='", "'|'", "'\"'", "IGNOREEMPTY"
	};
	public static final int
		RULE_mathExpression = 0, RULE_binaryMathExpression = 1, RULE_mathExpressionTerm = 2, 
		RULE_unaryMathExpression = 3, RULE_mathTerm = 4, RULE_mathFactor = 5, 
		RULE_mathExpressionBasicTerm = 6, RULE_mathExpressionElement = 7, RULE_mathExpressionResult = 8, 
		RULE_unaryMathOperator = 9, RULE_binaryMathOperatorLowerPrecedence = 10, 
		RULE_binaryMathOperatorHigherPrecedence = 11, RULE_sqrtOperator = 12, 
		RULE_additionOperator = 13, RULE_substractionOperator = 14, RULE_multiplicationOperator = 15, 
		RULE_divisionOperator = 16, RULE_powerOperator = 17, RULE_modelSignature = 18, 
		RULE_modelSymbol = 19, RULE_parameter = 20, RULE_identifier = 21, RULE_variable = 22, 
		RULE_variableFixedValues = 23, RULE_parametersList = 24, RULE_datatypeSymbol = 25, 
		RULE_trueSymbol = 26, RULE_falseSymbol = 27, RULE_integerSymbol = 28, 
		RULE_realSymbol = 29, RULE_infinitySymbol = 30, RULE_stringSymbol = 31, 
		RULE_set = 32, RULE_setImplicitDefinition = 33, RULE_setExplicitDefinition = 34, 
		RULE_setDefinition = 35, RULE_setSymbol = 36, RULE_setName = 37, RULE_setOfIntegerNumbersSymbol = 38, 
		RULE_setOfNaturalNumbersSymbol = 39, RULE_setOfRealNumbersSymbol = 40, 
		RULE_setOfBooleanAlgebraSymbol = 41, RULE_elementCollection = 42, RULE_element = 43, 
		RULE_tupleCollection = 44, RULE_tuple = 45, RULE_variableTuple = 46, RULE_variableTupleFixedValues = 47, 
		RULE_tupleDefinition = 48, RULE_elementDefinition = 49, RULE_definitionWithSetImplicitDefinition = 50, 
		RULE_definitionWithSetSymbol = 51, RULE_definitionWithRange = 52, RULE_range = 53, 
		RULE_booleanSymbol = 54, RULE_numberSymbol = 55, RULE_emptySetSymbol = 56, 
		RULE_emptyTupleSymbol = 57, RULE_setOperationResult = 58, RULE_setOperationTerm = 59, 
		RULE_setOperationExpression = 60, RULE_operationSet = 61, RULE_belongsToOperator = 62, 
		RULE_inOperator = 63, RULE_notInOperator = 64, RULE_setOperator = 65, 
		RULE_cartesianProductOperator = 66, RULE_unionOperator = 67, RULE_intersectionOperator = 68, 
		RULE_setdifferenceOperator = 69;
	public static final String[] ruleNames = {
		"mathExpression", "binaryMathExpression", "mathExpressionTerm", "unaryMathExpression", 
		"mathTerm", "mathFactor", "mathExpressionBasicTerm", "mathExpressionElement", 
		"mathExpressionResult", "unaryMathOperator", "binaryMathOperatorLowerPrecedence", 
		"binaryMathOperatorHigherPrecedence", "sqrtOperator", "additionOperator", 
		"substractionOperator", "multiplicationOperator", "divisionOperator", 
		"powerOperator", "modelSignature", "modelSymbol", "parameter", "identifier", 
		"variable", "variableFixedValues", "parametersList", "datatypeSymbol", 
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

	@Override
	public String getGrammarFileName() { return "CFG_MATH_EXPRESSION.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CFG_MATH_EXPRESSIONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MathExpressionContext extends ParserRuleContext {
		public MathExpressionTermContext mathExpressionTerm() {
			return getRuleContext(MathExpressionTermContext.class,0);
		}
		public BinaryMathExpressionContext binaryMathExpression() {
			return getRuleContext(BinaryMathExpressionContext.class,0);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMathExpression(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mathExpression);
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); binaryMathExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); mathExpressionTerm();
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

	public static class BinaryMathExpressionContext extends ParserRuleContext {
		public MathExpressionTermContext left;
		public BinaryMathOperatorLowerPrecedenceContext op;
		public MathExpressionTermContext right;
		public List<MathExpressionTermContext> mathExpressionTerm() {
			return getRuleContexts(MathExpressionTermContext.class);
		}
		public BinaryMathOperatorLowerPrecedenceContext binaryMathOperatorLowerPrecedence() {
			return getRuleContext(BinaryMathOperatorLowerPrecedenceContext.class,0);
		}
		public MathExpressionTermContext mathExpressionTerm(int i) {
			return getRuleContext(MathExpressionTermContext.class,i);
		}
		public BinaryMathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterBinaryMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitBinaryMathExpression(this);
		}
	}

	public final BinaryMathExpressionContext binaryMathExpression() throws RecognitionException {
		BinaryMathExpressionContext _localctx = new BinaryMathExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_binaryMathExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); ((BinaryMathExpressionContext)_localctx).left = mathExpressionTerm();
			setState(145); ((BinaryMathExpressionContext)_localctx).op = binaryMathOperatorLowerPrecedence();
			setState(146); ((BinaryMathExpressionContext)_localctx).right = mathExpressionTerm();
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

	public static class MathExpressionTermContext extends ParserRuleContext {
		public UnaryMathExpressionContext unaryMathExpression() {
			return getRuleContext(UnaryMathExpressionContext.class,0);
		}
		public MathTermContext mathTerm() {
			return getRuleContext(MathTermContext.class,0);
		}
		public MathExpressionTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpressionTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMathExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMathExpressionTerm(this);
		}
	}

	public final MathExpressionTermContext mathExpressionTerm() throws RecognitionException {
		MathExpressionTermContext _localctx = new MathExpressionTermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mathExpressionTerm);
		try {
			setState(150);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(148); mathTerm();
				}
				break;
			case SQRTOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); unaryMathExpression();
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

	public static class UnaryMathExpressionContext extends ParserRuleContext {
		public UnaryMathOperatorContext op;
		public MathExpressionTermContext operand;
		public MathExpressionTermContext mathExpressionTerm() {
			return getRuleContext(MathExpressionTermContext.class,0);
		}
		public UnaryMathOperatorContext unaryMathOperator() {
			return getRuleContext(UnaryMathOperatorContext.class,0);
		}
		public UnaryMathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterUnaryMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitUnaryMathExpression(this);
		}
	}

	public final UnaryMathExpressionContext unaryMathExpression() throws RecognitionException {
		UnaryMathExpressionContext _localctx = new UnaryMathExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryMathExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); ((UnaryMathExpressionContext)_localctx).op = unaryMathOperator();
			setState(153); ((UnaryMathExpressionContext)_localctx).operand = mathExpressionTerm();
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

	public static class MathTermContext extends ParserRuleContext {
		public MathFactorContext left;
		public BinaryMathOperatorHigherPrecedenceContext op;
		public MathFactorContext right;
		public List<MathFactorContext> mathFactor() {
			return getRuleContexts(MathFactorContext.class);
		}
		public MathFactorContext mathFactor(int i) {
			return getRuleContext(MathFactorContext.class,i);
		}
		public BinaryMathOperatorHigherPrecedenceContext binaryMathOperatorHigherPrecedence(int i) {
			return getRuleContext(BinaryMathOperatorHigherPrecedenceContext.class,i);
		}
		public List<BinaryMathOperatorHigherPrecedenceContext> binaryMathOperatorHigherPrecedence() {
			return getRuleContexts(BinaryMathOperatorHigherPrecedenceContext.class);
		}
		public MathTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMathTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMathTerm(this);
		}
	}

	public final MathTermContext mathTerm() throws RecognitionException {
		MathTermContext _localctx = new MathTermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mathTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); ((MathTermContext)_localctx).left = mathFactor();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATIONOPERATOR || _la==DIVISIONOPERATOR) {
				{
				{
				setState(156); ((MathTermContext)_localctx).op = binaryMathOperatorHigherPrecedence();
				setState(157); ((MathTermContext)_localctx).right = mathFactor();
				}
				}
				setState(163);
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

	public static class MathFactorContext extends ParserRuleContext {
		public MathExpressionBasicTermContext left;
		public PowerOperatorContext op;
		public MathExpressionBasicTermContext right;
		public PowerOperatorContext powerOperator(int i) {
			return getRuleContext(PowerOperatorContext.class,i);
		}
		public MathExpressionBasicTermContext mathExpressionBasicTerm(int i) {
			return getRuleContext(MathExpressionBasicTermContext.class,i);
		}
		public List<PowerOperatorContext> powerOperator() {
			return getRuleContexts(PowerOperatorContext.class);
		}
		public List<MathExpressionBasicTermContext> mathExpressionBasicTerm() {
			return getRuleContexts(MathExpressionBasicTermContext.class);
		}
		public MathFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMathFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMathFactor(this);
		}
	}

	public final MathFactorContext mathFactor() throws RecognitionException {
		MathFactorContext _localctx = new MathFactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mathFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); ((MathFactorContext)_localctx).left = mathExpressionBasicTerm();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POWEROPERATOR) {
				{
				{
				setState(165); ((MathFactorContext)_localctx).op = powerOperator();
				setState(166); ((MathFactorContext)_localctx).right = mathExpressionBasicTerm();
				}
				}
				setState(172);
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

	public static class MathExpressionBasicTermContext extends ParserRuleContext {
		public MathExpressionElementContext mathExpressionElement() {
			return getRuleContext(MathExpressionElementContext.class,0);
		}
		public MathExpressionResultContext mathExpressionResult() {
			return getRuleContext(MathExpressionResultContext.class,0);
		}
		public MathExpressionBasicTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpressionBasicTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMathExpressionBasicTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMathExpressionBasicTerm(this);
		}
	}

	public final MathExpressionBasicTermContext mathExpressionBasicTerm() throws RecognitionException {
		MathExpressionBasicTermContext _localctx = new MathExpressionBasicTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpressionBasicTerm);
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); mathExpressionElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); mathExpressionResult();
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

	public static class MathExpressionElementContext extends ParserRuleContext {
		public ElementContext el;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public MathExpressionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpressionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMathExpressionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMathExpressionElement(this);
		}
	}

	public final MathExpressionElementContext mathExpressionElement() throws RecognitionException {
		MathExpressionElementContext _localctx = new MathExpressionElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mathExpressionElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((MathExpressionElementContext)_localctx).el = element();
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

	public static class MathExpressionResultContext extends ParserRuleContext {
		public MathExpressionContext inner;
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public MathExpressionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpressionResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMathExpressionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMathExpressionResult(this);
		}
	}

	public final MathExpressionResultContext mathExpressionResult() throws RecognitionException {
		MathExpressionResultContext _localctx = new MathExpressionResultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mathExpressionResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(BEGINPARENTHESES);
			setState(180); ((MathExpressionResultContext)_localctx).inner = mathExpression();
			setState(181); match(ENDPARENTHESES);
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

	public static class UnaryMathOperatorContext extends ParserRuleContext {
		public SqrtOperatorContext sqrtOperator() {
			return getRuleContext(SqrtOperatorContext.class,0);
		}
		public UnaryMathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterUnaryMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitUnaryMathOperator(this);
		}
	}

	public final UnaryMathOperatorContext unaryMathOperator() throws RecognitionException {
		UnaryMathOperatorContext _localctx = new UnaryMathOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryMathOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); sqrtOperator();
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

	public static class BinaryMathOperatorLowerPrecedenceContext extends ParserRuleContext {
		public AdditionOperatorContext additionOperator() {
			return getRuleContext(AdditionOperatorContext.class,0);
		}
		public SubstractionOperatorContext substractionOperator() {
			return getRuleContext(SubstractionOperatorContext.class,0);
		}
		public BinaryMathOperatorLowerPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMathOperatorLowerPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterBinaryMathOperatorLowerPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitBinaryMathOperatorLowerPrecedence(this);
		}
	}

	public final BinaryMathOperatorLowerPrecedenceContext binaryMathOperatorLowerPrecedence() throws RecognitionException {
		BinaryMathOperatorLowerPrecedenceContext _localctx = new BinaryMathOperatorLowerPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_binaryMathOperatorLowerPrecedence);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case ADDITIONOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); additionOperator();
				}
				break;
			case SUBSTRACTIONOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); substractionOperator();
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

	public static class BinaryMathOperatorHigherPrecedenceContext extends ParserRuleContext {
		public MultiplicationOperatorContext multiplicationOperator() {
			return getRuleContext(MultiplicationOperatorContext.class,0);
		}
		public DivisionOperatorContext divisionOperator() {
			return getRuleContext(DivisionOperatorContext.class,0);
		}
		public BinaryMathOperatorHigherPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMathOperatorHigherPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterBinaryMathOperatorHigherPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitBinaryMathOperatorHigherPrecedence(this);
		}
	}

	public final BinaryMathOperatorHigherPrecedenceContext binaryMathOperatorHigherPrecedence() throws RecognitionException {
		BinaryMathOperatorHigherPrecedenceContext _localctx = new BinaryMathOperatorHigherPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binaryMathOperatorHigherPrecedence);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case MULTIPLICATIONOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); multiplicationOperator();
				}
				break;
			case DIVISIONOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); divisionOperator();
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

	public static class SqrtOperatorContext extends ParserRuleContext {
		public TerminalNode SQRTOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.SQRTOPERATOR, 0); }
		public SqrtOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrtOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSqrtOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSqrtOperator(this);
		}
	}

	public final SqrtOperatorContext sqrtOperator() throws RecognitionException {
		SqrtOperatorContext _localctx = new SqrtOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sqrtOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(SQRTOPERATOR);
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

	public static class AdditionOperatorContext extends ParserRuleContext {
		public TerminalNode ADDITIONOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.ADDITIONOPERATOR, 0); }
		public AdditionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterAdditionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitAdditionOperator(this);
		}
	}

	public final AdditionOperatorContext additionOperator() throws RecognitionException {
		AdditionOperatorContext _localctx = new AdditionOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(ADDITIONOPERATOR);
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

	public static class SubstractionOperatorContext extends ParserRuleContext {
		public TerminalNode SUBSTRACTIONOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.SUBSTRACTIONOPERATOR, 0); }
		public SubstractionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substractionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSubstractionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSubstractionOperator(this);
		}
	}

	public final SubstractionOperatorContext substractionOperator() throws RecognitionException {
		SubstractionOperatorContext _localctx = new SubstractionOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_substractionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(SUBSTRACTIONOPERATOR);
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

	public static class MultiplicationOperatorContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATIONOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.MULTIPLICATIONOPERATOR, 0); }
		public MultiplicationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterMultiplicationOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitMultiplicationOperator(this);
		}
	}

	public final MultiplicationOperatorContext multiplicationOperator() throws RecognitionException {
		MultiplicationOperatorContext _localctx = new MultiplicationOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplicationOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(MULTIPLICATIONOPERATOR);
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

	public static class DivisionOperatorContext extends ParserRuleContext {
		public TerminalNode DIVISIONOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.DIVISIONOPERATOR, 0); }
		public DivisionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterDivisionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitDivisionOperator(this);
		}
	}

	public final DivisionOperatorContext divisionOperator() throws RecognitionException {
		DivisionOperatorContext _localctx = new DivisionOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_divisionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(DIVISIONOPERATOR);
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

	public static class PowerOperatorContext extends ParserRuleContext {
		public TerminalNode POWEROPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.POWEROPERATOR, 0); }
		public PowerOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterPowerOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitPowerOperator(this);
		}
	}

	public final PowerOperatorContext powerOperator() throws RecognitionException {
		PowerOperatorContext _localctx = new PowerOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_powerOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(POWEROPERATOR);
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
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public ModelSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterModelSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitModelSignature(this);
		}
	}

	public final ModelSignatureContext modelSignature() throws RecognitionException {
		ModelSignatureContext _localctx = new ModelSignatureContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modelSignature);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); modelSymbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); modelSymbol();
				setState(207); match(BEGINPARENTHESES);
				setState(208); parametersList();
				setState(209); match(ENDPARENTHESES);
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
		public TerminalNode FULLCASEID() { return getToken(CFG_MATH_EXPRESSIONParser.FULLCASEID, 0); }
		public TerminalNode UPPERCASEID() { return getToken(CFG_MATH_EXPRESSIONParser.UPPERCASEID, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_MATH_EXPRESSIONParser.LOWERCASEID, 0); }
		public ModelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterModelSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitModelSymbol(this);
		}
	}

	public final ModelSymbolContext modelSymbol() throws RecognitionException {
		ModelSymbolContext _localctx = new ModelSymbolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modelSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPPERCASEID) | (1L << LOWERCASEID) | (1L << FULLCASEID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode LOWERCASEID() { return getToken(CFG_MATH_EXPRESSIONParser.LOWERCASEID, 0); }
		public TerminalNode HASH() { return getToken(CFG_MATH_EXPRESSIONParser.HASH, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(HASH);
			setState(216); match(LOWERCASEID);
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
		public TerminalNode LOWERCASEID() { return getToken(CFG_MATH_EXPRESSIONParser.LOWERCASEID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(LOWERCASEID);
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
		public TerminalNode APOSTROPHE() { return getToken(CFG_MATH_EXPRESSIONParser.APOSTROPHE, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_MATH_EXPRESSIONParser.LOWERCASEID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(LOWERCASEID);
			setState(221); match(APOSTROPHE);
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
		public DatatypeSymbolContext datatypeSymbol() {
			return getRuleContext(DatatypeSymbolContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableFixedValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableFixedValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterVariableFixedValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitVariableFixedValues(this);
		}
	}

	public final VariableFixedValuesContext variableFixedValues() throws RecognitionException {
		VariableFixedValuesContext _localctx = new VariableFixedValuesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableFixedValues);
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); datatypeSymbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225); identifier();
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
		public List<TerminalNode> COMMA() { return getTokens(CFG_MATH_EXPRESSIONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_MATH_EXPRESSIONParser.COMMA, i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitParametersList(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); parameter();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229); match(COMMA);
				setState(230); parameter();
				}
				}
				setState(235);
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
		public FalseSymbolContext falseSymbol() {
			return getRuleContext(FalseSymbolContext.class,0);
		}
		public StringSymbolContext stringSymbol() {
			return getRuleContext(StringSymbolContext.class,0);
		}
		public TrueSymbolContext trueSymbol() {
			return getRuleContext(TrueSymbolContext.class,0);
		}
		public IntegerSymbolContext integerSymbol() {
			return getRuleContext(IntegerSymbolContext.class,0);
		}
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public RealSymbolContext realSymbol() {
			return getRuleContext(RealSymbolContext.class,0);
		}
		public DatatypeSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatypeSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterDatatypeSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitDatatypeSymbol(this);
		}
	}

	public final DatatypeSymbolContext datatypeSymbol() throws RecognitionException {
		DatatypeSymbolContext _localctx = new DatatypeSymbolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_datatypeSymbol);
		try {
			setState(242);
			switch (_input.LA(1)) {
			case TRUESYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); trueSymbol();
				}
				break;
			case FALSESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(237); falseSymbol();
				}
				break;
			case INTEGERSYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(238); integerSymbol();
				}
				break;
			case REALSYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(239); realSymbol();
				}
				break;
			case INFINITYSYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(240); infinitySymbol();
				}
				break;
			case STRINGSYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(241); stringSymbol();
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
		public TerminalNode TRUESYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.TRUESYMBOL, 0); }
		public TrueSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterTrueSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitTrueSymbol(this);
		}
	}

	public final TrueSymbolContext trueSymbol() throws RecognitionException {
		TrueSymbolContext _localctx = new TrueSymbolContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_trueSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(TRUESYMBOL);
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
		public TerminalNode FALSESYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.FALSESYMBOL, 0); }
		public FalseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterFalseSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitFalseSymbol(this);
		}
	}

	public final FalseSymbolContext falseSymbol() throws RecognitionException {
		FalseSymbolContext _localctx = new FalseSymbolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_falseSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(FALSESYMBOL);
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
		public TerminalNode INTEGERSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.INTEGERSYMBOL, 0); }
		public IntegerSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterIntegerSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitIntegerSymbol(this);
		}
	}

	public final IntegerSymbolContext integerSymbol() throws RecognitionException {
		IntegerSymbolContext _localctx = new IntegerSymbolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_integerSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); match(INTEGERSYMBOL);
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
		public TerminalNode REALSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.REALSYMBOL, 0); }
		public RealSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterRealSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitRealSymbol(this);
		}
	}

	public final RealSymbolContext realSymbol() throws RecognitionException {
		RealSymbolContext _localctx = new RealSymbolContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_realSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(REALSYMBOL);
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
		public TerminalNode INFINITYSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.INFINITYSYMBOL, 0); }
		public InfinitySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitySymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterInfinitySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitInfinitySymbol(this);
		}
	}

	public final InfinitySymbolContext infinitySymbol() throws RecognitionException {
		InfinitySymbolContext _localctx = new InfinitySymbolContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_infinitySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(INFINITYSYMBOL);
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
		public TerminalNode STRINGSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.STRINGSYMBOL, 0); }
		public StringSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterStringSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitStringSymbol(this);
		}
	}

	public final StringSymbolContext stringSymbol() throws RecognitionException {
		StringSymbolContext _localctx = new StringSymbolContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stringSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); match(STRINGSYMBOL);
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
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public SetExplicitDefinitionContext setExplicitDefinition() {
			return getRuleContext(SetExplicitDefinitionContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_set);
		try {
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); setImplicitDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); setExplicitDefinition();
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
		public SetDefinitionContext setDefinition() {
			return getRuleContext(SetDefinitionContext.class,0);
		}
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public SetImplicitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setImplicitDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetImplicitDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetImplicitDefinition(this);
		}
	}

	public final SetImplicitDefinitionContext setImplicitDefinition() throws RecognitionException {
		SetImplicitDefinitionContext _localctx = new SetImplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setImplicitDefinition);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); setDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); setOperationResult();
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
		public TerminalNode EQUAL() { return getToken(CFG_MATH_EXPRESSIONParser.EQUAL, 0); }
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public SetExplicitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExplicitDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetExplicitDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetExplicitDefinition(this);
		}
	}

	public final SetExplicitDefinitionContext setExplicitDefinition() throws RecognitionException {
		SetExplicitDefinitionContext _localctx = new SetExplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_setExplicitDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); setSymbol();
			setState(265); match(EQUAL);
			setState(266); setImplicitDefinition();
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
		public TupleCollectionContext tupleCollection() {
			return getRuleContext(TupleCollectionContext.class,0);
		}
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public SetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetDefinition(this);
		}
	}

	public final SetDefinitionContext setDefinition() throws RecognitionException {
		SetDefinitionContext _localctx = new SetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setDefinition);
		try {
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); elementCollection();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); tupleCollection();
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
		public SetOfNaturalNumbersSymbolContext setOfNaturalNumbersSymbol() {
			return getRuleContext(SetOfNaturalNumbersSymbolContext.class,0);
		}
		public SetOfBooleanAlgebraSymbolContext setOfBooleanAlgebraSymbol() {
			return getRuleContext(SetOfBooleanAlgebraSymbolContext.class,0);
		}
		public SetOfIntegerNumbersSymbolContext setOfIntegerNumbersSymbol() {
			return getRuleContext(SetOfIntegerNumbersSymbolContext.class,0);
		}
		public SetNameContext setName() {
			return getRuleContext(SetNameContext.class,0);
		}
		public SetOfRealNumbersSymbolContext setOfRealNumbersSymbol() {
			return getRuleContext(SetOfRealNumbersSymbolContext.class,0);
		}
		public SetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetSymbol(this);
		}
	}

	public final SetSymbolContext setSymbol() throws RecognitionException {
		SetSymbolContext _localctx = new SetSymbolContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_setSymbol);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case UPPERCASEID:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); setName();
				}
				break;
			case SETZSYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); setOfIntegerNumbersSymbol();
				}
				break;
			case SETNSYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(274); setOfNaturalNumbersSymbol();
				}
				break;
			case SETRSYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(275); setOfRealNumbersSymbol();
				}
				break;
			case SETBSYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(276); setOfBooleanAlgebraSymbol();
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
		public TerminalNode UPPERCASEID() { return getToken(CFG_MATH_EXPRESSIONParser.UPPERCASEID, 0); }
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetName(this);
		}
	}

	public final SetNameContext setName() throws RecognitionException {
		SetNameContext _localctx = new SetNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_setName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(UPPERCASEID);
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
		public TerminalNode SETZSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.SETZSYMBOL, 0); }
		public SetOfIntegerNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfIntegerNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOfIntegerNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOfIntegerNumbersSymbol(this);
		}
	}

	public final SetOfIntegerNumbersSymbolContext setOfIntegerNumbersSymbol() throws RecognitionException {
		SetOfIntegerNumbersSymbolContext _localctx = new SetOfIntegerNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_setOfIntegerNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); match(SETZSYMBOL);
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
		public TerminalNode SETNSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.SETNSYMBOL, 0); }
		public SetOfNaturalNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfNaturalNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOfNaturalNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOfNaturalNumbersSymbol(this);
		}
	}

	public final SetOfNaturalNumbersSymbolContext setOfNaturalNumbersSymbol() throws RecognitionException {
		SetOfNaturalNumbersSymbolContext _localctx = new SetOfNaturalNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_setOfNaturalNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(SETNSYMBOL);
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
		public TerminalNode SETRSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.SETRSYMBOL, 0); }
		public SetOfRealNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfRealNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOfRealNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOfRealNumbersSymbol(this);
		}
	}

	public final SetOfRealNumbersSymbolContext setOfRealNumbersSymbol() throws RecognitionException {
		SetOfRealNumbersSymbolContext _localctx = new SetOfRealNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_setOfRealNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(SETRSYMBOL);
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
		public TerminalNode SETBSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.SETBSYMBOL, 0); }
		public SetOfBooleanAlgebraSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfBooleanAlgebraSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOfBooleanAlgebraSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOfBooleanAlgebraSymbol(this);
		}
	}

	public final SetOfBooleanAlgebraSymbolContext setOfBooleanAlgebraSymbol() throws RecognitionException {
		SetOfBooleanAlgebraSymbolContext _localctx = new SetOfBooleanAlgebraSymbolContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_setOfBooleanAlgebraSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(SETBSYMBOL);
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public EmptySetSymbolContext emptySetSymbol() {
			return getRuleContext(EmptySetSymbolContext.class,0);
		}
		public ElementDefinitionContext elementDefinition() {
			return getRuleContext(ElementDefinitionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_MATH_EXPRESSIONParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode ENDSET() { return getToken(CFG_MATH_EXPRESSIONParser.ENDSET, 0); }
		public TerminalNode SUCHTHAT() { return getToken(CFG_MATH_EXPRESSIONParser.SUCHTHAT, 0); }
		public TerminalNode BEGINSET() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINSET, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_MATH_EXPRESSIONParser.COMMA, i);
		}
		public ElementCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterElementCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitElementCollection(this);
		}
	}

	public final ElementCollectionContext elementCollection() throws RecognitionException {
		ElementCollectionContext _localctx = new ElementCollectionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elementCollection);
		int _la;
		try {
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289); match(BEGINSET);
				setState(290); element();
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(291); match(COMMA);
					setState(292); element();
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298); match(ENDSET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); match(BEGINSET);
				setState(301); element();
				setState(302); match(SUCHTHAT);
				setState(303); elementDefinition();
				setState(304); match(ENDSET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306); emptySetSymbol();
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
		public ModelSignatureContext modelSignature() {
			return getRuleContext(ModelSignatureContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public StringSymbolContext stringSymbol() {
			return getRuleContext(StringSymbolContext.class,0);
		}
		public NumberSymbolContext numberSymbol() {
			return getRuleContext(NumberSymbolContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanSymbolContext booleanSymbol() {
			return getRuleContext(BooleanSymbolContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_element);
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); numberSymbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311); booleanSymbol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312); modelSignature();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(313); stringSymbol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(314); tuple();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(315); parameter();
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
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public TerminalNode SUCHTHAT() { return getToken(CFG_MATH_EXPRESSIONParser.SUCHTHAT, 0); }
		public TerminalNode ENDSET() { return getToken(CFG_MATH_EXPRESSIONParser.ENDSET, 0); }
		public TerminalNode BEGINSET() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINSET, 0); }
		public TupleDefinitionContext tupleDefinition() {
			return getRuleContext(TupleDefinitionContext.class,0);
		}
		public TupleCollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleCollection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterTupleCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitTupleCollection(this);
		}
	}

	public final TupleCollectionContext tupleCollection() throws RecognitionException {
		TupleCollectionContext _localctx = new TupleCollectionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tupleCollection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); match(BEGINSET);
			setState(319); tuple();
			setState(320); match(SUCHTHAT);
			setState(321); tupleDefinition();
			setState(322); match(ENDSET);
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
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CFG_MATH_EXPRESSIONParser.COMMA); }
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CFG_MATH_EXPRESSIONParser.COMMA, i);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitTuple(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tuple);
		int _la;
		try {
			setState(336);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); match(BEGINPARENTHESES);
				setState(325); element();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(326); match(COMMA);
					setState(327); element();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333); match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); emptyTupleSymbol();
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
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CFG_MATH_EXPRESSIONParser.COMMA); }
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CFG_MATH_EXPRESSIONParser.COMMA, i);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public VariableTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterVariableTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitVariableTuple(this);
		}
	}

	public final VariableTupleContext variableTuple() throws RecognitionException {
		VariableTupleContext _localctx = new VariableTupleContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableTuple);
		int _la;
		try {
			setState(350);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); match(BEGINPARENTHESES);
				setState(339); variable();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(340); match(COMMA);
					setState(341); variable();
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347); match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(349); emptyTupleSymbol();
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
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CFG_MATH_EXPRESSIONParser.COMMA); }
		public List<VariableFixedValuesContext> variableFixedValues() {
			return getRuleContexts(VariableFixedValuesContext.class);
		}
		public EmptyTupleSymbolContext emptyTupleSymbol() {
			return getRuleContext(EmptyTupleSymbolContext.class,0);
		}
		public VariableFixedValuesContext variableFixedValues(int i) {
			return getRuleContext(VariableFixedValuesContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CFG_MATH_EXPRESSIONParser.COMMA, i);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public VariableTupleFixedValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTupleFixedValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterVariableTupleFixedValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitVariableTupleFixedValues(this);
		}
	}

	public final VariableTupleFixedValuesContext variableTupleFixedValues() throws RecognitionException {
		VariableTupleFixedValuesContext _localctx = new VariableTupleFixedValuesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_variableTupleFixedValues);
		int _la;
		try {
			setState(364);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(352); match(BEGINPARENTHESES);
				setState(353); variableFixedValues();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(354); match(COMMA);
					setState(355); variableFixedValues();
					}
					}
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(361); match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(363); emptyTupleSymbol();
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
		public TerminalNode ANDOPERATOR(int i) {
			return getToken(CFG_MATH_EXPRESSIONParser.ANDOPERATOR, i);
		}
		public List<ElementDefinitionContext> elementDefinition() {
			return getRuleContexts(ElementDefinitionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_MATH_EXPRESSIONParser.COMMA); }
		public List<TerminalNode> ANDOPERATOR() { return getTokens(CFG_MATH_EXPRESSIONParser.ANDOPERATOR); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_MATH_EXPRESSIONParser.COMMA, i);
		}
		public ElementDefinitionContext elementDefinition(int i) {
			return getRuleContext(ElementDefinitionContext.class,i);
		}
		public TupleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterTupleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitTupleDefinition(this);
		}
	}

	public final TupleDefinitionContext tupleDefinition() throws RecognitionException {
		TupleDefinitionContext _localctx = new TupleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tupleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); elementDefinition();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDOPERATOR || _la==COMMA) {
				{
				{
				setState(367);
				_la = _input.LA(1);
				if ( !(_la==ANDOPERATOR || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(368); elementDefinition();
				}
				}
				setState(373);
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
		public DefinitionWithRangeContext definitionWithRange() {
			return getRuleContext(DefinitionWithRangeContext.class,0);
		}
		public DefinitionWithSetSymbolContext definitionWithSetSymbol() {
			return getRuleContext(DefinitionWithSetSymbolContext.class,0);
		}
		public DefinitionWithSetImplicitDefinitionContext definitionWithSetImplicitDefinition() {
			return getRuleContext(DefinitionWithSetImplicitDefinitionContext.class,0);
		}
		public ElementDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterElementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitElementDefinition(this);
		}
	}

	public final ElementDefinitionContext elementDefinition() throws RecognitionException {
		ElementDefinitionContext _localctx = new ElementDefinitionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_elementDefinition);
		try {
			setState(377);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); definitionWithSetImplicitDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375); definitionWithSetSymbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(376); definitionWithRange();
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public DefinitionWithSetImplicitDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionWithSetImplicitDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterDefinitionWithSetImplicitDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitDefinitionWithSetImplicitDefinition(this);
		}
	}

	public final DefinitionWithSetImplicitDefinitionContext definitionWithSetImplicitDefinition() throws RecognitionException {
		DefinitionWithSetImplicitDefinitionContext _localctx = new DefinitionWithSetImplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_definitionWithSetImplicitDefinition);
		try {
			setState(387);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(379); element();
				setState(380); belongsToOperator();
				setState(381); setImplicitDefinition();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(383); elementCollection();
				setState(384); belongsToOperator();
				setState(385); setImplicitDefinition();
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public DefinitionWithSetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionWithSetSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterDefinitionWithSetSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitDefinitionWithSetSymbol(this);
		}
	}

	public final DefinitionWithSetSymbolContext definitionWithSetSymbol() throws RecognitionException {
		DefinitionWithSetSymbolContext _localctx = new DefinitionWithSetSymbolContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_definitionWithSetSymbol);
		try {
			setState(397);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(389); element();
				setState(390); belongsToOperator();
				setState(391); setSymbol();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(393); elementCollection();
				setState(394); belongsToOperator();
				setState(395); setSymbol();
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public BelongsToOperatorContext belongsToOperator() {
			return getRuleContext(BelongsToOperatorContext.class,0);
		}
		public ElementCollectionContext elementCollection() {
			return getRuleContext(ElementCollectionContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public DefinitionWithRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionWithRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterDefinitionWithRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitDefinitionWithRange(this);
		}
	}

	public final DefinitionWithRangeContext definitionWithRange() throws RecognitionException {
		DefinitionWithRangeContext _localctx = new DefinitionWithRangeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_definitionWithRange);
		try {
			setState(407);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(399); element();
				setState(400); belongsToOperator();
				setState(401); range();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); elementCollection();
				setState(404); belongsToOperator();
				setState(405); range();
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
		public NumberSymbolContext numberSymbol(int i) {
			return getRuleContext(NumberSymbolContext.class,i);
		}
		public TerminalNode ENDBRACKET() { return getToken(CFG_MATH_EXPRESSIONParser.ENDBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(CFG_MATH_EXPRESSIONParser.COMMA, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public TerminalNode BEGINBRACKET() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINBRACKET, 0); }
		public List<NumberSymbolContext> numberSymbol() {
			return getRuleContexts(NumberSymbolContext.class);
		}
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==BEGINBRACKET || _la==BEGINPARENTHESES) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(410); numberSymbol();
			setState(411); match(COMMA);
			setState(414);
			switch (_input.LA(1)) {
			case INTEGERSYMBOL:
			case REALSYMBOL:
				{
				setState(412); numberSymbol();
				}
				break;
			case INFINITYSYMBOL:
				{
				setState(413); infinitySymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==ENDBRACKET || _la==ENDPARENTHESES) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public FalseSymbolContext falseSymbol() {
			return getRuleContext(FalseSymbolContext.class,0);
		}
		public TrueSymbolContext trueSymbol() {
			return getRuleContext(TrueSymbolContext.class,0);
		}
		public BooleanSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterBooleanSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitBooleanSymbol(this);
		}
	}

	public final BooleanSymbolContext booleanSymbol() throws RecognitionException {
		BooleanSymbolContext _localctx = new BooleanSymbolContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_booleanSymbol);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case TRUESYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(418); trueSymbol();
				}
				break;
			case FALSESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(419); falseSymbol();
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
		public IntegerSymbolContext integerSymbol() {
			return getRuleContext(IntegerSymbolContext.class,0);
		}
		public RealSymbolContext realSymbol() {
			return getRuleContext(RealSymbolContext.class,0);
		}
		public NumberSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterNumberSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitNumberSymbol(this);
		}
	}

	public final NumberSymbolContext numberSymbol() throws RecognitionException {
		NumberSymbolContext _localctx = new NumberSymbolContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_numberSymbol);
		try {
			setState(424);
			switch (_input.LA(1)) {
			case INTEGERSYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(422); integerSymbol();
				}
				break;
			case REALSYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(423); realSymbol();
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
		public TerminalNode EMPTYSETSYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.EMPTYSETSYMBOL, 0); }
		public EmptySetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptySetSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterEmptySetSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitEmptySetSymbol(this);
		}
	}

	public final EmptySetSymbolContext emptySetSymbol() throws RecognitionException {
		EmptySetSymbolContext _localctx = new EmptySetSymbolContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_emptySetSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); match(EMPTYSETSYMBOL);
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
		public TerminalNode EMPTYTUPLESYMBOL() { return getToken(CFG_MATH_EXPRESSIONParser.EMPTYTUPLESYMBOL, 0); }
		public EmptyTupleSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyTupleSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterEmptyTupleSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitEmptyTupleSymbol(this);
		}
	}

	public final EmptyTupleSymbolContext emptyTupleSymbol() throws RecognitionException {
		EmptyTupleSymbolContext _localctx = new EmptyTupleSymbolContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_emptyTupleSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(EMPTYTUPLESYMBOL);
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
		public List<SetOperationTermContext> setOperationTerm() {
			return getRuleContexts(SetOperationTermContext.class);
		}
		public SetOperatorContext setOperator(int i) {
			return getRuleContext(SetOperatorContext.class,i);
		}
		public List<SetOperatorContext> setOperator() {
			return getRuleContexts(SetOperatorContext.class);
		}
		public SetOperationTermContext setOperationTerm(int i) {
			return getRuleContext(SetOperationTermContext.class,i);
		}
		public SetOperationResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperationResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOperationResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOperationResult(this);
		}
	}

	public final SetOperationResultContext setOperationResult() throws RecognitionException {
		SetOperationResultContext _localctx = new SetOperationResultContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_setOperationResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); setOperationTerm();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARTESIANPRODUCTOPERATOR) | (1L << UNIONOPERATOR) | (1L << INTERSECTIONOPERATOR) | (1L << SETDIFFERENCEOPERATOR))) != 0)) {
				{
				{
				setState(431); setOperator();
				setState(432); setOperationTerm();
				}
				}
				setState(438);
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
		public OperationSetContext operationSet() {
			return getRuleContext(OperationSetContext.class,0);
		}
		public SetOperationExpressionContext setOperationExpression() {
			return getRuleContext(SetOperationExpressionContext.class,0);
		}
		public SetOperationTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperationTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOperationTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOperationTerm(this);
		}
	}

	public final SetOperationTermContext setOperationTerm() throws RecognitionException {
		SetOperationTermContext _localctx = new SetOperationTermContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setOperationTerm);
		try {
			setState(441);
			switch (_input.LA(1)) {
			case UPPERCASEID:
			case EMPTYSETSYMBOL:
			case SETZSYMBOL:
			case SETNSYMBOL:
			case SETRSYMBOL:
			case SETBSYMBOL:
			case BEGINSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(439); operationSet();
				}
				break;
			case BEGINPARENTHESES:
				enterOuterAlt(_localctx, 2);
				{
				setState(440); setOperationExpression();
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
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.ENDPARENTHESES, 0); }
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_MATH_EXPRESSIONParser.BEGINPARENTHESES, 0); }
		public SetOperationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOperationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOperationExpression(this);
		}
	}

	public final SetOperationExpressionContext setOperationExpression() throws RecognitionException {
		SetOperationExpressionContext _localctx = new SetOperationExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_setOperationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); match(BEGINPARENTHESES);
			setState(444); setOperationResult();
			setState(445); match(ENDPARENTHESES);
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
		public SetDefinitionContext setDefinition() {
			return getRuleContext(SetDefinitionContext.class,0);
		}
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public OperationSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterOperationSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitOperationSet(this);
		}
	}

	public final OperationSetContext operationSet() throws RecognitionException {
		OperationSetContext _localctx = new OperationSetContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_operationSet);
		try {
			setState(449);
			switch (_input.LA(1)) {
			case EMPTYSETSYMBOL:
			case BEGINSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(447); setDefinition();
				}
				break;
			case UPPERCASEID:
			case SETZSYMBOL:
			case SETNSYMBOL:
			case SETRSYMBOL:
			case SETBSYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(448); setSymbol();
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
		public InOperatorContext inOperator() {
			return getRuleContext(InOperatorContext.class,0);
		}
		public NotInOperatorContext notInOperator() {
			return getRuleContext(NotInOperatorContext.class,0);
		}
		public BelongsToOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belongsToOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterBelongsToOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitBelongsToOperator(this);
		}
	}

	public final BelongsToOperatorContext belongsToOperator() throws RecognitionException {
		BelongsToOperatorContext _localctx = new BelongsToOperatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_belongsToOperator);
		try {
			setState(453);
			switch (_input.LA(1)) {
			case INOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(451); inOperator();
				}
				break;
			case NOTINOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(452); notInOperator();
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
		public TerminalNode INOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.INOPERATOR, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitInOperator(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_inOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); match(INOPERATOR);
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
		public TerminalNode NOTINOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.NOTINOPERATOR, 0); }
		public NotInOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notInOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterNotInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitNotInOperator(this);
		}
	}

	public final NotInOperatorContext notInOperator() throws RecognitionException {
		NotInOperatorContext _localctx = new NotInOperatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_notInOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(NOTINOPERATOR);
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
		public UnionOperatorContext unionOperator() {
			return getRuleContext(UnionOperatorContext.class,0);
		}
		public CartesianProductOperatorContext cartesianProductOperator() {
			return getRuleContext(CartesianProductOperatorContext.class,0);
		}
		public IntersectionOperatorContext intersectionOperator() {
			return getRuleContext(IntersectionOperatorContext.class,0);
		}
		public SetdifferenceOperatorContext setdifferenceOperator() {
			return getRuleContext(SetdifferenceOperatorContext.class,0);
		}
		public SetOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetOperator(this);
		}
	}

	public final SetOperatorContext setOperator() throws RecognitionException {
		SetOperatorContext _localctx = new SetOperatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_setOperator);
		try {
			setState(463);
			switch (_input.LA(1)) {
			case CARTESIANPRODUCTOPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(459); cartesianProductOperator();
				}
				break;
			case UNIONOPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(460); unionOperator();
				}
				break;
			case INTERSECTIONOPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(461); intersectionOperator();
				}
				break;
			case SETDIFFERENCEOPERATOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(462); setdifferenceOperator();
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
		public TerminalNode CARTESIANPRODUCTOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.CARTESIANPRODUCTOPERATOR, 0); }
		public CartesianProductOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesianProductOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterCartesianProductOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitCartesianProductOperator(this);
		}
	}

	public final CartesianProductOperatorContext cartesianProductOperator() throws RecognitionException {
		CartesianProductOperatorContext _localctx = new CartesianProductOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cartesianProductOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(CARTESIANPRODUCTOPERATOR);
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
		public TerminalNode UNIONOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.UNIONOPERATOR, 0); }
		public UnionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterUnionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitUnionOperator(this);
		}
	}

	public final UnionOperatorContext unionOperator() throws RecognitionException {
		UnionOperatorContext _localctx = new UnionOperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(UNIONOPERATOR);
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
		public TerminalNode INTERSECTIONOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.INTERSECTIONOPERATOR, 0); }
		public IntersectionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterIntersectionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitIntersectionOperator(this);
		}
	}

	public final IntersectionOperatorContext intersectionOperator() throws RecognitionException {
		IntersectionOperatorContext _localctx = new IntersectionOperatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_intersectionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); match(INTERSECTIONOPERATOR);
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
		public TerminalNode SETDIFFERENCEOPERATOR() { return getToken(CFG_MATH_EXPRESSIONParser.SETDIFFERENCEOPERATOR, 0); }
		public SetdifferenceOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdifferenceOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).enterSetdifferenceOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_MATH_EXPRESSIONListener ) ((CFG_MATH_EXPRESSIONListener)listener).exitSetdifferenceOperator(this);
		}
	}

	public final SetdifferenceOperatorContext setdifferenceOperator() throws RecognitionException {
		SetdifferenceOperatorContext _localctx = new SetdifferenceOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_setdifferenceOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471); match(SETDIFFERENCEOPERATOR);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3@\u01dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\5"+
		"\2\u0091\n\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0099\n\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\7\6\u00a2\n\6\f\6\16\6\u00a5\13\6\3\7\3\7\3\7\3\7\7\7\u00ab\n"+
		"\7\f\7\16\7\u00ae\13\7\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\5\f\u00be\n\f\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u00d6\n\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u00e5\n\31\3\32\3\32\3\32\7\32\u00ea\n\32\f\32\16"+
		"\32\u00ed\13\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f5\n\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\5\"\u0105\n\"\3#\3"+
		"#\5#\u0109\n#\3$\3$\3$\3$\3%\3%\5%\u0111\n%\3&\3&\3&\3&\3&\5&\u0118\n"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\7,\u0128\n,\f,\16,\u012b"+
		"\13,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0136\n,\3-\3-\3-\3-\3-\3-\3-\5-\u013f"+
		"\n-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u014b\n/\f/\16/\u014e\13/\3/\3/\3"+
		"/\5/\u0153\n/\3\60\3\60\3\60\3\60\7\60\u0159\n\60\f\60\16\60\u015c\13"+
		"\60\3\60\3\60\3\60\5\60\u0161\n\60\3\61\3\61\3\61\3\61\7\61\u0167\n\61"+
		"\f\61\16\61\u016a\13\61\3\61\3\61\3\61\5\61\u016f\n\61\3\62\3\62\3\62"+
		"\7\62\u0174\n\62\f\62\16\62\u0177\13\62\3\63\3\63\3\63\5\63\u017c\n\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0186\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0190\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u019a\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u01a1\n\67\3"+
		"\67\3\67\38\38\58\u01a7\n8\39\39\59\u01ab\n9\3:\3:\3;\3;\3<\3<\3<\3<\7"+
		"<\u01b5\n<\f<\16<\u01b8\13<\3=\3=\5=\u01bc\n=\3>\3>\3>\3>\3?\3?\5?\u01c4"+
		"\n?\3@\3@\5@\u01c8\n@\3A\3A\3B\3B\3C\3C\3C\3C\5C\u01d2\nC\3D\3D\3E\3E"+
		"\3F\3F\3G\3G\3G\2\2H\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\2\6\3\2\3\5\4\2$$\64\64\4\2\65\6599\4\2\66\66::\u01cb"+
		"\2\u0090\3\2\2\2\4\u0092\3\2\2\2\6\u0098\3\2\2\2\b\u009a\3\2\2\2\n\u009d"+
		"\3\2\2\2\f\u00a6\3\2\2\2\16\u00b1\3\2\2\2\20\u00b3\3\2\2\2\22\u00b5\3"+
		"\2\2\2\24\u00b9\3\2\2\2\26\u00bd\3\2\2\2\30\u00c1\3\2\2\2\32\u00c3\3\2"+
		"\2\2\34\u00c5\3\2\2\2\36\u00c7\3\2\2\2 \u00c9\3\2\2\2\"\u00cb\3\2\2\2"+
		"$\u00cd\3\2\2\2&\u00d5\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00dc\3"+
		"\2\2\2.\u00de\3\2\2\2\60\u00e4\3\2\2\2\62\u00e6\3\2\2\2\64\u00f4\3\2\2"+
		"\2\66\u00f6\3\2\2\28\u00f8\3\2\2\2:\u00fa\3\2\2\2<\u00fc\3\2\2\2>\u00fe"+
		"\3\2\2\2@\u0100\3\2\2\2B\u0104\3\2\2\2D\u0108\3\2\2\2F\u010a\3\2\2\2H"+
		"\u0110\3\2\2\2J\u0117\3\2\2\2L\u0119\3\2\2\2N\u011b\3\2\2\2P\u011d\3\2"+
		"\2\2R\u011f\3\2\2\2T\u0121\3\2\2\2V\u0135\3\2\2\2X\u013e\3\2\2\2Z\u0140"+
		"\3\2\2\2\\\u0152\3\2\2\2^\u0160\3\2\2\2`\u016e\3\2\2\2b\u0170\3\2\2\2"+
		"d\u017b\3\2\2\2f\u0185\3\2\2\2h\u018f\3\2\2\2j\u0199\3\2\2\2l\u019b\3"+
		"\2\2\2n\u01a6\3\2\2\2p\u01aa\3\2\2\2r\u01ac\3\2\2\2t\u01ae\3\2\2\2v\u01b0"+
		"\3\2\2\2x\u01bb\3\2\2\2z\u01bd\3\2\2\2|\u01c3\3\2\2\2~\u01c7\3\2\2\2\u0080"+
		"\u01c9\3\2\2\2\u0082\u01cb\3\2\2\2\u0084\u01d1\3\2\2\2\u0086\u01d3\3\2"+
		"\2\2\u0088\u01d5\3\2\2\2\u008a\u01d7\3\2\2\2\u008c\u01d9\3\2\2\2\u008e"+
		"\u0091\5\4\3\2\u008f\u0091\5\6\4\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\3\3\2\2\2\u0092\u0093\5\6\4\2\u0093\u0094\5\26\f\2\u0094\u0095"+
		"\5\6\4\2\u0095\5\3\2\2\2\u0096\u0099\5\n\6\2\u0097\u0099\5\b\5\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\7\3\2\2\2\u009a\u009b\5\24\13"+
		"\2\u009b\u009c\5\6\4\2\u009c\t\3\2\2\2\u009d\u00a3\5\f\7\2\u009e\u009f"+
		"\5\30\r\2\u009f\u00a0\5\f\7\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3\2\2\2"+
		"\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\13"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ac\5\16\b\2\u00a7\u00a8\5$\23\2"+
		"\u00a8\u00a9\5\16\b\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\r\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b2\5\20\t\2\u00b0\u00b2\5\22\n\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b4\5X-\2\u00b4\21"+
		"\3\2\2\2\u00b5\u00b6\79\2\2\u00b6\u00b7\5\2\2\2\u00b7\u00b8\7:\2\2\u00b8"+
		"\23\3\2\2\2\u00b9\u00ba\5\32\16\2\u00ba\25\3\2\2\2\u00bb\u00be\5\34\17"+
		"\2\u00bc\u00be\5\36\20\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00c2\5 \21\2\u00c0\u00c2\5\"\22\2\u00c1\u00bf\3\2\2"+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\31\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\33\3"+
		"\2\2\2\u00c5\u00c6\7-\2\2\u00c6\35\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8\37"+
		"\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca!\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc"+
		"#\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce%\3\2\2\2\u00cf\u00d6\5(\25\2\u00d0"+
		"\u00d1\5(\25\2\u00d1\u00d2\79\2\2\u00d2\u00d3\5\62\32\2\u00d3\u00d4\7"+
		":\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6"+
		"\'\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8)\3\2\2\2\u00d9\u00da\7\63\2\2\u00da"+
		"\u00db\7\4\2\2\u00db+\3\2\2\2\u00dc\u00dd\7\4\2\2\u00dd-\3\2\2\2\u00de"+
		"\u00df\7\4\2\2\u00df\u00e0\7\62\2\2\u00e0/\3\2\2\2\u00e1\u00e5\5.\30\2"+
		"\u00e2\u00e5\5\64\33\2\u00e3\u00e5\5,\27\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\61\3\2\2\2\u00e6\u00eb\5*\26\2\u00e7"+
		"\u00e8\7\64\2\2\u00e8\u00ea\5*\26\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\63\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f5\5\66\34\2\u00ef\u00f5\58\35\2\u00f0\u00f5\5"+
		":\36\2\u00f1\u00f5\5<\37\2\u00f2\u00f5\5> \2\u00f3\u00f5\5@!\2\u00f4\u00ee"+
		"\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\65\3\2\2\2\u00f6\u00f7\7\21\2"+
		"\2\u00f7\67\3\2\2\2\u00f8\u00f9\7\22\2\2\u00f99\3\2\2\2\u00fa\u00fb\7"+
		"\7\2\2\u00fb;\3\2\2\2\u00fc\u00fd\7\b\2\2\u00fd=\3\2\2\2\u00fe\u00ff\7"+
		"\33\2\2\u00ff?\3\2\2\2\u0100\u0101\7\6\2\2\u0101A\3\2\2\2\u0102\u0105"+
		"\5D#\2\u0103\u0105\5F$\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105"+
		"C\3\2\2\2\u0106\u0109\5H%\2\u0107\u0109\5v<\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109E\3\2\2\2\u010a\u010b\5J&\2\u010b\u010c\7=\2\2\u010c"+
		"\u010d\5D#\2\u010dG\3\2\2\2\u010e\u0111\5V,\2\u010f\u0111\5Z.\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111I\3\2\2\2\u0112\u0118\5L\'\2\u0113"+
		"\u0118\5N(\2\u0114\u0118\5P)\2\u0115\u0118\5R*\2\u0116\u0118\5T+\2\u0117"+
		"\u0112\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0116\3\2\2\2\u0118K\3\2\2\2\u0119\u011a\7\3\2\2\u011aM\3\2"+
		"\2\2\u011b\u011c\7\23\2\2\u011cO\3\2\2\2\u011d\u011e\7\24\2\2\u011eQ\3"+
		"\2\2\2\u011f\u0120\7\25\2\2\u0120S\3\2\2\2\u0121\u0122\7\26\2\2\u0122"+
		"U\3\2\2\2\u0123\u0124\7\67\2\2\u0124\u0129\5X-\2\u0125\u0126\7\64\2\2"+
		"\u0126\u0128\5X-\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\78\2\2\u012d\u0136\3\2\2\2\u012e\u012f\7\67\2\2\u012f\u0130\5X"+
		"-\2\u0130\u0131\7>\2\2\u0131\u0132\5d\63\2\u0132\u0133\78\2\2\u0133\u0136"+
		"\3\2\2\2\u0134\u0136\5r:\2\u0135\u0123\3\2\2\2\u0135\u012e\3\2\2\2\u0135"+
		"\u0134\3\2\2\2\u0136W\3\2\2\2\u0137\u013f\5,\27\2\u0138\u013f\5p9\2\u0139"+
		"\u013f\5n8\2\u013a\u013f\5&\24\2\u013b\u013f\5@!\2\u013c\u013f\5\\/\2"+
		"\u013d\u013f\5*\26\2\u013e\u0137\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u0139"+
		"\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013d\3\2\2\2\u013fY\3\2\2\2\u0140\u0141\7\67\2\2\u0141\u0142\5\\/\2"+
		"\u0142\u0143\7>\2\2\u0143\u0144\5b\62\2\u0144\u0145\78\2\2\u0145[\3\2"+
		"\2\2\u0146\u0147\79\2\2\u0147\u014c\5X-\2\u0148\u0149\7\64\2\2\u0149\u014b"+
		"\5X-\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7:"+
		"\2\2\u0150\u0153\3\2\2\2\u0151\u0153\5t;\2\u0152\u0146\3\2\2\2\u0152\u0151"+
		"\3\2\2\2\u0153]\3\2\2\2\u0154\u0155\79\2\2\u0155\u015a\5.\30\2\u0156\u0157"+
		"\7\64\2\2\u0157\u0159\5.\30\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2"+
		"\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015d\u015e\7:\2\2\u015e\u0161\3\2\2\2\u015f\u0161\5t;\2\u0160"+
		"\u0154\3\2\2\2\u0160\u015f\3\2\2\2\u0161_\3\2\2\2\u0162\u0163\79\2\2\u0163"+
		"\u0168\5\60\31\2\u0164\u0165\7\64\2\2\u0165\u0167\5\60\31\2\u0166\u0164"+
		"\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7:\2\2\u016c\u016f\3\2"+
		"\2\2\u016d\u016f\5t;\2\u016e\u0162\3\2\2\2\u016e\u016d\3\2\2\2\u016fa"+
		"\3\2\2\2\u0170\u0175\5d\63\2\u0171\u0172\t\3\2\2\u0172\u0174\5d\63\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176c\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u017c\5f\64\2\u0179\u017c"+
		"\5h\65\2\u017a\u017c\5j\66\2\u017b\u0178\3\2\2\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017a\3\2\2\2\u017ce\3\2\2\2\u017d\u017e\5X-\2\u017e\u017f\5~@\2\u017f"+
		"\u0180\5D#\2\u0180\u0186\3\2\2\2\u0181\u0182\5V,\2\u0182\u0183\5~@\2\u0183"+
		"\u0184\5D#\2\u0184\u0186\3\2\2\2\u0185\u017d\3\2\2\2\u0185\u0181\3\2\2"+
		"\2\u0186g\3\2\2\2\u0187\u0188\5X-\2\u0188\u0189\5~@\2\u0189\u018a\5J&"+
		"\2\u018a\u0190\3\2\2\2\u018b\u018c\5V,\2\u018c\u018d\5~@\2\u018d\u018e"+
		"\5J&\2\u018e\u0190\3\2\2\2\u018f\u0187\3\2\2\2\u018f\u018b\3\2\2\2\u0190"+
		"i\3\2\2\2\u0191\u0192\5X-\2\u0192\u0193\5~@\2\u0193\u0194\5l\67\2\u0194"+
		"\u019a\3\2\2\2\u0195\u0196\5V,\2\u0196\u0197\5~@\2\u0197\u0198\5l\67\2"+
		"\u0198\u019a\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0195\3\2\2\2\u019ak\3"+
		"\2\2\2\u019b\u019c\t\4\2\2\u019c\u019d\5p9\2\u019d\u01a0\7\64\2\2\u019e"+
		"\u01a1\5p9\2\u019f\u01a1\5> \2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2"+
		"\u01a1\u01a2\3\2\2\2\u01a2\u01a3\t\5\2\2\u01a3m\3\2\2\2\u01a4\u01a7\5"+
		"\66\34\2\u01a5\u01a7\58\35\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"o\3\2\2\2\u01a8\u01ab\5:\36\2\u01a9\u01ab\5<\37\2\u01aa\u01a8\3\2\2\2"+
		"\u01aa\u01a9\3\2\2\2\u01abq\3\2\2\2\u01ac\u01ad\7\t\2\2\u01ads\3\2\2\2"+
		"\u01ae\u01af\7\n\2\2\u01afu\3\2\2\2\u01b0\u01b6\5x=\2\u01b1\u01b2\5\u0084"+
		"C\2\u01b2\u01b3\5x=\2\u01b3\u01b5\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5\u01b8"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7w\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01bc\5|?\2\u01ba\u01bc\5z>\2\u01bb\u01b9\3\2\2\2"+
		"\u01bb\u01ba\3\2\2\2\u01bcy\3\2\2\2\u01bd\u01be\79\2\2\u01be\u01bf\5v"+
		"<\2\u01bf\u01c0\7:\2\2\u01c0{\3\2\2\2\u01c1\u01c4\5H%\2\u01c2\u01c4\5"+
		"J&\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4}\3\2\2\2\u01c5\u01c8"+
		"\5\u0080A\2\u01c6\u01c8\5\u0082B\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2"+
		"\2\2\u01c8\177\3\2\2\2\u01c9\u01ca\7\35\2\2\u01ca\u0081\3\2\2\2\u01cb"+
		"\u01cc\7\36\2\2\u01cc\u0083\3\2\2\2\u01cd\u01d2\5\u0086D\2\u01ce\u01d2"+
		"\5\u0088E\2\u01cf\u01d2\5\u008aF\2\u01d0\u01d2\5\u008cG\2\u01d1\u01cd"+
		"\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"\u0085\3\2\2\2\u01d3\u01d4\7\37\2\2\u01d4\u0087\3\2\2\2\u01d5\u01d6\7"+
		" \2\2\u01d6\u0089\3\2\2\2\u01d7\u01d8\7!\2\2\u01d8\u008b\3\2\2\2\u01d9"+
		"\u01da\7\"\2\2\u01da\u008d\3\2\2\2\'\u0090\u0098\u00a3\u00ac\u00b1\u00bd"+
		"\u00c1\u00d5\u00e4\u00eb\u00f4\u0104\u0108\u0110\u0117\u0129\u0135\u013e"+
		"\u014c\u0152\u015a\u0160\u0168\u016e\u0175\u017b\u0185\u018f\u0199\u01a0"+
		"\u01a6\u01aa\u01b6\u01bb\u01c3\u01c7\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}