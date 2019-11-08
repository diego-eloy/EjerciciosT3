package ejercicios_For;

/**
 *
 * @author Usuario DAM 1
 */
public class InversaPalabra {
    public static void main(String[] args) {
        
        String palabra = "programacion";
        String palabraInversa = "";
        int longitud = palabra.length();
        
        System.out.println(longitud);
        
        for (int i = longitud-1; i >= 0; i--) 
        {
            palabraInversa += String.valueOf(palabra.charAt(i));
        }
        System.out.printf("%s",palabraInversa);
    }
}
