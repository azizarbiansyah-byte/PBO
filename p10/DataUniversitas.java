package p10;

public interface DataUniversitas {
    void tampilData();
}

class Universitas implements DataUniversitas{

    @Override
    public void tampilData(){
        System.out.println("Data Universitas Cianjur");
        System.out.println("Nama Universitas : Universitas Suryakancana");
        System.out.println("Alamat           : Pasir Gede");
        System.out.println("Telepon          : 08123-3210-3123");
        System.out.println("Provinsi         : Jawa Barat");
        System.out.println("Negara           : Indonesia");
    }
}