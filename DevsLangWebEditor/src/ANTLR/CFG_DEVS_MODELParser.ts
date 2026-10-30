// Generated from CFG_DEVS_MODEL.g4 by ANTLR 4.9.0-SNAPSHOT


import { ATN } from "antlr4ts/atn/ATN";
import { ATNDeserializer } from "antlr4ts/atn/ATNDeserializer";
import { FailedPredicateException } from "antlr4ts/FailedPredicateException";
import { NotNull } from "antlr4ts/Decorators";
import { NoViableAltException } from "antlr4ts/NoViableAltException";
import { Override } from "antlr4ts/Decorators";
import { Parser } from "antlr4ts/Parser";
import { ParserRuleContext } from "antlr4ts/ParserRuleContext";
import { ParserATNSimulator } from "antlr4ts/atn/ParserATNSimulator";
import { ParseTreeListener } from "antlr4ts/tree/ParseTreeListener";
import { ParseTreeVisitor } from "antlr4ts/tree/ParseTreeVisitor";
import { RecognitionException } from "antlr4ts/RecognitionException";
import { RuleContext } from "antlr4ts/RuleContext";
//import { RuleVersion } from "antlr4ts/RuleVersion";
import { TerminalNode } from "antlr4ts/tree/TerminalNode";
import { Token } from "antlr4ts/Token";
import { TokenStream } from "antlr4ts/TokenStream";
import { Vocabulary } from "antlr4ts/Vocabulary";
import { VocabularyImpl } from "antlr4ts/VocabularyImpl";

import * as Utils from "antlr4ts/misc/Utils";

import { CFG_DEVS_MODELListener } from "./CFG_DEVS_MODELListener";

