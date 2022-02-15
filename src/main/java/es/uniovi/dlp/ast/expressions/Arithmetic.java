package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

public class Arithmetic extends AbstractExpression {

    private final Expression operand1;
    private final Expression operand2;
    private final String operator;

    public Arithmetic(Expression operand1, Expression operand2, String operator, int line, int column) {
        super(line, column);
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}
