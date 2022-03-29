package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.expressions.Arithmetic;
import es.uniovi.dlp.ast.expressions.ArrayAccess;
import es.uniovi.dlp.ast.expressions.UnaryMinus;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.In;
import es.uniovi.dlp.ast.types.ErrorType;
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
            ErrorManager.getInstance().getErrors().add(new Error(new Location(assignment.getLeftExpr().getLine(), assignment.getLeftExpr().getColumn()), ErrorReason.LVALUE_REQUIRED));
        assignment.getRightExpr().accept(this, param);
        return null;
    }

    @Override
    public Type visit(In in, Type param) {
        super.visit(in, param);
        if (!in.getExpression().isLValue())
            ErrorManager.getInstance().getErrors().add(new Error(new Location(in.getExpression().getLine(), in.getExpression().getColumn()), ErrorReason.LVALUE_REQUIRED));
        return null;
    }

    @Override
    public Type visit(Arithmetic arithmetic, Type param) {
        super.visit(arithmetic, param);
        return null;
    }

    @Override
    public Type visit(UnaryMinus unaryMinus, Type param) {
        super.visit(unaryMinus, param);
        if(!unaryMinus.getExpression().getType().isArithmetic())
            ErrorManager.getInstance().getErrors().add(new Error(new Location(unaryMinus.getLine(), unaryMinus.getColumn()), ErrorReason.INVALID_ARITHMETIC));
        return null;
    }

    //    @Override
//    public Type visit(ArrayAccess arrayAccess, Type param) {
//        super.visit(arrayAccess,param);
//        arrayAccess.setType(arrayAccess.getArray().getType().indexing(arrayAccess.getIndex().getType()));
//        if (!arrayAccess.getIndex().getType().isIndexable())
//            ErrorManager.getInstance().getErrors().add(new Error(new Location(arrayAccess.getLine(), arrayAccess.getColumn()), ErrorReason.INVALID_INDEX_EXPRESSION));
//        if (!(arrayAccess.getArray().getType().indexing(param) == null))
//            ErrorManager.getInstance().getErrors().add(new Error(new Location(arrayAccess.getLine(), arrayAccess.getColumn()), ErrorReason.INVALID_INDEXING));
//        return null;
//    }
}