export class CFG_DEVS_MODELParser extends Parser {
	public static readonly UPPERCASEID = 1;
	public static readonly LOWERCASEID = 2;
	public static readonly FULLCASEID = 3;
	public static readonly STRINGSYMBOL = 4;
	public static readonly INTEGERSYMBOL = 5;
	public static readonly REALSYMBOL = 6;
	public static readonly EMPTYSETSYMBOL = 7;
	public static readonly EMPTYTUPLESYMBOL = 8;
	public static readonly WHERESYMBOL = 9;
	public static readonly DELTAEXTNAMESYMBOL = 10;
	public static readonly DELTAINTNAMESYMBOL = 11;
	public static readonly LAMBDANAMESYMBOL = 12;
	public static readonly SELECTNAMESYMBOL = 13;
	public static readonly TANAMESYMBOL = 14;
	public static readonly TRUESYMBOL = 15;
	public static readonly FALSESYMBOL = 16;
	public static readonly SETZSYMBOL = 17;
	public static readonly SETNSYMBOL = 18;
	public static readonly SETRSYMBOL = 19;
	public static readonly SETBSYMBOL = 20;
	public static readonly IFSYMBOL = 21;
	public static readonly THENSYMBOL = 22;
	public static readonly INOTHERCASESYMBOL = 23;
	public static readonly OTHERWISESYMBOL = 24;
	public static readonly INFINITYSYMBOL = 25;
	public static readonly ASSIGNOPERATOR = 26;
	public static readonly INOPERATOR = 27;
	public static readonly NOTINOPERATOR = 28;
	public static readonly CARTESIANPRODUCTOPERATOR = 29;
	public static readonly UNIONOPERATOR = 30;
	public static readonly INTERSECTIONOPERATOR = 31;
	public static readonly SETDIFFERENCEOPERATOR = 32;
	public static readonly NOTOPERATOR = 33;
	public static readonly ANDOPERATOR = 34;
	public static readonly OROPERATOR = 35;
	public static readonly EQUALTOOPERATOR = 36;
	public static readonly NOTEQUALTOOPERATOR = 37;
	public static readonly GREATERTHANOPERATOR = 38;
	public static readonly LESSTHANOPERATOR = 39;
	public static readonly GREATERTHANOREQUALTOOPERATOR = 40;
	public static readonly LESSTHANOREQUALTOOPERATOR = 41;
	public static readonly SQRTOPERATOR = 42;
	public static readonly ADDITIONOPERATOR = 43;
	public static readonly SUBSTRACTIONOPERATOR = 44;
	public static readonly MULTIPLICATIONOPERATOR = 45;
	public static readonly DIVISIONOPERATOR = 46;
	public static readonly POWEROPERATOR = 47;
	public static readonly APOSTROPHE = 48;
	public static readonly HASH = 49;
	public static readonly COMMA = 50;
	public static readonly BEGINBRACKET = 51;
	public static readonly ENDBRACKET = 52;
	public static readonly BEGINSET = 53;
	public static readonly ENDSET = 54;
	public static readonly BEGINPARENTHESES = 55;
	public static readonly ENDPARENTHESES = 56;
	public static readonly COLON = 57;
	public static readonly SEMICOLON = 58;
	public static readonly EQUAL = 59;
	public static readonly SUCHTHAT = 60;
	public static readonly QUOTE = 61;
	public static readonly IGNOREEMPTY = 62;
	public static readonly RULE_devsSpecification = 0;
	public static readonly RULE_devsModel = 1;
	public static readonly RULE_setInModel = 2;
	public static readonly RULE_atomicModel = 3;
	public static readonly RULE_atomicModelTuple = 4;
	public static readonly RULE_coupledModel = 5;
	public static readonly RULE_coupledModelTuple = 6;
	public static readonly RULE_modelDefinition = 7;
	public static readonly RULE_modelSentence = 8;
	public static readonly RULE_function = 9;
	public static readonly RULE_delExtFunction = 10;
	public static readonly RULE_delExtFunctionName = 11;
	public static readonly RULE_delIntFunction = 12;
	public static readonly RULE_delIntFunctionName = 13;
	public static readonly RULE_lambdaFunction = 14;
	public static readonly RULE_lambdaFunctionName = 15;
	public static readonly RULE_taFunction = 16;
	public static readonly RULE_taFunctionName = 17;
	public static readonly RULE_selectFunction = 18;
	public static readonly RULE_selectFunctionName = 19;
	public static readonly RULE_functionDescription = 20;
	public static readonly RULE_functionDescriptionPreIf = 21;
	public static readonly RULE_functionPreIfResult = 22;
	public static readonly RULE_functionDescriptionPostIf = 23;
	public static readonly RULE_functionPostIfResult = 24;
	public static readonly RULE_functionGenericDescription = 25;
	public static readonly RULE_functionDescriptionAssignmentPreIf = 26;
	public static readonly RULE_functionDescriptionAssignmentPostIf = 27;
	public static readonly RULE_functionAssignPreIfResult = 28;
	public static readonly RULE_functionAssignPostIfResult = 29;
	public static readonly RULE_functionGenericValuesDescription = 30;
	public static readonly RULE_functionDescriptionValuesAssignmentPreIf = 31;
	public static readonly RULE_functionDescriptionValuesAssignmentPostIf = 32;
	public static readonly RULE_functionValuesAssignPreIfResult = 33;
	public static readonly RULE_functionValuesAssignPostIfResult = 34;
	public static readonly RULE_tupleValue = 35;
	public static readonly RULE_value = 36;
	public static readonly RULE_taFunctionDescription = 37;
	public static readonly RULE_taFunctionDescriptionPreIf = 38;
	public static readonly RULE_taFunctionPreIfResult = 39;
	public static readonly RULE_taFunctionDescriptionPostIf = 40;
	public static readonly RULE_taFunctionPostIfResult = 41;
	public static readonly RULE_taFunctionGenericDescription = 42;
	public static readonly RULE_taAssignPreIf = 43;
	public static readonly RULE_taAssignPreIfResult = 44;
	public static readonly RULE_taAssignPostIf = 45;
	public static readonly RULE_taAssignPostIfResult = 46;
	public static readonly RULE_selectFunctionDescription = 47;
	public static readonly RULE_selectFunctionDescriptionPreIf = 48;
	public static readonly RULE_selectFunctionPreIfResult = 49;
	public static readonly RULE_selectFunctionDescriptionPostIf = 50;
	public static readonly RULE_selectFunctionPostIfResult = 51;
	public static readonly RULE_selectFunctionGenericDescription = 52;
	public static readonly RULE_selectAssignPreIfList = 53;
	public static readonly RULE_selectAssignPreIfResult = 54;
	public static readonly RULE_selectAssignPostIfList = 55;
	public static readonly RULE_selectAssignPostIfResult = 56;
	public static readonly RULE_assignIdentifier = 57;
	public static readonly RULE_assignParameter = 58;
	public static readonly RULE_assignValue = 59;
	public static readonly RULE_assignTuple = 60;
	public static readonly RULE_assignElement = 61;
	public static readonly RULE_assignmentsList = 62;
	public static readonly RULE_modelSignature = 63;
	public static readonly RULE_modelSymbol = 64;
	public static readonly RULE_parameter = 65;
	public static readonly RULE_identifier = 66;
	public static readonly RULE_variable = 67;
	public static readonly RULE_variableFixedValues = 68;
	public static readonly RULE_parametersList = 69;
	public static readonly RULE_datatypeSymbol = 70;
	public static readonly RULE_trueSymbol = 71;
	public static readonly RULE_falseSymbol = 72;
	public static readonly RULE_integerSymbol = 73;
	public static readonly RULE_realSymbol = 74;
	public static readonly RULE_infinitySymbol = 75;
	public static readonly RULE_stringSymbol = 76;
	public static readonly RULE_root = 77;
	public static readonly RULE_ifCondition = 78;
	public static readonly RULE_ifThenCondition = 79;
	public static readonly RULE_booleanExpression = 80;
	public static readonly RULE_binaryCondition = 81;
	public static readonly RULE_booleanExpressionTerm = 82;
	public static readonly RULE_unaryCondition = 83;
	public static readonly RULE_relationalExpressionTerm = 84;
	public static readonly RULE_booleanExpressionBasicTerm = 85;
	public static readonly RULE_booleanExpressionElement = 86;
	public static readonly RULE_booleanExpressionResult = 87;
	public static readonly RULE_actionExpression = 88;
	public static readonly RULE_ifSymbol = 89;
	public static readonly RULE_inOtherCaseSymbol = 90;
	public static readonly RULE_unaryConditionalOperator = 91;
	public static readonly RULE_binaryConditionalOperator = 92;
	public static readonly RULE_binaryRelationalOperator = 93;
	public static readonly RULE_notOperator = 94;
	public static readonly RULE_andOperator = 95;
	public static readonly RULE_orOperator = 96;
	public static readonly RULE_equalToOperator = 97;
	public static readonly RULE_notEqualToOperator = 98;
	public static readonly RULE_greaterThanOperator = 99;
	public static readonly RULE_lessThanOperator = 100;
	public static readonly RULE_greaterThanOrEqualToOperator = 101;
	public static readonly RULE_lessThanOrEqualToOperator = 102;
	public static readonly RULE_set = 103;
	public static readonly RULE_setImplicitDefinition = 104;
	public static readonly RULE_setExplicitDefinition = 105;
	public static readonly RULE_setDefinition = 106;
	public static readonly RULE_setSymbol = 107;
	public static readonly RULE_setName = 108;
	public static readonly RULE_setOfIntegerNumbersSymbol = 109;
	public static readonly RULE_setOfNaturalNumbersSymbol = 110;
	public static readonly RULE_setOfRealNumbersSymbol = 111;
	public static readonly RULE_setOfBooleanAlgebraSymbol = 112;
	public static readonly RULE_elementCollection = 113;
	public static readonly RULE_element = 114;
	public static readonly RULE_tupleCollection = 115;
	public static readonly RULE_tuple = 116;
	public static readonly RULE_variableTuple = 117;
	public static readonly RULE_variableTupleFixedValues = 118;
	public static readonly RULE_tupleDefinition = 119;
	public static readonly RULE_elementDefinition = 120;
	public static readonly RULE_definitionWithSetImplicitDefinition = 121;
	public static readonly RULE_definitionWithSetSymbol = 122;
	public static readonly RULE_definitionWithRange = 123;
	public static readonly RULE_range = 124;
	public static readonly RULE_booleanSymbol = 125;
	public static readonly RULE_numberSymbol = 126;
	public static readonly RULE_emptySetSymbol = 127;
	public static readonly RULE_emptyTupleSymbol = 128;
	public static readonly RULE_setOperationResult = 129;
	public static readonly RULE_setOperationTerm = 130;
	public static readonly RULE_setOperationExpression = 131;
	public static readonly RULE_operationSet = 132;
	public static readonly RULE_belongsToOperator = 133;
	public static readonly RULE_inOperator = 134;
	public static readonly RULE_notInOperator = 135;
	public static readonly RULE_setOperator = 136;
	public static readonly RULE_cartesianProductOperator = 137;
	public static readonly RULE_unionOperator = 138;
	public static readonly RULE_intersectionOperator = 139;
	public static readonly RULE_setdifferenceOperator = 140;
	public static readonly RULE_mathExpression = 141;
	public static readonly RULE_binaryMathExpression = 142;
	public static readonly RULE_mathExpressionTerm = 143;
	public static readonly RULE_unaryMathExpression = 144;
	public static readonly RULE_mathTerm = 145;
	public static readonly RULE_mathFactor = 146;
	public static readonly RULE_mathExpressionBasicTerm = 147;
	public static readonly RULE_mathExpressionElement = 148;
	public static readonly RULE_mathExpressionResult = 149;
	public static readonly RULE_unaryMathOperator = 150;
	public static readonly RULE_binaryMathOperatorLowerPrecedence = 151;
	public static readonly RULE_binaryMathOperatorHigherPrecedence = 152;
	public static readonly RULE_sqrtOperator = 153;
	public static readonly RULE_additionOperator = 154;
	public static readonly RULE_substractionOperator = 155;
	public static readonly RULE_multiplicationOperator = 156;
	public static readonly RULE_divisionOperator = 157;
	public static readonly RULE_powerOperator = 158;
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"devsSpecification", "devsModel", "setInModel", "atomicModel", "atomicModelTuple", 
		"coupledModel", "coupledModelTuple", "modelDefinition", "modelSentence", 
		"function", "delExtFunction", "delExtFunctionName", "delIntFunction", 
		"delIntFunctionName", "lambdaFunction", "lambdaFunctionName", "taFunction", 
		"taFunctionName", "selectFunction", "selectFunctionName", "functionDescription", 
		"functionDescriptionPreIf", "functionPreIfResult", "functionDescriptionPostIf", 
		"functionPostIfResult", "functionGenericDescription", "functionDescriptionAssignmentPreIf", 
		"functionDescriptionAssignmentPostIf", "functionAssignPreIfResult", "functionAssignPostIfResult", 
		"functionGenericValuesDescription", "functionDescriptionValuesAssignmentPreIf", 
		"functionDescriptionValuesAssignmentPostIf", "functionValuesAssignPreIfResult", 
		"functionValuesAssignPostIfResult", "tupleValue", "value", "taFunctionDescription", 
		"taFunctionDescriptionPreIf", "taFunctionPreIfResult", "taFunctionDescriptionPostIf", 
		"taFunctionPostIfResult", "taFunctionGenericDescription", "taAssignPreIf", 
		"taAssignPreIfResult", "taAssignPostIf", "taAssignPostIfResult", "selectFunctionDescription", 
		"selectFunctionDescriptionPreIf", "selectFunctionPreIfResult", "selectFunctionDescriptionPostIf", 
		"selectFunctionPostIfResult", "selectFunctionGenericDescription", "selectAssignPreIfList", 
		"selectAssignPreIfResult", "selectAssignPostIfList", "selectAssignPostIfResult", 
		"assignIdentifier", "assignParameter", "assignValue", "assignTuple", "assignElement", 
		"assignmentsList", "modelSignature", "modelSymbol", "parameter", "identifier", 
		"variable", "variableFixedValues", "parametersList", "datatypeSymbol", 
		"trueSymbol", "falseSymbol", "integerSymbol", "realSymbol", "infinitySymbol", 
		"stringSymbol", "root", "ifCondition", "ifThenCondition", "booleanExpression", 
		"binaryCondition", "booleanExpressionTerm", "unaryCondition", "relationalExpressionTerm", 
		"booleanExpressionBasicTerm", "booleanExpressionElement", "booleanExpressionResult", 
		"actionExpression", "ifSymbol", "inOtherCaseSymbol", "unaryConditionalOperator", 
		"binaryConditionalOperator", "binaryRelationalOperator", "notOperator", 
		"andOperator", "orOperator", "equalToOperator", "notEqualToOperator", 
		"greaterThanOperator", "lessThanOperator", "greaterThanOrEqualToOperator", 
		"lessThanOrEqualToOperator", "set", "setImplicitDefinition", "setExplicitDefinition", 
		"setDefinition", "setSymbol", "setName", "setOfIntegerNumbersSymbol", 
		"setOfNaturalNumbersSymbol", "setOfRealNumbersSymbol", "setOfBooleanAlgebraSymbol", 
		"elementCollection", "element", "tupleCollection", "tuple", "variableTuple", 
		"variableTupleFixedValues", "tupleDefinition", "elementDefinition", "definitionWithSetImplicitDefinition", 
		"definitionWithSetSymbol", "definitionWithRange", "range", "booleanSymbol", 
		"numberSymbol", "emptySetSymbol", "emptyTupleSymbol", "setOperationResult", 
		"setOperationTerm", "setOperationExpression", "operationSet", "belongsToOperator", 
		"inOperator", "notInOperator", "setOperator", "cartesianProductOperator", 
		"unionOperator", "intersectionOperator", "setdifferenceOperator", "mathExpression", 
		"binaryMathExpression", "mathExpressionTerm", "unaryMathExpression", "mathTerm", 
		"mathFactor", "mathExpressionBasicTerm", "mathExpressionElement", "mathExpressionResult", 
		"unaryMathOperator", "binaryMathOperatorLowerPrecedence", "binaryMathOperatorHigherPrecedence", 
		"sqrtOperator", "additionOperator", "substractionOperator", "multiplicationOperator", 
		"divisionOperator", "powerOperator",
	];

	private static readonly _LITERAL_NAMES: Array<string | undefined> = [
		undefined, undefined, undefined, undefined, undefined, undefined, undefined, 
		"'\\mptySet'", "'\\mptyTuple'", "'\\here'", "'\\elExt'", "'\\elInt'", 
		"'\\ambda'", "'\\elect'", "'\\a'", "'\\rue'", "'\\alse'", "'\\'", "'\\'", 
		"'\\'", "'\\'", "'\\f'", "'\\hen'", "'\\nOtherCase'", "'\\therwise'", 
		"'\\nfinity'", "'\\ssign'", "'\\n'", "'\\otIn'", "'\\roduct'", "'\\nion'", 
		"'\\ntersection'", "'\\etDifference'", "'\\ot'", "'\\nd'", "'\\r'", "'\\qualTo'", 
		"'\\otEqualTo'", "'\\reaterThan'", "'\\essThan'", "'\\reaterThanOrEqualTo'", 
		"'\\essThanOrEqualTo'", "'\\qrt'", "'\\ddition'", "'\\ubstraction'", "'\\ultiplication'", 
		"'\\ivision'", "'\\ower'", "'''", "'#'", "','", "'['", "']'", "'{'", "'}'", 
		"'('", "')'", "':'", "';'", "'='", "'|'", "'\"'",
	];
	private static readonly _SYMBOLIC_NAMES: Array<string | undefined> = [
		undefined, "UPPERCASEID", "LOWERCASEID", "FULLCASEID", "STRINGSYMBOL", 
		"INTEGERSYMBOL", "REALSYMBOL", "EMPTYSETSYMBOL", "EMPTYTUPLESYMBOL", "WHERESYMBOL", 
		"DELTAEXTNAMESYMBOL", "DELTAINTNAMESYMBOL", "LAMBDANAMESYMBOL", "SELECTNAMESYMBOL", 
		"TANAMESYMBOL", "TRUESYMBOL", "FALSESYMBOL", "SETZSYMBOL", "SETNSYMBOL", 
		"SETRSYMBOL", "SETBSYMBOL", "IFSYMBOL", "THENSYMBOL", "INOTHERCASESYMBOL", 
		"OTHERWISESYMBOL", "INFINITYSYMBOL", "ASSIGNOPERATOR", "INOPERATOR", "NOTINOPERATOR", 
		"CARTESIANPRODUCTOPERATOR", "UNIONOPERATOR", "INTERSECTIONOPERATOR", "SETDIFFERENCEOPERATOR", 
		"NOTOPERATOR", "ANDOPERATOR", "OROPERATOR", "EQUALTOOPERATOR", "NOTEQUALTOOPERATOR", 
		"GREATERTHANOPERATOR", "LESSTHANOPERATOR", "GREATERTHANOREQUALTOOPERATOR", 
		"LESSTHANOREQUALTOOPERATOR", "SQRTOPERATOR", "ADDITIONOPERATOR", "SUBSTRACTIONOPERATOR", 
		"MULTIPLICATIONOPERATOR", "DIVISIONOPERATOR", "POWEROPERATOR", "APOSTROPHE", 
		"HASH", "COMMA", "BEGINBRACKET", "ENDBRACKET", "BEGINSET", "ENDSET", "BEGINPARENTHESES", 
		"ENDPARENTHESES", "COLON", "SEMICOLON", "EQUAL", "SUCHTHAT", "QUOTE", 
		"IGNOREEMPTY",
	];
	public static readonly VOCABULARY: Vocabulary = new VocabularyImpl(CFG_DEVS_MODELParser._LITERAL_NAMES, CFG_DEVS_MODELParser._SYMBOLIC_NAMES, []);

	// @Override
	// @NotNull
	public get vocabulary(): Vocabulary {
		return CFG_DEVS_MODELParser.VOCABULARY;
	}
	// tslint:enable:no-trailing-whitespace

	// @Override
	public get grammarFileName(): string { return "CFG_DEVS_MODEL.g4"; }

	// @Override
	public get ruleNames(): string[] { return CFG_DEVS_MODELParser.ruleNames; }

	// @Override
	public get serializedATN(): string { return CFG_DEVS_MODELParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(CFG_DEVS_MODELParser._ATN, this);
	}
	// @RuleVersion(0)
	public devsSpecification(): DevsSpecificationContext {
		let _localctx: DevsSpecificationContext = new DevsSpecificationContext(this._ctx, this.state);
		this.enterRule(_localctx, 0, CFG_DEVS_MODELParser.RULE_devsSpecification);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 319;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 318;
				_localctx._devsModel = this.devsModel();
				_localctx._models.push(_localctx._devsModel);
				}
				}
				this.state = 321;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << CFG_DEVS_MODELParser.UPPERCASEID) | (1 << CFG_DEVS_MODELParser.LOWERCASEID) | (1 << CFG_DEVS_MODELParser.FULLCASEID))) !== 0));
			this.state = 323;
			this.match(CFG_DEVS_MODELParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public devsModel(): DevsModelContext {
		let _localctx: DevsModelContext = new DevsModelContext(this._ctx, this.state);
		this.enterRule(_localctx, 2, CFG_DEVS_MODELParser.RULE_devsModel);
		try {
			this.state = 327;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 1, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 325;
				this.atomicModel();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 326;
				this.coupledModel();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setInModel(): SetInModelContext {
		let _localctx: SetInModelContext = new SetInModelContext(this._ctx, this.state);
		this.enterRule(_localctx, 4, CFG_DEVS_MODELParser.RULE_setInModel);
		try {
			this.state = 331;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 2, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 329;
				this.setImplicitDefinition();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 330;
				this.setSymbol();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public atomicModel(): AtomicModelContext {
		let _localctx: AtomicModelContext = new AtomicModelContext(this._ctx, this.state);
		this.enterRule(_localctx, 6, CFG_DEVS_MODELParser.RULE_atomicModel);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 333;
			_localctx._sig = this.modelSignature();
			this.state = 334;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 335;
			_localctx._modelTuple = this.atomicModelTuple();
			this.state = 336;
			this.match(CFG_DEVS_MODELParser.WHERESYMBOL);
			this.state = 337;
			_localctx._def = this.modelDefinition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public atomicModelTuple(): AtomicModelTupleContext {
		let _localctx: AtomicModelTupleContext = new AtomicModelTupleContext(this._ctx, this.state);
		this.enterRule(_localctx, 8, CFG_DEVS_MODELParser.RULE_atomicModelTuple);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 339;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 340;
			_localctx._input = this.setInModel();
			this.state = 341;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 342;
			_localctx._output = this.setInModel();
			this.state = 343;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 344;
			_localctx._state = this.setInModel();
			this.state = 345;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 346;
			_localctx._deltaExtName = this.match(CFG_DEVS_MODELParser.DELTAEXTNAMESYMBOL);
			this.state = 347;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 348;
			_localctx._deltaIntName = this.match(CFG_DEVS_MODELParser.DELTAINTNAMESYMBOL);
			this.state = 349;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 350;
			_localctx._lambdaName = this.match(CFG_DEVS_MODELParser.LAMBDANAMESYMBOL);
			this.state = 351;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 352;
			_localctx._taName = this.match(CFG_DEVS_MODELParser.TANAMESYMBOL);
			this.state = 353;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public coupledModel(): CoupledModelContext {
		let _localctx: CoupledModelContext = new CoupledModelContext(this._ctx, this.state);
		this.enterRule(_localctx, 10, CFG_DEVS_MODELParser.RULE_coupledModel);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 355;
			_localctx._sig = this.modelSignature();
			this.state = 356;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 357;
			_localctx._modelTuple = this.coupledModelTuple();
			this.state = 358;
			this.match(CFG_DEVS_MODELParser.WHERESYMBOL);
			this.state = 359;
			_localctx._def = this.modelDefinition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public coupledModelTuple(): CoupledModelTupleContext {
		let _localctx: CoupledModelTupleContext = new CoupledModelTupleContext(this._ctx, this.state);
		this.enterRule(_localctx, 12, CFG_DEVS_MODELParser.RULE_coupledModelTuple);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 361;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 362;
			_localctx._input = this.setInModel();
			this.state = 363;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 364;
			_localctx._output = this.setInModel();
			this.state = 365;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 366;
			_localctx._state = this.setInModel();
			this.state = 367;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 368;
			_localctx._components = this.setInModel();
			this.state = 369;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 370;
			_localctx._eic = this.setInModel();
			this.state = 371;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 372;
			_localctx._eoc = this.setInModel();
			this.state = 373;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 374;
			_localctx._ic = this.setInModel();
			this.state = 375;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 376;
			_localctx._selectName = this.match(CFG_DEVS_MODELParser.SELECTNAMESYMBOL);
			this.state = 377;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public modelDefinition(): ModelDefinitionContext {
		let _localctx: ModelDefinitionContext = new ModelDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 14, CFG_DEVS_MODELParser.RULE_modelDefinition);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 379;
			_localctx._modelSentence = this.modelSentence();
			_localctx._sentences.push(_localctx._modelSentence);
			this.state = 384;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.SEMICOLON) {
				{
				{
				this.state = 380;
				this.match(CFG_DEVS_MODELParser.SEMICOLON);
				this.state = 381;
				_localctx._modelSentence = this.modelSentence();
				_localctx._sentences.push(_localctx._modelSentence);
				}
				}
				this.state = 386;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public modelSentence(): ModelSentenceContext {
		let _localctx: ModelSentenceContext = new ModelSentenceContext(this._ctx, this.state);
		this.enterRule(_localctx, 16, CFG_DEVS_MODELParser.RULE_modelSentence);
		try {
			this.state = 389;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.SETZSYMBOL:
			case CFG_DEVS_MODELParser.SETNSYMBOL:
			case CFG_DEVS_MODELParser.SETRSYMBOL:
			case CFG_DEVS_MODELParser.SETBSYMBOL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 387;
				this.setExplicitDefinition();
				}
				break;
			case CFG_DEVS_MODELParser.DELTAEXTNAMESYMBOL:
			case CFG_DEVS_MODELParser.DELTAINTNAMESYMBOL:
			case CFG_DEVS_MODELParser.LAMBDANAMESYMBOL:
			case CFG_DEVS_MODELParser.SELECTNAMESYMBOL:
			case CFG_DEVS_MODELParser.TANAMESYMBOL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 388;
				this.function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public function(): FunctionContext {
		let _localctx: FunctionContext = new FunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 18, CFG_DEVS_MODELParser.RULE_function);
		try {
			this.state = 396;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.DELTAEXTNAMESYMBOL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 391;
				this.delExtFunction();
				}
				break;
			case CFG_DEVS_MODELParser.DELTAINTNAMESYMBOL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 392;
				this.delIntFunction();
				}
				break;
			case CFG_DEVS_MODELParser.LAMBDANAMESYMBOL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 393;
				this.lambdaFunction();
				}
				break;
			case CFG_DEVS_MODELParser.TANAMESYMBOL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 394;
				this.taFunction();
				}
				break;
			case CFG_DEVS_MODELParser.SELECTNAMESYMBOL:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 395;
				this.selectFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public delExtFunction(): DelExtFunctionContext {
		let _localctx: DelExtFunctionContext = new DelExtFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 20, CFG_DEVS_MODELParser.RULE_delExtFunction);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 398;
			_localctx._name = this.delExtFunctionName();
			this.state = 399;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 400;
			_localctx._body = this.functionDescription();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public delExtFunctionName(): DelExtFunctionNameContext {
		let _localctx: DelExtFunctionNameContext = new DelExtFunctionNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 22, CFG_DEVS_MODELParser.RULE_delExtFunctionName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 402;
			this.match(CFG_DEVS_MODELParser.DELTAEXTNAMESYMBOL);
			this.state = 403;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 404;
			_localctx._stateTuple = this.tuple();
			this.state = 405;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 406;
			_localctx._elapsed = this.element();
			this.state = 407;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 408;
			_localctx._inputTuple = this.tuple();
			this.state = 409;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public delIntFunction(): DelIntFunctionContext {
		let _localctx: DelIntFunctionContext = new DelIntFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 24, CFG_DEVS_MODELParser.RULE_delIntFunction);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 411;
			_localctx._name = this.delIntFunctionName();
			this.state = 412;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 413;
			_localctx._body = this.functionDescription();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public delIntFunctionName(): DelIntFunctionNameContext {
		let _localctx: DelIntFunctionNameContext = new DelIntFunctionNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 26, CFG_DEVS_MODELParser.RULE_delIntFunctionName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 415;
			this.match(CFG_DEVS_MODELParser.DELTAINTNAMESYMBOL);
			this.state = 416;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 417;
			_localctx._stateTuple = this.tuple();
			this.state = 418;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lambdaFunction(): LambdaFunctionContext {
		let _localctx: LambdaFunctionContext = new LambdaFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 28, CFG_DEVS_MODELParser.RULE_lambdaFunction);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 420;
			_localctx._name = this.lambdaFunctionName();
			this.state = 421;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 422;
			_localctx._body = this.functionDescription();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lambdaFunctionName(): LambdaFunctionNameContext {
		let _localctx: LambdaFunctionNameContext = new LambdaFunctionNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 30, CFG_DEVS_MODELParser.RULE_lambdaFunctionName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 424;
			this.match(CFG_DEVS_MODELParser.LAMBDANAMESYMBOL);
			this.state = 425;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 426;
			_localctx._stateTuple = this.tuple();
			this.state = 427;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunction(): TaFunctionContext {
		let _localctx: TaFunctionContext = new TaFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 32, CFG_DEVS_MODELParser.RULE_taFunction);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 429;
			_localctx._name = this.taFunctionName();
			this.state = 430;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 431;
			_localctx._body = this.taFunctionDescription();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunctionName(): TaFunctionNameContext {
		let _localctx: TaFunctionNameContext = new TaFunctionNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 34, CFG_DEVS_MODELParser.RULE_taFunctionName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 433;
			this.match(CFG_DEVS_MODELParser.TANAMESYMBOL);
			this.state = 434;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 435;
			_localctx._stateTuple = this.tuple();
			this.state = 436;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunction(): SelectFunctionContext {
		let _localctx: SelectFunctionContext = new SelectFunctionContext(this._ctx, this.state);
		this.enterRule(_localctx, 36, CFG_DEVS_MODELParser.RULE_selectFunction);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 438;
			_localctx._name = this.selectFunctionName();
			this.state = 439;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 440;
			_localctx._body = this.selectFunctionDescription();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunctionName(): SelectFunctionNameContext {
		let _localctx: SelectFunctionNameContext = new SelectFunctionNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 38, CFG_DEVS_MODELParser.RULE_selectFunctionName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 442;
			this.match(CFG_DEVS_MODELParser.SELECTNAMESYMBOL);
			this.state = 443;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 444;
			_localctx._setSym = this.setSymbol();
			this.state = 445;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDescription(): FunctionDescriptionContext {
		let _localctx: FunctionDescriptionContext = new FunctionDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 40, CFG_DEVS_MODELParser.RULE_functionDescription);
		try {
			this.state = 452;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 6, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 447;
				this.tupleValue();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 448;
				this.functionDescriptionPreIf();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 449;
				this.functionDescriptionPostIf();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 450;
				this.functionGenericDescription();
				}
				break;

			case 5:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 451;
				this.functionGenericValuesDescription();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDescriptionPreIf(): FunctionDescriptionPreIfContext {
		let _localctx: FunctionDescriptionPreIfContext = new FunctionDescriptionPreIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 42, CFG_DEVS_MODELParser.RULE_functionDescriptionPreIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 454;
			this.functionPreIfResult();
			this.state = 459;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 455;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 456;
				this.functionPreIfResult();
				}
				}
				this.state = 461;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionPreIfResult(): FunctionPreIfResultContext {
		let _localctx: FunctionPreIfResultContext = new FunctionPreIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 44, CFG_DEVS_MODELParser.RULE_functionPreIfResult);
		try {
			this.state = 468;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.IFSYMBOL:
				_localctx = new FunctionPreIfConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 462;
				(_localctx as FunctionPreIfConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 463;
				(_localctx as FunctionPreIfConditionalResultContext)._result = this.tupleValue();
				}
				break;
			case CFG_DEVS_MODELParser.INOTHERCASESYMBOL:
			case CFG_DEVS_MODELParser.OTHERWISESYMBOL:
				_localctx = new FunctionPreIfDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 465;
				(_localctx as FunctionPreIfDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 466;
				(_localctx as FunctionPreIfDefaultResultContext)._result = this.tupleValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDescriptionPostIf(): FunctionDescriptionPostIfContext {
		let _localctx: FunctionDescriptionPostIfContext = new FunctionDescriptionPostIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 46, CFG_DEVS_MODELParser.RULE_functionDescriptionPostIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 470;
			this.functionPostIfResult();
			this.state = 475;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 471;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 472;
				this.functionPostIfResult();
				}
				}
				this.state = 477;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionPostIfResult(): FunctionPostIfResultContext {
		let _localctx: FunctionPostIfResultContext = new FunctionPostIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 48, CFG_DEVS_MODELParser.RULE_functionPostIfResult);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 478;
			_localctx._result = this.tupleValue();
			this.state = 479;
			_localctx._cond = this.ifCondition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionGenericDescription(): FunctionGenericDescriptionContext {
		let _localctx: FunctionGenericDescriptionContext = new FunctionGenericDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 50, CFG_DEVS_MODELParser.RULE_functionGenericDescription);
		try {
			this.state = 489;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 10, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 481;
				_localctx._vars = this.variableTuple();
				this.state = 482;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 483;
				this.functionDescriptionAssignmentPreIf();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 485;
				_localctx._vars = this.variableTuple();
				this.state = 486;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 487;
				this.functionDescriptionAssignmentPostIf();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDescriptionAssignmentPreIf(): FunctionDescriptionAssignmentPreIfContext {
		let _localctx: FunctionDescriptionAssignmentPreIfContext = new FunctionDescriptionAssignmentPreIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 52, CFG_DEVS_MODELParser.RULE_functionDescriptionAssignmentPreIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 491;
			this.functionAssignPreIfResult();
			this.state = 496;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 492;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 493;
				this.functionAssignPreIfResult();
				}
				}
				this.state = 498;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDescriptionAssignmentPostIf(): FunctionDescriptionAssignmentPostIfContext {
		let _localctx: FunctionDescriptionAssignmentPostIfContext = new FunctionDescriptionAssignmentPostIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 54, CFG_DEVS_MODELParser.RULE_functionDescriptionAssignmentPostIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 499;
			this.functionAssignPostIfResult();
			this.state = 504;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 500;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 501;
				this.functionAssignPostIfResult();
				}
				}
				this.state = 506;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionAssignPreIfResult(): FunctionAssignPreIfResultContext {
		let _localctx: FunctionAssignPreIfResultContext = new FunctionAssignPreIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 56, CFG_DEVS_MODELParser.RULE_functionAssignPreIfResult);
		try {
			this.state = 513;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.IFSYMBOL:
				_localctx = new FunctionAssignPreIfConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 507;
				(_localctx as FunctionAssignPreIfConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 508;
				this.assignTuple();
				}
				break;
			case CFG_DEVS_MODELParser.INOTHERCASESYMBOL:
			case CFG_DEVS_MODELParser.OTHERWISESYMBOL:
				_localctx = new FunctionAssignPreIfDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 510;
				(_localctx as FunctionAssignPreIfDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 511;
				this.assignTuple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionAssignPostIfResult(): FunctionAssignPostIfResultContext {
		let _localctx: FunctionAssignPostIfResultContext = new FunctionAssignPostIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 58, CFG_DEVS_MODELParser.RULE_functionAssignPostIfResult);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 515;
			this.assignTuple();
			this.state = 516;
			_localctx._cond = this.ifCondition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionGenericValuesDescription(): FunctionGenericValuesDescriptionContext {
		let _localctx: FunctionGenericValuesDescriptionContext = new FunctionGenericValuesDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 60, CFG_DEVS_MODELParser.RULE_functionGenericValuesDescription);
		try {
			this.state = 526;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 14, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 518;
				_localctx._vars = this.variableTupleFixedValues();
				this.state = 519;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 520;
				this.functionDescriptionValuesAssignmentPreIf();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 522;
				_localctx._vars = this.variableTupleFixedValues();
				this.state = 523;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 524;
				this.functionDescriptionValuesAssignmentPostIf();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDescriptionValuesAssignmentPreIf(): FunctionDescriptionValuesAssignmentPreIfContext {
		let _localctx: FunctionDescriptionValuesAssignmentPreIfContext = new FunctionDescriptionValuesAssignmentPreIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 62, CFG_DEVS_MODELParser.RULE_functionDescriptionValuesAssignmentPreIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 528;
			this.functionValuesAssignPreIfResult();
			this.state = 533;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 529;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 530;
				this.functionValuesAssignPreIfResult();
				}
				}
				this.state = 535;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionDescriptionValuesAssignmentPostIf(): FunctionDescriptionValuesAssignmentPostIfContext {
		let _localctx: FunctionDescriptionValuesAssignmentPostIfContext = new FunctionDescriptionValuesAssignmentPostIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 64, CFG_DEVS_MODELParser.RULE_functionDescriptionValuesAssignmentPostIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 536;
			this.functionValuesAssignPostIfResult();
			this.state = 541;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 537;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 538;
				this.functionValuesAssignPostIfResult();
				}
				}
				this.state = 543;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionValuesAssignPreIfResult(): FunctionValuesAssignPreIfResultContext {
		let _localctx: FunctionValuesAssignPreIfResultContext = new FunctionValuesAssignPreIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 66, CFG_DEVS_MODELParser.RULE_functionValuesAssignPreIfResult);
		try {
			this.state = 550;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.IFSYMBOL:
				_localctx = new FunctionValuesAssignPreIfConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 544;
				(_localctx as FunctionValuesAssignPreIfConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 545;
				this.assignmentsList();
				}
				break;
			case CFG_DEVS_MODELParser.INOTHERCASESYMBOL:
			case CFG_DEVS_MODELParser.OTHERWISESYMBOL:
				_localctx = new FunctionValuesAssignPreIfDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 547;
				(_localctx as FunctionValuesAssignPreIfDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 548;
				this.assignmentsList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public functionValuesAssignPostIfResult(): FunctionValuesAssignPostIfResultContext {
		let _localctx: FunctionValuesAssignPostIfResultContext = new FunctionValuesAssignPostIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 68, CFG_DEVS_MODELParser.RULE_functionValuesAssignPostIfResult);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 552;
			this.assignmentsList();
			this.state = 553;
			_localctx._cond = this.ifCondition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tupleValue(): TupleValueContext {
		let _localctx: TupleValueContext = new TupleValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 70, CFG_DEVS_MODELParser.RULE_tupleValue);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 555;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 556;
			this.value();
			this.state = 561;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 557;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 558;
				this.value();
				}
				}
				this.state = 563;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			this.state = 564;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public value(): ValueContext {
		let _localctx: ValueContext = new ValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 72, CFG_DEVS_MODELParser.RULE_value);
		try {
			this.state = 570;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 19, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 566;
				this.element();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 567;
				this.infinitySymbol();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 568;
				this.mathExpression();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 569;
				this.booleanExpression();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunctionDescription(): TaFunctionDescriptionContext {
		let _localctx: TaFunctionDescriptionContext = new TaFunctionDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 74, CFG_DEVS_MODELParser.RULE_taFunctionDescription);
		try {
			this.state = 576;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 20, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 572;
				this.taFunctionGenericDescription();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 573;
				this.taFunctionDescriptionPreIf();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 574;
				this.taFunctionDescriptionPostIf();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 575;
				this.value();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunctionDescriptionPreIf(): TaFunctionDescriptionPreIfContext {
		let _localctx: TaFunctionDescriptionPreIfContext = new TaFunctionDescriptionPreIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 76, CFG_DEVS_MODELParser.RULE_taFunctionDescriptionPreIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 578;
			this.taFunctionPreIfResult();
			this.state = 583;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 579;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 580;
				this.taFunctionPreIfResult();
				}
				}
				this.state = 585;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunctionPreIfResult(): TaFunctionPreIfResultContext {
		let _localctx: TaFunctionPreIfResultContext = new TaFunctionPreIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 78, CFG_DEVS_MODELParser.RULE_taFunctionPreIfResult);
		try {
			this.state = 592;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.IFSYMBOL:
				_localctx = new TaFunctionPreIfConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 586;
				(_localctx as TaFunctionPreIfConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 587;
				(_localctx as TaFunctionPreIfConditionalResultContext)._result = this.value();
				}
				break;
			case CFG_DEVS_MODELParser.INOTHERCASESYMBOL:
			case CFG_DEVS_MODELParser.OTHERWISESYMBOL:
				_localctx = new TaFunctionPreIfDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 589;
				(_localctx as TaFunctionPreIfDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 590;
				(_localctx as TaFunctionPreIfDefaultResultContext)._result = this.value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunctionDescriptionPostIf(): TaFunctionDescriptionPostIfContext {
		let _localctx: TaFunctionDescriptionPostIfContext = new TaFunctionDescriptionPostIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 80, CFG_DEVS_MODELParser.RULE_taFunctionDescriptionPostIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 594;
			this.taFunctionPostIfResult();
			this.state = 599;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 595;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 596;
				this.taFunctionPostIfResult();
				}
				}
				this.state = 601;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunctionPostIfResult(): TaFunctionPostIfResultContext {
		let _localctx: TaFunctionPostIfResultContext = new TaFunctionPostIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 82, CFG_DEVS_MODELParser.RULE_taFunctionPostIfResult);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 602;
			_localctx._result = this.value();
			this.state = 603;
			_localctx._cond = this.ifCondition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taFunctionGenericDescription(): TaFunctionGenericDescriptionContext {
		let _localctx: TaFunctionGenericDescriptionContext = new TaFunctionGenericDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 84, CFG_DEVS_MODELParser.RULE_taFunctionGenericDescription);
		try {
			this.state = 613;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 24, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 605;
				_localctx._var = this.variable();
				this.state = 606;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 607;
				this.taAssignPreIf();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 609;
				_localctx._var = this.variable();
				this.state = 610;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 611;
				this.taAssignPostIf();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taAssignPreIf(): TaAssignPreIfContext {
		let _localctx: TaAssignPreIfContext = new TaAssignPreIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 86, CFG_DEVS_MODELParser.RULE_taAssignPreIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 615;
			this.taAssignPreIfResult();
			this.state = 620;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 616;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 617;
				this.taAssignPreIfResult();
				}
				}
				this.state = 622;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taAssignPreIfResult(): TaAssignPreIfResultContext {
		let _localctx: TaAssignPreIfResultContext = new TaAssignPreIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 88, CFG_DEVS_MODELParser.RULE_taAssignPreIfResult);
		try {
			this.state = 629;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.IFSYMBOL:
				_localctx = new TaAssignPreIfConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 623;
				(_localctx as TaAssignPreIfConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 624;
				this.assignValue();
				}
				break;
			case CFG_DEVS_MODELParser.INOTHERCASESYMBOL:
			case CFG_DEVS_MODELParser.OTHERWISESYMBOL:
				_localctx = new TaAssignPreIfDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 626;
				(_localctx as TaAssignPreIfDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 627;
				this.assignValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taAssignPostIf(): TaAssignPostIfContext {
		let _localctx: TaAssignPostIfContext = new TaAssignPostIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 90, CFG_DEVS_MODELParser.RULE_taAssignPostIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 631;
			this.taAssignPostIfResult();
			this.state = 636;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 632;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 633;
				this.taAssignPostIfResult();
				}
				}
				this.state = 638;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public taAssignPostIfResult(): TaAssignPostIfResultContext {
		let _localctx: TaAssignPostIfResultContext = new TaAssignPostIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 92, CFG_DEVS_MODELParser.RULE_taAssignPostIfResult);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 639;
			this.assignValue();
			this.state = 640;
			_localctx._cond = this.ifCondition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunctionDescription(): SelectFunctionDescriptionContext {
		let _localctx: SelectFunctionDescriptionContext = new SelectFunctionDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 94, CFG_DEVS_MODELParser.RULE_selectFunctionDescription);
		try {
			this.state = 646;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 28, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 642;
				this.identifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 643;
				this.selectFunctionDescriptionPreIf();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 644;
				this.selectFunctionDescriptionPostIf();
				}
				break;

			case 4:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 645;
				this.selectFunctionGenericDescription();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunctionDescriptionPreIf(): SelectFunctionDescriptionPreIfContext {
		let _localctx: SelectFunctionDescriptionPreIfContext = new SelectFunctionDescriptionPreIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 96, CFG_DEVS_MODELParser.RULE_selectFunctionDescriptionPreIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 648;
			this.selectFunctionPreIfResult();
			this.state = 653;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 649;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 650;
				this.selectFunctionPreIfResult();
				}
				}
				this.state = 655;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunctionPreIfResult(): SelectFunctionPreIfResultContext {
		let _localctx: SelectFunctionPreIfResultContext = new SelectFunctionPreIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 98, CFG_DEVS_MODELParser.RULE_selectFunctionPreIfResult);
		try {
			this.state = 662;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.IFSYMBOL:
				_localctx = new SelectFunctionPreIfConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 656;
				(_localctx as SelectFunctionPreIfConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 657;
				this.identifier();
				}
				break;
			case CFG_DEVS_MODELParser.INOTHERCASESYMBOL:
			case CFG_DEVS_MODELParser.OTHERWISESYMBOL:
				_localctx = new SelectFunctionPreIfDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 659;
				(_localctx as SelectFunctionPreIfDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 660;
				this.identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunctionDescriptionPostIf(): SelectFunctionDescriptionPostIfContext {
		let _localctx: SelectFunctionDescriptionPostIfContext = new SelectFunctionDescriptionPostIfContext(this._ctx, this.state);
		this.enterRule(_localctx, 100, CFG_DEVS_MODELParser.RULE_selectFunctionDescriptionPostIf);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 664;
			this.selectFunctionPostIfResult();
			this.state = 669;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 665;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 666;
				this.selectFunctionPostIfResult();
				}
				}
				this.state = 671;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunctionPostIfResult(): SelectFunctionPostIfResultContext {
		let _localctx: SelectFunctionPostIfResultContext = new SelectFunctionPostIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 102, CFG_DEVS_MODELParser.RULE_selectFunctionPostIfResult);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 672;
			this.identifier();
			this.state = 673;
			_localctx._cond = this.ifCondition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectFunctionGenericDescription(): SelectFunctionGenericDescriptionContext {
		let _localctx: SelectFunctionGenericDescriptionContext = new SelectFunctionGenericDescriptionContext(this._ctx, this.state);
		this.enterRule(_localctx, 104, CFG_DEVS_MODELParser.RULE_selectFunctionGenericDescription);
		try {
			this.state = 683;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 32, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 675;
				_localctx._var = this.variable();
				this.state = 676;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 677;
				this.selectAssignPreIfList();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 679;
				_localctx._var = this.variable();
				this.state = 680;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 681;
				this.selectAssignPostIfList();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectAssignPreIfList(): SelectAssignPreIfListContext {
		let _localctx: SelectAssignPreIfListContext = new SelectAssignPreIfListContext(this._ctx, this.state);
		this.enterRule(_localctx, 106, CFG_DEVS_MODELParser.RULE_selectAssignPreIfList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 685;
			this.selectAssignPreIfResult();
			this.state = 690;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 686;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 687;
				this.selectAssignPreIfResult();
				}
				}
				this.state = 692;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectAssignPreIfResult(): SelectAssignPreIfResultContext {
		let _localctx: SelectAssignPreIfResultContext = new SelectAssignPreIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 108, CFG_DEVS_MODELParser.RULE_selectAssignPreIfResult);
		try {
			this.state = 705;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 34, this._ctx) ) {
			case 1:
				_localctx = new SelectAssignPreIfIdentifierConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 693;
				(_localctx as SelectAssignPreIfIdentifierConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 694;
				this.assignIdentifier();
				}
				break;

			case 2:
				_localctx = new SelectAssignPreIfParameterConditionalResultContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 696;
				(_localctx as SelectAssignPreIfParameterConditionalResultContext)._cond = this.ifThenCondition();
				this.state = 697;
				this.assignParameter();
				}
				break;

			case 3:
				_localctx = new SelectAssignPreIfIdentifierDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 699;
				(_localctx as SelectAssignPreIfIdentifierDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 700;
				this.assignIdentifier();
				}
				break;

			case 4:
				_localctx = new SelectAssignPreIfParameterDefaultResultContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 702;
				(_localctx as SelectAssignPreIfParameterDefaultResultContext)._cond = this.inOtherCaseSymbol();
				this.state = 703;
				this.assignParameter();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectAssignPostIfList(): SelectAssignPostIfListContext {
		let _localctx: SelectAssignPostIfListContext = new SelectAssignPostIfListContext(this._ctx, this.state);
		this.enterRule(_localctx, 110, CFG_DEVS_MODELParser.RULE_selectAssignPostIfList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 707;
			this.selectAssignPostIfResult();
			this.state = 712;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 708;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 709;
				this.selectAssignPostIfResult();
				}
				}
				this.state = 714;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public selectAssignPostIfResult(): SelectAssignPostIfResultContext {
		let _localctx: SelectAssignPostIfResultContext = new SelectAssignPostIfResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 112, CFG_DEVS_MODELParser.RULE_selectAssignPostIfResult);
		try {
			this.state = 721;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 36, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 715;
				this.assignIdentifier();
				this.state = 716;
				_localctx._cond = this.ifCondition();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 718;
				this.assignParameter();
				this.state = 719;
				_localctx._cond = this.ifCondition();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignIdentifier(): AssignIdentifierContext {
		let _localctx: AssignIdentifierContext = new AssignIdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 114, CFG_DEVS_MODELParser.RULE_assignIdentifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 723;
			this.variable();
			this.state = 724;
			this.match(CFG_DEVS_MODELParser.ASSIGNOPERATOR);
			this.state = 725;
			this.identifier();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignParameter(): AssignParameterContext {
		let _localctx: AssignParameterContext = new AssignParameterContext(this._ctx, this.state);
		this.enterRule(_localctx, 116, CFG_DEVS_MODELParser.RULE_assignParameter);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 727;
			this.variable();
			this.state = 728;
			this.match(CFG_DEVS_MODELParser.ASSIGNOPERATOR);
			this.state = 729;
			this.parameter();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignValue(): AssignValueContext {
		let _localctx: AssignValueContext = new AssignValueContext(this._ctx, this.state);
		this.enterRule(_localctx, 118, CFG_DEVS_MODELParser.RULE_assignValue);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 731;
			this.variable();
			this.state = 732;
			this.match(CFG_DEVS_MODELParser.ASSIGNOPERATOR);
			this.state = 733;
			this.value();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignTuple(): AssignTupleContext {
		let _localctx: AssignTupleContext = new AssignTupleContext(this._ctx, this.state);
		this.enterRule(_localctx, 120, CFG_DEVS_MODELParser.RULE_assignTuple);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 735;
			this.variableTuple();
			this.state = 736;
			this.match(CFG_DEVS_MODELParser.ASSIGNOPERATOR);
			this.state = 737;
			this.tupleValue();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignElement(): AssignElementContext {
		let _localctx: AssignElementContext = new AssignElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 122, CFG_DEVS_MODELParser.RULE_assignElement);
		try {
			this.state = 742;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 37, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 739;
				this.assignIdentifier();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 740;
				this.assignValue();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 741;
				this.assignTuple();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public assignmentsList(): AssignmentsListContext {
		let _localctx: AssignmentsListContext = new AssignmentsListContext(this._ctx, this.state);
		this.enterRule(_localctx, 124, CFG_DEVS_MODELParser.RULE_assignmentsList);
		let _la: number;
		try {
			let _alt: number;
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 744;
			this.assignElement();
			this.state = 749;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 38, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 745;
					_la = this._input.LA(1);
					if (!(_la === CFG_DEVS_MODELParser.ANDOPERATOR || _la === CFG_DEVS_MODELParser.COMMA)) {
					this._errHandler.recoverInline(this);
					} else {
						if (this._input.LA(1) === Token.EOF) {
							this.matchedEOF = true;
						}

						this._errHandler.reportMatch(this);
						this.consume();
					}
					this.state = 746;
					this.assignElement();
					}
					}
				}
				this.state = 751;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 38, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public modelSignature(): ModelSignatureContext {
		let _localctx: ModelSignatureContext = new ModelSignatureContext(this._ctx, this.state);
		this.enterRule(_localctx, 126, CFG_DEVS_MODELParser.RULE_modelSignature);
		try {
			this.state = 758;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 39, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 752;
				this.modelSymbol();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 753;
				this.modelSymbol();
				this.state = 754;
				this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
				this.state = 755;
				this.parametersList();
				this.state = 756;
				this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public modelSymbol(): ModelSymbolContext {
		let _localctx: ModelSymbolContext = new ModelSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 128, CFG_DEVS_MODELParser.RULE_modelSymbol);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 760;
			_la = this._input.LA(1);
			if (!((((_la) & ~0x1F) === 0 && ((1 << _la) & ((1 << CFG_DEVS_MODELParser.UPPERCASEID) | (1 << CFG_DEVS_MODELParser.LOWERCASEID) | (1 << CFG_DEVS_MODELParser.FULLCASEID))) !== 0))) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parameter(): ParameterContext {
		let _localctx: ParameterContext = new ParameterContext(this._ctx, this.state);
		this.enterRule(_localctx, 130, CFG_DEVS_MODELParser.RULE_parameter);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 762;
			this.match(CFG_DEVS_MODELParser.HASH);
			this.state = 763;
			this.match(CFG_DEVS_MODELParser.LOWERCASEID);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public identifier(): IdentifierContext {
		let _localctx: IdentifierContext = new IdentifierContext(this._ctx, this.state);
		this.enterRule(_localctx, 132, CFG_DEVS_MODELParser.RULE_identifier);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 765;
			this.match(CFG_DEVS_MODELParser.LOWERCASEID);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variable(): VariableContext {
		let _localctx: VariableContext = new VariableContext(this._ctx, this.state);
		this.enterRule(_localctx, 134, CFG_DEVS_MODELParser.RULE_variable);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 767;
			this.match(CFG_DEVS_MODELParser.LOWERCASEID);
			this.state = 768;
			this.match(CFG_DEVS_MODELParser.APOSTROPHE);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableFixedValues(): VariableFixedValuesContext {
		let _localctx: VariableFixedValuesContext = new VariableFixedValuesContext(this._ctx, this.state);
		this.enterRule(_localctx, 136, CFG_DEVS_MODELParser.RULE_variableFixedValues);
		try {
			this.state = 773;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 40, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 770;
				this.variable();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 771;
				this.datatypeSymbol();
				}
				break;

			case 3:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 772;
				this.identifier();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public parametersList(): ParametersListContext {
		let _localctx: ParametersListContext = new ParametersListContext(this._ctx, this.state);
		this.enterRule(_localctx, 138, CFG_DEVS_MODELParser.RULE_parametersList);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 775;
			this.parameter();
			this.state = 780;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 776;
				this.match(CFG_DEVS_MODELParser.COMMA);
				this.state = 777;
				this.parameter();
				}
				}
				this.state = 782;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public datatypeSymbol(): DatatypeSymbolContext {
		let _localctx: DatatypeSymbolContext = new DatatypeSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 140, CFG_DEVS_MODELParser.RULE_datatypeSymbol);
		try {
			this.state = 789;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.TRUESYMBOL:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 783;
				this.trueSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.FALSESYMBOL:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 784;
				this.falseSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 785;
				this.integerSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.REALSYMBOL:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 786;
				this.realSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.INFINITYSYMBOL:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 787;
				this.infinitySymbol();
				}
				break;
			case CFG_DEVS_MODELParser.STRINGSYMBOL:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 788;
				this.stringSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public trueSymbol(): TrueSymbolContext {
		let _localctx: TrueSymbolContext = new TrueSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 142, CFG_DEVS_MODELParser.RULE_trueSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 791;
			this.match(CFG_DEVS_MODELParser.TRUESYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public falseSymbol(): FalseSymbolContext {
		let _localctx: FalseSymbolContext = new FalseSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 144, CFG_DEVS_MODELParser.RULE_falseSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 793;
			this.match(CFG_DEVS_MODELParser.FALSESYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public integerSymbol(): IntegerSymbolContext {
		let _localctx: IntegerSymbolContext = new IntegerSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 146, CFG_DEVS_MODELParser.RULE_integerSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 795;
			this.match(CFG_DEVS_MODELParser.INTEGERSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public realSymbol(): RealSymbolContext {
		let _localctx: RealSymbolContext = new RealSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 148, CFG_DEVS_MODELParser.RULE_realSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 797;
			this.match(CFG_DEVS_MODELParser.REALSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public infinitySymbol(): InfinitySymbolContext {
		let _localctx: InfinitySymbolContext = new InfinitySymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 150, CFG_DEVS_MODELParser.RULE_infinitySymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 799;
			this.match(CFG_DEVS_MODELParser.INFINITYSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public stringSymbol(): StringSymbolContext {
		let _localctx: StringSymbolContext = new StringSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 152, CFG_DEVS_MODELParser.RULE_stringSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 801;
			this.match(CFG_DEVS_MODELParser.STRINGSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public root(): RootContext {
		let _localctx: RootContext = new RootContext(this._ctx, this.state);
		this.enterRule(_localctx, 154, CFG_DEVS_MODELParser.RULE_root);
		try {
			this.state = 812;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 43, this._ctx) ) {
			case 1:
				_localctx = new RootIfThenContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 803;
				this.ifThenCondition();
				this.state = 804;
				this.match(CFG_DEVS_MODELParser.EOF);
				}
				break;

			case 2:
				_localctx = new RootIfContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 806;
				this.ifCondition();
				this.state = 807;
				this.match(CFG_DEVS_MODELParser.EOF);
				}
				break;

			case 3:
				_localctx = new RootBooleanExprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 809;
				this.booleanExpression();
				this.state = 810;
				this.match(CFG_DEVS_MODELParser.EOF);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ifCondition(): IfConditionContext {
		let _localctx: IfConditionContext = new IfConditionContext(this._ctx, this.state);
		this.enterRule(_localctx, 156, CFG_DEVS_MODELParser.RULE_ifCondition);
		try {
			this.state = 823;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 44, this._ctx) ) {
			case 1:
				_localctx = new IfConditionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 814;
				this.ifSymbol();
				this.state = 815;
				this.booleanExpression();
				}
				break;

			case 2:
				_localctx = new IfConditionParExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 817;
				this.ifSymbol();
				this.state = 818;
				this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
				this.state = 819;
				this.booleanExpression();
				this.state = 820;
				this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
				}
				break;

			case 3:
				_localctx = new IfConditionDefaultExprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 822;
				this.inOtherCaseSymbol();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ifThenCondition(): IfThenConditionContext {
		let _localctx: IfThenConditionContext = new IfThenConditionContext(this._ctx, this.state);
		this.enterRule(_localctx, 158, CFG_DEVS_MODELParser.RULE_ifThenCondition);
		try {
			this.state = 835;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 45, this._ctx) ) {
			case 1:
				_localctx = new IfThenExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 825;
				this.ifSymbol();
				this.state = 826;
				this.booleanExpression();
				this.state = 827;
				this.match(CFG_DEVS_MODELParser.THENSYMBOL);
				}
				break;

			case 2:
				_localctx = new IfThenParExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 829;
				this.ifSymbol();
				this.state = 830;
				this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
				this.state = 831;
				this.booleanExpression();
				this.state = 832;
				this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
				this.state = 833;
				this.match(CFG_DEVS_MODELParser.THENSYMBOL);
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public booleanExpression(): BooleanExpressionContext {
		let _localctx: BooleanExpressionContext = new BooleanExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 160, CFG_DEVS_MODELParser.RULE_booleanExpression);
		try {
			this.state = 839;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 46, this._ctx) ) {
			case 1:
				_localctx = new BinaryConditionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 837;
				(_localctx as BinaryConditionExprContext)._bc = this.binaryCondition();
				}
				break;

			case 2:
				_localctx = new BooleanTermExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 838;
				(_localctx as BooleanTermExprContext)._bt = this.booleanExpressionTerm();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public binaryCondition(): BinaryConditionContext {
		let _localctx: BinaryConditionContext = new BinaryConditionContext(this._ctx, this.state);
		this.enterRule(_localctx, 162, CFG_DEVS_MODELParser.RULE_binaryCondition);
		try {
			let _alt: number;
			_localctx = new BinaryExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 841;
			(_localctx as BinaryExprContext)._left = this.booleanExpressionTerm();
			this.state = 847;
			this._errHandler.sync(this);
			_alt = this.interpreter.adaptivePredict(this._input, 47, this._ctx);
			while (_alt !== 2 && _alt !== ATN.INVALID_ALT_NUMBER) {
				if (_alt === 1) {
					{
					{
					this.state = 842;
					this.binaryConditionalOperator();
					this.state = 843;
					(_localctx as BinaryExprContext)._right = this.booleanExpressionTerm();
					}
					}
				}
				this.state = 849;
				this._errHandler.sync(this);
				_alt = this.interpreter.adaptivePredict(this._input, 47, this._ctx);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public booleanExpressionTerm(): BooleanExpressionTermContext {
		let _localctx: BooleanExpressionTermContext = new BooleanExpressionTermContext(this._ctx, this.state);
		this.enterRule(_localctx, 164, CFG_DEVS_MODELParser.RULE_booleanExpressionTerm);
		try {
			this.state = 852;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.LOWERCASEID:
			case CFG_DEVS_MODELParser.FULLCASEID:
			case CFG_DEVS_MODELParser.STRINGSYMBOL:
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
			case CFG_DEVS_MODELParser.REALSYMBOL:
			case CFG_DEVS_MODELParser.EMPTYSETSYMBOL:
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
			case CFG_DEVS_MODELParser.TRUESYMBOL:
			case CFG_DEVS_MODELParser.FALSESYMBOL:
			case CFG_DEVS_MODELParser.INFINITYSYMBOL:
			case CFG_DEVS_MODELParser.HASH:
			case CFG_DEVS_MODELParser.BEGINSET:
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new RelationalTermExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 850;
				(_localctx as RelationalTermExprContext)._rt = this.relationalExpressionTerm();
				}
				break;
			case CFG_DEVS_MODELParser.NOTOPERATOR:
				_localctx = new UnaryTermExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 851;
				(_localctx as UnaryTermExprContext)._uc = this.unaryCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unaryCondition(): UnaryConditionContext {
		let _localctx: UnaryConditionContext = new UnaryConditionContext(this._ctx, this.state);
		this.enterRule(_localctx, 166, CFG_DEVS_MODELParser.RULE_unaryCondition);
		try {
			_localctx = new UnaryCondExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 854;
			(_localctx as UnaryCondExprContext)._op = this.unaryConditionalOperator();
			this.state = 855;
			(_localctx as UnaryCondExprContext)._expr = this.booleanExpressionTerm();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public relationalExpressionTerm(): RelationalExpressionTermContext {
		let _localctx: RelationalExpressionTermContext = new RelationalExpressionTermContext(this._ctx, this.state);
		this.enterRule(_localctx, 168, CFG_DEVS_MODELParser.RULE_relationalExpressionTerm);
		let _la: number;
		try {
			_localctx = new RelationalExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 857;
			(_localctx as RelationalExprContext)._left = this.booleanExpressionBasicTerm();
			this.state = 863;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 36)) & ~0x1F) === 0 && ((1 << (_la - 36)) & ((1 << (CFG_DEVS_MODELParser.EQUALTOOPERATOR - 36)) | (1 << (CFG_DEVS_MODELParser.NOTEQUALTOOPERATOR - 36)) | (1 << (CFG_DEVS_MODELParser.GREATERTHANOPERATOR - 36)) | (1 << (CFG_DEVS_MODELParser.LESSTHANOPERATOR - 36)) | (1 << (CFG_DEVS_MODELParser.GREATERTHANOREQUALTOOPERATOR - 36)) | (1 << (CFG_DEVS_MODELParser.LESSTHANOREQUALTOOPERATOR - 36)))) !== 0)) {
				{
				{
				this.state = 858;
				(_localctx as RelationalExprContext)._op = this.binaryRelationalOperator();
				this.state = 859;
				(_localctx as RelationalExprContext)._right = this.booleanExpressionBasicTerm();
				}
				}
				this.state = 865;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public booleanExpressionBasicTerm(): BooleanExpressionBasicTermContext {
		let _localctx: BooleanExpressionBasicTermContext = new BooleanExpressionBasicTermContext(this._ctx, this.state);
		this.enterRule(_localctx, 170, CFG_DEVS_MODELParser.RULE_booleanExpressionBasicTerm);
		try {
			this.state = 868;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 50, this._ctx) ) {
			case 1:
				_localctx = new BasicElementExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 866;
				(_localctx as BasicElementExprContext)._el = this.booleanExpressionElement();
				}
				break;

			case 2:
				_localctx = new BasicParenthesisExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 867;
				(_localctx as BasicParenthesisExprContext)._res = this.booleanExpressionResult();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public booleanExpressionElement(): BooleanExpressionElementContext {
		let _localctx: BooleanExpressionElementContext = new BooleanExpressionElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 172, CFG_DEVS_MODELParser.RULE_booleanExpressionElement);
		try {
			this.state = 873;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 51, this._ctx) ) {
			case 1:
				_localctx = new ElementExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 870;
				(_localctx as ElementExprContext)._el = this.element();
				}
				break;

			case 2:
				_localctx = new ElementDefinitionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 871;
				(_localctx as ElementDefinitionExprContext)._el = this.elementDefinition();
				}
				break;

			case 3:
				_localctx = new InfinityExprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 872;
				this.infinitySymbol();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public booleanExpressionResult(): BooleanExpressionResultContext {
		let _localctx: BooleanExpressionResultContext = new BooleanExpressionResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 174, CFG_DEVS_MODELParser.RULE_booleanExpressionResult);
		try {
			_localctx = new ParenthesisExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 875;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 876;
			(_localctx as ParenthesisExprContext)._expr = this.booleanExpression();
			this.state = 877;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public actionExpression(): ActionExpressionContext {
		let _localctx: ActionExpressionContext = new ActionExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 176, CFG_DEVS_MODELParser.RULE_actionExpression);
		try {
			this.state = 882;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 52, this._ctx) ) {
			case 1:
				_localctx = new ActionInfinityContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 879;
				this.infinitySymbol();
				}
				break;

			case 2:
				_localctx = new ActionElementContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 880;
				this.element();
				}
				break;

			case 3:
				_localctx = new ActionElementDefinitionContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 881;
				this.elementDefinition();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public ifSymbol(): IfSymbolContext {
		let _localctx: IfSymbolContext = new IfSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 178, CFG_DEVS_MODELParser.RULE_ifSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 884;
			this.match(CFG_DEVS_MODELParser.IFSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		let _localctx: InOtherCaseSymbolContext = new InOtherCaseSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 180, CFG_DEVS_MODELParser.RULE_inOtherCaseSymbol);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 886;
			_la = this._input.LA(1);
			if (!(_la === CFG_DEVS_MODELParser.INOTHERCASESYMBOL || _la === CFG_DEVS_MODELParser.OTHERWISESYMBOL)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unaryConditionalOperator(): UnaryConditionalOperatorContext {
		let _localctx: UnaryConditionalOperatorContext = new UnaryConditionalOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 182, CFG_DEVS_MODELParser.RULE_unaryConditionalOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 888;
			this.notOperator();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public binaryConditionalOperator(): BinaryConditionalOperatorContext {
		let _localctx: BinaryConditionalOperatorContext = new BinaryConditionalOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 184, CFG_DEVS_MODELParser.RULE_binaryConditionalOperator);
		try {
			this.state = 892;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.ANDOPERATOR:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 890;
				this.andOperator();
				}
				break;
			case CFG_DEVS_MODELParser.OROPERATOR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 891;
				this.orOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public binaryRelationalOperator(): BinaryRelationalOperatorContext {
		let _localctx: BinaryRelationalOperatorContext = new BinaryRelationalOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 186, CFG_DEVS_MODELParser.RULE_binaryRelationalOperator);
		try {
			this.state = 900;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.EQUALTOOPERATOR:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 894;
				this.equalToOperator();
				}
				break;
			case CFG_DEVS_MODELParser.NOTEQUALTOOPERATOR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 895;
				this.notEqualToOperator();
				}
				break;
			case CFG_DEVS_MODELParser.GREATERTHANOPERATOR:
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 896;
				this.greaterThanOperator();
				}
				break;
			case CFG_DEVS_MODELParser.LESSTHANOPERATOR:
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 897;
				this.lessThanOperator();
				}
				break;
			case CFG_DEVS_MODELParser.GREATERTHANOREQUALTOOPERATOR:
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 898;
				this.greaterThanOrEqualToOperator();
				}
				break;
			case CFG_DEVS_MODELParser.LESSTHANOREQUALTOOPERATOR:
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 899;
				this.lessThanOrEqualToOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public notOperator(): NotOperatorContext {
		let _localctx: NotOperatorContext = new NotOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 188, CFG_DEVS_MODELParser.RULE_notOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 902;
			this.match(CFG_DEVS_MODELParser.NOTOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public andOperator(): AndOperatorContext {
		let _localctx: AndOperatorContext = new AndOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 190, CFG_DEVS_MODELParser.RULE_andOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 904;
			this.match(CFG_DEVS_MODELParser.ANDOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public orOperator(): OrOperatorContext {
		let _localctx: OrOperatorContext = new OrOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 192, CFG_DEVS_MODELParser.RULE_orOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 906;
			this.match(CFG_DEVS_MODELParser.OROPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public equalToOperator(): EqualToOperatorContext {
		let _localctx: EqualToOperatorContext = new EqualToOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 194, CFG_DEVS_MODELParser.RULE_equalToOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 908;
			this.match(CFG_DEVS_MODELParser.EQUALTOOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public notEqualToOperator(): NotEqualToOperatorContext {
		let _localctx: NotEqualToOperatorContext = new NotEqualToOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 196, CFG_DEVS_MODELParser.RULE_notEqualToOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 910;
			this.match(CFG_DEVS_MODELParser.NOTEQUALTOOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public greaterThanOperator(): GreaterThanOperatorContext {
		let _localctx: GreaterThanOperatorContext = new GreaterThanOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 198, CFG_DEVS_MODELParser.RULE_greaterThanOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 912;
			this.match(CFG_DEVS_MODELParser.GREATERTHANOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lessThanOperator(): LessThanOperatorContext {
		let _localctx: LessThanOperatorContext = new LessThanOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 200, CFG_DEVS_MODELParser.RULE_lessThanOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 914;
			this.match(CFG_DEVS_MODELParser.LESSTHANOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public greaterThanOrEqualToOperator(): GreaterThanOrEqualToOperatorContext {
		let _localctx: GreaterThanOrEqualToOperatorContext = new GreaterThanOrEqualToOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 202, CFG_DEVS_MODELParser.RULE_greaterThanOrEqualToOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 916;
			this.match(CFG_DEVS_MODELParser.GREATERTHANOREQUALTOOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public lessThanOrEqualToOperator(): LessThanOrEqualToOperatorContext {
		let _localctx: LessThanOrEqualToOperatorContext = new LessThanOrEqualToOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 204, CFG_DEVS_MODELParser.RULE_lessThanOrEqualToOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 918;
			this.match(CFG_DEVS_MODELParser.LESSTHANOREQUALTOOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public set(): SetContext {
		let _localctx: SetContext = new SetContext(this._ctx, this.state);
		this.enterRule(_localctx, 206, CFG_DEVS_MODELParser.RULE_set);
		try {
			this.state = 922;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 55, this._ctx) ) {
			case 1:
				_localctx = new SetImplicitDefinitionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 920;
				(_localctx as SetImplicitDefinitionExprContext)._si = this.setImplicitDefinition();
				}
				break;

			case 2:
				_localctx = new SetExplicitDefinitionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 921;
				(_localctx as SetExplicitDefinitionExprContext)._se = this.setExplicitDefinition();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setImplicitDefinition(): SetImplicitDefinitionContext {
		let _localctx: SetImplicitDefinitionContext = new SetImplicitDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 208, CFG_DEVS_MODELParser.RULE_setImplicitDefinition);
		try {
			this.state = 926;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 56, this._ctx) ) {
			case 1:
				_localctx = new SetDefinitionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 924;
				(_localctx as SetDefinitionExprContext)._sd = this.setDefinition();
				}
				break;

			case 2:
				_localctx = new SetOperationResultExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 925;
				(_localctx as SetOperationResultExprContext)._sr = this.setOperationResult();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setExplicitDefinition(): SetExplicitDefinitionContext {
		let _localctx: SetExplicitDefinitionContext = new SetExplicitDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 210, CFG_DEVS_MODELParser.RULE_setExplicitDefinition);
		try {
			_localctx = new SetAssignmentExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 928;
			(_localctx as SetAssignmentExprContext)._s = this.setSymbol();
			this.state = 929;
			this.match(CFG_DEVS_MODELParser.EQUAL);
			this.state = 930;
			(_localctx as SetAssignmentExprContext)._rhs = this.setImplicitDefinition();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setDefinition(): SetDefinitionContext {
		let _localctx: SetDefinitionContext = new SetDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 212, CFG_DEVS_MODELParser.RULE_setDefinition);
		try {
			this.state = 934;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 57, this._ctx) ) {
			case 1:
				_localctx = new ElementCollectionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 932;
				(_localctx as ElementCollectionExprContext)._ec = this.elementCollection();
				}
				break;

			case 2:
				_localctx = new TupleCollectionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 933;
				(_localctx as TupleCollectionExprContext)._tc = this.tupleCollection();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setSymbol(): SetSymbolContext {
		let _localctx: SetSymbolContext = new SetSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 214, CFG_DEVS_MODELParser.RULE_setSymbol);
		try {
			this.state = 941;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
				_localctx = new SetNameSymbolExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 936;
				(_localctx as SetNameSymbolExprContext)._n = this.setName();
				}
				break;
			case CFG_DEVS_MODELParser.SETZSYMBOL:
				_localctx = new IntegerSetSymbolExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 937;
				(_localctx as IntegerSetSymbolExprContext)._z = this.setOfIntegerNumbersSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.SETNSYMBOL:
				_localctx = new NaturalSetSymbolExprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 938;
				(_localctx as NaturalSetSymbolExprContext)._nn = this.setOfNaturalNumbersSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.SETRSYMBOL:
				_localctx = new RealSetSymbolExprContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 939;
				(_localctx as RealSetSymbolExprContext)._r = this.setOfRealNumbersSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.SETBSYMBOL:
				_localctx = new BooleanSetSymbolExprContext(_localctx);
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 940;
				(_localctx as BooleanSetSymbolExprContext)._b = this.setOfBooleanAlgebraSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setName(): SetNameContext {
		let _localctx: SetNameContext = new SetNameContext(this._ctx, this.state);
		this.enterRule(_localctx, 216, CFG_DEVS_MODELParser.RULE_setName);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 943;
			this.match(CFG_DEVS_MODELParser.UPPERCASEID);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOfIntegerNumbersSymbol(): SetOfIntegerNumbersSymbolContext {
		let _localctx: SetOfIntegerNumbersSymbolContext = new SetOfIntegerNumbersSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 218, CFG_DEVS_MODELParser.RULE_setOfIntegerNumbersSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 945;
			this.match(CFG_DEVS_MODELParser.SETZSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOfNaturalNumbersSymbol(): SetOfNaturalNumbersSymbolContext {
		let _localctx: SetOfNaturalNumbersSymbolContext = new SetOfNaturalNumbersSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 220, CFG_DEVS_MODELParser.RULE_setOfNaturalNumbersSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 947;
			this.match(CFG_DEVS_MODELParser.SETNSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOfRealNumbersSymbol(): SetOfRealNumbersSymbolContext {
		let _localctx: SetOfRealNumbersSymbolContext = new SetOfRealNumbersSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 222, CFG_DEVS_MODELParser.RULE_setOfRealNumbersSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 949;
			this.match(CFG_DEVS_MODELParser.SETRSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOfBooleanAlgebraSymbol(): SetOfBooleanAlgebraSymbolContext {
		let _localctx: SetOfBooleanAlgebraSymbolContext = new SetOfBooleanAlgebraSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 224, CFG_DEVS_MODELParser.RULE_setOfBooleanAlgebraSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 951;
			this.match(CFG_DEVS_MODELParser.SETBSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public elementCollection(): ElementCollectionContext {
		let _localctx: ElementCollectionContext = new ElementCollectionContext(this._ctx, this.state);
		this.enterRule(_localctx, 226, CFG_DEVS_MODELParser.RULE_elementCollection);
		let _la: number;
		try {
			this.state = 971;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 60, this._ctx) ) {
			case 1:
				_localctx = new ElementListExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 953;
				this.match(CFG_DEVS_MODELParser.BEGINSET);
				this.state = 954;
				(_localctx as ElementListExprContext)._e1 = this.element();
				this.state = 959;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === CFG_DEVS_MODELParser.COMMA) {
					{
					{
					this.state = 955;
					this.match(CFG_DEVS_MODELParser.COMMA);
					this.state = 956;
					(_localctx as ElementListExprContext)._element = this.element();
					(_localctx as ElementListExprContext)._e2.push((_localctx as ElementListExprContext)._element);
					}
					}
					this.state = 961;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 962;
				this.match(CFG_DEVS_MODELParser.ENDSET);
				}
				break;

			case 2:
				_localctx = new ElementSuchThatExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 964;
				this.match(CFG_DEVS_MODELParser.BEGINSET);
				this.state = 965;
				(_localctx as ElementSuchThatExprContext)._e = this.element();
				this.state = 966;
				this.match(CFG_DEVS_MODELParser.SUCHTHAT);
				this.state = 967;
				(_localctx as ElementSuchThatExprContext)._def = this.elementDefinition();
				this.state = 968;
				this.match(CFG_DEVS_MODELParser.ENDSET);
				}
				break;

			case 3:
				_localctx = new EmptySetExprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 970;
				(_localctx as EmptySetExprContext)._es = this.emptySetSymbol();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public element(): ElementContext {
		let _localctx: ElementContext = new ElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 228, CFG_DEVS_MODELParser.RULE_element);
		try {
			this.state = 980;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 61, this._ctx) ) {
			case 1:
				_localctx = new ElementIdentifierContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 973;
				(_localctx as ElementIdentifierContext)._id = this.identifier();
				}
				break;

			case 2:
				_localctx = new ElementNumberContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 974;
				(_localctx as ElementNumberContext)._num = this.numberSymbol();
				}
				break;

			case 3:
				_localctx = new ElementBooleanContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 975;
				(_localctx as ElementBooleanContext)._bool = this.booleanSymbol();
				}
				break;

			case 4:
				_localctx = new ElementModelSignatureContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 976;
				(_localctx as ElementModelSignatureContext)._sig = this.modelSignature();
				}
				break;

			case 5:
				_localctx = new ElementStringContext(_localctx);
				this.enterOuterAlt(_localctx, 5);
				{
				this.state = 977;
				(_localctx as ElementStringContext)._str = this.stringSymbol();
				}
				break;

			case 6:
				_localctx = new ElementTupleContext(_localctx);
				this.enterOuterAlt(_localctx, 6);
				{
				this.state = 978;
				(_localctx as ElementTupleContext)._tup = this.tuple();
				}
				break;

			case 7:
				_localctx = new ElementParameterContext(_localctx);
				this.enterOuterAlt(_localctx, 7);
				{
				this.state = 979;
				(_localctx as ElementParameterContext)._par = this.parameter();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tupleCollection(): TupleCollectionContext {
		let _localctx: TupleCollectionContext = new TupleCollectionContext(this._ctx, this.state);
		this.enterRule(_localctx, 230, CFG_DEVS_MODELParser.RULE_tupleCollection);
		try {
			_localctx = new TupleSuchThatExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 982;
			this.match(CFG_DEVS_MODELParser.BEGINSET);
			this.state = 983;
			(_localctx as TupleSuchThatExprContext)._t = this.tuple();
			this.state = 984;
			this.match(CFG_DEVS_MODELParser.SUCHTHAT);
			this.state = 985;
			(_localctx as TupleSuchThatExprContext)._td = this.tupleDefinition();
			this.state = 986;
			this.match(CFG_DEVS_MODELParser.ENDSET);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tuple(): TupleContext {
		let _localctx: TupleContext = new TupleContext(this._ctx, this.state);
		this.enterRule(_localctx, 232, CFG_DEVS_MODELParser.RULE_tuple);
		let _la: number;
		try {
			this.state = 1000;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new TupleExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 988;
				this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
				this.state = 989;
				(_localctx as TupleExprContext)._e1 = this.element();
				this.state = 994;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === CFG_DEVS_MODELParser.COMMA) {
					{
					{
					this.state = 990;
					this.match(CFG_DEVS_MODELParser.COMMA);
					this.state = 991;
					(_localctx as TupleExprContext)._element = this.element();
					(_localctx as TupleExprContext)._e2.push((_localctx as TupleExprContext)._element);
					}
					}
					this.state = 996;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 997;
				this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
				}
				break;
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
				_localctx = new EmptyTupleExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 999;
				(_localctx as EmptyTupleExprContext)._et = this.emptyTupleSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableTuple(): VariableTupleContext {
		let _localctx: VariableTupleContext = new VariableTupleContext(this._ctx, this.state);
		this.enterRule(_localctx, 234, CFG_DEVS_MODELParser.RULE_variableTuple);
		let _la: number;
		try {
			this.state = 1014;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new VariableTupleExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1002;
				this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
				this.state = 1003;
				(_localctx as VariableTupleExprContext)._v1 = this.variable();
				this.state = 1008;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === CFG_DEVS_MODELParser.COMMA) {
					{
					{
					this.state = 1004;
					this.match(CFG_DEVS_MODELParser.COMMA);
					this.state = 1005;
					(_localctx as VariableTupleExprContext)._variable = this.variable();
					(_localctx as VariableTupleExprContext)._v2.push((_localctx as VariableTupleExprContext)._variable);
					}
					}
					this.state = 1010;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 1011;
				this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
				}
				break;
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
				_localctx = new EmptyVariableTupleExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1013;
				(_localctx as EmptyVariableTupleExprContext)._et = this.emptyTupleSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public variableTupleFixedValues(): VariableTupleFixedValuesContext {
		let _localctx: VariableTupleFixedValuesContext = new VariableTupleFixedValuesContext(this._ctx, this.state);
		this.enterRule(_localctx, 236, CFG_DEVS_MODELParser.RULE_variableTupleFixedValues);
		let _la: number;
		try {
			this.state = 1028;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new VariableTupleFixedValuesExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1016;
				this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
				this.state = 1017;
				(_localctx as VariableTupleFixedValuesExprContext)._vfv1 = this.variableFixedValues();
				this.state = 1022;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la === CFG_DEVS_MODELParser.COMMA) {
					{
					{
					this.state = 1018;
					this.match(CFG_DEVS_MODELParser.COMMA);
					this.state = 1019;
					(_localctx as VariableTupleFixedValuesExprContext)._variableFixedValues = this.variableFixedValues();
					(_localctx as VariableTupleFixedValuesExprContext)._vfv2.push((_localctx as VariableTupleFixedValuesExprContext)._variableFixedValues);
					}
					}
					this.state = 1024;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				this.state = 1025;
				this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
				}
				break;
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
				_localctx = new EmptyVariableTupleFixedValuesExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1027;
				(_localctx as EmptyVariableTupleFixedValuesExprContext)._et = this.emptyTupleSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public tupleDefinition(): TupleDefinitionContext {
		let _localctx: TupleDefinitionContext = new TupleDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 238, CFG_DEVS_MODELParser.RULE_tupleDefinition);
		let _la: number;
		try {
			_localctx = new TupleDefinitionExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1030;
			(_localctx as TupleDefinitionExprContext)._ed1 = this.elementDefinition();
			this.state = 1035;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.ANDOPERATOR || _la === CFG_DEVS_MODELParser.COMMA) {
				{
				{
				this.state = 1031;
				_la = this._input.LA(1);
				if (!(_la === CFG_DEVS_MODELParser.ANDOPERATOR || _la === CFG_DEVS_MODELParser.COMMA)) {
				this._errHandler.recoverInline(this);
				} else {
					if (this._input.LA(1) === Token.EOF) {
						this.matchedEOF = true;
					}

					this._errHandler.reportMatch(this);
					this.consume();
				}
				this.state = 1032;
				(_localctx as TupleDefinitionExprContext)._elementDefinition = this.elementDefinition();
				(_localctx as TupleDefinitionExprContext)._ed2.push((_localctx as TupleDefinitionExprContext)._elementDefinition);
				}
				}
				this.state = 1037;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public elementDefinition(): ElementDefinitionContext {
		let _localctx: ElementDefinitionContext = new ElementDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 240, CFG_DEVS_MODELParser.RULE_elementDefinition);
		try {
			this.state = 1041;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 69, this._ctx) ) {
			case 1:
				_localctx = new ElementDefImplicitSetExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1038;
				(_localctx as ElementDefImplicitSetExprContext)._d1 = this.definitionWithSetImplicitDefinition();
				}
				break;

			case 2:
				_localctx = new ElementDefSetSymbolExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1039;
				(_localctx as ElementDefSetSymbolExprContext)._d2 = this.definitionWithSetSymbol();
				}
				break;

			case 3:
				_localctx = new ElementDefRangeExprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1040;
				(_localctx as ElementDefRangeExprContext)._d3 = this.definitionWithRange();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public definitionWithSetImplicitDefinition(): DefinitionWithSetImplicitDefinitionContext {
		let _localctx: DefinitionWithSetImplicitDefinitionContext = new DefinitionWithSetImplicitDefinitionContext(this._ctx, this.state);
		this.enterRule(_localctx, 242, CFG_DEVS_MODELParser.RULE_definitionWithSetImplicitDefinition);
		try {
			this.state = 1051;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.LOWERCASEID:
			case CFG_DEVS_MODELParser.FULLCASEID:
			case CFG_DEVS_MODELParser.STRINGSYMBOL:
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
			case CFG_DEVS_MODELParser.REALSYMBOL:
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
			case CFG_DEVS_MODELParser.TRUESYMBOL:
			case CFG_DEVS_MODELParser.FALSESYMBOL:
			case CFG_DEVS_MODELParser.HASH:
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new DefWithImplicitSetExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1043;
				(_localctx as DefWithImplicitSetExprContext)._e = this.element();
				this.state = 1044;
				(_localctx as DefWithImplicitSetExprContext)._op = this.belongsToOperator();
				this.state = 1045;
				(_localctx as DefWithImplicitSetExprContext)._s = this.setImplicitDefinition();
				}
				break;
			case CFG_DEVS_MODELParser.EMPTYSETSYMBOL:
			case CFG_DEVS_MODELParser.BEGINSET:
				_localctx = new DefCollectionWithImplicitSetExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1047;
				(_localctx as DefCollectionWithImplicitSetExprContext)._ec = this.elementCollection();
				this.state = 1048;
				(_localctx as DefCollectionWithImplicitSetExprContext)._op = this.belongsToOperator();
				this.state = 1049;
				(_localctx as DefCollectionWithImplicitSetExprContext)._s = this.setImplicitDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public definitionWithSetSymbol(): DefinitionWithSetSymbolContext {
		let _localctx: DefinitionWithSetSymbolContext = new DefinitionWithSetSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 244, CFG_DEVS_MODELParser.RULE_definitionWithSetSymbol);
		try {
			this.state = 1061;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.LOWERCASEID:
			case CFG_DEVS_MODELParser.FULLCASEID:
			case CFG_DEVS_MODELParser.STRINGSYMBOL:
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
			case CFG_DEVS_MODELParser.REALSYMBOL:
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
			case CFG_DEVS_MODELParser.TRUESYMBOL:
			case CFG_DEVS_MODELParser.FALSESYMBOL:
			case CFG_DEVS_MODELParser.HASH:
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new DefWithSymbolSetExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1053;
				(_localctx as DefWithSymbolSetExprContext)._e = this.element();
				this.state = 1054;
				(_localctx as DefWithSymbolSetExprContext)._op = this.belongsToOperator();
				this.state = 1055;
				(_localctx as DefWithSymbolSetExprContext)._s = this.setSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.EMPTYSETSYMBOL:
			case CFG_DEVS_MODELParser.BEGINSET:
				_localctx = new DefCollectionWithSymbolSetExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1057;
				(_localctx as DefCollectionWithSymbolSetExprContext)._ec = this.elementCollection();
				this.state = 1058;
				(_localctx as DefCollectionWithSymbolSetExprContext)._op = this.belongsToOperator();
				this.state = 1059;
				(_localctx as DefCollectionWithSymbolSetExprContext)._s = this.setSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public definitionWithRange(): DefinitionWithRangeContext {
		let _localctx: DefinitionWithRangeContext = new DefinitionWithRangeContext(this._ctx, this.state);
		this.enterRule(_localctx, 246, CFG_DEVS_MODELParser.RULE_definitionWithRange);
		try {
			this.state = 1071;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.LOWERCASEID:
			case CFG_DEVS_MODELParser.FULLCASEID:
			case CFG_DEVS_MODELParser.STRINGSYMBOL:
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
			case CFG_DEVS_MODELParser.REALSYMBOL:
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
			case CFG_DEVS_MODELParser.TRUESYMBOL:
			case CFG_DEVS_MODELParser.FALSESYMBOL:
			case CFG_DEVS_MODELParser.HASH:
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new DefWithRangeExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1063;
				(_localctx as DefWithRangeExprContext)._e = this.element();
				this.state = 1064;
				(_localctx as DefWithRangeExprContext)._op = this.belongsToOperator();
				this.state = 1065;
				(_localctx as DefWithRangeExprContext)._r = this.range();
				}
				break;
			case CFG_DEVS_MODELParser.EMPTYSETSYMBOL:
			case CFG_DEVS_MODELParser.BEGINSET:
				_localctx = new DefCollectionWithRangeExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1067;
				(_localctx as DefCollectionWithRangeExprContext)._ec = this.elementCollection();
				this.state = 1068;
				(_localctx as DefCollectionWithRangeExprContext)._op = this.belongsToOperator();
				this.state = 1069;
				(_localctx as DefCollectionWithRangeExprContext)._r = this.range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public range(): RangeContext {
		let _localctx: RangeContext = new RangeContext(this._ctx, this.state);
		this.enterRule(_localctx, 248, CFG_DEVS_MODELParser.RULE_range);
		let _la: number;
		try {
			_localctx = new RangeExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1073;
			_la = this._input.LA(1);
			if (!(_la === CFG_DEVS_MODELParser.BEGINBRACKET || _la === CFG_DEVS_MODELParser.BEGINPARENTHESES)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			this.state = 1074;
			(_localctx as RangeExprContext)._n1 = this.numberSymbol();
			this.state = 1075;
			this.match(CFG_DEVS_MODELParser.COMMA);
			this.state = 1078;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
			case CFG_DEVS_MODELParser.REALSYMBOL:
				{
				this.state = 1076;
				(_localctx as RangeExprContext)._n2n = this.numberSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.INFINITYSYMBOL:
				{
				this.state = 1077;
				(_localctx as RangeExprContext)._n2i = this.infinitySymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 1080;
			_la = this._input.LA(1);
			if (!(_la === CFG_DEVS_MODELParser.ENDBRACKET || _la === CFG_DEVS_MODELParser.ENDPARENTHESES)) {
			this._errHandler.recoverInline(this);
			} else {
				if (this._input.LA(1) === Token.EOF) {
					this.matchedEOF = true;
				}

				this._errHandler.reportMatch(this);
				this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public booleanSymbol(): BooleanSymbolContext {
		let _localctx: BooleanSymbolContext = new BooleanSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 250, CFG_DEVS_MODELParser.RULE_booleanSymbol);
		try {
			this.state = 1084;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.TRUESYMBOL:
				_localctx = new TrueExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1082;
				(_localctx as TrueExprContext)._t = this.trueSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.FALSESYMBOL:
				_localctx = new FalseExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1083;
				(_localctx as FalseExprContext)._f = this.falseSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public numberSymbol(): NumberSymbolContext {
		let _localctx: NumberSymbolContext = new NumberSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 252, CFG_DEVS_MODELParser.RULE_numberSymbol);
		try {
			this.state = 1088;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
				_localctx = new IntegerExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1086;
				(_localctx as IntegerExprContext)._i = this.integerSymbol();
				}
				break;
			case CFG_DEVS_MODELParser.REALSYMBOL:
				_localctx = new RealExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1087;
				(_localctx as RealExprContext)._r = this.realSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public emptySetSymbol(): EmptySetSymbolContext {
		let _localctx: EmptySetSymbolContext = new EmptySetSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 254, CFG_DEVS_MODELParser.RULE_emptySetSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1090;
			this.match(CFG_DEVS_MODELParser.EMPTYSETSYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public emptyTupleSymbol(): EmptyTupleSymbolContext {
		let _localctx: EmptyTupleSymbolContext = new EmptyTupleSymbolContext(this._ctx, this.state);
		this.enterRule(_localctx, 256, CFG_DEVS_MODELParser.RULE_emptyTupleSymbol);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1092;
			this.match(CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOperationResult(): SetOperationResultContext {
		let _localctx: SetOperationResultContext = new SetOperationResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 258, CFG_DEVS_MODELParser.RULE_setOperationResult);
		let _la: number;
		try {
			_localctx = new SetOperationExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1094;
			(_localctx as SetOperationExprContext)._left = this.setOperationTerm();
			this.state = 1100;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (((((_la - 29)) & ~0x1F) === 0 && ((1 << (_la - 29)) & ((1 << (CFG_DEVS_MODELParser.CARTESIANPRODUCTOPERATOR - 29)) | (1 << (CFG_DEVS_MODELParser.UNIONOPERATOR - 29)) | (1 << (CFG_DEVS_MODELParser.INTERSECTIONOPERATOR - 29)) | (1 << (CFG_DEVS_MODELParser.SETDIFFERENCEOPERATOR - 29)))) !== 0)) {
				{
				{
				this.state = 1095;
				(_localctx as SetOperationExprContext)._setOperator = this.setOperator();
				(_localctx as SetOperationExprContext)._op.push((_localctx as SetOperationExprContext)._setOperator);
				this.state = 1096;
				(_localctx as SetOperationExprContext)._setOperationTerm = this.setOperationTerm();
				(_localctx as SetOperationExprContext)._right.push((_localctx as SetOperationExprContext)._setOperationTerm);
				}
				}
				this.state = 1102;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOperationTerm(): SetOperationTermContext {
		let _localctx: SetOperationTermContext = new SetOperationTermContext(this._ctx, this.state);
		this.enterRule(_localctx, 260, CFG_DEVS_MODELParser.RULE_setOperationTerm);
		try {
			this.state = 1105;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.EMPTYSETSYMBOL:
			case CFG_DEVS_MODELParser.SETZSYMBOL:
			case CFG_DEVS_MODELParser.SETNSYMBOL:
			case CFG_DEVS_MODELParser.SETRSYMBOL:
			case CFG_DEVS_MODELParser.SETBSYMBOL:
			case CFG_DEVS_MODELParser.BEGINSET:
				_localctx = new OperationSetExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1103;
				(_localctx as OperationSetExprContext)._s1 = this.operationSet();
				}
				break;
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				_localctx = new SetOperationParExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1104;
				(_localctx as SetOperationParExprContext)._par = this.setOperationExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOperationExpression(): SetOperationExpressionContext {
		let _localctx: SetOperationExpressionContext = new SetOperationExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 262, CFG_DEVS_MODELParser.RULE_setOperationExpression);
		try {
			_localctx = new SetOperationParenthesisExprContext(_localctx);
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1107;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 1108;
			(_localctx as SetOperationParenthesisExprContext)._expr = this.setOperationResult();
			this.state = 1109;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public operationSet(): OperationSetContext {
		let _localctx: OperationSetContext = new OperationSetContext(this._ctx, this.state);
		this.enterRule(_localctx, 264, CFG_DEVS_MODELParser.RULE_operationSet);
		try {
			this.state = 1113;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.EMPTYSETSYMBOL:
			case CFG_DEVS_MODELParser.BEGINSET:
				_localctx = new OperationSetDefinitionExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1111;
				(_localctx as OperationSetDefinitionExprContext)._sd = this.setDefinition();
				}
				break;
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.SETZSYMBOL:
			case CFG_DEVS_MODELParser.SETNSYMBOL:
			case CFG_DEVS_MODELParser.SETRSYMBOL:
			case CFG_DEVS_MODELParser.SETBSYMBOL:
				_localctx = new OperationSetSymbolExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1112;
				(_localctx as OperationSetSymbolExprContext)._ss = this.setSymbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public belongsToOperator(): BelongsToOperatorContext {
		let _localctx: BelongsToOperatorContext = new BelongsToOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 266, CFG_DEVS_MODELParser.RULE_belongsToOperator);
		try {
			this.state = 1117;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.INOPERATOR:
				_localctx = new InOperatorExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1115;
				this.inOperator();
				}
				break;
			case CFG_DEVS_MODELParser.NOTINOPERATOR:
				_localctx = new NotInOperatorExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1116;
				this.notInOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public inOperator(): InOperatorContext {
		let _localctx: InOperatorContext = new InOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 268, CFG_DEVS_MODELParser.RULE_inOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1119;
			this.match(CFG_DEVS_MODELParser.INOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public notInOperator(): NotInOperatorContext {
		let _localctx: NotInOperatorContext = new NotInOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 270, CFG_DEVS_MODELParser.RULE_notInOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1121;
			this.match(CFG_DEVS_MODELParser.NOTINOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setOperator(): SetOperatorContext {
		let _localctx: SetOperatorContext = new SetOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 272, CFG_DEVS_MODELParser.RULE_setOperator);
		try {
			this.state = 1127;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.CARTESIANPRODUCTOPERATOR:
				_localctx = new CartesianProductOpExprContext(_localctx);
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1123;
				this.cartesianProductOperator();
				}
				break;
			case CFG_DEVS_MODELParser.UNIONOPERATOR:
				_localctx = new UnionOpExprContext(_localctx);
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1124;
				this.unionOperator();
				}
				break;
			case CFG_DEVS_MODELParser.INTERSECTIONOPERATOR:
				_localctx = new IntersectionOpExprContext(_localctx);
				this.enterOuterAlt(_localctx, 3);
				{
				this.state = 1125;
				this.intersectionOperator();
				}
				break;
			case CFG_DEVS_MODELParser.SETDIFFERENCEOPERATOR:
				_localctx = new DifferenceOpExprContext(_localctx);
				this.enterOuterAlt(_localctx, 4);
				{
				this.state = 1126;
				this.setdifferenceOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public cartesianProductOperator(): CartesianProductOperatorContext {
		let _localctx: CartesianProductOperatorContext = new CartesianProductOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 274, CFG_DEVS_MODELParser.RULE_cartesianProductOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1129;
			this.match(CFG_DEVS_MODELParser.CARTESIANPRODUCTOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unionOperator(): UnionOperatorContext {
		let _localctx: UnionOperatorContext = new UnionOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 276, CFG_DEVS_MODELParser.RULE_unionOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1131;
			this.match(CFG_DEVS_MODELParser.UNIONOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public intersectionOperator(): IntersectionOperatorContext {
		let _localctx: IntersectionOperatorContext = new IntersectionOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 278, CFG_DEVS_MODELParser.RULE_intersectionOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1133;
			this.match(CFG_DEVS_MODELParser.INTERSECTIONOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public setdifferenceOperator(): SetdifferenceOperatorContext {
		let _localctx: SetdifferenceOperatorContext = new SetdifferenceOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 280, CFG_DEVS_MODELParser.RULE_setdifferenceOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1135;
			this.match(CFG_DEVS_MODELParser.SETDIFFERENCEOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mathExpression(): MathExpressionContext {
		let _localctx: MathExpressionContext = new MathExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 282, CFG_DEVS_MODELParser.RULE_mathExpression);
		try {
			this.state = 1139;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 81, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1137;
				this.binaryMathExpression();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1138;
				this.mathExpressionTerm();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public binaryMathExpression(): BinaryMathExpressionContext {
		let _localctx: BinaryMathExpressionContext = new BinaryMathExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 284, CFG_DEVS_MODELParser.RULE_binaryMathExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1141;
			_localctx._left = this.mathExpressionTerm();
			this.state = 1142;
			_localctx._op = this.binaryMathOperatorLowerPrecedence();
			this.state = 1143;
			_localctx._right = this.mathExpressionTerm();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mathExpressionTerm(): MathExpressionTermContext {
		let _localctx: MathExpressionTermContext = new MathExpressionTermContext(this._ctx, this.state);
		this.enterRule(_localctx, 286, CFG_DEVS_MODELParser.RULE_mathExpressionTerm);
		try {
			this.state = 1147;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.UPPERCASEID:
			case CFG_DEVS_MODELParser.LOWERCASEID:
			case CFG_DEVS_MODELParser.FULLCASEID:
			case CFG_DEVS_MODELParser.STRINGSYMBOL:
			case CFG_DEVS_MODELParser.INTEGERSYMBOL:
			case CFG_DEVS_MODELParser.REALSYMBOL:
			case CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL:
			case CFG_DEVS_MODELParser.TRUESYMBOL:
			case CFG_DEVS_MODELParser.FALSESYMBOL:
			case CFG_DEVS_MODELParser.HASH:
			case CFG_DEVS_MODELParser.BEGINPARENTHESES:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1145;
				this.mathTerm();
				}
				break;
			case CFG_DEVS_MODELParser.SQRTOPERATOR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1146;
				this.unaryMathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unaryMathExpression(): UnaryMathExpressionContext {
		let _localctx: UnaryMathExpressionContext = new UnaryMathExpressionContext(this._ctx, this.state);
		this.enterRule(_localctx, 288, CFG_DEVS_MODELParser.RULE_unaryMathExpression);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1149;
			_localctx._op = this.unaryMathOperator();
			this.state = 1150;
			_localctx._operand = this.mathExpressionTerm();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mathTerm(): MathTermContext {
		let _localctx: MathTermContext = new MathTermContext(this._ctx, this.state);
		this.enterRule(_localctx, 290, CFG_DEVS_MODELParser.RULE_mathTerm);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1152;
			_localctx._left = this.mathFactor();
			this.state = 1158;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.MULTIPLICATIONOPERATOR || _la === CFG_DEVS_MODELParser.DIVISIONOPERATOR) {
				{
				{
				this.state = 1153;
				_localctx._op = this.binaryMathOperatorHigherPrecedence();
				this.state = 1154;
				_localctx._right = this.mathFactor();
				}
				}
				this.state = 1160;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mathFactor(): MathFactorContext {
		let _localctx: MathFactorContext = new MathFactorContext(this._ctx, this.state);
		this.enterRule(_localctx, 292, CFG_DEVS_MODELParser.RULE_mathFactor);
		let _la: number;
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1161;
			_localctx._left = this.mathExpressionBasicTerm();
			this.state = 1167;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			while (_la === CFG_DEVS_MODELParser.POWEROPERATOR) {
				{
				{
				this.state = 1162;
				_localctx._op = this.powerOperator();
				this.state = 1163;
				_localctx._right = this.mathExpressionBasicTerm();
				}
				}
				this.state = 1169;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mathExpressionBasicTerm(): MathExpressionBasicTermContext {
		let _localctx: MathExpressionBasicTermContext = new MathExpressionBasicTermContext(this._ctx, this.state);
		this.enterRule(_localctx, 294, CFG_DEVS_MODELParser.RULE_mathExpressionBasicTerm);
		try {
			this.state = 1172;
			this._errHandler.sync(this);
			switch ( this.interpreter.adaptivePredict(this._input, 85, this._ctx) ) {
			case 1:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1170;
				this.mathExpressionElement();
				}
				break;

			case 2:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1171;
				this.mathExpressionResult();
				}
				break;
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mathExpressionElement(): MathExpressionElementContext {
		let _localctx: MathExpressionElementContext = new MathExpressionElementContext(this._ctx, this.state);
		this.enterRule(_localctx, 296, CFG_DEVS_MODELParser.RULE_mathExpressionElement);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1174;
			_localctx._el = this.element();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public mathExpressionResult(): MathExpressionResultContext {
		let _localctx: MathExpressionResultContext = new MathExpressionResultContext(this._ctx, this.state);
		this.enterRule(_localctx, 298, CFG_DEVS_MODELParser.RULE_mathExpressionResult);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1176;
			this.match(CFG_DEVS_MODELParser.BEGINPARENTHESES);
			this.state = 1177;
			_localctx._inner = this.mathExpression();
			this.state = 1178;
			this.match(CFG_DEVS_MODELParser.ENDPARENTHESES);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public unaryMathOperator(): UnaryMathOperatorContext {
		let _localctx: UnaryMathOperatorContext = new UnaryMathOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 300, CFG_DEVS_MODELParser.RULE_unaryMathOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1180;
			this.sqrtOperator();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public binaryMathOperatorLowerPrecedence(): BinaryMathOperatorLowerPrecedenceContext {
		let _localctx: BinaryMathOperatorLowerPrecedenceContext = new BinaryMathOperatorLowerPrecedenceContext(this._ctx, this.state);
		this.enterRule(_localctx, 302, CFG_DEVS_MODELParser.RULE_binaryMathOperatorLowerPrecedence);
		try {
			this.state = 1184;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.ADDITIONOPERATOR:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1182;
				this.additionOperator();
				}
				break;
			case CFG_DEVS_MODELParser.SUBSTRACTIONOPERATOR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1183;
				this.substractionOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public binaryMathOperatorHigherPrecedence(): BinaryMathOperatorHigherPrecedenceContext {
		let _localctx: BinaryMathOperatorHigherPrecedenceContext = new BinaryMathOperatorHigherPrecedenceContext(this._ctx, this.state);
		this.enterRule(_localctx, 304, CFG_DEVS_MODELParser.RULE_binaryMathOperatorHigherPrecedence);
		try {
			this.state = 1188;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case CFG_DEVS_MODELParser.MULTIPLICATIONOPERATOR:
				this.enterOuterAlt(_localctx, 1);
				{
				this.state = 1186;
				this.multiplicationOperator();
				}
				break;
			case CFG_DEVS_MODELParser.DIVISIONOPERATOR:
				this.enterOuterAlt(_localctx, 2);
				{
				this.state = 1187;
				this.divisionOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public sqrtOperator(): SqrtOperatorContext {
		let _localctx: SqrtOperatorContext = new SqrtOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 306, CFG_DEVS_MODELParser.RULE_sqrtOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1190;
			this.match(CFG_DEVS_MODELParser.SQRTOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public additionOperator(): AdditionOperatorContext {
		let _localctx: AdditionOperatorContext = new AdditionOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 308, CFG_DEVS_MODELParser.RULE_additionOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1192;
			this.match(CFG_DEVS_MODELParser.ADDITIONOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public substractionOperator(): SubstractionOperatorContext {
		let _localctx: SubstractionOperatorContext = new SubstractionOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 310, CFG_DEVS_MODELParser.RULE_substractionOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1194;
			this.match(CFG_DEVS_MODELParser.SUBSTRACTIONOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public multiplicationOperator(): MultiplicationOperatorContext {
		let _localctx: MultiplicationOperatorContext = new MultiplicationOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 312, CFG_DEVS_MODELParser.RULE_multiplicationOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1196;
			this.match(CFG_DEVS_MODELParser.MULTIPLICATIONOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public divisionOperator(): DivisionOperatorContext {
		let _localctx: DivisionOperatorContext = new DivisionOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 314, CFG_DEVS_MODELParser.RULE_divisionOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1198;
			this.match(CFG_DEVS_MODELParser.DIVISIONOPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}
	// @RuleVersion(0)
	public powerOperator(): PowerOperatorContext {
		let _localctx: PowerOperatorContext = new PowerOperatorContext(this._ctx, this.state);
		this.enterRule(_localctx, 316, CFG_DEVS_MODELParser.RULE_powerOperator);
		try {
			this.enterOuterAlt(_localctx, 1);
			{
			this.state = 1200;
			this.match(CFG_DEVS_MODELParser.POWEROPERATOR);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				_localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return _localctx;
	}

	private static readonly _serializedATNSegments: number = 3;
	private static readonly _serializedATNSegment0: string =
		"\x03\uC91D\uCABA\u058D\uAFBA\u4F53\u0607\uEA8B\uC241\x03@\u04B5\x04\x02" +
		"\t\x02\x04\x03\t\x03\x04\x04\t\x04\x04\x05\t\x05\x04\x06\t\x06\x04\x07" +
		"\t\x07\x04\b\t\b\x04\t\t\t\x04\n\t\n\x04\v\t\v\x04\f\t\f\x04\r\t\r\x04" +
		"\x0E\t\x0E\x04\x0F\t\x0F\x04\x10\t\x10\x04\x11\t\x11\x04\x12\t\x12\x04" +
		"\x13\t\x13\x04\x14\t\x14\x04\x15\t\x15\x04\x16\t\x16\x04\x17\t\x17\x04" +
		"\x18\t\x18\x04\x19\t\x19\x04\x1A\t\x1A\x04\x1B\t\x1B\x04\x1C\t\x1C\x04" +
		"\x1D\t\x1D\x04\x1E\t\x1E\x04\x1F\t\x1F\x04 \t \x04!\t!\x04\"\t\"\x04#" +
		"\t#\x04$\t$\x04%\t%\x04&\t&\x04\'\t\'\x04(\t(\x04)\t)\x04*\t*\x04+\t+" +
		"\x04,\t,\x04-\t-\x04.\t.\x04/\t/\x040\t0\x041\t1\x042\t2\x043\t3\x044" +
		"\t4\x045\t5\x046\t6\x047\t7\x048\t8\x049\t9\x04:\t:\x04;\t;\x04<\t<\x04" +
		"=\t=\x04>\t>\x04?\t?\x04@\t@\x04A\tA\x04B\tB\x04C\tC\x04D\tD\x04E\tE\x04" +
		"F\tF\x04G\tG\x04H\tH\x04I\tI\x04J\tJ\x04K\tK\x04L\tL\x04M\tM\x04N\tN\x04" +
		"O\tO\x04P\tP\x04Q\tQ\x04R\tR\x04S\tS\x04T\tT\x04U\tU\x04V\tV\x04W\tW\x04" +
		"X\tX\x04Y\tY\x04Z\tZ\x04[\t[\x04\\\t\\\x04]\t]\x04^\t^\x04_\t_\x04`\t" +
		"`\x04a\ta\x04b\tb\x04c\tc\x04d\td\x04e\te\x04f\tf\x04g\tg\x04h\th\x04" +
		"i\ti\x04j\tj\x04k\tk\x04l\tl\x04m\tm\x04n\tn\x04o\to\x04p\tp\x04q\tq\x04" +
		"r\tr\x04s\ts\x04t\tt\x04u\tu\x04v\tv\x04w\tw\x04x\tx\x04y\ty\x04z\tz\x04" +
		"{\t{\x04|\t|\x04}\t}\x04~\t~\x04\x7F\t\x7F\x04\x80\t\x80\x04\x81\t\x81" +
		"\x04\x82\t\x82\x04\x83\t\x83\x04\x84\t\x84\x04\x85\t\x85\x04\x86\t\x86" +
		"\x04\x87\t\x87\x04\x88\t\x88\x04\x89\t\x89\x04\x8A\t\x8A\x04\x8B\t\x8B" +
		"\x04\x8C\t\x8C\x04\x8D\t\x8D\x04\x8E\t\x8E\x04\x8F\t\x8F\x04\x90\t\x90" +
		"\x04\x91\t\x91\x04\x92\t\x92\x04\x93\t\x93\x04\x94\t\x94\x04\x95\t\x95" +
		"\x04\x96\t\x96\x04\x97\t\x97\x04\x98\t\x98\x04\x99\t\x99\x04\x9A\t\x9A" +
		"\x04\x9B\t\x9B\x04\x9C\t\x9C\x04\x9D\t\x9D\x04\x9E\t\x9E\x04\x9F\t\x9F" +
		"\x04\xA0\t\xA0\x03\x02\x06\x02\u0142\n\x02\r\x02\x0E\x02\u0143\x03\x02" +
		"\x03\x02\x03\x03\x03\x03\x05\x03\u014A\n\x03\x03\x04\x03\x04\x05\x04\u014E" +
		"\n\x04\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x05\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06" +
		"\x03\x06\x03\x06\x03\x06\x03\x06\x03\x06\x03\x07\x03\x07\x03\x07\x03\x07" +
		"\x03\x07\x03\x07\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b" +
		"\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\b\x03\t\x03\t\x03" +
		"\t\x07\t\u0181\n\t\f\t\x0E\t\u0184\v\t\x03\n\x03\n\x05\n\u0188\n\n\x03" +
		"\v\x03\v\x03\v\x03\v\x03\v\x05\v\u018F\n\v\x03\f\x03\f\x03\f\x03\f\x03" +
		"\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\r\x03\x0E\x03\x0E\x03" +
		"\x0E\x03\x0E\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x0F\x03\x10\x03\x10\x03" +
		"\x10\x03\x10\x03\x11\x03\x11\x03\x11\x03\x11\x03\x11\x03\x12\x03\x12\x03" +
		"\x12\x03\x12\x03\x13\x03\x13\x03\x13\x03\x13\x03\x13\x03\x14\x03\x14\x03" +
		"\x14\x03\x14\x03\x15\x03\x15\x03\x15\x03\x15\x03\x15\x03\x16\x03\x16\x03" +
		"\x16\x03\x16\x03\x16\x05\x16\u01C7\n\x16\x03\x17\x03\x17\x03\x17\x07\x17" +
		"\u01CC\n\x17\f\x17\x0E\x17\u01CF\v\x17\x03\x18\x03\x18\x03\x18\x03\x18" +
		"\x03\x18\x03\x18\x05\x18\u01D7\n\x18\x03\x19\x03\x19\x03\x19\x07\x19\u01DC" +
		"\n\x19\f\x19\x0E\x19\u01DF\v\x19\x03\x1A\x03\x1A\x03\x1A\x03\x1B\x03\x1B" +
		"\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x03\x1B\x05\x1B\u01EC\n\x1B\x03" +
		"\x1C\x03\x1C\x03\x1C\x07\x1C\u01F1\n\x1C\f\x1C\x0E\x1C\u01F4\v\x1C\x03" +
		"\x1D\x03\x1D\x03\x1D\x07\x1D\u01F9\n\x1D\f\x1D\x0E\x1D\u01FC\v\x1D\x03" +
		"\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x03\x1E\x05\x1E\u0204\n\x1E\x03\x1F" +
		"\x03\x1F\x03\x1F\x03 \x03 \x03 \x03 \x03 \x03 \x03 \x03 \x05 \u0211\n" +
		" \x03!\x03!\x03!\x07!\u0216\n!\f!\x0E!\u0219\v!\x03\"\x03\"\x03\"\x07" +
		"\"\u021E\n\"\f\"\x0E\"\u0221\v\"\x03#\x03#\x03#\x03#\x03#\x03#\x05#\u0229" +
		"\n#\x03$\x03$\x03$\x03%\x03%\x03%\x03%\x07%\u0232\n%\f%\x0E%\u0235\v%" +
		"\x03%\x03%\x03&\x03&\x03&\x03&\x05&\u023D\n&\x03\'\x03\'\x03\'\x03\'\x05" +
		"\'\u0243\n\'\x03(\x03(\x03(\x07(\u0248\n(\f(\x0E(\u024B\v(\x03)\x03)\x03" +
		")\x03)\x03)\x03)\x05)\u0253\n)\x03*\x03*\x03*\x07*\u0258\n*\f*\x0E*\u025B" +
		"\v*\x03+\x03+\x03+\x03,\x03,\x03,\x03,\x03,\x03,\x03,\x03,\x05,\u0268" +
		"\n,\x03-\x03-\x03-\x07-\u026D\n-\f-\x0E-\u0270\v-\x03.\x03.\x03.\x03." +
		"\x03.\x03.\x05.\u0278\n.\x03/\x03/\x03/\x07/\u027D\n/\f/\x0E/\u0280\v" +
		"/\x030\x030\x030\x031\x031\x031\x031\x051\u0289\n1\x032\x032\x032\x07" +
		"2\u028E\n2\f2\x0E2\u0291\v2\x033\x033\x033\x033\x033\x033\x053\u0299\n" +
		"3\x034\x034\x034\x074\u029E\n4\f4\x0E4\u02A1\v4\x035\x035\x035\x036\x03" +
		"6\x036\x036\x036\x036\x036\x036\x056\u02AE\n6\x037\x037\x037\x077\u02B3" +
		"\n7\f7\x0E7\u02B6\v7\x038\x038\x038\x038\x038\x038\x038\x038\x038\x03" +
		"8\x038\x038\x058\u02C4\n8\x039\x039\x039\x079\u02C9\n9\f9\x0E9\u02CC\v" +
		"9\x03:\x03:\x03:\x03:\x03:\x03:\x05:\u02D4\n:\x03;\x03;\x03;\x03;\x03" +
		"<\x03<\x03<\x03<\x03=\x03=\x03=\x03=\x03>\x03>\x03>\x03>\x03?\x03?\x03" +
		"?\x05?\u02E9\n?\x03@\x03@\x03@\x07@\u02EE\n@\f@\x0E@\u02F1\v@\x03A\x03" +
		"A\x03A\x03A\x03A\x03A\x05A\u02F9\nA\x03B\x03B\x03C\x03C\x03C\x03D\x03" +
		"D\x03E\x03E\x03E\x03F\x03F\x03F\x05F\u0308\nF\x03G\x03G\x03G\x07G\u030D" +
		"\nG\fG\x0EG\u0310\vG\x03H\x03H\x03H\x03H\x03H\x03H\x05H\u0318\nH\x03I" +
		"\x03I\x03J\x03J\x03K\x03K\x03L\x03L\x03M\x03M\x03N\x03N\x03O\x03O\x03" +
		"O\x03O\x03O\x03O\x03O\x03O\x03O\x05O\u032F\nO\x03P\x03P\x03P\x03P\x03" +
		"P\x03P\x03P\x03P\x03P\x05P\u033A\nP\x03Q\x03Q\x03Q\x03Q\x03Q\x03Q\x03" +
		"Q\x03Q\x03Q\x03Q\x05Q\u0346\nQ\x03R\x03R\x05R\u034A\nR\x03S\x03S\x03S" +
		"\x03S\x07S\u0350\nS\fS\x0ES\u0353\vS\x03T\x03T\x05T\u0357\nT\x03U\x03" +
		"U\x03U\x03V\x03V\x03V\x03V\x07V\u0360\nV\fV\x0EV\u0363\vV\x03W\x03W\x05" +
		"W\u0367\nW\x03X\x03X\x03X\x05X\u036C\nX\x03Y\x03Y\x03Y\x03Y\x03Z\x03Z" +
		"\x03Z\x05Z\u0375\nZ\x03[\x03[\x03\\\x03\\\x03]\x03]\x03^\x03^\x05^\u037F" +
		"\n^\x03_\x03_\x03_\x03_\x03_\x03_\x05_\u0387\n_\x03`\x03`\x03a\x03a\x03" +
		"b\x03b\x03c\x03c\x03d\x03d\x03e\x03e\x03f\x03f\x03g\x03g\x03h\x03h\x03" +
		"i\x03i\x05i\u039D\ni\x03j\x03j\x05j\u03A1\nj\x03k\x03k\x03k\x03k\x03l" +
		"\x03l\x05l\u03A9\nl\x03m\x03m\x03m\x03m\x03m\x05m\u03B0\nm\x03n\x03n\x03" +
		"o\x03o\x03p\x03p\x03q\x03q\x03r\x03r\x03s\x03s\x03s\x03s\x07s\u03C0\n" +
		"s\fs\x0Es\u03C3\vs\x03s\x03s\x03s\x03s\x03s\x03s\x03s\x03s\x03s\x05s\u03CE" +
		"\ns\x03t\x03t\x03t\x03t\x03t\x03t\x03t\x05t\u03D7\nt\x03u\x03u\x03u\x03" +
		"u\x03u\x03u\x03v\x03v\x03v\x03v\x07v\u03E3\nv\fv\x0Ev\u03E6\vv\x03v\x03" +
		"v\x03v\x05v\u03EB\nv\x03w\x03w\x03w\x03w\x07w\u03F1\nw\fw\x0Ew\u03F4\v" +
		"w\x03w\x03w\x03w\x05w\u03F9\nw\x03x\x03x\x03x\x03x\x07x\u03FF\nx\fx\x0E" +
		"x\u0402\vx\x03x\x03x\x03x\x05x\u0407\nx\x03y\x03y\x03y\x07y\u040C\ny\f" +
		"y\x0Ey\u040F\vy\x03z\x03z\x03z\x05z\u0414\nz\x03{\x03{\x03{\x03{\x03{" +
		"\x03{\x03{\x03{\x05{\u041E\n{\x03|\x03|\x03|\x03|\x03|\x03|\x03|\x03|" +
		"\x05|\u0428\n|\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x03}\x05}\u0432\n}\x03" +
		"~\x03~\x03~\x03~\x03~\x05~\u0439\n~\x03~\x03~\x03\x7F\x03\x7F\x05\x7F" +
		"\u043F\n\x7F\x03\x80\x03\x80\x05\x80\u0443\n\x80\x03\x81\x03\x81\x03\x82" +
		"\x03\x82\x03\x83\x03\x83\x03\x83\x03\x83\x07\x83\u044D\n\x83\f\x83\x0E" +
		"\x83\u0450\v\x83\x03\x84\x03\x84\x05\x84\u0454\n\x84\x03\x85\x03\x85\x03" +
		"\x85\x03\x85\x03\x86\x03\x86\x05\x86\u045C\n\x86\x03\x87\x03\x87\x05\x87" +
		"\u0460\n\x87\x03\x88\x03\x88\x03\x89\x03\x89\x03\x8A\x03\x8A\x03\x8A\x03" +
		"\x8A\x05\x8A\u046A\n\x8A\x03\x8B\x03\x8B\x03\x8C\x03\x8C\x03\x8D\x03\x8D" +
		"\x03\x8E\x03\x8E\x03\x8F\x03\x8F\x05\x8F\u0476\n\x8F\x03\x90\x03\x90\x03" +
		"\x90\x03\x90\x03\x91\x03\x91\x05\x91\u047E\n\x91\x03\x92\x03\x92\x03\x92" +
		"\x03\x93\x03\x93\x03\x93\x03\x93\x07\x93\u0487\n\x93\f\x93\x0E\x93\u048A" +
		"\v\x93\x03\x94\x03\x94\x03\x94\x03\x94\x07\x94\u0490\n\x94\f\x94\x0E\x94" +
		"\u0493\v\x94\x03\x95\x03\x95\x05\x95\u0497\n\x95\x03\x96\x03\x96\x03\x97" +
		"\x03\x97\x03\x97\x03\x97\x03\x98\x03\x98\x03\x99\x03\x99\x05\x99\u04A3" +
		"\n\x99\x03\x9A\x03\x9A\x05\x9A\u04A7\n\x9A\x03\x9B\x03\x9B\x03\x9C\x03" +
		"\x9C\x03\x9D\x03\x9D\x03\x9E\x03\x9E\x03\x9F\x03\x9F\x03\xA0\x03\xA0\x03" +
		"\xA0\x02\x02\x02\xA1\x02\x02\x04\x02\x06\x02\b\x02\n\x02\f\x02\x0E\x02" +
		"\x10\x02\x12\x02\x14\x02\x16\x02\x18\x02\x1A\x02\x1C\x02\x1E\x02 \x02" +
		"\"\x02$\x02&\x02(\x02*\x02,\x02.\x020\x022\x024\x026\x028\x02:\x02<\x02" +
		">\x02@\x02B\x02D\x02F\x02H\x02J\x02L\x02N\x02P\x02R\x02T\x02V\x02X\x02" +
		"Z\x02\\\x02^\x02`\x02b\x02d\x02f\x02h\x02j\x02l\x02n\x02p\x02r\x02t\x02" +
		"v\x02x\x02z\x02|\x02~\x02\x80\x02\x82\x02\x84\x02\x86\x02\x88\x02\x8A" +
		"\x02\x8C\x02\x8E\x02\x90\x02\x92\x02\x94\x02\x96\x02\x98\x02\x9A\x02\x9C" +
		"\x02\x9E\x02\xA0\x02\xA2\x02\xA4\x02\xA6\x02\xA8\x02\xAA\x02\xAC\x02\xAE" +
		"\x02\xB0\x02\xB2\x02\xB4\x02\xB6\x02\xB8\x02\xBA\x02\xBC\x02\xBE\x02\xC0" +
		"\x02\xC2\x02\xC4\x02\xC6\x02\xC8\x02\xCA\x02\xCC\x02\xCE\x02\xD0\x02\xD2" +
		"\x02\xD4\x02\xD6\x02\xD8\x02\xDA\x02\xDC\x02\xDE\x02\xE0\x02\xE2\x02\xE4" +
		"\x02\xE6\x02\xE8\x02\xEA\x02\xEC\x02\xEE\x02\xF0\x02\xF2\x02\xF4\x02\xF6" +
		"\x02\xF8\x02\xFA\x02\xFC\x02\xFE\x02\u0100\x02\u0102\x02\u0104\x02\u0106" +
		"\x02\u0108\x02\u010A\x02\u010C\x02\u010E\x02\u0110\x02\u0112\x02\u0114" +
		"\x02\u0116\x02\u0118\x02\u011A\x02\u011C\x02\u011E\x02\u0120\x02\u0122" +
		"\x02\u0124\x02\u0126\x02\u0128\x02\u012A\x02\u012C\x02\u012E\x02\u0130" +
		"\x02\u0132\x02\u0134\x02\u0136\x02\u0138\x02\u013A\x02\u013C\x02\u013E" +
		"\x02\x02\x07\x04\x02$$44\x03\x02\x03\x05\x03\x02\x19\x1A\x04\x025599\x04" +
		"\x0266::\x02\u0495\x02\u0141\x03\x02\x02\x02\x04\u0149\x03\x02\x02\x02" +
		"\x06\u014D\x03\x02\x02\x02\b\u014F\x03\x02\x02\x02\n\u0155\x03\x02\x02" +
		"\x02\f\u0165\x03\x02\x02\x02\x0E\u016B\x03\x02\x02\x02\x10\u017D\x03\x02" +
		"\x02\x02\x12\u0187\x03\x02\x02\x02\x14\u018E\x03\x02\x02\x02\x16\u0190" +
		"\x03\x02\x02\x02\x18\u0194\x03\x02\x02\x02\x1A\u019D\x03\x02\x02\x02\x1C" +
		"\u01A1\x03\x02\x02\x02\x1E\u01A6\x03\x02\x02\x02 \u01AA\x03\x02\x02\x02" +
		"\"\u01AF\x03\x02\x02\x02$\u01B3\x03\x02\x02\x02&\u01B8\x03\x02\x02\x02" +
		"(\u01BC\x03\x02\x02\x02*\u01C6\x03\x02\x02\x02,\u01C8\x03\x02\x02\x02" +
		".\u01D6\x03\x02\x02\x020\u01D8\x03\x02\x02\x022\u01E0\x03\x02\x02\x02" +
		"4\u01EB\x03\x02\x02\x026\u01ED\x03\x02\x02\x028\u01F5\x03\x02\x02\x02" +
		":\u0203\x03\x02\x02\x02<\u0205\x03\x02\x02\x02>\u0210\x03\x02\x02\x02" +
		"@\u0212\x03\x02\x02\x02B\u021A\x03\x02\x02\x02D\u0228\x03\x02\x02\x02" +
		"F\u022A\x03\x02\x02\x02H\u022D\x03\x02\x02\x02J\u023C\x03\x02\x02\x02" +
		"L\u0242\x03\x02\x02\x02N\u0244\x03\x02\x02\x02P\u0252\x03\x02\x02\x02" +
		"R\u0254\x03\x02\x02\x02T\u025C\x03\x02\x02\x02V\u0267\x03\x02\x02\x02" +
		"X\u0269\x03\x02\x02\x02Z\u0277\x03\x02\x02\x02\\\u0279\x03\x02\x02\x02" +
		"^\u0281\x03\x02\x02\x02`\u0288\x03\x02\x02\x02b\u028A\x03\x02\x02\x02" +
		"d\u0298\x03\x02\x02\x02f\u029A\x03\x02\x02\x02h\u02A2\x03\x02\x02\x02" +
		"j\u02AD\x03\x02\x02\x02l\u02AF\x03\x02\x02\x02n\u02C3\x03\x02\x02\x02" +
		"p\u02C5\x03\x02\x02\x02r\u02D3\x03\x02\x02\x02t\u02D5\x03\x02\x02\x02" +
		"v\u02D9\x03\x02\x02\x02x\u02DD\x03\x02\x02\x02z\u02E1\x03\x02\x02\x02" +
		"|\u02E8\x03\x02\x02\x02~\u02EA\x03\x02\x02\x02\x80\u02F8\x03\x02\x02\x02" +
		"\x82\u02FA\x03\x02\x02\x02\x84\u02FC\x03\x02\x02\x02\x86\u02FF\x03\x02" +
		"\x02\x02\x88\u0301\x03\x02\x02\x02\x8A\u0307\x03\x02\x02\x02\x8C\u0309" +
		"\x03\x02\x02\x02\x8E\u0317\x03\x02\x02\x02\x90\u0319\x03\x02\x02\x02\x92" +
		"\u031B\x03\x02\x02\x02\x94\u031D\x03\x02\x02\x02\x96\u031F\x03\x02\x02" +
		"\x02\x98\u0321\x03\x02\x02\x02\x9A\u0323\x03\x02\x02\x02\x9C\u032E\x03" +
		"\x02\x02\x02\x9E\u0339\x03\x02\x02\x02\xA0\u0345\x03\x02\x02\x02\xA2\u0349" +
		"\x03\x02\x02\x02\xA4\u034B\x03\x02\x02\x02\xA6\u0356\x03\x02\x02\x02\xA8" +
		"\u0358\x03\x02\x02\x02\xAA\u035B\x03\x02\x02\x02\xAC\u0366\x03\x02\x02" +
		"\x02\xAE\u036B\x03\x02\x02\x02\xB0\u036D\x03\x02\x02\x02\xB2\u0374\x03" +
		"\x02\x02\x02\xB4\u0376\x03\x02\x02\x02\xB6\u0378\x03\x02\x02\x02\xB8\u037A" +
		"\x03\x02\x02\x02\xBA\u037E\x03\x02\x02\x02\xBC\u0386\x03\x02\x02\x02\xBE" +
		"\u0388\x03\x02\x02\x02\xC0\u038A\x03\x02\x02\x02\xC2\u038C\x03\x02\x02" +
		"\x02\xC4\u038E\x03\x02\x02\x02\xC6\u0390\x03\x02\x02\x02\xC8\u0392\x03" +
		"\x02\x02\x02\xCA\u0394\x03\x02\x02\x02\xCC\u0396\x03\x02\x02\x02\xCE\u0398" +
		"\x03\x02\x02\x02\xD0\u039C\x03\x02\x02\x02\xD2\u03A0\x03\x02\x02\x02\xD4" +
		"\u03A2\x03\x02\x02\x02\xD6\u03A8\x03\x02\x02\x02\xD8\u03AF\x03\x02\x02" +
		"\x02\xDA\u03B1\x03\x02\x02\x02\xDC\u03B3\x03\x02\x02\x02\xDE\u03B5\x03" +
		"\x02\x02\x02\xE0\u03B7\x03\x02\x02\x02\xE2\u03B9\x03\x02\x02\x02\xE4\u03CD" +
		"\x03\x02\x02\x02\xE6\u03D6\x03\x02\x02\x02\xE8\u03D8\x03\x02\x02\x02\xEA" +
		"\u03EA\x03\x02\x02\x02\xEC\u03F8\x03\x02\x02\x02\xEE\u0406\x03\x02\x02" +
		"\x02\xF0\u0408\x03\x02\x02\x02\xF2\u0413\x03\x02\x02\x02\xF4\u041D\x03" +
		"\x02\x02\x02\xF6\u0427\x03\x02\x02\x02\xF8\u0431\x03\x02\x02\x02\xFA\u0433" +
		"\x03\x02\x02\x02\xFC\u043E\x03\x02\x02\x02\xFE\u0442\x03\x02\x02\x02\u0100" +
		"\u0444\x03\x02\x02\x02\u0102\u0446\x03\x02\x02\x02\u0104\u0448\x03\x02" +
		"\x02\x02\u0106\u0453\x03\x02\x02\x02\u0108\u0455\x03\x02\x02\x02\u010A" +
		"\u045B\x03\x02\x02\x02\u010C\u045F\x03\x02\x02\x02\u010E\u0461\x03\x02" +
		"\x02\x02\u0110\u0463\x03\x02\x02\x02\u0112\u0469\x03\x02\x02\x02\u0114" +
		"\u046B\x03\x02\x02\x02\u0116\u046D\x03\x02\x02\x02\u0118\u046F\x03\x02" +
		"\x02\x02\u011A\u0471\x03\x02\x02\x02\u011C\u0475\x03\x02\x02\x02\u011E" +
		"\u0477\x03\x02\x02\x02\u0120\u047D\x03\x02\x02\x02\u0122\u047F\x03\x02" +
		"\x02\x02\u0124\u0482\x03\x02\x02\x02\u0126\u048B\x03\x02\x02\x02\u0128" +
		"\u0496\x03\x02\x02\x02\u012A\u0498\x03\x02\x02\x02\u012C\u049A\x03\x02" +
		"\x02\x02\u012E\u049E\x03\x02\x02\x02\u0130\u04A2\x03\x02\x02\x02\u0132" +
		"\u04A6\x03\x02\x02\x02\u0134\u04A8\x03\x02\x02\x02\u0136\u04AA\x03\x02" +
		"\x02\x02\u0138\u04AC\x03\x02\x02\x02\u013A\u04AE\x03\x02\x02\x02\u013C" +
		"\u04B0\x03\x02\x02\x02\u013E\u04B2\x03\x02\x02\x02\u0140\u0142\x05\x04" +
		"\x03\x02\u0141\u0140\x03\x02\x02\x02\u0142\u0143\x03\x02\x02\x02\u0143" +
		"\u0141\x03\x02\x02\x02\u0143\u0144\x03\x02\x02\x02\u0144\u0145\x03\x02" +
		"\x02\x02\u0145\u0146\x07\x02\x02\x03\u0146\x03\x03\x02\x02\x02\u0147\u014A" +
		"\x05\b\x05\x02\u0148\u014A\x05\f\x07\x02\u0149\u0147\x03\x02\x02\x02\u0149" +
		"\u0148\x03\x02\x02\x02\u014A\x05\x03\x02\x02\x02\u014B\u014E\x05\xD2j" +
		"\x02\u014C\u014E\x05\xD8m\x02\u014D\u014B\x03\x02\x02\x02\u014D\u014C" +
		"\x03\x02\x02\x02\u014E\x07\x03\x02\x02\x02\u014F\u0150\x05\x80A\x02\u0150" +
		"\u0151\x07=\x02\x02\u0151\u0152\x05\n\x06\x02\u0152\u0153\x07\v\x02\x02" +
		"\u0153\u0154\x05\x10\t\x02\u0154\t\x03\x02\x02\x02\u0155\u0156\x079\x02" +
		"\x02\u0156\u0157\x05\x06\x04\x02\u0157\u0158\x074\x02\x02\u0158\u0159" +
		"\x05\x06\x04\x02\u0159\u015A\x074\x02\x02\u015A\u015B\x05\x06\x04\x02" +
		"\u015B\u015C\x074\x02\x02\u015C\u015D\x07\f\x02\x02\u015D\u015E\x074\x02" +
		"\x02\u015E\u015F\x07\r\x02\x02\u015F\u0160\x074\x02\x02\u0160\u0161\x07" +
		"\x0E\x02\x02\u0161\u0162\x074\x02\x02\u0162\u0163\x07\x10\x02\x02\u0163" +
		"\u0164\x07:\x02\x02\u0164\v\x03\x02\x02\x02\u0165\u0166\x05\x80A\x02\u0166" +
		"\u0167\x07=\x02\x02\u0167\u0168\x05\x0E\b\x02\u0168\u0169\x07\v\x02\x02" +
		"\u0169\u016A\x05\x10\t\x02\u016A\r\x03\x02\x02\x02\u016B\u016C\x079\x02" +
		"\x02\u016C\u016D\x05\x06\x04\x02\u016D\u016E\x074\x02\x02\u016E\u016F" +
		"\x05\x06\x04\x02\u016F\u0170\x074\x02\x02\u0170\u0171\x05\x06\x04\x02" +
		"\u0171\u0172\x074\x02\x02\u0172\u0173\x05\x06\x04\x02\u0173\u0174\x07" +
		"4\x02\x02\u0174\u0175\x05\x06\x04\x02\u0175\u0176\x074\x02\x02\u0176\u0177" +
		"\x05\x06\x04\x02\u0177\u0178\x074\x02\x02\u0178\u0179\x05\x06\x04\x02" +
		"\u0179\u017A\x074\x02\x02\u017A\u017B\x07\x0F\x02\x02\u017B\u017C\x07" +
		":\x02\x02\u017C\x0F\x03\x02\x02\x02\u017D\u0182\x05\x12\n\x02\u017E\u017F" +
		"\x07<\x02\x02\u017F\u0181\x05\x12\n\x02\u0180\u017E\x03\x02\x02\x02\u0181" +
		"\u0184\x03\x02\x02\x02\u0182\u0180\x03\x02\x02\x02\u0182\u0183\x03\x02" +
		"\x02\x02\u0183\x11\x03\x02\x02\x02\u0184\u0182\x03\x02\x02\x02\u0185\u0188" +
		"\x05\xD4k\x02\u0186\u0188\x05\x14\v\x02\u0187\u0185\x03\x02\x02\x02\u0187" +
		"\u0186\x03\x02\x02\x02\u0188\x13\x03\x02\x02\x02\u0189\u018F\x05\x16\f" +
		"\x02\u018A\u018F\x05\x1A\x0E\x02\u018B\u018F\x05\x1E\x10\x02\u018C\u018F" +
		"\x05\"\x12\x02\u018D\u018F\x05&\x14\x02\u018E\u0189\x03\x02\x02\x02\u018E" +
		"\u018A\x03\x02\x02\x02\u018E\u018B\x03\x02\x02\x02\u018E\u018C\x03\x02" +
		"\x02\x02\u018E\u018D\x03\x02\x02\x02\u018F\x15\x03\x02\x02\x02\u0190\u0191" +
		"\x05\x18\r\x02\u0191\u0192\x07=\x02\x02\u0192\u0193\x05*\x16\x02\u0193" +
		"\x17\x03\x02\x02\x02\u0194\u0195\x07\f\x02\x02\u0195\u0196\x079\x02\x02" +
		"\u0196\u0197\x05\xEAv\x02\u0197\u0198\x074\x02\x02\u0198\u0199\x05\xE6" +
		"t\x02\u0199\u019A\x074\x02\x02\u019A\u019B\x05\xEAv\x02\u019B\u019C\x07" +
		":\x02\x02\u019C\x19\x03\x02\x02\x02\u019D\u019E\x05\x1C\x0F\x02\u019E" +
		"\u019F\x07=\x02\x02\u019F\u01A0\x05*\x16\x02\u01A0\x1B\x03\x02\x02\x02" +
		"\u01A1\u01A2\x07\r\x02\x02\u01A2\u01A3\x079\x02\x02\u01A3\u01A4\x05\xEA" +
		"v\x02\u01A4\u01A5\x07:\x02\x02\u01A5\x1D\x03\x02\x02\x02\u01A6\u01A7\x05" +
		" \x11\x02\u01A7\u01A8\x07=\x02\x02\u01A8\u01A9\x05*\x16\x02\u01A9\x1F" +
		"\x03\x02\x02\x02\u01AA\u01AB\x07\x0E\x02\x02\u01AB\u01AC\x079\x02\x02" +
		"\u01AC\u01AD\x05\xEAv\x02\u01AD\u01AE\x07:\x02\x02\u01AE!\x03\x02\x02" +
		"\x02\u01AF\u01B0\x05$\x13\x02\u01B0\u01B1\x07=\x02\x02\u01B1\u01B2\x05" +
		"L\'\x02\u01B2#\x03\x02\x02\x02\u01B3\u01B4\x07\x10\x02\x02\u01B4\u01B5" +
		"\x079\x02\x02\u01B5\u01B6\x05\xEAv\x02\u01B6\u01B7\x07:\x02\x02\u01B7" +
		"%\x03\x02\x02\x02\u01B8\u01B9\x05(\x15\x02\u01B9\u01BA\x07=\x02\x02\u01BA" +
		"\u01BB\x05`1\x02\u01BB\'\x03\x02\x02\x02\u01BC\u01BD\x07\x0F\x02\x02\u01BD" +
		"\u01BE\x079\x02\x02\u01BE\u01BF\x05\xD8m\x02\u01BF\u01C0\x07:\x02\x02" +
		"\u01C0)\x03\x02\x02\x02\u01C1\u01C7\x05H%\x02\u01C2\u01C7\x05,\x17\x02" +
		"\u01C3\u01C7\x050\x19\x02\u01C4\u01C7\x054\x1B\x02\u01C5\u01C7\x05> \x02" +
		"\u01C6\u01C1\x03\x02\x02\x02\u01C6\u01C2\x03\x02\x02\x02\u01C6\u01C3\x03" +
		"\x02\x02\x02\u01C6\u01C4\x03\x02\x02\x02\u01C6\u01C5\x03\x02\x02\x02\u01C7" +
		"+\x03\x02\x02\x02\u01C8\u01CD\x05.\x18\x02\u01C9\u01CA\x074\x02\x02\u01CA" +
		"\u01CC\x05.\x18\x02\u01CB\u01C9\x03\x02\x02\x02\u01CC\u01CF\x03\x02\x02" +
		"\x02\u01CD\u01CB\x03\x02\x02\x02\u01CD\u01CE\x03\x02\x02\x02\u01CE-\x03" +
		"\x02\x02\x02\u01CF\u01CD\x03\x02\x02\x02\u01D0\u01D1\x05\xA0Q\x02\u01D1" +
		"\u01D2\x05H%\x02\u01D2\u01D7\x03\x02\x02\x02\u01D3\u01D4\x05\xB6\\\x02" +
		"\u01D4\u01D5\x05H%\x02\u01D5\u01D7\x03\x02\x02\x02\u01D6\u01D0\x03\x02" +
		"\x02\x02\u01D6\u01D3\x03\x02\x02\x02\u01D7/\x03\x02\x02\x02\u01D8\u01DD" +
		"\x052\x1A\x02\u01D9\u01DA\x074\x02\x02\u01DA\u01DC\x052\x1A\x02\u01DB" +
		"\u01D9\x03\x02\x02\x02\u01DC\u01DF\x03\x02\x02\x02\u01DD\u01DB\x03\x02" +
		"\x02\x02\u01DD\u01DE\x03\x02\x02\x02\u01DE1\x03\x02\x02\x02\u01DF\u01DD" +
		"\x03\x02\x02\x02\u01E0\u01E1\x05H%\x02\u01E1\u01E2\x05\x9EP\x02\u01E2" +
		"3\x03\x02\x02\x02\u01E3\u01E4\x05\xECw\x02\u01E4\u01E5\x074\x02\x02\u01E5" +
		"\u01E6\x056\x1C\x02\u01E6\u01EC\x03\x02\x02\x02\u01E7\u01E8\x05\xECw\x02" +
		"\u01E8\u01E9\x074\x02\x02\u01E9\u01EA\x058\x1D\x02\u01EA\u01EC\x03\x02" +
		"\x02\x02\u01EB\u01E3\x03\x02\x02\x02\u01EB\u01E7\x03\x02\x02\x02\u01EC" +
		"5\x03\x02\x02\x02\u01ED\u01F2\x05:\x1E\x02\u01EE\u01EF\x074\x02\x02\u01EF" +
		"\u01F1\x05:\x1E\x02\u01F0";
	private static readonly _serializedATNSegment1: string =
		"\u01EE\x03\x02\x02\x02\u01F1\u01F4\x03\x02\x02\x02\u01F2\u01F0\x03\x02" +
		"\x02\x02\u01F2\u01F3\x03\x02\x02\x02\u01F37\x03\x02\x02\x02\u01F4\u01F2" +
		"\x03\x02\x02\x02\u01F5\u01FA\x05<\x1F\x02\u01F6\u01F7\x074\x02\x02\u01F7" +
		"\u01F9\x05<\x1F\x02\u01F8\u01F6\x03\x02\x02\x02\u01F9\u01FC\x03\x02\x02" +
		"\x02\u01FA\u01F8\x03\x02\x02\x02\u01FA\u01FB\x03\x02\x02\x02\u01FB9\x03" +
		"\x02\x02\x02\u01FC\u01FA\x03\x02\x02\x02\u01FD\u01FE\x05\xA0Q\x02\u01FE" +
		"\u01FF\x05z>\x02\u01FF\u0204\x03\x02\x02\x02\u0200\u0201\x05\xB6\\\x02" +
		"\u0201\u0202\x05z>\x02\u0202\u0204\x03\x02\x02\x02\u0203\u01FD\x03\x02" +
		"\x02\x02\u0203\u0200\x03\x02\x02\x02\u0204;\x03\x02\x02\x02\u0205\u0206" +
		"\x05z>\x02\u0206\u0207\x05\x9EP\x02\u0207=\x03\x02\x02\x02\u0208\u0209" +
		"\x05\xEEx\x02\u0209\u020A\x074\x02\x02\u020A\u020B\x05@!\x02\u020B\u0211" +
		"\x03\x02\x02\x02\u020C\u020D\x05\xEEx\x02\u020D\u020E\x074\x02\x02\u020E" +
		"\u020F\x05B\"\x02\u020F\u0211\x03\x02\x02\x02\u0210\u0208\x03\x02\x02" +
		"\x02\u0210\u020C\x03\x02\x02\x02\u0211?\x03\x02\x02\x02\u0212\u0217\x05" +
		"D#\x02\u0213\u0214\x074\x02\x02\u0214\u0216\x05D#\x02\u0215\u0213\x03" +
		"\x02\x02\x02\u0216\u0219\x03\x02\x02\x02\u0217\u0215\x03\x02\x02\x02\u0217" +
		"\u0218\x03\x02\x02\x02\u0218A\x03\x02\x02\x02\u0219\u0217\x03\x02\x02" +
		"\x02\u021A\u021F\x05F$\x02\u021B\u021C\x074\x02\x02\u021C\u021E\x05F$" +
		"\x02\u021D\u021B\x03\x02\x02\x02\u021E\u0221\x03\x02\x02\x02\u021F\u021D" +
		"\x03\x02\x02\x02\u021F\u0220\x03\x02\x02\x02\u0220C\x03\x02\x02\x02\u0221" +
		"\u021F\x03\x02\x02\x02\u0222\u0223\x05\xA0Q\x02\u0223\u0224\x05~@\x02" +
		"\u0224\u0229\x03\x02\x02\x02\u0225\u0226\x05\xB6\\\x02\u0226\u0227\x05" +
		"~@\x02\u0227\u0229\x03\x02\x02\x02\u0228\u0222\x03\x02\x02\x02\u0228\u0225" +
		"\x03\x02\x02\x02\u0229E\x03\x02\x02\x02\u022A\u022B\x05~@\x02\u022B\u022C" +
		"\x05\x9EP\x02\u022CG\x03\x02\x02\x02\u022D\u022E\x079\x02\x02\u022E\u0233" +
		"\x05J&\x02\u022F\u0230\x074\x02\x02\u0230\u0232\x05J&\x02\u0231\u022F" +
		"\x03\x02\x02\x02\u0232\u0235\x03\x02\x02\x02\u0233\u0231\x03\x02\x02\x02" +
		"\u0233\u0234\x03\x02\x02\x02\u0234\u0236\x03\x02\x02\x02\u0235\u0233\x03" +
		"\x02\x02\x02\u0236\u0237\x07:\x02\x02\u0237I\x03\x02\x02\x02\u0238\u023D" +
		"\x05\xE6t\x02\u0239\u023D\x05\x98M\x02\u023A\u023D\x05\u011C\x8F\x02\u023B" +
		"\u023D\x05\xA2R\x02\u023C\u0238\x03\x02\x02\x02\u023C\u0239\x03\x02\x02" +
		"\x02\u023C\u023A\x03\x02\x02\x02\u023C\u023B\x03\x02\x02\x02\u023DK\x03" +
		"\x02\x02\x02\u023E\u0243\x05V,\x02\u023F\u0243\x05N(\x02\u0240\u0243\x05" +
		"R*\x02\u0241\u0243\x05J&\x02\u0242\u023E\x03\x02\x02\x02\u0242\u023F\x03" +
		"\x02\x02\x02\u0242\u0240\x03\x02\x02\x02\u0242\u0241\x03\x02\x02\x02\u0243" +
		"M\x03\x02\x02\x02\u0244\u0249\x05P)\x02\u0245\u0246\x074\x02\x02\u0246" +
		"\u0248\x05P)\x02\u0247\u0245\x03\x02\x02\x02\u0248\u024B\x03\x02\x02\x02" +
		"\u0249\u0247\x03\x02\x02\x02\u0249\u024A\x03\x02\x02\x02\u024AO\x03\x02" +
		"\x02\x02\u024B\u0249\x03\x02\x02\x02\u024C\u024D\x05\xA0Q\x02\u024D\u024E" +
		"\x05J&\x02\u024E\u0253\x03\x02\x02\x02\u024F\u0250\x05\xB6\\\x02\u0250" +
		"\u0251\x05J&\x02\u0251\u0253\x03\x02\x02\x02\u0252\u024C\x03\x02\x02\x02" +
		"\u0252\u024F\x03\x02\x02\x02\u0253Q\x03\x02\x02\x02\u0254\u0259\x05T+" +
		"\x02\u0255\u0256\x074\x02\x02\u0256\u0258\x05T+\x02\u0257\u0255\x03\x02" +
		"\x02\x02\u0258\u025B\x03\x02\x02\x02\u0259\u0257\x03\x02\x02\x02\u0259" +
		"\u025A\x03\x02\x02\x02\u025AS\x03\x02\x02\x02\u025B\u0259\x03\x02\x02" +
		"\x02\u025C\u025D\x05J&\x02\u025D\u025E\x05\x9EP\x02\u025EU\x03\x02\x02" +
		"\x02\u025F\u0260\x05\x88E\x02\u0260\u0261\x074\x02\x02\u0261\u0262\x05" +
		"X-\x02\u0262\u0268\x03\x02\x02\x02\u0263\u0264\x05\x88E\x02\u0264\u0265" +
		"\x074\x02\x02\u0265\u0266\x05\\/\x02\u0266\u0268\x03\x02\x02\x02\u0267" +
		"\u025F\x03\x02\x02\x02\u0267\u0263\x03\x02\x02\x02\u0268W\x03\x02\x02" +
		"\x02\u0269\u026E\x05Z.\x02\u026A\u026B\x074\x02\x02\u026B\u026D\x05Z." +
		"\x02\u026C\u026A\x03\x02\x02\x02\u026D\u0270\x03\x02\x02\x02\u026E\u026C" +
		"\x03\x02\x02\x02\u026E\u026F\x03\x02\x02\x02\u026FY\x03\x02\x02\x02\u0270" +
		"\u026E\x03\x02\x02\x02\u0271\u0272\x05\xA0Q\x02\u0272\u0273\x05x=\x02" +
		"\u0273\u0278\x03\x02\x02\x02\u0274\u0275\x05\xB6\\\x02\u0275\u0276\x05" +
		"x=\x02\u0276\u0278\x03\x02\x02\x02\u0277\u0271\x03\x02\x02\x02\u0277\u0274" +
		"\x03\x02\x02\x02\u0278[\x03\x02\x02\x02\u0279\u027E\x05^0\x02\u027A\u027B" +
		"\x074\x02\x02\u027B\u027D\x05^0\x02\u027C\u027A\x03\x02\x02\x02\u027D" +
		"\u0280\x03\x02\x02\x02\u027E\u027C\x03\x02\x02\x02\u027E\u027F\x03\x02" +
		"\x02\x02\u027F]\x03\x02\x02\x02\u0280\u027E\x03\x02\x02\x02\u0281\u0282" +
		"\x05x=\x02\u0282\u0283\x05\x9EP\x02\u0283_\x03\x02\x02\x02\u0284\u0289" +
		"\x05\x86D\x02\u0285\u0289\x05b2\x02\u0286\u0289\x05f4\x02\u0287\u0289" +
		"\x05j6\x02\u0288\u0284\x03\x02\x02\x02\u0288\u0285\x03\x02\x02\x02\u0288" +
		"\u0286\x03\x02\x02\x02\u0288\u0287\x03\x02\x02\x02\u0289a\x03\x02\x02" +
		"\x02\u028A\u028F\x05d3\x02\u028B\u028C\x074\x02\x02\u028C\u028E\x05d3" +
		"\x02\u028D\u028B\x03\x02\x02\x02\u028E\u0291\x03\x02\x02\x02\u028F\u028D" +
		"\x03\x02\x02\x02\u028F\u0290\x03\x02\x02\x02\u0290c\x03\x02\x02\x02\u0291" +
		"\u028F\x03\x02\x02\x02\u0292\u0293\x05\xA0Q\x02\u0293\u0294\x05\x86D\x02" +
		"\u0294\u0299\x03\x02\x02\x02\u0295\u0296\x05\xB6\\\x02\u0296\u0297\x05" +
		"\x86D\x02\u0297\u0299\x03\x02\x02\x02\u0298\u0292\x03\x02\x02\x02\u0298" +
		"\u0295\x03\x02\x02\x02\u0299e\x03\x02\x02\x02\u029A\u029F\x05h5\x02\u029B" +
		"\u029C\x074\x02\x02\u029C\u029E\x05h5\x02\u029D\u029B\x03\x02\x02\x02" +
		"\u029E\u02A1\x03\x02\x02\x02\u029F\u029D\x03\x02\x02\x02\u029F\u02A0\x03" +
		"\x02\x02\x02\u02A0g\x03\x02\x02\x02\u02A1\u029F\x03\x02\x02\x02\u02A2" +
		"\u02A3\x05\x86D\x02\u02A3\u02A4\x05\x9EP\x02\u02A4i\x03\x02\x02\x02\u02A5" +
		"\u02A6\x05\x88E\x02\u02A6\u02A7\x074\x02\x02\u02A7\u02A8\x05l7\x02\u02A8" +
		"\u02AE\x03\x02\x02\x02\u02A9\u02AA\x05\x88E\x02\u02AA\u02AB\x074\x02\x02" +
		"\u02AB\u02AC\x05p9\x02\u02AC\u02AE\x03\x02\x02\x02\u02AD\u02A5\x03\x02" +
		"\x02\x02\u02AD\u02A9\x03\x02\x02\x02\u02AEk\x03\x02\x02\x02\u02AF\u02B4" +
		"\x05n8\x02\u02B0\u02B1\x074\x02\x02\u02B1\u02B3\x05n8\x02\u02B2\u02B0" +
		"\x03\x02\x02\x02\u02B3\u02B6\x03\x02\x02\x02\u02B4\u02B2\x03\x02\x02\x02" +
		"\u02B4\u02B5\x03\x02\x02\x02\u02B5m\x03\x02\x02\x02\u02B6\u02B4\x03\x02" +
		"\x02\x02\u02B7\u02B8\x05\xA0Q\x02\u02B8\u02B9\x05t;\x02\u02B9\u02C4\x03" +
		"\x02\x02\x02\u02BA\u02BB\x05\xA0Q\x02\u02BB\u02BC\x05v<\x02\u02BC\u02C4" +
		"\x03\x02\x02\x02\u02BD\u02BE\x05\xB6\\\x02\u02BE\u02BF\x05t;\x02\u02BF" +
		"\u02C4\x03\x02\x02\x02\u02C0\u02C1\x05\xB6\\\x02\u02C1\u02C2\x05v<\x02" +
		"\u02C2\u02C4\x03\x02\x02\x02\u02C3\u02B7\x03\x02\x02\x02\u02C3\u02BA\x03" +
		"\x02\x02\x02\u02C3\u02BD\x03\x02\x02\x02\u02C3\u02C0\x03\x02\x02\x02\u02C4" +
		"o\x03\x02\x02\x02\u02C5\u02CA\x05r:\x02\u02C6\u02C7\x074\x02\x02\u02C7" +
		"\u02C9\x05r:\x02\u02C8\u02C6\x03\x02\x02\x02\u02C9\u02CC\x03\x02\x02\x02" +
		"\u02CA\u02C8\x03\x02\x02\x02\u02CA\u02CB\x03\x02\x02\x02\u02CBq\x03\x02" +
		"\x02\x02\u02CC\u02CA\x03\x02\x02\x02\u02CD\u02CE\x05t;\x02\u02CE\u02CF" +
		"\x05\x9EP\x02\u02CF\u02D4\x03\x02\x02\x02\u02D0\u02D1\x05v<\x02\u02D1" +
		"\u02D2\x05\x9EP\x02\u02D2\u02D4\x03\x02\x02\x02\u02D3\u02CD\x03\x02\x02" +
		"\x02\u02D3\u02D0\x03\x02\x02\x02\u02D4s\x03\x02\x02\x02\u02D5\u02D6\x05" +
		"\x88E\x02\u02D6\u02D7\x07\x1C\x02\x02\u02D7\u02D8\x05\x86D\x02\u02D8u" +
		"\x03\x02\x02\x02\u02D9\u02DA\x05\x88E\x02\u02DA\u02DB\x07\x1C\x02\x02" +
		"\u02DB\u02DC\x05\x84C\x02\u02DCw\x03\x02\x02\x02\u02DD\u02DE\x05\x88E" +
		"\x02\u02DE\u02DF\x07\x1C\x02\x02\u02DF\u02E0\x05J&\x02\u02E0y\x03\x02" +
		"\x02\x02\u02E1\u02E2\x05\xECw\x02\u02E2\u02E3\x07\x1C\x02\x02\u02E3\u02E4" +
		"\x05H%\x02\u02E4{\x03\x02\x02\x02\u02E5\u02E9\x05t;\x02\u02E6\u02E9\x05" +
		"x=\x02\u02E7\u02E9\x05z>\x02\u02E8\u02E5\x03\x02\x02\x02\u02E8\u02E6\x03" +
		"\x02\x02\x02\u02E8\u02E7\x03\x02\x02\x02\u02E9}\x03\x02\x02\x02\u02EA" +
		"\u02EF\x05|?\x02\u02EB\u02EC\t\x02\x02\x02\u02EC\u02EE\x05|?\x02\u02ED" +
		"\u02EB\x03\x02\x02\x02\u02EE\u02F1\x03\x02\x02\x02\u02EF\u02ED\x03\x02" +
		"\x02\x02\u02EF\u02F0\x03\x02\x02\x02\u02F0\x7F\x03\x02\x02\x02\u02F1\u02EF" +
		"\x03\x02\x02\x02\u02F2\u02F9\x05\x82B\x02\u02F3\u02F4\x05\x82B\x02\u02F4" +
		"\u02F5\x079\x02\x02\u02F5\u02F6\x05\x8CG\x02\u02F6\u02F7\x07:\x02\x02" +
		"\u02F7\u02F9\x03\x02\x02\x02\u02F8\u02F2\x03\x02\x02\x02\u02F8\u02F3\x03" +
		"\x02\x02\x02\u02F9\x81\x03\x02\x02\x02\u02FA\u02FB\t\x03\x02\x02\u02FB" +
		"\x83\x03\x02\x02\x02\u02FC\u02FD\x073\x02\x02\u02FD\u02FE\x07\x04\x02" +
		"\x02\u02FE\x85\x03\x02\x02\x02\u02FF\u0300\x07\x04\x02\x02\u0300\x87\x03" +
		"\x02\x02\x02\u0301\u0302\x07\x04\x02\x02\u0302\u0303\x072\x02\x02\u0303" +
		"\x89\x03\x02\x02\x02\u0304\u0308\x05\x88E\x02\u0305\u0308\x05\x8EH\x02" +
		"\u0306\u0308\x05\x86D\x02\u0307\u0304\x03\x02\x02\x02\u0307\u0305\x03" +
		"\x02\x02\x02\u0307\u0306\x03\x02\x02\x02\u0308\x8B\x03\x02\x02\x02\u0309" +
		"\u030E\x05\x84C\x02\u030A\u030B\x074\x02\x02\u030B\u030D\x05\x84C\x02" +
		"\u030C\u030A\x03\x02\x02\x02\u030D\u0310\x03\x02\x02\x02\u030E\u030C\x03" +
		"\x02\x02\x02\u030E\u030F\x03\x02\x02\x02\u030F\x8D\x03\x02\x02\x02\u0310" +
		"\u030E\x03\x02\x02\x02\u0311\u0318\x05\x90I\x02\u0312\u0318\x05\x92J\x02" +
		"\u0313\u0318\x05\x94K\x02\u0314\u0318\x05\x96L\x02\u0315\u0318\x05\x98" +
		"M\x02\u0316\u0318\x05\x9AN\x02\u0317\u0311\x03\x02\x02\x02\u0317\u0312" +
		"\x03\x02\x02\x02\u0317\u0313\x03\x02\x02\x02\u0317\u0314\x03\x02\x02\x02" +
		"\u0317\u0315\x03\x02\x02\x02\u0317\u0316\x03\x02\x02\x02\u0318\x8F\x03" +
		"\x02\x02\x02\u0319\u031A\x07\x11\x02\x02\u031A\x91\x03\x02\x02\x02\u031B" +
		"\u031C\x07\x12\x02\x02\u031C\x93\x03\x02\x02\x02\u031D\u031E\x07\x07\x02" +
		"\x02\u031E\x95\x03\x02\x02\x02\u031F\u0320\x07\b\x02\x02\u0320\x97\x03" +
		"\x02\x02\x02\u0321\u0322\x07\x1B\x02\x02\u0322\x99\x03\x02\x02\x02\u0323" +
		"\u0324\x07\x06\x02\x02\u0324\x9B\x03\x02\x02\x02\u0325\u0326\x05\xA0Q" +
		"\x02\u0326\u0327\x07\x02\x02\x03\u0327\u032F\x03\x02\x02\x02\u0328\u0329" +
		"\x05\x9EP\x02\u0329\u032A\x07\x02\x02\x03\u032A\u032F\x03\x02\x02\x02" +
		"\u032B\u032C\x05\xA2R\x02\u032C\u032D\x07\x02\x02\x03\u032D\u032F\x03" +
		"\x02\x02\x02\u032E\u0325\x03\x02\x02\x02\u032E\u0328\x03\x02\x02\x02\u032E" +
		"\u032B\x03\x02\x02\x02\u032F\x9D\x03\x02\x02\x02\u0330\u0331\x05\xB4[" +
		"\x02\u0331\u0332\x05\xA2R\x02\u0332\u033A\x03\x02\x02\x02\u0333\u0334" +
		"\x05\xB4[\x02\u0334\u0335\x079\x02\x02\u0335\u0336\x05\xA2R\x02\u0336" +
		"\u0337\x07:\x02\x02\u0337\u033A\x03\x02\x02\x02\u0338\u033A\x05\xB6\\" +
		"\x02\u0339\u0330\x03\x02\x02\x02\u0339\u0333\x03\x02\x02\x02\u0339\u0338" +
		"\x03\x02\x02\x02\u033A\x9F\x03\x02\x02\x02\u033B\u033C\x05\xB4[\x02\u033C" +
		"\u033D\x05\xA2R\x02\u033D\u033E\x07\x18\x02\x02\u033E\u0346\x03\x02\x02" +
		"\x02\u033F\u0340\x05\xB4[\x02\u0340\u0341\x079\x02\x02\u0341\u0342\x05" +
		"\xA2R\x02\u0342\u0343\x07:\x02\x02\u0343\u0344\x07\x18\x02\x02\u0344\u0346" +
		"\x03\x02\x02\x02\u0345\u033B\x03\x02\x02\x02\u0345\u033F\x03\x02\x02\x02" +
		"\u0346\xA1\x03\x02\x02\x02\u0347\u034A\x05\xA4S\x02\u0348\u034A\x05\xA6" +
		"T\x02\u0349\u0347\x03\x02\x02\x02\u0349\u0348\x03\x02\x02\x02\u034A\xA3" +
		"\x03\x02\x02\x02\u034B\u0351\x05\xA6T\x02\u034C\u034D\x05\xBA^\x02\u034D" +
		"\u034E\x05\xA6T\x02\u034E\u0350\x03\x02\x02\x02\u034F\u034C\x03\x02\x02" +
		"\x02\u0350\u0353\x03\x02\x02\x02\u0351\u034F\x03\x02\x02\x02\u0351\u0352" +
		"\x03\x02\x02\x02\u0352\xA5\x03\x02\x02\x02\u0353\u0351\x03\x02\x02\x02" +
		"\u0354\u0357\x05\xAAV\x02\u0355\u0357\x05\xA8U\x02\u0356\u0354\x03\x02" +
		"\x02\x02\u0356\u0355\x03\x02\x02\x02\u0357\xA7\x03\x02\x02\x02\u0358\u0359" +
		"\x05\xB8]\x02\u0359\u035A\x05\xA6T\x02\u035A\xA9\x03\x02\x02\x02\u035B" +
		"\u0361\x05\xACW\x02\u035C\u035D\x05\xBC_\x02\u035D\u035E\x05\xACW\x02" +
		"\u035E\u0360\x03\x02\x02\x02\u035F\u035C\x03\x02\x02\x02\u0360\u0363\x03" +
		"\x02\x02\x02\u0361\u035F\x03\x02\x02\x02\u0361\u0362\x03\x02\x02\x02\u0362" +
		"\xAB\x03\x02\x02\x02\u0363\u0361\x03\x02\x02\x02\u0364\u0367\x05\xAEX" +
		"\x02\u0365\u0367\x05\xB0Y\x02\u0366\u0364\x03\x02\x02\x02\u0366\u0365" +
		"\x03\x02\x02\x02\u0367\xAD\x03\x02\x02\x02\u0368\u036C\x05\xE6t\x02\u0369" +
		"\u036C\x05\xF2z\x02\u036A\u036C\x05\x98M\x02\u036B\u0368\x03\x02\x02\x02" +
		"\u036B\u0369\x03\x02\x02\x02\u036B\u036A\x03\x02\x02\x02\u036C\xAF\x03" +
		"\x02\x02\x02\u036D\u036E\x079\x02\x02\u036E\u036F\x05\xA2R\x02\u036F\u0370" +
		"\x07:\x02\x02\u0370\xB1\x03\x02\x02\x02\u0371\u0375\x05\x98M\x02\u0372" +
		"\u0375\x05\xE6t\x02\u0373\u0375\x05\xF2z\x02\u0374\u0371\x03\x02\x02\x02" +
		"\u0374\u0372\x03\x02\x02\x02\u0374\u0373\x03\x02\x02\x02\u0375\xB3\x03" +
		"\x02\x02\x02\u0376\u0377\x07\x17\x02\x02\u0377\xB5\x03\x02\x02\x02\u0378" +
		"\u0379\t\x04\x02\x02\u0379\xB7\x03\x02\x02\x02\u037A\u037B\x05\xBE`\x02" +
		"\u037B\xB9\x03\x02\x02\x02\u037C\u037F\x05\xC0a\x02\u037D\u037F\x05\xC2" +
		"b\x02\u037E\u037C\x03\x02\x02\x02\u037E\u037D\x03\x02\x02\x02\u037F\xBB" +
		"\x03\x02\x02\x02\u0380\u0387\x05\xC4c\x02\u0381\u0387\x05\xC6d\x02\u0382" +
		"\u0387\x05\xC8e\x02\u0383\u0387\x05\xCAf\x02\u0384\u0387\x05\xCCg\x02" +
		"\u0385\u0387\x05\xCEh\x02\u0386\u0380\x03\x02\x02\x02\u0386\u0381\x03" +
		"\x02\x02\x02\u0386\u0382\x03\x02\x02\x02\u0386\u0383\x03\x02\x02\x02\u0386" +
		"\u0384\x03\x02\x02\x02\u0386\u0385\x03\x02\x02\x02\u0387\xBD\x03\x02\x02" +
		"\x02\u0388\u0389\x07#\x02\x02\u0389\xBF\x03\x02\x02\x02\u038A\u038B\x07" +
		"$\x02\x02\u038B\xC1\x03\x02\x02\x02\u038C\u038D\x07%\x02\x02\u038D\xC3" +
		"\x03\x02\x02\x02\u038E\u038F\x07&\x02\x02\u038F\xC5\x03\x02\x02\x02\u0390" +
		"\u0391\x07\'\x02\x02\u0391\xC7\x03\x02\x02\x02\u0392\u0393\x07(\x02\x02" +
		"\u0393\xC9\x03\x02\x02\x02\u0394\u0395\x07)\x02\x02\u0395\xCB\x03\x02" +
		"\x02\x02\u0396\u0397\x07*\x02\x02\u0397\xCD\x03\x02\x02\x02\u0398\u0399" +
		"\x07+\x02\x02\u0399\xCF\x03\x02\x02\x02\u039A\u039D\x05\xD2j\x02\u039B" +
		"\u039D\x05\xD4k\x02\u039C\u039A\x03\x02\x02\x02\u039C\u039B\x03\x02\x02" +
		"\x02\u039D\xD1\x03\x02\x02\x02\u039E\u03A1\x05\xD6l\x02\u039F\u03A1\x05" +
		"\u0104\x83\x02\u03A0\u039E\x03\x02\x02\x02\u03A0\u039F\x03\x02\x02\x02" +
		"\u03A1\xD3\x03\x02\x02\x02\u03A2\u03A3\x05\xD8m\x02\u03A3\u03A4\x07=\x02" +
		"\x02\u03A4\u03A5\x05\xD2j\x02\u03A5\xD5\x03\x02\x02\x02\u03A6\u03A9\x05" +
		"\xE4s\x02\u03A7\u03A9\x05\xE8u\x02\u03A8\u03A6\x03\x02\x02\x02\u03A8\u03A7" +
		"\x03\x02\x02\x02\u03A9\xD7\x03\x02\x02\x02\u03AA\u03B0\x05\xDAn\x02\u03AB" +
		"\u03B0\x05\xDCo\x02\u03AC\u03B0\x05\xDEp\x02\u03AD\u03B0\x05\xE0q\x02" +
		"\u03AE\u03B0\x05\xE2r\x02\u03AF\u03AA\x03\x02\x02\x02\u03AF\u03AB\x03" +
		"\x02\x02\x02\u03AF\u03AC\x03\x02\x02\x02\u03AF\u03AD\x03\x02\x02\x02\u03AF" +
		"\u03AE\x03\x02\x02\x02\u03B0\xD9\x03\x02\x02\x02\u03B1\u03B2\x07\x03\x02" +
		"\x02\u03B2\xDB\x03\x02\x02\x02\u03B3\u03B4\x07\x13\x02\x02\u03B4\xDD\x03" +
		"\x02\x02\x02\u03B5\u03B6\x07\x14\x02\x02\u03B6\xDF\x03\x02\x02\x02\u03B7" +
		"\u03B8\x07\x15\x02\x02\u03B8\xE1\x03\x02\x02\x02\u03B9\u03BA\x07\x16\x02" +
		"\x02\u03BA\xE3\x03\x02\x02\x02\u03BB\u03BC\x077\x02\x02\u03BC\u03C1\x05" +
		"\xE6t\x02\u03BD\u03BE\x074\x02\x02\u03BE\u03C0\x05\xE6t\x02\u03BF\u03BD" +
		"\x03\x02\x02\x02\u03C0\u03C3\x03\x02\x02\x02\u03C1\u03BF\x03\x02\x02\x02" +
		"\u03C1\u03C2\x03\x02\x02\x02\u03C2\u03C4\x03\x02\x02\x02\u03C3\u03C1\x03" +
		"\x02\x02\x02\u03C4\u03C5\x078\x02\x02\u03C5\u03CE\x03\x02\x02\x02\u03C6" +
		"\u03C7\x077\x02\x02\u03C7\u03C8\x05\xE6t\x02\u03C8\u03C9\x07>\x02\x02" +
		"\u03C9\u03CA\x05\xF2z\x02\u03CA\u03CB\x078\x02\x02\u03CB\u03CE\x03\x02" +
		"\x02\x02\u03CC\u03CE\x05\u0100\x81\x02\u03CD\u03BB\x03\x02\x02\x02\u03CD" +
		"\u03C6\x03\x02\x02\x02\u03CD\u03CC\x03\x02\x02\x02\u03CE\xE5\x03\x02\x02" +
		"\x02\u03CF\u03D7\x05\x86D\x02\u03D0\u03D7\x05\xFE\x80\x02\u03D1\u03D7" +
		"\x05\xFC\x7F\x02\u03D2\u03D7\x05\x80A\x02\u03D3\u03D7\x05\x9AN\x02\u03D4" +
		"\u03D7\x05\xEAv\x02\u03D5\u03D7\x05\x84C\x02\u03D6\u03CF\x03\x02\x02\x02" +
		"\u03D6\u03D0\x03\x02\x02\x02\u03D6\u03D1\x03\x02\x02\x02\u03D6\u03D2\x03" +
		"\x02\x02\x02\u03D6\u03D3\x03\x02\x02\x02\u03D6\u03D4\x03\x02\x02\x02\u03D6" +
		"\u03D5\x03\x02\x02\x02\u03D7\xE7\x03\x02\x02\x02\u03D8\u03D9\x077\x02" +
		"\x02\u03D9\u03DA\x05\xEAv\x02\u03DA\u03DB\x07>\x02\x02\u03DB\u03DC\x05" +
		"\xF0y\x02\u03DC\u03DD\x078\x02\x02\u03DD\xE9\x03\x02\x02\x02\u03DE\u03DF" +
		"\x079\x02\x02\u03DF\u03E4\x05\xE6t\x02\u03E0\u03E1\x074\x02\x02\u03E1" +
		"\u03E3\x05\xE6t\x02\u03E2\u03E0\x03\x02\x02\x02\u03E3\u03E6\x03\x02\x02" +
		"\x02\u03E4\u03E2\x03\x02\x02\x02\u03E4\u03E5\x03\x02\x02\x02\u03E5\u03E7" +
		"\x03\x02\x02\x02\u03E6\u03E4\x03\x02\x02\x02\u03E7\u03E8\x07:\x02\x02" +
		"\u03E8\u03EB\x03\x02\x02\x02\u03E9\u03EB\x05\u0102\x82\x02\u03EA\u03DE" +
		"\x03\x02\x02\x02\u03EA\u03E9\x03\x02\x02\x02\u03EB\xEB\x03\x02\x02\x02" +
		"\u03EC\u03ED\x079\x02\x02\u03ED\u03F2\x05\x88E\x02\u03EE\u03EF\x074\x02" +
		"\x02\u03EF\u03F1\x05\x88E\x02\u03F0\u03EE\x03\x02\x02\x02\u03F1\u03F4" +
		"\x03\x02\x02\x02\u03F2\u03F0\x03\x02\x02\x02\u03F2\u03F3\x03\x02\x02\x02" +
		"\u03F3\u03F5\x03\x02\x02\x02\u03F4\u03F2\x03\x02\x02\x02\u03F5\u03F6\x07" +
		":\x02\x02\u03F6\u03F9\x03\x02\x02\x02\u03F7\u03F9\x05\u0102\x82\x02\u03F8" +
		"\u03EC\x03\x02\x02\x02\u03F8\u03F7\x03\x02\x02\x02\u03F9\xED\x03\x02\x02" +
		"\x02\u03FA\u03FB\x079\x02\x02\u03FB\u0400\x05\x8AF\x02\u03FC\u03FD\x07" +
		"4\x02\x02\u03FD\u03FF\x05\x8AF\x02\u03FE\u03FC\x03\x02\x02\x02\u03FF\u0402" +
		"\x03\x02\x02\x02\u0400\u03FE\x03\x02\x02\x02\u0400\u0401\x03\x02\x02\x02" +
		"\u0401\u0403\x03\x02\x02\x02\u0402\u0400\x03\x02\x02\x02\u0403\u0404\x07" +
		":\x02\x02\u0404\u0407\x03\x02\x02\x02\u0405\u0407\x05\u0102\x82\x02\u0406" +
		"\u03FA\x03\x02\x02\x02\u0406\u0405\x03\x02\x02\x02\u0407\xEF\x03\x02\x02" +
		"\x02\u0408\u040D\x05\xF2z\x02\u0409\u040A\t\x02\x02\x02\u040A\u040C\x05" +
		"\xF2z\x02\u040B\u0409\x03\x02\x02\x02\u040C\u040F\x03\x02\x02\x02\u040D" +
		"\u040B\x03\x02\x02\x02\u040D\u040E\x03\x02\x02\x02\u040E\xF1\x03\x02\x02" +
		"\x02\u040F\u040D\x03\x02\x02\x02\u0410\u0414\x05\xF4{\x02\u0411\u0414" +
		"\x05\xF6|\x02\u0412\u0414\x05\xF8}\x02\u0413\u0410\x03\x02\x02\x02\u0413" +
		"\u0411\x03\x02\x02\x02\u0413\u0412\x03\x02\x02\x02\u0414\xF3\x03\x02\x02" +
		"\x02\u0415\u0416\x05\xE6t\x02\u0416\u0417\x05\u010C\x87\x02\u0417\u0418" +
		"\x05\xD2j\x02\u0418\u041E\x03\x02\x02\x02\u0419\u041A\x05\xE4s\x02\u041A" +
		"\u041B\x05\u010C\x87\x02\u041B\u041C\x05\xD2j\x02\u041C\u041E\x03\x02" +
		"\x02\x02\u041D\u0415\x03\x02\x02\x02\u041D\u0419\x03\x02\x02\x02\u041E" +
		"\xF5\x03\x02\x02\x02\u041F\u0420\x05\xE6t\x02\u0420\u0421\x05\u010C\x87" +
		"\x02\u0421\u0422\x05\xD8m\x02\u0422\u0428\x03\x02\x02\x02\u0423\u0424" +
		"\x05\xE4s\x02\u0424\u0425\x05\u010C\x87\x02\u0425\u0426\x05\xD8m\x02\u0426" +
		"\u0428\x03\x02\x02\x02\u0427\u041F\x03\x02\x02\x02\u0427\u0423\x03\x02" +
		"\x02\x02\u0428\xF7\x03\x02\x02\x02\u0429\u042A\x05\xE6t\x02\u042A\u042B" +
		"\x05\u010C\x87\x02\u042B\u042C\x05\xFA~\x02\u042C\u0432\x03\x02\x02\x02" +
		"\u042D\u042E\x05\xE4s\x02\u042E\u042F\x05\u010C\x87\x02\u042F\u0430\x05" +
		"\xFA~\x02\u0430\u0432\x03\x02\x02\x02\u0431\u0429\x03\x02\x02\x02\u0431" +
		"\u042D\x03\x02\x02\x02\u0432\xF9\x03\x02\x02\x02\u0433\u0434\t\x05\x02" +
		"\x02\u0434\u0435\x05\xFE\x80\x02\u0435\u0438\x074\x02\x02\u0436\u0439" +
		"\x05\xFE\x80\x02\u0437\u0439\x05\x98M\x02\u0438\u0436\x03\x02\x02\x02" +
		"\u0438\u0437\x03\x02\x02\x02\u0439\u043A\x03\x02\x02\x02\u043A\u043B\t" +
		"\x06\x02\x02\u043B\xFB\x03\x02\x02\x02\u043C\u043F\x05\x90I\x02\u043D" +
		"\u043F\x05\x92J\x02\u043E\u043C\x03\x02\x02\x02\u043E\u043D\x03\x02\x02" +
		"\x02\u043F\xFD\x03\x02\x02\x02\u0440\u0443\x05\x94K\x02\u0441\u0443\x05" +
		"\x96L\x02\u0442\u0440\x03\x02\x02\x02\u0442\u0441\x03\x02\x02\x02\u0443" +
		"\xFF\x03\x02\x02\x02\u0444\u0445\x07\t\x02\x02\u0445\u0101\x03\x02\x02" +
		"\x02\u0446\u0447\x07\n\x02\x02\u0447\u0103\x03\x02\x02\x02\u0448\u044E" +
		"\x05\u0106\x84\x02\u0449\u044A\x05\u0112\x8A\x02\u044A\u044B\x05\u0106" +
		"\x84\x02\u044B\u044D\x03\x02\x02\x02\u044C\u0449\x03\x02\x02\x02\u044D" +
		"\u0450\x03\x02\x02\x02\u044E\u044C\x03\x02\x02\x02\u044E\u044F\x03\x02" +
		"\x02\x02\u044F\u0105\x03\x02\x02\x02\u0450\u044E\x03\x02\x02\x02\u0451" +
		"\u0454\x05\u010A\x86\x02\u0452\u0454\x05\u0108\x85\x02\u0453\u0451\x03" +
		"\x02\x02\x02\u0453\u0452\x03\x02\x02\x02\u0454\u0107\x03\x02\x02\x02\u0455" +
		"\u0456\x079\x02\x02\u0456\u0457\x05\u0104\x83\x02\u0457\u0458\x07:\x02" +
		"\x02\u0458\u0109\x03\x02\x02\x02\u0459\u045C\x05\xD6l\x02\u045A\u045C" +
		"\x05\xD8m\x02\u045B\u0459\x03\x02\x02\x02\u045B\u045A\x03\x02\x02\x02" +
		"\u045C\u010B\x03\x02\x02\x02\u045D\u0460\x05\u010E\x88\x02\u045E\u0460" +
		"\x05\u0110\x89\x02\u045F\u045D\x03\x02\x02\x02\u045F\u045E\x03\x02\x02" +
		"\x02\u0460\u010D\x03\x02\x02\x02\u0461\u0462\x07\x1D\x02\x02\u0462\u010F" +
		"\x03\x02\x02\x02\u0463\u0464\x07\x1E\x02\x02\u0464\u0111\x03\x02\x02\x02" +
		"\u0465\u046A\x05\u0114\x8B\x02\u0466\u046A\x05\u0116\x8C\x02\u0467\u046A" +
		"\x05\u0118\x8D\x02\u0468\u046A\x05\u011A\x8E\x02\u0469\u0465\x03\x02\x02" +
		"\x02\u0469\u0466\x03\x02\x02\x02\u0469\u0467\x03\x02\x02\x02\u0469\u0468" +
		"\x03\x02\x02\x02\u046A\u0113\x03\x02\x02\x02\u046B\u046C\x07\x1F\x02\x02" +
		"\u046C\u0115\x03\x02\x02\x02\u046D\u046E\x07 \x02\x02\u046E\u0117\x03" +
		"\x02\x02\x02\u046F\u0470\x07!\x02\x02\u0470\u0119\x03\x02\x02\x02\u0471" +
		"\u0472\x07\"\x02\x02\u0472\u011B\x03\x02\x02\x02\u0473\u0476\x05\u011E" +
		"\x90\x02\u0474\u0476\x05\u0120\x91\x02\u0475\u0473\x03\x02\x02\x02\u0475" +
		"\u0474\x03\x02\x02\x02\u0476\u011D\x03\x02\x02\x02\u0477\u0478\x05\u0120" +
		"\x91\x02\u0478\u0479\x05\u0130\x99\x02\u0479\u047A\x05\u0120\x91\x02\u047A" +
		"\u011F\x03\x02\x02\x02\u047B\u047E\x05\u0124\x93\x02\u047C\u047E\x05\u0122" +
		"\x92\x02\u047D\u047B\x03\x02\x02\x02\u047D\u047C\x03\x02\x02\x02\u047E" +
		"\u0121\x03\x02\x02\x02\u047F\u0480\x05\u012E\x98\x02\u0480\u0481\x05\u0120" +
		"\x91\x02\u0481\u0123\x03\x02\x02\x02\u0482\u0488\x05\u0126\x94\x02\u0483" +
		"\u0484\x05\u0132\x9A\x02\u0484\u0485\x05\u0126\x94\x02\u0485\u0487\x03" +
		"\x02\x02\x02\u0486\u0483\x03\x02\x02\x02\u0487\u048A\x03\x02\x02\x02\u0488" +
		"\u0486\x03\x02\x02\x02\u0488\u0489\x03\x02\x02\x02\u0489\u0125\x03\x02" +
		"\x02\x02\u048A\u0488\x03\x02\x02\x02\u048B\u0491\x05\u0128\x95\x02\u048C" +
		"\u048D\x05\u013E\xA0\x02\u048D\u048E\x05\u0128\x95\x02\u048E\u0490\x03" +
		"\x02\x02\x02\u048F\u048C\x03\x02\x02\x02\u0490\u0493\x03\x02\x02\x02\u0491" +
		"\u048F\x03\x02\x02\x02\u0491\u0492\x03\x02\x02\x02\u0492\u0127\x03\x02" +
		"\x02\x02\u0493\u0491\x03\x02\x02\x02\u0494\u0497\x05\u012A\x96\x02\u0495" +
		"\u0497\x05\u012C\x97\x02\u0496\u0494\x03\x02\x02\x02\u0496\u0495\x03\x02" +
		"\x02\x02\u0497\u0129\x03\x02\x02\x02\u0498\u0499\x05\xE6t\x02\u0499\u012B" +
		"\x03\x02\x02\x02\u049A\u049B\x079\x02\x02\u049B\u049C\x05\u011C\x8F\x02" +
		"\u049C\u049D\x07:\x02\x02\u049D\u012D\x03\x02\x02\x02\u049E\u049F\x05" +
		"\u0134\x9B\x02\u049F\u012F\x03\x02\x02\x02\u04A0\u04A3\x05\u0136\x9C\x02" +
		"\u04A1\u04A3\x05\u0138\x9D\x02\u04A2\u04A0\x03\x02\x02\x02\u04A2\u04A1" +
		"\x03\x02\x02\x02\u04A3\u0131\x03\x02\x02\x02\u04A4\u04A7\x05\u013A\x9E" +
		"\x02\u04A5\u04A7\x05\u013C\x9F\x02\u04A6\u04A4\x03\x02\x02\x02\u04A6\u04A5" +
		"\x03\x02\x02\x02\u04A7\u0133\x03\x02\x02\x02\u04A8\u04A9\x07,\x02\x02" +
		"\u04A9\u0135\x03\x02\x02\x02\u04AA\u04AB\x07-\x02\x02\u04AB\u0137\x03" +
		"\x02\x02\x02\u04AC\u04AD\x07.\x02\x02\u04AD\u0139\x03\x02\x02\x02\u04AE" +
		"\u04AF\x07/\x02\x02\u04AF\u013B\x03\x02\x02\x02\u04B0\u04B1\x070\x02\x02" +
		"\u04B1\u013D\x03\x02\x02\x02\u04B2\u04B3\x071\x02\x02\u04B3\u013F\x03" +
		"\x02\x02\x02Z\u0143\u0149\u014D\u0182\u0187\u018E\u01C6\u01CD\u01D6\u01DD" +
		"\u01EB\u01F2\u01FA\u0203\u0210\u0217\u021F\u0228\u0233\u023C\u0242\u0249" +
		"\u0252\u0259\u0267\u026E\u0277\u027E\u0288\u028F\u0298\u029F\u02AD\u02B4" +
		"\u02C3\u02CA\u02D3\u02E8\u02EF\u02F8\u0307\u030E\u0317\u032E\u0339\u0345" +
		"\u0349\u0351\u0356\u0361\u0366\u036B\u0374\u037E\u0386\u039C\u03A0\u03A8" +
		"\u03AF\u03C1\u03CD\u03D6\u03E4\u03EA\u03F2\u03F8\u0400\u0406\u040D\u0413" +
		"\u041D\u0427\u0431\u0438\u043E\u0442\u044E\u0453\u045B\u045F\u0469\u0475" +
		"\u047D\u0488\u0491\u0496";
	private static readonly _serializedATNSegment2: string =
		"\u04A2\u04A6";
	public static readonly _serializedATN: string = Utils.join(
		[
			CFG_DEVS_MODELParser._serializedATNSegment0,
			CFG_DEVS_MODELParser._serializedATNSegment1,
			CFG_DEVS_MODELParser._serializedATNSegment2,
		],
		"",
	);
	public static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!CFG_DEVS_MODELParser.__ATN) {
			CFG_DEVS_MODELParser.__ATN = new ATNDeserializer().deserialize(Utils.toCharArray(CFG_DEVS_MODELParser._serializedATN));
		}

		return CFG_DEVS_MODELParser.__ATN;
	}

}

export class DevsSpecificationContext extends ParserRuleContext {
	public _devsModel!: DevsModelContext;
	public _models: DevsModelContext[] = [];
	public EOF(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EOF, 0); }
	public devsModel(): DevsModelContext[];
	public devsModel(i: number): DevsModelContext;
	public devsModel(i?: number): DevsModelContext | DevsModelContext[] {
		if (i === undefined) {
			return this.getRuleContexts(DevsModelContext);
		} else {
			return this.getRuleContext(i, DevsModelContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_devsSpecification; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDevsSpecification) {
			listener.enterDevsSpecification(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDevsSpecification) {
			listener.exitDevsSpecification(this);
		}
	}
}


export class DevsModelContext extends ParserRuleContext {
	public atomicModel(): AtomicModelContext | undefined {
		return this.tryGetRuleContext(0, AtomicModelContext);
	}
	public coupledModel(): CoupledModelContext | undefined {
		return this.tryGetRuleContext(0, CoupledModelContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_devsModel; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDevsModel) {
			listener.enterDevsModel(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDevsModel) {
			listener.exitDevsModel(this);
		}
	}
}


export class SetInModelContext extends ParserRuleContext {
	public setImplicitDefinition(): SetImplicitDefinitionContext | undefined {
		return this.tryGetRuleContext(0, SetImplicitDefinitionContext);
	}
	public setSymbol(): SetSymbolContext | undefined {
		return this.tryGetRuleContext(0, SetSymbolContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setInModel; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetInModel) {
			listener.enterSetInModel(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetInModel) {
			listener.exitSetInModel(this);
		}
	}
}


export class AtomicModelContext extends ParserRuleContext {
	public _sig!: ModelSignatureContext;
	public _modelTuple!: AtomicModelTupleContext;
	public _def!: ModelDefinitionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public WHERESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.WHERESYMBOL, 0); }
	public modelSignature(): ModelSignatureContext {
		return this.getRuleContext(0, ModelSignatureContext);
	}
	public atomicModelTuple(): AtomicModelTupleContext {
		return this.getRuleContext(0, AtomicModelTupleContext);
	}
	public modelDefinition(): ModelDefinitionContext {
		return this.getRuleContext(0, ModelDefinitionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_atomicModel; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAtomicModel) {
			listener.enterAtomicModel(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAtomicModel) {
			listener.exitAtomicModel(this);
		}
	}
}


export class AtomicModelTupleContext extends ParserRuleContext {
	public _input!: SetInModelContext;
	public _output!: SetInModelContext;
	public _state!: SetInModelContext;
	public _deltaExtName!: Token;
	public _deltaIntName!: Token;
	public _lambdaName!: Token;
	public _taName!: Token;
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public setInModel(): SetInModelContext[];
	public setInModel(i: number): SetInModelContext;
	public setInModel(i?: number): SetInModelContext | SetInModelContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SetInModelContext);
		} else {
			return this.getRuleContext(i, SetInModelContext);
		}
	}
	public DELTAEXTNAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.DELTAEXTNAMESYMBOL, 0); }
	public DELTAINTNAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.DELTAINTNAMESYMBOL, 0); }
	public LAMBDANAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.LAMBDANAMESYMBOL, 0); }
	public TANAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.TANAMESYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_atomicModelTuple; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAtomicModelTuple) {
			listener.enterAtomicModelTuple(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAtomicModelTuple) {
			listener.exitAtomicModelTuple(this);
		}
	}
}


export class CoupledModelContext extends ParserRuleContext {
	public _sig!: ModelSignatureContext;
	public _modelTuple!: CoupledModelTupleContext;
	public _def!: ModelDefinitionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public WHERESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.WHERESYMBOL, 0); }
	public modelSignature(): ModelSignatureContext {
		return this.getRuleContext(0, ModelSignatureContext);
	}
	public coupledModelTuple(): CoupledModelTupleContext {
		return this.getRuleContext(0, CoupledModelTupleContext);
	}
	public modelDefinition(): ModelDefinitionContext {
		return this.getRuleContext(0, ModelDefinitionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_coupledModel; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterCoupledModel) {
			listener.enterCoupledModel(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitCoupledModel) {
			listener.exitCoupledModel(this);
		}
	}
}


export class CoupledModelTupleContext extends ParserRuleContext {
	public _input!: SetInModelContext;
	public _output!: SetInModelContext;
	public _state!: SetInModelContext;
	public _components!: SetInModelContext;
	public _eic!: SetInModelContext;
	public _eoc!: SetInModelContext;
	public _ic!: SetInModelContext;
	public _selectName!: Token;
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public setInModel(): SetInModelContext[];
	public setInModel(i: number): SetInModelContext;
	public setInModel(i?: number): SetInModelContext | SetInModelContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SetInModelContext);
		} else {
			return this.getRuleContext(i, SetInModelContext);
		}
	}
	public SELECTNAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SELECTNAMESYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_coupledModelTuple; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterCoupledModelTuple) {
			listener.enterCoupledModelTuple(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitCoupledModelTuple) {
			listener.exitCoupledModelTuple(this);
		}
	}
}


export class ModelDefinitionContext extends ParserRuleContext {
	public _modelSentence!: ModelSentenceContext;
	public _sentences: ModelSentenceContext[] = [];
	public modelSentence(): ModelSentenceContext[];
	public modelSentence(i: number): ModelSentenceContext;
	public modelSentence(i?: number): ModelSentenceContext | ModelSentenceContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ModelSentenceContext);
		} else {
			return this.getRuleContext(i, ModelSentenceContext);
		}
	}
	public SEMICOLON(): TerminalNode[];
	public SEMICOLON(i: number): TerminalNode;
	public SEMICOLON(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.SEMICOLON);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.SEMICOLON, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_modelDefinition; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterModelDefinition) {
			listener.enterModelDefinition(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitModelDefinition) {
			listener.exitModelDefinition(this);
		}
	}
}


export class ModelSentenceContext extends ParserRuleContext {
	public setExplicitDefinition(): SetExplicitDefinitionContext | undefined {
		return this.tryGetRuleContext(0, SetExplicitDefinitionContext);
	}
	public function(): FunctionContext | undefined {
		return this.tryGetRuleContext(0, FunctionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_modelSentence; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterModelSentence) {
			listener.enterModelSentence(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitModelSentence) {
			listener.exitModelSentence(this);
		}
	}
}


export class FunctionContext extends ParserRuleContext {
	public delExtFunction(): DelExtFunctionContext | undefined {
		return this.tryGetRuleContext(0, DelExtFunctionContext);
	}
	public delIntFunction(): DelIntFunctionContext | undefined {
		return this.tryGetRuleContext(0, DelIntFunctionContext);
	}
	public lambdaFunction(): LambdaFunctionContext | undefined {
		return this.tryGetRuleContext(0, LambdaFunctionContext);
	}
	public taFunction(): TaFunctionContext | undefined {
		return this.tryGetRuleContext(0, TaFunctionContext);
	}
	public selectFunction(): SelectFunctionContext | undefined {
		return this.tryGetRuleContext(0, SelectFunctionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_function; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunction) {
			listener.enterFunction(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunction) {
			listener.exitFunction(this);
		}
	}
}


export class DelExtFunctionContext extends ParserRuleContext {
	public _name!: DelExtFunctionNameContext;
	public _body!: FunctionDescriptionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public delExtFunctionName(): DelExtFunctionNameContext {
		return this.getRuleContext(0, DelExtFunctionNameContext);
	}
	public functionDescription(): FunctionDescriptionContext {
		return this.getRuleContext(0, FunctionDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_delExtFunction; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDelExtFunction) {
			listener.enterDelExtFunction(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDelExtFunction) {
			listener.exitDelExtFunction(this);
		}
	}
}


export class DelExtFunctionNameContext extends ParserRuleContext {
	public _stateTuple!: TupleContext;
	public _elapsed!: ElementContext;
	public _inputTuple!: TupleContext;
	public DELTAEXTNAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.DELTAEXTNAMESYMBOL, 0); }
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public tuple(): TupleContext[];
	public tuple(i: number): TupleContext;
	public tuple(i?: number): TupleContext | TupleContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TupleContext);
		} else {
			return this.getRuleContext(i, TupleContext);
		}
	}
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_delExtFunctionName; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDelExtFunctionName) {
			listener.enterDelExtFunctionName(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDelExtFunctionName) {
			listener.exitDelExtFunctionName(this);
		}
	}
}


export class DelIntFunctionContext extends ParserRuleContext {
	public _name!: DelIntFunctionNameContext;
	public _body!: FunctionDescriptionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public delIntFunctionName(): DelIntFunctionNameContext {
		return this.getRuleContext(0, DelIntFunctionNameContext);
	}
	public functionDescription(): FunctionDescriptionContext {
		return this.getRuleContext(0, FunctionDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_delIntFunction; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDelIntFunction) {
			listener.enterDelIntFunction(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDelIntFunction) {
			listener.exitDelIntFunction(this);
		}
	}
}


export class DelIntFunctionNameContext extends ParserRuleContext {
	public _stateTuple!: TupleContext;
	public DELTAINTNAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.DELTAINTNAMESYMBOL, 0); }
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public tuple(): TupleContext {
		return this.getRuleContext(0, TupleContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_delIntFunctionName; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDelIntFunctionName) {
			listener.enterDelIntFunctionName(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDelIntFunctionName) {
			listener.exitDelIntFunctionName(this);
		}
	}
}


export class LambdaFunctionContext extends ParserRuleContext {
	public _name!: LambdaFunctionNameContext;
	public _body!: FunctionDescriptionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public lambdaFunctionName(): LambdaFunctionNameContext {
		return this.getRuleContext(0, LambdaFunctionNameContext);
	}
	public functionDescription(): FunctionDescriptionContext {
		return this.getRuleContext(0, FunctionDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_lambdaFunction; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterLambdaFunction) {
			listener.enterLambdaFunction(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitLambdaFunction) {
			listener.exitLambdaFunction(this);
		}
	}
}


export class LambdaFunctionNameContext extends ParserRuleContext {
	public _stateTuple!: TupleContext;
	public LAMBDANAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.LAMBDANAMESYMBOL, 0); }
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public tuple(): TupleContext {
		return this.getRuleContext(0, TupleContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_lambdaFunctionName; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterLambdaFunctionName) {
			listener.enterLambdaFunctionName(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitLambdaFunctionName) {
			listener.exitLambdaFunctionName(this);
		}
	}
}


export class TaFunctionContext extends ParserRuleContext {
	public _name!: TaFunctionNameContext;
	public _body!: TaFunctionDescriptionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public taFunctionName(): TaFunctionNameContext {
		return this.getRuleContext(0, TaFunctionNameContext);
	}
	public taFunctionDescription(): TaFunctionDescriptionContext {
		return this.getRuleContext(0, TaFunctionDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunction; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunction) {
			listener.enterTaFunction(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunction) {
			listener.exitTaFunction(this);
		}
	}
}


export class TaFunctionNameContext extends ParserRuleContext {
	public _stateTuple!: TupleContext;
	public TANAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.TANAMESYMBOL, 0); }
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public tuple(): TupleContext {
		return this.getRuleContext(0, TupleContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunctionName; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionName) {
			listener.enterTaFunctionName(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionName) {
			listener.exitTaFunctionName(this);
		}
	}
}


export class SelectFunctionContext extends ParserRuleContext {
	public _name!: SelectFunctionNameContext;
	public _body!: SelectFunctionDescriptionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public selectFunctionName(): SelectFunctionNameContext {
		return this.getRuleContext(0, SelectFunctionNameContext);
	}
	public selectFunctionDescription(): SelectFunctionDescriptionContext {
		return this.getRuleContext(0, SelectFunctionDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunction; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunction) {
			listener.enterSelectFunction(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunction) {
			listener.exitSelectFunction(this);
		}
	}
}


export class SelectFunctionNameContext extends ParserRuleContext {
	public _setSym!: SetSymbolContext;
	public SELECTNAMESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SELECTNAMESYMBOL, 0); }
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public setSymbol(): SetSymbolContext {
		return this.getRuleContext(0, SetSymbolContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunctionName; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionName) {
			listener.enterSelectFunctionName(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionName) {
			listener.exitSelectFunctionName(this);
		}
	}
}


export class FunctionDescriptionContext extends ParserRuleContext {
	public tupleValue(): TupleValueContext | undefined {
		return this.tryGetRuleContext(0, TupleValueContext);
	}
	public functionDescriptionPreIf(): FunctionDescriptionPreIfContext | undefined {
		return this.tryGetRuleContext(0, FunctionDescriptionPreIfContext);
	}
	public functionDescriptionPostIf(): FunctionDescriptionPostIfContext | undefined {
		return this.tryGetRuleContext(0, FunctionDescriptionPostIfContext);
	}
	public functionGenericDescription(): FunctionGenericDescriptionContext | undefined {
		return this.tryGetRuleContext(0, FunctionGenericDescriptionContext);
	}
	public functionGenericValuesDescription(): FunctionGenericValuesDescriptionContext | undefined {
		return this.tryGetRuleContext(0, FunctionGenericValuesDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionDescription; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionDescription) {
			listener.enterFunctionDescription(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionDescription) {
			listener.exitFunctionDescription(this);
		}
	}
}


export class FunctionDescriptionPreIfContext extends ParserRuleContext {
	public functionPreIfResult(): FunctionPreIfResultContext[];
	public functionPreIfResult(i: number): FunctionPreIfResultContext;
	public functionPreIfResult(i?: number): FunctionPreIfResultContext | FunctionPreIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FunctionPreIfResultContext);
		} else {
			return this.getRuleContext(i, FunctionPreIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionDescriptionPreIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionDescriptionPreIf) {
			listener.enterFunctionDescriptionPreIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionDescriptionPreIf) {
			listener.exitFunctionDescriptionPreIf(this);
		}
	}
}


export class FunctionPreIfResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionPreIfResult; }
	public copyFrom(ctx: FunctionPreIfResultContext): void {
		super.copyFrom(ctx);
	}
}
export class FunctionPreIfConditionalResultContext extends FunctionPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public _result!: TupleValueContext;
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	public tupleValue(): TupleValueContext {
		return this.getRuleContext(0, TupleValueContext);
	}
	constructor(ctx: FunctionPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionPreIfConditionalResult) {
			listener.enterFunctionPreIfConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionPreIfConditionalResult) {
			listener.exitFunctionPreIfConditionalResult(this);
		}
	}
}
export class FunctionPreIfDefaultResultContext extends FunctionPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public _result!: TupleValueContext;
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	public tupleValue(): TupleValueContext {
		return this.getRuleContext(0, TupleValueContext);
	}
	constructor(ctx: FunctionPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionPreIfDefaultResult) {
			listener.enterFunctionPreIfDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionPreIfDefaultResult) {
			listener.exitFunctionPreIfDefaultResult(this);
		}
	}
}


export class FunctionDescriptionPostIfContext extends ParserRuleContext {
	public functionPostIfResult(): FunctionPostIfResultContext[];
	public functionPostIfResult(i: number): FunctionPostIfResultContext;
	public functionPostIfResult(i?: number): FunctionPostIfResultContext | FunctionPostIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FunctionPostIfResultContext);
		} else {
			return this.getRuleContext(i, FunctionPostIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionDescriptionPostIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionDescriptionPostIf) {
			listener.enterFunctionDescriptionPostIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionDescriptionPostIf) {
			listener.exitFunctionDescriptionPostIf(this);
		}
	}
}


export class FunctionPostIfResultContext extends ParserRuleContext {
	public _result!: TupleValueContext;
	public _cond!: IfConditionContext;
	public tupleValue(): TupleValueContext {
		return this.getRuleContext(0, TupleValueContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionPostIfResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionPostIfResult) {
			listener.enterFunctionPostIfResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionPostIfResult) {
			listener.exitFunctionPostIfResult(this);
		}
	}
}


export class FunctionGenericDescriptionContext extends ParserRuleContext {
	public _vars!: VariableTupleContext;
	public COMMA(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.COMMA, 0); }
	public functionDescriptionAssignmentPreIf(): FunctionDescriptionAssignmentPreIfContext | undefined {
		return this.tryGetRuleContext(0, FunctionDescriptionAssignmentPreIfContext);
	}
	public variableTuple(): VariableTupleContext {
		return this.getRuleContext(0, VariableTupleContext);
	}
	public functionDescriptionAssignmentPostIf(): FunctionDescriptionAssignmentPostIfContext | undefined {
		return this.tryGetRuleContext(0, FunctionDescriptionAssignmentPostIfContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionGenericDescription; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionGenericDescription) {
			listener.enterFunctionGenericDescription(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionGenericDescription) {
			listener.exitFunctionGenericDescription(this);
		}
	}
}


export class FunctionDescriptionAssignmentPreIfContext extends ParserRuleContext {
	public functionAssignPreIfResult(): FunctionAssignPreIfResultContext[];
	public functionAssignPreIfResult(i: number): FunctionAssignPreIfResultContext;
	public functionAssignPreIfResult(i?: number): FunctionAssignPreIfResultContext | FunctionAssignPreIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FunctionAssignPreIfResultContext);
		} else {
			return this.getRuleContext(i, FunctionAssignPreIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionDescriptionAssignmentPreIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionDescriptionAssignmentPreIf) {
			listener.enterFunctionDescriptionAssignmentPreIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionDescriptionAssignmentPreIf) {
			listener.exitFunctionDescriptionAssignmentPreIf(this);
		}
	}
}


export class FunctionDescriptionAssignmentPostIfContext extends ParserRuleContext {
	public functionAssignPostIfResult(): FunctionAssignPostIfResultContext[];
	public functionAssignPostIfResult(i: number): FunctionAssignPostIfResultContext;
	public functionAssignPostIfResult(i?: number): FunctionAssignPostIfResultContext | FunctionAssignPostIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FunctionAssignPostIfResultContext);
		} else {
			return this.getRuleContext(i, FunctionAssignPostIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionDescriptionAssignmentPostIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionDescriptionAssignmentPostIf) {
			listener.enterFunctionDescriptionAssignmentPostIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionDescriptionAssignmentPostIf) {
			listener.exitFunctionDescriptionAssignmentPostIf(this);
		}
	}
}


export class FunctionAssignPreIfResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionAssignPreIfResult; }
	public copyFrom(ctx: FunctionAssignPreIfResultContext): void {
		super.copyFrom(ctx);
	}
}
export class FunctionAssignPreIfConditionalResultContext extends FunctionAssignPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public assignTuple(): AssignTupleContext {
		return this.getRuleContext(0, AssignTupleContext);
	}
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	constructor(ctx: FunctionAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionAssignPreIfConditionalResult) {
			listener.enterFunctionAssignPreIfConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionAssignPreIfConditionalResult) {
			listener.exitFunctionAssignPreIfConditionalResult(this);
		}
	}
}
export class FunctionAssignPreIfDefaultResultContext extends FunctionAssignPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public assignTuple(): AssignTupleContext {
		return this.getRuleContext(0, AssignTupleContext);
	}
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	constructor(ctx: FunctionAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionAssignPreIfDefaultResult) {
			listener.enterFunctionAssignPreIfDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionAssignPreIfDefaultResult) {
			listener.exitFunctionAssignPreIfDefaultResult(this);
		}
	}
}


export class FunctionAssignPostIfResultContext extends ParserRuleContext {
	public _cond!: IfConditionContext;
	public assignTuple(): AssignTupleContext {
		return this.getRuleContext(0, AssignTupleContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionAssignPostIfResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionAssignPostIfResult) {
			listener.enterFunctionAssignPostIfResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionAssignPostIfResult) {
			listener.exitFunctionAssignPostIfResult(this);
		}
	}
}


export class FunctionGenericValuesDescriptionContext extends ParserRuleContext {
	public _vars!: VariableTupleFixedValuesContext;
	public COMMA(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.COMMA, 0); }
	public functionDescriptionValuesAssignmentPreIf(): FunctionDescriptionValuesAssignmentPreIfContext | undefined {
		return this.tryGetRuleContext(0, FunctionDescriptionValuesAssignmentPreIfContext);
	}
	public variableTupleFixedValues(): VariableTupleFixedValuesContext {
		return this.getRuleContext(0, VariableTupleFixedValuesContext);
	}
	public functionDescriptionValuesAssignmentPostIf(): FunctionDescriptionValuesAssignmentPostIfContext | undefined {
		return this.tryGetRuleContext(0, FunctionDescriptionValuesAssignmentPostIfContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionGenericValuesDescription; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionGenericValuesDescription) {
			listener.enterFunctionGenericValuesDescription(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionGenericValuesDescription) {
			listener.exitFunctionGenericValuesDescription(this);
		}
	}
}


export class FunctionDescriptionValuesAssignmentPreIfContext extends ParserRuleContext {
	public functionValuesAssignPreIfResult(): FunctionValuesAssignPreIfResultContext[];
	public functionValuesAssignPreIfResult(i: number): FunctionValuesAssignPreIfResultContext;
	public functionValuesAssignPreIfResult(i?: number): FunctionValuesAssignPreIfResultContext | FunctionValuesAssignPreIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FunctionValuesAssignPreIfResultContext);
		} else {
			return this.getRuleContext(i, FunctionValuesAssignPreIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionDescriptionValuesAssignmentPreIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionDescriptionValuesAssignmentPreIf) {
			listener.enterFunctionDescriptionValuesAssignmentPreIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionDescriptionValuesAssignmentPreIf) {
			listener.exitFunctionDescriptionValuesAssignmentPreIf(this);
		}
	}
}


export class FunctionDescriptionValuesAssignmentPostIfContext extends ParserRuleContext {
	public functionValuesAssignPostIfResult(): FunctionValuesAssignPostIfResultContext[];
	public functionValuesAssignPostIfResult(i: number): FunctionValuesAssignPostIfResultContext;
	public functionValuesAssignPostIfResult(i?: number): FunctionValuesAssignPostIfResultContext | FunctionValuesAssignPostIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(FunctionValuesAssignPostIfResultContext);
		} else {
			return this.getRuleContext(i, FunctionValuesAssignPostIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionDescriptionValuesAssignmentPostIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionDescriptionValuesAssignmentPostIf) {
			listener.enterFunctionDescriptionValuesAssignmentPostIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionDescriptionValuesAssignmentPostIf) {
			listener.exitFunctionDescriptionValuesAssignmentPostIf(this);
		}
	}
}


export class FunctionValuesAssignPreIfResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionValuesAssignPreIfResult; }
	public copyFrom(ctx: FunctionValuesAssignPreIfResultContext): void {
		super.copyFrom(ctx);
	}
}
export class FunctionValuesAssignPreIfConditionalResultContext extends FunctionValuesAssignPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public assignmentsList(): AssignmentsListContext {
		return this.getRuleContext(0, AssignmentsListContext);
	}
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	constructor(ctx: FunctionValuesAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionValuesAssignPreIfConditionalResult) {
			listener.enterFunctionValuesAssignPreIfConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionValuesAssignPreIfConditionalResult) {
			listener.exitFunctionValuesAssignPreIfConditionalResult(this);
		}
	}
}
export class FunctionValuesAssignPreIfDefaultResultContext extends FunctionValuesAssignPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public assignmentsList(): AssignmentsListContext {
		return this.getRuleContext(0, AssignmentsListContext);
	}
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	constructor(ctx: FunctionValuesAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionValuesAssignPreIfDefaultResult) {
			listener.enterFunctionValuesAssignPreIfDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionValuesAssignPreIfDefaultResult) {
			listener.exitFunctionValuesAssignPreIfDefaultResult(this);
		}
	}
}


export class FunctionValuesAssignPostIfResultContext extends ParserRuleContext {
	public _cond!: IfConditionContext;
	public assignmentsList(): AssignmentsListContext {
		return this.getRuleContext(0, AssignmentsListContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_functionValuesAssignPostIfResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFunctionValuesAssignPostIfResult) {
			listener.enterFunctionValuesAssignPostIfResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFunctionValuesAssignPostIfResult) {
			listener.exitFunctionValuesAssignPostIfResult(this);
		}
	}
}


export class TupleValueContext extends ParserRuleContext {
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public value(): ValueContext[];
	public value(i: number): ValueContext;
	public value(i?: number): ValueContext | ValueContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ValueContext);
		} else {
			return this.getRuleContext(i, ValueContext);
		}
	}
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_tupleValue; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTupleValue) {
			listener.enterTupleValue(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTupleValue) {
			listener.exitTupleValue(this);
		}
	}
}


export class ValueContext extends ParserRuleContext {
	public element(): ElementContext | undefined {
		return this.tryGetRuleContext(0, ElementContext);
	}
	public infinitySymbol(): InfinitySymbolContext | undefined {
		return this.tryGetRuleContext(0, InfinitySymbolContext);
	}
	public mathExpression(): MathExpressionContext | undefined {
		return this.tryGetRuleContext(0, MathExpressionContext);
	}
	public booleanExpression(): BooleanExpressionContext | undefined {
		return this.tryGetRuleContext(0, BooleanExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_value; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterValue) {
			listener.enterValue(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitValue) {
			listener.exitValue(this);
		}
	}
}


export class TaFunctionDescriptionContext extends ParserRuleContext {
	public taFunctionGenericDescription(): TaFunctionGenericDescriptionContext | undefined {
		return this.tryGetRuleContext(0, TaFunctionGenericDescriptionContext);
	}
	public taFunctionDescriptionPreIf(): TaFunctionDescriptionPreIfContext | undefined {
		return this.tryGetRuleContext(0, TaFunctionDescriptionPreIfContext);
	}
	public taFunctionDescriptionPostIf(): TaFunctionDescriptionPostIfContext | undefined {
		return this.tryGetRuleContext(0, TaFunctionDescriptionPostIfContext);
	}
	public value(): ValueContext | undefined {
		return this.tryGetRuleContext(0, ValueContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunctionDescription; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionDescription) {
			listener.enterTaFunctionDescription(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionDescription) {
			listener.exitTaFunctionDescription(this);
		}
	}
}


export class TaFunctionDescriptionPreIfContext extends ParserRuleContext {
	public taFunctionPreIfResult(): TaFunctionPreIfResultContext[];
	public taFunctionPreIfResult(i: number): TaFunctionPreIfResultContext;
	public taFunctionPreIfResult(i?: number): TaFunctionPreIfResultContext | TaFunctionPreIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TaFunctionPreIfResultContext);
		} else {
			return this.getRuleContext(i, TaFunctionPreIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunctionDescriptionPreIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionDescriptionPreIf) {
			listener.enterTaFunctionDescriptionPreIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionDescriptionPreIf) {
			listener.exitTaFunctionDescriptionPreIf(this);
		}
	}
}


export class TaFunctionPreIfResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunctionPreIfResult; }
	public copyFrom(ctx: TaFunctionPreIfResultContext): void {
		super.copyFrom(ctx);
	}
}
export class TaFunctionPreIfConditionalResultContext extends TaFunctionPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public _result!: ValueContext;
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	public value(): ValueContext {
		return this.getRuleContext(0, ValueContext);
	}
	constructor(ctx: TaFunctionPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionPreIfConditionalResult) {
			listener.enterTaFunctionPreIfConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionPreIfConditionalResult) {
			listener.exitTaFunctionPreIfConditionalResult(this);
		}
	}
}
export class TaFunctionPreIfDefaultResultContext extends TaFunctionPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public _result!: ValueContext;
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	public value(): ValueContext {
		return this.getRuleContext(0, ValueContext);
	}
	constructor(ctx: TaFunctionPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionPreIfDefaultResult) {
			listener.enterTaFunctionPreIfDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionPreIfDefaultResult) {
			listener.exitTaFunctionPreIfDefaultResult(this);
		}
	}
}


export class TaFunctionDescriptionPostIfContext extends ParserRuleContext {
	public taFunctionPostIfResult(): TaFunctionPostIfResultContext[];
	public taFunctionPostIfResult(i: number): TaFunctionPostIfResultContext;
	public taFunctionPostIfResult(i?: number): TaFunctionPostIfResultContext | TaFunctionPostIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TaFunctionPostIfResultContext);
		} else {
			return this.getRuleContext(i, TaFunctionPostIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunctionDescriptionPostIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionDescriptionPostIf) {
			listener.enterTaFunctionDescriptionPostIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionDescriptionPostIf) {
			listener.exitTaFunctionDescriptionPostIf(this);
		}
	}
}


export class TaFunctionPostIfResultContext extends ParserRuleContext {
	public _result!: ValueContext;
	public _cond!: IfConditionContext;
	public value(): ValueContext {
		return this.getRuleContext(0, ValueContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunctionPostIfResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionPostIfResult) {
			listener.enterTaFunctionPostIfResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionPostIfResult) {
			listener.exitTaFunctionPostIfResult(this);
		}
	}
}


export class TaFunctionGenericDescriptionContext extends ParserRuleContext {
	public _var!: VariableContext;
	public COMMA(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.COMMA, 0); }
	public taAssignPreIf(): TaAssignPreIfContext | undefined {
		return this.tryGetRuleContext(0, TaAssignPreIfContext);
	}
	public variable(): VariableContext {
		return this.getRuleContext(0, VariableContext);
	}
	public taAssignPostIf(): TaAssignPostIfContext | undefined {
		return this.tryGetRuleContext(0, TaAssignPostIfContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taFunctionGenericDescription; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaFunctionGenericDescription) {
			listener.enterTaFunctionGenericDescription(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaFunctionGenericDescription) {
			listener.exitTaFunctionGenericDescription(this);
		}
	}
}


export class TaAssignPreIfContext extends ParserRuleContext {
	public taAssignPreIfResult(): TaAssignPreIfResultContext[];
	public taAssignPreIfResult(i: number): TaAssignPreIfResultContext;
	public taAssignPreIfResult(i?: number): TaAssignPreIfResultContext | TaAssignPreIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TaAssignPreIfResultContext);
		} else {
			return this.getRuleContext(i, TaAssignPreIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taAssignPreIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaAssignPreIf) {
			listener.enterTaAssignPreIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaAssignPreIf) {
			listener.exitTaAssignPreIf(this);
		}
	}
}


export class TaAssignPreIfResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taAssignPreIfResult; }
	public copyFrom(ctx: TaAssignPreIfResultContext): void {
		super.copyFrom(ctx);
	}
}
export class TaAssignPreIfConditionalResultContext extends TaAssignPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public assignValue(): AssignValueContext {
		return this.getRuleContext(0, AssignValueContext);
	}
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	constructor(ctx: TaAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaAssignPreIfConditionalResult) {
			listener.enterTaAssignPreIfConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaAssignPreIfConditionalResult) {
			listener.exitTaAssignPreIfConditionalResult(this);
		}
	}
}
export class TaAssignPreIfDefaultResultContext extends TaAssignPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public assignValue(): AssignValueContext {
		return this.getRuleContext(0, AssignValueContext);
	}
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	constructor(ctx: TaAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaAssignPreIfDefaultResult) {
			listener.enterTaAssignPreIfDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaAssignPreIfDefaultResult) {
			listener.exitTaAssignPreIfDefaultResult(this);
		}
	}
}


export class TaAssignPostIfContext extends ParserRuleContext {
	public taAssignPostIfResult(): TaAssignPostIfResultContext[];
	public taAssignPostIfResult(i: number): TaAssignPostIfResultContext;
	public taAssignPostIfResult(i?: number): TaAssignPostIfResultContext | TaAssignPostIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(TaAssignPostIfResultContext);
		} else {
			return this.getRuleContext(i, TaAssignPostIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taAssignPostIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaAssignPostIf) {
			listener.enterTaAssignPostIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaAssignPostIf) {
			listener.exitTaAssignPostIf(this);
		}
	}
}


export class TaAssignPostIfResultContext extends ParserRuleContext {
	public _cond!: IfConditionContext;
	public assignValue(): AssignValueContext {
		return this.getRuleContext(0, AssignValueContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_taAssignPostIfResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTaAssignPostIfResult) {
			listener.enterTaAssignPostIfResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTaAssignPostIfResult) {
			listener.exitTaAssignPostIfResult(this);
		}
	}
}


export class SelectFunctionDescriptionContext extends ParserRuleContext {
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	public selectFunctionDescriptionPreIf(): SelectFunctionDescriptionPreIfContext | undefined {
		return this.tryGetRuleContext(0, SelectFunctionDescriptionPreIfContext);
	}
	public selectFunctionDescriptionPostIf(): SelectFunctionDescriptionPostIfContext | undefined {
		return this.tryGetRuleContext(0, SelectFunctionDescriptionPostIfContext);
	}
	public selectFunctionGenericDescription(): SelectFunctionGenericDescriptionContext | undefined {
		return this.tryGetRuleContext(0, SelectFunctionGenericDescriptionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunctionDescription; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionDescription) {
			listener.enterSelectFunctionDescription(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionDescription) {
			listener.exitSelectFunctionDescription(this);
		}
	}
}


export class SelectFunctionDescriptionPreIfContext extends ParserRuleContext {
	public selectFunctionPreIfResult(): SelectFunctionPreIfResultContext[];
	public selectFunctionPreIfResult(i: number): SelectFunctionPreIfResultContext;
	public selectFunctionPreIfResult(i?: number): SelectFunctionPreIfResultContext | SelectFunctionPreIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SelectFunctionPreIfResultContext);
		} else {
			return this.getRuleContext(i, SelectFunctionPreIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunctionDescriptionPreIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionDescriptionPreIf) {
			listener.enterSelectFunctionDescriptionPreIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionDescriptionPreIf) {
			listener.exitSelectFunctionDescriptionPreIf(this);
		}
	}
}


export class SelectFunctionPreIfResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunctionPreIfResult; }
	public copyFrom(ctx: SelectFunctionPreIfResultContext): void {
		super.copyFrom(ctx);
	}
}
export class SelectFunctionPreIfConditionalResultContext extends SelectFunctionPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	constructor(ctx: SelectFunctionPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionPreIfConditionalResult) {
			listener.enterSelectFunctionPreIfConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionPreIfConditionalResult) {
			listener.exitSelectFunctionPreIfConditionalResult(this);
		}
	}
}
export class SelectFunctionPreIfDefaultResultContext extends SelectFunctionPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	constructor(ctx: SelectFunctionPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionPreIfDefaultResult) {
			listener.enterSelectFunctionPreIfDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionPreIfDefaultResult) {
			listener.exitSelectFunctionPreIfDefaultResult(this);
		}
	}
}


export class SelectFunctionDescriptionPostIfContext extends ParserRuleContext {
	public selectFunctionPostIfResult(): SelectFunctionPostIfResultContext[];
	public selectFunctionPostIfResult(i: number): SelectFunctionPostIfResultContext;
	public selectFunctionPostIfResult(i?: number): SelectFunctionPostIfResultContext | SelectFunctionPostIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SelectFunctionPostIfResultContext);
		} else {
			return this.getRuleContext(i, SelectFunctionPostIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunctionDescriptionPostIf; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionDescriptionPostIf) {
			listener.enterSelectFunctionDescriptionPostIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionDescriptionPostIf) {
			listener.exitSelectFunctionDescriptionPostIf(this);
		}
	}
}


export class SelectFunctionPostIfResultContext extends ParserRuleContext {
	public _cond!: IfConditionContext;
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunctionPostIfResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionPostIfResult) {
			listener.enterSelectFunctionPostIfResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionPostIfResult) {
			listener.exitSelectFunctionPostIfResult(this);
		}
	}
}


export class SelectFunctionGenericDescriptionContext extends ParserRuleContext {
	public _var!: VariableContext;
	public COMMA(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.COMMA, 0); }
	public selectAssignPreIfList(): SelectAssignPreIfListContext | undefined {
		return this.tryGetRuleContext(0, SelectAssignPreIfListContext);
	}
	public variable(): VariableContext {
		return this.getRuleContext(0, VariableContext);
	}
	public selectAssignPostIfList(): SelectAssignPostIfListContext | undefined {
		return this.tryGetRuleContext(0, SelectAssignPostIfListContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectFunctionGenericDescription; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectFunctionGenericDescription) {
			listener.enterSelectFunctionGenericDescription(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectFunctionGenericDescription) {
			listener.exitSelectFunctionGenericDescription(this);
		}
	}
}


export class SelectAssignPreIfListContext extends ParserRuleContext {
	public selectAssignPreIfResult(): SelectAssignPreIfResultContext[];
	public selectAssignPreIfResult(i: number): SelectAssignPreIfResultContext;
	public selectAssignPreIfResult(i?: number): SelectAssignPreIfResultContext | SelectAssignPreIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SelectAssignPreIfResultContext);
		} else {
			return this.getRuleContext(i, SelectAssignPreIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectAssignPreIfList; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectAssignPreIfList) {
			listener.enterSelectAssignPreIfList(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectAssignPreIfList) {
			listener.exitSelectAssignPreIfList(this);
		}
	}
}


export class SelectAssignPreIfResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectAssignPreIfResult; }
	public copyFrom(ctx: SelectAssignPreIfResultContext): void {
		super.copyFrom(ctx);
	}
}
export class SelectAssignPreIfIdentifierConditionalResultContext extends SelectAssignPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public assignIdentifier(): AssignIdentifierContext {
		return this.getRuleContext(0, AssignIdentifierContext);
	}
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	constructor(ctx: SelectAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectAssignPreIfIdentifierConditionalResult) {
			listener.enterSelectAssignPreIfIdentifierConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectAssignPreIfIdentifierConditionalResult) {
			listener.exitSelectAssignPreIfIdentifierConditionalResult(this);
		}
	}
}
export class SelectAssignPreIfParameterConditionalResultContext extends SelectAssignPreIfResultContext {
	public _cond!: IfThenConditionContext;
	public assignParameter(): AssignParameterContext {
		return this.getRuleContext(0, AssignParameterContext);
	}
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	constructor(ctx: SelectAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectAssignPreIfParameterConditionalResult) {
			listener.enterSelectAssignPreIfParameterConditionalResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectAssignPreIfParameterConditionalResult) {
			listener.exitSelectAssignPreIfParameterConditionalResult(this);
		}
	}
}
export class SelectAssignPreIfIdentifierDefaultResultContext extends SelectAssignPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public assignIdentifier(): AssignIdentifierContext {
		return this.getRuleContext(0, AssignIdentifierContext);
	}
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	constructor(ctx: SelectAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectAssignPreIfIdentifierDefaultResult) {
			listener.enterSelectAssignPreIfIdentifierDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectAssignPreIfIdentifierDefaultResult) {
			listener.exitSelectAssignPreIfIdentifierDefaultResult(this);
		}
	}
}
export class SelectAssignPreIfParameterDefaultResultContext extends SelectAssignPreIfResultContext {
	public _cond!: InOtherCaseSymbolContext;
	public assignParameter(): AssignParameterContext {
		return this.getRuleContext(0, AssignParameterContext);
	}
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	constructor(ctx: SelectAssignPreIfResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectAssignPreIfParameterDefaultResult) {
			listener.enterSelectAssignPreIfParameterDefaultResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectAssignPreIfParameterDefaultResult) {
			listener.exitSelectAssignPreIfParameterDefaultResult(this);
		}
	}
}


export class SelectAssignPostIfListContext extends ParserRuleContext {
	public selectAssignPostIfResult(): SelectAssignPostIfResultContext[];
	public selectAssignPostIfResult(i: number): SelectAssignPostIfResultContext;
	public selectAssignPostIfResult(i?: number): SelectAssignPostIfResultContext | SelectAssignPostIfResultContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SelectAssignPostIfResultContext);
		} else {
			return this.getRuleContext(i, SelectAssignPostIfResultContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectAssignPostIfList; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectAssignPostIfList) {
			listener.enterSelectAssignPostIfList(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectAssignPostIfList) {
			listener.exitSelectAssignPostIfList(this);
		}
	}
}


export class SelectAssignPostIfResultContext extends ParserRuleContext {
	public _cond!: IfConditionContext;
	public assignIdentifier(): AssignIdentifierContext | undefined {
		return this.tryGetRuleContext(0, AssignIdentifierContext);
	}
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	public assignParameter(): AssignParameterContext | undefined {
		return this.tryGetRuleContext(0, AssignParameterContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_selectAssignPostIfResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSelectAssignPostIfResult) {
			listener.enterSelectAssignPostIfResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSelectAssignPostIfResult) {
			listener.exitSelectAssignPostIfResult(this);
		}
	}
}


export class AssignIdentifierContext extends ParserRuleContext {
	public variable(): VariableContext {
		return this.getRuleContext(0, VariableContext);
	}
	public ASSIGNOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ASSIGNOPERATOR, 0); }
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_assignIdentifier; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAssignIdentifier) {
			listener.enterAssignIdentifier(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAssignIdentifier) {
			listener.exitAssignIdentifier(this);
		}
	}
}


export class AssignParameterContext extends ParserRuleContext {
	public variable(): VariableContext {
		return this.getRuleContext(0, VariableContext);
	}
	public ASSIGNOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ASSIGNOPERATOR, 0); }
	public parameter(): ParameterContext {
		return this.getRuleContext(0, ParameterContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_assignParameter; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAssignParameter) {
			listener.enterAssignParameter(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAssignParameter) {
			listener.exitAssignParameter(this);
		}
	}
}


export class AssignValueContext extends ParserRuleContext {
	public variable(): VariableContext {
		return this.getRuleContext(0, VariableContext);
	}
	public ASSIGNOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ASSIGNOPERATOR, 0); }
	public value(): ValueContext {
		return this.getRuleContext(0, ValueContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_assignValue; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAssignValue) {
			listener.enterAssignValue(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAssignValue) {
			listener.exitAssignValue(this);
		}
	}
}


export class AssignTupleContext extends ParserRuleContext {
	public variableTuple(): VariableTupleContext {
		return this.getRuleContext(0, VariableTupleContext);
	}
	public ASSIGNOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ASSIGNOPERATOR, 0); }
	public tupleValue(): TupleValueContext {
		return this.getRuleContext(0, TupleValueContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_assignTuple; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAssignTuple) {
			listener.enterAssignTuple(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAssignTuple) {
			listener.exitAssignTuple(this);
		}
	}
}


export class AssignElementContext extends ParserRuleContext {
	public assignIdentifier(): AssignIdentifierContext | undefined {
		return this.tryGetRuleContext(0, AssignIdentifierContext);
	}
	public assignValue(): AssignValueContext | undefined {
		return this.tryGetRuleContext(0, AssignValueContext);
	}
	public assignTuple(): AssignTupleContext | undefined {
		return this.tryGetRuleContext(0, AssignTupleContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_assignElement; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAssignElement) {
			listener.enterAssignElement(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAssignElement) {
			listener.exitAssignElement(this);
		}
	}
}


export class AssignmentsListContext extends ParserRuleContext {
	public assignElement(): AssignElementContext[];
	public assignElement(i: number): AssignElementContext;
	public assignElement(i?: number): AssignElementContext | AssignElementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(AssignElementContext);
		} else {
			return this.getRuleContext(i, AssignElementContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	public ANDOPERATOR(): TerminalNode[];
	public ANDOPERATOR(i: number): TerminalNode;
	public ANDOPERATOR(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.ANDOPERATOR);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.ANDOPERATOR, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_assignmentsList; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAssignmentsList) {
			listener.enterAssignmentsList(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAssignmentsList) {
			listener.exitAssignmentsList(this);
		}
	}
}


export class ModelSignatureContext extends ParserRuleContext {
	public modelSymbol(): ModelSymbolContext {
		return this.getRuleContext(0, ModelSymbolContext);
	}
	public BEGINPARENTHESES(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public parametersList(): ParametersListContext | undefined {
		return this.tryGetRuleContext(0, ParametersListContext);
	}
	public ENDPARENTHESES(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_modelSignature; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterModelSignature) {
			listener.enterModelSignature(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitModelSignature) {
			listener.exitModelSignature(this);
		}
	}
}


export class ModelSymbolContext extends ParserRuleContext {
	public UPPERCASEID(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.UPPERCASEID, 0); }
	public LOWERCASEID(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.LOWERCASEID, 0); }
	public FULLCASEID(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.FULLCASEID, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_modelSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterModelSymbol) {
			listener.enterModelSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitModelSymbol) {
			listener.exitModelSymbol(this);
		}
	}
}


export class ParameterContext extends ParserRuleContext {
	public HASH(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.HASH, 0); }
	public LOWERCASEID(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.LOWERCASEID, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_parameter; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterParameter) {
			listener.enterParameter(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitParameter) {
			listener.exitParameter(this);
		}
	}
}


export class IdentifierContext extends ParserRuleContext {
	public LOWERCASEID(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.LOWERCASEID, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_identifier; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIdentifier) {
			listener.enterIdentifier(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIdentifier) {
			listener.exitIdentifier(this);
		}
	}
}


export class VariableContext extends ParserRuleContext {
	public LOWERCASEID(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.LOWERCASEID, 0); }
	public APOSTROPHE(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.APOSTROPHE, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_variable; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterVariable) {
			listener.enterVariable(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitVariable) {
			listener.exitVariable(this);
		}
	}
}


export class VariableFixedValuesContext extends ParserRuleContext {
	public variable(): VariableContext | undefined {
		return this.tryGetRuleContext(0, VariableContext);
	}
	public datatypeSymbol(): DatatypeSymbolContext | undefined {
		return this.tryGetRuleContext(0, DatatypeSymbolContext);
	}
	public identifier(): IdentifierContext | undefined {
		return this.tryGetRuleContext(0, IdentifierContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_variableFixedValues; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterVariableFixedValues) {
			listener.enterVariableFixedValues(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitVariableFixedValues) {
			listener.exitVariableFixedValues(this);
		}
	}
}


export class ParametersListContext extends ParserRuleContext {
	public parameter(): ParameterContext[];
	public parameter(i: number): ParameterContext;
	public parameter(i?: number): ParameterContext | ParameterContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ParameterContext);
		} else {
			return this.getRuleContext(i, ParameterContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_parametersList; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterParametersList) {
			listener.enterParametersList(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitParametersList) {
			listener.exitParametersList(this);
		}
	}
}


export class DatatypeSymbolContext extends ParserRuleContext {
	public trueSymbol(): TrueSymbolContext | undefined {
		return this.tryGetRuleContext(0, TrueSymbolContext);
	}
	public falseSymbol(): FalseSymbolContext | undefined {
		return this.tryGetRuleContext(0, FalseSymbolContext);
	}
	public integerSymbol(): IntegerSymbolContext | undefined {
		return this.tryGetRuleContext(0, IntegerSymbolContext);
	}
	public realSymbol(): RealSymbolContext | undefined {
		return this.tryGetRuleContext(0, RealSymbolContext);
	}
	public infinitySymbol(): InfinitySymbolContext | undefined {
		return this.tryGetRuleContext(0, InfinitySymbolContext);
	}
	public stringSymbol(): StringSymbolContext | undefined {
		return this.tryGetRuleContext(0, StringSymbolContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_datatypeSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDatatypeSymbol) {
			listener.enterDatatypeSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDatatypeSymbol) {
			listener.exitDatatypeSymbol(this);
		}
	}
}


export class TrueSymbolContext extends ParserRuleContext {
	public TRUESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.TRUESYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_trueSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTrueSymbol) {
			listener.enterTrueSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTrueSymbol) {
			listener.exitTrueSymbol(this);
		}
	}
}


export class FalseSymbolContext extends ParserRuleContext {
	public FALSESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.FALSESYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_falseSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFalseSymbol) {
			listener.enterFalseSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFalseSymbol) {
			listener.exitFalseSymbol(this);
		}
	}
}


export class IntegerSymbolContext extends ParserRuleContext {
	public INTEGERSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.INTEGERSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_integerSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIntegerSymbol) {
			listener.enterIntegerSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIntegerSymbol) {
			listener.exitIntegerSymbol(this);
		}
	}
}


export class RealSymbolContext extends ParserRuleContext {
	public REALSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.REALSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_realSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRealSymbol) {
			listener.enterRealSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRealSymbol) {
			listener.exitRealSymbol(this);
		}
	}
}


export class InfinitySymbolContext extends ParserRuleContext {
	public INFINITYSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.INFINITYSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_infinitySymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterInfinitySymbol) {
			listener.enterInfinitySymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitInfinitySymbol) {
			listener.exitInfinitySymbol(this);
		}
	}
}


export class StringSymbolContext extends ParserRuleContext {
	public STRINGSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.STRINGSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_stringSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterStringSymbol) {
			listener.enterStringSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitStringSymbol) {
			listener.exitStringSymbol(this);
		}
	}
}


export class RootContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_root; }
	public copyFrom(ctx: RootContext): void {
		super.copyFrom(ctx);
	}
}
export class RootIfThenContext extends RootContext {
	public ifThenCondition(): IfThenConditionContext {
		return this.getRuleContext(0, IfThenConditionContext);
	}
	public EOF(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EOF, 0); }
	constructor(ctx: RootContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRootIfThen) {
			listener.enterRootIfThen(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRootIfThen) {
			listener.exitRootIfThen(this);
		}
	}
}
export class RootIfContext extends RootContext {
	public ifCondition(): IfConditionContext {
		return this.getRuleContext(0, IfConditionContext);
	}
	public EOF(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EOF, 0); }
	constructor(ctx: RootContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRootIf) {
			listener.enterRootIf(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRootIf) {
			listener.exitRootIf(this);
		}
	}
}
export class RootBooleanExprContext extends RootContext {
	public booleanExpression(): BooleanExpressionContext {
		return this.getRuleContext(0, BooleanExpressionContext);
	}
	public EOF(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EOF, 0); }
	constructor(ctx: RootContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRootBooleanExpr) {
			listener.enterRootBooleanExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRootBooleanExpr) {
			listener.exitRootBooleanExpr(this);
		}
	}
}


