package ejercicios_For;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime un numero Crack: ");
        int numero = teclado.nextInt();
        
        if(numero <= -1){
            System.out.println("Numero no valido");
        }
        if (numero >=11){
            System.out.println("Numero no valido");
        }
        
        for(int i = 0; i <11;i++){
            int multiplicacion = numero *i;
            System.out.printf("Numero %d * Numero %d = %d %n",numero,i,multiplicacion);
        }
    }
}
