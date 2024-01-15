
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class num_primo_fibonaci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numUsuario = 0;
        int es_primo;
        System.out.println("Ingresa un número.");
        numUsuario = entrada.nextInt();

        //primo
        boolean esPrimo = true;

        if (numUsuario <= 1) {
            esPrimo = false;
        } else {

            for (int i = 2; i <= Math.sqrt(numUsuario); i++) {
                if (numUsuario % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

        }
        if (esPrimo = true) {
            System.out.println(numUsuario + "  es primo ");
        } else {
            System.out.println(numUsuario + " no es un número primo");
        }

        //fibonacci 
        int n = 10;
        long[] fibonacci = new long[n];
        //inicializamos los rieros dos numeros de Fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        // calculamos los numeros de Fibonaccirestantes
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Los primeros " + n + "numeros de Fibonaci son:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i] + " ");

            //par
            if (numUsuario % 2 == 0) {
                System.out.println("Es un núñmero par.");
            } else {
                System.out.println("Es un número impar.");

            }

        }
    }
}
