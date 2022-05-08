
package hafta_7_uyg_2;


public class kitap {
    
    int ISBN_no;
    int basim_yili;
    int basim_sayisi;
    String adi;
    
    kitap()
    {
        System.out.println("Parametresiz kurucu fonksiyon");
    }
    
    kitap(int no1, int no2,String isim)
    {
        System.out.println("Parametreli kurucu fonksiyon");
        ISBN_no=no1;
        basim_yili=no2;
        adi=isim;
    }
    
    //set fonksiyonu
    void set_kitap_basimSayisi(int no1)
    {
        basim_sayisi=no1;
    }
    
    //get fonksiyonu
    String get_kitapAdi()
    {
        return adi;
    }
    
    int get_ISBNno()
    {
        return ISBN_no;
    }
    
}
