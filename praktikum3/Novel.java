package praktikum3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Novel {
    int jumlah_novel, lembar_novel, total_lembar, total_detik, hari, jam, menit, detik, sisa_detik;
    void tampil() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah novel yang akan dicetak : ");
        jumlah_novel = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah lembar per novel : ");
        lembar_novel = Integer.parseInt(br.readLine());

        total_lembar = jumlah_novel * lembar_novel;

        total_detik = total_lembar;

        hari = total_detik / 86400;
        sisa_detik = total_detik % 86400;

        jam = sisa_detik / 3600;
        sisa_detik %= 3600;

        menit = sisa_detik / 60;
        detik = sisa_detik % 60;

        System.out.println("Total Lembar Dicetak : " + total_lembar + " lembar");
        System.out.println("Total Waktu : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
