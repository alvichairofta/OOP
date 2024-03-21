package week06_tugas;

public class Ppanjang extends Shape {
    private double lebar, panjang;

    public Ppanjang() {}

    public Ppanjang(double lebar, double panjang) {
        super("Ungu");
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getArea() {
        return panjang * lebar;
    }

    public double getParimeter() {
        return 2 * (panjang + lebar);
    }
}
