
import java.util.Scanner;


public class rombo {
    public static void main(String[] args) {
         Scanner scan= new Scanner(System.in);
         System.out.print("N: ");
         int n=scan.nextInt();
         //imprimir la parte superior
         for(int i=0; i<n;i++){
             for(int k=n-i; k>0;k--){
                 System.out.print(" ");
             } 
             for(int k=0;k<i;k++){
                 System.out.print(" *");
             }
             System.out.println("");
            
         }
         //imprimir la parte inferior
         for(int i =n-1;i>=0;i--){
             for(int k=0; k<=n-i-1;k++){
                  System.out.print(" ");
             }
             for(int k =0; k<i; k++){
                  System.out.print(" *");
             }
              System.out.println("");
         }
           
       }    
    }
     

