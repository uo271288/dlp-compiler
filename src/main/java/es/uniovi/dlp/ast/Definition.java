package es.uniovi.dlp.ast;

public interface Definition extends ASTNode {

    Type getType();
    void setScope(int scope);
    int getScope();
    String getName();
}
