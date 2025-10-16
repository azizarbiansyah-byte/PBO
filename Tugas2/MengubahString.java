package praktikum2;

public class MengubahString {
    String a = "Saya Belajar Java", b = "Saya Belajar Java";
    String kecil, besar;
    
    
    void tampil(){
        kecil = a.toLowerCase();
        besar = b.toUpperCase();
        
        System.out.println("-=-=-Mengubah String-=-=-");
        System.out.println("Saya Belajar Java Menjadi Huruf Kecil : " + kecil);
        System.out.println("Saya Belajar Java Menjadi Huruf Besar : " + besar);
    }
    
}
