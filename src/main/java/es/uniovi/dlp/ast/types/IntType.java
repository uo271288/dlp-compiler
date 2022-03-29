package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class IntType extends AbstractType {

    public IntType(int line, int column) {

        super(line, column);
    }

    @Override
    public String getTypeExpression() {
        return "int";
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }
}
