package estructurat3;
import java.util.Scanner;
/**
 *
 * @author Diego_eloy DAM 1
 */
public class If_Else {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
//        System.out.println("Dime un numero: ");
//        int numero = teclado.nextInt();
//        teclado.nextLine();
//        
//        boolean salida=true;
//        
//        if (numero >= 0){
//            System.out.printf("El numero %s es mayor o igual que 0: %n",numero);
//        }else{
//            salida = false;
//            System.out.printf("El numero %s es menor que 0: %b %n",numero,salida);
//        }
//        System.out.println(salida);
        
        
        System.out.println("Danos una nota: ");
        double nota = teclado.nextDouble();
        teclado.nextLine();
        String salida = null;
        if (nota < 5){
             salida = String.format("Tu nota es %.2f por lo que has Suspendido %n",nota);
        }else if(nota >= 5 && nota <= 6.99){
            salida = String.format("Tu nota es %.2f por lo que has Aprobado %n",nota);
        }else if(nota >= 7 && nota >= 8.99){
            salida = String.format("Tu nota es %.2f por lo tienes un Notable %n",nota);
        }else if(nota > 9 && nota <= 9.99){
            salida = String.format("Tu nota es %.2f por lo tienes un Sobresaliente %n",nota);
        }else if(nota == 10){
            salida = String.format("Tu nota es %.2f por lo tienes Matricula de Honor %n",nota);
        }
        System.out.println(salida);
        
    }
}
