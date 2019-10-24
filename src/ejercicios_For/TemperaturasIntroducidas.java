package ejercicios_For;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class TemperaturasIntroducidas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime las temperaturas que quieres: ");
        double temp = teclado.nextDouble();
        double acumulador = 0;

        if (temp == 0) {
            temp = 10;
        }
        if (temp <= -1) {
            temp = 10;
        }
        for (int i = 0; i < temp; i++) {
            System.out.printf("Dime la temperatura: %n");
            double temperatura = teclado.nextDouble();
            acumulador += temperatura;
        }

        double media = acumulador / temp;
        System.out.printf("La media es: %.2f %n",media);

    }
}
