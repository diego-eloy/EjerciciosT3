package ejercicios_For;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class PalindromoFrase {
    public static void main(String[] args) {
        
        String frase = "Allí ves Sevilla";
       
        frase = frase.replace('í','i');
        frase = frase.replace('é','e');
        frase = frase.replace('ó','o');
        frase = frase.replace('á','a');
        frase = frase.replace('ú','u');
        frase = frase.replace(" ","");
        frase = frase.toLowerCase();
        System.out.printf("%s \n",frase);

        String inversa = "";
        int longitud = frase.length();
        
        for (int i = longitud-1; i >= 0; i--) {
            inversa += String.valueOf(frase.charAt(i));
        }
        System.out.printf("%s \n",inversa);
        
        if (frase.equals(inversa)) {
            System.out.println("La Frase es un Palindromo");
        }else{
            System.out.println("La Frase NO es un Palindromo");
        }
    }
}