export class IfConditionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_ifCondition; }
	public copyFrom(ctx: IfConditionContext): void {
		super.copyFrom(ctx);
	}
}
export class IfConditionExprContext extends IfConditionContext {
	public ifSymbol(): IfSymbolContext {
		return this.getRuleContext(0, IfSymbolContext);
	}
	public booleanExpression(): BooleanExpressionContext {
		return this.getRuleContext(0, BooleanExpressionContext);
	}
	constructor(ctx: IfConditionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIfConditionExpr) {
			listener.enterIfConditionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIfConditionExpr) {
			listener.exitIfConditionExpr(this);
		}
	}
}
export class IfConditionParExprContext extends IfConditionContext {
	public ifSymbol(): IfSymbolContext {
		return this.getRuleContext(0, IfSymbolContext);
	}
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public booleanExpression(): BooleanExpressionContext {
		return this.getRuleContext(0, BooleanExpressionContext);
	}
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	constructor(ctx: IfConditionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIfConditionParExpr) {
			listener.enterIfConditionParExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIfConditionParExpr) {
			listener.exitIfConditionParExpr(this);
		}
	}
}
export class IfConditionDefaultExprContext extends IfConditionContext {
	public inOtherCaseSymbol(): InOtherCaseSymbolContext {
		return this.getRuleContext(0, InOtherCaseSymbolContext);
	}
	constructor(ctx: IfConditionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIfConditionDefaultExpr) {
			listener.enterIfConditionDefaultExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIfConditionDefaultExpr) {
			listener.exitIfConditionDefaultExpr(this);
		}
	}
}


