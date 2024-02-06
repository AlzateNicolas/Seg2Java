package src.SumAngulos;

import java.util.Scanner;

public class PrincipalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer ángulo:");
        int angle1 = scanner.nextInt();

        System.out.println("Ingrese el segundo ángulo:");
        int angle2 = scanner.nextInt();

        System.out.println("Ingrese el tercer ángulo:");
        int angle3 = scanner.nextInt();

        AnguloSum anguloSum = new AnguloSum(angle1, angle2, angle3);

        if (anguloSum.isValid()) {
            System.out.println("El triángulo es válido.");
        } else {
            System.out.println("El triángulo no es válido.");
        }

        scanner.close();
    }
}