package praktikum5;

public class HalfTriangle {
    void tampil(){
        for(int i = 1; i <= 5; i++){
            for(int j = 5; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
    
