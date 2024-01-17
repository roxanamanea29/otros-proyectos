/*
Autor: Roxana
Fecha : 14/010/2024
objetivo: calcular el IMC de una persona
*/
package com.mycompany.imc;

import java.util.Locale;
import java.util.Scanner;


public class IMC {

    public static void main(String[] args) {
//variables
        Persona persona1 = new Persona("name", 35, 1.64, 59 );
        
        persona1.setHeight(70);
        
        System.out.println(persona1.salidaDatos());
        
        
        String name;
        int age;
        double height;
        int weight;
        double imc;
        
//formulario
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
         
        System.out.println(" IMC  Form");
        System.out.println("================");
        System.out.println("");
       
        System.out.println(" Enter your name ");
        name = scan.nextLine();
       
        System.out.println("Enter your age ");
        age = scan.nextInt();
        
        System.out.println("Enter your height ");
        height= scan.nextDouble();
      
        System.out.println("Enter your weight ");
        weight= scan.nextInt();
//fin de formulario       
     
        System.out.println("");
//proceamiento de datos
       
        imc= weight/(height*height);
//salida de datos
        System.out.println("Your name is "+ name+ " and your IMC is "+ imc);
    }
}
