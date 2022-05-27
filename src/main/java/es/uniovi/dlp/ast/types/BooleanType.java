package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

public class BooleanType extends AbstractType {
    private static BooleanType instance;

    private BooleanType() {

        super(0, 0);
    }

    public static BooleanType getInstance() {
        if (instance == null)
            instance = new BooleanType();
        return instance;
    }

    @Override
    public String getTypeExpression() {
        return "boolean";
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    @Override
    public Type comparison(Type type) {
        if (type instanceof BooleanType)
            return BooleanType.getInstance();
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
        return to instanceof BooleanType || super.promotableTo(to);
    }

    @Override
    public Type assignment(Type type) {
        if (type instanceof BooleanType)
            return type;
        return null;
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type logical(Type type) {
        return type instanceof BooleanType ? type : super.logical(type);
    }

    @Override
    public int getNumberOfBytes() {
        return 2;
    }
}
