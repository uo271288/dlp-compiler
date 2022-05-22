package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.FunctionInvocation;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Definition> {

    private CodeGeneration cg;
    private ValueCGVisitor valueCGV;
    private AddressCGVisitor addressCGV;

    public ExecuteCGVisitor(CodeGeneration cg) {
        this.cg = cg;
        valueCGV = new ValueCGVisitor(cg);
        addressCGV = new AddressCGVisitor(cg);
        valueCGV.setAddressCGV(addressCGV);
        addressCGV.setValueCGV(valueCGV);
    }

    @Override
    public Type visit(Program program, Definition param) {
        cg.source();
        program.getDefinitions().forEach(definition -> {
            if (definition instanceof VariableDefinition varDef) {
                varDef.accept(this, param);
            }
        });
        cg.callMain();
        program.getDefinitions().forEach(definition -> {
            if (definition instanceof FunctionDefinition funcDef) {
                funcDef.accept(this, param);
            }
        });
        return null;
    }

    @Override
    public Type visit(VariableDefinition varDef, Definition param) {

        super.visit(varDef, param);
        cg.comment(varDef.getName() + " :: " + varDef.getType().toString() + " (offset " + varDef.getOffset() + ")");

        return null;
    }

    @Override
    public Type visit(FunctionDefinition funcDef, Definition param) {
        cg.line(funcDef.getLine());
        cg.label(funcDef.getName());

        cg.comment("Parameters");
        FunctionType funcType = ((FunctionType) funcDef.getType());
        funcType.getParams().forEach(fParam ->
                fParam.accept(this, param)
        );
        int paramsSize = funcType.getParams().stream()
                .map(fParam -> fParam.getType().getNumberOfBytes())
                .reduce(0, (total, paramSize) -> total + paramSize);

        cg.comment("Local variables");
        funcDef.getLocalVars().forEach(localVar ->
                localVar.accept(this, param)
        );
        int localVarsSize = funcDef.getLocalVars().stream()
                .map(localVar -> localVar.getType().getNumberOfBytes())
                .reduce(0, (total, localVarSize) -> total + localVarSize);

        cg.enter(localVarsSize);
        funcDef.getStatements().forEach(statement ->
                statement.accept(this, funcDef));
        cg.ret(funcType.getReturnType().getNumberOfBytes(), localVarsSize, paramsSize);

        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Definition param) {
        cg.line(functionInvocation.getLine());
        functionInvocation.accept(valueCGV, null);
        if (functionInvocation.getType() instanceof FunctionType functionType) {
            if (!(functionType.getReturnType() instanceof VoidType)) {
                cg.pop(functionType.getReturnType());
            }
        }
        return null;
    }

    @Override
    public Type visit(Assignment assignment, Definition param) {
        super.visit(assignment, param);

        cg.line(assignment.getLine());
        assignment.getLeftExpr().accept(addressCGV, null);
        assignment.getRightExpr().accept(valueCGV, null);
        cg.promoteTo(assignment.getLeftExpr().getType(), assignment.getRightExpr().getType());
        cg.store(assignment.getLeftExpr().getType());
        return null;
    }

    @Override
    public Type visit(In in, Definition param) {
        cg.line(in.getLine());
        cg.comment("Read");
        in.getExpression().accept(addressCGV, null);
        cg.in(in.getExpression().getType());
        cg.store(in.getExpression().getType());
        return null;
    }

    @Override
    public Type visit(Puts puts, Definition param) {
        cg.line(puts.getLine());
        cg.comment("Write");
        puts.getExpression().accept(valueCGV, null);
        cg.out(puts.getExpression().getType());
        return null;
    }

    @Override
    public Type visit(Conditional conditional, Definition param) {
        cg.line(conditional.getLine());
        cg.comment("If statement");
        conditional.getCondition().accept(valueCGV, null);
        int elseLabel = cg.getLabel();
        int ifEndLabel = cg.getLabel();
        cg.jz(elseLabel);
        cg.comment("Body of the if branch");
        conditional.getIfBody().forEach(statement -> statement.accept(this, param));
        cg.jmp(ifEndLabel);
        cg.label(elseLabel);
        cg.comment("Body of the else branch");
        conditional.getElseBody().forEach(statement -> statement.accept(this, param));
        cg.label(ifEndLabel);
        return null;
    }

    @Override
    public Type visit(While aWhile, Definition param) {
        cg.line(aWhile.getLine());
        cg.comment("While statement");
        int whileLabel = cg.getLabel();
        int whileEndLabel = cg.getLabel();
        cg.label(whileLabel);
        aWhile.getCondition().accept(valueCGV, null);
        cg.jz(whileEndLabel);
        cg.comment("Body of the while statement");
        aWhile.getBody().forEach(statement -> statement.accept(this, param));
        cg.jmp(whileLabel);
        cg.label(whileEndLabel);
        return null;
    }

    @Override
    public Type visit(Return aReturn, Definition param) {
        cg.line(aReturn.getLine());
        var funcDef = (FunctionDefinition) param;
        cg.comment("Return");
        aReturn.getExpression().accept(valueCGV, null);
        cg.promoteTo(aReturn.getExpression().getType(), funcDef.getType());
        return null;
    }
}