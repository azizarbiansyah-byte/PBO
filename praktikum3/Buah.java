package praktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buah {
    int mangga, jambu, tetangga, mangga_bsuk, total_jambu, mangga_bersih, total_buah;
        
    void tampil() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukan Jumlah Mangga\t: ");
        mangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan Jumlah Tetangga\t: ");
        tetangga = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan Jumlah Buah Jambu pertetannga\t: ");
        jambu = Integer.parseInt(br.readLine());
        
        System.out.print("Masukan Jumlah Mangga Busuk\t\t: ");
        mangga_bsuk = Integer.parseInt(br.readLine());
        
        total_jambu = tetangga * jambu;
        mangga_bersih = mangga - mangga_bsuk;
        total_buah = mangga_bersih + total_jambu;
        
        System.out.println("Total Jambu Yang dibeli\t: " + total_jambu);
        System.out.println("Total Mangga Bersih \t: " + mangga_bersih);
        System.out.println("Total Buah Yang dibeli\t: " + total_buah);
    }
}
