
import java.util.Scanner;


public class CalificaciónAlfabetica {
     public static void main(String[] args) {
       //variable
        Scanner usuario = new Scanner(System.in);
        //solicitar ingreso de nota
        System.out.println("Ingrese una calificación numerica entre 0 y 100: ");
        int  calificacion= usuario.nextInt();
        
      
        String calificacionAlfabetica = (calificacion >=90) ?  "A: Excelente" :  
                                        (calificacion >=80) ? "B: Bueno" : 
                                        (calificacion >=70) ? "C: Regular" :
                                        (calificacion >=60) ? "D: Aprobado" : "F: Suspenso";
        System.out.println("Calificación alfabetica: " + calificacionAlfabetica);
        
    }    
 
}