export class IfThenConditionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_ifThenCondition; }
	public copyFrom(ctx: IfThenConditionContext): void {
		super.copyFrom(ctx);
	}
}
export class IfThenExprContext extends IfThenConditionContext {
	public ifSymbol(): IfSymbolContext {
		return this.getRuleContext(0, IfSymbolContext);
	}
	public booleanExpression(): BooleanExpressionContext {
		return this.getRuleContext(0, BooleanExpressionContext);
	}
	public THENSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.THENSYMBOL, 0); }
	constructor(ctx: IfThenConditionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIfThenExpr) {
			listener.enterIfThenExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIfThenExpr) {
			listener.exitIfThenExpr(this);
		}
	}
}
export class IfThenParExprContext extends IfThenConditionContext {
	public ifSymbol(): IfSymbolContext {
		return this.getRuleContext(0, IfSymbolContext);
	}
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public booleanExpression(): BooleanExpressionContext {
		return this.getRuleContext(0, BooleanExpressionContext);
	}
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public THENSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.THENSYMBOL, 0); }
	constructor(ctx: IfThenConditionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIfThenParExpr) {
			listener.enterIfThenParExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIfThenParExpr) {
			listener.exitIfThenParExpr(this);
		}
	}
}


export class BooleanExpressionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_booleanExpression; }
	public copyFrom(ctx: BooleanExpressionContext): void {
		super.copyFrom(ctx);
	}
}
export class BinaryConditionExprContext extends BooleanExpressionContext {
	public _bc!: BinaryConditionContext;
	public binaryCondition(): BinaryConditionContext {
		return this.getRuleContext(0, BinaryConditionContext);
	}
	constructor(ctx: BooleanExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBinaryConditionExpr) {
			listener.enterBinaryConditionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBinaryConditionExpr) {
			listener.exitBinaryConditionExpr(this);
		}
	}
}
export class BooleanTermExprContext extends BooleanExpressionContext {
	public _bt!: BooleanExpressionTermContext;
	public booleanExpressionTerm(): BooleanExpressionTermContext {
		return this.getRuleContext(0, BooleanExpressionTermContext);
	}
	constructor(ctx: BooleanExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBooleanTermExpr) {
			listener.enterBooleanTermExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBooleanTermExpr) {
			listener.exitBooleanTermExpr(this);
		}
	}
}


