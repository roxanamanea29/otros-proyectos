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
public class calcular_media {

    public static void
            main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        double media = 0.0;
        Scanner ent= new Scanner(System.in);

        System.out.println("Introduce tres números y calcularé la media:");
        System.out.println("Introduzca el primer número:");
        num1 = ent.nextInt();
        
        System.out.println("Introduzca el segundo número:");
        num2 = ent.nextInt();
        
        System.out.println("Introduzca el tercer número:");
        num3 = ent.nextInt();
      
        Media(num1, num2, num3);
    }

    private static double Media(int num1, int num2, int num3) {
        double media;
        media  = (num1 + num2 + num3) / 3;
        System.out.println("La media es: "+ media);
        return media;
    }
}
