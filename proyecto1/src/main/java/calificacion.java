

import java.util.Scanner;

public class calificacion {
    public static void main(String[] args) {
        int x;
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduzca una calificación numerica ");
        x = leer.nextInt();
        System.out.println("Califcación introducida:" +x );
        
        if (x >= 90) { 
            System.out.println("La calificación es: A Excelente");     
        } else if (x >=80 && x<=89 ) {
            System.out.println("La calificación es: B Bueno");
        } else if (x>=70 ) {
            System.out.println("La calificación es: C Regular");
        }  else {
            System.out.println("La calificaión es: F Mal");
            
        }
    }
  }
    


 