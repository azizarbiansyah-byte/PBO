package praktikum3;

import java.util.Scanner;

public class Sentripetal {
    Scanner s = new Scanner(System.in);
    double fc, m, v, r;
    
    void tampil(){
        System.out.print("Masukan Massa(m)\t: ");
        m = s.nextDouble();
        System.out.print("Masukan Kecepatan(v)\t: ");
        v = s.nextDouble();
        System.out.print("Masukan Jari-jari(r)\t: ");
        r = s.nextDouble();
        
        fc = (m * v * v) / r;
        
        System.out.println("Massa\t\t\t: " + m + " kg");
        System.out.println("Kecepatan\t\t: " + v + " m/s");
        System.out.println("Jari-jari\t\t: " + r + " m");
        System.out.println("Gaya Sentripetal\t: " + fc + " Newton");
    }
}
