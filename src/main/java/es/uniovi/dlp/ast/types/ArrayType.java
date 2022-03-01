package es.uniovi.dlp.ast.types;

public class ArrayType extends AbstractType {

    private int size;

    public ArrayType(int size, int line, int column) {

        super(line, column);
        this.size = size;
    }
}
