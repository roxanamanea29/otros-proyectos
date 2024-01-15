/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proiecto_contador;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class contador_reg_while {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número desde cual empiece la cuenta atras, entre el rango 0-100.");
        int i = entrada.nextInt();

        while (i >0 & i <= 100) {
            i--;
            System.out.println(i);
        }
    }

}
