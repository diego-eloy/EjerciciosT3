package estructurat3;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class For {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la cantidad de numero que quieres meter: ");
        int num = teclado.nextInt();
        
        int acumulador = 0;
        int numero;
        int min = 999;
        int max = 0;
        //variable de inicio, variable de final, incremento
        for (int i = 0; i <  num; i++) {
            System.out.printf("Dime un numero %n");
            numero = teclado.nextInt();
            acumulador += numero;
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }
        double media = acumulador / num;
        System.out.printf("La media de todos los numeros es: %.2f %n", media);
        System.out.printf("El Numero MIN es: %d %n", min);
        System.out.printf("El Numero MAX es: %d %n", max);
    
    
    
    
    
    
    }
}
