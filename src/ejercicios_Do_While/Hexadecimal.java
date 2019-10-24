package ejercicios_Do_While;

/**
 *
 * @author Usuario DAM 1
 */
public class Hexadecimal {

    public static void main(String[] args) {

        int numero = 27;
        int resto, resultado = 0;
        String letra = "";
        String conversion = "";
        
        while (numero > 15) {
            resto = numero % 16;
            numero = numero / 16;

            if (resto > 9) {
                switch(resto){
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
                conversion = letra + conversion;    
            }else{
                conversion = resto + conversion;
            }
        }
         
        conversion = numero + conversion;
        System.out.println(conversion);
    }

}
