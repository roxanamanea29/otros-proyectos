package com.mycompany.proiecto_contador;

import java.util.Scanner;

public class contador_estudiante {

    public static void main(String[] args) {
        int contador = 0; //creo el contador
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("Bienvenido al sistema de notas del estudiante!\n Para salir introduzca FIN.\n Introduzca nombre del estudiante");
            String nombre = entrada.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                seguir = false;
            } else {
                System.out.println("introduzca la nota");
                int nota = entrada.nextInt();
                 entrada.nextLine();
                contador++;
                System.out.println("Numero de datos de estudiantes y notas intruducidas son: "+ contador);
            }

        }
         System.out.println("Contador finalizado!");
            entrada.close();
    }
}
