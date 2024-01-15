

import java.util.Scanner;


class Int {
     public static void main(String[] args) {
        //bienvenida
        System.out.println("\nBienvenido al euromillón online!💶\n");
        System.out.println("Hoy el numero acertado de paga a 2€\n");
        System.out.println("Y la estrella acertada se paga a 1€\n");             
        Scanner scanner = new Scanner(System.in);
       
        //introducción de números ganadores
        
        int[] numero = new int[4];
        System.out.println("Introduzca 5 números uno por uno en el rango de nçumeros:1-50.\n \n No se admite números repetidos o fuera de rango. ");
         
       
        for (int i = 0; i <= 50; i++) {
        System.out.print("Número" + (i + 1) +": ");
        numero [i] = scanner.nextInt();
     
        //condiciones
     //  int numero = 50;
    //  String mensaje = ( numero <= 50) ? "Número valido" : "Número no valido";
      //      System.out.println(mensaje);
         
            
        //imprimir los numeros ingresados 
        //System.out.print("Los números introducidos son: " + numero [i]);
    
       
         
         int[] estrella = new int[2];
        System.out.println("\nIntroduzca 2 estrellas en el rango 1-9.\n No se admite estrellas repetidas o fuera de rango. ");
       
        
        for (int z = 0; z <= 9; i++) {
        System.out.println("Estrella" + (z + 1)+ ":");
        estrella [z] = scanner.nextInt(); 
        // imprimir las estrellas
        System.out.println("Las estrellas introducidas son: " + estrella [z] );
        }
      
    }
 
     }
}



