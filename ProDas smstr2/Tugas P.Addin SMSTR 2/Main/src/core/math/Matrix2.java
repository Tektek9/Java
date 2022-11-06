package core.math;

public class Matrix2 {
    public double getM1() {
        return m1;
    }

    public double getM2() {
        return m2;
    }

    public double getM3() {
        return m3;
    }

    public double getM4() {
        return m4;
    }

    private final double m1;
    private final double m2;
    private final double m3;
    private final double m4;

    public Matrix2(double m1, double m2, double m3, double m4) {

        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    public double dot(Matrix2 matrix) {
        return this.m1 * matrix.m1 + this.m2 * matrix.m2 +
                this.m3 * matrix.m3 + this.m4 * matrix.m4;
    }
}
