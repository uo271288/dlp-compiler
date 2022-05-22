package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {

    private CodeGeneration cg;
    private AddressCGVisitor addressCGV;

    ValueCGVisitor(CodeGeneration cg) {
        this.cg = cg;
    }

    public void setAddressCGV(AddressCGVisitor addressCGV) {
        this.addressCGV = addressCGV;
    }

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        arithmetic.getOperand1().accept(this, param);
        cg.promoteTo(arithmetic.getOperand1().getType(), arithmetic.getType());
        arithmetic.getOperand2().accept(this, param);
        cg.promoteTo(arithmetic.getOperand2().getType(), arithmetic.getType());
        cg.arithmetic(arithmetic.getOperator(), arithmetic.getType());
        return null;
    }

    @Override
    public Type visit(Cast cast, Type param) {
        super.visit(cast, param);
        cg.promoteTo(cast.getExpression().getType(), cast.getCastType());
        return null;
    }


    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        cg.push(charLiteral.getType(), charLiteral.getValue());
        return null;
    }

    @Override
    public Type visit(RealLiteral doubleLiteral, Type param) {
        cg.push(doubleLiteral.getType(), doubleLiteral.getValue());
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        cg.push(intLiteral.getType(), intLiteral.getValue());
        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);
        cg.arithmetic("-", unaryMinus.getType());
        return null;
    }

    @Override
    public Type visit(Not not, Type param) {
        super.visit(not, param);
        cg.logic("!");
        return null;
    }

    @Override
    public Type visit(Comparison comparison, Type param) {
        super.visit(comparison, param);
        cg.comparison(comparison.getOperator(), comparison.getType());
        return null;
    }

    @Override
    public Type visit(Logical logical, Type param) {
        super.visit(logical, param);
        cg.logic(logical.getOperator());
        cg.promoteTo(logical.getType(), logical.getOperand2().getType());
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        super.visit(variable, param);
        variable.accept(addressCGV, param);
        cg.load(variable.getType());
        return null;
    }

    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {

        arrayAccess.accept(addressCGV, param);
        cg.load(arrayAccess.getType());
        return null;
    }

    @Override
    public Type visit(FieldAccess fieldAccess, Type param) {
        fieldAccess.accept(addressCGV, param);
        cg.promoteTo(fieldAccess.getExpression().getType(), fieldAccess.getType());
        cg.load(fieldAccess.getType());
        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        for (Expression expression: functionInvocation.getArgs())
            expression.accept(this, null);
        cg.call(functionInvocation.getVariable().getName());
        return null;
    }
}
