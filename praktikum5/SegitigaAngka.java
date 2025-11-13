package praktikum5;

import java.util.Scanner;

public class SegitigaAngka {
    Scanner s = new Scanner(System.in);
    void tampil(){
        int angka,k=1;
        
        System.out.print("Masukan Jumlah Baris : ");
        angka = s.nextInt();
        
        for(int i = 1; i <= angka; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        
    }
}
