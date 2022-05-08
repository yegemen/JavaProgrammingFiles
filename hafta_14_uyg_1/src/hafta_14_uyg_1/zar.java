
package hafta_14_uyg_1;


public class zar {
    
    private int deger;
    
    public void zar_at()
    {
        System.out.println("zar atıldı");
        deger=(int)(1+Math.random()*5);
    }
    public int deger_oku()
    {
        System.out.println("gelen sayi: "+deger);
        return deger;
    }
    
}
