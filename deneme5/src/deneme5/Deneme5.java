
package deneme5;


public class Deneme5 {


    public static void main(String[] args) {
        Adres adr=new Adres(22,55,"kemerkopru","merkez","bilecik");
        ogrenci_class ogr=new ogrenci_class(123,"ahmet",adr);
        System.out.println(ogr.ogr_no);
        System.out.println(ogr.ogr_ad);
        System.out.println(ogr.ogr_adres.mahalle);
        System.out.println(ogr.ogr_adres.sokak);
        System.out.println(ogr.ogr_adres.no);
        System.out.println(ogr.ogr_adres.il+"-"+ogr.ogr_adres.ilce);
    }
    
}
