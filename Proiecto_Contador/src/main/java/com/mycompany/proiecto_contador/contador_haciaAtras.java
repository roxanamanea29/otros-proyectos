package com.mycompany.proiecto_contador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class contador_haciaAtras {
    public static void main(String[] args) {
        for (int i = 10; i >=0; i--) {
            switch (i) {
                case 10:
                    System.out.println("Contador: " + i );
                    break;
                case 5:
                    System.out.println("Contador: " + i + ". A mitad de camino.");
                    break;
                case 3:
                    System.out.println("Contador: " + i + ". Queda poco.");
                    break;
                case 0:
                    System.out.println("Contador: " + i + ". ¡Finalizado!");
                    break;
                default:
                    System.out.println("Contador: " + i);
                    break;
            }
        }
    }
}
