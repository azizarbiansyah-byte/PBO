package P8;

import java.util.Scanner;

class NilaiBerpangkat {
    Scanner s = new Scanner(System.in);
    int angka, pangkat, hasil;
    
    public NilaiBerpangkat(){
        System.out.println("Angka " + angka);
        System.out.println("Pangkat " + pangkat);
        System.out.println("Nilai " + angka + " Pangkat " + pangkat + " Adalah : Tidak Valid");
        System.out.println("==================================================================");
    }
    
    public NilaiBerpangkat(int angka){
        System.out.println("Angka " + angka);
        System.out.println("Pangkat " + pangkat);
        System.out.println("Nilai " + angka + " Pangkat " + pangkat + " Adalah : 1" );
        System.out.println("==================================================================");
    }
    
    public NilaiBerpangkat(int angka, int pangkat, int hasil){
        System.out.println("Angka " + angka);
        System.out.println("Pangkat " + pangkat);
        
        for(int i = 1; i <= pangkat; i++){
            hasil *= angka;
        }
        
        System.out.println("Nilai " + angka + " Pangkat " + pangkat + " Adalah : " + hasil);
        System.out.println("==================================================================");
    }
}
