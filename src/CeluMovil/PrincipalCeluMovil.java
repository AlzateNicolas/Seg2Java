package src.CeluMovil;
import java.util.Scanner;
    public class PrincipalCeluMovil {
        public static void main(String[] args) {
            Operador tigo = new Operador("Tigo", 45000, 200, 12000);
            Operador claro = new Operador("Claro", 30000, 100, 18000);
            Operador movistar = new Operador("Movistar", 40000, 250, 8000);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, ingrese el nombre de su operador (Tigo, Claro, Movistar):");
            String nombreOperador = scanner.nextLine();

            System.out.println("Por favor, ingrese la cantidad de minutos internacionales consumidos:");
            int minutosInternacionales = scanner.nextInt();

            Operador operadorSeleccionado;
            switch (nombreOperador.toLowerCase()) {
                case "tigo":
                    operadorSeleccionado = tigo;
                    break;
                case "claro":
                    operadorSeleccionado = claro;
                    break;
                case "movistar":
                    operadorSeleccionado = movistar;
                    break;
                default:
                    System.out.println("Operador no reconocido.");
                    return;
            }

            int total = operadorSeleccionado.getCargoFijo() + operadorSeleccionado.getValorMinutoInternacional() * minutosInternacionales;
            System.out.println("El total a pagar es: $" + total);
        }
    }