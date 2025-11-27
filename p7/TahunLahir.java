package p7;

public class TahunLahir {
    String bulan;
    int bulanAngka, hasil=0, tanggal=0;
    
    void convertbulan(){
        bulan = bulan.toLowerCase();
                
            switch(bulan){
                case "january": bulanAngka = 1; break;
                case "february": bulanAngka = 2; break;
                case "march": bulanAngka = 3; break;
                case "april": bulanAngka = 4; break;
                case "may": bulanAngka = 5; break;
                case "june": bulanAngka = 6; break;
                case "july": bulanAngka = 7; break;
                case "august": bulanAngka = 8; break;
                case "september": bulanAngka = 9; break;
                case "october": bulanAngka = 10; break;
                case "november": bulanAngka = 11; break;
                case "december": bulanAngka = 12; break;
                default:
                    bulanAngka = 0;
                break;
            }
    }
    void hitungkode(){
        hasil = (bulanAngka * 100) + tanggal;
        System.out.println(hasil);
    }
}
