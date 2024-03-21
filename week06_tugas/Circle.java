package week06_tugas;

public class Circle extends Shape {
    private double radius;

    public Circle() {}

    public Circle(double radius) {
        super("Biru");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getParimeter() {
        return Math.PI * 2 * radius;
    }
}
