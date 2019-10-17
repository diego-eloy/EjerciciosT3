package ejercicios_If_Else;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class SumaTres {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime el Numero1: ");
        int numero1 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Dime el Numero2: ");
        int numero2 = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Dime el Numero3: ");
        int numero3 = teclado.nextInt();
        teclado.nextLine();
        
        int suma1 = numero1+numero2;
        int suma2 = numero2+numero3;
        int suma3 = numero1+numero3;
        
        if (suma1==numero3){
            System.out.printf("El %d + %d = %d %n",numero1,numero2,numero3);
        }
        else if(suma2==numero1){
            System.out.printf("El %d + %d = %d %n",numero2,numero3,numero1);
        }
        else if(suma3==numero2){
            System.out.printf("El %d + %d = %d %n",numero1,numero3,numero2);
        }
        else{
            System.out.println("No hay ninguna suma que de = a algun numero");
        }
    }
}
