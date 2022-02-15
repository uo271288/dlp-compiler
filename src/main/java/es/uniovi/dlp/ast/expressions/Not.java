package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

public class Not extends AbstractExpression {

    private final Expression expression;

    public Not(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }
}
