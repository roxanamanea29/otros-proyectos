/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class ejemplofibonacci {
    public static void main(String[] args) {
        
        int n = 10;
        long[] fibonacci = new long [n];
        //inicializamos los rieros dos numeros de Fibonacci
        fibonacci [0] = 0;
        fibonacci [1] = 1;
        // calculamos los numeros de Fibonaccirestantes
        for (int i = 2; i < n; i++) {
        fibonacci [i] = fibonacci[i - 1] + fibonacci [i - 2];
    }
        System.out.println("Los primeros " + n + "numeros de Fibonaci son:");
        for (int i=0; i<n; i++) {
            System.out.print(fibonacci[i] + " ");
        
    }
    }
}
