package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Type;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    public abstract String getTypeExpression();

    @Override
    public String toString() {
        return getTypeExpression();
    }

    @Override
    public Type arithmetic(Type type) {
        return type instanceof ErrorType?type:null;
    }

    @Override
    public Type logical(Type type) {
        return type instanceof ErrorType?type:null;
    }

    @Override
    public Type indexing(Type type) {
        return type instanceof ErrorType?type:null;
    }

    @Override
    public Type dot(Type type) {
        return type instanceof ErrorType?type:null;
    }

    @Override
    public Type cast(Type type) {
        return type instanceof ErrorType?type:null;
    }

    @Override
    public Type comparison(Type type) {
        return type instanceof ErrorType?type:null;
    }

    @Override
    public boolean promotableTo(Type to) {
        return false;
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public boolean isIndexable() {
        return false;
    }

    @Override
    public boolean isArithmetic() {
        return false;
    }

    @Override
    public boolean allowDot() {
        return false;
    }

    @Override
    public boolean isCast() {
        return false;
    }

    @Override
    public boolean isComparable() {
        return false;
    }
}
