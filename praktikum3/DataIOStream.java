package praktikum3;

import java.io.DataInputStream;
import java.io.IOException;

public class DataIOStream {
    DataInputStream  input = new DataInputStream(System.in);
    String nama;
    double total_blnja, diskon, total, bayar, kembalian, diskon1;
    
    void tampil() throws IOException{
        System.out.print("Nama\t\t: ");
        nama = input.readLine();
        
        System.out.print("Total Belanja\t: ");
        total_blnja = Double.parseDouble(input.readLine());
        
        System.out.print("Diskon (%)\t: ");
        diskon = Double.parseDouble(input.readLine());
        diskon = diskon / 100;
        
        diskon1 = total_blnja * diskon;
        total = total_blnja - diskon1;
        System.out.println("Total\t\t: " + total);
        
        System.out.print("Bayar\t\t: ");
        bayar = Double.parseDouble(input.readLine());
        if(bayar < total){
            System.out.println("Mohon Maaf Uangmu Tidak Cukup");
        }else{
            kembalian = bayar - total;
            System.out.println("Kembalian\t\t: " + kembalian);
        }
        
    }
}
