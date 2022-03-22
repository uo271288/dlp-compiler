package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Definition;
import es.uniovi.dlp.ast.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    private int scope;
    private String name;
    private Type type;

    public AbstractDefinition(Type type, String name, int line, int column) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }
}
