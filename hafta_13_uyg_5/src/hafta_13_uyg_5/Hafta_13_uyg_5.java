
package hafta_13_uyg_5;

import javax.swing.JOptionPane;

public class Hafta_13_uyg_5 {

    
    public static void main(String[] args) {
        
        String [] dersler={"BSM420","BSM421","BSM422","BSM423","BSM424"};
        int n=JOptionPane.showOptionDialog(null, "Hangi dersi seçmek istiyorsun?","Ders Seçimi",
                JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,dersler,dersler[0]);
        
    }
    
}
