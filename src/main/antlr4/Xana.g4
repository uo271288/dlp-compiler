grammar Xana;

@header {
package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.expressions.*;
}

program returns [Program ast]
        : (vars+=varDef | functions+=funcDef)* mainFunc EOF
        {
            List<Definition> def = new ArrayList<Definition>();
            for(var v : $vars) {
                def.addAll(v.astList);
            }
            for(var f : $functions) {
                def.add(f.ast);
            }
            def.add($mainFunc.ast);
            $ast = new Program(def, $start.getLine(), $start.getCharPositionInLine()+1);
        }
        ;

varDef returns [List<VariableDefinition> astList = new ArrayList<>()]
        : varIDs '::' type
        {
            for(var id : $varIDs.astList) {
                $astList.add(new VariableDefinition($type.ast, id.getName(), id.getLine(), id.getColumn()));
            }
        }
        ;

varIDs returns [List<VariableDefinition> astList = new ArrayList<>()]
        : ids+=ID (',' ids+=ID)*
        {
            for(var id : $ids){
                $astList.add(new VariableDefinition(null, id.getText(), id.getLine(), id.getCharPositionInLine() + 1));
            }
        }
        ;

type returns [Type ast]
        : simpleType {$ast = $simpleType.ast;}
        | '[' INT_CONSTANT '::' type ']' {$ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text), $type.ast, $INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine() + 1);}
        | 'defstruct do' rFields+=recordFields* 'end'
        {
            List<StructField> fields = new ArrayList<>();
            for(var f : $rFields) {
                fields.addAll(f.astList);
            }
            $ast = new StructType(fields, $start.getLine(), $start.getCharPositionInLine() + 1);
        }
        ;

recordFields returns [List<StructField> astList = new ArrayList<>()]
        : varIDs '::' type
        {
                for(var id : $varIDs.astList) {
                    $astList.add(new StructField(id.getName(), $type.ast, id.getLine(), id.getColumn()));
                }
            }
        ;

simpleType returns [Type ast]
        : 'int' {$ast = IntType.getInstance();}
        |'double' {$ast = RealType.getInstance();}
        |'char' {$ast = CharType.getInstance();}
        |'boolean' {$ast = BooleanType.getInstance();}
        ;

funcDef returns [FunctionDefinition ast]
        : 'def' ID '(' paramList ')' '::' returnType 'do' vars+=varDef* stmts+=statement* 'end'
        {
            FunctionType type = new FunctionType($paramList.astList, $returnType.ast, $start.getLine(), $start.getCharPositionInLine() + 1);
            List<VariableDefinition> defs = new ArrayList<VariableDefinition>();
            for(var v : $vars) {
                defs.addAll(v.astList);
            }
            List<Statement> sts = new ArrayList<Statement>();
            for(var s : $stmts) {
                sts.addAll(s.astList);
            }
            $ast = new FunctionDefinition(sts, defs, type, $ID.text, $start.getLine(), $start.getCharPositionInLine() + 1);
        }
        ;

paramList returns [List<VariableDefinition> astList = new ArrayList<>()]
        : (list+=param (',' list+=param)*)?
        {
            for(var p : $list) {
                $astList.add(p.ast);
            }
        }
        ;
param returns [VariableDefinition ast]
        : ID '::' simpleType {$ast = new VariableDefinition($simpleType.ast, $ID.text, $start.getLine(), $start.getCharPositionInLine() + 1);}
        ;

returnType returns [Type ast]
        : 'void' {$ast = VoidType.getInstance();}
        | simpleType {$ast = $simpleType.ast;}
        ;

mainFunc returns [FunctionDefinition ast]
        : 'def' 'main' '(' ')' 'do' (vars+=varDef | stmts+=statement)* 'end'
        {
                    FunctionType type = new FunctionType(new ArrayList<>(), VoidType.getInstance(), $start.getLine(), $start.getCharPositionInLine() + 1);
                    List<VariableDefinition> defs = new ArrayList<VariableDefinition>();
                    for(var v : $vars) {
                        defs.addAll(v.astList);
                    }
                    List<Statement> sts = new ArrayList<Statement>();
                    for(var s : $stmts) {
                        sts.addAll(s.astList);
                    }
                    $ast = new FunctionDefinition(sts, defs, type, "main", $start.getLine(), $start.getCharPositionInLine() + 1);
                }
        ;

