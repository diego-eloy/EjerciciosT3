package ejercicios_For;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class CapicuaPalabra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabra = teclado.next();
        int longitud = palabra.length();
        

        String inversa = "";

        System.out.println(longitud);
        for (int i = longitud - 1; i >= 0; i--) {
            inversa += String.valueOf(palabra.charAt(i));
        }
        System.out.printf("%s \n", inversa);
        
        //El equals sirve para comparar
        if (palabra.equals(inversa)) {
            System.out.printf("La palabra es Capicua %n");
        }else{
            System.out.printf("La palabra no es capicua %n");
        }
    }
}
