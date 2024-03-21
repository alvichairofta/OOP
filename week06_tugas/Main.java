package week06_tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----------Program Menghitung Bangun Datar-----------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {
                case 1:
                    calculateCircle(scan);
                    break;
                case 2:
                	calculatePersegi(scan);
                    break;
                case 3:
                    calculatePpanjang(scan);
                    break;
                case 4:
                	calculateSegititga(scan);
	                break;
                case 5:
                    System.out.println("Keluar program....");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (choice != 5);
    }

    public static void calculateCircle(Scanner scan) {
        System.out.print("Masukkan jari jari lingkaran : ");
        double radius = scan.nextDouble();
//        System.out.print("Masukkan warna: ");
//        String color = scan.next();

        Circle circle = new Circle(radius);
        System.out.println("------------Lingkaran------------");
        System.out.println("Warna             : " + circle.getColor());
        System.out.println("Jari-jari         : " + circle.getRadius());
        System.out.println("Keliling lingkaran: " + circle.getParimeter());
        System.out.println("Luas lingkaran    : " + circle.getArea());
    }
    
    public static void calculatePersegi(Scanner scan) {
        System.out.print("Masukkan panjang sisi : ");
        double sisi = scan.nextDouble();
//        System.out.print("Masukkan warna: ");
//        String color = scan.next();

        Persegi persegi = new Persegi(sisi);
        System.out.println("------------Persegi------------");
        System.out.println("Warna           : " + persegi.getColor());
        System.out.println("Sisi            : " + persegi.getSisi());
        System.out.println("Keliling persegi: " + persegi.getParimeter());
        System.out.println("Luas persegi    : " + persegi.getArea());
    }
    
    public static void calculatePpanjang(Scanner scan) {
        System.out.print("Masukkan panjang : ");
        double panjang = scan.nextDouble();
        System.out.print("Masukkan lebar : ");
        double lebar = scan.nextDouble();
//        System.out.print("Masukkan warna: ");
//        String color = scan.next();

        Ppanjang persegipanjang = new Ppanjang (panjang,lebar);
        System.out.println("------------Persegi Panjang------------");
        System.out.println("Warna                   : " + persegipanjang.getColor());
        System.out.println("Panjang & Lebar         : " + persegipanjang.getPanjang() + " & " + persegipanjang.getLebar());
        System.out.println("Keliling persegi panjang: " + persegipanjang.getParimeter());
        System.out.println("Luas persegi            : " + persegipanjang.getArea());
    }
    
    public static void calculateSegititga(Scanner scan) {
        System.out.print("Masukkan alas   : ");
        double alas = scan.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = scan.nextDouble();
        System.out.print("Masukkan miring : ");
        double miring = scan.nextDouble();
//        System.out.print("Masukkan warna: ");
//        String color = scan.next();

        Segitiga segitiga = new Segitiga (alas,tinggi,miring);
        System.out.println("------------Segitiga Siku Siku------------");
        System.out.println("Warna                   : " + segitiga.getColor());
        System.out.println("Alas & Tinggi           : " + segitiga.getAlas() + " & " + segitiga.getTinggi());
        System.out.println("Keliling Segitiga       : " + segitiga.getParimeter());
        System.out.println("Luas Segitiga           : " + segitiga.getArea());
    }
}
