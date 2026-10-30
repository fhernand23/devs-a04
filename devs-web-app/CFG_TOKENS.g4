//-------------------------------------------------------------------------------------------------------------------------------------------
/* Defining the basic elements and tokens to be used in the grammar */
//-------------------------------------------------------------------------------------------------------------------------------------------

grammar CFG_TOKENS;

/* ----- Model basic elements ----- */
modelSignature: modelSymbol | modelSymbol BEGINPARENTHESES parametersList ENDPARENTHESES;
modelSymbol: UPPERCASEID | LOWERCASEID | FULLCASEID;
parameter: HASH LOWERCASEID;
identifier: LOWERCASEID;
variable: LOWERCASEID APOSTROPHE;
variableFixedValues: variable | datatypeSymbol | identifier;
parametersList: parameter (COMMA parameter)*;

/* ----- Data types elements ----- */
datatypeSymbol: trueSymbol | falseSymbol | integerSymbol | realSymbol | infinitySymbol | stringSymbol;
trueSymbol: TRUESYMBOL;
falseSymbol: FALSESYMBOL;
integerSymbol: INTEGERSYMBOL;
realSymbol: REALSYMBOL;
infinitySymbol: INFINITYSYMBOL;
stringSymbol: STRINGSYMBOL;

/* ----- Model tag elements ----- */
UPPERCASEID: [A-Z]([A-Z_0-9])*;
LOWERCASEID: [a-z]([a-z_0-9])*;
FULLCASEID: [a-zA-Z]([a-zA-Z_0-9])*;

/* ----- Basic elements (Symbols) ----- */
STRINGSYMBOL: QUOTE [a-zA-Z]([a-zA-Z_0-9])* QUOTE;
INTEGERSYMBOL: '0' | [1-9][0-9]*;
REALSYMBOL: ('0' | [1-9][0-9]*) ('.'[0-9]+);

/* ----- Keywords (Symbols) ----- */
EMPTYSETSYMBOL: '\\emptySet';
EMPTYTUPLESYMBOL: '\\emptyTuple';
WHERESYMBOL: '\\where';
DELTAEXTNAMESYMBOL: '\\delExt';
DELTAINTNAMESYMBOL: '\\delInt';
LAMBDANAMESYMBOL: '\\lambda';
SELECTNAMESYMBOL: '\\select';
TANAMESYMBOL: '\\ta';
TRUESYMBOL: '\\true';
FALSESYMBOL: '\\false';
SETZSYMBOL: '\\Z';
SETNSYMBOL: '\\N';
SETRSYMBOL: '\\R';
SETBSYMBOL: '\\B';
IFSYMBOL: '\\if';
THENSYMBOL: '\\then';
INOTHERCASESYMBOL: '\\inOtherCase';
OTHERWISESYMBOL: '\\otherwise';
INFINITYSYMBOL: '\\infinity';

/* ----- Keywords (Operators) ----- */
ASSIGNOPERATOR: '\\assign';
INOPERATOR: '\\in';
NOTINOPERATOR: '\\notIn';
CARTESIANPRODUCTOPERATOR: '\\product';
UNIONOPERATOR: '\\union';
INTERSECTIONOPERATOR: '\\intersection';
SETDIFFERENCEOPERATOR: '\\setDifference';
NOTOPERATOR: '\\not';
ANDOPERATOR: '\\and';
OROPERATOR: '\\or';
EQUALTOOPERATOR: '\\equalTo';
NOTEQUALTOOPERATOR: '\\notEqualTo';
GREATERTHANOPERATOR: '\\greaterThan';
LESSTHANOPERATOR: '\\lessThan';
GREATERTHANOREQUALTOOPERATOR: '\\greaterThanOrEqualTo';
LESSTHANOREQUALTOOPERATOR: '\\lessThanOrEqualTo';
SQRTOPERATOR: '\\sqrt';
ADDITIONOPERATOR:  '\\addition';
SUBSTRACTIONOPERATOR:  '\\substraction';
MULTIPLICATIONOPERATOR:  '\\multiplication';
DIVISIONOPERATOR:  '\\division';
POWEROPERATOR: '\\power';

/* ----- Special characters ----- */
APOSTROPHE: '\'';
HASH: '#';
COMMA: ',';
BEGINBRACKET: '[';
ENDBRACKET: ']';
BEGINSET: '{';
ENDSET: '}';
BEGINPARENTHESES: '(';
ENDPARENTHESES: ')';
COLON: ':';
SEMICOLON	: ';';
EQUAL: '=';
SUCHTHAT: '|';
QUOTE: '"';

/* ----- Characters to be ignored ----- */
IGNOREEMPTY: (' '|'\n'|'\r'|'\t') -> skip;
