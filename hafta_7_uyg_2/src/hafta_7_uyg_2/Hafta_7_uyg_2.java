package hafta_7_uyg_2;

public class Hafta_7_uyg_2 {

    public static void main(String[] args) {

        kitap kitap1 = new kitap();
        kitap kitap2 = new kitap(1, 2001, "kurk mantolu madonna");

        System.out.println("1. Kitabin adi = " + kitap1.adi);
        System.out.println("2. Kitabin adi = " + kitap2.adi);

        kitap1.set_kitap_basimSayisi(3);
        System.out.println(kitap1.basim_sayisi);
        System.out.println(kitap2.get_kitapAdi());
        
        //set get fonksiyonlarından bahsedildi.
        
        kutuphane edebali=new kutuphane("edebali");
        
        edebali.kitap_ekle(1,2001,"kurk mantolu madonna");
        System.out.println(edebali.get_kitapsayisi());
        edebali.kitap_ekle(2,2018,"programlamaya giris.");
        System.out.println(edebali.get_kitapsayisi());

    }

}
