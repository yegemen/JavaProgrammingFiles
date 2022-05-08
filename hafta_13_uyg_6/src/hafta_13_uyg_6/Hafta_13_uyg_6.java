
package hafta_13_uyg_6;

import javax.swing.JOptionPane;

public class Hafta_13_uyg_6 {

    
    public static void main(String[] args) {
        
        String str;
        str=JOptionPane.showInputDialog(null,"Lütfen dersin adını giriniz:","Ders",JOptionPane.INFORMATION_MESSAGE);
        
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Lütfen vize notunzu giriniz:","Vize",
                JOptionPane.INFORMATION_MESSAGE));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Lütfen final notunzu giriniz:","Final",
                JOptionPane.INFORMATION_MESSAGE));
        
        double ort=Math.round(a*0.4+b*0.6);
        //System.out.println(str);
        JOptionPane.showMessageDialog(null,str+" dersi ort="+ort,"Girilen metin",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
