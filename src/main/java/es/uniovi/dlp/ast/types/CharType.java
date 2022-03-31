package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class CharType extends AbstractType {

    public CharType(int line, int column) {
        super(line, column);
    }

    @Override
    public String getTypeExpression() {
        return "char";
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
    public Type arithmetic(Type type) {
        if (type instanceof CharType || type instanceof IntType)
            return new IntType(type.getLine(), type.getColumn());
        if (type instanceof RealType)
            return new RealType(type.getLine(), type.getColumn());
        return super.arithmetic(type);
    }

    @Override
    public Type comparison(Type leftType) {
        if (leftType instanceof IntType || leftType instanceof CharType || leftType instanceof RealType)
            return new IntType(getLine(), getColumn());
        return null;
    }

    @Override
    public Type cast(Type castType) {
        if (castType instanceof IntType || castType instanceof CharType || castType instanceof RealType)
            return castType;
        return null;
    }
}
