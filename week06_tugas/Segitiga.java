package week06_tugas;

public class Segitiga extends Shape {
    private double alas, tinggi, miring;

    public Segitiga() {}

    public Segitiga(double alas, double tinggi, double miring) {
        super("Hitam");
        this.alas = alas;
        this.tinggi = tinggi;
        this.miring = miring;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getMiring() {
        return miring;
    }

    public double getArea() {
        return (alas * tinggi) / 2;
    }

    public double getParimeter() {
        return alas + tinggi + miring;
    }
}
