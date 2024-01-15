

package com.mycompany.imc;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class IMC {

    public static void main(String[] args) {
        //variables
        String name;
        int age;
        double height;
        int weight;
        double imc;
        //formulario
        Scanner scan = new Scanner(System.in);
         
        System.out.println(" IMC  Form");
        System.out.println("================");
        System.out.println("");
       
        System.out.println(" Enter your name ");
        name = scan.nextLine();
       
        System.out.println("Enter your age ");
        age = scan.nextInt();
        
        System.out.println("Your name is "+ name + " and your age is "+ age);
        
        System.out.println("Enter your height ");
        height= scan.nextDouble();
      
        System.out.println("Enter your weight ");
        weight= scan.nextInt();
       
        System.out.println("Your name is "+ name + " and your weight is "+ weight);
        System.out.println("");
        //formula de cálculo
        imc= weight/(height*height);
        System.out.println("Your name is "+ name+ " and your IMC is "+ imc);
    }
}
