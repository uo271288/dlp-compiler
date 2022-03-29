package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.RealType;
import es.uniovi.dlp.visitor.Visitor;

public class RealLiteral extends AbstractExpression {

    private double value;

    public RealLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
        setType(new RealType(line, column));
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
