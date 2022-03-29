package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class ErrorType extends AbstractType{
    private static final ErrorType instance = new ErrorType();

    private ErrorType(){
        super(0,0);
    }

    public static ErrorType getInstance() {
        return instance;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return null;
    }

    @Override
    public String getTypeExpression() {
        return null;
    }
}
