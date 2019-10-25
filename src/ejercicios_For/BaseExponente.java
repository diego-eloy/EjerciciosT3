package ejercicios_For;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class BaseExponente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero (BASE): ");
        int base = teclado.nextInt();
        System.out.println("Dime un numero (EXPONENTE): ");
        int exp = teclado.nextInt();

        if (base == 0 && exp == 0) {
            System.out.println("ERROR");
        } else if (exp == 0) {
            System.out.println("El resultado = 1");
        }else {
            int resul = base;
            for (int i = 1; i < exp-1; i++) {
                resul = resul * base;
            }
        System.out.printf("La Operacion de %d elevado a %d nos da= %d %n",base,exp,resul);
        }
    }
}
