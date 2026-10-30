// Generated from CFG_TOKENS.g4 by ANTLR 4.9.2
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
public class CFG_TOKENSParser extends Parser {
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
		RULE_modelSignature = 0, RULE_modelSymbol = 1, RULE_parameter = 2, RULE_identifier = 3, 
		RULE_variable = 4, RULE_variableFixedValues = 5, RULE_parametersList = 6, 
		RULE_datatypeSymbol = 7, RULE_trueSymbol = 8, RULE_falseSymbol = 9, RULE_integerSymbol = 10, 
		RULE_realSymbol = 11, RULE_infinitySymbol = 12, RULE_stringSymbol = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"modelSignature", "modelSymbol", "parameter", "identifier", "variable", 
			"variableFixedValues", "parametersList", "datatypeSymbol", "trueSymbol", 
			"falseSymbol", "integerSymbol", "realSymbol", "infinitySymbol", "stringSymbol"
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
	public String getGrammarFileName() { return "CFG_TOKENS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CFG_TOKENSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModelSignatureContext extends ParserRuleContext {
		public ModelSymbolContext modelSymbol() {
			return getRuleContext(ModelSymbolContext.class,0);
		}
		public TerminalNode BEGINPARENTHESES() { return getToken(CFG_TOKENSParser.BEGINPARENTHESES, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
		public TerminalNode ENDPARENTHESES() { return getToken(CFG_TOKENSParser.ENDPARENTHESES, 0); }
		public ModelSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterModelSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitModelSignature(this);
		}
	}

	public final ModelSignatureContext modelSignature() throws RecognitionException {
		ModelSignatureContext _localctx = new ModelSignatureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modelSignature);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				modelSymbol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				modelSymbol();
				setState(30);
				match(BEGINPARENTHESES);
				setState(31);
				parametersList();
				setState(32);
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
		public TerminalNode UPPERCASEID() { return getToken(CFG_TOKENSParser.UPPERCASEID, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_TOKENSParser.LOWERCASEID, 0); }
		public TerminalNode FULLCASEID() { return getToken(CFG_TOKENSParser.FULLCASEID, 0); }
		public ModelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterModelSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitModelSymbol(this);
		}
	}

	public final ModelSymbolContext modelSymbol() throws RecognitionException {
		ModelSymbolContext _localctx = new ModelSymbolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_modelSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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
		public TerminalNode HASH() { return getToken(CFG_TOKENSParser.HASH, 0); }
		public TerminalNode LOWERCASEID() { return getToken(CFG_TOKENSParser.LOWERCASEID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(HASH);
			setState(39);
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
		public TerminalNode LOWERCASEID() { return getToken(CFG_TOKENSParser.LOWERCASEID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
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
		public TerminalNode LOWERCASEID() { return getToken(CFG_TOKENSParser.LOWERCASEID, 0); }
		public TerminalNode APOSTROPHE() { return getToken(CFG_TOKENSParser.APOSTROPHE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(LOWERCASEID);
			setState(44);
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
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterVariableFixedValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitVariableFixedValues(this);
		}
	}

	public final VariableFixedValuesContext variableFixedValues() throws RecognitionException {
		VariableFixedValuesContext _localctx = new VariableFixedValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableFixedValues);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				datatypeSymbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
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
		public List<TerminalNode> COMMA() { return getTokens(CFG_TOKENSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CFG_TOKENSParser.COMMA, i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitParametersList(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			parameter();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				parameter();
				}
				}
				setState(58);
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
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterDatatypeSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitDatatypeSymbol(this);
		}
	}

	public final DatatypeSymbolContext datatypeSymbol() throws RecognitionException {
		DatatypeSymbolContext _localctx = new DatatypeSymbolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_datatypeSymbol);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUESYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				trueSymbol();
				}
				break;
			case FALSESYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				falseSymbol();
				}
				break;
			case INTEGERSYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				integerSymbol();
				}
				break;
			case REALSYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				realSymbol();
				}
				break;
			case INFINITYSYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				infinitySymbol();
				}
				break;
			case STRINGSYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
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
		public TerminalNode TRUESYMBOL() { return getToken(CFG_TOKENSParser.TRUESYMBOL, 0); }
		public TrueSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterTrueSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitTrueSymbol(this);
		}
	}

	public final TrueSymbolContext trueSymbol() throws RecognitionException {
		TrueSymbolContext _localctx = new TrueSymbolContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_trueSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		public TerminalNode FALSESYMBOL() { return getToken(CFG_TOKENSParser.FALSESYMBOL, 0); }
		public FalseSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falseSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterFalseSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitFalseSymbol(this);
		}
	}

	public final FalseSymbolContext falseSymbol() throws RecognitionException {
		FalseSymbolContext _localctx = new FalseSymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_falseSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		public TerminalNode INTEGERSYMBOL() { return getToken(CFG_TOKENSParser.INTEGERSYMBOL, 0); }
		public IntegerSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterIntegerSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitIntegerSymbol(this);
		}
	}

	public final IntegerSymbolContext integerSymbol() throws RecognitionException {
		IntegerSymbolContext _localctx = new IntegerSymbolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integerSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
		public TerminalNode REALSYMBOL() { return getToken(CFG_TOKENSParser.REALSYMBOL, 0); }
		public RealSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterRealSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitRealSymbol(this);
		}
	}

	public final RealSymbolContext realSymbol() throws RecognitionException {
		RealSymbolContext _localctx = new RealSymbolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_realSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		public TerminalNode INFINITYSYMBOL() { return getToken(CFG_TOKENSParser.INFINITYSYMBOL, 0); }
		public InfinitySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitySymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterInfinitySymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitInfinitySymbol(this);
		}
	}

	public final InfinitySymbolContext infinitySymbol() throws RecognitionException {
		InfinitySymbolContext _localctx = new InfinitySymbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_infinitySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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
		public TerminalNode STRINGSYMBOL() { return getToken(CFG_TOKENSParser.STRINGSYMBOL, 0); }
		public StringSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).enterStringSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CFG_TOKENSListener ) ((CFG_TOKENSListener)listener).exitStringSymbol(this);
		}
	}

	public final StringSymbolContext stringSymbol() throws RecognitionException {
		StringSymbolContext _localctx = new StringSymbolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@R\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\5\2%\n\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\5\7\64\n\7\3\b\3\b\3"+
		"\b\7\b9\n\b\f\b\16\b<\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tD\n\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\3\3\2\3\5\2L\2$\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2"+
		"\b+\3\2\2\2\n-\3\2\2\2\f\63\3\2\2\2\16\65\3\2\2\2\20C\3\2\2\2\22E\3\2"+
		"\2\2\24G\3\2\2\2\26I\3\2\2\2\30K\3\2\2\2\32M\3\2\2\2\34O\3\2\2\2\36%\5"+
		"\4\3\2\37 \5\4\3\2 !\79\2\2!\"\5\16\b\2\"#\7:\2\2#%\3\2\2\2$\36\3\2\2"+
		"\2$\37\3\2\2\2%\3\3\2\2\2&\'\t\2\2\2\'\5\3\2\2\2()\7\63\2\2)*\7\4\2\2"+
		"*\7\3\2\2\2+,\7\4\2\2,\t\3\2\2\2-.\7\4\2\2./\7\62\2\2/\13\3\2\2\2\60\64"+
		"\5\n\6\2\61\64\5\20\t\2\62\64\5\b\5\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62"+
		"\3\2\2\2\64\r\3\2\2\2\65:\5\6\4\2\66\67\7\64\2\2\679\5\6\4\28\66\3\2\2"+
		"\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\17\3\2\2\2<:\3\2\2\2=D\5\22\n\2>D\5"+
		"\24\13\2?D\5\26\f\2@D\5\30\r\2AD\5\32\16\2BD\5\34\17\2C=\3\2\2\2C>\3\2"+
		"\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\21\3\2\2\2EF\7\21\2\2F\23"+
		"\3\2\2\2GH\7\22\2\2H\25\3\2\2\2IJ\7\7\2\2J\27\3\2\2\2KL\7\b\2\2L\31\3"+
		"\2\2\2MN\7\33\2\2N\33\3\2\2\2OP\7\6\2\2P\35\3\2\2\2\6$\63:C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}