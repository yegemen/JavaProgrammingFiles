package hafta_3_uyg_3;

import java.util.Scanner;

public class Hafta_3_uyg_3 {

    public static void buldegistir(String ifade, char ch1, char ch2, int index) {

        //int say = 0;

        //char[] c_dizi = new char[ifade.length()];
        char[] c_ifade = ifade.toCharArray();
        for (int i = index - 1; i < ifade.length(); i++) {
            if (c_ifade[i] == ch1) {
                c_ifade[i] = ch2;
                //say++;
            }
        }
        System.out.println(c_ifade);

    }

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        System.out.println("text girin: ");
        String yazi = klavye.nextLine();

        System.out.println("Girilen textte hangi karakter aransın?");
        char ch1 = klavye.next().charAt(0);

        System.out.println("Hangi karakter ile degistirilsin?");
        char ch2 = klavye.next().charAt(0);

        System.out.println("Kacinci karakterden taranmaya baslasin?");
        int kn = klavye.nextInt();

        buldegistir(yazi, ch1, ch2, kn);
        
        

    }

}
