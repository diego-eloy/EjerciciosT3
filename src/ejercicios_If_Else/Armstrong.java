package ejercicios_If_Else;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("dime un numero de 3 cifras:");
        int numero = teclado.nextInt();
        teclado.nextLine();

        int centenas = (numero / 100);
        int decenas = (numero % 100) / 10;
        int unidades = (numero % 10);
        System.out.printf("%d %d %d",centenas,decenas,unidades);
        int uniDades = unidades * unidades * unidades;
        int decEnas = decenas * decenas * decenas;
        int cenTenas = centenas * centenas * centenas;

        if (numero > 100 && numero < 1000) {
            System.out.println("El nuemro tiene 3 digitos");

            if (unidades == uniDades && decenas == decEnas && centenas == cenTenas) {
                System.out.printf("El numero %d es un numero Armstrong", numero);
            }
            else{
                System.out.println("No es un numero Armstrong");
            }
        } else {
            System.out.println("No tiene 3 digitos ");
        }
    }

}
