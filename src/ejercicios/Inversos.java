package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Inversos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        double numero1,numero2,numero3;
        double sumaInversa;
        
        System.out.println("Dime el nuemro 1");
        numero1 = teclado.nextDouble();
        System.out.println("Dime le nuemro 2");
        numero2 = teclado.nextDouble();
        System.out.println("Dime el nuemro 3");
        numero3 = teclado.nextDouble();
        
        if(numero1>=-100 && numero1<=100 && numero2>=-100 && numero2<=100
                && numero3>=-100 && numero3<=100){
        
            double invnum1=0,invnum2=0,invnum3=0;
            
            if (numero1 != 0){
                invnum1 = 1 / (double)numero1;
            }
            if(numero2 != 0){
                invnum2 = 1/(double)numero2;
            }
            if(numero3 != 0){
                invnum3 = 1/(double)numero3;
            }
            sumaInversa = invnum1+invnum2+invnum3;
            System.out.printf("La suma de las inversas es: %.5f %n",sumaInversa);
        } else{
            System.out.println("Los numeros no estan en el rango");
        }      
        
    } 
}
