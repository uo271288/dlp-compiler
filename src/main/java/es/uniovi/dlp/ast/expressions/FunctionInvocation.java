package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

import java.util.List;

public class FunctionInvocation extends AbstractExpression {

    private final String name;
    private final List<Expression> args;


    public FunctionInvocation(String name, List<Expression> args, int line, int column) {
        super(line, column);
        this.name = name;
        this.args = args;
    }
}
