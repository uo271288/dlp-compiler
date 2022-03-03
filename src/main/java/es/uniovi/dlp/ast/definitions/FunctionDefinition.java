package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.ast.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> params;
    private List<Statement> statements;
    private List<VariableDefinition> variableDefinitions;

    public FunctionDefinition(List<Statement> statements, List<VariableDefinition> variableDefinitions, Type type, String name, int line, int column) {
        super(type, name, line, column);
        this.statements = statements;
        this.variableDefinitions = variableDefinitions;
    }
}
