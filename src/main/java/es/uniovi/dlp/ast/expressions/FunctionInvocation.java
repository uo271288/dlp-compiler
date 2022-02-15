package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

import java.util.List;

public class FunctionInvocation extends AbstractExpression {

    private final Variable variable;
    private final List<Expression> args;


    public FunctionInvocation(Variable variable, List<Expression> args, int line, int column) {
        super(line, column);
        this.variable = variable;
        this.args = args;
    }
}
