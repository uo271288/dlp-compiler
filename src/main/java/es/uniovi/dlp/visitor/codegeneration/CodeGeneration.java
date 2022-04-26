package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.Type;
import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.RealType;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class CodeGeneration {

    private int currentLine;
    private OutputStreamWriter outWriter;
    private String filename;

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
        String name = Arrays.asList(filename.split("/")).get(Arrays.asList(filename.split("/")).size() - 1);
        write("#source\t" + '"' + name + '"', false);
        newLine();
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

    public void push(int value) {
        write("pushi\t" + value);
    }

    public void push(double value) {
        write("pushf\t" + value);
    }

    public void pushBp() {
        write("push\tbp");
    }


    public void add() {
        write("addi");
    }

    private void instruction(String operation, Type type) {
        write(operation + getSuffix(type));
    }

    private void instruction(String operation) {
        write(operation);
    }

    public void logic(String operator) {

        switch (operator) {
            case "&&" -> instruction("and");
            case "||" -> instruction("or");
            case "!" -> instruction("not");
        }

    }

    public void arithmetic(String operator, Type type) {

        switch (operator) {
            case "+" -> instruction("add", type);
            case "-" -> instruction("sub", type);
            case "*" -> instruction("mul", type);
            case "/" -> instruction("div", type);
            case "%" -> instruction("mod", type);
        }

    }

    public void comparison(String operator, Type type) {

        switch (operator) {
            case ">" -> instruction("gt", type);
            case "<" -> instruction("lt", type);
            case ">=" -> instruction("ge", type);
            case "<=" -> instruction("le", type);
            case "==" -> instruction("eq", type);
            case "!=" -> instruction("ne", type);
        }
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
                i2f();
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

    public void jmp(String label) {
        write("jmp " + label);
    }

    public void jz(String label) {
        write("jz " + label);
    }

    public String getSuffix(Type type) {
        if (type instanceof CharType) {
            return "b";
        }
        if (type instanceof RealType) {
            return "f";
        }
        if (type instanceof IntType) {
            return "i";
        }
        return "";
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
