package hafta_5_uyg_1;

//kısa_sınav_1 (kağıt üzerinde)

public class Hafta_5_uyg_1 {

    public static void main(String[] args) {
        ogrenci ogr1 = new ogrenci();
        ogrenci ogr2 = new ogrenci("Yusuf Egemen", "Cicek");
        ogrenci ogr3 = new ogrenci();

        ogr3.ad = "Yusuf Egemen";
        ogr3.soyad = "Cicek";

        ogr3.vize = 70;
        ogr3.finall = 80;

        ogr3.Ortalama_hesapla(ogr3.vize, ogr3.finall);
        ogr3.Not_ekle();
        //ogr3.Get_mevcut();

        System.out.println("Ortalama= " + ogr3.ortalama);
        System.out.println("Sinif Mevcudu= " + ogr3.Get_mevcut());
        System.out.println(ogr2.Get_mevcut());

    }

}
