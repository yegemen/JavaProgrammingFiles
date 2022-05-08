
package hafta_10_uyg_1;


public class Hafta_10_uyg_1 {

    public static void nesne_al(ust_sinif nesne)
    {
        nesne.yaz();
    }
    
    public static void main(String[] args) {
        
        ust_sinif u1=new ust_sinif();
        alt_sinif1 alt1=new alt_sinif1();
        alt_sinif2 alt2=new alt_sinif2();
        nesne_al(u1);
        nesne_al(alt1); //ust siniftaki yaz fonksiyonu override edilir.
        nesne_al(alt2); //ust siniftaki yaz fonksiyonu override edilir.
        
    }
    
}