export class BinaryConditionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_binaryCondition; }
	public copyFrom(ctx: BinaryConditionContext): void {
		super.copyFrom(ctx);
	}
}
export class BinaryExprContext extends BinaryConditionContext {
	public _left!: BooleanExpressionTermContext;
	public _right!: BooleanExpressionTermContext;
	public booleanExpressionTerm(): BooleanExpressionTermContext[];
	public booleanExpressionTerm(i: number): BooleanExpressionTermContext;
	public booleanExpressionTerm(i?: number): BooleanExpressionTermContext | BooleanExpressionTermContext[] {
		if (i === undefined) {
			return this.getRuleContexts(BooleanExpressionTermContext);
		} else {
			return this.getRuleContext(i, BooleanExpressionTermContext);
		}
	}
	public binaryConditionalOperator(): BinaryConditionalOperatorContext[];
	public binaryConditionalOperator(i: number): BinaryConditionalOperatorContext;
	public binaryConditionalOperator(i?: number): BinaryConditionalOperatorContext | BinaryConditionalOperatorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(BinaryConditionalOperatorContext);
		} else {
			return this.getRuleContext(i, BinaryConditionalOperatorContext);
		}
	}
	constructor(ctx: BinaryConditionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBinaryExpr) {
			listener.enterBinaryExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBinaryExpr) {
			listener.exitBinaryExpr(this);
		}
	}
}


