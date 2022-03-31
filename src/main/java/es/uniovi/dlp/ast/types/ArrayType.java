package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

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


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public Type getType() {
        return type;
    }

    @Override
    public Type indexing(Type type) {
        return type instanceof IntType ? this.type : super.indexing(type);
    }
}
