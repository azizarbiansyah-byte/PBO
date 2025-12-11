package p9;

public class Hewan {
    String nama;
    
    void makan(String nama){
        System.out.println(nama + " sedang makan");
    }
}

class Kucing extends Hewan{
    public String tampil(){
        return this.nama;
    }
}