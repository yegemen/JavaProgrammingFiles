
package hafta_12_uyg_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hafta_12_uyg_1 {

 
    public static void main(String[] args) {
        
        Scanner knsl=new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int a;
        try{
            a=knsl.nextInt();
        }
        catch(InputMismatchException e)//hatayı bilmiyorsak yalnızca exception yazabiliriz.
        {
            System.out.println("Gecersiz giris");
            e.printStackTrace();
        }
        
    }
    
}
