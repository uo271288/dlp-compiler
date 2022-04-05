package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class RealType extends AbstractType {


    public RealType(int line, int column) {

        super(line, column);
    }

    @Override
    public String getTypeExpression() {
        return "double";
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
        if (type instanceof RealType || type instanceof IntType)
            return type;
        return super.arithmetic(type);
    }

    @Override
    public Type comparison(Type type) {
        if (type instanceof IntType || type instanceof CharType || type instanceof RealType)
            return new IntType(getLine(), getColumn());
        return super.comparison(type);
    }

    @Override
    public Type cast(Type castType) {
        if (castType instanceof IntType || castType instanceof RealType)
            return castType;
        return super.cast(castType);
    }

    @Override
    public boolean promotableTo(Type to) {
        if ((to instanceof FunctionType && ((FunctionType) to).getReturnType() instanceof RealType)
                || to instanceof RealType)
            return true;
        return false;
    }

    @Override
    public Type assignment(Type type) {
        if (type instanceof RealType || type instanceof CharType || type instanceof IntType)
            return type;
        return super.assignment(type);
    }

    @Override
    public int getNumberOfBytes() {
        return 4;
    }
}
