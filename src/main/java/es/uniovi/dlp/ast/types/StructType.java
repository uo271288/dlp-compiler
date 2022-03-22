package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.Visitor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}
