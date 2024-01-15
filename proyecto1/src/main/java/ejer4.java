
public class ejer4 {
    public static void main(String[] args) {
         // creamos el array con espacio  para 5 enteros
        int[] cincoEnteros = new int[5];
       
        //inicializa el  primer elemento del aray
        cincoEnteros [0] = 10;                        
        
        //inicializa el segundo elemento del array
        cincoEnteros [1] = 4;
        
        // y así cada elemento
        cincoEnteros [2] = 233;
        cincoEnteros [3] = 65;
        cincoEnteros [4] = 9;
         
       
       // si conocemos de antemano sus valores
       int[] numerosConocidos = {5, 10, 8, 4, 23, 8, 12, 56, 87, 99};
       // acceder a los elementos d eun array
       
       for(int i=0; i < cincoEnteros.length; i++) {
           System.out.println("Elemento en el índice " + i + ":" + numerosConocidos[i]);
       }
}
}
               
    

