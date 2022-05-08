
package hafta_14_uyg_1;


public class Hafta_14_uyg_1 {
    
    zar zar1=new zar();
    zar zar2=new zar();
    public void oyna()
    {
        zar1.zar_at();
        int x=zar1.deger_oku();
        zar2.zar_at();
        int y=zar2.deger_oku();
        if((x+y)>=7)
            System.out.println("Kazandınız");
        else
            System.out.println("Zar toplami 7 den küçüktür.");
    }

   
    public static void main(String[] args) {
        Hafta_14_uyg_1 oyun1=new Hafta_14_uyg_1();
        oyun1.oyna();
        //uml diyagramını çiz.
        //aldıgın fotoya göre oyuncu dahil et. ödev.
        //uml verip senaryoyu isteyebilir. kodu isteyebilir. senaryo verip uml isteyebilir kod ister.
    }
    
}
