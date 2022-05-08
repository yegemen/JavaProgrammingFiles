
package hafta_9_uyg_1;


public class demirbas {
    private int demirbas_no;
    public int bina_no, adet;
    public demirbas()
    {
        System.out.println("demirbas sinifinin kurucusu");
    }
    public void set_demirbas_no(int no)
    {
        demirbas_no=no;
    }
    public void set_bina_no(int no)
    {
        bina_no=no;
    }
    public void set_adet(int adet)
    {
        this.adet=adet;
    }
    public int get_demirbas_no()
    {
        return demirbas_no;
    }
}
