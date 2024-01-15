/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class error {
   public static void main(String[] args){
    int numero = 123;
           System.out.printf("numero;%s%n",numero);
           
           String texto = "Hola mundo!";
           System.out.printf("Texto", texto);
           
           
           
           char letra= 'A';
           System.out.printf("Letra: %c%n",letra);
           
           int octal =017; //octal (15 en decimal)
           int hexadecimal = 0x1F; // Hexadecimal (31 en decimal)
           System.out.printf("Octal: %o, Hexadecimal: %x%n", octal, hexadecimal);
           
           boolean esVerdadero = true;
           System.out.printf("¿Es verdarero? %b%n", esVerdadero);
           
           
           Date fecha = new Date();
           System.out.printf("fecha y hora %tF %tT%n", fecha, fecha);
           
        
           for (int i=0; i<=10; i++){
               System.out.println(i);
               
           }
           //ejemplo de sentncia condicional if-else
        
            int x;
            Scanner leer =new Scanner(System.in);
            //lectura de datos 
            System.out.println("introduzca un entero"); 
            x = leer.nextInt();
            System.out.println("Entero introducido" +x);
            if (x<0) { 
                System.out.println("El numero es positivo");
            } else{
                System.out.println("El numerro es negativo");
            }//fin de la capsula else System.out.println("Fin de programa")
        }//fin metodo main
}
   
 

