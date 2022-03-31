package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
    }

    @Override
    public String getTypeExpression() {
        return "Error: " + message + " line: " + getLine() + ", column: " + getColumn();
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return null;
    }
}
