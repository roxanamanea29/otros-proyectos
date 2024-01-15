
package com.mycompany.proyecto1;

import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class programacion {
    // Ejercicio 1
    public static void ej1(){
       int suma = 0;
      System.out.println("Suma de nr pares de 2 al 10:");
        for (int i = 2; i <= 10; i += 2) {
         suma += i;
      System.out.println("Numero par" +i); 
        }
      System.out.println("la suma es:" +suma); 
    }
    // Ejercicio 2
    public static void ej2(){
        int x;
        Scanner leer = new Scanner (System.in);
        System.out.println("Introduzca una calificación numerica ");
        x = leer.nextInt();
        System.out.println("Califcación introducida:" +x );
        
        if (x >= 90){ 
            System.out.println("La calificación es: A Excelente");     
        } else if (x >=80 && x<=89 ) {
            System.out.println("La calificación es: B Bueno");
        } else if (x>=70 ) {
            System.out.println("La calificación es: C Regular");
        }  else {
            System.out.println("La calificaión es: F Mal");
        }
    }
    // Ejercicio 3
    public static void ej3 (){
        int i = 0;       
        String[] dias = {"Domingo", "Lunes", "Martes", "Miercoles","Jueves", "Viernes","Sàbado"};         
               
         while (i <dias.length) {
         System.out.println(dias[i]);
         i++;
    }
    }
    //Ejercicio 4
    public static void ej4 () {
       int randomNum = (int)(Math.random() * 101);
        //System.out.println(randomNum);
       
        
        Scanner sc = new Scanner(System.in);      
       int numeroUsuario;
       int numeroIntentos = 0;
       do {
            System.out.println("Intenta adivinar el número que he pensado. Ingresa tu numero:  ");
            numeroUsuario = sc.nextInt();
           numeroIntentos ++;
            if (randomNum > numeroUsuario) {
                System.out.println("El número que he pensado es mayor que el introducido");
            } else if (randomNum < numeroUsuario) {
                System.out.println("El número que he pensado es menor que el introducido");
            }
        } while (randomNum != numeroUsuario); {
       System.out.println(" 🎉Felicidades🎉 ");
       System.out.println("Has adivinado  en :" +numeroIntentos+ "  Intentos");
     }
}
    
        public static void main(String[] args) {
       // ej1(); 
       // ej2();
       //ej3();
       
        }
}

       
       


    
        
        
        




