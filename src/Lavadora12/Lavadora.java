package src.Lavadora12;

public class Lavadora {
    private static final int COSTO_GRANDE = 4000;
    private static final int COSTO_PEQUENA = 3000;
    private static final double DESCUENTO = 0.03;

    public static double calcularCosto(int tipo, int horas, int cantidad) {
        int costoPorHora = (tipo == 1) ? COSTO_GRANDE : COSTO_PEQUENA;
        double costoTotal = costoPorHora * horas * cantidad;

        if (cantidad > 3) {
            costoTotal -= costoTotal * DESCUENTO;
        }

        return costoTotal;
    }
}
