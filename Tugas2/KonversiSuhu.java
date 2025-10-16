package praktikum2;

public class KonversiSuhu {
    double c = 10, f = 15, r = 5;

    double celciusKeFahrenheit() {
        return (c * 9 / 5) + 32;
    }
    double fahrenheitKeCelcius() {
        return (f - 32) * 5 / 9;
    }

    double celciusKeReamur() {
        return c * 4 / 5;
    }
    double reamurKeCelcius() {
        return r * 5 / 4;
    }

    double fahrenheitKeReamur() {
        return (f - 32) * 4 / 9;
    }
    double reamurKeFahrenheit() {
        return (r * 9 / 4) + 32;
    }

    void tampil() {
        System.out.println("-=-=-KONVERSI SUHU-=-=-");
        System.out.println("Celcius ke Fahrenheit : " + celciusKeFahrenheit());
        System.out.println("Fahrenheit ke Celcius : " + fahrenheitKeCelcius());
        System.out.println("Celcius ke Reamur     : " + celciusKeReamur());
        System.out.println("Reamur ke Celcius     : " + reamurKeCelcius());
        System.out.println("Fahrenheit ke Reamur  : " + fahrenheitKeReamur());
        System.out.println("Reamur ke Fahrenheit  : " + reamurKeFahrenheit());
    }
}

