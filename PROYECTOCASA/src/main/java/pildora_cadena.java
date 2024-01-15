

/**
 *
 * @author roxanamanea
 */
public class pildora_cadena {
    public static void main(String[] args) {
        String mi_nombre ="Roxana Aura Manea";
        System.out.println("Mi nombre es " + mi_nombre);
        System.out.println("La cadena de caracteres de mi nombre es:" + mi_nombre.length()+ " letras");
        System.out.println("El caracter nr 2 de mi nobre es: " + mi_nombre.charAt(2) + " la tercera letra"); //IT COUNT FROM THE 0R,1O,2X,3A,4N,5A
        System.out.println("la primera letra de " + mi_nombre + " es "+ mi_nombre.charAt(0));
        int ultima_letra;
        ultima_letra= mi_nombre.length();
        System.out.println("La ultima letra es la " + mi_nombre.charAt(ultima_letra-1) );
        
    }
}
