package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.In;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.RealType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

    @Override
    public Type visit(Assignment assignment, Type param) {
        assignment.getLeftExpr().accept(this, param);
        if (!assignment.getLeftExpr().isLValue())
            ErrorManager.getInstance().addError(new Error(new Location(assignment.getLeftExpr().getLine(), assignment.getLeftExpr().getColumn()), ErrorReason.LVALUE_REQUIRED));
        assignment.getRightExpr().accept(this, param);
        return null;
    }

    @Override
    public Type visit(In in, Type param) {
        super.visit(in, param);
        if (!in.getExpression().isLValue())
            ErrorManager.getInstance().addError(new Error(new Location(in.getExpression().getLine(), in.getExpression().getColumn()), ErrorReason.LVALUE_REQUIRED));
        return null;
    }

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);
        arithmetic.setType(arithmetic.getOperand1().getType().arithmetic(arithmetic.getOperand2().getType()));
        if(arithmetic.getType()==null){
            ErrorManager.getInstance().addError(new Error(new Location(arithmetic.getLine(), arithmetic.getColumn()), ErrorReason.INVALID_ARITHMETIC));
            return new ErrorType(arithmetic.getLine(), arithmetic.getColumn(), "Arithmetic error");
        }
        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);
        if(!unaryMinus.getExpression().getType().isArithmetic()) {
            ErrorManager.getInstance().addError(new Error(new Location(unaryMinus.getLine(), unaryMinus.getColumn()), ErrorReason.INVALID_ARITHMETIC));
            return new ErrorType(unaryMinus.getLine(), unaryMinus.getColumn(), "Unary minus error");
        }
        unaryMinus.setType(new IntType(unaryMinus.getExpression().getLine(), unaryMinus.getExpression().getColumn()));
        return null;
    }

    @Override
    public Type visit(IntLiteral intLiteral, Type param) {
        super.visit(intLiteral, param);
        intLiteral.setType(new IntType(intLiteral.getLine(), intLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(RealLiteral realLiteral, Type param) {
        super.visit(realLiteral, param);
        realLiteral.setType(new RealType(realLiteral.getLine(), realLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(CharLiteral charLiteral, Type param) {
        super.visit(charLiteral, param);
        charLiteral.setType(new CharType(charLiteral.getLine(), charLiteral.getColumn()));
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        super.visit(variable,param);
        variable.setType(variable.getDefinition().getType());
        return null;
    }

    //    @Override
//    public Type visit(ArrayAccess arrayAccess, Type param) {
//        super.visit(arrayAccess,param);
//        arrayAccess.setType(arrayAccess.getArray().getType().indexing(arrayAccess.getIndex().getType()));
//        if (!arrayAccess.getIndex().getType().isIndexable())
//            ErrorManager.getInstance().addError(new Error(new Location(arrayAccess.getLine(), arrayAccess.getColumn()), ErrorReason.INVALID_INDEX_EXPRESSION));
//        if (!(arrayAccess.getArray().getType().indexing(param) == null))
//            ErrorManager.getInstance().addError(new Error(new Location(arrayAccess.getLine(), arrayAccess.getColumn()), ErrorReason.INVALID_INDEXING));
//        return null;
//    }
}
