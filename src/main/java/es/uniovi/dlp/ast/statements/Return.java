package es.uniovi.dlp.ast.statements;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.visitor.Visitor;

public class Return extends AbstractStatement {

    private  Expression expression;

    public Return(Expression expression, int line, int column) {

        super(line, column);
        this.expression = expression;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public Expression getExpression() {
        return expression;
    }
}
