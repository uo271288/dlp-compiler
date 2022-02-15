package es.uniovi.dlp.ast.expressions;

public class Variable extends AbstractExpression {

    private final String name;

    public Variable(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }
}
