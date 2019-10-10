package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Capicua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime un Numero: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        
        int unidades = (numero / 1000);
        int decenas = (numero % 1000) / 100;
        int centenas = (numero % 100) / 10;
        int miles = (numero % 10);
        
        if(numero>=1000 && numero<=9999){
            System.out.printf("El numero es valido");
        }
        else{
            System.out.printf("El %d no esta entre 1000 y 9999 o no tiene 4 digitos",numero);
        }
        
        if(unidades==centenas && decenas==miles){
            System.out.printf("El nuemro %d es capicua %n",numero);
        }
        else{
             System.out.printf("El nuemro %d no es capicua %n",numero);
        }
    }
}
