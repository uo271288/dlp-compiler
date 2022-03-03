package es.uniovi.dlp.ast.expressions;

public class CharLiteral extends AbstractExpression {

    private  char value;

    public CharLiteral(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }
}
