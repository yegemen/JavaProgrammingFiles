package hafta_9_uyg_1;

public class Hafta_9_uyg_1 {

    public static void main(String[] args) {
        
        //kalıtım alınan sınıfa süper sınıf, kalıtım alan sınıfa alt sınıf denir.

        demirbas demirbas1 = new demirbas();
        demirbas1.set_demirbas_no(11);
        System.out.println(demirbas1.get_demirbas_no());

        bilgisayar b1 = new bilgisayar();
        b1.set_demirbas_no(20);
        System.out.println(b1.get_demirbas_no());
        
        demirbas demirbas2 =new bilgisayar();
        //bilgisayar b2=new demirbas(); hata.
        
        //b2.set_demirbas_no(41);
        //System.out.println(b2.get_demirbas_no());
        
        demirbas2.set_demirbas_no(81);
        System.out.println(demirbas2.get_demirbas_no());
        
        demirbas demirbas3=new bilgisayar();
        demirbas demirbas4=new demirbas();
        
        //buralarda çağırdığımız kurucu fonksiyon(constructor) önce süper sınıfın kurucusu ardından alt sınıfın kurucusu
        //alt sınıfdan nesne oluştururken süper sınıfı kullanamayız.

    }

}
