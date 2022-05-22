package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.visitor.Visitor;

public class VoidType extends AbstractType {

    private static VoidType instance;

    private VoidType() {

        super(0, 0);
    }

    public static VoidType getInstance() {
        if (instance == null)
            instance = new VoidType();
        return instance;
    }

    @Override
    public String getTypeExpression() {
        return "void";
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    @Override
    public int getNumberOfBytes() {
        return 0;
    }
}
