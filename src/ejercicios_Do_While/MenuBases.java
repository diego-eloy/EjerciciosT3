package ejercicios_Do_While;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class MenuBases {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int resultado;
        int resto;
        String conversion = "";
        int valor = numero;
        String letra = "";
        String conversion1 = "";
        int menu;
        do {
            System.out.println("Introduce el numero que quieres cambiar de base:");
            numero = teclado.nextInt();
            System.out.printf("1.  Pasar a base2 %n");
            System.out.printf("2.  Pasar a base8 %n");
            System.out.printf("3.  Pasar a base16 %n");
            System.out.printf("4.  SALIR %n");
            System.out.printf("Selecciona la base a la que quieres pasar:  %n");
            menu = teclado.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Pasar a Base 2");
                    while (numero != 1) {

                        resto = numero % 2;
                        numero = numero / 2;
                        conversion = resto + conversion;
                    }
                    System.out.println(numero + conversion);
                    numero = valor;
                    break;
                case 2:
                    System.out.println("Pasar a Base 8");
                    do {
                        resto = numero % 8;
                        numero = numero / 8;
                        conversion = resto + conversion;

                    } while (numero > 7);

                    System.out.println(numero + conversion);
                    break;
                case 3:
                    System.out.println("Pasar a Base 16");
                    while (numero > 15) {
                        resto = numero % 16;
                        numero = numero / 16;

                        if (resto > 9) {
                            switch (resto) {
                                case 10:
                                    letra = "A";
                                    break;
                                case 11:
                                    letra = "B";
                                    break;
                                case 12:
                                    letra = "C";
                                    break;
                                case 13:
                                    letra = "D";
                                    break;
                                case 14:
                                    letra = "E";
                                    break;
                                case 15:
                                    letra = "F";
                                    break;
                            }
                            conversion1 = letra + conversion1;
                        } else {
                            conversion1 = resto + conversion1;
                        }
                    }

                    conversion1 = numero + conversion1;
                    System.out.println(conversion1);
                    break;
                case 4:
                    System.out.println("Has salido de la calculadora");
                    break;

            }
        } while (menu != 4);
        System.out.println("Saliendo....");
    }
}
