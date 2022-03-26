package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.types.StructField;
import es.uniovi.dlp.ast.types.StructType;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.HashSet;
import java.util.Set;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {

    SymbolTable st = new SymbolTable();

    @Override
    public Type visit(StructType structType, Type param) {
        Set<String> repeatedFields = new HashSet<>();
        structType.getFields().stream().filter(field -> !repeatedFields.add(field.getName())).forEach(repeated ->
                ErrorManager.getInstance().addError(new Error(repeated.getLine(), repeated.getColumn(),
                        ErrorReason.FIELD_ALREADY_DECLARED)));
        return null;
    }
}
