package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class CharType extends AbstractType {

    private static CharType instance;

    private CharType() {

        super(0, 0);
    }

    public static CharType getInstance() {
        if (instance == null)
            instance = new CharType();
        return instance;
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
            return IntType.getInstance();
        if (type instanceof RealType)
            return RealType.getInstance();
        return super.arithmetic(type);
    }

    @Override
    public Type comparison(Type type) {
        if (type instanceof IntType || type instanceof CharType || type instanceof RealType)
            return IntType.getInstance();
        return super.comparison(type);
    }

    @Override
    public Type cast(Type castType) {
        if (castType instanceof IntType || castType instanceof CharType || castType instanceof RealType)
            return castType;
        return super.cast(castType);
    }

    //    @Override
//    public boolean promotableTo(Type to) {
//        if ((to instanceof FunctionType && ((FunctionType) to).getReturnType() instanceof CharType)
//                || to instanceof CharType)
//            return true;
//        return false;
//    }
//
    @Override
    public boolean promotableTo(Type to) {
        return to instanceof IntType || to instanceof RealType || super.promotableTo(to);
    }

    @Override
    public Type assignment(Type type) {
        if (type instanceof CharType)
            return type;
        return null;
    }

    @Override
    public int getNumberOfBytes() {
        return 1;
    }
}
