package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.expressions.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, Type> {

    private CodeGeneration cg;
    private ValueCGVisitor valueCGV;

    public AddressCGVisitor(CodeGeneration cg) {
        this.cg = cg;
    }

    public void setValueCGV(ValueCGVisitor valueCGV) {
        this.valueCGV = valueCGV;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        super.visit(variable, param);
        if (variable.getDefinition() instanceof VariableDefinition varDef)
            if (variable.getDefinition().getScope() == 0)
                cg.pusha(varDef.getOffset());
            else {
                cg.pushBp();
                cg.push(varDef.getOffset());
                cg.add();
            }
        return null;
    }

    @Override
    public Type visit(ArrayAccess arrayAccess, Type param) {

        arrayAccess.getArray().accept(this, param);
        arrayAccess.getIndex().accept(valueCGV, param);
        cg.push(arrayAccess.getArray().getType(), arrayAccess.getType().getNumberOfBytes());
        cg.mul();
        cg.add();
        return null;
    }

    @Override
    public Type visit(FieldAccess fieldAccess, Type param) {
        super.visit(fieldAccess, param);

        cg.push(fieldAccess.getExpression().getType().getFieldOffset(fieldAccess.getField()));
        cg.add();
        return null;
    }
}
