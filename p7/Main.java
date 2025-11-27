package p7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
//        ========Keliling Persegi Panjang=========
//        PersegiPanjang kpp = new PersegiPanjang();
//        
//        System.out.print("Masukan Panjang : ");
//        kpp.panjang = s.nextInt();
//        System.out.print("Masukan Lebar : ");
//        kpp.lebar = s.nextInt();
//        
//        kpp.hitung();

//        ========Tahun Lahir=========
//        TahunLahir t = new TahunLahir();
//        
//        System.out.print("Masukan nama bulan : ");
//        t.bulan= s.next();
//        
//        System.out.print("Masukan tanggal lahir: ");
//        t.tanggal = s.nextInt();
//        
//        t.convertbulan();
//        t.hitungkode();


//        ========Sumpah Pemuda=========
//        SumpahPemuda sp = new SumpahPemuda();
//        sp.tampilkan();


//        ========Rekursif=========
//        Rekursif r = new Rekursif();
//        
//        System.out.print("Masukkan angka awal: ");
//        int angka = s.nextInt();
//        
//        r.hitungMundur(angka);


//        ========Civitas=========
//        Dosen d = new Dosen("Pak Budi");
//        Mahasiswa1 m = new Mahasiswa1("Aziz");
//        Staff st = new Staff("Bu Wati");
//
//        d.tampilkanInfo();
//        m.tampilkanInfo();
//        st.tampilkanInfo();


        Mahasiswa3 mhs = new Mahasiswa3();

        System.out.print("Masukkan Nama : ");
        String nama = s.nextLine();

        System.out.print("Masukkan NPM  : ");
        String npm = s.nextLine();

        System.out.print("Masukkan Kelas: ");
        String kelas = s.nextLine();

        mhs.setData(nama, npm, kelas);

        mhs.tampilkan();
    }


}
