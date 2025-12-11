package p9;

public class KategoriHewan {
    protected String kategori;

    public void tampil() {
        System.out.println(kategori);
    }
}

class HewanBerkakiDua extends KategoriHewan {
    public HewanBerkakiDua() {
        kategori = "hewan berkaki dua: kangguru, ayam, bebek, dll";
    }
}

class HewanBerkakiEmpat extends KategoriHewan {
    public HewanBerkakiEmpat() {
        kategori = "hewan berkaki empat: kucing, anjing, kuda, dll";
    }
}

class HewanBerkakiEnam extends KategoriHewan {
    public HewanBerkakiEnam() {
        kategori = "hewan berkaki enam: capung, nyamuk, kupu-kupu, dll";
    }
}

class HewanBerkakiDelapan extends KategoriHewan {
    public HewanBerkakiDelapan() {
        kategori = "hewan berkaki delapan: kepiting, belalang, laba-laba, dll";
    }
}