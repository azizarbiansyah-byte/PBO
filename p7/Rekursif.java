package p7;

public class Rekursif {
    void hitungMundur(int n){
        if(n == 0){
            System.out.println("Selesai!");
            return;
        }

        System.out.println(n);
        hitungMundur(n - 1);
    }
}
