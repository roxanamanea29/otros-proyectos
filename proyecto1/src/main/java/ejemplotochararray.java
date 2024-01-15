/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class ejemplotochararray {
    
    public static void main(String[] args) {
        // definimos una cadena
        String cadena = "Hola, mundo!";
                //utilizamos to char Array para convertir la cADENA E UN ARRAY
        char[] ArregloDeCaracteres = cadena.toCharArray();
        
        for (char c: ArregloDeCaracteres) {
            System.out.print(c + " ");
        }
    }
}
 