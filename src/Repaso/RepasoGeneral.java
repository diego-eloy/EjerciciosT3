package Repaso;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class RepasoGeneral {
    
    //El STATIC sirve para llamar a la variable que esta fuera del MAIN
    static int nota; 
    
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("dime tu nota:");
        nota = teclado.nextInt();
        teclado.nextInt();*/
        
        //asi enganchamos el metodo con el main
        int nuevaSuma = 4 + miMetodo(4,6);
        System.out.println(nuevaSuma);
    }
    //Metodo tipo INT siempre lleva return
    public static int miMetodo(int nu1,int nu2){
      
            //Hemos igualdo los valores a 
        int n1 = nu1;
        int n2 = nu2;
        int suma = n1 + n2;
        return suma;
    }
}
