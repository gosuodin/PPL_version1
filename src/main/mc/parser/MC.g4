/**
 * Student name: Nguyễn Thanh Hùng
 * Student ID: 1511358
 */
grammar MC;

@lexer::header{
	package mc.parser;
}

@lexer::members{
@Override
public Token emit() {
    switch (getType()) {
    case UNCLOSE_STRING:       
        Token result = super.emit();
        // you'll need to define this method
        throw new UncloseString(result.getText());
        
    case ILLEGAL_ESCAPE:
    	result = super.emit();
    	throw new IllegalEscape(result.getText());

    case ERROR_CHAR:
    	result = super.emit();
    	throw new ErrorToken(result.getText());	

    default:
        return super.emit();
    }
}
}

@parser::header{
	package mc.parser;
}

options{
	language=Java;
}

program: (declarations)+ EOF;

declarations: (variabledeclarations|functiondeclarations);

variabledeclarations: primitivetype (variable|manyvariable) SEMI;

primitivetype: (INTTYPE|FLOATTYPE|STRINGTYPE|BOOLTYPE);

variable: ID ('['  INTLIT  ']')?;

manyvariable : variable (COMMA variable)+;

functiondeclarations: type funtionname LB parameterlist RB blockstatement;

type: (primitivetype|VOIDTYPE|outputpara); // chua lam xong

arraypointtype: inputpara|outputpara;
inputpara: primitivetype ID LSB RSB;
outputpara : primitivetype LSB RSB;
funtionname: ID;

parameterlist:  (parameterdeclaration (COMMA parameterdeclaration)*)?;

parameterdeclaration: primitivetype ID (LSB RSB)?;

blockstatement: LP variabledeclarations* statementpart* RP;



expressionstatement: expression SEMI;


statementpart : ifstatement
              | dowhilestatement
              | forstatement
              | breakstatement
              | continuestatement
              | returnstatement
              | expressionstatement
              | blockstatement
      ;
ifstatement: IFTYPE LB expression  RB   statementpart (ELSETYPE  statementpart)? ;

dowhilestatement: DOTYPE  (statementpart)+ WHILETYPE expression SEMI;

forstatement: FORTYPE LB expression SEMI expression  SEMI expression RB statementpart ;

breakstatement: BREAKTYPE SEMI;

continuestatement: CONTINUETYPE SEMI;

returnstatement: RETURNTYPE list_expression? SEMI;

functioncall: ID LB list_expression? RB ;
list_expression: expression (',' expression)*;

/*
expression: <assoc = right> expression '=' expression
          | expression'||' expression
          | expression'&&' expression
          | <assoc = no>expression ('=='|'!=') expression
          | <assoc = no>expression ('<'|'<='|'>'|'>=')expression
          |expression ('+'|'-') expression
          | expression ('/'|'*'|'%') expression
          | <assoc = right>('!'|'-') expression
          |<assoc = no>expression'['expression']'
          |<assoc = no>'('expression')'
          |(FLOATLIT|INTLIT|ID|('true'|'false')|functioncall|STRINGLIT)
     ;
     
  */
expression: expression1 '=' expression
          |expression1;
expression1: expression1'||' expression2
          | expression2;
expression2 :expression2'&&' expression3
          |expression3;
 expression3:expression4 ('=='|'!=') expression4
          | expression4;
expression4:expression5 ('<'|'<='|'>'|'>=')expression5
          | expression5;
expression5: expression5 ('+'|'-') expression6
          | expression6;
expression6: expression6 ('/'|'*'|'%') expression7
          | expression7 ;
expression7: ('!'|'-') expression7
          | expression8;
expression8: expression9'['expression']'
          | expression9;
expression9 : '('expression')'
            | (FLOATLIT|INTLIT|ID|BOOLIT|functioncall|STRINGLIT)
     ;
//ele_array: ID LSB expression RSB;
// Identifiers

// Comment
COMMENT : (ALINECM|TRADITIONALBLCM)->skip ; 
fragment  TRADITIONALBLCM : '/*' .*?  '*/';
fragment  ALINECM : '//' (~[\r\n])*;


// Operators
ADDOP: '+';
SUBOP: '-';
MULOP: '*';
DIVOP: '/';
NOTOP: '!';
MODULOP:'%';
OROP: '||';
ANDOP: '&&';
NEQ: '!=';
EQ: '==';
LT:'<';
GT: '>';
LTQ: '<=';
GTQ:  '>=';
ASSIGN: '=';
BOOLIT : TRUETYPE|FALSETYPE;
BOOLTYPE: 'boolean';
BREAKTYPE: 'break';
CONTINUETYPE: 'continue';
ELSETYPE: 'else';
FORTYPE: 'for';
FLOATTYPE: 'float';
IFTYPE: 'if';
INTTYPE: 'int';
RETURNTYPE: 'return';
VOIDTYPE: 'void';
DOTYPE: 'do';
WHILETYPE: 'while';
TRUETYPE: 'true';
FALSETYPE: 'false';
STRINGTYPE: 'string';
 // Separators

LB: '(' ;

RB: ')' ;

LP: '{';

RP: '}';

LSB: '[';

RSB: ']';

SEMI: ';' ;

COMMA: ',';
 // Literals

INTLIT: DIGIT+;

fragment DIGIT: [0-9];

ID: [_a-zA-Z][_a-zA-Z0-9]*;


WS : [ \t\r\n]+ ->skip ; // skip spaces, tabs, newlines

fragment Digit: [0-9]+;

fragment ExponentPart: [eE][-]? Digit;

FLOATLIT : Digit '.' Digit ExponentPart?
         | Digit '.' Digit?
         | Digit '.'? ExponentPart
         | Digit? '.' Digit ExponentPart?;
// parser


fragment ESCAPE_CHAR:   '\\' ('b'|'f'|'r'|'n'|'t'|'"'|'\\'|'\'');

ILLEGAL_ESCAPE:'"' (~([\n]|'"'|'\\')|ESCAPE_CHAR)*  '\\'~('b'|'f'|'r'|'n'|'t'|'"'|'\\'|'\'')  { String s = getText(); s = s.substring(1,s.length()); setText(s); } ;
UNCLOSE_STRING:  '"' (~([\n]|'"'|'\\')|ESCAPE_CHAR)* { String s = getText(); s = s.substring(1,s.length()); setText(s); };
ERROR_CHAR:.;
STRINGLIT:'"' (~([\n]|'"'|'\\')|ESCAPE_CHAR)* '"' { String s = getText(); s = s.substring(1,s.length()-1); setText(s); };

