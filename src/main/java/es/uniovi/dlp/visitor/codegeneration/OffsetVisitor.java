package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VariableDefinition;
import es.uniovi.dlp.ast.types.FunctionType;
import es.uniovi.dlp.ast.types.StructField;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Type, Type> {

    private int globalOffset = 0;

    @Override
    public Type visit(VariableDefinition varDef, Type param) {
        super.visit(varDef, param);
        if (varDef.getScope() == 0) {
            varDef.setOffset(globalOffset);
            globalOffset += varDef.getType().getNumberOfBytes();
        }
        return null;
    }

    @Override
    public Type visit(FunctionDefinition funcDef, Type param) {
        super.visit(funcDef, param);
        int localOffset = 0;
        for (VariableDefinition var : funcDef.getLocalVars()) {
            localOffset -= var.getType().getNumberOfBytes();
            var.setOffset(localOffset);
        }
        return null;
    }

    @Override
    public Type visit(StructType structType, Type param) {
        super.visit(structType, param);
        int structFieldOffset = 0;
        for (StructField field : structType.getFields()) {
            field.setOffset(structFieldOffset);
            structFieldOffset += field.getType().getNumberOfBytes();
        }
        return null;
    }

    @Override
    public Type visit(FunctionType functionType, Type param) {
        super.visit(functionType, param);
        int paramsOffset = 4;
        for (int i = functionType.getParams().size() - 1; i >= 0; i--) {
            functionType.getParams().get(i).setOffset(paramsOffset);
            paramsOffset += functionType.getParams().get(i).getType().getNumberOfBytes();
        }
        return null;
    }
}