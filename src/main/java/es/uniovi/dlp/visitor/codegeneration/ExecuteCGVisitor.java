package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VariableDefinition;
import es.uniovi.dlp.ast.statements.Return;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.ast.types.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Type> {

    private CodeGeneration cg;
    private ValueCGVisitor valueCGV;
    private AddressCGVisitor addressCGV;

    public ExecuteCGVisitor(CodeGeneration cg) {
        this.cg = cg;
        valueCGV = new ValueCGVisitor();
        addressCGV = new AddressCGVisitor();
        valueCGV.setAddressCGV(addressCGV);
        addressCGV.setValueCGV(valueCGV);
    }

    @Override
    public Type visit(Program program, Type param) {
        cg.source();
        program.getDefinitions().forEach(definition -> {
            if (definition instanceof VariableDefinition varDef) {
                varDef.accept(this, param);
            }
        });
        cg.comment("Invocation to the main function");
        cg.call("main");
        cg.halt();
        program.getDefinitions().forEach(definition -> {
            if (definition instanceof FunctionDefinition funcDef) {
                funcDef.accept(this, param);
            }
        });
        return null;
    }

    @Override
    public Type visit(VariableDefinition varDef, Type param) {

        cg.comment(varDef.getName() + " :: " + varDef.getType().toString() + "(offset " + varDef.getOffset() + ")");

        super.visit(varDef, param);
        return null;
    }

    @Override
    public Type visit(FunctionDefinition funcDef, Type param) {

        cg.label(funcDef.getName());
        int localVarsSize = 0;
        for (var localVar : funcDef.getLocalVars()) {
            localVarsSize += localVar.getType().getNumberOfBytes();
        }
        cg.enter(localVarsSize);

        super.visit(funcDef, param);
        if (((FunctionType) funcDef.getType()).getReturnType() instanceof VoidType) {
            int paramsSize = 0;
            for (var fParam : ((FunctionType) funcDef.getType()).getParams()) {
                paramsSize += fParam.getType().getNumberOfBytes();
            }
            cg.ret(0, localVarsSize, paramsSize);
        }
        return null;
    }

    @Override
    public Type visit(Return aReturn, Type param) {
        if (aReturn.getExpression() != null) {
            aReturn.accept(valueCGV, param);
        }
        super.visit(aReturn, param);
        return null;
    }
}