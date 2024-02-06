package src.Empleado6;

import javax.swing.*;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.codEmpleado = Integer.parseInt
                (JOptionPane.showInputDialog(null,"cod "));
        empleado.setSalarioBasico(Integer.parseInt
                (JOptionPane.showInputDialog(null,"Salario ")));
        empleado.setHorasExtra(Integer.parseInt
                (JOptionPane.showInputDialog(null,"Ingrese horas ")));
        empleado.setNumeroHoras(Integer.parseInt
                (JOptionPane.showInputDialog(null,"Horas trabajadas ")));
        empleado.setDescuento(Integer.parseInt
                (JOptionPane.showInputDialog(null,"Descuento es ")));
        empleado.setDesceuntoPrestamo(Integer.parseInt
                (JOptionPane.showInputDialog(null,"Descueto prestamo ")));
        empleado.setBonificacion(Integer.parseInt
                (JOptionPane.showInputDialog(null,"Bonificacion ")));
        empleado.setNeto(Integer.parseInt
                (JOptionPane.showInputDialog(null,"Su resultado es ")));
     JOptionPane.showMessageDialog(null, "El salario neto es" + empleado.calcularNeto());
    }


}
