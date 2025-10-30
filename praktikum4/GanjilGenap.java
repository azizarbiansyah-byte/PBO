package praktikum4;

import java.util.Scanner;

public class GanjilGenap {
    Scanner s = new Scanner(System.in);
    
    void ganjilGenap(){
        int angka;
        
        System.out.print("Masukan Angka : ");
        angka = s.nextInt();
        
        if(angka %  2 == 0){
            System.out.println( angka + " Adalah Bilangan Genap");
        }else if(angka % 2 !=0){
            System.out.println( angka + " Adalah Bilangan Ganjil");
        }else{
            System.out.println("Angka Yang Kamu Masukan Tidak Valid");
        }
}
            
}
