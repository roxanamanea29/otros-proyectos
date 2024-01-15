                
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class stringDeLetras {
    public static void main(String[] args) {
        String s = "Voy a tener sobresaliente en la asignatura de programación";
        System.out.println("La logitud de la string es:" + s.length());
        System.out.println("El caracter asociado al índice 5 es:"+ s.charAt(6));
        System.out.println("La subcadena desde la 4 a la 10" + s.substring(4, 10));
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Mete  a una letra y cuento cuantas veces está en la frase...");
        String letter =scan.next();
        while (letter.length() !=1) {// aqui hago bucle para obligar al usuario que meta solo una letra
            System.out.println("¡Solo debes meter una letra!");
            letter = scan.next();
        }// una vez acabado el bucle seguirá el algoritmo
        int count =0;
        for ( int i=0 ; i< s.length(); i++) {//recorre todos los caracteres de la string y comprueba uno a uno si es la letra, si es suma count.
            if (s.charAt(i) == letter.charAt(0)) { // hago letter.charAt (0) porque me interesa tener la instancia char no String.
            count++; }   
        }
            System.out.println("En la string hay: " + count+ "veces la letra: " +letter);
        }  
}   
    
