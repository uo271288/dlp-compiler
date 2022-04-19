package es.uniovi.dlp.compiler;

import es.uniovi.dlp.ast.Program;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import es.uniovi.dlp.visitor.codegeneration.CodeGeneration;
import es.uniovi.dlp.visitor.codegeneration.ExecuteCGVisitor;
import es.uniovi.dlp.visitor.codegeneration.OffsetVisitor;
import es.uniovi.dlp.visitor.semantic.IdentificationVisitor;
import es.uniovi.dlp.visitor.semantic.TypeCheckingVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Compiler {
    private final String filename;
    private Program program;
    private boolean reportErrors = true;
    private OutputStreamWriter out;
    private boolean showDebug = true;

    public Compiler(String filename) {
        this.filename = filename;
        assignDefaultOutput();
    }

    public Compiler(String filename, OutputStreamWriter out) {
        this.filename = filename;
        this.out = out;
    }

    private void assignDefaultOutput() {
        try {
            this.out = new FileWriter(filename + ".mp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setShowDebug(boolean showDebug) {
        this.showDebug = showDebug;
    }

    public void run() throws IOException {
        ErrorManager.getInstance().clearErrors();
        program = parse(filename);
        assignScope();
        assignType();
        assignOffset();
        checkErrors();
        generateCode();
    }

    private void checkErrors() {
        if (!reportErrors) return;

        ErrorManager errorManager = ErrorManager.getInstance();
        if (errorManager.hasErrors()) {
            errorManager.getErrors().forEach(System.err::println);
            System.exit(-1);
        }
    }

    public Program getProgram() {
        return program;
    }

    private Program parse(String file) throws IOException {
        CharStream input = CharStreams.fromFileName(file);
        XanaLexer lexer = new XanaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XanaParser parser = new XanaParser(tokens);

        return parser.program().ast;
    }

    private void assignScope() {
        IdentificationVisitor identificationVisitor = new IdentificationVisitor();
        identificationVisitor.visit(program, null);
    }

    private void assignType() {
        TypeCheckingVisitor typeCheckingVisitor = new TypeCheckingVisitor();
        typeCheckingVisitor.visit(program, null);
    }

    private void assignOffset() {
        OffsetVisitor offsetVisitor = new OffsetVisitor();
        offsetVisitor.visit(program, null);
    }

    private void generateCode() {
        ExecuteCGVisitor executeCGVisitor = new ExecuteCGVisitor(new CodeGeneration(out, filename));
        executeCGVisitor.visit(program, null);
    }

    public void setReportErrors(boolean reportErrors) {
        this.reportErrors = reportErrors;
    }
}

