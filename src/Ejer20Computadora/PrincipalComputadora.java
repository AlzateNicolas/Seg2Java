package src.Ejer20Computadora;
import java.util.Scanner;

public class PrincipalComputadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿La computadora emite un pitido? (true/false)");
        boolean emitePitido = scanner.nextBoolean();

        System.out.println("¿El disco duro gira? (true/false)");
        boolean discoDuroGira = scanner.nextBoolean();

        // Crear una instancia de Computadora
        Computadora miComputadora = new Computadora(emitePitido, discoDuroGira);

        // Determinar el estado de la computadora
        String estado = miComputadora.determinarEstado();

        // Imprimir el estado de la computadora
        System.out.println(estado);
    }
}