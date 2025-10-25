package praktikum3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SelisihWaktu {
    void tampil() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int j1, m1, d1, j2, m2, d2;
        int total1, total2, selisih, jam, menit, detik, sisa;

        System.out.print("Masukkan jam pertama   : ");
        j1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan menit pertama : ");
        m1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan detik pertama : ");
        d1 = Integer.parseInt(br.readLine());

        System.out.println();

        System.out.print("Masukkan jam kedua     : ");
        j2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan menit kedua   : ");
        m2 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan detik kedua   : ");
        d2 = Integer.parseInt(br.readLine());

        total1 = (j1 * 3600) + (m1 * 60) + d1;
        total2 = (j2 * 3600) + (m2 * 60) + d2;

        selisih = total2 - total1;

        if (selisih < 0) {
            selisih += 24 * 3600;
        }

        jam = selisih / 3600;
        sisa = selisih % 3600;
        menit = sisa / 60;
        detik = sisa % 60;

        System.out.println("Selisih waktu adalah: " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}
