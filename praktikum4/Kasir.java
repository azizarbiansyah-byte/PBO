package praktikum4;

import java.util.Scanner;

public class Kasir {
    void kasir(){
        Scanner s = new Scanner(System.in);
        double totalBelanja, uangBayar, diskon = 0, totalBayar, kembalian;
        String member;

        System.out.print("Apakah Anda memiliki kartu member? (ya/tidak): ");
        member = s.nextLine().toLowerCase();

        System.out.print("Masukkan total belanja (Rp): ");
        totalBelanja = s.nextDouble();

        if (member.equals("ya")) {
            if (totalBelanja > 500000) {
                diskon = 50000;
                System.out.println("Anda mendapat diskon Rp50.000");
            } else if (totalBelanja > 100000) {
                diskon = 15000;
                System.out.println("Anda mendapat diskon Rp15.000");
            } else {
                System.out.println("Belanja kurang dari Rp100.000, tidak mendapat diskon.");
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
                System.out.println("Anda mendapat diskon Rp10.000 (tanpa member)");
            } else {
                System.out.println("Belanja kurang dari Rp100.000, tidak mendapat diskon.");
            }
        }

        totalBayar = totalBelanja - diskon;

        System.out.print("\nMasukkan jumlah uang yang dibayarkan Rp : ");
        uangBayar = s.nextDouble();

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("\nTotal yang harus dibayar : Rp" + totalBayar);
            System.out.println("Kembalian Anda : Rp" + kembalian);
        } else {
            System.out.println("\nUang Anda kurang Rp" + (totalBayar - uangBayar));
        }

        System.out.println("===== Terima Kasih Telah Berbelanja =====");
    }
}
