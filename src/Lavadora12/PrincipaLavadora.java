package src.Lavadora12;
import java.util.Scanner;

public class PrincipaLavadora
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para lavadora grande, 2 para lavadora pequeña:");
        int tipo = scanner.nextInt();

        System.out.println("Ingrese las horas de alquiler:");
        int horas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de lavadoras:");
        int cantidad = scanner.nextInt();

        double costo = Lavadora.calcularCosto(tipo, horas, cantidad);

        System.out.println("El costo total es: " + costo);
    }
}
