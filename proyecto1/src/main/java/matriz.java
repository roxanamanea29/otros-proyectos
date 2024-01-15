
public class matriz {
    public static void main(String[] args) {
        
    int [][] numeros = {{5, 7, 9},{3, 4, 8}};
    
    for (int i=0; i < numeros.length; i++) {
        for ( int j= 0; j<numeros[i].length; j++) {
            System.out.println("El valor de la matri en la posición["+i+"]["+j+"] es:" +numeros [i][j]);
         }
      } 
    }
}


