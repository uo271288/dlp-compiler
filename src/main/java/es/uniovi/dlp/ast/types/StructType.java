package es.uniovi.dlp.ast.types;

import java.util.List;

public class StructType extends AbstractType {

    private List<StructField> fields;

    public StructType(List<StructField> fields, int line, int column) {

        super(line, column);
        this.fields = fields;
    }
}
