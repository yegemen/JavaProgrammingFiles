package hafta_3_uyg_2;

import java.util.Scanner;

public class Hafta_3_uyg_2 {

    public static double fact(double a) {

        double sonuc = 1;
        for (; a >= 1; a--) {
            sonuc = sonuc * a;
        }
        return sonuc;
    }

    public static double hesapla(double x, double b) {

        double i, sonuc = 0;
        if (b == 0) {
            return 0;
        } 
        if (b == 1) {
            return 1;
        } 
        else {
            for (i = 1; i <= b-1; i++) {
                sonuc += Math.pow(x, i) / fact(i);
            }
            return sonuc + 1;
        }

    }

    public static void main(String[] args) {

        double a, b;
        Scanner giris = new Scanner(System.in);

        System.out.println("X degeri girin: ");
        a = giris.nextDouble();

        System.out.println("Seri girin: ");
        b = giris.nextDouble();

        System.out.println("Sonuc= " + hesapla(a, b));

    }

}
