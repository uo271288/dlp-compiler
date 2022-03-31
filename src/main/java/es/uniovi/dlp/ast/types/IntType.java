package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class IntType extends AbstractType {

    public IntType(int line, int column) {

        super(line, column);
    }

    @Override
    public String getTypeExpression() {
        return "int";
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    @Override
    public boolean isArithmetic() {
        return true;
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type type) {
        if (type instanceof CharType || type instanceof IntType)
            return new IntType(type.getLine(), type.getColumn());
        if (type instanceof RealType)
            return new RealType(type.getLine(), type.getColumn());
        return super.arithmetic(type);
    }

    @Override
    public Type logical(Type type) {
        return type instanceof IntType ? type : null;
    }
}
