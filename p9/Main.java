package p9;

public class Main {
    public static void main(String[] args) {
        new HewanBerkakiDua().tampil();
        new HewanBerkakiEnam().tampil();
        new HewanBerkakiEmpat().tampil();
        new HewanBerkakiDelapan().tampil();
        
        System.out.println();
        
        HitungSegitiga s = new HitungSegitiga(4, 5);
        System.out.println("Luas: " + s.luas());
        
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        System.out.println("\nLuas Kubus: " + kubus.getLuas());
        
        System.out.println();
        
        Kucing h = new Kucing();
        h.nama = "Kucing";
        h.makan(h.tampil());
        
        System.out.println();
        
        Produk k = new Komik("One Piece", "Oda Sensei", 20000);
        Produk g = new Games("Valorant", "Sunrice", 180);

        k.getInfoProduk();
        g.getInfoProduk();
    }
}