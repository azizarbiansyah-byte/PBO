package P8;

class Kasir {

    public Kasir(double harga){
        double total = harga;
        System.out.println("Harga Barang : " + harga);
        System.out.println("Jumlah Barang : 1");
        System.out.println("Diskon : 0%");
        System.out.println("Total Bayar : " + total);
        System.out.println("==================================================================");
    }


    public Kasir(double harga, int jumlah){
        double total = harga * jumlah;
        System.out.println("Harga Barang : " + harga);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Diskon : 0%");
        System.out.println("Total Bayar : " + total);
        System.out.println("==================================================================");
    }


    public Kasir(double harga, int jumlah, int diskon){
        double totalSebelumDiskon = harga * jumlah;
        double potongan = totalSebelumDiskon * diskon / 100;
        double totalAkhir = totalSebelumDiskon - potongan;

        System.out.println("Harga Barang : " + harga);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Diskon : " + diskon + "%");
        System.out.println("Total Bayar : " + totalAkhir);
        System.out.println("==================================================================");
    }
}

