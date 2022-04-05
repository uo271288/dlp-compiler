package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VariableDefinition;
import es.uniovi.dlp.ast.expressions.FunctionInvocation;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.ErrorType;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
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
                ErrorManager.getInstance().addError(new Error(new Location(repeated.getLine(), repeated.getColumn()),
                        ErrorReason.FIELD_ALREADY_DECLARED)));
        return null;
    }

    @Override
    public Type visit(VariableDefinition varDef, Type param) {
        if (st.findInCurrentScope(varDef.getName()) == null)
            st.insert(varDef);
        else
            ErrorManager.getInstance().addError(new Error(new Location(varDef.getLine(), varDef.getColumn()),
                    ErrorReason.VARIABLE_ALREADY_DECLARED));
        super.visit(varDef, param);
        return null;
    }

    @Override
    public Type visit(FunctionDefinition funDef, Type param) {
        if (st.find(funDef.getName()) == null)
            st.insert(funDef);
        else
            ErrorManager.getInstance().addError(new Error(new Location(funDef.getLine(), funDef.getColumn()),
                    ErrorReason.FUNCTION_ALREADY_DECLARED));
        st.set();
        super.visit(funDef, param);
        st.reset();
        return null;
    }

    @Override
    public Type visit(FunctionInvocation functionInvocation, Type param) {
        var find = st.find(functionInvocation.getVariable().getName());
        if (find == null) {
            ErrorManager.getInstance().addError(new Error(new Location(functionInvocation.getLine(), functionInvocation.getColumn()),
                    ErrorReason.FUNCTION_NOT_DECLARED));
        } else
            super.visit(functionInvocation, param);
        return null;
    }

    @Override
    public Type visit(Variable variable, Type param) {
        var find = st.find(variable.getName());
        if (find == null) {
            ErrorManager.getInstance().addError(new Error(new Location(variable.getLine(), variable.getColumn()),
                    ErrorReason.VARIABLE_NOT_DECLARED));
            variable.setDefinition(new VariableDefinition(new ErrorType(variable.getLine(), variable.getColumn(), "Variable not declared"),
                    "Error", variable.getLine(), variable.getColumn()));
        } else
            variable.setDefinition(find);
        super.visit(variable, param);
        return null;
    }
}
