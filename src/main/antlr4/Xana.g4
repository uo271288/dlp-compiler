grammar Xana;

@header {
package es.uniovi.dlp.parser;
}

program: varDef* funcDef* mainFunc EOF;

varDef: varIDs '::' type;

varIDs: ID (',' ID)*;
type: simpleType
        | '[' INT_CONSTANT '::' type ']'
        | 'defstruct do' recordFields* 'end'
        ;
recordFields: varIDs '::' type;

simpleType: 'int'
        |'double'
        |'char'
        ;

funcDef: 'def' ID '(' paramList ')' '::' returnType 'do' varDef* statement* 'end';
paramList: (param (',' param)*)?;
param: ID '::' simpleType;
returnType: 'void' | simpleType;

mainFunc: 'def' 'main' '(' ')' 'do' (varDef | statement)* 'end';

statement: 'if' expr ',' 'do' ':' statement ',' 'else' ':' statement
        | 'if' expr 'do' statement* ('else' statement*)? 'end'
        | 'puts' exprs
        | 'in' exprs
        | 'while' expr 'do' statement* 'end'
        | 'return' expr
        | expr '=' expr
        | ID '(' exprs? ')'
        ;

exprs: expr (',' expr)* ;
expr: INT_CONSTANT
    | REAL_CONSTANT
    | CHAR_CONSTANT
    | ID
    | ID '(' exprs? ')'
    | '(' expr ')'
    | expr'[' expr ']'
    | expr '.' expr
    | expr 'as' simpleType
    | '-' expr
    | '!' expr
    | expr ('*'|'/'|'%') expr
    | expr ('+'|'-') expr
    | expr ('>' | '>=' | '<' | '<=' | '!=' | '==') expr
    | expr '&&' expr
    | expr '||' expr
    ;

fragment
NUM: [0-9];
fragment
DECIMAL: '.' INT_CONSTANT
        |INT_CONSTANT '.' NUM*;

INT_CONSTANT: NUM+;
REAL_CONSTANT: DECIMAL
        | (DECIMAL | INT_CONSTANT)[eE][+-]?INT_CONSTANT;
CHAR_CONSTANT: '\''.'\'' | '\'\\'(INT_CONSTANT | [ntr])'\'';
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;

// Comments
SIMPLE_COMMENT: '#' .*? ('\n' | '\r' | EOF) -> skip;
MULTILINE_COMMENT: '"""' .*? '"""' -> skip;
WS: (' ' | '\n' | '\r' | '\t') -> skip;