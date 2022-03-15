package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Statement;
import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private  String name;
    private  List<Expression> args;

    public FunctionInvocation(String name, List<Expression> args, int line, int column) {
        super(line, column);
        this.name = name;
        this.args = args;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }

    public List<Expression> getArgs() {
        return args;
    }
}
