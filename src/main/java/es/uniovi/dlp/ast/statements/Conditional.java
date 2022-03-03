package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;

import java.util.List;

public class Conditional extends AbstractASTNode implements Statement {

    private  Expression condition;
    private  List<Statement> ifBody;
    private  List<Statement> elseBody;

    public Conditional(Expression condition, List<Statement> ifBody, List<Statement> elseBody, int line, int column) {

        super(line, column);
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }
}
