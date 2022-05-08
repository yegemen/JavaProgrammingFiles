package hafta_7_uyg_1;

import java.util.Scanner;

public class Hafta_7_uyg_1 {

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        ogrenci[] o1 = new ogrenci[2];

        for (int i = 0; i < 2; i++) {

            System.out.println((i + 1) + ". Ogrencinin Bilgilerini girin");

            o1[i] = new ogrenci();
            System.out.println("İsim: ");
            o1[i].isim = giris.next();
            System.out.println("Cinsiyet(e/k): ");
            o1[i].cinsiyet = giris.next().charAt(0);
            System.out.println("Mezun mu: ");
            o1[i].mezunMu = giris.nextBoolean();
            System.out.println("Yas: ");
            o1[i].yas = giris.nextInt();

        }
        for (int i = 0; i < 2; i++) {

            System.out.println("isim: " + o1[i].isim + ", Cinsiyet: " + o1[i].cinsiyet + ", Mezun mu: " + o1[i].mezunMu + ", Yaş:" + o1[i].yas);
        }

        /*for (int i = 0; i < 2; i++) {
            o1[i]=new ogrenci("yusuf",'e',false,22);
            System.out.println("isim: "+o1[i].isim+", Cinsiyet: "+o1[i].cinsiyet+", Mezun mu: "+ o1[i].mezunMu+", Yaş:"+o1[i].yas);
        }*/
    }

}
