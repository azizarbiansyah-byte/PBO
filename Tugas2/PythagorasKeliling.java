package praktikum2;

public class PythagorasKeliling {
    int a = 6, b = 8;
    
    double hitungSisiMiring(){
        return Math.sqrt((a*a) + (b*b));
    }
    double hitungKeliling(){
        return a + b + hitungSisiMiring();
    }
    
    void tampil(){
        System.out.println("-=-=-Pythagoras-=-=-");
        System.out.println("Alas Segitiga : " + a);
        System.out.println("Tinggi Segitiga : " + b);
        System.out.println("Sisi Miring Segitiga : " + hitungSisiMiring());
        System.out.println("Keliling Segitia : " + hitungKeliling());
    }
    
}