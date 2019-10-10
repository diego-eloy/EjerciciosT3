package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class MayorQue {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime un el primer numero:");
        int numero1 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Dime un el segundo numero:");
        int numero2 = teclado.nextInt();
        teclado.nextLine();
        
        if (numero1 > numero2){
            System.out.printf("El numero %d es mayor que el numero %d %n",numero1,numero2);
        }
        else if(numero1 < numero2){
            System.out.printf("El numero %d es menor que el numero %d %n",numero1,numero2);
        }
        
        
        
        
        
        
    }
}