export class BooleanExpressionTermContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_booleanExpressionTerm; }
	public copyFrom(ctx: BooleanExpressionTermContext): void {
		super.copyFrom(ctx);
	}
}
export class RelationalTermExprContext extends BooleanExpressionTermContext {
	public _rt!: RelationalExpressionTermContext;
	public relationalExpressionTerm(): RelationalExpressionTermContext {
		return this.getRuleContext(0, RelationalExpressionTermContext);
	}
	constructor(ctx: BooleanExpressionTermContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRelationalTermExpr) {
			listener.enterRelationalTermExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRelationalTermExpr) {
			listener.exitRelationalTermExpr(this);
		}
	}
}
export class UnaryTermExprContext extends BooleanExpressionTermContext {
	public _uc!: UnaryConditionContext;
	public unaryCondition(): UnaryConditionContext {
		return this.getRuleContext(0, UnaryConditionContext);
	}
	constructor(ctx: BooleanExpressionTermContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterUnaryTermExpr) {
			listener.enterUnaryTermExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitUnaryTermExpr) {
			listener.exitUnaryTermExpr(this);
		}
	}
}


export class UnaryConditionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_unaryCondition; }
	public copyFrom(ctx: UnaryConditionContext): void {
		super.copyFrom(ctx);
	}
}
export class UnaryCondExprContext extends UnaryConditionContext {
	public _op!: UnaryConditionalOperatorContext;
	public _expr!: BooleanExpressionTermContext;
	public unaryConditionalOperator(): UnaryConditionalOperatorContext {
		return this.getRuleContext(0, UnaryConditionalOperatorContext);
	}
	public booleanExpressionTerm(): BooleanExpressionTermContext {
		return this.getRuleContext(0, BooleanExpressionTermContext);
	}
	constructor(ctx: UnaryConditionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterUnaryCondExpr) {
			listener.enterUnaryCondExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitUnaryCondExpr) {
			listener.exitUnaryCondExpr(this);
		}
	}
}


