
import java.util.Scanner;





public class EJE4 {
   public static void main(String[] args) {
               
       int randomNum = (int)(Math.random() * 101);
        //System.out.println(randomNum);
       
        
        Scanner sc = new Scanner(System.in);      
       int numeroUsuario;
       int numeroIntentos = 0;
        do {
            System.out.println("Intenta adivinar el número que he pensado. Ingresa tu numero:  ");
            numeroUsuario = sc.nextInt();
           numeroIntentos ++;
            if (randomNum > numeroUsuario) {
                System.out.println("El número que he pensado es mayor que el introducido");
            } else if (randomNum < numeroUsuario) {
                System.out.println("El número que he pensado es menor que el introducido");
            }
        } while (randomNum != numeroUsuario); {
       System.out.println(" 🎉Felicidades🎉 ");
       System.out.println("Has adivinado  en :" +numeroIntentos+ "  Intentos");
   }
    }
}
        
    
    
    

