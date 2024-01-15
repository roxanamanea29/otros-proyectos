
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class ej16if {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce tu edad");
        int edad = entrada.nextInt();
       if (edad<18){
           System.out.println("Eres menor de edad");
       }else if(edad <40){
           System.out.println("Eres joven");
       }else if(edad<65){
           System.out.println("eres maduro");
       }else{
           System.out.println("cuidate");          
       }
    }
}
