package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class IntType extends AbstractType {

    private static IntType instance;

    private IntType() {

        super(0, 0);
    }

    public static IntType getInstance() {
        if (instance == null)
            instance = new IntType();
        return instance;
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
        if (type instanceof IntType || type instanceof CharType || type instanceof RealType)
            return type;
        return super.arithmetic(type);
    }

    @Override
    public Type logical(Type type) {
        return type instanceof IntType ? type : super.logical(type);
    }

    @Override
    public Type comparison(Type type) {
        if (type instanceof IntType || type instanceof CharType || type instanceof RealType)
            return this;
        return super.comparison(type);
    }

    @Override
    public Type cast(Type castType) {
        if (castType instanceof IntType || castType instanceof CharType || castType instanceof RealType)
            return castType;
        return super.cast(castType);
    }

    @Override
    public boolean promotableTo(Type to) {
        return (to instanceof FunctionType && ((FunctionType) to).getReturnType() instanceof IntType)
                || to instanceof IntType;
    }

    @Override
    public Type assignment(Type type) {
        if (type instanceof IntType)
            return type;
        return super.assignment(type);
    }

    @Override
    public int getNumberOfBytes() {
        return 2;
    }
}
