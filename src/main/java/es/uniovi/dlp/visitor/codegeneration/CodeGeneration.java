package es.uniovi.dlp.visitor.codegeneration;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGeneration {

    private OutputStreamWriter out;
    private String filename;

    public CodeGeneration(OutputStreamWriter out, String filename) {
        this.out = out;
        this.filename = filename;
    }

    public void call(String label) {
        writeInstruction("call\t" + label);
    }

    public void halt() {
        writeInstruction("halt");
    }

    public void enter(int size) {
        writeInstruction("enter\t" + size);
    }

    public void ret(int returnSize, int localVarsSize, int paramsSize) {
        writeInstruction("ret\t" + returnSize + "," + localVarsSize + "," + paramsSize);
    }

    public void writeInstruction(String instruction) {
        write(instruction);
    }

    public void source() {
        newLine();
        write("#source\t" + '"' + filename + '"');
        newLine();
    }

    public void label(String label) {
        write(label + ":");
    }

    public void comment(String comment) {

        write("' " + comment);
    }

    private void write(String text) {

        try {
            out.write(text);
            newLine();
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void newLine() {
        try {
            out.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
