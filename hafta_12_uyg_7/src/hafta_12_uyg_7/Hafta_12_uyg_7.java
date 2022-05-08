
package hafta_12_uyg_7;


public class Hafta_12_uyg_7 {

    
    public static void main(String[] args) {
        
        Throws_Kelimesi t1=new Throws_Kelimesi();
        try{
            t1.fonk2();
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        System.out.println("main içerisinde hata kontrolü yapıldı.");
    }
    
}
