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
public class Cont_reg_for {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// creamos un escaner para ingresar desde treclado  informacion;
        System.out.println("Introduzca un número desde cual quieres que empiece la cuenta atras.");//informamos al utilizador el rango y le pedimos que ingrese un número;
        int num = entrada.nextInt();// decalro que en num se guardará el valor introducido por teclado por el usuario;
        System.out.println("Numero inicial "+ ":"+ num); // mostramos por pantall el texto+ el valor introducido que está guardado en num;
        for (int i = num; i >=0; i--) {// he utilizado el bucle for donde he declarado que i = al valor introducido por teclado, he declarado que ies mayor e igual que o; i le he pedido que regrese d e1 en uno.
            System.out.println(i);// le he pedido que muestre  en pantalla el valore de i;

           
        }

    }
}
