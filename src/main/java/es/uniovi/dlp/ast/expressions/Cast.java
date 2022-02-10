package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Type;

public class Cast extends AbstractExpression {

    private final Expression expression;
    private final Type castType;

    public Cast(Expression expression, Type castType, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.castType = castType;
    }
}
