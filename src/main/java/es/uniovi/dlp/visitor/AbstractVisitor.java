package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VariableDefinition;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;

public abstract class AbstractVisitor<ReturnType, ParamType> implements Visitor<ReturnType, ParamType> {

    @Override
    public ReturnType visit(Program program, ParamType param) {
        program.getDefinitions().forEach(definition -> definition.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(FunctionDefinition funcDef, ParamType param) {
        funcDef.getStatements().forEach(statement -> statement.accept(this, param));
        funcDef.getLocalVars().forEach(var -> var.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(VariableDefinition varDef, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(Assignment assignment, ParamType param) {
        assignment.getLeftExpr().accept(this, param);
        assignment.getRightExpr().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Conditional conditional, ParamType param) {
        conditional.getCondition().accept(this, param);
        conditional.getIfBody().forEach(statement -> statement.accept(this, param));
        conditional.getElseBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(In in, ParamType param) {
        in.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Puts puts, ParamType param) {
        puts.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Return aReturn, ParamType param) {
        aReturn.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(While aWhile, ParamType param) {
        aWhile.getCondition().accept(this, param);
        aWhile.getBody().forEach(statement -> statement.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(Arithmetic arithmetic, ParamType param) {
        arithmetic.getOperand1().accept(this, param);
        arithmetic.getOperand2().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(ArrayAccess arrayAccess, ParamType param) {
        arrayAccess.getArray().accept(this, param);
        arrayAccess.getIndex().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Cast cast, ParamType param) {
        cast.getExpression().accept(this, param);
        cast.getCastType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Comparison comparison, ParamType param) {
        comparison.getOperand1().accept(this, param);
        comparison.getOperand2().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(FieldAccess fieldAccess, ParamType param) {
        fieldAccess.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(FunctionInvocation functionInvocation, ParamType param) {
        functionInvocation.getArgs().forEach(expression -> expression.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(Logical logical, ParamType param) {
        logical.getOperand1().accept(this, param);
        logical.getOperand2().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Not not, ParamType param) {
        not.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(UnaryMinus unaryMinus, ParamType param) {
        unaryMinus.getExpression().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(Variable variable, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(CharLiteral charLiteral, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(IntLiteral intLiteral, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(RealLiteral realLiteral, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(ArrayType arrayType, ParamType param) {
        arrayType.getType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(CharType charType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(FunctionType functionType, ParamType param) {
        functionType.getParams().forEach(variableDefinition -> variableDefinition.accept(this, param));
        functionType.getReturnType().accept(this, param);
        return null;
    }

    @Override
    public ReturnType visit(IntType intType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(RealType realType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(StructType structType, ParamType param) {
        structType.getFields().forEach(structField -> structField.accept(this, param));
        return null;
    }

    @Override
    public ReturnType visit(VoidType voidType, ParamType param) {
        return null;
    }

    @Override
    public ReturnType visit(StructField structField, ParamType param) {
        structField.getType().accept(this, param);
        return null;
    }
}
