package es.uniovi.dlp.ast.definitions;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.Definition;
import es.uniovi.dlp.ast.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    private final String name;
    private final Type type;

    public AbstractDefinition(Type type, String name, int line, int column) {
        super(line, column);
        this.type = type;
        this.name = name;
    }
}
