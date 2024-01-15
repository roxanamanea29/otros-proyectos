
import java.util.Scanner;

public class ej {
    public static void main(String[] args) {
   //crear un objeto scanner para la entrada de usuario
        Scanner scanner =new Scanner (System.in); {
    //solicitar al usuario que ingrese la calificación
        System.out.println("Ingresa la calificación númerica:");
        double calificacion = scanner.nextDouble();
        
        //utilizar operadores ternarios para asignar la calificación
        String resultado = (calificacion >=90) ? "A: Excelente" : 
                (calificacion >=80 && calificacion <=89) ? "B: Bueno" : 
                (calificacion >=70 && calificacion<=79) ? "c: Regular " : "F:Mal";
        
        //mostrar la calificacion asignada 
        System.out.println("La calificación es: " + resultado);
        // cerrar el objeto Scanner 
        scanner.close();
}   
}
}
