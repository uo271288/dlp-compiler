package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, Type> {

    private ValueCGVisitor valueCGV;

    public void setValueCGV(ValueCGVisitor valueCGV) {
        this.valueCGV = valueCGV;
    }
}
