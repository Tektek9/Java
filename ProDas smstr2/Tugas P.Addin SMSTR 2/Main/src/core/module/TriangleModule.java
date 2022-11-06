package core.module;

import core.math.Triangle;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TriangleModule extends BaseModule<Triangle> {

    public TriangleModule(InputStream in, PrintStream out) {
        super(in, out);
    }

    @Override
    protected Triangle readInput() throws IOException {

        super.writer.print("Panjang: ");
        double width = Double.parseDouble(super.reader.readLine());
        super.writer.print("Tinggi: ");
        double height = Double.parseDouble(super.reader.readLine());

        return new Triangle(width, height);
    }


    @Override
    protected void core(Triangle triangle) throws IOException {
        super.writer.println("Hypotenusa: " + triangle.getHypotenuse());
    }


    @Override
    public String getModuleName() {
        return "Modul 1. Menghitung Hipotenusa dengan Phytagoras";
    }
}
