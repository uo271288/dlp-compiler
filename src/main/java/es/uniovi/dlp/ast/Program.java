package es.uniovi.dlp.ast;

import java.util.List;

public class Program extends AbstractASTNode {

    private final List<Definition> definitions;

    public Program(List<Definition> definitions, int line, int column) {
        super(line, column);
        this.definitions = definitions;
    }
}
