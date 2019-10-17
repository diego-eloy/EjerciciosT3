package ejercicios_If_Else;
import java.util.Scanner;
/**
 *
 * @author diego_Eloy DAM 1
 */
public class Condiciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un Numero:");
        int numero = teclado.nextInt();
        teclado.nextLine();
        
        if(numero%20==0 && numero>=-100 && numero<=100){
            System.out.printf("El numero %d es multiplo de 20 y esta entre -100 y 100 %n",numero);
        }
        else if(numero%20==0 && numero<-100 && numero>100 ){
            System.out.printf("El numero %d es multiplo de 20 y no esta entre -100 y 100 %n",numero);
        }
        else if (numero%20!=0 && numero>=-100 && numero<=100){
            System.out.printf("El numero no %d es multiplo de 20 y esta entre -100 y 100 %n",numero);
        }
        else if(numero%20!=0 && numero>-100 && numero>100){
            System.out.printf("El numero no %d es multiplo de 20 y no esta entre -100 y 100 %n",numero);
        }
        else{
            System.out.println("El numero no es valido");
        }
    }
}
