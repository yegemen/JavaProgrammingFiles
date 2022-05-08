
package hafta_13_uyg_7;

import javax.swing.JOptionPane;

public class Hafta_13_uyg_7 {

    
    public static void main(String[] args) {
        
        String [] dersler={"SM201","BSM203","MAT201","MAT101"};
        String str=(String)JOptionPane.showInputDialog(null,"Lütfen ders seciniz:","Ders seçimi",
                JOptionPane.QUESTION_MESSAGE,null,dersler,dersler[0]);
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Lutfen vize notunuzu giriniz:","Vize",JOptionPane.QUESTION_MESSAGE));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Lutfen final notunuzu giriniz:","Final",JOptionPane.QUESTION_MESSAGE));
        
    }
    
}
