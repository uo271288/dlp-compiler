grammar Xana;

@header {
package es.uniovi.dlp.parser;
}

program: expr* EOF;

expr: INT_CONSTANT
        | REAL_CONSTANT
        | IDENT;
fragment
NUM: [0-9];
fragment
DECIMAL: '.' NUM+
        | NUM+ '.' NUM*;

INT_CONSTANT: NUM+;
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;
REAL_CONSTANT: DECIMAL
        | (DECIMAL | NUM+)[eE][+-]?NUM+;

SIMPLE_COMMENT: '#' .*? ('\n' | '\r' | EOF) -> skip;
MULTILINE_COMMENT: '"""' .*? '"""' -> skip;
WS: (' ' | '\n' | '\r' | '\t') -> skip;