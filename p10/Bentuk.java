package p10;

public class Bentuk {
    float Luas(){
        return 0;
    }
}

class PersegiPanjang extends Bentuk{
    float panjang, lebar;
    
    PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    float Luas(){
        return panjang*lebar;
    }
    
}

class BujurSangkar extends Bentuk{
    float sisi;
    
    BujurSangkar(float sisi){
        this.sisi = sisi;
    }
    
    @Override
    float Luas(){
        return sisi*sisi;
    }
    
}

class Segitiga extends Bentuk{
    float alas, tinggi;
    
    Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    float Luas(){
        return alas*tinggi/2;
    }
    
}

class Lingkaran extends Bentuk{
    float phi, r;
    
    Lingkaran(float r){
        this.phi = 3.14f;
        this.r = r;
    }
    
    @Override
    float Luas(){
        return phi * r * r;
    }
    
}