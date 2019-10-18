package ejercicios_Do_While;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class S_N {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int acumulador = 0;
        int numero;
        String opcion;
        int aleatorio=0;
        int record = 15;
        
        do {
            System.out.printf("El record esta en %d %n",record);
            aleatorio = (int) (Math.random() * 20);
            
            
            do {
                System.out.println("Dime el numero a adivinar:");
                numero = teclado.nextInt();
                acumulador++;
                if (aleatorio != numero) {
                    System.out.println("El numero no es el mismo");
                }
            } while (aleatorio != numero);
             System.out.printf("Perfecto lo has adivinado el numero de intentos es %d %n", acumulador);
                if(acumulador<record){
                    System.out.printf("Has superado el record%n");
                    acumulador = record;
                }
            System.out.println("Quieres volver a intentarlo?");
            opcion = teclado.next();
        } while (opcion.toLowerCase().equals("s"));
        System.out.println("Has salido del juego");
    }

}
