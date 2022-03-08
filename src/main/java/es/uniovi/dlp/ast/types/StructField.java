package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Type;

public class StructField extends AbstractASTNode {

    private String name;
    private Type type;

    public StructField(String name, Type type, int line, int column) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + ":" + type;
    }

    public String getName() {
        return name;
    }
}
