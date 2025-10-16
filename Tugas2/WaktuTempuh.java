package praktikum2;

public class WaktuTempuh {
    double jarakBln = 384400,
           jarakMthari = 152100000,
           Kec = 300000,
           waktubln, waktumthari;
    
    double hitungjrkbln(){
        return jarakBln / Kec;
    }
    double hitungjrkmthari(){
        return jarakMthari / Kec;
    }
    
    void tampil(){
        System.out.println("-=-=-Waktu Tempuh-=-=-");
        System.out.println("Waktu yang dibutuhkan Dari Bumi ke Bulan Adalah : " + hitungjrkbln() + " Detik");
        
        System.out.println("Waktu yang dibutuhkan Dari Bumi ke Matahari Adalah : " + hitungjrkmthari() + " Detik");
    }
}