package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class ErrorType extends AbstractType{


    public ErrorType(int line, int column) {
        super(line, column);
    }

    @Override
    public String getTypeExpression() {
        return null;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return null;
    }
}
