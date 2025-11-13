package praktikum5;

import java.util.Scanner;

public class TerbesarTerkcil {
    Scanner s = new Scanner(System.in);
    
    void tampil(){
        int angka, terbesar, terkecil;
        
        System.out.print("Masukan Angka ke-1 : ");
        angka = s.nextInt();
        terbesar = angka;
        terkecil = angka;
        
        for(int i = 2; i <= 10; i++){
            System.out.print("Masukan Angka ke-" + i + " : ");
            angka = s.nextInt();
            
            
            if(terbesar > angka){
                terbesar = angka;
            }else if(terkecil < angka){
                terkecil = angka;
            }
        }
        
        System.out.println("Angka Terbesar : " + terbesar);
        System.out.println("Angka Terkecil : " + terkecil);
                
    }
    
}
