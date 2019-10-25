package ejercicios_For;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class ParesEntreDosDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime Un numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Dime Otro numero:");
        int numero2 = teclado.nextInt();
        
        int resultado = 0;
        
        for (int i = numero1; i < numero2 +1; i++) {
            int par = i%2;
            if(par == 0){
                resultado = i;
                System.out.printf("Los numero son %d %n",resultado);
            }
        }  
    }
}
