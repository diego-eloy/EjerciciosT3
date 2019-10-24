package ejercicios_Do_While;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu;
        do {
            System.out.printf("º    a.OPCION1 %n");
            System.out.printf("º    b.OPCION2 %n");
            System.out.printf("º    c.OPCION3 %n");
            System.out.printf("º    d.OPCION4 %n");
            System.out.printf("º    e.SALIR %n");
            System.out.printf("Dime la opcion deseada: %n");

            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Has elegido la opcion 1");
                    break;
                case 2:
                    System.out.println("Has elegido la opcion 2");
                    break;
                case 3:
                    System.out.println("Has elegido la opcion 3");
                    break;
                case 4:
                    System.out.println("Has elegido la opcion 4");
                    break;
                case 5:
                    System.out.println("Has elegido SALIR");
                    break;
                default:
                    System.out.println("Selecionada opcion Incorrecta");
            }
        } while (menu != 5);
        System.out.println("Saliendo....");
    }
}
