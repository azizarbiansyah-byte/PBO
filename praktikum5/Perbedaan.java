package praktikum5;

import java.util.Scanner;

public class Perbedaan {
    Scanner s = new Scanner(System.in);
    void tampil(){
        int a,b;
        
        System.out.print("Masukan Angka a : ");
        a = s.nextInt();
        System.out.print("Masukan Angka b : ");
        b = s.nextInt();
        
        System.out.println("==Jika (a++)===");
        int hasil1 = a++;
        System.out.println("Nilai hasil1 = " + hasil1);
        System.out.println("Nilai a setelah (a++) = " + a);
        
        System.out.println("\n==Jika (++b)===");
        int hasil2 = ++b;
        System.out.println("Nilai hasil2 = " + hasil2);
        System.out.println("Nilai b setelah (++b) = " + b);
    }
}
