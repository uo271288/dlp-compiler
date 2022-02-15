package es.uniovi.dlp.ast.expressions;

public class IntLiteral extends AbstractExpression {

    private final int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
