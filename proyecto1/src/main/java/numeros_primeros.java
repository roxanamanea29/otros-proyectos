
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class numeros_primeros {

    public static void main(String[] args) {
        //variables 
        int n, suma = 0;
        Scanner entrada = new Scanner(System.in);

        //datos
        System.out.println("Valor de N.");
        n = entrada.nextInt();

        //proceso
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
              suma = n * (n + 1) / 2;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                suma += i;
            }
          
            
        }
        //reporte
            System.out.println("\n Reporte:");
            System.out.println("Valoe de N: " + n);
            System.out.println("Suma de los números primos hasta  "+ n +": " +suma);
    }
}
