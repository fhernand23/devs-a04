// Generated from CFG_SET_THEORY.g4 by ANTLR 4.9.2

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
public class CFG_SET_THEORYParser extends Parser {
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
		RULE_set = 0, RULE_setImplicitDefinition = 1, RULE_setExplicitDefinition = 2, 
		RULE_setDefinition = 3, RULE_setSymbol = 4, RULE_setName = 5, RULE_setOfIntegerNumbersSymbol = 6, 
		RULE_setOfNaturalNumbersSymbol = 7, RULE_setOfRealNumbersSymbol = 8, RULE_setOfBooleanAlgebraSymbol = 9, 
		RULE_elementCollection = 10, RULE_element = 11, RULE_tupleCollection = 12, 
		RULE_tuple = 13, RULE_variableTuple = 14, RULE_variableTupleFixedValues = 15, 
		RULE_tupleDefinition = 16, RULE_elementDefinition = 17, RULE_definitionWithSetImplicitDefinition = 18, 
		RULE_definitionWithSetSymbol = 19, RULE_definitionWithRange = 20, RULE_range = 21, 
		RULE_booleanSymbol = 22, RULE_numberSymbol = 23, RULE_emptySetSymbol = 24, 
		RULE_emptyTupleSymbol = 25, RULE_setOperationResult = 26, RULE_setOperationTerm = 27, 
		RULE_setOperationExpression = 28, RULE_operationSet = 29, RULE_belongsToOperator = 30, 
		RULE_inOperator = 31, RULE_notInOperator = 32, RULE_setOperator = 33, 
		RULE_cartesianProductOperator = 34, RULE_unionOperator = 35, RULE_intersectionOperator = 36, 
		RULE_setdifferenceOperator = 37, RULE_modelSignature = 38, RULE_modelSymbol = 39, 
		RULE_parameter = 40, RULE_identifier = 41, RULE_variable = 42, RULE_variableFixedValues = 43, 
		RULE_parametersList = 44, RULE_datatypeSymbol = 45, RULE_trueSymbol = 46, 
		RULE_falseSymbol = 47, RULE_integerSymbol = 48, RULE_realSymbol = 49, 
		RULE_infinitySymbol = 50, RULE_stringSymbol = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"set", "setImplicitDefinition", "setExplicitDefinition", "setDefinition", 
			"setSymbol", "setName", "setOfIntegerNumbersSymbol", "setOfNaturalNumbersSymbol", 
			"setOfRealNumbersSymbol", "setOfBooleanAlgebraSymbol", "elementCollection", 
			"element", "tupleCollection", "tuple", "variableTuple", "variableTupleFixedValues", 
			"tupleDefinition", "elementDefinition", "definitionWithSetImplicitDefinition", 
			"definitionWithSetSymbol", "definitionWithRange", "range", "booleanSymbol", 
			"numberSymbol", "emptySetSymbol", "emptyTupleSymbol", "setOperationResult", 
			"setOperationTerm", "setOperationExpression", "operationSet", "belongsToOperator", 
			"inOperator", "notInOperator", "setOperator", "cartesianProductOperator", 
			"unionOperator", "intersectionOperator", "setdifferenceOperator", "modelSignature", 
			"modelSymbol", "parameter", "identifier", "variable", "variableFixedValues", 
			"parametersList", "datatypeSymbol", "trueSymbol", "falseSymbol", "integerSymbol", 
			"realSymbol", "infinitySymbol", "stringSymbol"
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
	public String getGrammarFileName() { return "CFG_SET_THEORY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CFG_SET_THEORYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetExplicitDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetExplicitDefinitionExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetImplicitDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetImplicitDefinitionExpr(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_set);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new SetImplicitDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((SetImplicitDefinitionExprContext)_localctx).si = setImplicitDefinition();
				}
				break;
			case 2:
				_localctx = new SetExplicitDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOperationResultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOperationResultExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetDefinitionExpr(this);
		}
	}

	public final SetImplicitDefinitionContext setImplicitDefinition() throws RecognitionException {
		SetImplicitDefinitionContext _localctx = new SetImplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setImplicitDefinition);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new SetDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((SetDefinitionExprContext)_localctx).sd = setDefinition();
				}
				break;
			case 2:
				_localctx = new SetOperationResultExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
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
		public TerminalNode EQUAL() { return getToken(CFG_SET_THEORYParser.EQUAL, 0); }
		public SetSymbolContext setSymbol() {
			return getRuleContext(SetSymbolContext.class,0);
		}
		public SetImplicitDefinitionContext setImplicitDefinition() {
			return getRuleContext(SetImplicitDefinitionContext.class,0);
		}
		public SetAssignmentExprContext(SetExplicitDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetAssignmentExpr(this);
		}
	}

	public final SetExplicitDefinitionContext setExplicitDefinition() throws RecognitionException {
		SetExplicitDefinitionContext _localctx = new SetExplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setExplicitDefinition);
		try {
			_localctx = new SetAssignmentExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((SetAssignmentExprContext)_localctx).s = setSymbol();
			setState(113);
			match(EQUAL);
			setState(114);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementCollectionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementCollectionExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterTupleCollectionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitTupleCollectionExpr(this);
		}
	}

	public final SetDefinitionContext setDefinition() throws RecognitionException {
		SetDefinitionContext _localctx = new SetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setDefinition);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ElementCollectionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((ElementCollectionExprContext)_localctx).ec = elementCollection();
				}
				break;
			case 2:
				_localctx = new TupleCollectionExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterRealSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitRealSetSymbolExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterBooleanSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitBooleanSetSymbolExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterIntegerSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitIntegerSetSymbolExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetNameSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetNameSymbolExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterNaturalSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitNaturalSetSymbolExpr(this);
		}
	}

	public final SetSymbolContext setSymbol() throws RecognitionException {
		SetSymbolContext _localctx = new SetSymbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setSymbol);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASEID:
				_localctx = new SetNameSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((SetNameSymbolExprContext)_localctx).n = setName();
				}
				break;
			case SETZSYMBOL:
				_localctx = new IntegerSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((IntegerSetSymbolExprContext)_localctx).z = setOfIntegerNumbersSymbol();
				}
				break;
			case SETNSYMBOL:
				_localctx = new NaturalSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				((NaturalSetSymbolExprContext)_localctx).nn = setOfNaturalNumbersSymbol();
				}
				break;
			case SETRSYMBOL:
				_localctx = new RealSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				((RealSetSymbolExprContext)_localctx).r = setOfRealNumbersSymbol();
				}
				break;
			case SETBSYMBOL:
				_localctx = new BooleanSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
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
		public TerminalNode UPPERCASEID() { return getToken(CFG_SET_THEORYParser.UPPERCASEID, 0); }
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetName(this);
		}
	}

	public final SetNameContext setName() throws RecognitionException {
		SetNameContext _localctx = new SetNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		public TerminalNode SETZSYMBOL() { return getToken(CFG_SET_THEORYParser.SETZSYMBOL, 0); }
		public SetOfIntegerNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfIntegerNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOfIntegerNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOfIntegerNumbersSymbol(this);
		}
	}

	public final SetOfIntegerNumbersSymbolContext setOfIntegerNumbersSymbol() throws RecognitionException {
		SetOfIntegerNumbersSymbolContext _localctx = new SetOfIntegerNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setOfIntegerNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		public TerminalNode SETNSYMBOL() { return getToken(CFG_SET_THEORYParser.SETNSYMBOL, 0); }
		public SetOfNaturalNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfNaturalNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOfNaturalNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOfNaturalNumbersSymbol(this);
		}
	}

	public final SetOfNaturalNumbersSymbolContext setOfNaturalNumbersSymbol() throws RecognitionException {
		SetOfNaturalNumbersSymbolContext _localctx = new SetOfNaturalNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setOfNaturalNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		public TerminalNode SETRSYMBOL() { return getToken(CFG_SET_THEORYParser.SETRSYMBOL, 0); }
		public SetOfRealNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfRealNumbersSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOfRealNumbersSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOfRealNumbersSymbol(this);
		}
	}

	public final SetOfRealNumbersSymbolContext setOfRealNumbersSymbol() throws RecognitionException {
		SetOfRealNumbersSymbolContext _localctx = new SetOfRealNumbersSymbolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setOfRealNumbersSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		public TerminalNode SETBSYMBOL() { return getToken(CFG_SET_THEORYParser.SETBSYMBOL, 0); }
		public SetOfBooleanAlgebraSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfBooleanAlgebraSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOfBooleanAlgebraSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOfBooleanAlgebraSymbol(this);
		}
	}

	public final SetOfBooleanAlgebraSymbolContext setOfBooleanAlgebraSymbol() throws RecognitionException {
		SetOfBooleanAlgebraSymbolContext _localctx = new SetOfBooleanAlgebraSymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setOfBooleanAlgebraSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterEmptySetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitEmptySetExpr(this);
		}
	}
	public static class ElementListExprContext extends ElementCollectionContext {
		public ElementContext e1;
		public ElementContext element;
		public List<ElementContext> e2 = new ArrayList<ElementContext>();
		public TerminalNode BEGINSET() { return getToken(CFG_SET_THEORYParser.BEGINSET, 0); }
		public TerminalNode ENDSET() { return getToken(CFG_SET_THEORYParser.ENDSET, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_SET_THEORYParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_SET_THEORYParser.COMMA, i);
		}
		public ElementListExprContext(ElementCollectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementListExpr(this);
		}
	}
	public static class ElementSuchThatExprContext extends ElementCollectionContext {
		public ElementContext e;
		public ElementDefinitionContext def;
		public TerminalNode BEGINSET() { return getToken(CFG_SET_THEORYParser.BEGINSET, 0); }
		public TerminalNode SUCHTHAT() { return getToken(CFG_SET_THEORYParser.SUCHTHAT, 0); }
		public TerminalNode ENDSET() { return getToken(CFG_SET_THEORYParser.ENDSET, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementDefinitionContext elementDefinition() {
			return getRuleContext(ElementDefinitionContext.class,0);
		}
		public ElementSuchThatExprContext(ElementCollectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementSuchThatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementSuchThatExpr(this);
		}
	}

	public final ElementCollectionContext elementCollection() throws RecognitionException {
		ElementCollectionContext _localctx = new ElementCollectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementCollection);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ElementListExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(BEGINSET);
				setState(138);
				((ElementListExprContext)_localctx).e1 = element();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(139);
					match(COMMA);
					setState(140);
					((ElementListExprContext)_localctx).element = element();
					((ElementListExprContext)_localctx).e2.add(((ElementListExprContext)_localctx).element);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(ENDSET);
				}
				break;
			case 2:
				_localctx = new ElementSuchThatExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(BEGINSET);
				setState(149);
				((ElementSuchThatExprContext)_localctx).e = element();
				setState(150);
				match(SUCHTHAT);
				setState(151);
				((ElementSuchThatExprContext)_localctx).def = elementDefinition();
				setState(152);
				match(ENDSET);
				}
				break;
			case 3:
				_localctx = new EmptySetExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementNumber(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementIdentifier(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementBoolean(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementTuple(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementParameter(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementModelSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementModelSignature(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementString(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_element);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ElementIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((ElementIdentifierContext)_localctx).id = identifier();
				}
				break;
			case 2:
				_localctx = new ElementNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				((ElementNumberContext)_localctx).num = numberSymbol();
				}
				break;
			case 3:
				_localctx = new ElementBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((ElementBooleanContext)_localctx).bool = booleanSymbol();
				}
				break;
			case 4:
				_localctx = new ElementModelSignatureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				((ElementModelSignatureContext)_localctx).sig = modelSignature();
				}
				break;
			case 5:
				_localctx = new ElementStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				((ElementStringContext)_localctx).str = stringSymbol();
				}
				break;
			case 6:
				_localctx = new ElementTupleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				((ElementTupleContext)_localctx).tup = tuple();
				}
				break;
			case 7:
				_localctx = new ElementParameterContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
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
		public TerminalNode BEGINSET() { return getToken(CFG_SET_THEORYParser.BEGINSET, 0); }
		public TerminalNode SUCHTHAT() { return getToken(CFG_SET_THEORYParser.SUCHTHAT, 0); }
		public TerminalNode ENDSET() { return getToken(CFG_SET_THEORYParser.ENDSET, 0); }
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public TupleDefinitionContext tupleDefinition() {
			return getRuleContext(TupleDefinitionContext.class,0);
		}
		public TupleSuchThatExprContext(TupleCollectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterTupleSuchThatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitTupleSuchThatExpr(this);
		}
	}

	public final TupleCollectionContext tupleCollection() throws RecognitionException {
		TupleCollectionContext _localctx = new TupleCollectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tupleCollection);
		try {
			_localctx = new TupleSuchThatExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(BEGINSET);
			setState(167);
			((TupleSuchThatExprContext)_localctx).t = tuple();
			setState(168);
			match(SUCHTHAT);
			setState(169);
			((TupleSuchThatExprContext)_localctx).td = tupleDefinition();
			setState(170);
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
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_SET_THEORYParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_SET_THEORYParser.ENDPARENTHESES, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_SET_THEORYParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_SET_THEORYParser.COMMA, i);
		}
		public TupleExprContext(TupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitTupleExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterEmptyTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitEmptyTupleExpr(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuple);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				_localctx = new TupleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(BEGINPARENTHESES);
				setState(173);
				((TupleExprContext)_localctx).e1 = element();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(174);
					match(COMMA);
					setState(175);
					((TupleExprContext)_localctx).element = element();
					((TupleExprContext)_localctx).e2.add(((TupleExprContext)_localctx).element);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				_localctx = new EmptyTupleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_SET_THEORYParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_SET_THEORYParser.ENDPARENTHESES, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_SET_THEORYParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_SET_THEORYParser.COMMA, i);
		}
		public VariableTupleExprContext(VariableTupleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterVariableTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitVariableTupleExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterEmptyVariableTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitEmptyVariableTupleExpr(this);
		}
	}

	public final VariableTupleContext variableTuple() throws RecognitionException {
		VariableTupleContext _localctx = new VariableTupleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableTuple);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				_localctx = new VariableTupleExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(BEGINPARENTHESES);
				setState(187);
				((VariableTupleExprContext)_localctx).v1 = variable();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					setState(189);
					((VariableTupleExprContext)_localctx).variable = variable();
					((VariableTupleExprContext)_localctx).v2.add(((VariableTupleExprContext)_localctx).variable);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				_localctx = new EmptyVariableTupleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterEmptyVariableTupleFixedValuesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitEmptyVariableTupleFixedValuesExpr(this);
		}
	}
	public static class VariableTupleFixedValuesExprContext extends VariableTupleFixedValuesContext {
		public VariableFixedValuesContext vfv1;
		public VariableFixedValuesContext variableFixedValues;
		public List<VariableFixedValuesContext> vfv2 = new ArrayList<VariableFixedValuesContext>();
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_SET_THEORYParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_SET_THEORYParser.ENDPARENTHESES, 0); }
		public List<VariableFixedValuesContext> variableFixedValues() {
			return getRuleContexts(VariableFixedValuesContext.class);
		}
		public VariableFixedValuesContext variableFixedValues(int i) {
			return getRuleContext(VariableFixedValuesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CFG_SET_THEORYParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_SET_THEORYParser.COMMA, i);
		}
		public VariableTupleFixedValuesExprContext(VariableTupleFixedValuesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterVariableTupleFixedValuesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitVariableTupleFixedValuesExpr(this);
		}
	}

	public final VariableTupleFixedValuesContext variableTupleFixedValues() throws RecognitionException {
		VariableTupleFixedValuesContext _localctx = new VariableTupleFixedValuesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variableTupleFixedValues);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGINPARENTHESES:
				_localctx = new VariableTupleFixedValuesExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(BEGINPARENTHESES);
				setState(201);
				((VariableTupleFixedValuesExprContext)_localctx).vfv1 = variableFixedValues();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(202);
					match(COMMA);
					setState(203);
					((VariableTupleFixedValuesExprContext)_localctx).variableFixedValues = variableFixedValues();
					((VariableTupleFixedValuesExprContext)_localctx).vfv2.add(((VariableTupleFixedValuesExprContext)_localctx).variableFixedValues);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(ENDPARENTHESES);
				}
				break;
			case EMPTYTUPLESYMBOL:
				_localctx = new EmptyVariableTupleFixedValuesExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
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
		public List<TerminalNode> COMMA() { return getTokens(CFG_SET_THEORYParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_SET_THEORYParser.COMMA, i);
		}
		public List<TerminalNode> ANDOPERATOR() { return getTokens(CFG_SET_THEORYParser.ANDOPERATOR); }
		public TerminalNode ANDOPERATOR(int i) {
			return getToken(CFG_SET_THEORYParser.ANDOPERATOR, i);
		}
		public TupleDefinitionExprContext(TupleDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterTupleDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitTupleDefinitionExpr(this);
		}
	}

	public final TupleDefinitionContext tupleDefinition() throws RecognitionException {
		TupleDefinitionContext _localctx = new TupleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tupleDefinition);
		int _la;
		try {
			_localctx = new TupleDefinitionExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((TupleDefinitionExprContext)_localctx).ed1 = elementDefinition();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDOPERATOR || _la==COMMA) {
				{
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==ANDOPERATOR || _la==COMMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				((TupleDefinitionExprContext)_localctx).elementDefinition = elementDefinition();
				((TupleDefinitionExprContext)_localctx).ed2.add(((TupleDefinitionExprContext)_localctx).elementDefinition);
				}
				}
				setState(221);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementDefSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementDefSetSymbolExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementDefImplicitSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementDefImplicitSetExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterElementDefRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitElementDefRangeExpr(this);
		}
	}

	public final ElementDefinitionContext elementDefinition() throws RecognitionException {
		ElementDefinitionContext _localctx = new ElementDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elementDefinition);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ElementDefImplicitSetExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((ElementDefImplicitSetExprContext)_localctx).d1 = definitionWithSetImplicitDefinition();
				}
				break;
			case 2:
				_localctx = new ElementDefSetSymbolExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				((ElementDefSetSymbolExprContext)_localctx).d2 = definitionWithSetSymbol();
				}
				break;
			case 3:
				_localctx = new ElementDefRangeExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDefCollectionWithImplicitSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDefCollectionWithImplicitSetExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDefWithImplicitSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDefWithImplicitSetExpr(this);
		}
	}

	public final DefinitionWithSetImplicitDefinitionContext definitionWithSetImplicitDefinition() throws RecognitionException {
		DefinitionWithSetImplicitDefinitionContext _localctx = new DefinitionWithSetImplicitDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definitionWithSetImplicitDefinition);
		try {
			setState(235);
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
				setState(227);
				((DefWithImplicitSetExprContext)_localctx).e = element();
				setState(228);
				((DefWithImplicitSetExprContext)_localctx).op = belongsToOperator();
				setState(229);
				((DefWithImplicitSetExprContext)_localctx).s = setImplicitDefinition();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new DefCollectionWithImplicitSetExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				((DefCollectionWithImplicitSetExprContext)_localctx).ec = elementCollection();
				setState(232);
				((DefCollectionWithImplicitSetExprContext)_localctx).op = belongsToOperator();
				setState(233);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDefCollectionWithSymbolSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDefCollectionWithSymbolSetExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDefWithSymbolSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDefWithSymbolSetExpr(this);
		}
	}

	public final DefinitionWithSetSymbolContext definitionWithSetSymbol() throws RecognitionException {
		DefinitionWithSetSymbolContext _localctx = new DefinitionWithSetSymbolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definitionWithSetSymbol);
		try {
			setState(245);
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
				setState(237);
				((DefWithSymbolSetExprContext)_localctx).e = element();
				setState(238);
				((DefWithSymbolSetExprContext)_localctx).op = belongsToOperator();
				setState(239);
				((DefWithSymbolSetExprContext)_localctx).s = setSymbol();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new DefCollectionWithSymbolSetExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((DefCollectionWithSymbolSetExprContext)_localctx).ec = elementCollection();
				setState(242);
				((DefCollectionWithSymbolSetExprContext)_localctx).op = belongsToOperator();
				setState(243);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDefWithRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDefWithRangeExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDefCollectionWithRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDefCollectionWithRangeExpr(this);
		}
	}

	public final DefinitionWithRangeContext definitionWithRange() throws RecognitionException {
		DefinitionWithRangeContext _localctx = new DefinitionWithRangeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_definitionWithRange);
		try {
			setState(255);
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
				setState(247);
				((DefWithRangeExprContext)_localctx).e = element();
				setState(248);
				((DefWithRangeExprContext)_localctx).op = belongsToOperator();
				setState(249);
				((DefWithRangeExprContext)_localctx).r = range();
				}
				break;
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new DefCollectionWithRangeExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((DefCollectionWithRangeExprContext)_localctx).ec = elementCollection();
				setState(252);
				((DefCollectionWithRangeExprContext)_localctx).op = belongsToOperator();
				setState(253);
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
		public TerminalNode COMMA() { return getToken(CFG_SET_THEORYParser.COMMA, 0); }
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_SET_THEORYParser.BEGINPARENTHESES, 0); }
		public TerminalNode BEGINBRACKET() { return getToken(CFG_SET_THEORYParser.BEGINBRACKET, 0); }
		public List<NumberSymbolContext> numberSymbol() {
			return getRuleContexts(NumberSymbolContext.class);
		}
		public NumberSymbolContext numberSymbol(int i) {
			return getRuleContext(NumberSymbolContext.class,i);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_SET_THEORYParser.ENDPARENTHESES, 0); }
		public TerminalNode ENDBRACKET() { return getToken(CFG_SET_THEORYParser.ENDBRACKET, 0); }
		public InfinitySymbolContext infinitySymbol() {
			return getRuleContext(InfinitySymbolContext.class,0);
		}
		public RangeExprContext(RangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitRangeExpr(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_range);
		int _la;
		try {
			_localctx = new RangeExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==BEGINBRACKET || _la==BEGINPARENTHESES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
			((RangeExprContext)_localctx).n1 = numberSymbol();
			setState(259);
			match(COMMA);
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERSYMBOL:
			case REALSYMBOL:
				{
				setState(260);
				((RangeExprContext)_localctx).n2n = numberSymbol();
				}
				break;
			case INFINITYSYMBOL:
				{
				setState(261);
				((RangeExprContext)_localctx).n2i = infinitySymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitTrueExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitFalseExpr(this);
		}
	}

	public final BooleanSymbolContext booleanSymbol() throws RecognitionException {
		BooleanSymbolContext _localctx = new BooleanSymbolContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleanSymbol);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUESYMBOL:
				_localctx = new TrueExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				((TrueExprContext)_localctx).t = trueSymbol();
				}
				break;
			case FALSESYMBOL:
				_localctx = new FalseExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitIntegerExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterRealExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitRealExpr(this);
		}
	}

	public final NumberSymbolContext numberSymbol() throws RecognitionException {
		NumberSymbolContext _localctx = new NumberSymbolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_numberSymbol);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGERSYMBOL:
				_localctx = new IntegerExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((IntegerExprContext)_localctx).i = integerSymbol();
				}
				break;
			case REALSYMBOL:
				_localctx = new RealExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
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
		public TerminalNode EMPTYSETSYMBOL() { return getToken(CFG_SET_THEORYParser.EMPTYSETSYMBOL, 0); }
		public EmptySetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptySetSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterEmptySetSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitEmptySetSymbol(this);
		}
	}

	public final EmptySetSymbolContext emptySetSymbol() throws RecognitionException {
		EmptySetSymbolContext _localctx = new EmptySetSymbolContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_emptySetSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		public TerminalNode EMPTYTUPLESYMBOL() { return getToken(CFG_SET_THEORYParser.EMPTYTUPLESYMBOL, 0); }
		public EmptyTupleSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyTupleSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterEmptyTupleSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitEmptyTupleSymbol(this);
		}
	}

	public final EmptyTupleSymbolContext emptyTupleSymbol() throws RecognitionException {
		EmptyTupleSymbolContext _localctx = new EmptyTupleSymbolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_emptyTupleSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOperationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOperationExpr(this);
		}
	}

	public final SetOperationResultContext setOperationResult() throws RecognitionException {
		SetOperationResultContext _localctx = new SetOperationResultContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_setOperationResult);
		int _la;
		try {
			_localctx = new SetOperationExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((SetOperationExprContext)_localctx).left = setOperationTerm();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARTESIANPRODUCTOPERATOR) | (1L << UNIONOPERATOR) | (1L << INTERSECTIONOPERATOR) | (1L << SETDIFFERENCEOPERATOR))) != 0)) {
				{
				{
				setState(279);
				((SetOperationExprContext)_localctx).setOperator = setOperator();
				((SetOperationExprContext)_localctx).op.add(((SetOperationExprContext)_localctx).setOperator);
				setState(280);
				((SetOperationExprContext)_localctx).setOperationTerm = setOperationTerm();
				((SetOperationExprContext)_localctx).right.add(((SetOperationExprContext)_localctx).setOperationTerm);
				}
				}
				setState(286);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterOperationSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitOperationSetExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOperationParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOperationParExpr(this);
		}
	}

	public final SetOperationTermContext setOperationTerm() throws RecognitionException {
		SetOperationTermContext _localctx = new SetOperationTermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setOperationTerm);
		try {
			setState(289);
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
				setState(287);
				((OperationSetExprContext)_localctx).s1 = operationSet();
				}
				break;
			case BEGINPARENTHESES:
				_localctx = new SetOperationParExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
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
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_SET_THEORYParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_SET_THEORYParser.ENDPARENTHESES, 0); }
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public SetOperationParenthesisExprContext(SetOperationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetOperationParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetOperationParenthesisExpr(this);
		}
	}

	public final SetOperationExpressionContext setOperationExpression() throws RecognitionException {
		SetOperationExpressionContext _localctx = new SetOperationExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_setOperationExpression);
		try {
			_localctx = new SetOperationParenthesisExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(BEGINPARENTHESES);
			setState(292);
			((SetOperationParenthesisExprContext)_localctx).expr = setOperationResult();
			setState(293);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterOperationSetDefinitionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitOperationSetDefinitionExpr(this);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterOperationSetSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitOperationSetSymbolExpr(this);
		}
	}

	public final OperationSetContext operationSet() throws RecognitionException {
		OperationSetContext _localctx = new OperationSetContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_operationSet);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EMPTYSETSYMBOL:
			case BEGINSET:
				_localctx = new OperationSetDefinitionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
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
				setState(296);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterInOperatorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitInOperatorExpr(this);
		}
	}
	public static class NotInOperatorExprContext extends BelongsToOperatorContext {
		public NotInOperatorContext notInOperator() {
			return getRuleContext(NotInOperatorContext.class,0);
		}
		public NotInOperatorExprContext(BelongsToOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterNotInOperatorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitNotInOperatorExpr(this);
		}
	}

	public final BelongsToOperatorContext belongsToOperator() throws RecognitionException {
		BelongsToOperatorContext _localctx = new BelongsToOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_belongsToOperator);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INOPERATOR:
				_localctx = new InOperatorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				inOperator();
				}
				break;
			case NOTINOPERATOR:
				_localctx = new NotInOperatorExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
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
		public TerminalNode INOPERATOR() { return getToken(CFG_SET_THEORYParser.INOPERATOR, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitInOperator(this);
		}
	}

	public final InOperatorContext inOperator() throws RecognitionException {
		InOperatorContext _localctx = new InOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
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
		public TerminalNode NOTINOPERATOR() { return getToken(CFG_SET_THEORYParser.NOTINOPERATOR, 0); }
		public NotInOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notInOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterNotInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitNotInOperator(this);
		}
	}

	public final NotInOperatorContext notInOperator() throws RecognitionException {
		NotInOperatorContext _localctx = new NotInOperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_notInOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterUnionOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitUnionOpExpr(this);
		}
	}
	public static class IntersectionOpExprContext extends SetOperatorContext {
		public IntersectionOperatorContext intersectionOperator() {
			return getRuleContext(IntersectionOperatorContext.class,0);
		}
		public IntersectionOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterIntersectionOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitIntersectionOpExpr(this);
		}
	}
	public static class DifferenceOpExprContext extends SetOperatorContext {
		public SetdifferenceOperatorContext setdifferenceOperator() {
			return getRuleContext(SetdifferenceOperatorContext.class,0);
		}
		public DifferenceOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDifferenceOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDifferenceOpExpr(this);
		}
	}
	public static class CartesianProductOpExprContext extends SetOperatorContext {
		public CartesianProductOperatorContext cartesianProductOperator() {
			return getRuleContext(CartesianProductOperatorContext.class,0);
		}
		public CartesianProductOpExprContext(SetOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterCartesianProductOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitCartesianProductOpExpr(this);
		}
	}

	public final SetOperatorContext setOperator() throws RecognitionException {
		SetOperatorContext _localctx = new SetOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setOperator);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARTESIANPRODUCTOPERATOR:
				_localctx = new CartesianProductOpExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				cartesianProductOperator();
				}
				break;
			case UNIONOPERATOR:
				_localctx = new UnionOpExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				unionOperator();
				}
				break;
			case INTERSECTIONOPERATOR:
				_localctx = new IntersectionOpExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				intersectionOperator();
				}
				break;
			case SETDIFFERENCEOPERATOR:
				_localctx = new DifferenceOpExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
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
		public TerminalNode CARTESIANPRODUCTOPERATOR() { return getToken(CFG_SET_THEORYParser.CARTESIANPRODUCTOPERATOR, 0); }
		public CartesianProductOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesianProductOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterCartesianProductOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitCartesianProductOperator(this);
		}
	}

	public final CartesianProductOperatorContext cartesianProductOperator() throws RecognitionException {
		CartesianProductOperatorContext _localctx = new CartesianProductOperatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cartesianProductOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		public TerminalNode UNIONOPERATOR() { return getToken(CFG_SET_THEORYParser.UNIONOPERATOR, 0); }
		public UnionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterUnionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitUnionOperator(this);
		}
	}

	public final UnionOperatorContext unionOperator() throws RecognitionException {
		UnionOperatorContext _localctx = new UnionOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		public TerminalNode INTERSECTIONOPERATOR() { return getToken(CFG_SET_THEORYParser.INTERSECTIONOPERATOR, 0); }
		public IntersectionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterIntersectionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitIntersectionOperator(this);
		}
	}

	public final IntersectionOperatorContext intersectionOperator() throws RecognitionException {
		IntersectionOperatorContext _localctx = new IntersectionOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intersectionOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		public TerminalNode SETDIFFERENCEOPERATOR() { return getToken(CFG_SET_THEORYParser.SETDIFFERENCEOPERATOR, 0); }
		public SetdifferenceOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdifferenceOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterSetdifferenceOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitSetdifferenceOperator(this);
		}
	}

	public final SetdifferenceOperatorContext setdifferenceOperator() throws RecognitionException {
		SetdifferenceOperatorContext _localctx = new SetdifferenceOperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_setdifferenceOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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

	public static class ModelSignatureContext extends ParserRuleContext {
		public ModelSymbolContext modelSymbol() {
			return getRuleContext(ModelSymbolContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_SET_THEORYParser.BEGINPARENTHESES, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_SET_THEORYParser.ENDPARENTHESES, 0); }
		public ModelSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterModelSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitModelSignature(this);
		}
	}

	public final ModelSignatureContext modelSignature() throws RecognitionException {
		ModelSignatureContext _localctx = new ModelSignatureContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_modelSignature);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				modelSymbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				modelSymbol();
				setState(323);
				match(BEGINPARENTHESES);
				setState(324);
				parametersList();
				setState(325);
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
		public TerminalNode UPPERCASEID() { return getToken(CFG_SET_THEORYParser.UPPERCASEID, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public TerminalNode FULLCASEID() { return getToken(CFG_SET_THEORYParser.FULLCASEID, 0); }
		public ModelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterModelSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitModelSymbol(this);
		}
	}

	public final ModelSymbolContext modelSymbol() throws RecognitionException {
		ModelSymbolContext _localctx = new ModelSymbolContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_modelSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
		public TerminalNode HASH() { return getToken(CFG_SET_THEORYParser.HASH, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(HASH);
			setState(332);
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
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public TerminalNode APOSTROPHE() { return getToken(CFG_SET_THEORYParser.APOSTROPHE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LOWERCASEID);
			setState(337);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterVariableFixedValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitVariableFixedValues(this);
		}
	}

	public final VariableFixedValuesContext variableFixedValues() throws RecognitionException {
		VariableFixedValuesContext _localctx = new VariableFixedValuesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_variableFixedValues);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				datatypeSymbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
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
		public List<TerminalNode> COMMA() { return getTokens(CFG_SET_THEORYParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_SET_THEORYParser.COMMA, i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitParametersList(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			parameter();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(345);
				match(COMMA);
				setState(346);
				parameter();
				}
				}
				setState(351);
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
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterDatatypeSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitDatatypeSymbol(this);
		}
	}

	public final DatatypeSymbolContext datatypeSymbol() throws RecognitionException {
		DatatypeSymbolContext _localctx = new DatatypeSymbolContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_datatypeSymbol);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUESYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				trueSymbol();
				}
				break;
			case FALSESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				falseSymbol();
				}
				break;
			case INTEGERSYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				integerSymbol();
				}
				break;
			case REALSYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				realSymbol();
				}
				break;
			case INFINITYSYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				infinitySymbol();
				}
				break;
			case STRINGSYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
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
		public TerminalNode TRUESYMBOL() { return getToken(CFG_SET_THEORYParser.TRUESYMBOL, 0); }
		public TrueSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterTrueSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitTrueSymbol(this);
		}
	}

	public final TrueSymbolContext trueSymbol() throws RecognitionException {
		TrueSymbolContext _localctx = new TrueSymbolContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_trueSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		public TerminalNode FALSESYMBOL() { return getToken(CFG_SET_THEORYParser.FALSESYMBOL, 0); }
		public FalseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterFalseSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitFalseSymbol(this);
		}
	}

	public final FalseSymbolContext falseSymbol() throws RecognitionException {
		FalseSymbolContext _localctx = new FalseSymbolContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_falseSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		public TerminalNode INTEGERSYMBOL() { return getToken(CFG_SET_THEORYParser.INTEGERSYMBOL, 0); }
		public IntegerSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterIntegerSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitIntegerSymbol(this);
		}
	}

	public final IntegerSymbolContext integerSymbol() throws RecognitionException {
		IntegerSymbolContext _localctx = new IntegerSymbolContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integerSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		public TerminalNode REALSYMBOL() { return getToken(CFG_SET_THEORYParser.REALSYMBOL, 0); }
		public RealSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterRealSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitRealSymbol(this);
		}
	}

	public final RealSymbolContext realSymbol() throws RecognitionException {
		RealSymbolContext _localctx = new RealSymbolContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_realSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public TerminalNode INFINITYSYMBOL() { return getToken(CFG_SET_THEORYParser.INFINITYSYMBOL, 0); }
		public InfinitySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitySymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterInfinitySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitInfinitySymbol(this);
		}
	}

	public final InfinitySymbolContext infinitySymbol() throws RecognitionException {
		InfinitySymbolContext _localctx = new InfinitySymbolContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_infinitySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		public TerminalNode STRINGSYMBOL() { return getToken(CFG_SET_THEORYParser.STRINGSYMBOL, 0); }
		public StringSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).enterStringSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_SET_THEORYListener ) ((CFG_SET_THEORYListener)listener).exitStringSymbol(this);
		}
	}

	public final StringSymbolContext stringSymbol() throws RecognitionException {
		StringSymbolContext _localctx = new StringSymbolContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_stringSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u0177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\5\2m\n\2\3\3\3\3\5\3q\n\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\5\5y\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u0090\n\f\f\f\16\f\u0093\13\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17\u00b3\n\17\f\17\16\17\u00b6\13\17\3\17\3\17\3\17\5\17\u00bb\n\17"+
		"\3\20\3\20\3\20\3\20\7\20\u00c1\n\20\f\20\16\20\u00c4\13\20\3\20\3\20"+
		"\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\21\7\21\u00cf\n\21\f\21\16\21\u00d2"+
		"\13\21\3\21\3\21\3\21\5\21\u00d7\n\21\3\22\3\22\3\22\7\22\u00dc\n\22\f"+
		"\22\16\22\u00df\13\22\3\23\3\23\3\23\5\23\u00e4\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00ee\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00f8\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0102\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u0109\n\27\3\27\3\27\3\30\3"+
		"\30\5\30\u010f\n\30\3\31\3\31\5\31\u0113\n\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\7\34\u011d\n\34\f\34\16\34\u0120\13\34\3\35\3\35\5\35"+
		"\u0124\n\35\3\36\3\36\3\36\3\36\3\37\3\37\5\37\u012c\n\37\3 \3 \5 \u0130"+
		"\n \3!\3!\3\"\3\"\3#\3#\3#\3#\5#\u013a\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3(\3(\3(\5(\u014a\n(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\5"+
		"-\u0159\n-\3.\3.\3.\7.\u015e\n.\f.\16.\u0161\13.\3/\3/\3/\3/\3/\3/\5/"+
		"\u0169\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\6\4\2$$\64\64\4\2\65\6599\4\2\66\66::"+
		"\3\2\3\5\2\u0171\2l\3\2\2\2\4p\3\2\2\2\6r\3\2\2\2\bx\3\2\2\2\n\177\3\2"+
		"\2\2\f\u0081\3\2\2\2\16\u0083\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2"+
		"\2\24\u0089\3\2\2\2\26\u009d\3\2\2\2\30\u00a6\3\2\2\2\32\u00a8\3\2\2\2"+
		"\34\u00ba\3\2\2\2\36\u00c8\3\2\2\2 \u00d6\3\2\2\2\"\u00d8\3\2\2\2$\u00e3"+
		"\3\2\2\2&\u00ed\3\2\2\2(\u00f7\3\2\2\2*\u0101\3\2\2\2,\u0103\3\2\2\2."+
		"\u010e\3\2\2\2\60\u0112\3\2\2\2\62\u0114\3\2\2\2\64\u0116\3\2\2\2\66\u0118"+
		"\3\2\2\28\u0123\3\2\2\2:\u0125\3\2\2\2<\u012b\3\2\2\2>\u012f\3\2\2\2@"+
		"\u0131\3\2\2\2B\u0133\3\2\2\2D\u0139\3\2\2\2F\u013b\3\2\2\2H\u013d\3\2"+
		"\2\2J\u013f\3\2\2\2L\u0141\3\2\2\2N\u0149\3\2\2\2P\u014b\3\2\2\2R\u014d"+
		"\3\2\2\2T\u0150\3\2\2\2V\u0152\3\2\2\2X\u0158\3\2\2\2Z\u015a\3\2\2\2\\"+
		"\u0168\3\2\2\2^\u016a\3\2\2\2`\u016c\3\2\2\2b\u016e\3\2\2\2d\u0170\3\2"+
		"\2\2f\u0172\3\2\2\2h\u0174\3\2\2\2jm\5\4\3\2km\5\6\4\2lj\3\2\2\2lk\3\2"+
		"\2\2m\3\3\2\2\2nq\5\b\5\2oq\5\66\34\2pn\3\2\2\2po\3\2\2\2q\5\3\2\2\2r"+
		"s\5\n\6\2st\7=\2\2tu\5\4\3\2u\7\3\2\2\2vy\5\26\f\2wy\5\32\16\2xv\3\2\2"+
		"\2xw\3\2\2\2y\t\3\2\2\2z\u0080\5\f\7\2{\u0080\5\16\b\2|\u0080\5\20\t\2"+
		"}\u0080\5\22\n\2~\u0080\5\24\13\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2"+
		"\2\177}\3\2\2\2\177~\3\2\2\2\u0080\13\3\2\2\2\u0081\u0082\7\3\2\2\u0082"+
		"\r\3\2\2\2\u0083\u0084\7\23\2\2\u0084\17\3\2\2\2\u0085\u0086\7\24\2\2"+
		"\u0086\21\3\2\2\2\u0087\u0088\7\25\2\2\u0088\23\3\2\2\2\u0089\u008a\7"+
		"\26\2\2\u008a\25\3\2\2\2\u008b\u008c\7\67\2\2\u008c\u0091\5\30\r\2\u008d"+
		"\u008e\7\64\2\2\u008e\u0090\5\30\r\2\u008f\u008d\3\2\2\2\u0090\u0093\3"+
		"\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\78\2\2\u0095\u009e\3\2\2\2\u0096\u0097\7\67"+
		"\2\2\u0097\u0098\5\30\r\2\u0098\u0099\7>\2\2\u0099\u009a\5$\23\2\u009a"+
		"\u009b\78\2\2\u009b\u009e\3\2\2\2\u009c\u009e\5\62\32\2\u009d\u008b\3"+
		"\2\2\2\u009d\u0096\3\2\2\2\u009d\u009c\3\2\2\2\u009e\27\3\2\2\2\u009f"+
		"\u00a7\5T+\2\u00a0\u00a7\5\60\31\2\u00a1\u00a7\5.\30\2\u00a2\u00a7\5N"+
		"(\2\u00a3\u00a7\5h\65\2\u00a4\u00a7\5\34\17\2\u00a5\u00a7\5R*\2\u00a6"+
		"\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2"+
		"\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\31\3\2\2\2\u00a8\u00a9\7\67\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\7>"+
		"\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad\78\2\2\u00ad\33\3\2\2\2\u00ae\u00af"+
		"\79\2\2\u00af\u00b4\5\30\r\2\u00b0\u00b1\7\64\2\2\u00b1\u00b3\5\30\r\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7:\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00bb\5\64\33\2\u00ba\u00ae\3\2\2\2\u00ba\u00b9\3"+
		"\2\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\79\2\2\u00bd\u00c2\5V,\2\u00be\u00bf"+
		"\7\64\2\2\u00bf\u00c1\5V,\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\7:\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5\64\33\2\u00c8"+
		"\u00bc\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\79\2\2"+
		"\u00cb\u00d0\5X-\2\u00cc\u00cd\7\64\2\2\u00cd\u00cf\5X-\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7:\2\2\u00d4\u00d7\3\2"+
		"\2\2\u00d5\u00d7\5\64\33\2\u00d6\u00ca\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"!\3\2\2\2\u00d8\u00dd\5$\23\2\u00d9\u00da\t\2\2\2\u00da\u00dc\5$\23\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de#\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e4\5&\24\2\u00e1"+
		"\u00e4\5(\25\2\u00e2\u00e4\5*\26\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4%\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7"+
		"\5> \2\u00e7\u00e8\5\4\3\2\u00e8\u00ee\3\2\2\2\u00e9\u00ea\5\26\f\2\u00ea"+
		"\u00eb\5> \2\u00eb\u00ec\5\4\3\2\u00ec\u00ee\3\2\2\2\u00ed\u00e5\3\2\2"+
		"\2\u00ed\u00e9\3\2\2\2\u00ee\'\3\2\2\2\u00ef\u00f0\5\30\r\2\u00f0\u00f1"+
		"\5> \2\u00f1\u00f2\5\n\6\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\5\26\f\2\u00f4"+
		"\u00f5\5> \2\u00f5\u00f6\5\n\6\2\u00f6\u00f8\3\2\2\2\u00f7\u00ef\3\2\2"+
		"\2\u00f7\u00f3\3\2\2\2\u00f8)\3\2\2\2\u00f9\u00fa\5\30\r\2\u00fa\u00fb"+
		"\5> \2\u00fb\u00fc\5,\27\2\u00fc\u0102\3\2\2\2\u00fd\u00fe\5\26\f\2\u00fe"+
		"\u00ff\5> \2\u00ff\u0100\5,\27\2\u0100\u0102\3\2\2\2\u0101\u00f9\3\2\2"+
		"\2\u0101\u00fd\3\2\2\2\u0102+\3\2\2\2\u0103\u0104\t\3\2\2\u0104\u0105"+
		"\5\60\31\2\u0105\u0108\7\64\2\2\u0106\u0109\5\60\31\2\u0107\u0109\5f\64"+
		"\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\t\4\2\2\u010b-\3\2\2\2\u010c\u010f\5^\60\2\u010d\u010f\5`\61\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f/\3\2\2\2\u0110\u0113\5b\62\2"+
		"\u0111\u0113\5d\63\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\61"+
		"\3\2\2\2\u0114\u0115\7\t\2\2\u0115\63\3\2\2\2\u0116\u0117\7\n\2\2\u0117"+
		"\65\3\2\2\2\u0118\u011e\58\35\2\u0119\u011a\5D#\2\u011a\u011b\58\35\2"+
		"\u011b\u011d\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\67\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0124\5<\37\2\u0122\u0124\5:\36\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2"+
		"\2\2\u01249\3\2\2\2\u0125\u0126\79\2\2\u0126\u0127\5\66\34\2\u0127\u0128"+
		"\7:\2\2\u0128;\3\2\2\2\u0129\u012c\5\b\5\2\u012a\u012c\5\n\6\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012a\3\2\2\2\u012c=\3\2\2\2\u012d\u0130\5@!\2\u012e\u0130"+
		"\5B\"\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130?\3\2\2\2\u0131\u0132"+
		"\7\35\2\2\u0132A\3\2\2\2\u0133\u0134\7\36\2\2\u0134C\3\2\2\2\u0135\u013a"+
		"\5F$\2\u0136\u013a\5H%\2\u0137\u013a\5J&\2\u0138\u013a\5L\'\2\u0139\u0135"+
		"\3\2\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"E\3\2\2\2\u013b\u013c\7\37\2\2\u013cG\3\2\2\2\u013d\u013e\7 \2\2\u013e"+
		"I\3\2\2\2\u013f\u0140\7!\2\2\u0140K\3\2\2\2\u0141\u0142\7\"\2\2\u0142"+
		"M\3\2\2\2\u0143\u014a\5P)\2\u0144\u0145\5P)\2\u0145\u0146\79\2\2\u0146"+
		"\u0147\5Z.\2\u0147\u0148\7:\2\2\u0148\u014a\3\2\2\2\u0149\u0143\3\2\2"+
		"\2\u0149\u0144\3\2\2\2\u014aO\3\2\2\2\u014b\u014c\t\5\2\2\u014cQ\3\2\2"+
		"\2\u014d\u014e\7\63\2\2\u014e\u014f\7\4\2\2\u014fS\3\2\2\2\u0150\u0151"+
		"\7\4\2\2\u0151U\3\2\2\2\u0152\u0153\7\4\2\2\u0153\u0154\7\62\2\2\u0154"+
		"W\3\2\2\2\u0155\u0159\5V,\2\u0156\u0159\5\\/\2\u0157\u0159\5T+\2\u0158"+
		"\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159Y\3\2\2\2"+
		"\u015a\u015f\5R*\2\u015b\u015c\7\64\2\2\u015c\u015e\5R*\2\u015d\u015b"+
		"\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"[\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0169\5^\60\2\u0163\u0169\5`\61\2"+
		"\u0164\u0169\5b\62\2\u0165\u0169\5d\63\2\u0166\u0169\5f\64\2\u0167\u0169"+
		"\5h\65\2\u0168\u0162\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164\3\2\2\2\u0168"+
		"\u0165\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169]\3\2\2\2"+
		"\u016a\u016b\7\21\2\2\u016b_\3\2\2\2\u016c\u016d\7\22\2\2\u016da\3\2\2"+
		"\2\u016e\u016f\7\7\2\2\u016fc\3\2\2\2\u0170\u0171\7\b\2\2\u0171e\3\2\2"+
		"\2\u0172\u0173\7\33\2\2\u0173g\3\2\2\2\u0174\u0175\7\6\2\2\u0175i\3\2"+
		"\2\2 lpx\177\u0091\u009d\u00a6\u00b4\u00ba\u00c2\u00c8\u00d0\u00d6\u00dd"+
		"\u00e3\u00ed\u00f7\u0101\u0108\u010e\u0112\u011e\u0123\u012b\u012f\u0139"+
		"\u0149\u0158\u015f\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}