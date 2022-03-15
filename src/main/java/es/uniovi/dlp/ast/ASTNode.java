package es.uniovi.dlp.ast;

import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.visitor.Visitor;

public interface ASTNode {
    int getLine();

    int getColumn();

    <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param);
}
