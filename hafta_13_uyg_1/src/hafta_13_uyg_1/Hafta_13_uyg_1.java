
package hafta_13_uyg_1;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Hafta_13_uyg_1 {


    public static void main(String[] args) {
        
        /*Scanner klavye=new Scanner(System.in);
        int a=klavye.nextInt();
        */
        
        String m=JOptionPane.showInputDialog("Sayi giriniz: ");
        int x=Integer.parseInt(m);
        
        String str;
        str=JOptionPane.showInputDialog(null,"Lutfen dersin adını giriniz: ","Ders",
                JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, x);
        JOptionPane.showMessageDialog(null, str);
        
        
        
    }
    
}
