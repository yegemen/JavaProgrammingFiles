package hafta_5_uyg_1;

public class ogrenci {

    String ad, soyad;
    double vize, finall, ortalama;
    static int mevcut = 0;

    public ogrenci() {
        mevcut++;
        ad = "xxx xxx";
        soyad = "xxx xxx";
    }

    public ogrenci(String a, String b) {
        mevcut++;
        ad = a;
        soyad = b;
    }

    public int Get_mevcut() {
        return mevcut;
    }

    public double Ortalama_hesapla(double not1, double not2) {
        ortalama = not1 * 0.4 + not2 * 0.6;
        return ortalama;
    }

    public void Not_ekle() {
        if (ortalama >= 40 && ortalama < 45) {
            ortalama = ortalama + 5;
        }

    }
}
