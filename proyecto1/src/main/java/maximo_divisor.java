
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class maximo_divisor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = entrada.nextInt();
        int mcd = encontrarMCD(num1, num2);
        System.out.println("el resultado es: " + mcd);
    }

    static int encontrarMCD(int num1, int num2){

    while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
       return num1;
    }
}
