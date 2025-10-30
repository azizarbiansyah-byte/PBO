package praktikum4;

import java.util.Scanner;

public class Salesman {
    void tampil() {
        Scanner s = new Scanner(System.in);
        double penjualan, komisi = 0, total, uangJasa = 0;

        System.out.println("===== PROGRAM KOMISI SALESMAN =====");
        System.out.print("Masukkan Total Penjualan Hari Ini (Rp): ");
        penjualan = s.nextDouble();

        System.out.println("-----------------------------------");

        if (penjualan < 2000000) {
            System.out.println("Kategori : Penjualan Minim");
            System.out.println("Uang Jasa : Rp0");
            System.out.println("Komisi Penjualan : Rp0");
            total = penjualan;
        } 
        else if (penjualan >= 2000000 && penjualan <= 3000000) {
            System.out.println("Kategori : Penjualan Dasar");
            uangJasa = 100000;
            komisi = 0.10 * penjualan;
            total = penjualan + uangJasa + komisi;
        } 
        else if (penjualan > 3000000 && penjualan <= 5000000) {
            System.out.println("Kategori : Penjualan Menengah");
            uangJasa = 200000;
            komisi = 0.15 * penjualan;
            total = penjualan + uangJasa + komisi;
        } 
        else {
            System.out.println("Kategori : Penjualan Tinggi");
            uangJasa = 300000;
            komisi = 0.20 * penjualan;
            total = penjualan + uangJasa + komisi;
        }

        if (penjualan >= 2000000) {
            System.out.println("Uang Jasa : Rp" + uangJasa);
            System.out.println("Komisi Penjualan : Rp" + komisi);
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Total Pendapatan : Rp" + total);
    }
}
