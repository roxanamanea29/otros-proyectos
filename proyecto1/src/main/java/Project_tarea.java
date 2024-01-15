
import java.util.Scanner;


public class Project_tarea {
     public static void main(String[] args) {
       //variable
        Scanner usuario = new Scanner(System.in);
        //solicitar ingreso de nota
        System.out.println("Ingrese una calificación numerica entre 0 y 100: ");
        boolean paso=false;
        do{
            
        }while(paso=false);
        int calificacion= usuario.nextInt();
        
      if(calificacion>=0 && calificacion<=100) {
          paso=true;
      }else{
          System.out.println("Number outbounds");
      }
      
        String calificacionAlfabetica = (calificacion >=90) ?  "A: Excelente" :  
                                        (calificacion >=80) ? "B: Bueno" : 
                                        (calificacion >=70) ? "C: Regular" :
                                        (calificacion >=60) ? "D: Aprobado" : "F: Suspenso";
        System.out.println("Calificación alfabetica: " + calificacionAlfabetica);
        
    }    
 
}
