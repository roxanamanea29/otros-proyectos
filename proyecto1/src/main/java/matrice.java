
public class matrice {
    public static void main(String[] args) {
        int[][] numeros = {{5, 7, 9},{3, 4, 8},{1, 0, 2},{9, 5, 2} };
        for (int i = 0; i< numeros.length; i++) {
            for (int j = 0; j< numeros[i].length; j++) {
                System.out.println("El valor de la matriz en la posición["+i+"]["+j+"]es: " +numeros[i][j]);
            }
        }
    }
    
}
