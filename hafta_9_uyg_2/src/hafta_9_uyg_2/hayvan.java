
package hafta_9_uyg_2;


public class hayvan {
    private String isim;
    private String sahip;
    
    public void isim_ata(String ev_isim, String ev_sahip)
    {
        isim=ev_isim;
        sahip=ev_sahip;
    }
    public String isim_oku()
    {
        return isim;
    }
}
