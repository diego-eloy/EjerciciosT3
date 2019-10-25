package ejercicios_For;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Factorial {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int factorial;
        System.out.println("Introduce el numero a Calcular: ");
        factorial = teclado.nextInt();

        for (int i = factorial - 1; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.printf("El factorial es %d %n", factorial);
    }
}
