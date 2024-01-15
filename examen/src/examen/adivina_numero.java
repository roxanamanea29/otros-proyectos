/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class adivina_numero {
    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);// introducimos Scanner para leer el dato introducido por el teclado.
        int randomNum = (int) (Math.random()*10);// creamos la variable randoNum de tipo entro utilizando un Math.Random para que me de el número aleatorio.
        int numeroAdivinar =0;// creamos la variable numeroAdivinar donde guardaremos el dato introducido por el teclado
        
        //datos
       
        do{
            System.out.println("Introduce un número del 1 al 10 para adivinar el número secreto en el que estoy pensando. ");//mostramos en pantalla el mensaje con la información y el rango de numeros utilizado
             numeroAdivinar =entrada.nextInt();
        
         //proceso     
             if(numeroAdivinar<randomNum){
                 System.out.println("El número secreto es mayor."); // si número es mayor da el mensaje 
             }else if(numeroAdivinar>randomNum){
                 System.out.println("El número secreto es menor.");// si número es menor da el mensaje
             } else{
                 System.out.println("Has acertado. FELICIDADES ");// si ha acertado el número da el mensaje
             }
        } while(numeroAdivinar != randomNum); // mientras numeroAdivinar no es igual al randomNum siga repitiendo el do.
        
    }
            
}
