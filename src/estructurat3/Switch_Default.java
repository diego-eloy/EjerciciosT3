package estructurat3;

import java.util.Scanner;

/**
 *
 * @author Diego_ELoy DAM 1
 */
public class Switch_Default {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la nota que has sacado: ");
        int nota = teclado.nextInt();

        if (nota < 0 && nota > 10) {
            System.out.println("No valida");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else {
            switch (nota) {
                case 5:
                    System.out.println("La nota es 5");
                    break;
                case 6:
                    System.out.println("La nota es 6");
                    break;
                case 7:
                    System.out.println("La nota es 7");
                    break;
                case 8:
                    System.out.println("La nota es 8");
                    break;
                case 9:
                    System.out.println("La nota es 9");
                    break;
                case 10:
                    System.out.println("La nota es 10");
                    break;
                default:
                    System.out.println("La nota introducida no es correcta");
            }
        }

        System.out.println("Dime la nota que has sacado: ");
        String notaPalabra = teclado.next();

        switch (notaPalabra.toLowerCase()) {
            case "hola":
                System.out.println("Estas entrando");
                break;
            case "adios":
                System.out.println("Estas saliendo");
                break;
            default:
                System.out.println("No te entiendo");
        }
    }
}
