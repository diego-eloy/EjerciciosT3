package ejercicios_For;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class TablaTodos2 {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {

            for (int a = 0; a < 11; a++) {
                int multi = i * a;
                System.out.printf("La multiplicacion de %d * %d = %d %n", i, a, multi);
                if (a == 10) {
                    System.out.printf("%n ***************** %n%n");
                }
            }
        }
    }
}
