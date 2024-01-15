

package com.mycompany.menu_java;

import java.util.Scanner;


public class Menu_java {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        do{
            System.out.println("\n====MENÚ PRICIPAL====");
            System.out.println("1, Crear Alumno");
            System.out.println("2. Listar Alumno");
            System.out.println("3. Acutalizar Alumno");
            System.out.println("4. Eliminaer Alumno");
            System.out.println("5.Cargar Datos de Ejemplo");
            System.out.println("0. Salir");
            System.out.println("Selecione una opción");
            
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    System.out.println("Esta es la opcion 1");
                    break;
                case 2:
                    System.out.println("Esta es la opcion 2");
                    break;
                case 3:
                    System.out.println("Esta es la opcion 3");
                    break;
                case 4:
                    System.out.println("Esta es la opcion 4");
                    break;
                case 5:
                    System.out.println("Esta es la opcion 5");
                    break;
                case 0:
                    salir= true;
                    break;
                default:
                    System.out.println("Opción no valida. Por favor, intente de nuevo.");
            }
         
        }while(salir);
        
    }
}
