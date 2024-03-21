package week6_tugas;

public class Barang {
	protected int id, stock;
	protected double harga;
	protected String nama;
	
	public Barang() {};
	
	public Barang(int id, String nama,  double harga) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
	}
	
    public int getId() {
        return id;
    }

    public int getStock() {
        return stock;
    }

    public double getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public void minusStock(int qty) {
        stock -= qty;
    }
}
