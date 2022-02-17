grammar Xana;

@header {
package es.uniovi.dlp.parser;
}

program: program INT_CONSTANT
        | INT_CONSTANT;

fragment
NUM: [0-9];
fragment
DECIMAL: '.' NUM+
        | NUM+ '.' NUM*;

INT_CONSTANT: NUM+;
IDENT: [a-zA-Z_] [a-zA-Z0-9_]* ;
REAL_CONSTANT: DECIMAL | (DECIMAL | NUM+)[eE][+-]?NUM+;

SIMPLE_COMMENT: '#' *? ('\n' | '\r' | EOF) -> skip;
MULTILINE_COMMENT: '"""' .*? '"""' -> skip;
WS: [ \n\t\r] -> skip;
