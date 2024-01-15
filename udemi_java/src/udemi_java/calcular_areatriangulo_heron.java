/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package udemi_java;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class calcular_areatriangulo_heron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        int ladoA, ladoB, ladoC;
        double semiPerimetro, area;
        Scanner scan = new Scanner(System.in);
        //datos
        System.out.println("Lado A:");
        ladoA = scan.nextInt();
        System.out.println("Lado B:");
        ladoB = scan.nextInt();
        System.out.println("Lado C:");
        ladoC = scan.nextInt();

        //proceso
        semiPerimetro = (ladoA + ladoB + ladoC) / 2;
        area = semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC);
        area = Math.sqrt(area);
        //reporte
        System.out.println("DATOS");
        System.out.println("LadoA: " + ladoA);
        System.out.println("LadoB: " + ladoB);
        System.out.println("LadoC: " + ladoC);
        System.out.println("RESULTADO");
        System.out.println("Semi Perimetro: " + semiPerimetro);
        System.out.println("Area:  " + area);

    }

}
