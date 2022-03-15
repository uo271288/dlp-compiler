package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.statements.Assignment;
import es.uniovi.dlp.ast.statements.In;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

    @Override
    public Type visit(Assignment assignment, Type param) {
        assignment.getLeftExpr().accept(this, param);
        if(!assignment.getLeftExpr().isLValue())
            ErrorManager.getInstance().getErrors().add(new Error(assignment.getLeftExpr().getLine(), assignment.getLeftExpr().getColumn(), ErrorReason.LVALUE_REQUIRED));
        assignment.getRightExpr().accept(this, param);
        return null;
    }

    @Override
    public Type visit(In in, Type param) {
        in.getExpression().accept(this, param);
        if(!in.getExpression().isLValue())
            ErrorManager.getInstance().getErrors().add(new Error(in.getExpression().getLine(), in.getExpression().getColumn(), ErrorReason.LVALUE_REQUIRED));
        return null;
    }
}
