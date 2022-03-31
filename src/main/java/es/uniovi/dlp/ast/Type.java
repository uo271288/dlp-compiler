package es.uniovi.dlp.ast;

public interface Type extends ASTNode {

    Type arithmetic(Type type);
    Type logical(Type type);
    Type indexing(Type type);
    Type dot(String type);
    Type cast(Type type);
    Type comparison(Type type);
    boolean promotableTo(Type to);
    boolean isLogical();
    boolean isIndexable();
    boolean isArithmetic();
    boolean allowDot();
    boolean isCast();
    boolean isComparable();
}
