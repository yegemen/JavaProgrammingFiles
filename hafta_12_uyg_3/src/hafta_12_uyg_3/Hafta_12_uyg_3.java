
package hafta_12_uyg_3;

import java.util.Scanner;

public class Hafta_12_uyg_3 {


    public static int sayiBol(int sayi1, int sayi2)
    {
        if(sayi2==0)
        {
            throw new ArithmeticException("ikinci sayi 0'dan farkli olmali");
        }
        int sonuc=sayi1/sayi2;
        return sonuc;
    }
    
    public static void main(String[] args) {
        
       Scanner klavye=new Scanner(System.in);
       try
       {
           System.out.println("ilk sayiyi giriniz: ");
           int a=klavye.nextInt();
           System.out.println("İkinci Sayiyi giriniz: ");
           int b=klavye.nextInt();
           int sonuc;
           sonuc=sayiBol(a,b);
           System.out.println("Sonuc = "+sonuc);
       }
       catch(NullPointerException ne)
       {
           System.out.println(ne.toString());
       }
    }
    
}
