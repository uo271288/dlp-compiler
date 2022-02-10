package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

public class UnaryMinus extends AbstractExpression {

    private final Expression expression;

    public UnaryMinus(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }
}
