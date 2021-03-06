package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.RealType;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGeneration {

    private int currentLine;
    private OutputStreamWriter outWriter;
    private String filename;
    private int labelCounter;

    public CodeGeneration(OutputStreamWriter outWriter, String filename) {
        this.outWriter = outWriter;
        this.filename = filename;
    }

    public void call(String label) {
        write("call\t" + label);
    }

    public void callMain() {
        newLine();
        write("' Invocation to the main function", false);
        write("call main", false);
        write("halt", false);
        newLine();
    }

    public void enter(int size) {
        write("enter\t" + size);
    }

    public void ret(int returnSize, int localVarsSize, int paramsSize) {
        write("ret\t" + returnSize + ", " + localVarsSize + ", " + paramsSize);
    }

    public void source() {
        newLine();
        write("#source\t" + '"' + filename + '"', false);
        newLine();
    }

    public void label(int label) {
        write("label" + label + ":", false);
    }

    public void label(String label) {
        newLine();
        write(label + ":", false);
    }

    public void comment(String comment) {
        write("' " + comment);
    }

    public void line(int line) {
        if (line == currentLine)
            return;
        currentLine = line;
        newLine();
        write("#line\t" + line, false);
    }

    public void pusha(int address) {
        write("pusha\t" + address);
    }

    public void push(Type type, int value) {
        write("push" + getSuffix(type) + "\t" + value);
    }

    public void push(Type type, double value) {
        write("push" + getSuffix(type) + "\t" + value);
    }

    public void pushBp() {
        write("push\tbp");
    }


    public void add() {
        write("addi");
    }

    public void mul() {
        write("muli");
    }

    private void instruction(String operation, Type type) {
        write(operation + getSuffix(type));
    }

    private void instruction(String operation) {
        write(operation);
    }

    public void logic(String operator) {

        String instruction = switch (operator) {
            case "&&" -> "and";
            case "||" -> "or";
            case "!" -> "not";
            default -> "";
        };
        instruction(instruction);
    }

    public void arithmetic(String operator, Type type) {

        String instruction = switch (operator) {
            case "+" -> "add";
            case "-" -> "sub";
            case "*" -> "mul";
            case "/" -> "div";
            case "%" -> "mod";
            default -> "";
        };
        instruction(instruction, type);
    }

    public void comparison(String operator, Type type) {

        String instruction = switch (operator) {
            case ">" -> "gt";
            case "<" -> "lt";
            case ">=" -> "ge";
            case "<=" -> "le";
            case "==" -> "eq";
            case "!=" -> "ne";
            default -> "";
        };
        instruction(instruction, type);
    }

    public void b2i() {
        write("b2i");
    }

    public void i2f() {
        write("i2f");
    }

    public void f2i() {
        write("f2i");
    }

    public void i2b() {
        write("i2b");
    }

//    public void cast(Type from, Type to) {
//        castIntermediate(from, to);
//    }
//
//    public void castIntermediate(Type from, Type to) {
//        if (from.equals(to)) {
//            return;
//        }
//
//        Type intermediate = from.getIntermediateType(to);
//        write(getSuffix(from) + "2" + getSuffix(to));
//        castIntermediate(intermediate, to);
//    }

    public void promoteTo(Type from, Type to) {
        if (from instanceof CharType) {
            if (to instanceof RealType) {
                b2i();
                i2f();
            }
            if (to instanceof IntType)
                b2i();
        }
        if (from instanceof RealType) {
            if (to instanceof IntType)
                f2i();
            if (to instanceof CharType) {
                f2i();
                i2b();
            }
        }
        if (from instanceof IntType) {
            if (to instanceof RealType)
                i2f();
            if (to instanceof CharType)
                i2b();
        }
    }

    public void store(Type type) {
        write("store" + getSuffix(type));
    }

    public void load(Type type) {
        write("load" + getSuffix(type));
    }

    public void in(Type type) {
        write("in" + getSuffix(type));
    }

    public void out(Type type) {
        write("out" + getSuffix(type));
    }

    public void pop(Type type) {
        write("pop" + getSuffix(type));
    }

    public void jmp(int label) {
        write("jmp\tlabel" + label);
    }

    public void jz(int label) {
        write("jz\tlabel" + label);
    }

    public void jnz(int label) {
        write("jnz\tlabel" + label);
    }

    public int getLabel() {
        return labelCounter++;
    }

    public String getSuffix(Type type) {
        if (type instanceof CharType) {
            return "b";
        }
        if (type instanceof RealType) {
            return "f";
        }
        return "i";
    }

    private void write(String text) {

        write(text, true);
    }

    private void write(String text, boolean tab) {

        try {
            if (!tab)
                outWriter.write(text);
            else
                outWriter.write("\t" + text);
            newLine();
            outWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void newLine() {
        try {
            outWriter.write("\n");
            outWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
