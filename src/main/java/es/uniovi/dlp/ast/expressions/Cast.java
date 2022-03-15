package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class Cast extends AbstractExpression {

    private Expression expression;
    private Type castType;

    public Cast(Expression expression, Type castType, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.castType = castType;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public Expression getExpression() {
        return expression;
    }

    public Type getCastType() {
        return castType;
    }
}
