package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Ordenados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero1: ");
        int numero1 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dime un numero2: ");
        int numero2 = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Dime un numero3: ");
        int numero3 = teclado.nextInt();
        teclado.nextLine();

        if (numero1 > numero2 && numero2 > numero3 && numero1 > numero3) {
            System.out.printf("%d > %d > %d %n", numero1, numero2, numero3);
        } 
        else if (numero2 > numero1 && numero3 > numero1) {
            System.out.printf("%d > %d > %d %n", numero2, numero3, numero1);
        } 
        else if (numero3 > numero2 && numero3 > numero1 && numero1 > numero2) {
            System.out.printf("%d > %d > %d %n", numero3, numero2, numero1);
        }
    }
}
