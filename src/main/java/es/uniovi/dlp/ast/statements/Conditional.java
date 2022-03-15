package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class Conditional extends AbstractStatement {

    private  Expression condition;
    private  List<Statement> ifBody;
    private  List<Statement> elseBody;

    public Conditional(Expression condition, List<Statement> ifBody, List<Statement> elseBody, int line, int column) {

        super(line, column);
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }
}
