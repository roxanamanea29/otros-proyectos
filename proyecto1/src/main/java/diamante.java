
/* public class diamante {
    public static void main(String[] args) {
        //decalracion de la altura del diamante
        int altura = 4;
       
        // bucle para recorrer las filas 
        for (int fila = 0; fila<altura; fila++) {
         
            //bucle para los espacios 
            for (int espacio =0; espacio<(altura-fila-1); espacio++) {
             System.out.print(" ");
            }
           // bucle para los asteriscos 
           
            for(int asterisco=0; asterisco<(fila*2)+1; asterisco++){
                System.out.print("*");
            } 
            System.out.println("");
        }
            // tronco
            int largoTronco = 1;
            for (int base=0; base<largoTronco; base++){
                //espacios blanco
                for(int espacio=0; espacio<(altura-2); espacio++){
                System.out.println(" ");
            }
                 //barritas del tronco
                 for (int tronco=0; tronco<3; tronco++) {
                     System.out.print("|");
                 }
                 System.out.println("");
      }   
         
}       
}       */    
    

public class diamante {
    public static void main(String[] args) {
        int altura = 5; // Ajusta la altura del diamante según tus necesidades

        // Mitad superior del diamante
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Mitad inferior del diamante
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}