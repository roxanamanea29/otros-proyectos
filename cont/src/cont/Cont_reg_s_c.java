/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cont;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class Cont_reg_s_c {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// utilizo la herramienta Scanner para que el usuario pueda introducir por pantalla información; 
         System.out.println("Introduzca un número desde cual empiece la cuenta atras, entre el rango 0-10.");//informamos al utilizador el rango y le pedimos que ingrese un número;
        int i = entrada.nextInt();//lle el numero introducido por tecaldo;
           
        while ( i >=1 & i<=10) {//condicion del rango de numeros para introducir;
             i--; //regresamos  el contador en 1 ;
            switch (i) { // utilizamos un switch/case para que cuando pasa por la valor indicada que me muestre por pantalla ciertos mensajes.
                case 10 -> System.out.println("Contador: " + i + ". Anunciamos la despega del cohete🚀" );
                case 5 -> System.out.println("Contador: " + i + ". A mitad de camino.");
                case 3 -> System.out.println("Contador: " + i + ". Queda poco.🚦");
                case 0 -> System.out.println("Contador: " + i + ". ¡Finalizado!🚀");
                default -> System.out.println("Contador: " + i+ " valor fuera de rango");
            }
        }
    }
}
