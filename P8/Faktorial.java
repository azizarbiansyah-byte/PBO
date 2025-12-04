package P8;

public class Faktorial {
    void fac(int angka, int hasil){
        
        for(int i=1; i<=angka; i++){
            hasil *= i;
        }
        
        System.out.println("Faktorial dari " + angka + " Adalah : " + hasil);
    }
}
