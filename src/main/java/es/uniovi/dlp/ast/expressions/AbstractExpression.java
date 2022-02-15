package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    private Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}
