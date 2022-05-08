
package hafta_12_uyg_7;


public class Throws_Kelimesi {
    
    public void fonk1 () throws Exception
    {
        int [] dizi=new int[]{2,5,3};
        System.out.println("burasi fonk1");
        System.out.println(dizi[3]);
    }
    /*public void fonk1_cagir()
    {
        System.out.println("burasi fonk1 i cagirir.");
        try{
            fonk1();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        System.out.println("fonk1 cagirildi.");
    }*/
    public void fonk2() throws Exception
    {
        System.out.println("burasi fonk1 i cagirir");
        fonk1(); // exception ile karşılacağımızdan try catch yazmamız lazım ya da throws exception ile bildirmemiz lazım.
    }
}
