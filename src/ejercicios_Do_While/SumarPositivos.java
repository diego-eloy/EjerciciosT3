package ejercicios_Do_While;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class SumarPositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int acumulador = 0;
        do{
            System.out.println("Dime un numero:");
            numero = teclado.nextInt();
            acumulador += numero;
            }while(numero != 0);
                System.out.printf("La suma de todos los numeros es: %d",acumulador);
        }
        
    }

