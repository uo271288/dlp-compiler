package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {

    private AddressCGVisitor addressCGV;

    public void setAddressCGV(AddressCGVisitor addressCGV) {
        this.addressCGV = addressCGV;
    }
}
