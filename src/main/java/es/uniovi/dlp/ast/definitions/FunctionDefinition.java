package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class FunctionDefinition extends AbstractDefinition {

    private List<Statement> statements;
    private List<VariableDefinition> localVars;

    public FunctionDefinition(List<Statement> statements, List<VariableDefinition> localVars, Type type, String name, int line, int column) {
        super(type, name, line, column);
        this.statements = statements;
        this.localVars = localVars;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public List<VariableDefinition> getLocalVars() {
        return localVars;
    }

    public List<Statement> getStatements() {

        return statements;
    }
}
