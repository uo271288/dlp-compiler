package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class Comparison extends AbstractExpression {

    private  Expression operand1;
    private  Expression operand2;
    private  String operator;

    public Comparison(Expression operand1, Expression operand2, String operator, int line, int column) {
        super(line, column);
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public Expression getOperand1() {
        return operand1;
    }

    public Expression getOperand2() {
        return operand2;
    }

    public String getOperator() {
        return operator;
    }
}
