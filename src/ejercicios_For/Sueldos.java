package ejercicios_For;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Sueldos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int max = 0;
        int acu = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime un Sueldo:");
            int numero = teclado.nextInt();
            acu +=numero;
            if (numero > max) {
                max = numero;
            }
        }
        int media = acu / 10;
        
        System.out.printf("La suma de todos los sueldos es: %d \n", acu);
        System.out.printf("La media de todos los sueldos es: %d \n", media);
        System.out.printf("El sueldo maximo es: %d \n",max);
    }
}
