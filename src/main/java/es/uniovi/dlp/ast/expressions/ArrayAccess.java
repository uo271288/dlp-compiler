package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

public class ArrayAccess extends AbstractExpression {

    private  Expression array;
    private  Expression index;

    public ArrayAccess(Expression array, Expression index, int line, int column) {
        super(line, column);
        this.array = array;
        this.index = index;
    }
}
