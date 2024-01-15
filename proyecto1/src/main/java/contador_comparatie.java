
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class contador_comparatie {

    public static void main(String[] args) {
        int opcion;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introdzca numero 1 o numero 2\n");
        opcion = lectura.nextInt();
        while (opcion != 1 && opcion != 2) {
            opcion = lectura.nextInt();  
            System.out.print("Opción erronea, pruebe de nuevo\n");
        }
            System.out.println("La opción introducida es correcta: " +opcion);
            System.out.println("El bucle se ha detenido");
      
    }
}
