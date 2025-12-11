package p9;

public class Segitiga {
    protected double alas, tinggi;
    
    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
}

class HitungSegitiga extends Segitiga{
    public HitungSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    public double luas(){
        return 0.5 * alas * tinggi;
    }
}
