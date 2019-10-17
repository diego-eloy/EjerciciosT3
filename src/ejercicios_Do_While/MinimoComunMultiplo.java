package ejercicios_Do_While;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class MinimoComunMultiplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //primer numero
        System.out.println("Dime un numero:");
        int numero1 = teclado.nextInt();
        //segundo numero
        System.out.println("Dime un numero:");
        int numero2 = teclado.nextInt();
        
        int numero = 1;
        
        do{ 
            int multiplicacion = numero2*numero; 
        if(numero1%multiplicacion == 0){
            System.out.printf("El numero %d es mcm %n",numero);
        }
        numero++;
        }while(numero<101);
        
        
    }
}
