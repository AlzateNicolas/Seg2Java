package src.MayorMenor;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.print("Ingrese el primer número: ");
        numero.setA(scanner.nextInt());

        System.out.print("Ingrese el segundo número: ");
        numero.setB(scanner.nextInt());

        System.out.print("Ingrese el tercer número: ");
        numero.setC(scanner.nextInt());

        int mayor = numero.encontrarMayor();
        System.out.println("El número mayor es " + mayor);
    }
}
