package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.VariableDefinition;

import java.util.List;

public class FunctionType extends AbstractType {


    private List<VariableDefinition> params;
    private Type returnType;

    public FunctionType(List<VariableDefinition> params, Type returnType, int line, int column) {

        super(line, column);
        this.params = params;
        this.returnType = returnType;
    }
}
