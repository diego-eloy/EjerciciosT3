package estructurat3;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Do_While_CalcularMedia {
    public static void main(String[] args) {
        int numero = 6;
        double acumulador=0;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.println("Introduce una nota:");
            double notaPantalla = teclado.nextDouble();
            if(notaPantalla>=0.0 && notaPantalla<=10.0){
            System.out.printf("La nota introducida es %.2f %n",notaPantalla);
            acumulador+=notaPantalla;
            numero--;
            }
        }while(numero>0);

        double media = acumulador / 6;
        System.out.printf("La media del curso es: %.2f %n",media);
        
        //Si ponemos true el bucle se ejecuta
        //Si ponemos false el bucle no se ejecuta, solo muestra el sout
        
        
        
        
        
    }
}
