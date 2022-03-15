package es.uniovi.dlp.ast;

import es.uniovi.dlp.visitor.Visitor;

import java.util.List;

public class Program extends AbstractASTNode {

    private  List<Definition> definitions;

    public Program(List<Definition> definitions, int line, int column) {
        super(line, column);
        this.definitions = definitions;
    }

    public List<Definition> getDefinitions() {
        return definitions;
    }


    @Override
    public <ReturnType, ParamType> ReturnType accept(Visitor<ReturnType, ParamType> visitor, ParamType param) {
        return visitor.visit(this, param);
    }
}
