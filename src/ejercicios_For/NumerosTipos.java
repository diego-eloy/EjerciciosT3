package ejercicios_For;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class NumerosTipos {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int contadorpo = 0;
        int contadorne = 0;
        int contador0 = 0;
        int numeropo = 0;
        int numerone = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Dime un numero:");
            int numero = teclado.nextInt();
            
            if (numero > 0) {
                contadorpo =+ numero;
                numeropo ++;
            }else if(numero < 0){
                contadorne =+ numero;
                numerone ++;
            }else if(numero == 0){
                contador0++;
            }
            
        }
        int mediapo = contadorpo/numeropo;
        int mediane = contadorne/numerone;
        System.out.printf("La media del todos los numeros POSITIVOS es= %d %n",mediapo);
        System.out.printf("La media del todos los numeros NEGATIVOS es= %d %n",mediane);
        System.out.printf("La media de 0 SIEMPRE sera 0 %n");
    }
}
