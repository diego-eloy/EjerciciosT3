package ejercicios_Do_While;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class BinarioOctalHexadecimal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero No Negativo (B10): ");

        int numero = teclado.nextInt();

        int resultado;
        int resto;
        String conversion = "";
        int valor = numero;

        //BINARIO
        while (numero != 1) {

            resto = numero % 2;
            numero = numero / 2;
            conversion = resto + conversion;
        }

        System.out.println(numero + conversion);
        numero = valor;

        //OCTAL
        do {

            resto = numero % 8;
            numero = numero / 8;
            conversion = resto + conversion;

        } while (numero > 7);

        System.out.println(numero + conversion);

    }
}
