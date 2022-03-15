package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class IntLiteral extends AbstractExpression {

    private  int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
