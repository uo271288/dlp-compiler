package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

public class FieldAccess extends AbstractExpression {

    private final Expression expression;
    private final String field;


    public FieldAccess(Expression expression, String field, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.field = field;
    }
}
