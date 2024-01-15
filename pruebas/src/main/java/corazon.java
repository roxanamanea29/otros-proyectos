
import java.util.Scanner;


public class corazon {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // creacion de un corazón de estrellas
        Scanner scan= new Scanner(System.in);
         System.out.print("N: ");
         int n=scan.nextInt();
         //tapa
             for(int k=0; k<n; k++){
             System.out.print(" *");
         }
             System.out.println("  ");
         //medio
        for(int i=0;i<n;i++) {
            System.out.print(" *");
             for(int k=0; k<n; k++){
            System.out.print(" ");
         }
            System.out.println(" *");
         }
         
        //final
         for(int k=0; k<n; k++){
             System.out.print(" *");
         }
             System.out.println("");
         }
        
        
   }     
      
        
    

