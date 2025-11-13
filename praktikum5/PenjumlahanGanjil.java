package praktikum5;

import java.util.Scanner;

public class PenjumlahanGanjil {
    Scanner s = new Scanner(System.in);
    
    void tampil() {
        int jmlhAngka, hasil = 0, angka = 1, hitung = 0;

        System.out.print("Masukan Jumlah Angka : ");
        jmlhAngka = s.nextInt();

        while (hitung < jmlhAngka) {
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
                hasil += angka;
                hitung++;
            }
            angka++;
        }

        System.out.println("\nHasil Penjumlahan : " + hasil);
    }
}
