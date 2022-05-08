
package hafta_12_uyg_6;


public class ThrowsKelimesi {
    
    public void fonk1()
    {
        int [] dizi=new int[]{2,5,3};
        try{
            System.out.println("burasi fonk1");
            System.out.println(dizi[3]);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
    public void fonk1_cagir()
    {
        System.out.println("burasi fonk1 i cagirir.");
        fonk1();
    }
    
}
