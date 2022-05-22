package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class StructField extends AbstractASTNode {

    private String name;
    private Type type;

    private int offset;

    public StructField(String name, Type type, int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "(" + name + " x " + type + ")";
    }

    public String getName() {
        return name;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public Type getType() {
        return type;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
