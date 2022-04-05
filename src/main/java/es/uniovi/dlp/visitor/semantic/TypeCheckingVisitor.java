package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

    @Override
    public Type visit(Assignment assignment, Type param) {
        Type visitorType = super.visit(assignment, param);
        if (visitorType instanceof ErrorType || assignment.getLeftExpr().getType() instanceof ErrorType)
            return null;
        if (!assignment.getLeftExpr().isLValue())
            ErrorManager.getInstance().addError(new Error(new Location(assignment.getLine(), assignment.getColumn()), ErrorReason.LVALUE_REQUIRED));
        if (assignment.getLeftExpr().getType().assignment(assignment.getRightExpr().getType()) == null) {
            ErrorManager.getInstance().addError(new Error(new Location(assignment.getLeftExpr().getLine(), assignment.getLeftExpr().getColumn()), ErrorReason.INCOMPATIBLE_TYPES));
        }
        return null;
    }

    @Override
    public Type visit(In in, Type param) {
        super.visit(in, param);
        if (!in.getExpression().isLValue())
            ErrorManager.getInstance().addError(new Error(new Location(in.getLine(), in.getColumn()), ErrorReason.LVALUE_REQUIRED));
        return null;
    }

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);
        arithmetic.setType(arithmetic.getOperand1().getType().arithmetic(arithmetic.getOperand2().getType()));
        if (arithmetic.getType() == null) {
            ErrorManager.getInstance().addError(new Error(new Location(arithmetic.getLine(), arithmetic.getColumn()), ErrorReason.INVALID_ARITHMETIC));
            return new ErrorType(arithmetic.getLine(), arithmetic.getColumn(), "Arithmetic error, operator: " + arithmetic.getOperator());
        }
        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);
        if (!unaryMinus.getExpression().getType().isArithmetic()) {
            ErrorManager.getInstance().addError(new Error(new Location(unaryMinus.getLine(), unaryMinus.getColumn()), ErrorReason.INVALID_ARITHMETIC));
            return new ErrorType(unaryMinus.getLine(), unaryMinus.getColumn(), "Unary minus (-) error");
        }
        unaryMinus.setType(new IntType(unaryMinus.getExpression().getLine(), unaryMinus.getExpression().getColumn()));
        return null;
    }

    @Override
    public Type visit(Not not, Type param) {
        super.visit(not, param);
        if (!not.getExpression().getType().isLogical()) {
            ErrorManager.getInstance().addError(new Error(new Location(not.getLine(), not.getColumn()), ErrorReason.NOT_LOGICAL));
            return new ErrorType(not.getLine(), not.getColumn(), "Not (!) error");
        }
        not.setType(new IntType(not.getExpression().getLine(), not.getExpression().getColumn()));
        return null;
    }

    @Override
    public Type visit(Logical logical, Type param) {
        super.visit(logical, param);
        logical.setType(logical.getOperand1().getType().logical(logical.getOperand2().getType()));
        if (logical.getType() == null) {
            ErrorManager.getInstance().addError(new Error(new Location(logical.getLine(), logical.getColumn()), ErrorReason.INVALID_LOGICAL));
            return new ErrorType(logical.getLine(), logical.getColumn(), "Logical error, operator: " + logical.getOperator());
        }
        return null;
    }

    @Override
    public Type visit(While aWhile, Type param) {
        super.visit(aWhile, param);
        if (aWhile.getCondition().getType() != null && !aWhile.getCondition().getType().isLogical())
            ErrorManager.getInstance().addError(new Error(new Location(aWhile.getLine(), aWhile.getColumn()), ErrorReason.NOT_LOGICAL));
        return null;
    }

    @Override
    public Type visit(Conditional conditional, Type param) {
        super.visit(conditional, param);
        if (!conditional.getCondition().getType().isLogical())
            ErrorManager.getInstance().addError(new Error(new Location(conditional.getLine(), conditional.getColumn()), ErrorReason.NOT_LOGICAL));
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
        super.visit(variable, param);
        variable.setType(variable.getDefinition().getType());
        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        if (functionInvocation.getVariable().getDefinition() == null)
            return null;
        super.visit(functionInvocation, param);
        if (functionInvocation.getVariable().getDefinition().getType().hasDifferentArgs(functionInvocation.getArgs())) {
            ErrorManager.getInstance().addError(new Error(new Location(functionInvocation.getVariable().getLine(), functionInvocation.getVariable().getColumn()), ErrorReason.INVALID_ARGS));
            return new ErrorType(functionInvocation.getLine(), functionInvocation.getColumn(), "Invocation error: Invalid arguments");
        }
        if (!(functionInvocation.getVariable().getDefinition().getType() instanceof FunctionType)) {
            ErrorManager.getInstance().addError(new Error(new Location(functionInvocation.getVariable().getLine(), functionInvocation.getVariable().getColumn()), ErrorReason.INVALID_INVOCATION));
            return new ErrorType(functionInvocation.getLine(), functionInvocation.getColumn(), "Invocation error: Invalid invocation");
        }
        functionInvocation.setType(functionInvocation.getVariable().getDefinition().getType().call(functionInvocation.getArgs()));
        if (functionInvocation.getType() == null) {
            ErrorManager.getInstance().addError(new Error(new Location(functionInvocation.getVariable().getLine(), functionInvocation.getVariable().getColumn()), ErrorReason.INVALID_ARGS));
            return new ErrorType(functionInvocation.getLine(), functionInvocation.getColumn(), "Invocation error: Invalid arguments");
        }
        return null;
    }

    @Override
    public Type visit(Comparison comparison, Type param) {
        super.visit(comparison, param);
        comparison.setType(comparison.getOperand1().getType().comparison(comparison.getOperand2().getType()));
        if (comparison.getType() == null) //{
            ErrorManager.getInstance().addError(new Error(new Location(comparison.getLine(), comparison.getColumn()), ErrorReason.INVALID_COMPARISON));
//            return new ErrorType(comparison.getLine(), comparison.getColumn(), "Comparison error, operator: " + comparison.getOperator());
//        }
        return null;
    }

    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {
        super.visit(arrayAccess, param);
        arrayAccess.setType(arrayAccess.getArray().getType().indexing(arrayAccess.getIndex().getType()));
        if (!arrayAccess.getArray().getType().isIndexable()) {
            ErrorManager.getInstance().addError(new Error(new Location(arrayAccess.getLine(), arrayAccess.getColumn()), ErrorReason.INVALID_INDEXING));
            return new ErrorType(arrayAccess.getLine(), arrayAccess.getColumn(), "Invalid array error");
        }
        if (arrayAccess.getType() == null) {
            ErrorManager.getInstance().addError(new Error(new Location(arrayAccess.getIndex().getLine(), arrayAccess.getIndex().getColumn()), ErrorReason.INVALID_INDEX_EXPRESSION));
            return new ErrorType(arrayAccess.getIndex().getLine(), arrayAccess.getIndex().getColumn(), "Invalid index error");
        }
        return null;
    }

    @Override
    public Type visit(Cast cast, Type param) {
        super.visit(cast, param);
        cast.setType(cast.getExpression().getType().cast(cast.getCastType()));
        if (cast.getType() == null) {
            ErrorManager.getInstance().addError(new Error(new Location(cast.getLine(), cast.getColumn()), ErrorReason.INVALID_CAST));
            return new ErrorType(cast.getLine(), cast.getColumn(), "Invalid cast error");
        }
        return null;
    }

    @Override
    public Type visit(FieldAccess fieldAccess, Type param) {
        super.visit(fieldAccess, param);
        if (!fieldAccess.getExpression().getType().allowDot(fieldAccess.getField())) {
            ErrorManager.getInstance().addError(new Error(new Location(fieldAccess.getLine(), fieldAccess.getColumn()), ErrorReason.NO_SUCH_FIELD));
            return new ErrorType(fieldAccess.getLine(), fieldAccess.getColumn(), "No such field error, field name: " + fieldAccess.getField());
        }
        fieldAccess.setType(fieldAccess.getExpression().getType().dot(fieldAccess.getField()));
        if (fieldAccess.getType() == null) {
            ErrorManager.getInstance().addError(new Error(new Location(fieldAccess.getLine(), fieldAccess.getColumn()), ErrorReason.INVALID_DOT));
            return new ErrorType(fieldAccess.getLine(), fieldAccess.getColumn(), "Invalid dot");
        }
        return null;
    }

    @Override
    public Type visit(Return aReturn, Type param) {
        super.visit(aReturn, param);
        if (!aReturn.getExpression().getType().promotableTo(((FunctionType) param).getReturnType()))
            ErrorManager.getInstance().addError(new Error(new Location(aReturn.getLine(), aReturn.getColumn()), ErrorReason.INVALID_RETURN_TYPE));
        aReturn.getExpression().setType(((FunctionType) param).getReturnType());
        return null;
    }
}
