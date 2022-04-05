package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class VariableDefinition extends AbstractDefinition {

    private int offset;

    public VariableDefinition(Type type, String name, int line, int column) {
        super(type, name, line, column);
    }

    @Override
    public String toString() {
        return getType().toString() + ":" + getName();
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
