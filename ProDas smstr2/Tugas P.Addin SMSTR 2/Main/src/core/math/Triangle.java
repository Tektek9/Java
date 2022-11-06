package core.math;

public class Triangle {
    private double width;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    private double height;

    public Triangle() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHypotenuse() {
        return Math.sqrt(this.width * this.width + this.height * this.height);
    }
}
