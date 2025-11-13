package praktikum5;

import java.util.Scanner;

public class Penjumlahan {
    Scanner s = new Scanner(System.in);
    
    void tampil(){
        int angka, total = 0, jmlhHitung;
        double rata;
        
        System.out.print("Masukan Jumlah Angka Yang Akan Dihitung : ");
        jmlhHitung = s.nextInt();
        
        for(int i = 1; i <= jmlhHitung; i++){
            System.out.print("Masukan Angka : ");
            angka = s.nextInt();

            total += angka;

        }
        rata = (double)total / jmlhHitung;
        System.out.println("===Hasil Penjumlahan===");
        System.out.println("Total Semua Penjumlahan : " + total);
        System.out.println("Rata-Rata Angka Yang Dijumlahkah : " + rata);
    }
}
