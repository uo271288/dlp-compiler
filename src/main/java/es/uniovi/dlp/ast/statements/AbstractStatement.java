package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Statement;

public abstract class AbstractStatement extends AbstractASTNode implements Statement {


    public AbstractStatement(int line, int column) {
        super(line, column);
    }
}
