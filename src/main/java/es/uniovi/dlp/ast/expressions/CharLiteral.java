package es.uniovi.dlp.ast.expressions;

import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.visitor.Visitor;

public class CharLiteral extends AbstractExpression {

    private char value;

    public CharLiteral(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
