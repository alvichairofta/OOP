package week6_tugas;

public class Handphone extends Barang {
	private String warna;
	public static int total=0;
	
	public Handphone(int id, String nama, double harga, int stock, String warna) {
		this.id=id;
		this.nama=nama;
		this.harga=harga;
		this.stock=stock;
		this.warna=warna;
		total ++;
	}
	
	public String getWarna() {
		return warna;
	}
}
