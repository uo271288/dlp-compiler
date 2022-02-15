package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;

import java.util.List;

public class While extends AbstractASTNode implements Statement {

    private final Expression condition;
    private final List<Statement> body;

    public While(Expression condition, List<Statement> body, int line, int column) {

        super(line, column);
        this.condition = condition;
        this.body = body;
    }
}
