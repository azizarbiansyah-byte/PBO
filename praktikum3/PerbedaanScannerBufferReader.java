package praktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PerbedaanScannerBufferReader {
    void tampil() throws IOException{
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama1,nama2;
        int umur1, umur2;
        
        System.out.println("===Scanner===");
        System.out.print("Masukan Nama\t: ");
        nama1 = s.nextLine();
        System.out.print("Masukan Umur\t: ");
        umur1 = s.nextInt();
        System.out.println("Nama\t\t: " + nama1);
        System.out.println("Umur\t\t: " + umur1);
        
        System.out.println("===BufferReader===");
        System.out.print("Masukan Nama\t: ");
        nama2 = br.readLine();
        System.out.print("Masukan Umur\t: ");
        umur2 = Integer.parseInt(br.readLine());
        System.out.println("Nama\t\t: " + nama2);
        System.out.println("Umur\t\t: " + umur2);
    }
}
