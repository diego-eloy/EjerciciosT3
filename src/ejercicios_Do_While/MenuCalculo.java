package ejercicios_Do_While;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class MenuCalculo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        System.out.printf("º    1.Sumar %n");
        System.out.printf("º    2.Restar %n");
        System.out.printf("º    3.Multiplicar %n");
        System.out.printf("º    4.Dividir %n");
        System.out.printf("º    5.Modulo %n");
        System.out.printf("º    6.Salir %n");
        int menu;
        do {
            System.out.println("Dime una OPCION:");
            menu = teclado.nextInt();
            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;
            int division = numero1 / numero2;
            int modulo = numero1 % numero2;
            int salir;

            switch (menu) {

                case 1:
                    System.out.printf("La suma es %d %n", suma);
                    break;
                case 2:
                    System.out.printf("La resta es %d %n", resta);
                    break;
                case 3:
                    System.out.printf("La Muliplicacion es %d %n", multiplicacion);
                    break;
                case 4:
                    System.out.printf("La Dvision es %d %n", division);
                    break;
                case 5:
                    System.out.printf("La Modulo es %d %n", modulo);
                    break;
                case 6:
                    System.out.printf("Has salido de la Calculadora %n");
                    break;
                default:
                    if (menu >= 7) {
                        System.out.println("El numero no es valido");
                    }

            }

        }while(menu != 7);
    


         
    }
}
