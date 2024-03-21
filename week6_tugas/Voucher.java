package week6_tugas;

public class Voucher extends Barang {
	private double pajak;
	public static int total =0;
	
	public Voucher(int id, String nama, double harga, int stock, double pajak) {
		this.id=id;
		this.nama=nama;
		this.harga=harga;
		this.stock=stock;
		total ++;	
	}
	
	public double getPajak() {
		return pajak;
	}
	
	public double getHargaJual() {
		return harga;
	}
}
