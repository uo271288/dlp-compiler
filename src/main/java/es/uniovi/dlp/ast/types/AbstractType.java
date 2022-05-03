package es.uniovi.dlp.ast.types;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Expression;
import es.uniovi.dlp.ast.Type;

import java.util.List;

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
        return type instanceof ErrorType ? type : null;
    }

    @Override
    public Type logical(Type type) {
        return type instanceof ErrorType ? type : null;
    }

    @Override
    public Type indexing(Type type) {
        return type instanceof ErrorType ? type : null;
    }

    @Override
    public Type dot(String type) {
        return null;
    }

    @Override
    public Type cast(Type type) {
        return type instanceof ErrorType ? type : null;
    }

    @Override
    public Type comparison(Type type) {
        return type instanceof ErrorType ? type : null;
    }

    @Override
    public Type assignment(Type type) {
        return type instanceof ErrorType ? type : null;
    }

    @Override
    public Type call(List<Expression> args) {
        return null;
    }

//    public Type getIntermediateType(Type to) {
//        if (to instanceof ErrorType) {
//            return new ErrorType(0, 0, "");
//        }
//        return null;
//    }
//
//    @Override
//    public boolean promotableTo(Type to) {
//        if (to instanceof ErrorType) {
//            return true;
//        }
//        return to.equals(to);
//    }

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
    public boolean allowDot(String field) {
        return true;
    }

    @Override
    public boolean isCast() {
        return false;
    }

    @Override
    public boolean hasDifferentArgs(List<Expression> args) {
        return false;
    }

    @Override
    public int getNumberOfBytes() {
        return 0;
    }

    @Override
    public int getFieldOffset(String field) {
        return -1024; // return min stack address?
    }
}
