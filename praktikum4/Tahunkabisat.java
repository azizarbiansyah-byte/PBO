package praktikum4;

import java.util.Scanner;

public class Tahunkabisat {
    void tampil(){
        Scanner s = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = s.nextInt();

        if ((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)) {
            System.out.println(tahun + " adalah Tahun Kabisat ");
        } else {
            System.out.println(tahun + " bukan Tahun Kabisat ");
        }

    }
}
