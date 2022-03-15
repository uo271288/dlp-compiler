package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.VariableDefinition;
import es.uniovi.dlp.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FunctionType extends AbstractType {


    private List<VariableDefinition> params;
    private Type returnType;

    public FunctionType(List<VariableDefinition> params, Type returnType, int line, int column) {

        super(line, column);
        this.params = params;
        this.returnType = returnType;
    }

    @Override
    public String getTypeExpression() {
        List<String> list = new ArrayList<String>();
        params.forEach(param -> list.add(param.toString()));
        return "function(" + String.join(", ", list) + ")" + ":" + returnType;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public List<VariableDefinition> getParams() {
        return params;
    }

    public Type getReturnType() {
        return returnType;
    }
}
