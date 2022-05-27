package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class RealType extends AbstractType {
    private static RealType instance;

    private RealType() {

        super(0, 0);
    }

    public static RealType getInstance() {
        if (instance == null)
            instance = new RealType();
        return instance;
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
            return BooleanType.getInstance();
        return super.comparison(type);
    }

    @Override
    public Type cast(Type castType) {
        if (castType instanceof IntType || castType instanceof RealType)
            return castType;
        return super.cast(castType);
    }

    // remove
    @Override
    public boolean promotableTo(Type to) {
        return (to instanceof FunctionType && ((FunctionType) to).getReturnType() instanceof RealType)
                || to instanceof RealType;
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
