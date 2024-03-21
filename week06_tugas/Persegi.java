package week06_tugas;

public class Persegi extends Shape {
    private double sisi;

    public Persegi() {}

    public Persegi(double sisi) {
        super("Merah");
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double getArea() {
        return sisi * sisi;
    }
    
    public double getParimeter() {
        return 4 * sisi;
    }
}
