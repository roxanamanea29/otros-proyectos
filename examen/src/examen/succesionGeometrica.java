/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class succesionGeometrica {
    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);//introducimos Scanner para leer el dato introducido por el teclado.
        int primerTermino; // creamos la variable primerNumero
        int razon; // creamso la variable razon
        int numTerminos;// creamos la variable numTerminos
        int suma;
        //datos
        System.out.println("Ingrese el primer término de la serie: ");//muestra por pantalla elmensaje
        primerTermino = entrada.nextInt();// le el primer número y lo guarada en primerNumero
 
        System.out.println("Ingrese la razón de la serie: ");
        razon = entrada.nextInt();// lee el número de razon  y lo guarada en razon

        System.out.println("Ingrese el número de términos a sumar: "); // mensaje de introducir el termino a sumar
        numTerminos = entrada.nextInt();// lle el número de terminos y lo guarada en nuTerminos
        // proceso
        suma = (int) (primerTermino * ((1 - Math.pow(razon, numTerminos)) / (1 - razon)));// formula para averigurar la serie geometrica.

        // reporte
        System.out.println("El primer termino es: "+primerTermino);//muestra el primer termino introducido
        System.out.println("La razon es: "+razon );// muestra la rozon introducida
        System.out.println("El número de terminos es: " + numTerminos);//muestra el número de terminos
        System.out.println("La suma de la serie geométrica es: " + suma);// muestra la suma 
    }
}
