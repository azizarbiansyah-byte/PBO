package p10;

public class Kendaraan {
    public String model;

    Kendaraan(String model){
        this.model = model;
    }

    void informasi(){
        System.out.println("Model: " + model);
    }
}

class Mobil extends Kendaraan {
    public String nama, jenis;

    Mobil(String model, String nama, String jenis){
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi(){
        System.out.println("Mobil");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

class Pesawat extends Kendaraan {
    public String nama, jenis;

    Pesawat(String model, String nama, String jenis){
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi(){
        System.out.println("Pesawat");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

class KapalLaut extends Kendaraan {
    public String nama, jenis;

    KapalLaut(String model, String nama, String jenis){
        super(model);
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    void informasi(){
        System.out.println("Kapal Laut");
        System.out.println("Model : " + model);
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }
}

