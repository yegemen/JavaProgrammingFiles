
package hafta_13_uyg_3;

import javax.swing.JOptionPane;

public class Hafta_13_uyg_3 {

    
    public static void main(String[] args) {
        
        int sonuc=JOptionPane.showConfirmDialog(null,"Emin misin?");
        if(sonuc==JOptionPane.YES_OPTION)
        {
            System.out.println("Yes secildi: "+sonuc);
        }
        else if(sonuc==JOptionPane.NO_OPTION)
        {
            System.out.println("No secildi: "+sonuc);
        }
        else if(sonuc==JOptionPane.CANCEL_OPTION)
        {
            System.out.println("Cancel secildi: "+sonuc);
        }
        
    }
    
}
