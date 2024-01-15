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
public class Cont_reg_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// creamos un escaner para ingresar desde treclado  informacion;
        System.out.println("Introduzca un número desde cual empiece la cuenta atras, entre el rango 0-100.");//informamos al utilizador el rango y le pedimos que ingrese un número;
        int i = entrada.nextInt();// lle el numero introducido por tecaldo;

        while (i >0 & i <= 100) { // condición del rango de numeros para introducir.
            i--; //regresamos  el contador en 1 ;
            System.out.println(i);// mostramos en pantalla el valor de i;
        }
    }
        
    }
