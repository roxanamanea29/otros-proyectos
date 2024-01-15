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
public class CajaRegistradora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precio = 0.0;
        int unidades = 0;
        double numero = 0.0;
        double importe = 0.0;
        double dinero = 0.0;
        double vuelta = 0.0;
//Pedimos precio y unidades
        System.out.println("Introduzca el precio por artículo (usando una coma para separar los decimales)");
        precio = entrada.nextDouble();
       
        System.out.println("¿Cuántas unidades desea llevarse?");
        unidades = entrada.nextInt();
        importe = CalcularImporte(precio, unidades);
       
        System.out.println("Debe pagar " + importe + " euros");
        System.out.println("Introduzca el dinero");
        dinero = entrada.nextDouble();
        vuelta = CalcularVuelta(dinero, importe);
        if (vuelta > 0) {
            System.out.println("Le sobran " + vuelta + " euros");
        } else if (vuelta == 0.0) {
            System.out.println("Me ha dado la cantidad exacta");
        } else {
            System.out.println("Le faltan " + vuelta + " euros");
        }
    }

    private static double CalcularVuelta(double dinero, double importe) {
        double vuelta;
        vuelta = dinero - importe;
        return vuelta;
    }

    private static double CalcularImporte(double precio, int unidades) {
        double importe;
        importe = precio * unidades;
        return importe;
    }
}
