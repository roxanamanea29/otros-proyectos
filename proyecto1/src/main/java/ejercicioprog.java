
import java.util.Scanner;


public class ejercicioprog {
    public static void main(String[] args) {
       //variable
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una calificación numerica entre 0 y 100");
        int calificacion  = scanner.nextInt();
        

        String  calificacionAlfabetica = (calificacion >= 90.00) ? "A: Excelente" :  
                                         (calificacion >=80.00) ? "B: Bueno" :
                                         (calificacion >=70.00) ? "C: Regular" :
                                         (calificacion >=60.00)  ?  "F: Suspenso": "X: NE CALIFICADO" ;
         System.out.println("Calificacion alfabetica: "+ calificacionAlfabetica);
    }
    
}
  