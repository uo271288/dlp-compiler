package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;

public class Logical extends AbstractExpression {

    private  Expression operand1;
    private  Expression operand2;
    private  String operator;

    public Logical(Expression operand1, Expression operand2, String operator, int line, int column) {
        super(line, column);
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
}
