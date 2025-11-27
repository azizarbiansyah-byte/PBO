package p7;

public class Mahasiswa { // Membuat class
    String nama; //Membuat Atribut
    long npm;
    
    void tampil(){ // Membuat Method
        System.out.println("Nama Mahasiwa : " + nama);
        System.out.println("NPM : " + npm);
    }
}

class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa(); // Dengan Keyword "new" Java Membuat Ruang dan Constructor dipanggil
        
        m.nama = "Aziz Arbiansyah"; // Objek Siap digunakan
        m.npm = 5520124004L;
        
        m.tampil(); // Memanggil Method Dari Class Mahasiswa
    }
}


