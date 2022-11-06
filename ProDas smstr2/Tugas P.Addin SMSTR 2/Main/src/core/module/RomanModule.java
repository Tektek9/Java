package core.module;

import core.math.Roman;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class RomanModule extends BaseModule<Integer> {
    public RomanModule(InputStream in, PrintStream out) {
        super(in, out);
    }

    @Override
    protected Integer readInput() throws IOException {
        super.writer.print("Angka: ");
        int input = Integer.parseInt(super.reader.readLine());
        return input;
    }

    @Override
    protected void core(Integer s) throws IOException {
        System.out.println("Angka Romawi: " + Roman.toRoman(s));
    }


    @Override
    public String getModuleName() {
        return "Modul 5. Konversi angka bulat ke angka romawi";
    }
}
