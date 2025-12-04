package P8;

public class Barisan {

    int[] angka;

    public Barisan(int[] angka) {
        this.angka = angka;
    }

    public void tampilkan() {
        for (int i : angka) {
            System.out.print(i + " ");
        }
    }
}
