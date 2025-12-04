package P8;

public class RataRata {
    int[] data;

    public RataRata(int[] data) {
        this.data = data;
    }

    public class Hasil {
        public double rata;
        public Hasil(double r) {
            this.rata = r;
        }
    }

    public Hasil proses() {
        double total = 0;
        for (int i : data) {
            total += i;
        }
        return new Hasil(total / data.length);
    }
}
