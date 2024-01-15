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
public class dia_semana {
    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);// introducimos el Scanner para leer el dato introducido por el teclado
        System.out.println("Introduce un número del 1 al 7 para averiguar el día de la semana."); //mostramos en pantalla el mensaje con la información y el rango de numeros utilizado
        int num = entrada.nextInt(); // guardamos en "num" el dato introducido por el teclado por el usuario
        //datos
        String diaSemana = null; //declaramos el valor de diaSemana
         //proceso
         switch(num){ // creamso un switch para todos los días de la semana, con los casos de los días.
             case 1:
                 diaSemana = "Lunes";
                 break;
             case 2:
                  diaSemana = "Martes";
                 break;
             case 3:
                  diaSemana = "Miercoles";
                 break;
             case 4: 
                  diaSemana = "Jueves";
                 break;
             case 5:
                  diaSemana = "Viernes";
                 break;
             case 6:
                  diaSemana = "Sábado";
                 break;
             case 7:
                  diaSemana = "Domingo";
                 break;
             default:
                 System.out.println("El número introducido es fuera del rango");// en el default aparece el mensaje "numero fuera de rango" por si el usuario ssale del rango propuesto
         }
         entrada.close();// cerramos el Scanner
          //resultado
         System.out.println("El día de la semana es: "+diaSemana);     // mostramos por pantalla el mensaje + el día de la semana  asignda al número que el usuaraio ha intoducido.                       
    }
}
