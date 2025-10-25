package praktikum3;

import java.util.Scanner;

public class GajiBersih {
    Scanner input = new Scanner(System.in);
    int gjPokok, tJabatan, tIstri, tAnak,tGaji;
    long nik;
    String nama, alamat,jabatan;
    
    
    void tampil(){
        System.out.print("Nomor Induk Karyawan\t: ");
        nik = input.nextLong();
        input.nextLine();
        System.out.print("Nama Karyawan\t\t: ");
        nama = input.nextLine();
        System.out.print("Alamat\t\t\t: ");
        alamat = input.nextLine();
        System.out.print("Jabatan\t\t\t: ");
        jabatan = input.nextLine();
        System.out.print("Gaji Pokok\t\t: ");
        gjPokok = input.nextInt();
        System.out.print("Tunjangan Jabatan\t: ");
        tJabatan = input.nextInt();
        System.out.print("Tunjangan Istri\t\t: ");
        tIstri = input.nextInt();
        System.out.print("Tunjangan Anak\t\t: ");
        tAnak = input.nextInt();
        
        tGaji = gjPokok + tJabatan + tIstri + tAnak;
        System.out.println("Total Gaji : " + tGaji);
        
        double pPenghasilan = (double)0.1 * (gjPokok + tJabatan + tAnak);
        System.out.println("Pajak Penghasilan : " + pPenghasilan);
        
        double gjBersih = (double )tGaji - pPenghasilan;
        System.out.println("Gaji Bersih : " + gjBersih);
        
    }
}
