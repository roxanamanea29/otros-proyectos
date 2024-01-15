
public class ejemplovalor {
    public static void main(String[] args) {
        //definimos un arreglo de caracteres
        char[] caracteres = {'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '!'};
    
    //usamos copyValueOf para crear una cadena a partir de un subconjunto de caracteres
    String subcadena = String.copyValueOf(caracteres, 0,11);
    
    // imprimimos la subcadena resultante
    System.out.println("Subcadena: " + subcadena);
}
}
