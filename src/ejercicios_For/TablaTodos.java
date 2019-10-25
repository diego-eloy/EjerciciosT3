package ejercicios_For;

import java.util.Scanner;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class TablaTodos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Dime un numero: ");
            numero = teclado.nextInt();
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            for (int i = 0; i < 11; i++) {
                int multi = i * numero;
                System.out.printf("El numero %d * %d = %d %n", numero, i, multi);
                
                if(i == 10){
                    System.out.printf("%n ********************** %n");
                }
            }
            numero ++;
            
            
        } while (numero != 1);
        System.out.println("Numero no valido");
    }
}
