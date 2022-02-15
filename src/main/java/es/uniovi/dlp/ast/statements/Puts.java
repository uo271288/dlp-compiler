package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;

public class Puts extends AbstractASTNode implements Statement {

    private final Expression expression;


    public Puts(Expression expression, int line, int column) {

        super(line, column);
        this.expression = expression;
    }
}