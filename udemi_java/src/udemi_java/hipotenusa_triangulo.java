package udemi_java;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author roxanamanea
 */
public class hipotenusa_triangulo {
    public static void main(String[] args) {
        //variables
        double a,b,c, area,perimetro;
        Scanner scan =new Scanner(System.in);
       
        //datos
        System.out.println("Valor de A: ");
        a = scan.nextDouble();
        
        System.out.println("Valor de B: ");
        b = scan.nextDouble();
       
        System.out.println("Valor de C: ");
        c = scan.nextDouble();
        //procesos
        c = a*a+ b*b;
        c = Math.sqrt(c);
        perimetro = a + b + c;
        area = a*b/2;
        
        //reporte
        System.out.println("reporte");
        System.out.println("Valore C:  "+ c);
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
    }
}
