package ejercicios_For;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class NotasTipos {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        double nota;
        int contador = 0;
        String resultado = "";
        for (int i = 0; i < 6; i++) {
            System.out.println("Dime una nota:");
            nota = teclado.nextDouble();
            contador ++;
            
            if(nota < 0 || nota  >10){
                resultado = "La nota no esta entre 0 y 10";
            }else if(nota < 5){
                resultado = "SUSPENSO";
            }else if(nota >= 5){
                resultado = "APROBADO";
            } 
            System.out.printf("El alumno %d %s \n",contador,resultado);        
        }
        
    }
}
