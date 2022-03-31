package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class FieldAccess extends AbstractExpression {

    private  Expression expression;
    private  String field;


    public FieldAccess(Expression expression, String field, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.field = field;
    }

    @Override
    public boolean isLValue() {
        return true;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public Expression getExpression() {
        return expression;
    }

    public String getField() {
        return field;
    }
}
