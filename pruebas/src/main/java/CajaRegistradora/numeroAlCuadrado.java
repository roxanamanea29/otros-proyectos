/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajaRegistradora;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class numeroAlCuadrado {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número entro.");
        numero = entrada.nextInt();
        
        System.out.println("El cuadrado de "+ numero + " es: " + calcuarCuadrado(numero));
    }

    private static int calcuarCuadrado(int numero) {
        return numero * numero;
    }
} 
