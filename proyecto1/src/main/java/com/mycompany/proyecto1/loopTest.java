/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;
import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
    public class loopTest {
    public static void main(String[]arg) {
        int x;
        Scanner leer= new Scanner(System.in);
        System.out.println("Introduzca numero");
        x = leer.nextInt();
        System.out.println("Número introducido "+x);
        if(x<0) {
            System.out.println("El número es negativo👎🏻");
        }else { 
            System.out.println("El número es positivo👏🤯🤝"); 
        } 
    }
    }
