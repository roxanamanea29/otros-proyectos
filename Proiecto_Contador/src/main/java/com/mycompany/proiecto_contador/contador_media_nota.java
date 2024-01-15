package com.mycompany.proiecto_contador;


import java.util.Scanner;

public class contador_media_nota {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        double [] notas = new double[5];
         
        for (int i = 0; i < notas.length; i++){
         System.out.println("Introduzca la nota en la posicion " + (i + 1) + ": ");
       
         notas[i]= lectura.nextDouble();
     }
         double notaMedia = 0.0;
         for (int i = 0; i < notas.length; i++) {
             notaMedia += notas[i];
         }
         notaMedia /= notas.length;
         
         String calificacion;
       if (notaMedia>0 && notaMedia <5){
           calificacion = "Suspenso";
       } else if (notaMedia >=5 && notaMedia<7) {
           calificacion = "aprobado";
       } else if (notaMedia >=7 && notaMedia <9)
       { calificacion ="Notable";
       } else if (notaMedia >9 && notaMedia <=10) {
           calificacion = "Excelente";
      } else {
           calificacion = "Nota fuera de rango";
      }
        System.out.println("Su nota es" + notaMedia);
        System.out.println("Calificaion" +calificacion);
    }
}
    







