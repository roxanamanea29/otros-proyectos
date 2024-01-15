
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class adivina_dia_semana {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 7 para averigura el dia de la semana");
          int num = entrada.nextInt();
           
          String diaSemana = null;
        
            switch (num) {
                case 1:
                    diaSemana = "Domingo";
                    break;
                case 2:
                    diaSemana = "Lunes";
                    break;
                case 3:
                    diaSemana = "Martes";
                     break;
                case 4:
                    diaSemana = "Miercoles";
                     break;
                case 5:
                    diaSemana = "Jueves";
                     break;
                case 6:
                    diaSemana = "viernes";
                     break;
                case 7:
                    diaSemana = "Sábado";
                     break;
                default:
                    System.out.println("El número introducido es fuera de rango. Introduce un número de 1 al 7.");
                    break;                  
            }
           entrada.close();
            System.out.println("El día de la semana es: "+ diaSemana);
        }
}

