package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class BooleanLiteral extends AbstractExpression {
    private int value;

    public BooleanLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
