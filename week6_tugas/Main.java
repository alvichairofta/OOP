package week6_tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Handphone> handphone = new ArrayList<>();
    static ArrayList<Voucher> voucher = new ArrayList<>();
    static ArrayList<Order> order = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static boolean cekBarang(String kode, int pesan) {
        if (kode.equalsIgnoreCase("hp")) {
            for (Handphone hp : handphone) {
                if (hp.getId() == pesan) {
                    return true;
                }
            }
        } else if (kode.equalsIgnoreCase("vc")) {
            for (Voucher vc : voucher) {
                if (vc.getId() == pesan) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------Menu Toko Voucher & HP----------");
            System.out.println("1. Pesan Barang \n2. Lihat Pesanan \n3. Barang Baru \n0. Keluar");
            System.out.print("Pilihan : ");
            int pilih = scan.nextInt();

            switch (pilih) {
                case 1:
                    pesanBarang();
                    break;
                case 2:
                    lihatPesanan();
                    break;
                case 3:
                    tambahkanBarang();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Angka tidak valid");
            }
        }
    }

    public static void pesanBarang() {
        System.out.println("Daftar Barang Toko Voucher & HP");
        System.out.println("1. Handphone \n2. Voucher");
        System.out.print("Pilihan : ");
        int pilih = scan.nextInt();

        if (pilih == 1) {
            for (Handphone hp : handphone) {
                System.out.println("ID\t: " + hp.getId());
                System.out.println("Nama\t: " + hp.getNama() + " " + hp.getWarna());
                System.out.println("Stock\t: " + hp.getStock());
                System.out.println("Harga\t: " + (int) hp.getHarga());
                System.out.println("-------------------------------");
            }

            System.out.println("Ketik 0 untuk batal");
            System.out.print("Pesan Barang (ID) : ");
            int pesan = scan.nextInt();
            if (pesan != 0) {
                if (cekBarang("hp", pesan)) {
                    System.out.print("Masukkan jumlah : ");
                    int jumlah = scan.nextInt();

                    Handphone hp = handphone.get(pesan - 1);

                    if (jumlah <= hp.getStock()) {
                        System.out.println(jumlah + " @ " + hp.getNama() + " dengan total harga " + (int) (hp.getHarga() * jumlah));
                        System.out.print("Masukkan jumlah uang : ");
                        int uang = scan.nextInt();

                        if (uang < (int) hp.getHarga() * jumlah) {
                            System.out.println("Uang tidak mencukupi");
                        } else {
                            System.out.println("Berhasil dipesan");

                            Order baru = new Order("OH" + Order.total, hp, jumlah);
                            order.add(baru);
                            hp.minusStock(jumlah);
                        }

                    } else {
                        System.out.println("Stok tidak mencukupi");
                    }
                } else {
                    System.out.println("ID tidak valid");
                }
            }
        } else if (pilih == 2) {
            for (Voucher vc : voucher) {
                System.out.println("ID\t: " + vc.getId());
                System.out.println("Nama\t: " + vc.getNama());
                System.out.println("Stock\t: " + vc.getStock());
                System.out.println("Harga\t: " + (int) (vc.getHarga() + (vc.getHarga() * vc.getPajak())));
                System.out.println("-------------------------------");
            }

            System.out.println("Ketik 0 untuk batal");
            System.out.print("Pesan Barang (ID) : ");
            int pesan = scan.nextInt();
            if (pesan != 0) {
                if (cekBarang("vc", pesan)) {
                    System.out.print("Masukkan jumlah : ");
                    int jumlah = scan.nextInt();

                    Voucher vc = voucher.get(pesan - 1);
                    double harga = vc.getHarga() + (vc.getHarga() * vc.getPajak());

                    if (jumlah <= vc.getStock()) {

                        System.out.println(jumlah + " @ " + vc.getNama() + " dengan total harga " + (int) harga * jumlah);
                        System.out.print("Masukkan jumlah uang : ");
                        int uang = scan.nextInt();

                        if (uang < (int) harga * jumlah) {
                            System.out.println("Uang tidak mencukupi");
                        } else {
                            System.out.println("Berhasil dipesan");
                            Order baru = new Order("OV" + Order.total, vc, jumlah);
                            order.add(baru);
                            vc.minusStock(jumlah);
                        }

                    } else {
                        System.out.println("Stok tidak mencukupi");
                    }
                } else {
                    System.out.println("ID tidak valid");
                }
            }
        } else {
            System.out.println("Angka tidak valid");
        }
    }

    public static void lihatPesanan() {
        System.out.println("Daftar Pesanan Toko Multiguna");
        for (Order ord : order) {
            System.out.println("ID\t: " + ord.getId());
            if (ord.getId().contains("OH")) {
                System.out.println("Nama\t: " + ord.getHandphone().getNama());
                System.out.println("Jumlah\t: " + ord.getJumlah());
                System.out.println("Total\t: " + (int) ord.getHandphone().getHarga() * ord.getJumlah());
            } else {
                double harga = ord.getVoucher().getHarga() + (ord.getVoucher().getHarga() * ord.getVoucher().getPajak());
                System.out.println("Nama\t: " + ord.getVoucher().getNama());
                System.out.println("Jumlah\t: " + ord.getJumlah());
                System.out.println("total\t: " + (int) harga * ord.getJumlah());
            }
            System.out.println("------------------------------------");
        }
    }

    public static void tambahkanBarang() {
        System.out.print("Voucher / Handphone (V/H): ");
        String pilih2 = scan.next();

        if (pilih2.equalsIgnoreCase("V")) {

            System.out.print("Nama : ");
            scan.nextLine();
            String nama = scan.nextLine();
            System.out.print("Harga : ");
            int harga = scan.nextInt();
            System.out.print("Stok : ");
            int stok = scan.nextInt();
            System.out.print("PPN : ");
            double pajak = scan.nextDouble();

            Voucher baru = new Voucher(Voucher.total + 1, nama, (double) harga, stok, pajak);
            voucher.add(baru);

            System.out.println("Voucher telah berhasil diinput");

        } else if (pilih2.equalsIgnoreCase("H")) {
            scan.nextLine();
            System.out.print("Nama : ");
            String nama = scan.nextLine();
            System.out.print("Harga : ");
            int harga = scan.nextInt();
            System.out.print("Stok : ");
            int stok = scan.nextInt();
            scan.nextLine();
            System.out.print("Warna : ");
            String warna = scan.nextLine();

            Handphone baru = new Handphone(Handphone.total + 1, nama, (double) harga, stok, warna);
            handphone.add(baru);
        } else {
            System.out.println("Input tidak valid");
        }
    }
}