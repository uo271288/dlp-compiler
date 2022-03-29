package es.uniovi.dlp.ast;

public interface Expression extends ASTNode {

    Type getType();
    void setType(Type type);

    boolean isLValue();
}
