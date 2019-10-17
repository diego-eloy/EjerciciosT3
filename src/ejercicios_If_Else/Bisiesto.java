package ejercicios_If_Else;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Bisiesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime Un Año: ");
        int ano = teclado.nextInt();
        teclado.nextLine();
        
        if (ano%4==0){
            System.out.printf("El año %d es bisiesto %n",ano);
        }
        else if(ano % 100 == 0){
            System.out.printf("El año %d  es bisiesto %n",ano);
        }
        else if (ano % 400 == 0){
            System.out.printf("El año %d no es bisiesto %n",ano);
        }
    }
}
