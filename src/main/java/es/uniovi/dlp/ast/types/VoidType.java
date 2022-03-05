package es.uniovi.dlp.ast.types;

public class VoidType extends AbstractType {

    public VoidType(int line, int column) {

        super(line, column);
    }

    @Override
    public String getTypeExpression() {
        return "void";
    }
}