statement returns[List<Statement> astList = new ArrayList<>()] locals[List<Expression> list = new ArrayList<Expression>()]
          // One-line if statement is optional
        : 'if' cond=expr ',' 'do' ':' ifBody+=statement ',' 'else' ':' elseBody+=statement
        {
            List<Statement> ifBodyAux = new ArrayList<Statement>();
            for(var s : $ifBody) {
                ifBodyAux.addAll(s.astList);
            }
            List<Statement> elseBodyAux = new ArrayList<Statement>();
            for(var s : $elseBody) {
                elseBodyAux.addAll(s.astList);
            }
            $astList.add(new Conditional($cond.ast, ifBodyAux, elseBodyAux, $start.getLine(), $start.getCharPositionInLine()+1));
        }
        | 'if' cond=expr 'do' ifBody+=statement* ('else' elseBody+=statement*)? 'end'
        {
            List<Statement> ifBodyAux = new ArrayList<Statement>();
            for(var s : $ifBody) {
                ifBodyAux.addAll(s.astList);
            }
            List<Statement> elseBodyAux = new ArrayList<Statement>();
            for(var s : $elseBody) {
                elseBodyAux.addAll(s.astList);
            }
            $astList.add(new Conditional($cond.ast, ifBodyAux, elseBodyAux, $cond.ast.getLine(), $cond.ast.getColumn()));
        }
        | 'puts' exprs {
                $list.addAll($exprs.astList);
                for(var e : $list){
                    $astList.add(new Puts(e, e.getLine(), e.getColumn()));
                }
            }
        | 'in' inList=exprs {
                $list.addAll($exprs.astList);
                for(var e : $list){
                    $astList.add(new In(e, $inList.start.getLine(), $inList.start.getCharPositionInLine() +1));
                }
            }
        | 'while' expr 'do' stmts+=statement* 'end'
        {
            List<Statement> stmtsAux = new ArrayList<Statement>();
            for(var s : $stmts) {
                stmtsAux.addAll(s.astList);
            }
            $astList.add(new While($expr.ast, stmtsAux, $expr.ast.getLine(), $expr.ast.getColumn()));
        }
        | 'return' expr {$astList.add(new Return($expr.ast, $expr.ast.getLine(), $expr.ast.getColumn()));}
        | leftExpr=expr '=' rightExpr=expr {$astList.add(new Assignment($leftExpr.ast, $rightExpr.ast, $start.getLine(), $start.getCharPositionInLine()+1));}
        | ID '(' (exprs {$list.addAll($exprs.astList);})? ')' {
                      $astList.add(new FunctionInvocation(new Variable($ID.text, $start.getLine(), $start.getCharPositionInLine()+1), $list, $start.getLine(), $start.getCharPositionInLine()+1));
                      }
        ;

exprs returns [List<Expression> astList = new ArrayList<>()]
        : list+=expr (',' list+=expr)*
        {
            for(var e : $list) {
                $astList.add(e.ast);
            }
        }
        ;

expr returns [Expression ast] locals[List<Expression> list = new ArrayList<Expression>()]
        : INT_CONSTANT {$ast = new IntLiteral(LexerHelper.lexemeToInt($INT_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | REAL_CONSTANT {$ast = new RealLiteral(LexerHelper.lexemeToReal($REAL_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | CHAR_CONSTANT {$ast = new CharLiteral(LexerHelper.lexemeToChar($CHAR_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | BOOLEAN_CONSTANT {$ast = new BooleanLiteral(LexerHelper.lexemeToBoolean($BOOLEAN_CONSTANT.text), $start.getLine(), $start.getCharPositionInLine()+1);}
        | ID {$ast = new Variable($ID.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | ID '(' (exprs {$list.addAll($exprs.astList);})? ')'{$ast = new FunctionInvocation(new Variable($ID.text, $start.getLine(), $start.getCharPositionInLine()+1), $list, $start.getLine(), $start.getCharPositionInLine()+1);}
        | '(' expr ')' {$ast = $expr.ast;}
        | array=expr'[' index=expr ']' {$ast = new ArrayAccess($array.ast, $index.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
        | a=expr '.' ID {$ast = new FieldAccess($a.ast, $ID.text, $start.getLine(), $start.getCharPositionInLine()+1);}
        | a=expr 'as' simpleType {$ast = new Cast($a.ast, $simpleType.ast, $start.getLine(), $start.getCharPositionInLine()+1);}
        | '-' expr {$ast = new UnaryMinus($expr.ast, $expr.ast.getLine(), $expr.ast.getColumn());}
        | '!' expr {$ast = new Not($expr.ast, $expr.ast.getLine(), $expr.ast.getColumn());}
        | leftExpr=expr op=('*'|'/'|'%') rightExpr=expr {$ast = new Arithmetic($leftExpr.ast, $rightExpr.ast, $op.text, $op.getLine(), $op.getCharPositionInLine() +1);}
        | leftExpr=expr op=('+'|'-') rightExpr=expr {$ast = new Arithmetic($leftExpr.ast, $rightExpr.ast, $op.text, $op.getLine(), $op.getCharPositionInLine() +1);}
        | leftExpr=expr op=('>' | '>=' | '<' | '<=' | '!=' | '==') rightExpr=expr {$ast = new Comparison($leftExpr.ast, $rightExpr.ast, $op.text, $op.getLine(), $op.getCharPositionInLine() +1);}
        | leftExpr=expr op='&&' rightExpr=expr {$ast = new Logical($leftExpr.ast, $rightExpr.ast, $op.text, $op.getLine(), $op.getCharPositionInLine() +1);}
        | leftExpr=expr op='||' rightExpr=expr {$ast = new Logical($leftExpr.ast, $rightExpr.ast, $op.text, $op.getLine(), $op.getCharPositionInLine() +1);}
        ;

fragment
NUM: [0-9];

fragment
DECIMAL
        : '.' INT_CONSTANT
        |INT_CONSTANT '.' NUM*
        ;

INT_CONSTANT: NUM+;

REAL_CONSTANT
        : DECIMAL
        | (DECIMAL | INT_CONSTANT)[eE][+-]?INT_CONSTANT
        ;
CHAR_CONSTANT
        : '\''.'\''
        | '\'\\'(INT_CONSTANT | [ntr])'\''
        ;


BOOLEAN_CONSTANT: 'true'| 'false';
ID: [a-zA-Z_] [a-zA-Z0-9_]* ;

// Comments
SIMPLE_COMMENT: '#' .*? ('\n' | '\r' | EOF) -> skip;
MULTILINE_COMMENT: '"""' .*? '"""' -> skip;
WS: (' ' | '\n' | '\r' | '\t') -> skip;