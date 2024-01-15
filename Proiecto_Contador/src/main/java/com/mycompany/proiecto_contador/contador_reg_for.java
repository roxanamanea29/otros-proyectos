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
public class contador_reg_for {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número desde cual quieres que empiece la cuenta atras.");
        int num = entrada.nextInt();
        System.out.println("Numero inicial "+ ":"+ num);
        for (int i = num; i >=0; i--) {
            System.out.println(i);

            
        }

    }
}
