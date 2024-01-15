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
public class CONTADOR_DE_LETRAS {

    public static void main(String[] args) {
        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el texto para analizarlo: ");
        String frase = entrada.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'O' || frase.charAt(i) == 'o') {
                contador++;
            }
        }
        System.out.println("Cantidad de letras'o' encontradas: " + contador);
        entrada.close();
    }
}
