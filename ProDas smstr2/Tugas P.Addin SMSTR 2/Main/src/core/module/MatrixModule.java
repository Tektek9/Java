package core.module;

import core.math.Matrix2;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;


class MatrixInput {
    Matrix2 m1;
    Matrix2 m2;

    public MatrixInput(Matrix2 m1, Matrix2 m2) {
        this.m1 = m1;
        this.m2 = m2;
    }
}

public class MatrixModule extends BaseModule<MatrixInput> {

    public MatrixModule(InputStream in, PrintStream out) {
        super(in, out);
    }

    @Override
    protected MatrixInput readInput() throws IOException {

        super.writer.print("Matrix 1 m1: ");
        double m11 = Double.parseDouble(super.reader.readLine());
        super.writer.print("Matrix 1 m2: ");
        double m12 = Double.parseDouble(super.reader.readLine());
        super.writer.print("Matrix 1 m3: ");
        double m13 = Double.parseDouble(super.reader.readLine());
        super.writer.print("Matrix 1 m4: ");
        double m14 = Double.parseDouble(super.reader.readLine());

        super.writer.println();

        super.writer.print("Matrix 2 m1: ");
        double m21 = Double.parseDouble(super.reader.readLine());
        super.writer.print("Matrix 2 m2: ");
        double m22 = Double.parseDouble(super.reader.readLine());
        super.writer.print("Matrix 2 m3: ");
        double m23 = Double.parseDouble(super.reader.readLine());
        super.writer.print("Matrix 2 m4: ");
        double m24 = Double.parseDouble(super.reader.readLine());

        return new MatrixInput(
                new Matrix2(m11, m12, m13, m14),
                new Matrix2(m21, m22, m23, m24)
        );

    }


    @Override
    protected void core(MatrixInput input) throws IOException {
        System.out.println("Perkalian Dot Matrix: " + input.m1.dot(input.m2));
    }


    @Override
    public String getModuleName() {
        return "Modul 2. Menghitung Perkalian Dot Matrix 2x2";
    }
}
