package praktikum2;

public class Segitiga {
        int a = 6, b = 8;
    
        double hitungLuas(){
            return 0.5 * a * b;
        }
        
        void tampil(){
            System.out.println("-=-=-Luas Segitiga-=-=-");
            System.out.println("Luas Segitiga Adalah : " + hitungLuas());
        }
        
}