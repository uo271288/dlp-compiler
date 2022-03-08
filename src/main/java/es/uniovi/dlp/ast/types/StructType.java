package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StructType extends AbstractType {

    private List<StructField> fields;

    public StructType(List<StructField> fields, int line, int column) {

        super(line, column);
        this.fields = fields;

        checkRepeatedFields();
    }

    @Override
    public String getTypeExpression() {
        List<String> list = new ArrayList<>();
        fields.forEach(field -> list.add(field.toString()));
        return "fields{" + String.join(", ", list) + "}";
    }

    private void checkRepeatedFields() {
        Set<String> repeatedFields = new HashSet<>();
        fields.stream().filter(field -> !repeatedFields.add(field.getName())).forEach(repeated ->
                ErrorManager.getInstance().getErrors().add(new Error(repeated.getLine(), repeated.getColumn(),
                        ErrorReason.FIELD_ALREADY_DECLARED)));

    }
}
