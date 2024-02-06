package src.Bombilla4;

import javax.swing.*;

public class PrincipalBombilla {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla();
        String option = JOptionPane.showInputDialog(null, "1 prender 2 apagar");
        if (option.equals("1")){
            JOptionPane.showMessageDialog(null, bombilla.encenderLuces());
        }
        else{
            JOptionPane.showMessageDialog(null, bombilla.apagarLuz());
        }
    }

}