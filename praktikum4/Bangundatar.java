package praktikum4;

import java.util.Scanner;

public class Bangundatar {
    void bangundatar(){
        Scanner s = new Scanner(System.in);
        int pilih;
        double luas;

        System.out.println("PROGRAM LUAS BANGUN DATAR");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        pilih = s.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = s.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi = " + luas);
                break;

            case 2:
                System.out.print("Masukkan alas: ");
                double alas = s.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = s.nextDouble();
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga = " + luas);
                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = s.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Luas Lingkaran = " + luas);
                break;

            case 4:
                System.out.print("Masukkan sisi atas: ");
                double atas = s.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double bawah = s.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = s.nextDouble();
                luas = 0.5 * (atas + bawah) * t;
                System.out.println("Luas Trapesium = " + luas);
                break;

            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = s.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = s.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }


    }
}
