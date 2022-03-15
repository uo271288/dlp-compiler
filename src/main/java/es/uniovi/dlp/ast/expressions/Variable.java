package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.visitor.Visitor;

public class Variable extends AbstractExpression {

    private  String name;

    public Variable(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    @Override
    public boolean isLValue() {
        return true;
    }
}
