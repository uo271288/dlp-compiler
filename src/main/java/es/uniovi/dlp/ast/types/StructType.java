package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.Visitor;

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
        return "fields{" + String.join(", ", list) + "}";
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public List<StructField> getFields() {
        return fields;
    }

    @Override
    public Type dot(String fieldName) {
        for (StructField field : fields)
            if (field.getName().equals(fieldName))
                return field.getType();
        return super.dot(fieldName);
    }

    @Override
    public boolean allowDot(String fieldName) {
        for (StructField field : fields)
            if (field.getName().equals(fieldName))
                return true;
        return false;
    }

    @Override
    public int getNumberOfBytes() {
        int offset = 0;
        for (StructField field : fields)
            offset += field.getType().getNumberOfBytes();
        return offset;
    }
}
