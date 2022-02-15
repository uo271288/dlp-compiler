package es.uniovi.dlp.ast.expressions;

public class RealLiteral extends AbstractExpression {

    private final double value;

    public RealLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
