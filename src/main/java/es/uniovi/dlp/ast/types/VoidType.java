package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class VoidType extends AbstractType {

    public VoidType(int line, int column) {

        super(line, column);
    }

    @Override
    public String getTypeExpression() {
        return "void";
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
