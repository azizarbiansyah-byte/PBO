package p7;

public class Mahasiswa3 {
    String nama,npm,kelas;

    void setData(String nama, String npm, String kelas){
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampilkan(){
        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}
