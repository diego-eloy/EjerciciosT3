package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Consecutivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 3 numeros:");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int numero3 = teclado.nextInt();
        
        if(numero1<numero2 && numero1<numero3){
            System.out.printf("El %d > %d > %d",numero1,numero2,numero3);
        }else if(numero2<numero3 && numero2>numero1 && numero1<numero3){
            System.out.printf("El %d > %d > %d",numero2,numero1,numero3);
        }else if(numero3<numero2 && numero3<numero1 && numero1<numero2){
            System.out.printf("El %d > %d > %d",numero3,numero1,numero2);
        }
        
        
    }
}
