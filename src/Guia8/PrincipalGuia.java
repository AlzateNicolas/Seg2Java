package src.Guia8;

import javax.swing.*;

public class PrincipalGuia {
    public static void main(String[] args) {
    Guia guia = new Guia();
    guia.setPeso(Integer.parseInt
            (JOptionPane.showInputDialog(null, "Ingrese el peso en kilos ")));
    guia.setCosto(Integer.parseInt
            (JOptionPane.showInputDialog(null, "Ingrese el costo de envio por kilo de peso")));
        System.out.println(guia.calcularCostoXKilo());
    System.out.println(guia.verificarEntrega());

    }
}
