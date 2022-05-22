package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class ErrorType extends AbstractType {

    private static ErrorType instance;

    private ErrorType() {

        super(0, 0);
    }

    public static ErrorType getInstance() {
        if (instance == null)
            instance = new ErrorType();
        return instance;
    }

    @Override
    public String getTypeExpression() {
        return "Error: line: " + getLine() + ", column: " + getColumn();
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return null;
    }

    @Override
    public int getNumberOfBytes() {
        return 0;
    }
}
