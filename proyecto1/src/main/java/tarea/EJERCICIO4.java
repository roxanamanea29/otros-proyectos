/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class EJERCICIO4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("ingresa un numero (0 para salir): ");
        numero = scan.nextInt();
        while (numero != 0) {
            System.out.println("ingresaste: " + numero);
            System.out.println(" ingresa otro numero (0 PARA SALIR): ");
            numero = scan.nextInt();
        }
        System.out.println("saliste led bucle");
    }
}
