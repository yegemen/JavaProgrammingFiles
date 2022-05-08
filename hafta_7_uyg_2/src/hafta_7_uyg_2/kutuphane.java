
package hafta_7_uyg_2;


public class kutuphane {
    
    kitap[] kitaplar=new kitap[5];
    static int kitap_sayisi=0;
    String k_adi;
    
    kutuphane(String ad)
    {
        k_adi=ad;
    }
    
    void kitap_ekle(int no1, int no2, String ad)
    {
        kitaplar[kitap_sayisi]=new kitap(no1,no2,ad);
        if(kitap_sayisi<4)
            kitap_sayisi++;
    }
    int get_kitapsayisi()
    {
        return kitap_sayisi;
    }
}
