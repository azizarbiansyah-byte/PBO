package P8;

public class Kotak {
    
    public class PersegiPanjang {
        int lebar;
        int tinggi;

        public PersegiPanjang(int lebar, int tinggi) {
            this.lebar = lebar;
            this.tinggi = tinggi;
        }
    }

    int hitungLuasHitam(PersegiPanjang luar, PersegiPanjang dalam) {
        
        int lebarKanan = luar.lebar - dalam.lebar; 
        int tinggiKanan = luar.tinggi;
        int luasKanan = lebarKanan * tinggiKanan;

        int tinggiBawah = luar.tinggi - dalam.tinggi;
        int lebarBawah = dalam.lebar;
        int luasBawah = lebarBawah * tinggiBawah;

        return luasKanan + luasBawah;
    }
}
