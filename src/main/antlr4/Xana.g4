grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: program INT_CONSTANT
        | INT_CONSTANT
        ;

INT_CONSTANT: [0-9]+
        ;

IDENT: [a-zA-Z_] [a-zA-Z0-9_]*
        ;

SIMPLE_COMMENT: '#' ~[\n\r]* -> skip
        ;
MULTILINE_COMMENT: '"""' .*? '"""' -> skip
        ;
WS: [ \n\t\r] -> skip
        ;
