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
public class triangulo {
  public static void main (String[] args){
   Scanner sc = new Scanner(System.in);
   double base, altura;
   
   System.out.println("ingresa base");
   base = sc.nextDouble();
   
   System.out.println("ingresa altura");
   altura = sc.nextDouble();
  
   double area;
   area= base*altura/2;
   System.out.println("Area:" + area);
   
  }
}
