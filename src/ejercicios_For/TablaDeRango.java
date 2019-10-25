package ejercicios_For;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class TablaDeRango {
    /**
     * 
     * 6! = 1x2x3x4x5x6 
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el Primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Dime el Segundo numero: ");
        int numero2 = teclado.nextInt();
        
        if(numero1 <= -1 && numero2 <= -1){
            System.out.println("Numero no valido");
        }
        if(numero1 >=21 && numero2 >= 21){
            System.out.println("Numero no valido");
        }
        
        for (int i = numero1; i < numero2+1; i++) {
            System.out.printf("%d",i);
            for (int a = 0; a < 11; a++) {
                    int multi = i * a;
                    System.out.printf("La multiplicacion %d * %d = %d %n",i,a,multi);
                    if(a == 10){
                        System.out.printf("%n ******************** %n %n");
                    }
                }
            }
        }
         
        
    }

