package praktikum4;

import java.util.Scanner;

public class Gaji{
    Scanner s = new Scanner(System.in);
    int kode, jmlhAnak;
    long nik;
    String nama, status;
    double gajiPokok, tPasangan=0, tAnak=0, gajiBersih;
    
    void input(){
        System.out.print("Nomor Induk Karyawan\t: ");
        nik = s.nextLong();
        s.nextLine();
        System.out.print("Nama Karyawan\t\t: ");
        nama = s.nextLine();
        System.out.print("Masukan Kode Golongan (1,2,3,4) : ");
        kode = s.nextInt();
        s.nextLine();
        System.out.print("Masukan Status Anda\t: ");
        status = s.next();
        System.out.print("Masukan Jumlah Anak\t: ");
        jmlhAnak = s.nextInt();
    }
    
    void gajibersih(){
            
        switch(kode){
            case 1:
                gajiPokok = 1200000;
            break;
            case 2:
                gajiPokok = 1500000;
            break;
            case 3:
                gajiPokok = 1750000;
            break;
            case 4:
                gajiPokok = 2000000;
            break;
            default:
                System.out.println("Kode Golongan Tidak Valid!");
        }
        
        if (status.equalsIgnoreCase("Menikah") || status.equalsIgnoreCase("Menikah dan punya anak")) {
            tPasangan = 0.1 * gajiPokok;
            tAnak = 0.05 * gajiPokok * jmlhAnak;
        }else{
            tPasangan = 0;
             tAnak = 0;
}
        
        gajiBersih = gajiPokok + tPasangan + tAnak;
    }
    
    void tampil(){
        System.out.println("-=-=Gaji Karyawan=-=-");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Kode Golongan : " + kode);
        System.out.println("Status Pernikahan : " + status);
        System.out.println("Jumlah Anak : " + jmlhAnak);
        System.out.println("Gaji Bersih : " + gajiBersih);
    }
    
}