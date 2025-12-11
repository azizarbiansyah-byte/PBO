
package p9;

public class Produk {
    protected String judul, penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void getInfoProduk() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
    }
}

class Komik extends Produk {
    int jumlahHalaman;

    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void getInfoProduk() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Jumlah Halaman: " + this.jumlahHalaman);
    }
}

class Games extends Produk {
    int waktuMain;

    public Games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    public void getInfoProduk() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Waktu Main: " + this.waktuMain + " jam");
    }
}
