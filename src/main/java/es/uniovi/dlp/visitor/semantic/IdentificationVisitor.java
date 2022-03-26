package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VariableDefinition;
import es.uniovi.dlp.ast.expressions.FunctionInvocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.HashSet;
import java.util.Set;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {

    SymbolTable st = new SymbolTable();

    @Override
    public Type visit(StructType structType, Type param) {
        structType.getFields().forEach(field -> field.accept(this, param));
        Set<String> repeatedFields = new HashSet<>();
        structType.getFields().stream().filter(field -> !repeatedFields.add(field.getName())).forEach(repeated ->
                ErrorManager.getInstance().addError(new Error(repeated.getLine(), repeated.getColumn(),
                        ErrorReason.FIELD_ALREADY_DECLARED)));
        return null;
    }

    @Override
    public Type visit(VariableDefinition varDef, Type param) {
        if (st.findInCurrentScope(varDef.getName()) == null)
            st.insert(varDef);
        else
            ErrorManager.getInstance().addError(new Error(varDef.getLine(), varDef.getColumn(),
                    ErrorReason.VARIABLE_ALREADY_DECLARED));
        varDef.getType().accept(this, param);
        return null;
    }

    @Override
    public Type visit(FunctionDefinition funDef, Type param) {
        if (st.find(funDef.getName()) == null)
            st.insert(funDef);
        else
            ErrorManager.getInstance().addError(new Error(funDef.getLine(), funDef.getColumn(),
                    ErrorReason.FUNCTION_ALREADY_DECLARED));
        st.set();
        funDef.getType().accept(this, param);
        funDef.getLocalVars().forEach(var -> var.accept(this, param));
        funDef.getStatements().forEach(statement -> statement.accept(this, param));
        st.reset();
        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        var find = st.find(functionInvocation.getVariable().getName());
        if (find == null)
            ErrorManager.getInstance().addError(new Error(functionInvocation.getLine(), functionInvocation.getColumn(),
                    ErrorReason.FUNCTION_NOT_DECLARED));
        else {
            functionInvocation.getArgs().forEach(expression -> expression.accept(this, param));
            functionInvocation.getVariable().accept(this, param);
            return null;
        }
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        var find = st.find(variable.getName());
        if (find == null)
            ErrorManager.getInstance().addError(new Error(variable.getLine(), variable.getColumn(),
                    ErrorReason.VARIABLE_NOT_DECLARED));
        else
            variable.setDefinition(find);
        return null;
    }
}
