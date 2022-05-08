
package hafta_13_uyg_2;

import javax.swing.JOptionPane;

public class Hafta_13_uyg_2 {


    public static void main(String[] args) {
        
        double x,y, alan;
        String sx,sy;
        sx=JOptionPane.showInputDialog("Dikdörtgenin 1. Kenarı:");
        sy=JOptionPane.showInputDialog("Dikdörtgenin 2. Kenarı:");
        x=Double.parseDouble(sx);
        y=Double.parseDouble(sy);
        alan=x*y;
        JOptionPane.showMessageDialog(null,"Dikdörtgenin Alanı= "+alan);
        
    }
    
}
