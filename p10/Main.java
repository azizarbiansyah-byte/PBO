package p10;

public class Main {
    public static void main(String[] args) {
        Bentuk pp = new PersegiPanjang(8, 5);
        Bentuk bs = new BujurSangkar(7);
        Bentuk s = new Segitiga(6, 3);
        Bentuk l = new Lingkaran(5);
        
        System.out.println("Luas Persegi Panjang: " + pp.Luas());
        System.out.println("Luas Bujur Sangkar: " + bs.Luas());
        System.out.println("Luas Segitiga: " + s.Luas());
        System.out.println("Luas Lingkaran: " + l.Luas());
        
        System.out.println("====================================================");
        
        new Universitas().tampilData();
        
        System.out.println("====================================================");
        
        Produk k = new Komik("One Piece", "Oda Sensei", 20000);
        Produk g = new Games("Valorant", "Sunrice", 180);

        System.out.println(k.getInfoProduk());
        System.out.println(g.getInfoProduk());
        
        System.out.println("====================================================");
        
        Kendaraan m = new Mobil("Civic Genio", "Honda Civic Genio", "Sedan");
        Kendaraan p = new Pesawat("A380", "Airbus A380", "Pesawat penumpang sipil");
        Kendaraan kl = new KapalLaut("Wonder of the Seas", "Royal Caribbean Wonder of the Seas", "Kapal pesiar");

        m.informasi();
        p.informasi();
        kl.informasi();
        
    }
    
}

