
package hafta_12_uyg_4;

import java.util.Scanner;

public class Hafta_12_uyg_4 {


    
    public static void main(String[] args) {
        
       Scanner klavye=new Scanner(System.in);
       int a,b;
       try
       {
           System.out.println("ilk sayiyi giriniz: ");
           a=klavye.nextInt();
           System.out.println("İkinci Sayiyi giriniz: ");
           b=klavye.nextInt();
           if(b==0) throw new IllegalArgumentException("Sifira bolme yok.");
       }
       catch(IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
    }
    
}