export class RelationalExpressionTermContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_relationalExpressionTerm; }
	public copyFrom(ctx: RelationalExpressionTermContext): void {
		super.copyFrom(ctx);
	}
}
export class RelationalExprContext extends RelationalExpressionTermContext {
	public _left!: BooleanExpressionBasicTermContext;
	public _op!: BinaryRelationalOperatorContext;
	public _right!: BooleanExpressionBasicTermContext;
	public booleanExpressionBasicTerm(): BooleanExpressionBasicTermContext[];
	public booleanExpressionBasicTerm(i: number): BooleanExpressionBasicTermContext;
	public booleanExpressionBasicTerm(i?: number): BooleanExpressionBasicTermContext | BooleanExpressionBasicTermContext[] {
		if (i === undefined) {
			return this.getRuleContexts(BooleanExpressionBasicTermContext);
		} else {
			return this.getRuleContext(i, BooleanExpressionBasicTermContext);
		}
	}
	public binaryRelationalOperator(): BinaryRelationalOperatorContext[];
	public binaryRelationalOperator(i: number): BinaryRelationalOperatorContext;
	public binaryRelationalOperator(i?: number): BinaryRelationalOperatorContext | BinaryRelationalOperatorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(BinaryRelationalOperatorContext);
		} else {
			return this.getRuleContext(i, BinaryRelationalOperatorContext);
		}
	}
	constructor(ctx: RelationalExpressionTermContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRelationalExpr) {
			listener.enterRelationalExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRelationalExpr) {
			listener.exitRelationalExpr(this);
		}
	}
}


export class BooleanExpressionBasicTermContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_booleanExpressionBasicTerm; }
	public copyFrom(ctx: BooleanExpressionBasicTermContext): void {
		super.copyFrom(ctx);
	}
}
export class BasicElementExprContext extends BooleanExpressionBasicTermContext {
	public _el!: BooleanExpressionElementContext;
	public booleanExpressionElement(): BooleanExpressionElementContext {
		return this.getRuleContext(0, BooleanExpressionElementContext);
	}
	constructor(ctx: BooleanExpressionBasicTermContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBasicElementExpr) {
			listener.enterBasicElementExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBasicElementExpr) {
			listener.exitBasicElementExpr(this);
		}
	}
}
export class BasicParenthesisExprContext extends BooleanExpressionBasicTermContext {
	public _res!: BooleanExpressionResultContext;
	public booleanExpressionResult(): BooleanExpressionResultContext {
		return this.getRuleContext(0, BooleanExpressionResultContext);
	}
	constructor(ctx: BooleanExpressionBasicTermContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBasicParenthesisExpr) {
			listener.enterBasicParenthesisExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBasicParenthesisExpr) {
			listener.exitBasicParenthesisExpr(this);
		}
	}
}


export class BooleanExpressionElementContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_booleanExpressionElement; }
	public copyFrom(ctx: BooleanExpressionElementContext): void {
		super.copyFrom(ctx);
	}
}
export class ElementExprContext extends BooleanExpressionElementContext {
	public _el!: ElementContext;
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	constructor(ctx: BooleanExpressionElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementExpr) {
			listener.enterElementExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementExpr) {
			listener.exitElementExpr(this);
		}
	}
}
export class ElementDefinitionExprContext extends BooleanExpressionElementContext {
	public _el!: ElementDefinitionContext;
	public elementDefinition(): ElementDefinitionContext {
		return this.getRuleContext(0, ElementDefinitionContext);
	}
	constructor(ctx: BooleanExpressionElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementDefinitionExpr) {
			listener.enterElementDefinitionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementDefinitionExpr) {
			listener.exitElementDefinitionExpr(this);
		}
	}
}
export class InfinityExprContext extends BooleanExpressionElementContext {
	public infinitySymbol(): InfinitySymbolContext {
		return this.getRuleContext(0, InfinitySymbolContext);
	}
	constructor(ctx: BooleanExpressionElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterInfinityExpr) {
			listener.enterInfinityExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitInfinityExpr) {
			listener.exitInfinityExpr(this);
		}
	}
}


export class BooleanExpressionResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_booleanExpressionResult; }
	public copyFrom(ctx: BooleanExpressionResultContext): void {
		super.copyFrom(ctx);
	}
}
export class ParenthesisExprContext extends BooleanExpressionResultContext {
	public _expr!: BooleanExpressionContext;
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public booleanExpression(): BooleanExpressionContext {
		return this.getRuleContext(0, BooleanExpressionContext);
	}
	constructor(ctx: BooleanExpressionResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterParenthesisExpr) {
			listener.enterParenthesisExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitParenthesisExpr) {
			listener.exitParenthesisExpr(this);
		}
	}
}


export class ActionExpressionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_actionExpression; }
	public copyFrom(ctx: ActionExpressionContext): void {
		super.copyFrom(ctx);
	}
}
export class ActionInfinityContext extends ActionExpressionContext {
	public infinitySymbol(): InfinitySymbolContext {
		return this.getRuleContext(0, InfinitySymbolContext);
	}
	constructor(ctx: ActionExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterActionInfinity) {
			listener.enterActionInfinity(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitActionInfinity) {
			listener.exitActionInfinity(this);
		}
	}
}
export class ActionElementContext extends ActionExpressionContext {
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	constructor(ctx: ActionExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterActionElement) {
			listener.enterActionElement(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitActionElement) {
			listener.exitActionElement(this);
		}
	}
}
export class ActionElementDefinitionContext extends ActionExpressionContext {
	public elementDefinition(): ElementDefinitionContext {
		return this.getRuleContext(0, ElementDefinitionContext);
	}
	constructor(ctx: ActionExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterActionElementDefinition) {
			listener.enterActionElementDefinition(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitActionElementDefinition) {
			listener.exitActionElementDefinition(this);
		}
	}
}


export class IfSymbolContext extends ParserRuleContext {
	public IFSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.IFSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_ifSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIfSymbol) {
			listener.enterIfSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIfSymbol) {
			listener.exitIfSymbol(this);
		}
	}
}


export class InOtherCaseSymbolContext extends ParserRuleContext {
	public INOTHERCASESYMBOL(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.INOTHERCASESYMBOL, 0); }
	public OTHERWISESYMBOL(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.OTHERWISESYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_inOtherCaseSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterInOtherCaseSymbol) {
			listener.enterInOtherCaseSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitInOtherCaseSymbol) {
			listener.exitInOtherCaseSymbol(this);
		}
	}
}


export class UnaryConditionalOperatorContext extends ParserRuleContext {
	public notOperator(): NotOperatorContext {
		return this.getRuleContext(0, NotOperatorContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_unaryConditionalOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterUnaryConditionalOperator) {
			listener.enterUnaryConditionalOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitUnaryConditionalOperator) {
			listener.exitUnaryConditionalOperator(this);
		}
	}
}


export class BinaryConditionalOperatorContext extends ParserRuleContext {
	public andOperator(): AndOperatorContext | undefined {
		return this.tryGetRuleContext(0, AndOperatorContext);
	}
	public orOperator(): OrOperatorContext | undefined {
		return this.tryGetRuleContext(0, OrOperatorContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_binaryConditionalOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBinaryConditionalOperator) {
			listener.enterBinaryConditionalOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBinaryConditionalOperator) {
			listener.exitBinaryConditionalOperator(this);
		}
	}
}


export class BinaryRelationalOperatorContext extends ParserRuleContext {
	public equalToOperator(): EqualToOperatorContext | undefined {
		return this.tryGetRuleContext(0, EqualToOperatorContext);
	}
	public notEqualToOperator(): NotEqualToOperatorContext | undefined {
		return this.tryGetRuleContext(0, NotEqualToOperatorContext);
	}
	public greaterThanOperator(): GreaterThanOperatorContext | undefined {
		return this.tryGetRuleContext(0, GreaterThanOperatorContext);
	}
	public lessThanOperator(): LessThanOperatorContext | undefined {
		return this.tryGetRuleContext(0, LessThanOperatorContext);
	}
	public greaterThanOrEqualToOperator(): GreaterThanOrEqualToOperatorContext | undefined {
		return this.tryGetRuleContext(0, GreaterThanOrEqualToOperatorContext);
	}
	public lessThanOrEqualToOperator(): LessThanOrEqualToOperatorContext | undefined {
		return this.tryGetRuleContext(0, LessThanOrEqualToOperatorContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_binaryRelationalOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBinaryRelationalOperator) {
			listener.enterBinaryRelationalOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBinaryRelationalOperator) {
			listener.exitBinaryRelationalOperator(this);
		}
	}
}


export class NotOperatorContext extends ParserRuleContext {
	public NOTOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.NOTOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_notOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterNotOperator) {
			listener.enterNotOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitNotOperator) {
			listener.exitNotOperator(this);
		}
	}
}


export class AndOperatorContext extends ParserRuleContext {
	public ANDOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ANDOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_andOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAndOperator) {
			listener.enterAndOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAndOperator) {
			listener.exitAndOperator(this);
		}
	}
}


export class OrOperatorContext extends ParserRuleContext {
	public OROPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.OROPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_orOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterOrOperator) {
			listener.enterOrOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitOrOperator) {
			listener.exitOrOperator(this);
		}
	}
}


export class EqualToOperatorContext extends ParserRuleContext {
	public EQUALTOOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUALTOOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_equalToOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterEqualToOperator) {
			listener.enterEqualToOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitEqualToOperator) {
			listener.exitEqualToOperator(this);
		}
	}
}


export class NotEqualToOperatorContext extends ParserRuleContext {
	public NOTEQUALTOOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.NOTEQUALTOOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_notEqualToOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterNotEqualToOperator) {
			listener.enterNotEqualToOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitNotEqualToOperator) {
			listener.exitNotEqualToOperator(this);
		}
	}
}


export class GreaterThanOperatorContext extends ParserRuleContext {
	public GREATERTHANOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.GREATERTHANOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_greaterThanOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterGreaterThanOperator) {
			listener.enterGreaterThanOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitGreaterThanOperator) {
			listener.exitGreaterThanOperator(this);
		}
	}
}


export class LessThanOperatorContext extends ParserRuleContext {
	public LESSTHANOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.LESSTHANOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_lessThanOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterLessThanOperator) {
			listener.enterLessThanOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitLessThanOperator) {
			listener.exitLessThanOperator(this);
		}
	}
}


export class GreaterThanOrEqualToOperatorContext extends ParserRuleContext {
	public GREATERTHANOREQUALTOOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.GREATERTHANOREQUALTOOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_greaterThanOrEqualToOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterGreaterThanOrEqualToOperator) {
			listener.enterGreaterThanOrEqualToOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitGreaterThanOrEqualToOperator) {
			listener.exitGreaterThanOrEqualToOperator(this);
		}
	}
}


export class LessThanOrEqualToOperatorContext extends ParserRuleContext {
	public LESSTHANOREQUALTOOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.LESSTHANOREQUALTOOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_lessThanOrEqualToOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterLessThanOrEqualToOperator) {
			listener.enterLessThanOrEqualToOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitLessThanOrEqualToOperator) {
			listener.exitLessThanOrEqualToOperator(this);
		}
	}
}


export class SetContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_set; }
	public copyFrom(ctx: SetContext): void {
		super.copyFrom(ctx);
	}
}
export class SetImplicitDefinitionExprContext extends SetContext {
	public _si!: SetImplicitDefinitionContext;
	public setImplicitDefinition(): SetImplicitDefinitionContext {
		return this.getRuleContext(0, SetImplicitDefinitionContext);
	}
	constructor(ctx: SetContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetImplicitDefinitionExpr) {
			listener.enterSetImplicitDefinitionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetImplicitDefinitionExpr) {
			listener.exitSetImplicitDefinitionExpr(this);
		}
	}
}
export class SetExplicitDefinitionExprContext extends SetContext {
	public _se!: SetExplicitDefinitionContext;
	public setExplicitDefinition(): SetExplicitDefinitionContext {
		return this.getRuleContext(0, SetExplicitDefinitionContext);
	}
	constructor(ctx: SetContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetExplicitDefinitionExpr) {
			listener.enterSetExplicitDefinitionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetExplicitDefinitionExpr) {
			listener.exitSetExplicitDefinitionExpr(this);
		}
	}
}


export class SetImplicitDefinitionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setImplicitDefinition; }
	public copyFrom(ctx: SetImplicitDefinitionContext): void {
		super.copyFrom(ctx);
	}
}
export class SetDefinitionExprContext extends SetImplicitDefinitionContext {
	public _sd!: SetDefinitionContext;
	public setDefinition(): SetDefinitionContext {
		return this.getRuleContext(0, SetDefinitionContext);
	}
	constructor(ctx: SetImplicitDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetDefinitionExpr) {
			listener.enterSetDefinitionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetDefinitionExpr) {
			listener.exitSetDefinitionExpr(this);
		}
	}
}
export class SetOperationResultExprContext extends SetImplicitDefinitionContext {
	public _sr!: SetOperationResultContext;
	public setOperationResult(): SetOperationResultContext {
		return this.getRuleContext(0, SetOperationResultContext);
	}
	constructor(ctx: SetImplicitDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOperationResultExpr) {
			listener.enterSetOperationResultExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOperationResultExpr) {
			listener.exitSetOperationResultExpr(this);
		}
	}
}


export class SetExplicitDefinitionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setExplicitDefinition; }
	public copyFrom(ctx: SetExplicitDefinitionContext): void {
		super.copyFrom(ctx);
	}
}
export class SetAssignmentExprContext extends SetExplicitDefinitionContext {
	public _s!: SetSymbolContext;
	public _rhs!: SetImplicitDefinitionContext;
	public EQUAL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EQUAL, 0); }
	public setSymbol(): SetSymbolContext {
		return this.getRuleContext(0, SetSymbolContext);
	}
	public setImplicitDefinition(): SetImplicitDefinitionContext {
		return this.getRuleContext(0, SetImplicitDefinitionContext);
	}
	constructor(ctx: SetExplicitDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetAssignmentExpr) {
			listener.enterSetAssignmentExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetAssignmentExpr) {
			listener.exitSetAssignmentExpr(this);
		}
	}
}


export class SetDefinitionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setDefinition; }
	public copyFrom(ctx: SetDefinitionContext): void {
		super.copyFrom(ctx);
	}
}
export class ElementCollectionExprContext extends SetDefinitionContext {
	public _ec!: ElementCollectionContext;
	public elementCollection(): ElementCollectionContext {
		return this.getRuleContext(0, ElementCollectionContext);
	}
	constructor(ctx: SetDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementCollectionExpr) {
			listener.enterElementCollectionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementCollectionExpr) {
			listener.exitElementCollectionExpr(this);
		}
	}
}
export class TupleCollectionExprContext extends SetDefinitionContext {
	public _tc!: TupleCollectionContext;
	public tupleCollection(): TupleCollectionContext {
		return this.getRuleContext(0, TupleCollectionContext);
	}
	constructor(ctx: SetDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTupleCollectionExpr) {
			listener.enterTupleCollectionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTupleCollectionExpr) {
			listener.exitTupleCollectionExpr(this);
		}
	}
}


export class SetSymbolContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setSymbol; }
	public copyFrom(ctx: SetSymbolContext): void {
		super.copyFrom(ctx);
	}
}
export class SetNameSymbolExprContext extends SetSymbolContext {
	public _n!: SetNameContext;
	public setName(): SetNameContext {
		return this.getRuleContext(0, SetNameContext);
	}
	constructor(ctx: SetSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetNameSymbolExpr) {
			listener.enterSetNameSymbolExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetNameSymbolExpr) {
			listener.exitSetNameSymbolExpr(this);
		}
	}
}
export class IntegerSetSymbolExprContext extends SetSymbolContext {
	public _z!: SetOfIntegerNumbersSymbolContext;
	public setOfIntegerNumbersSymbol(): SetOfIntegerNumbersSymbolContext {
		return this.getRuleContext(0, SetOfIntegerNumbersSymbolContext);
	}
	constructor(ctx: SetSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIntegerSetSymbolExpr) {
			listener.enterIntegerSetSymbolExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIntegerSetSymbolExpr) {
			listener.exitIntegerSetSymbolExpr(this);
		}
	}
}
export class NaturalSetSymbolExprContext extends SetSymbolContext {
	public _nn!: SetOfNaturalNumbersSymbolContext;
	public setOfNaturalNumbersSymbol(): SetOfNaturalNumbersSymbolContext {
		return this.getRuleContext(0, SetOfNaturalNumbersSymbolContext);
	}
	constructor(ctx: SetSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterNaturalSetSymbolExpr) {
			listener.enterNaturalSetSymbolExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitNaturalSetSymbolExpr) {
			listener.exitNaturalSetSymbolExpr(this);
		}
	}
}
export class RealSetSymbolExprContext extends SetSymbolContext {
	public _r!: SetOfRealNumbersSymbolContext;
	public setOfRealNumbersSymbol(): SetOfRealNumbersSymbolContext {
		return this.getRuleContext(0, SetOfRealNumbersSymbolContext);
	}
	constructor(ctx: SetSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRealSetSymbolExpr) {
			listener.enterRealSetSymbolExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRealSetSymbolExpr) {
			listener.exitRealSetSymbolExpr(this);
		}
	}
}
export class BooleanSetSymbolExprContext extends SetSymbolContext {
	public _b!: SetOfBooleanAlgebraSymbolContext;
	public setOfBooleanAlgebraSymbol(): SetOfBooleanAlgebraSymbolContext {
		return this.getRuleContext(0, SetOfBooleanAlgebraSymbolContext);
	}
	constructor(ctx: SetSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBooleanSetSymbolExpr) {
			listener.enterBooleanSetSymbolExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBooleanSetSymbolExpr) {
			listener.exitBooleanSetSymbolExpr(this);
		}
	}
}


export class SetNameContext extends ParserRuleContext {
	public UPPERCASEID(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.UPPERCASEID, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setName; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetName) {
			listener.enterSetName(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetName) {
			listener.exitSetName(this);
		}
	}
}


export class SetOfIntegerNumbersSymbolContext extends ParserRuleContext {
	public SETZSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SETZSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOfIntegerNumbersSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOfIntegerNumbersSymbol) {
			listener.enterSetOfIntegerNumbersSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOfIntegerNumbersSymbol) {
			listener.exitSetOfIntegerNumbersSymbol(this);
		}
	}
}


export class SetOfNaturalNumbersSymbolContext extends ParserRuleContext {
	public SETNSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SETNSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOfNaturalNumbersSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOfNaturalNumbersSymbol) {
			listener.enterSetOfNaturalNumbersSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOfNaturalNumbersSymbol) {
			listener.exitSetOfNaturalNumbersSymbol(this);
		}
	}
}


export class SetOfRealNumbersSymbolContext extends ParserRuleContext {
	public SETRSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SETRSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOfRealNumbersSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOfRealNumbersSymbol) {
			listener.enterSetOfRealNumbersSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOfRealNumbersSymbol) {
			listener.exitSetOfRealNumbersSymbol(this);
		}
	}
}


export class SetOfBooleanAlgebraSymbolContext extends ParserRuleContext {
	public SETBSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SETBSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOfBooleanAlgebraSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOfBooleanAlgebraSymbol) {
			listener.enterSetOfBooleanAlgebraSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOfBooleanAlgebraSymbol) {
			listener.exitSetOfBooleanAlgebraSymbol(this);
		}
	}
}


export class ElementCollectionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_elementCollection; }
	public copyFrom(ctx: ElementCollectionContext): void {
		super.copyFrom(ctx);
	}
}
export class ElementListExprContext extends ElementCollectionContext {
	public _e1!: ElementContext;
	public _element!: ElementContext;
	public _e2: ElementContext[] = [];
	public BEGINSET(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINSET, 0); }
	public ENDSET(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDSET, 0); }
	public element(): ElementContext[];
	public element(i: number): ElementContext;
	public element(i?: number): ElementContext | ElementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ElementContext);
		} else {
			return this.getRuleContext(i, ElementContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(ctx: ElementCollectionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementListExpr) {
			listener.enterElementListExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementListExpr) {
			listener.exitElementListExpr(this);
		}
	}
}
export class ElementSuchThatExprContext extends ElementCollectionContext {
	public _e!: ElementContext;
	public _def!: ElementDefinitionContext;
	public BEGINSET(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINSET, 0); }
	public SUCHTHAT(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SUCHTHAT, 0); }
	public ENDSET(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDSET, 0); }
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	public elementDefinition(): ElementDefinitionContext {
		return this.getRuleContext(0, ElementDefinitionContext);
	}
	constructor(ctx: ElementCollectionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementSuchThatExpr) {
			listener.enterElementSuchThatExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementSuchThatExpr) {
			listener.exitElementSuchThatExpr(this);
		}
	}
}
export class EmptySetExprContext extends ElementCollectionContext {
	public _es!: EmptySetSymbolContext;
	public emptySetSymbol(): EmptySetSymbolContext {
		return this.getRuleContext(0, EmptySetSymbolContext);
	}
	constructor(ctx: ElementCollectionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterEmptySetExpr) {
			listener.enterEmptySetExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitEmptySetExpr) {
			listener.exitEmptySetExpr(this);
		}
	}
}


