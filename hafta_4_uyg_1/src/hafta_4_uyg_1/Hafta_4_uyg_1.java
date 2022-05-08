package hafta_4_uyg_1;

import java.util.Scanner;

public class Hafta_4_uyg_1 {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        int secim;
        dikdortgen d1 = new dikdortgen();
        cember c1 = new cember();

        //d1.kisa_kenar=5;
        //c1.y_cap=2;
        System.out.println("Dikdörtgen icin 1, cember icin 2 ye basınız: ");
        secim = giris.nextInt();

        if (secim == 1) {

            System.out.println("Dikdörgenin kisa kenarini girin:");
            d1.kisa_kenar = giris.nextInt();

            System.out.println("Dikdörtgenin uzun kenarini girin:");
            d1.uzun_kenar = giris.nextInt();

            System.out.println("alan mi cevre mi hesaplayacaksiniz? 1-Alan, 2-Cevre");
            secim = giris.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Dikdörtgenin Alani= " + d1.alan(d1.kisa_kenar, d1.uzun_kenar));
                    break;

                case 2:
                    System.out.println("Dikdörtgenin Cevresi= " + d1.cevre(d1.kisa_kenar, d1.uzun_kenar));
                    break;

                default:
                    System.out.println("gecerli secim yapin.");
                    break;
            }

        }
        if (secim == 2) {

            System.out.println("cemberin yaricapini girin:");
            c1.y_cap = giris.nextDouble();
            
            System.out.println("alan mi cevre mi hesaplayacaksiniz? 1-Alan, 2-Cevre");
            secim = giris.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Cemberin Alani= "+c1.alan(c1.y_cap));
                    break;

                case 2:
                    System.out.println("Cemberin Cevresi= "+c1.cevre(c1.y_cap));
                    break;

                default:
                    System.out.println("gecerli secim yapin.");
                    break;
            }
        }
        
        

    }

}
