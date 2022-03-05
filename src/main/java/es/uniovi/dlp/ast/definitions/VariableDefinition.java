package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.Type;

public class VariableDefinition extends AbstractDefinition {

    public VariableDefinition(Type type, String name, int line, int column) {
        super(type, name, line, column);
    }

    @Override
    public String toString() {
        return getType().toString() + ":" + getName();
    }
}
