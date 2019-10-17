package ejercicios_If_Else;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Incremento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = teclado.nextInt();
        
        if(numero%2==0 && numero%3==0){
            numero+=5;
            System.out.printf("El numero es %d %n",numero);
        }else if(numero%2==0 && numero%5==0){
            numero+=7;
            System.out.printf("El numero es %d %n",numero);
        }else if(numero%2==0){
            numero+=2;
            System.out.printf("El numero es %d %n",numero);
        }else if(numero%3==0){
            numero+=3;
            System.out.printf("El numero es %d %n",numero);
        }else if(numero%5==0){
            numero+=5;
            System.out.printf("El numero es %d %n",numero);
        }
        else{
            numero=numero+1;
            System.out.printf("El numero es %d %n",numero);
        }
    }
}
