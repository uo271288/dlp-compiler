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
}
