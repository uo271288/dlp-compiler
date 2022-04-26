package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.definitions.*;
import es.uniovi.dlp.ast.expressions.FunctionInvocation;
import es.uniovi.dlp.ast.statements.*;
import es.uniovi.dlp.ast.types.*;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Type> {

    private CodeGeneration cg;
    private ValueCGVisitor valueCGV;
    private AddressCGVisitor addressCGV;

    // if_else counter
    private int conditionalCounter;
    // while counter
    private int whileCounter;

    public ExecuteCGVisitor(CodeGeneration cg) {
        this.cg = cg;
        valueCGV = new ValueCGVisitor(cg, new AddressCGVisitor(cg));
        addressCGV = valueCGV.getAddressCGV();
    }

    @Override
    public Type visit(Program program, Type param) {
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
    public Type visit(VariableDefinition varDef, Type param) {

        super.visit(varDef, param);
        cg.comment(varDef.getName() + " :: " + varDef.getType().toString() + " (offset " + varDef.getOffset() + ")");

        return null;
    }

    @Override
    public Type visit(FunctionDefinition funcDef, Type param) {
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
                statement.accept(this, param));
        if (funcType.getReturnType() instanceof VoidType) {
            cg.ret(0, localVarsSize, paramsSize);
        }

        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        cg.line(functionInvocation.getLine());
        functionInvocation.accept(valueCGV, param);
        if (functionInvocation.getType() instanceof FunctionType functionType) {
            if (!(functionType.getReturnType() instanceof VoidType)) {
                cg.pop(functionType.getReturnType());
            }
        }
        return null;
    }

    @Override
    public Type visit(Assignment assignment, Type param) {
        super.visit(assignment, param);

        cg.line(assignment.getLine());
        assignment.getLeftExpr().accept(addressCGV, param);
        assignment.getRightExpr().accept(valueCGV, param);
        cg.promoteTo(assignment.getLeftExpr().getType(), assignment.getRightExpr().getType());
        cg.store(assignment.getLeftExpr().getType());
        return null;
    }

    @Override
    public Type visit(In in, Type param) {
        cg.line(in.getLine());
        cg.comment("Read");
        in.getExpression().accept(addressCGV, param);
        cg.in(in.getExpression().getType());
        cg.store(in.getExpression().getType());
        return null;
    }

    @Override
    public Type visit(Puts puts, Type param) {
        cg.line(puts.getLine());
        cg.comment("Write");
        puts.getExpression().accept(valueCGV, param);
        cg.out(puts.getExpression().getType());
        return null;
    }

    @Override
    public Type visit(Return aReturn, Type param) {
        if (aReturn.getExpression() != null) {
            aReturn.accept(valueCGV, param);
        }
//        cg.ret(aReturn);
        return null;
    }

    @Override
    public Type visit(Conditional conditional, Type param) {
        cg.line(conditional.getLine());
        cg.comment("If statement");
        conditional.getCondition().accept(valueCGV, param);
        cg.jz("else_" + conditionalCounter);
        cg.comment("Body of the if branch");
        conditional.getIfBody().forEach(statement -> statement.accept(this, param));
        cg.jmp("end_if_" + conditionalCounter);
        cg.label("else_" + conditionalCounter);
        cg.comment("Body of the else branch");
        conditional.getElseBody().forEach(statement -> statement.accept(this, param));
        cg.label("end_if_" + conditionalCounter++);
        return null;
    }

    @Override
    public Type visit(While aWhile, Type param) {
        cg.line(aWhile.getLine());
        cg.comment("While statement");
        cg.label("while_" + whileCounter);
        aWhile.getCondition().accept(valueCGV, param);
        cg.jz("fin_while_" + whileCounter);
        cg.comment("Body of the while statement");
        aWhile.getBody().forEach(statement -> statement.accept(this, param));
        cg.jmp("while_" + whileCounter);
        cg.label("fin_while_" + whileCounter++);
        return null;
    }
}