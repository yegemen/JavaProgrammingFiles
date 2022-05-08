
package hafta_12_uyg_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hafta_12_uyg_2 {


    public static void main(String[] args) {
        Scanner knsl=new Scanner(System.in);
        boolean hata_var;
        do{
            System.out.println("Sayi giriniz:");
            int a;
            try{
                hata_var=false;
                a=knsl.nextInt();
            }catch(InputMismatchException e){
                hata_var=true;
                knsl.next(); //bufferi temizler
                System.out.println("gecersiz giris. tekrar deneyiniz.");
            }
        }
        while(hata_var==true);
    }
    
}
