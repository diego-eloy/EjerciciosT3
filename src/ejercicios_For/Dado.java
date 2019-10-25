package ejercicios_For;

import estructurat3.For;
import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Dado {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime cuantos lanzamientos quieres hacer");
        int tirada = teclado.nextInt();
        int acu = 0;
        if (tirada <= -1) {
            tirada = 100;
        }
        for (int i = 0; i < tirada; i++) {
            acu++;
            int numero = (int) (Math.random() * 6);
            System.out.printf("Tirada %d = %d %n", acu, numero);
        }
    }

}
