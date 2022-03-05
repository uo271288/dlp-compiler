package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.ast.Type;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> statements;
    private List<VariableDefinition> localVars;

    public FunctionDefinition(List<Statement> statements, List<VariableDefinition> localVars, Type type, String name, int line, int column) {
        super(type, name, line, column);
        this.statements = statements;
        this.localVars = localVars;
    }
}
