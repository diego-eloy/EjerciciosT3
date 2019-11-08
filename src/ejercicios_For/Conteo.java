package ejercicios_For;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class Conteo {

    public static void main(String[] args) {
        String frase = "ebfWo 48k5 12h4 G1 0fgL  ";

        int acumuladorL = 0;
        int acumuladorWP = 0;
        int acumuladorD = 0;
        int acumuladorM = 0;
        int acumaladorm = 0;

        int longitud = frase.length();

        for (int i = longitud - 1; i >= 0; i--) {

            boolean esDigito = Character.isDigit(frase.charAt(i));
            boolean esLetra = Character.isLetter(frase.charAt(i));
            boolean esEspacio = Character.isWhitespace(frase.charAt(i));
            boolean esMayus = Character.isUpperCase(frase.charAt(i));
            boolean esMinus = !Character.isLowerCase(frase.charAt(i));

            if (esDigito) {
                acumuladorD++;
            } else if (esLetra) {
                acumuladorL++;

                if (esMayus) {
                    acumuladorM++;

                } else if (esMinus) {
                    acumaladorm++;
                }
            } else if (esEspacio) {
                acumuladorWP++;
            }
        }
        System.out.printf("Hay %d Numeros %n", acumuladorD);
        System.out.printf("Hay %d Letras %n", acumuladorL);
        System.out.printf("Hay %d Espacios %n", acumuladorWP);
        System.out.printf("Hay %d Mayusculas %n", acumuladorM);
        System.out.printf("Hay %d Minusculas %n", acumuladorM);

    }
}
