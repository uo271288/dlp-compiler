grammar Xana;

@header {
package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.expressions.*;
}

program //returns [Program ast]
        : varDef* functions+=funcDef* mainFunc EOF
        /*{
        List<Definition> def = new ArrayList<Definition>();
        def.addAll($varDef.astList);
        for(var f : $functions) {
            def.add(f.ast);
        }
        def.add($mainFunc.ast);
        $ast = new Program(def, $start.getLine(), $start.getCharPositionInLine());
        }
        */
        ;

varDef //returns [List<VariableDefinition> astList = new ArrayList<>()]
        : varIDs '::' type
        /* {
                for(var id : $varIDs.astList) {
                    $astList.add(new VariableDefinition($type.ast, id, $start.getLine(), $start.getCharPositionInLine() + 1));
                }
            }
        */
        ;

varIDs //returns [List<String> astList = new ArrayList<>()]
        : ID (',' ID)* //{$astList.add($ID.text);}
        ;
type //returns [Type ast]
        : simpleType //{$ast = $simpleType.ast;}
        | '[' INT_CONSTANT '::' type ']' //{$ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast, $start.getLine(), $start.getCharPositionInLine() + 1);}
        | 'defstruct do' recordFields* 'end' //{$ast = new StructType($recordFields.astList, $start.getLine(), $start.getCharPositionInLine() + 1);}
        ;
recordFields //returns [List<StructField> astList = new ArrayList<>()]
        : varIDs '::' type
        /*{
                for(var id : $varIDs.astList) {
                    $astList.add(new StructField(id, $type.ast, $start.getLine(), $start.getCharPositionInLine() + 1));
                }
            }
        */
        ;

simpleType returns [Type ast]
        : 'int' {$ast = new IntType($start.getLine(), $start.getCharPositionInLine() + 1);}
        |'double' {$ast = new RealType($start.getLine(), $start.getCharPositionInLine() + 1);}
        |'char' {$ast = new CharType($start.getLine(), $start.getCharPositionInLine() + 1);}
        ;

funcDef //returns [FunctionDefinition ast]
        : 'def' ID '(' paramList ')' '::' returnType 'do' varDef* statement* 'end' //{$ast = new FunctionDefinition(null,null,null,null,0,0);}
        ;
paramList
        : (param (',' param)*)?;
param
        : ID '::' simpleType;
returnType
        : 'void'
        | simpleType;

mainFunc //returns [FunctionDefinition ast]
        : 'def' 'main' '(' ')' 'do' (varDef | statement)* 'end' //{$ast = new FunctionDefinition(null,null,null,null,0,0);}
        ;

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

expr returns [Expression ast] locals[List<Expression> list = new ArrayList<Expression>()]
        : INT_CONSTANT {$ast = new IntLiteral(LexerHelper.lexemeToInt($INT_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | REAL_CONSTANT {$ast = new RealLiteral(LexerHelper.lexemeToReal($REAL_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | CHAR_CONSTANT {$ast = new CharLiteral(LexerHelper.lexemeToChar($CHAR_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | ID {$ast = new Variable($ID.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | ID '(' (exprs {$list.addAll($exprs.astList);})? ')' {
            $ast = new FunctionInvocation($ID.text, $list, $start.getLine(), $start.getCharPositionInLine()+1);
            }
        | '(' expr ')' {$ast = $expr.ast;}
        | array=expr'[' index=expr ']' {$ast = new ArrayAccess($array.ast, $index.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
        | a=expr '.' ID {$ast = new FieldAccess($a.ast, $ID.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | a=expr 'as' simpleType {$ast = new Cast($a.ast, $simpleType.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
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