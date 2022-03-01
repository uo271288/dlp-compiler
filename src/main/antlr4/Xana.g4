grammar Xana;

@header {
package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.expressions.*;
}

program
        : varDef* funcDef* mainFunc EOF;

varDef
        : varIDs '::' type;

varIDs
        : ID (',' ID)*;
type
        : simpleType
        | '[' INT_CONSTANT '::' type ']'
        | 'defstruct do' recordFields* 'end'
        ;
recordFields
        : varIDs '::' type;

simpleType returns [Type ast]
        : 'int' {$ast = new IntType($start.getLine(), $start.getCharPositionInLine() + 1);}
        |'double' {$ast = new RealType($start.getLine(), $start.getCharPositionInLine() + 1);}
        |'char' {$ast = new CharType($start.getLine(), $start.getCharPositionInLine() + 1);}
        ;

funcDef
        : 'def' ID '(' paramList ')' '::' returnType 'do' varDef* statement* 'end';
paramList
        : (param (',' param)*)?;
param
        : ID '::' simpleType;
returnType
        : 'void'
        | simpleType;

mainFunc
        : 'def' 'main' '(' ')' 'do' (varDef | statement)* 'end';

statement
        : 'if' expr ',' 'do' ':' statement ',' 'else' ':' statement // One-line if statement is optional
        | 'if' expr 'do' statement* ('else' statement*)? 'end'
        | 'puts' exprs
        | 'in' exprs
        | 'while' expr 'do' statement* 'end'
        | 'return' expr
        | expr '=' expr
        | ID '(' exprs? ')'
        ;

exprs returns [List<Expression> astList = new ArrayList<>()]
        : list+=expr (',' list+=expr)* {
            for(var e : $list) {
                $astList.add(e.ast);
            }
        }
        ;

expr returns [Expression ast]
        : INT_CONSTANT {$ast = new IntLiteral(LexerHelper.lexemeToInt($INT_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | REAL_CONSTANT {$ast = new RealLiteral(LexerHelper.lexemeToReal($REAL_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | CHAR_CONSTANT {$ast = new CharLiteral(LexerHelper.lexemeToChar($CHAR_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | ID {$ast = new Variable($ID.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | ID '(' exprs? ')' {$ast = new FunctionInvocation($ID.text, $exprs.astList, $start.getLine(), $start.getCharPositionInLine()+1);}
        | '(' expr ')' {$ast = $expr.ast;}
        | array=expr'[' index=expr ']'{$ast = new ArrayAccess($array.ast, $index.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
        | expr '.' ID {$ast = new FieldAccess($expr.ast, $ID.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | expr 'as' simpleType {$ast = new Cast($expr.ast, $simpleType.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
        | '-' expr {$ast = new UnaryMinus($expr.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
        | '!' expr {$ast = new Not($expr.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
        | leftExpr=expr op=('*'|'/'|'%') rightExpr=expr {$ast = new Arithmetic($leftExpr.ast, $rightExpr.ast, $op.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | leftExpr=expr op=('+'|'-') rightExpr=expr {$ast = new Arithmetic($leftExpr.ast, $rightExpr.ast, $op.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | leftExpr=expr op=('>' | '>=' | '<' | '<=' | '!=' | '==') rightExpr=expr {$ast = new Comparison($leftExpr.ast, $rightExpr.ast, $op.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | leftExpr=expr op='&&' rightExpr=expr {$ast = new Logical($leftExpr.ast, $rightExpr.ast, $op.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | leftExpr=expr op='||' rightExpr=expr {$ast = new Logical($leftExpr.ast, $rightExpr.ast, $op.text, $start.getLine(), $start.getCharPositionInLine()+1);}
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