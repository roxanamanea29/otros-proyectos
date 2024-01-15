package com.mycompany.proiecto_contador;


import java.util.Scanner;

public class contador_operaciones_basicas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma;
        int resta;
        int promedio;
        int division;
        System.out.println("Introduzca el primer numero: ");
        int nota1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int nota2 = entrada.nextInt();
        suma = nota1 + nota2;
        resta = nota1 - nota2;
        promedio = nota1 * nota2;
        division = nota1 / nota2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El promedio es: " + promedio);
        System.out.println("La division es: " + division);
    }
}
