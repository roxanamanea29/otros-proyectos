/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class suma_nr_par {
    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);
        int numeroUsuario = 0;
        int suma = 0;
        //datos
        System.out.println("Introduce un número entero positivo. ");
        numeroUsuario = entrada.nextInt();
        //proceso
        if (numeroUsuario % 2 == 0) {
            System.out.println("El número que has introducido es par.");
        }
            else {
           System.out.println("El número que has introducido no es par.");
        }
        for (int i = 2; i <= numeroUsuario; i += 2) {
            suma += i;
        }
        //resultado
        System.out.println("La suma de todos los números pares hasta el número introducido es: " + suma);

    }

}
