package hafta_2_uyg;

import java.util.Scanner;

public class Hafta_2_uyg {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

//        String oku=klavye.nextLine();
//
//        
//        String oku2=klavye.next();
//        //next boşluğa kadar alır. önce next i kullansak hata alırdık.
//        
//        System.out.println(oku.length());
//        System.out.println(oku2.toLowerCase());
//        System.out.println(oku2.toUpperCase());
//        String oku2=klavye.next();
//        System.out.println(oku2.substring(3));
//        System.out.println(oku2.substring(3,6));
//        System.out.println(oku2.indexOf("site")); //indisler 0 dan başlar.
//        System.out.println(oku2.indexOf('i'));
//        System.out.println(oku2.indexOf('i',3));
//        System.out.println(oku2.lastIndexOf("e"));
        String oku3 = klavye.nextLine();
//        System.out.println(oku3.trim());//baştaki ve sondaki boşlukları siler.
//        System.out.println(oku3.charAt(6)); //hangi indisi girersen onu geri döndürür.
//        System.out.println(oku3.compareTo("yusuf")); //girdiğimiz string ile eşitse 0 değilse + - li sayı döndürür.
        String oku4 = "yusuf";
        System.out.println(oku4.equals(oku3)); //karşılaştırıp true false döndürür.
    }

}
