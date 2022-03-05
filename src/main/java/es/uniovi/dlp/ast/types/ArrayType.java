package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;

public class ArrayType extends AbstractType {

    private int size;
    private Type type;

    public ArrayType(int size, Type type, int line, int column) {

        super(line, column);
        this.size = size;
        this.type = type;
    }

    @Override
    public String getTypeExpression() {
        return "[" + size + "::" + type + "]";
    }
}
