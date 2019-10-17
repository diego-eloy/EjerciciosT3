package ejercicios_Do_While;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class MayorNumero {

    public static void main(String[] args) {

        int numeroAleatorio;
        int MAX=0;

        do {
            numeroAleatorio = (int) (Math.random() * 100);
            System.out.printf("El numero es : %d%n", numeroAleatorio);
            if(numeroAleatorio > MAX){
                MAX = numeroAleatorio;
            }
        }while (numeroAleatorio != 0);

        System.out.println("El bucle ha terminado");

        System.out.printf("El numero max es : %d %n", MAX);
    }
}
