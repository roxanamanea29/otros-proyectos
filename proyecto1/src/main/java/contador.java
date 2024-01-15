/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class contador {
    public static void main(String[] args) {
        final int FIN =4;
        int i = 0,suma = 0;
        //ejemplo de bucle while controlado por contador
        while (i <= FIN) {
        System.out.print("Contador " +i);
        suma = i+2;
            System.out.println(" Suma" + suma);
            i= i+1 ;// incremento de contador (i)
        }
        System.out.println("Valor del contador fuera del bucle = " +i);
        System.out.println("Valor final de suma = " + suma);
    }
}
