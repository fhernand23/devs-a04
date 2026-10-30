// Generated from c:/Users/clach/Documents/DevsLangWebEditor/DevsLangWebEditor/CFG_SET_THEORY.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CFG_SET_THEORYParser extends Parser {
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
		public TerminalNode EQUAL() { return getToken(CFG_SET_THEORYParser.EQUAL, 0); }
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetNameContext extends ParserRuleContext {
		public TerminalNode UPPERCASEID() { return getToken(CFG_SET_THEORYParser.UPPERCASEID, 0); }
		public SetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setName; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfIntegerNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETZSYMBOL() { return getToken(CFG_SET_THEORYParser.SETZSYMBOL, 0); }
		public SetOfIntegerNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfIntegerNumbersSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfNaturalNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETNSYMBOL() { return getToken(CFG_SET_THEORYParser.SETNSYMBOL, 0); }
		public SetOfNaturalNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfNaturalNumbersSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfRealNumbersSymbolContext extends ParserRuleContext {
		public TerminalNode SETRSYMBOL() { return getToken(CFG_SET_THEORYParser.SETRSYMBOL, 0); }
		public SetOfRealNumbersSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfRealNumbersSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetOfBooleanAlgebraSymbolContext extends ParserRuleContext {
		public TerminalNode SETBSYMBOL() { return getToken(CFG_SET_THEORYParser.SETBSYMBOL, 0); }
		public SetOfBooleanAlgebraSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfBooleanAlgebraSymbol; }
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
	}
	@SuppressWarnings("CheckReturnValue")
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
		public List<TerminalNode> COMMA() { return getTokens(CFG_SET_THEORYParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_SET_THEORYParser.COMMA, i);
		}
		public List<TerminalNode> ANDOPERATOR() { return getTokens(CFG_SET_THEORYParser.ANDOPERATOR); }
		public TerminalNode ANDOPERATOR(int i) {
			return getToken(CFG_SET_THEORYParser.ANDOPERATOR, i);
		}
		public TupleDefinitionExprContext(TupleDefinitionContext ctx) { copyFrom(ctx); }
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptySetSymbolContext extends ParserRuleContext {
		public TerminalNode EMPTYSETSYMBOL() { return getToken(CFG_SET_THEORYParser.EMPTYSETSYMBOL, 0); }
		public EmptySetSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptySetSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyTupleSymbolContext extends ParserRuleContext {
		public TerminalNode EMPTYTUPLESYMBOL() { return getToken(CFG_SET_THEORYParser.EMPTYTUPLESYMBOL, 0); }
		public EmptyTupleSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyTupleSymbol; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) {
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
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_SET_THEORYParser.BEGINPARENTHESES, 0); }
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_SET_THEORYParser.ENDPARENTHESES, 0); }
		public SetOperationResultContext setOperationResult() {
			return getRuleContext(SetOperationResultContext.class,0);
		}
		public SetOperationParenthesisExprContext(SetOperationExpressionContext ctx) { copyFrom(ctx); }
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

	@SuppressWarnings("CheckReturnValue")
	public static class InOperatorContext extends ParserRuleContext {
		public TerminalNode INOPERATOR() { return getToken(CFG_SET_THEORYParser.INOPERATOR, 0); }
		public InOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOperator; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class NotInOperatorContext extends ParserRuleContext {
		public TerminalNode NOTINOPERATOR() { return getToken(CFG_SET_THEORYParser.NOTINOPERATOR, 0); }
		public NotInOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notInOperator; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class CartesianProductOperatorContext extends ParserRuleContext {
		public TerminalNode CARTESIANPRODUCTOPERATOR() { return getToken(CFG_SET_THEORYParser.CARTESIANPRODUCTOPERATOR, 0); }
		public CartesianProductOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cartesianProductOperator; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnionOperatorContext extends ParserRuleContext {
		public TerminalNode UNIONOPERATOR() { return getToken(CFG_SET_THEORYParser.UNIONOPERATOR, 0); }
		public UnionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOperator; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntersectionOperatorContext extends ParserRuleContext {
		public TerminalNode INTERSECTIONOPERATOR() { return getToken(CFG_SET_THEORYParser.INTERSECTIONOPERATOR, 0); }
		public IntersectionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionOperator; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetdifferenceOperatorContext extends ParserRuleContext {
		public TerminalNode SETDIFFERENCEOPERATOR() { return getToken(CFG_SET_THEORYParser.SETDIFFERENCEOPERATOR, 0); }
		public SetdifferenceOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdifferenceOperator; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModelSymbolContext extends ParserRuleContext {
		public TerminalNode UPPERCASEID() { return getToken(CFG_SET_THEORYParser.UPPERCASEID, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public TerminalNode FULLCASEID() { return getToken(CFG_SET_THEORYParser.FULLCASEID, 0); }
		public ModelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSymbol; }
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
		public TerminalNode HASH() { return getToken(CFG_SET_THEORYParser.HASH, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LOWERCASEID() { return getToken(CFG_SET_THEORYParser.LOWERCASEID, 0); }
		public TerminalNode APOSTROPHE() { return getToken(CFG_SET_THEORYParser.APOSTROPHE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class TrueSymbolContext extends ParserRuleContext {
		public TerminalNode TRUESYMBOL() { return getToken(CFG_SET_THEORYParser.TRUESYMBOL, 0); }
		public TrueSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class FalseSymbolContext extends ParserRuleContext {
		public TerminalNode FALSESYMBOL() { return getToken(CFG_SET_THEORYParser.FALSESYMBOL, 0); }
		public FalseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerSymbolContext extends ParserRuleContext {
		public TerminalNode INTEGERSYMBOL() { return getToken(CFG_SET_THEORYParser.INTEGERSYMBOL, 0); }
		public IntegerSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class RealSymbolContext extends ParserRuleContext {
		public TerminalNode REALSYMBOL() { return getToken(CFG_SET_THEORYParser.REALSYMBOL, 0); }
		public RealSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realSymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfinitySymbolContext extends ParserRuleContext {
		public TerminalNode INFINITYSYMBOL() { return getToken(CFG_SET_THEORYParser.INFINITYSYMBOL, 0); }
		public InfinitySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitySymbol; }
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringSymbolContext extends ParserRuleContext {
		public TerminalNode STRINGSYMBOL() { return getToken(CFG_SET_THEORYParser.STRINGSYMBOL, 0); }
		public StringSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSymbol; }
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
		"\u0004\u0001>\u0175\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0003\u0000k\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001o\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003w\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004~\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u008e\b\n\n\n\f\n\u0091\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009c\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00a5\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b1\b\r\n\r\f\r\u00b4\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00bf\b\u000e\n\u000e\f\u000e\u00c2\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c7\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00cd\b\u000f\n\u000f\f\u000f"+
		"\u00d0\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d5\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00da\b\u0010\n"+
		"\u0010\f\u0010\u00dd\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00e2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ec\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00f6\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0100\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0107\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u010d\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0111"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u011b\b\u001a\n\u001a\f\u001a"+
		"\u011e\t\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0122\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u012a\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u012e\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u0138\b!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0148\b&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0003+\u0157\b+\u0001,\u0001,\u0001,\u0005,\u015c\b,\n,\f,\u015f\t,"+
		"\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0167\b-\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00013\u0000\u00004\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdf\u0000\u0004\u0002\u0000\"\"22\u0002\u00003377\u0002\u00004488\u0001"+
		"\u0000\u0001\u0003\u016f\u0000j\u0001\u0000\u0000\u0000\u0002n\u0001\u0000"+
		"\u0000\u0000\u0004p\u0001\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000"+
		"\b}\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u0081\u0001"+
		"\u0000\u0000\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u0085\u0001"+
		"\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014\u009b\u0001"+
		"\u0000\u0000\u0000\u0016\u00a4\u0001\u0000\u0000\u0000\u0018\u00a6\u0001"+
		"\u0000\u0000\u0000\u001a\u00b8\u0001\u0000\u0000\u0000\u001c\u00c6\u0001"+
		"\u0000\u0000\u0000\u001e\u00d4\u0001\u0000\u0000\u0000 \u00d6\u0001\u0000"+
		"\u0000\u0000\"\u00e1\u0001\u0000\u0000\u0000$\u00eb\u0001\u0000\u0000"+
		"\u0000&\u00f5\u0001\u0000\u0000\u0000(\u00ff\u0001\u0000\u0000\u0000*"+
		"\u0101\u0001\u0000\u0000\u0000,\u010c\u0001\u0000\u0000\u0000.\u0110\u0001"+
		"\u0000\u0000\u00000\u0112\u0001\u0000\u0000\u00002\u0114\u0001\u0000\u0000"+
		"\u00004\u0116\u0001\u0000\u0000\u00006\u0121\u0001\u0000\u0000\u00008"+
		"\u0123\u0001\u0000\u0000\u0000:\u0129\u0001\u0000\u0000\u0000<\u012d\u0001"+
		"\u0000\u0000\u0000>\u012f\u0001\u0000\u0000\u0000@\u0131\u0001\u0000\u0000"+
		"\u0000B\u0137\u0001\u0000\u0000\u0000D\u0139\u0001\u0000\u0000\u0000F"+
		"\u013b\u0001\u0000\u0000\u0000H\u013d\u0001\u0000\u0000\u0000J\u013f\u0001"+
		"\u0000\u0000\u0000L\u0147\u0001\u0000\u0000\u0000N\u0149\u0001\u0000\u0000"+
		"\u0000P\u014b\u0001\u0000\u0000\u0000R\u014e\u0001\u0000\u0000\u0000T"+
		"\u0150\u0001\u0000\u0000\u0000V\u0156\u0001\u0000\u0000\u0000X\u0158\u0001"+
		"\u0000\u0000\u0000Z\u0166\u0001\u0000\u0000\u0000\\\u0168\u0001\u0000"+
		"\u0000\u0000^\u016a\u0001\u0000\u0000\u0000`\u016c\u0001\u0000\u0000\u0000"+
		"b\u016e\u0001\u0000\u0000\u0000d\u0170\u0001\u0000\u0000\u0000f\u0172"+
		"\u0001\u0000\u0000\u0000hk\u0003\u0002\u0001\u0000ik\u0003\u0004\u0002"+
		"\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u0001\u0001"+
		"\u0000\u0000\u0000lo\u0003\u0006\u0003\u0000mo\u00034\u001a\u0000nl\u0001"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0003\u0001\u0000\u0000"+
		"\u0000pq\u0003\b\u0004\u0000qr\u0005;\u0000\u0000rs\u0003\u0002\u0001"+
		"\u0000s\u0005\u0001\u0000\u0000\u0000tw\u0003\u0014\n\u0000uw\u0003\u0018"+
		"\f\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\u0007\u0001"+
		"\u0000\u0000\u0000x~\u0003\n\u0005\u0000y~\u0003\f\u0006\u0000z~\u0003"+
		"\u000e\u0007\u0000{~\u0003\u0010\b\u0000|~\u0003\u0012\t\u0000}x\u0001"+
		"\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\t\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0001\u0000\u0000\u0080\u000b\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005\u0011\u0000\u0000\u0082\r\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\u0012\u0000\u0000\u0084\u000f\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0013\u0000\u0000\u0086\u0011\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u0014\u0000\u0000\u0088\u0013\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u00055\u0000\u0000\u008a\u008f\u0003\u0016\u000b\u0000\u008b"+
		"\u008c\u00052\u0000\u0000\u008c\u008e\u0003\u0016\u000b\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u00056\u0000\u0000\u0093\u009c\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"5\u0000\u0000\u0095\u0096\u0003\u0016\u000b\u0000\u0096\u0097\u0005<\u0000"+
		"\u0000\u0097\u0098\u0003\"\u0011\u0000\u0098\u0099\u00056\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u009c\u00030\u0018\u0000\u009b"+
		"\u0089\u0001\u0000\u0000\u0000\u009b\u0094\u0001\u0000\u0000\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u0015\u0001\u0000\u0000\u0000\u009d"+
		"\u00a5\u0003R)\u0000\u009e\u00a5\u0003.\u0017\u0000\u009f\u00a5\u0003"+
		",\u0016\u0000\u00a0\u00a5\u0003L&\u0000\u00a1\u00a5\u0003f3\u0000\u00a2"+
		"\u00a5\u0003\u001a\r\u0000\u00a3\u00a5\u0003P(\u0000\u00a4\u009d\u0001"+
		"\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a4\u009f\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u0017\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"5\u0000\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8\u00a9\u0005<\u0000"+
		"\u0000\u00a9\u00aa\u0003 \u0010\u0000\u00aa\u00ab\u00056\u0000\u0000\u00ab"+
		"\u0019\u0001\u0000\u0000\u0000\u00ac\u00ad\u00057\u0000\u0000\u00ad\u00b2"+
		"\u0003\u0016\u000b\u0000\u00ae\u00af\u00052\u0000\u0000\u00af\u00b1\u0003"+
		"\u0016\u000b\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u00058\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u00032\u0019\u0000\u00b8\u00ac\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u001b\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u00057\u0000\u0000\u00bb\u00c0\u0003T*\u0000\u00bc"+
		"\u00bd\u00052\u0000\u0000\u00bd\u00bf\u0003T*\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"8\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c7\u00032\u0019"+
		"\u0000\u00c6\u00ba\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u001d\u0001\u0000\u0000\u0000\u00c8\u00c9\u00057\u0000\u0000"+
		"\u00c9\u00ce\u0003V+\u0000\u00ca\u00cb\u00052\u0000\u0000\u00cb\u00cd"+
		"\u0003V+\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u00058\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d5\u00032\u0019\u0000\u00d4\u00c8\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u001f\u0001\u0000\u0000\u0000"+
		"\u00d6\u00db\u0003\"\u0011\u0000\u00d7\u00d8\u0007\u0000\u0000\u0000\u00d8"+
		"\u00da\u0003\"\u0011\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00e2\u0003$\u0012\u0000\u00df\u00e2\u0003&\u0013"+
		"\u0000\u00e0\u00e2\u0003(\u0014\u0000\u00e1\u00de\u0001\u0000\u0000\u0000"+
		"\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2#\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003\u0016\u000b\u0000\u00e4"+
		"\u00e5\u0003<\u001e\u0000\u00e5\u00e6\u0003\u0002\u0001\u0000\u00e6\u00ec"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003\u0014\n\u0000\u00e8\u00e9\u0003"+
		"<\u001e\u0000\u00e9\u00ea\u0003\u0002\u0001\u0000\u00ea\u00ec\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003\u0016\u000b"+
		"\u0000\u00ee\u00ef\u0003<\u001e\u0000\u00ef\u00f0\u0003\b\u0004\u0000"+
		"\u00f0\u00f6\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003\u0014\n\u0000\u00f2"+
		"\u00f3\u0003<\u001e\u0000\u00f3\u00f4\u0003\b\u0004\u0000\u00f4\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f6\'\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003"+
		"\u0016\u000b\u0000\u00f8\u00f9\u0003<\u001e\u0000\u00f9\u00fa\u0003*\u0015"+
		"\u0000\u00fa\u0100\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003\u0014\n\u0000"+
		"\u00fc\u00fd\u0003<\u001e\u0000\u00fd\u00fe\u0003*\u0015\u0000\u00fe\u0100"+
		"\u0001\u0000\u0000\u0000\u00ff\u00f7\u0001\u0000\u0000\u0000\u00ff\u00fb"+
		"\u0001\u0000\u0000\u0000\u0100)\u0001\u0000\u0000\u0000\u0101\u0102\u0007"+
		"\u0001\u0000\u0000\u0102\u0103\u0003.\u0017\u0000\u0103\u0106\u00052\u0000"+
		"\u0000\u0104\u0107\u0003.\u0017\u0000\u0105\u0107\u0003d2\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0002\u0000\u0000\u0109"+
		"+\u0001\u0000\u0000\u0000\u010a\u010d\u0003\\.\u0000\u010b\u010d\u0003"+
		"^/\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d-\u0001\u0000\u0000\u0000\u010e\u0111\u0003`0\u0000\u010f"+
		"\u0111\u0003b1\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001"+
		"\u0000\u0000\u0000\u0111/\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0007"+
		"\u0000\u0000\u01131\u0001\u0000\u0000\u0000\u0114\u0115\u0005\b\u0000"+
		"\u0000\u01153\u0001\u0000\u0000\u0000\u0116\u011c\u00036\u001b\u0000\u0117"+
		"\u0118\u0003B!\u0000\u0118\u0119\u00036\u001b\u0000\u0119\u011b\u0001"+
		"\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011b\u011e\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001"+
		"\u0000\u0000\u0000\u011d5\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011f\u0122\u0003:\u001d\u0000\u0120\u0122\u00038\u001c\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u01227\u0001\u0000\u0000\u0000\u0123\u0124\u00057\u0000\u0000\u0124\u0125"+
		"\u00034\u001a\u0000\u0125\u0126\u00058\u0000\u0000\u01269\u0001\u0000"+
		"\u0000\u0000\u0127\u012a\u0003\u0006\u0003\u0000\u0128\u012a\u0003\b\u0004"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a;\u0001\u0000\u0000\u0000\u012b\u012e\u0003>\u001f\u0000\u012c"+
		"\u012e\u0003@ \u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012e=\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u001b"+
		"\u0000\u0000\u0130?\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u001c\u0000"+
		"\u0000\u0132A\u0001\u0000\u0000\u0000\u0133\u0138\u0003D\"\u0000\u0134"+
		"\u0138\u0003F#\u0000\u0135\u0138\u0003H$\u0000\u0136\u0138\u0003J%\u0000"+
		"\u0137\u0133\u0001\u0000\u0000\u0000\u0137\u0134\u0001\u0000\u0000\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000"+
		"\u0138C\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u001d\u0000\u0000\u013a"+
		"E\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u001e\u0000\u0000\u013cG\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0005\u001f\u0000\u0000\u013eI\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005 \u0000\u0000\u0140K\u0001\u0000\u0000\u0000"+
		"\u0141\u0148\u0003N\'\u0000\u0142\u0143\u0003N\'\u0000\u0143\u0144\u0005"+
		"7\u0000\u0000\u0144\u0145\u0003X,\u0000\u0145\u0146\u00058\u0000\u0000"+
		"\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0141\u0001\u0000\u0000\u0000"+
		"\u0147\u0142\u0001\u0000\u0000\u0000\u0148M\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0007\u0003\u0000\u0000\u014aO\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u00051\u0000\u0000\u014c\u014d\u0005\u0002\u0000\u0000\u014dQ\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005\u0002\u0000\u0000\u014fS\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\u0002\u0000\u0000\u0151\u0152\u00050\u0000\u0000"+
		"\u0152U\u0001\u0000\u0000\u0000\u0153\u0157\u0003T*\u0000\u0154\u0157"+
		"\u0003Z-\u0000\u0155\u0157\u0003R)\u0000\u0156\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157W\u0001\u0000\u0000\u0000\u0158\u015d\u0003P(\u0000\u0159"+
		"\u015a\u00052\u0000\u0000\u015a\u015c\u0003P(\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015eY\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0167\u0003\\."+
		"\u0000\u0161\u0167\u0003^/\u0000\u0162\u0167\u0003`0\u0000\u0163\u0167"+
		"\u0003b1\u0000\u0164\u0167\u0003d2\u0000\u0165\u0167\u0003f3\u0000\u0166"+
		"\u0160\u0001\u0000\u0000\u0000\u0166\u0161\u0001\u0000\u0000\u0000\u0166"+
		"\u0162\u0001\u0000\u0000\u0000\u0166\u0163\u0001\u0000\u0000\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167"+
		"[\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u000f\u0000\u0000\u0169]\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005\u0010\u0000\u0000\u016b_\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005\u0005\u0000\u0000\u016da\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0005\u0006\u0000\u0000\u016fc\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005\u0019\u0000\u0000\u0171e\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0005\u0004\u0000\u0000\u0173g\u0001\u0000\u0000\u0000\u001ejn"+
		"v}\u008f\u009b\u00a4\u00b2\u00b8\u00c0\u00c6\u00ce\u00d4\u00db\u00e1\u00eb"+
		"\u00f5\u00ff\u0106\u010c\u0110\u011c\u0121\u0129\u012d\u0137\u0147\u0156"+
		"\u015d\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}