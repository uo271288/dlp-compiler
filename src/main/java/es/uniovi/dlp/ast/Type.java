package es.uniovi.dlp.ast;

import java.util.List;

public interface Type extends ASTNode {

    Type arithmetic(Type type);
    Type logical(Type type);
    Type indexing(Type type);
    Type dot(String type);
    Type cast(Type type);
    Type comparison(Type type);
    Type assignment(Type type);
    Type call(List<Expression> args);
//    Type getIntermediateType(Type to);
    boolean promotableTo(Type to);
    boolean isLogical();
    boolean isIndexable();
    boolean isArithmetic();
    boolean allowDot(String field);
    boolean isCast();
    boolean hasDifferentArgs(List<Expression> args);
    int getNumberOfBytes();

    int getFieldOffset(String field);
}
