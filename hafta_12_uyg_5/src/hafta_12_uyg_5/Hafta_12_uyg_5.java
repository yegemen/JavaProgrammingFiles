
package hafta_12_uyg_5;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Hafta_12_uyg_5 {

    
    public static void main(String[] args) {
        
        Scanner knsl=new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int a;
        try{
            a= knsl.nextInt();
            if(a<0) throw new Exception("negatif sayi girilmez");
        }
        catch(InputMismatchException e){
            knsl.next(); //bufferı temizler
            System.out.println("Gecersiz giris.");       
        }
        catch(Exception e){
                System.out.println("Hata "+e.getMessage());
                }
    }
    
}
