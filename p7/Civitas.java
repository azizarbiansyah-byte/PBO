package p7;

public class Civitas {
    protected String nama;
    protected String status;

    public Civitas(String nama, String status){
        this.nama = nama;
        this.status = status;
    }

    public void tampilkanInfo(){
        System.out.println("Nama   : " + nama);
        System.out.println("Status : " + status);
        System.out.println("-------------------------");
    }
}