export class ElementContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_element; }
	public copyFrom(ctx: ElementContext): void {
		super.copyFrom(ctx);
	}
}
export class ElementIdentifierContext extends ElementContext {
	public _id!: IdentifierContext;
	public identifier(): IdentifierContext {
		return this.getRuleContext(0, IdentifierContext);
	}
	constructor(ctx: ElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementIdentifier) {
			listener.enterElementIdentifier(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementIdentifier) {
			listener.exitElementIdentifier(this);
		}
	}
}
export class ElementNumberContext extends ElementContext {
	public _num!: NumberSymbolContext;
	public numberSymbol(): NumberSymbolContext {
		return this.getRuleContext(0, NumberSymbolContext);
	}
	constructor(ctx: ElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementNumber) {
			listener.enterElementNumber(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementNumber) {
			listener.exitElementNumber(this);
		}
	}
}
export class ElementBooleanContext extends ElementContext {
	public _bool!: BooleanSymbolContext;
	public booleanSymbol(): BooleanSymbolContext {
		return this.getRuleContext(0, BooleanSymbolContext);
	}
	constructor(ctx: ElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementBoolean) {
			listener.enterElementBoolean(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementBoolean) {
			listener.exitElementBoolean(this);
		}
	}
}
export class ElementModelSignatureContext extends ElementContext {
	public _sig!: ModelSignatureContext;
	public modelSignature(): ModelSignatureContext {
		return this.getRuleContext(0, ModelSignatureContext);
	}
	constructor(ctx: ElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementModelSignature) {
			listener.enterElementModelSignature(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementModelSignature) {
			listener.exitElementModelSignature(this);
		}
	}
}
export class ElementStringContext extends ElementContext {
	public _str!: StringSymbolContext;
	public stringSymbol(): StringSymbolContext {
		return this.getRuleContext(0, StringSymbolContext);
	}
	constructor(ctx: ElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementString) {
			listener.enterElementString(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementString) {
			listener.exitElementString(this);
		}
	}
}
export class ElementTupleContext extends ElementContext {
	public _tup!: TupleContext;
	public tuple(): TupleContext {
		return this.getRuleContext(0, TupleContext);
	}
	constructor(ctx: ElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementTuple) {
			listener.enterElementTuple(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementTuple) {
			listener.exitElementTuple(this);
		}
	}
}
export class ElementParameterContext extends ElementContext {
	public _par!: ParameterContext;
	public parameter(): ParameterContext {
		return this.getRuleContext(0, ParameterContext);
	}
	constructor(ctx: ElementContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementParameter) {
			listener.enterElementParameter(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementParameter) {
			listener.exitElementParameter(this);
		}
	}
}


export class TupleCollectionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_tupleCollection; }
	public copyFrom(ctx: TupleCollectionContext): void {
		super.copyFrom(ctx);
	}
}
export class TupleSuchThatExprContext extends TupleCollectionContext {
	public _t!: TupleContext;
	public _td!: TupleDefinitionContext;
	public BEGINSET(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINSET, 0); }
	public SUCHTHAT(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SUCHTHAT, 0); }
	public ENDSET(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDSET, 0); }
	public tuple(): TupleContext {
		return this.getRuleContext(0, TupleContext);
	}
	public tupleDefinition(): TupleDefinitionContext {
		return this.getRuleContext(0, TupleDefinitionContext);
	}
	constructor(ctx: TupleCollectionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTupleSuchThatExpr) {
			listener.enterTupleSuchThatExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTupleSuchThatExpr) {
			listener.exitTupleSuchThatExpr(this);
		}
	}
}


export class TupleContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_tuple; }
	public copyFrom(ctx: TupleContext): void {
		super.copyFrom(ctx);
	}
}
export class TupleExprContext extends TupleContext {
	public _e1!: ElementContext;
	public _element!: ElementContext;
	public _e2: ElementContext[] = [];
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public element(): ElementContext[];
	public element(i: number): ElementContext;
	public element(i?: number): ElementContext | ElementContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ElementContext);
		} else {
			return this.getRuleContext(i, ElementContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(ctx: TupleContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTupleExpr) {
			listener.enterTupleExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTupleExpr) {
			listener.exitTupleExpr(this);
		}
	}
}
export class EmptyTupleExprContext extends TupleContext {
	public _et!: EmptyTupleSymbolContext;
	public emptyTupleSymbol(): EmptyTupleSymbolContext {
		return this.getRuleContext(0, EmptyTupleSymbolContext);
	}
	constructor(ctx: TupleContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterEmptyTupleExpr) {
			listener.enterEmptyTupleExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitEmptyTupleExpr) {
			listener.exitEmptyTupleExpr(this);
		}
	}
}


export class VariableTupleContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_variableTuple; }
	public copyFrom(ctx: VariableTupleContext): void {
		super.copyFrom(ctx);
	}
}
export class VariableTupleExprContext extends VariableTupleContext {
	public _v1!: VariableContext;
	public _variable!: VariableContext;
	public _v2: VariableContext[] = [];
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public variable(): VariableContext[];
	public variable(i: number): VariableContext;
	public variable(i?: number): VariableContext | VariableContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableContext);
		} else {
			return this.getRuleContext(i, VariableContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(ctx: VariableTupleContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterVariableTupleExpr) {
			listener.enterVariableTupleExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitVariableTupleExpr) {
			listener.exitVariableTupleExpr(this);
		}
	}
}
export class EmptyVariableTupleExprContext extends VariableTupleContext {
	public _et!: EmptyTupleSymbolContext;
	public emptyTupleSymbol(): EmptyTupleSymbolContext {
		return this.getRuleContext(0, EmptyTupleSymbolContext);
	}
	constructor(ctx: VariableTupleContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterEmptyVariableTupleExpr) {
			listener.enterEmptyVariableTupleExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitEmptyVariableTupleExpr) {
			listener.exitEmptyVariableTupleExpr(this);
		}
	}
}


export class VariableTupleFixedValuesContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_variableTupleFixedValues; }
	public copyFrom(ctx: VariableTupleFixedValuesContext): void {
		super.copyFrom(ctx);
	}
}
export class VariableTupleFixedValuesExprContext extends VariableTupleFixedValuesContext {
	public _vfv1!: VariableFixedValuesContext;
	public _variableFixedValues!: VariableFixedValuesContext;
	public _vfv2: VariableFixedValuesContext[] = [];
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public variableFixedValues(): VariableFixedValuesContext[];
	public variableFixedValues(i: number): VariableFixedValuesContext;
	public variableFixedValues(i?: number): VariableFixedValuesContext | VariableFixedValuesContext[] {
		if (i === undefined) {
			return this.getRuleContexts(VariableFixedValuesContext);
		} else {
			return this.getRuleContext(i, VariableFixedValuesContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	constructor(ctx: VariableTupleFixedValuesContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterVariableTupleFixedValuesExpr) {
			listener.enterVariableTupleFixedValuesExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitVariableTupleFixedValuesExpr) {
			listener.exitVariableTupleFixedValuesExpr(this);
		}
	}
}
export class EmptyVariableTupleFixedValuesExprContext extends VariableTupleFixedValuesContext {
	public _et!: EmptyTupleSymbolContext;
	public emptyTupleSymbol(): EmptyTupleSymbolContext {
		return this.getRuleContext(0, EmptyTupleSymbolContext);
	}
	constructor(ctx: VariableTupleFixedValuesContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterEmptyVariableTupleFixedValuesExpr) {
			listener.enterEmptyVariableTupleFixedValuesExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitEmptyVariableTupleFixedValuesExpr) {
			listener.exitEmptyVariableTupleFixedValuesExpr(this);
		}
	}
}


export class TupleDefinitionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_tupleDefinition; }
	public copyFrom(ctx: TupleDefinitionContext): void {
		super.copyFrom(ctx);
	}
}
export class TupleDefinitionExprContext extends TupleDefinitionContext {
	public _ed1!: ElementDefinitionContext;
	public _elementDefinition!: ElementDefinitionContext;
	public _ed2: ElementDefinitionContext[] = [];
	public elementDefinition(): ElementDefinitionContext[];
	public elementDefinition(i: number): ElementDefinitionContext;
	public elementDefinition(i?: number): ElementDefinitionContext | ElementDefinitionContext[] {
		if (i === undefined) {
			return this.getRuleContexts(ElementDefinitionContext);
		} else {
			return this.getRuleContext(i, ElementDefinitionContext);
		}
	}
	public COMMA(): TerminalNode[];
	public COMMA(i: number): TerminalNode;
	public COMMA(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.COMMA);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.COMMA, i);
		}
	}
	public ANDOPERATOR(): TerminalNode[];
	public ANDOPERATOR(i: number): TerminalNode;
	public ANDOPERATOR(i?: number): TerminalNode | TerminalNode[] {
		if (i === undefined) {
			return this.getTokens(CFG_DEVS_MODELParser.ANDOPERATOR);
		} else {
			return this.getToken(CFG_DEVS_MODELParser.ANDOPERATOR, i);
		}
	}
	constructor(ctx: TupleDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTupleDefinitionExpr) {
			listener.enterTupleDefinitionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTupleDefinitionExpr) {
			listener.exitTupleDefinitionExpr(this);
		}
	}
}


export class ElementDefinitionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_elementDefinition; }
	public copyFrom(ctx: ElementDefinitionContext): void {
		super.copyFrom(ctx);
	}
}
export class ElementDefImplicitSetExprContext extends ElementDefinitionContext {
	public _d1!: DefinitionWithSetImplicitDefinitionContext;
	public definitionWithSetImplicitDefinition(): DefinitionWithSetImplicitDefinitionContext {
		return this.getRuleContext(0, DefinitionWithSetImplicitDefinitionContext);
	}
	constructor(ctx: ElementDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementDefImplicitSetExpr) {
			listener.enterElementDefImplicitSetExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementDefImplicitSetExpr) {
			listener.exitElementDefImplicitSetExpr(this);
		}
	}
}
export class ElementDefSetSymbolExprContext extends ElementDefinitionContext {
	public _d2!: DefinitionWithSetSymbolContext;
	public definitionWithSetSymbol(): DefinitionWithSetSymbolContext {
		return this.getRuleContext(0, DefinitionWithSetSymbolContext);
	}
	constructor(ctx: ElementDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementDefSetSymbolExpr) {
			listener.enterElementDefSetSymbolExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementDefSetSymbolExpr) {
			listener.exitElementDefSetSymbolExpr(this);
		}
	}
}
export class ElementDefRangeExprContext extends ElementDefinitionContext {
	public _d3!: DefinitionWithRangeContext;
	public definitionWithRange(): DefinitionWithRangeContext {
		return this.getRuleContext(0, DefinitionWithRangeContext);
	}
	constructor(ctx: ElementDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterElementDefRangeExpr) {
			listener.enterElementDefRangeExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitElementDefRangeExpr) {
			listener.exitElementDefRangeExpr(this);
		}
	}
}


export class DefinitionWithSetImplicitDefinitionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_definitionWithSetImplicitDefinition; }
	public copyFrom(ctx: DefinitionWithSetImplicitDefinitionContext): void {
		super.copyFrom(ctx);
	}
}
export class DefWithImplicitSetExprContext extends DefinitionWithSetImplicitDefinitionContext {
	public _e!: ElementContext;
	public _op!: BelongsToOperatorContext;
	public _s!: SetImplicitDefinitionContext;
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	public belongsToOperator(): BelongsToOperatorContext {
		return this.getRuleContext(0, BelongsToOperatorContext);
	}
	public setImplicitDefinition(): SetImplicitDefinitionContext {
		return this.getRuleContext(0, SetImplicitDefinitionContext);
	}
	constructor(ctx: DefinitionWithSetImplicitDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDefWithImplicitSetExpr) {
			listener.enterDefWithImplicitSetExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDefWithImplicitSetExpr) {
			listener.exitDefWithImplicitSetExpr(this);
		}
	}
}
export class DefCollectionWithImplicitSetExprContext extends DefinitionWithSetImplicitDefinitionContext {
	public _ec!: ElementCollectionContext;
	public _op!: BelongsToOperatorContext;
	public _s!: SetImplicitDefinitionContext;
	public elementCollection(): ElementCollectionContext {
		return this.getRuleContext(0, ElementCollectionContext);
	}
	public belongsToOperator(): BelongsToOperatorContext {
		return this.getRuleContext(0, BelongsToOperatorContext);
	}
	public setImplicitDefinition(): SetImplicitDefinitionContext {
		return this.getRuleContext(0, SetImplicitDefinitionContext);
	}
	constructor(ctx: DefinitionWithSetImplicitDefinitionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDefCollectionWithImplicitSetExpr) {
			listener.enterDefCollectionWithImplicitSetExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDefCollectionWithImplicitSetExpr) {
			listener.exitDefCollectionWithImplicitSetExpr(this);
		}
	}
}


export class DefinitionWithSetSymbolContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_definitionWithSetSymbol; }
	public copyFrom(ctx: DefinitionWithSetSymbolContext): void {
		super.copyFrom(ctx);
	}
}
export class DefWithSymbolSetExprContext extends DefinitionWithSetSymbolContext {
	public _e!: ElementContext;
	public _op!: BelongsToOperatorContext;
	public _s!: SetSymbolContext;
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	public belongsToOperator(): BelongsToOperatorContext {
		return this.getRuleContext(0, BelongsToOperatorContext);
	}
	public setSymbol(): SetSymbolContext {
		return this.getRuleContext(0, SetSymbolContext);
	}
	constructor(ctx: DefinitionWithSetSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDefWithSymbolSetExpr) {
			listener.enterDefWithSymbolSetExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDefWithSymbolSetExpr) {
			listener.exitDefWithSymbolSetExpr(this);
		}
	}
}
export class DefCollectionWithSymbolSetExprContext extends DefinitionWithSetSymbolContext {
	public _ec!: ElementCollectionContext;
	public _op!: BelongsToOperatorContext;
	public _s!: SetSymbolContext;
	public elementCollection(): ElementCollectionContext {
		return this.getRuleContext(0, ElementCollectionContext);
	}
	public belongsToOperator(): BelongsToOperatorContext {
		return this.getRuleContext(0, BelongsToOperatorContext);
	}
	public setSymbol(): SetSymbolContext {
		return this.getRuleContext(0, SetSymbolContext);
	}
	constructor(ctx: DefinitionWithSetSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDefCollectionWithSymbolSetExpr) {
			listener.enterDefCollectionWithSymbolSetExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDefCollectionWithSymbolSetExpr) {
			listener.exitDefCollectionWithSymbolSetExpr(this);
		}
	}
}


export class DefinitionWithRangeContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_definitionWithRange; }
	public copyFrom(ctx: DefinitionWithRangeContext): void {
		super.copyFrom(ctx);
	}
}
export class DefWithRangeExprContext extends DefinitionWithRangeContext {
	public _e!: ElementContext;
	public _op!: BelongsToOperatorContext;
	public _r!: RangeContext;
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	public belongsToOperator(): BelongsToOperatorContext {
		return this.getRuleContext(0, BelongsToOperatorContext);
	}
	public range(): RangeContext {
		return this.getRuleContext(0, RangeContext);
	}
	constructor(ctx: DefinitionWithRangeContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDefWithRangeExpr) {
			listener.enterDefWithRangeExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDefWithRangeExpr) {
			listener.exitDefWithRangeExpr(this);
		}
	}
}
export class DefCollectionWithRangeExprContext extends DefinitionWithRangeContext {
	public _ec!: ElementCollectionContext;
	public _op!: BelongsToOperatorContext;
	public _r!: RangeContext;
	public elementCollection(): ElementCollectionContext {
		return this.getRuleContext(0, ElementCollectionContext);
	}
	public belongsToOperator(): BelongsToOperatorContext {
		return this.getRuleContext(0, BelongsToOperatorContext);
	}
	public range(): RangeContext {
		return this.getRuleContext(0, RangeContext);
	}
	constructor(ctx: DefinitionWithRangeContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDefCollectionWithRangeExpr) {
			listener.enterDefCollectionWithRangeExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDefCollectionWithRangeExpr) {
			listener.exitDefCollectionWithRangeExpr(this);
		}
	}
}


export class RangeContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_range; }
	public copyFrom(ctx: RangeContext): void {
		super.copyFrom(ctx);
	}
}
export class RangeExprContext extends RangeContext {
	public _n1!: NumberSymbolContext;
	public _n2n!: NumberSymbolContext;
	public _n2i!: InfinitySymbolContext;
	public COMMA(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.COMMA, 0); }
	public BEGINPARENTHESES(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public BEGINBRACKET(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.BEGINBRACKET, 0); }
	public numberSymbol(): NumberSymbolContext[];
	public numberSymbol(i: number): NumberSymbolContext;
	public numberSymbol(i?: number): NumberSymbolContext | NumberSymbolContext[] {
		if (i === undefined) {
			return this.getRuleContexts(NumberSymbolContext);
		} else {
			return this.getRuleContext(i, NumberSymbolContext);
		}
	}
	public ENDPARENTHESES(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public ENDBRACKET(): TerminalNode | undefined { return this.tryGetToken(CFG_DEVS_MODELParser.ENDBRACKET, 0); }
	public infinitySymbol(): InfinitySymbolContext | undefined {
		return this.tryGetRuleContext(0, InfinitySymbolContext);
	}
	constructor(ctx: RangeContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRangeExpr) {
			listener.enterRangeExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRangeExpr) {
			listener.exitRangeExpr(this);
		}
	}
}


export class BooleanSymbolContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_booleanSymbol; }
	public copyFrom(ctx: BooleanSymbolContext): void {
		super.copyFrom(ctx);
	}
}
export class TrueExprContext extends BooleanSymbolContext {
	public _t!: TrueSymbolContext;
	public trueSymbol(): TrueSymbolContext {
		return this.getRuleContext(0, TrueSymbolContext);
	}
	constructor(ctx: BooleanSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterTrueExpr) {
			listener.enterTrueExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitTrueExpr) {
			listener.exitTrueExpr(this);
		}
	}
}
export class FalseExprContext extends BooleanSymbolContext {
	public _f!: FalseSymbolContext;
	public falseSymbol(): FalseSymbolContext {
		return this.getRuleContext(0, FalseSymbolContext);
	}
	constructor(ctx: BooleanSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterFalseExpr) {
			listener.enterFalseExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitFalseExpr) {
			listener.exitFalseExpr(this);
		}
	}
}


export class NumberSymbolContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_numberSymbol; }
	public copyFrom(ctx: NumberSymbolContext): void {
		super.copyFrom(ctx);
	}
}
export class IntegerExprContext extends NumberSymbolContext {
	public _i!: IntegerSymbolContext;
	public integerSymbol(): IntegerSymbolContext {
		return this.getRuleContext(0, IntegerSymbolContext);
	}
	constructor(ctx: NumberSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIntegerExpr) {
			listener.enterIntegerExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIntegerExpr) {
			listener.exitIntegerExpr(this);
		}
	}
}
export class RealExprContext extends NumberSymbolContext {
	public _r!: RealSymbolContext;
	public realSymbol(): RealSymbolContext {
		return this.getRuleContext(0, RealSymbolContext);
	}
	constructor(ctx: NumberSymbolContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterRealExpr) {
			listener.enterRealExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitRealExpr) {
			listener.exitRealExpr(this);
		}
	}
}


export class EmptySetSymbolContext extends ParserRuleContext {
	public EMPTYSETSYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EMPTYSETSYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_emptySetSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterEmptySetSymbol) {
			listener.enterEmptySetSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitEmptySetSymbol) {
			listener.exitEmptySetSymbol(this);
		}
	}
}


export class EmptyTupleSymbolContext extends ParserRuleContext {
	public EMPTYTUPLESYMBOL(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.EMPTYTUPLESYMBOL, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_emptyTupleSymbol; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterEmptyTupleSymbol) {
			listener.enterEmptyTupleSymbol(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitEmptyTupleSymbol) {
			listener.exitEmptyTupleSymbol(this);
		}
	}
}


export class SetOperationResultContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOperationResult; }
	public copyFrom(ctx: SetOperationResultContext): void {
		super.copyFrom(ctx);
	}
}
export class SetOperationExprContext extends SetOperationResultContext {
	public _left!: SetOperationTermContext;
	public _setOperator!: SetOperatorContext;
	public _op: SetOperatorContext[] = [];
	public _setOperationTerm!: SetOperationTermContext;
	public _right: SetOperationTermContext[] = [];
	public setOperationTerm(): SetOperationTermContext[];
	public setOperationTerm(i: number): SetOperationTermContext;
	public setOperationTerm(i?: number): SetOperationTermContext | SetOperationTermContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SetOperationTermContext);
		} else {
			return this.getRuleContext(i, SetOperationTermContext);
		}
	}
	public setOperator(): SetOperatorContext[];
	public setOperator(i: number): SetOperatorContext;
	public setOperator(i?: number): SetOperatorContext | SetOperatorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(SetOperatorContext);
		} else {
			return this.getRuleContext(i, SetOperatorContext);
		}
	}
	constructor(ctx: SetOperationResultContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOperationExpr) {
			listener.enterSetOperationExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOperationExpr) {
			listener.exitSetOperationExpr(this);
		}
	}
}


export class SetOperationTermContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOperationTerm; }
	public copyFrom(ctx: SetOperationTermContext): void {
		super.copyFrom(ctx);
	}
}
export class OperationSetExprContext extends SetOperationTermContext {
	public _s1!: OperationSetContext;
	public operationSet(): OperationSetContext {
		return this.getRuleContext(0, OperationSetContext);
	}
	constructor(ctx: SetOperationTermContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterOperationSetExpr) {
			listener.enterOperationSetExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitOperationSetExpr) {
			listener.exitOperationSetExpr(this);
		}
	}
}
export class SetOperationParExprContext extends SetOperationTermContext {
	public _par!: SetOperationExpressionContext;
	public setOperationExpression(): SetOperationExpressionContext {
		return this.getRuleContext(0, SetOperationExpressionContext);
	}
	constructor(ctx: SetOperationTermContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOperationParExpr) {
			listener.enterSetOperationParExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOperationParExpr) {
			listener.exitSetOperationParExpr(this);
		}
	}
}


export class SetOperationExpressionContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOperationExpression; }
	public copyFrom(ctx: SetOperationExpressionContext): void {
		super.copyFrom(ctx);
	}
}
export class SetOperationParenthesisExprContext extends SetOperationExpressionContext {
	public _expr!: SetOperationResultContext;
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public setOperationResult(): SetOperationResultContext {
		return this.getRuleContext(0, SetOperationResultContext);
	}
	constructor(ctx: SetOperationExpressionContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetOperationParenthesisExpr) {
			listener.enterSetOperationParenthesisExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetOperationParenthesisExpr) {
			listener.exitSetOperationParenthesisExpr(this);
		}
	}
}


export class OperationSetContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_operationSet; }
	public copyFrom(ctx: OperationSetContext): void {
		super.copyFrom(ctx);
	}
}
export class OperationSetDefinitionExprContext extends OperationSetContext {
	public _sd!: SetDefinitionContext;
	public setDefinition(): SetDefinitionContext {
		return this.getRuleContext(0, SetDefinitionContext);
	}
	constructor(ctx: OperationSetContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterOperationSetDefinitionExpr) {
			listener.enterOperationSetDefinitionExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitOperationSetDefinitionExpr) {
			listener.exitOperationSetDefinitionExpr(this);
		}
	}
}
export class OperationSetSymbolExprContext extends OperationSetContext {
	public _ss!: SetSymbolContext;
	public setSymbol(): SetSymbolContext {
		return this.getRuleContext(0, SetSymbolContext);
	}
	constructor(ctx: OperationSetContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterOperationSetSymbolExpr) {
			listener.enterOperationSetSymbolExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitOperationSetSymbolExpr) {
			listener.exitOperationSetSymbolExpr(this);
		}
	}
}


export class BelongsToOperatorContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_belongsToOperator; }
	public copyFrom(ctx: BelongsToOperatorContext): void {
		super.copyFrom(ctx);
	}
}
export class InOperatorExprContext extends BelongsToOperatorContext {
	public inOperator(): InOperatorContext {
		return this.getRuleContext(0, InOperatorContext);
	}
	constructor(ctx: BelongsToOperatorContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterInOperatorExpr) {
			listener.enterInOperatorExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitInOperatorExpr) {
			listener.exitInOperatorExpr(this);
		}
	}
}
export class NotInOperatorExprContext extends BelongsToOperatorContext {
	public notInOperator(): NotInOperatorContext {
		return this.getRuleContext(0, NotInOperatorContext);
	}
	constructor(ctx: BelongsToOperatorContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterNotInOperatorExpr) {
			listener.enterNotInOperatorExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitNotInOperatorExpr) {
			listener.exitNotInOperatorExpr(this);
		}
	}
}


export class InOperatorContext extends ParserRuleContext {
	public INOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.INOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_inOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterInOperator) {
			listener.enterInOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitInOperator) {
			listener.exitInOperator(this);
		}
	}
}


export class NotInOperatorContext extends ParserRuleContext {
	public NOTINOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.NOTINOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_notInOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterNotInOperator) {
			listener.enterNotInOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitNotInOperator) {
			listener.exitNotInOperator(this);
		}
	}
}


export class SetOperatorContext extends ParserRuleContext {
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setOperator; }
	public copyFrom(ctx: SetOperatorContext): void {
		super.copyFrom(ctx);
	}
}
export class CartesianProductOpExprContext extends SetOperatorContext {
	public cartesianProductOperator(): CartesianProductOperatorContext {
		return this.getRuleContext(0, CartesianProductOperatorContext);
	}
	constructor(ctx: SetOperatorContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterCartesianProductOpExpr) {
			listener.enterCartesianProductOpExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitCartesianProductOpExpr) {
			listener.exitCartesianProductOpExpr(this);
		}
	}
}
export class UnionOpExprContext extends SetOperatorContext {
	public unionOperator(): UnionOperatorContext {
		return this.getRuleContext(0, UnionOperatorContext);
	}
	constructor(ctx: SetOperatorContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterUnionOpExpr) {
			listener.enterUnionOpExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitUnionOpExpr) {
			listener.exitUnionOpExpr(this);
		}
	}
}
export class IntersectionOpExprContext extends SetOperatorContext {
	public intersectionOperator(): IntersectionOperatorContext {
		return this.getRuleContext(0, IntersectionOperatorContext);
	}
	constructor(ctx: SetOperatorContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIntersectionOpExpr) {
			listener.enterIntersectionOpExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIntersectionOpExpr) {
			listener.exitIntersectionOpExpr(this);
		}
	}
}
export class DifferenceOpExprContext extends SetOperatorContext {
	public setdifferenceOperator(): SetdifferenceOperatorContext {
		return this.getRuleContext(0, SetdifferenceOperatorContext);
	}
	constructor(ctx: SetOperatorContext) {
		super(ctx.parent, ctx.invokingState);
		this.copyFrom(ctx);
	}
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDifferenceOpExpr) {
			listener.enterDifferenceOpExpr(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDifferenceOpExpr) {
			listener.exitDifferenceOpExpr(this);
		}
	}
}


export class CartesianProductOperatorContext extends ParserRuleContext {
	public CARTESIANPRODUCTOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.CARTESIANPRODUCTOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_cartesianProductOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterCartesianProductOperator) {
			listener.enterCartesianProductOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitCartesianProductOperator) {
			listener.exitCartesianProductOperator(this);
		}
	}
}


export class UnionOperatorContext extends ParserRuleContext {
	public UNIONOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.UNIONOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_unionOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterUnionOperator) {
			listener.enterUnionOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitUnionOperator) {
			listener.exitUnionOperator(this);
		}
	}
}


export class IntersectionOperatorContext extends ParserRuleContext {
	public INTERSECTIONOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.INTERSECTIONOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_intersectionOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterIntersectionOperator) {
			listener.enterIntersectionOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitIntersectionOperator) {
			listener.exitIntersectionOperator(this);
		}
	}
}


export class SetdifferenceOperatorContext extends ParserRuleContext {
	public SETDIFFERENCEOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SETDIFFERENCEOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_setdifferenceOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSetdifferenceOperator) {
			listener.enterSetdifferenceOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSetdifferenceOperator) {
			listener.exitSetdifferenceOperator(this);
		}
	}
}


export class MathExpressionContext extends ParserRuleContext {
	public binaryMathExpression(): BinaryMathExpressionContext | undefined {
		return this.tryGetRuleContext(0, BinaryMathExpressionContext);
	}
	public mathExpressionTerm(): MathExpressionTermContext | undefined {
		return this.tryGetRuleContext(0, MathExpressionTermContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_mathExpression; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMathExpression) {
			listener.enterMathExpression(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMathExpression) {
			listener.exitMathExpression(this);
		}
	}
}


export class BinaryMathExpressionContext extends ParserRuleContext {
	public _left!: MathExpressionTermContext;
	public _op!: BinaryMathOperatorLowerPrecedenceContext;
	public _right!: MathExpressionTermContext;
	public mathExpressionTerm(): MathExpressionTermContext[];
	public mathExpressionTerm(i: number): MathExpressionTermContext;
	public mathExpressionTerm(i?: number): MathExpressionTermContext | MathExpressionTermContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MathExpressionTermContext);
		} else {
			return this.getRuleContext(i, MathExpressionTermContext);
		}
	}
	public binaryMathOperatorLowerPrecedence(): BinaryMathOperatorLowerPrecedenceContext {
		return this.getRuleContext(0, BinaryMathOperatorLowerPrecedenceContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_binaryMathExpression; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBinaryMathExpression) {
			listener.enterBinaryMathExpression(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBinaryMathExpression) {
			listener.exitBinaryMathExpression(this);
		}
	}
}


export class MathExpressionTermContext extends ParserRuleContext {
	public mathTerm(): MathTermContext | undefined {
		return this.tryGetRuleContext(0, MathTermContext);
	}
	public unaryMathExpression(): UnaryMathExpressionContext | undefined {
		return this.tryGetRuleContext(0, UnaryMathExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_mathExpressionTerm; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMathExpressionTerm) {
			listener.enterMathExpressionTerm(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMathExpressionTerm) {
			listener.exitMathExpressionTerm(this);
		}
	}
}


export class UnaryMathExpressionContext extends ParserRuleContext {
	public _op!: UnaryMathOperatorContext;
	public _operand!: MathExpressionTermContext;
	public unaryMathOperator(): UnaryMathOperatorContext {
		return this.getRuleContext(0, UnaryMathOperatorContext);
	}
	public mathExpressionTerm(): MathExpressionTermContext {
		return this.getRuleContext(0, MathExpressionTermContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_unaryMathExpression; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterUnaryMathExpression) {
			listener.enterUnaryMathExpression(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitUnaryMathExpression) {
			listener.exitUnaryMathExpression(this);
		}
	}
}


export class MathTermContext extends ParserRuleContext {
	public _left!: MathFactorContext;
	public _op!: BinaryMathOperatorHigherPrecedenceContext;
	public _right!: MathFactorContext;
	public mathFactor(): MathFactorContext[];
	public mathFactor(i: number): MathFactorContext;
	public mathFactor(i?: number): MathFactorContext | MathFactorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MathFactorContext);
		} else {
			return this.getRuleContext(i, MathFactorContext);
		}
	}
	public binaryMathOperatorHigherPrecedence(): BinaryMathOperatorHigherPrecedenceContext[];
	public binaryMathOperatorHigherPrecedence(i: number): BinaryMathOperatorHigherPrecedenceContext;
	public binaryMathOperatorHigherPrecedence(i?: number): BinaryMathOperatorHigherPrecedenceContext | BinaryMathOperatorHigherPrecedenceContext[] {
		if (i === undefined) {
			return this.getRuleContexts(BinaryMathOperatorHigherPrecedenceContext);
		} else {
			return this.getRuleContext(i, BinaryMathOperatorHigherPrecedenceContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_mathTerm; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMathTerm) {
			listener.enterMathTerm(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMathTerm) {
			listener.exitMathTerm(this);
		}
	}
}


export class MathFactorContext extends ParserRuleContext {
	public _left!: MathExpressionBasicTermContext;
	public _op!: PowerOperatorContext;
	public _right!: MathExpressionBasicTermContext;
	public mathExpressionBasicTerm(): MathExpressionBasicTermContext[];
	public mathExpressionBasicTerm(i: number): MathExpressionBasicTermContext;
	public mathExpressionBasicTerm(i?: number): MathExpressionBasicTermContext | MathExpressionBasicTermContext[] {
		if (i === undefined) {
			return this.getRuleContexts(MathExpressionBasicTermContext);
		} else {
			return this.getRuleContext(i, MathExpressionBasicTermContext);
		}
	}
	public powerOperator(): PowerOperatorContext[];
	public powerOperator(i: number): PowerOperatorContext;
	public powerOperator(i?: number): PowerOperatorContext | PowerOperatorContext[] {
		if (i === undefined) {
			return this.getRuleContexts(PowerOperatorContext);
		} else {
			return this.getRuleContext(i, PowerOperatorContext);
		}
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_mathFactor; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMathFactor) {
			listener.enterMathFactor(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMathFactor) {
			listener.exitMathFactor(this);
		}
	}
}


export class MathExpressionBasicTermContext extends ParserRuleContext {
	public mathExpressionElement(): MathExpressionElementContext | undefined {
		return this.tryGetRuleContext(0, MathExpressionElementContext);
	}
	public mathExpressionResult(): MathExpressionResultContext | undefined {
		return this.tryGetRuleContext(0, MathExpressionResultContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_mathExpressionBasicTerm; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMathExpressionBasicTerm) {
			listener.enterMathExpressionBasicTerm(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMathExpressionBasicTerm) {
			listener.exitMathExpressionBasicTerm(this);
		}
	}
}


export class MathExpressionElementContext extends ParserRuleContext {
	public _el!: ElementContext;
	public element(): ElementContext {
		return this.getRuleContext(0, ElementContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_mathExpressionElement; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMathExpressionElement) {
			listener.enterMathExpressionElement(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMathExpressionElement) {
			listener.exitMathExpressionElement(this);
		}
	}
}


export class MathExpressionResultContext extends ParserRuleContext {
	public _inner!: MathExpressionContext;
	public BEGINPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.BEGINPARENTHESES, 0); }
	public ENDPARENTHESES(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ENDPARENTHESES, 0); }
	public mathExpression(): MathExpressionContext {
		return this.getRuleContext(0, MathExpressionContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_mathExpressionResult; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMathExpressionResult) {
			listener.enterMathExpressionResult(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMathExpressionResult) {
			listener.exitMathExpressionResult(this);
		}
	}
}


export class UnaryMathOperatorContext extends ParserRuleContext {
	public sqrtOperator(): SqrtOperatorContext {
		return this.getRuleContext(0, SqrtOperatorContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_unaryMathOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterUnaryMathOperator) {
			listener.enterUnaryMathOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitUnaryMathOperator) {
			listener.exitUnaryMathOperator(this);
		}
	}
}


export class BinaryMathOperatorLowerPrecedenceContext extends ParserRuleContext {
	public additionOperator(): AdditionOperatorContext | undefined {
		return this.tryGetRuleContext(0, AdditionOperatorContext);
	}
	public substractionOperator(): SubstractionOperatorContext | undefined {
		return this.tryGetRuleContext(0, SubstractionOperatorContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_binaryMathOperatorLowerPrecedence; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBinaryMathOperatorLowerPrecedence) {
			listener.enterBinaryMathOperatorLowerPrecedence(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBinaryMathOperatorLowerPrecedence) {
			listener.exitBinaryMathOperatorLowerPrecedence(this);
		}
	}
}


export class BinaryMathOperatorHigherPrecedenceContext extends ParserRuleContext {
	public multiplicationOperator(): MultiplicationOperatorContext | undefined {
		return this.tryGetRuleContext(0, MultiplicationOperatorContext);
	}
	public divisionOperator(): DivisionOperatorContext | undefined {
		return this.tryGetRuleContext(0, DivisionOperatorContext);
	}
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_binaryMathOperatorHigherPrecedence; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterBinaryMathOperatorHigherPrecedence) {
			listener.enterBinaryMathOperatorHigherPrecedence(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitBinaryMathOperatorHigherPrecedence) {
			listener.exitBinaryMathOperatorHigherPrecedence(this);
		}
	}
}


export class SqrtOperatorContext extends ParserRuleContext {
	public SQRTOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SQRTOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_sqrtOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSqrtOperator) {
			listener.enterSqrtOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSqrtOperator) {
			listener.exitSqrtOperator(this);
		}
	}
}


export class AdditionOperatorContext extends ParserRuleContext {
	public ADDITIONOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.ADDITIONOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_additionOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterAdditionOperator) {
			listener.enterAdditionOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitAdditionOperator) {
			listener.exitAdditionOperator(this);
		}
	}
}


export class SubstractionOperatorContext extends ParserRuleContext {
	public SUBSTRACTIONOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.SUBSTRACTIONOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_substractionOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterSubstractionOperator) {
			listener.enterSubstractionOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitSubstractionOperator) {
			listener.exitSubstractionOperator(this);
		}
	}
}


export class MultiplicationOperatorContext extends ParserRuleContext {
	public MULTIPLICATIONOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.MULTIPLICATIONOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_multiplicationOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterMultiplicationOperator) {
			listener.enterMultiplicationOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitMultiplicationOperator) {
			listener.exitMultiplicationOperator(this);
		}
	}
}


export class DivisionOperatorContext extends ParserRuleContext {
	public DIVISIONOPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.DIVISIONOPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_divisionOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterDivisionOperator) {
			listener.enterDivisionOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitDivisionOperator) {
			listener.exitDivisionOperator(this);
		}
	}
}


export class PowerOperatorContext extends ParserRuleContext {
	public POWEROPERATOR(): TerminalNode { return this.getToken(CFG_DEVS_MODELParser.POWEROPERATOR, 0); }
	constructor(parent: ParserRuleContext | undefined, invokingState: number) {
		super(parent, invokingState);
	}
	// @Override
	public get ruleIndex(): number { return CFG_DEVS_MODELParser.RULE_powerOperator; }
	// @Override
	public enterRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.enterPowerOperator) {
			listener.enterPowerOperator(this);
		}
	}
	// @Override
	public exitRule(listener: CFG_DEVS_MODELListener): void {
		if (listener.exitPowerOperator) {
			listener.exitPowerOperator(this);
		}
	}
}


