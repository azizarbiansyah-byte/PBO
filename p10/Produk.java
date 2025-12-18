package p10;


abstract class Produk { // NO 3, 4, 5 class
    private String judul, penulis; // no 3 awalnya public, ganti jadi private (soal no 4 protected)

    Produk(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }


    abstract String getInfoProduk();
    abstract String jenisProduk();
}

class Komik extends Produk {
    private int jumlahHalaman;

    Komik(String judul, String penulis, int jumlahHalaman){
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    String jenisProduk() {
        return "Komik";
    }

    @Override
    String getInfoProduk(){
        return jenisProduk() + " - Judul: " + getJudul() +
               ", Penulis: " + getPenulis() +
               ", Halaman: " + jumlahHalaman;
    }
}

class Games extends Produk {
    private int waktuMain;

    Games(String judul, String penulis, int waktuMain){
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    String jenisProduk() {
        return "Game";
    }

    @Override
    String getInfoProduk(){
        return jenisProduk() + " - Judul: " + getJudul() +
               ", Penulis: " + getPenulis() +
               ", Waktu main: " + waktuMain + " jam";
    }
}

