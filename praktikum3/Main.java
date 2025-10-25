package praktikum3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        GajiBersih gajibersih = new GajiBersih();
        gajibersih.tampil();
        
        DataIOStream d = new DataIOStream();
        d.tampil();
        
        PerbedaanScannerBufferReader psbr = new PerbedaanScannerBufferReader();
        psbr.tampil();

        Sentripetal s = new Sentripetal();
        s.tampil();
        
        Buah b = new Buah();
        b.tampil();

        SelisihWaktu sw = new SelisihWaktu();
        sw.tampil();
        
        Novel n = new Novel();
        n.tampil();
        
    }
            
}
