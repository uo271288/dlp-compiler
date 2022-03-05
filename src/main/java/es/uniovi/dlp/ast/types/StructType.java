package es.uniovi.dlp.ast.types;

import java.util.ArrayList;
import java.util.List;

public class StructType extends AbstractType {

    private List<StructField> fields;

    public StructType(List<StructField> fields, int line, int column) {

        super(line, column);
        this.fields = fields;
    }

    @Override
    public String getTypeExpression() {
        List<String> list = new ArrayList<>();
        fields.forEach(field -> list.add(field.toString()));
        return "fields{"+String.join(", ", list)+"}";
    }
}
