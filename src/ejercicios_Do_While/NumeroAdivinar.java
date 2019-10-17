package ejercicios_Do_While;
import java.util.Scanner;
/**
 *
 * @author Usuario DAM 1
 */
public class NumeroAdivinar {
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 20);
        int acumulador = 0;
        int numero;
        
        do{
            System.out.println("Dime el numero a adivinar:");
            numero = teclado.nextInt();
            acumulador++;
            if(aleatorio != numero){
                System.out.println("El numero no es el mismo");
            }
        }while(aleatorio != numero);
        
           System.out.printf("Perfecto lo has adivinado el numero de intentos es %d %n",acumulador);
        
        
        
    }
}
