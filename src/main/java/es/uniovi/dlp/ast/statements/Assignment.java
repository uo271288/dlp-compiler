package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;

public class Assignment extends AbstractASTNode implements Statement {

    private final Expression leftExpr;
    private final Expression rightExpr;

    public Assignment(Expression leftExpr, Expression rightExpr, int line, int column) {
        super(line, column);
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }
}
