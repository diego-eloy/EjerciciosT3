package ejercicios_For;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Factorial {
    /**
     * 
     * 6! = 1x2x3x4x5x6 
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        
        if(numero <= -1){
            System.out.println("Numero no valido");
        }
        if(numero >=21 ){
            System.out.println("Numero no valido");
        }
        
        int factorial = numero!;
        
    }
}
