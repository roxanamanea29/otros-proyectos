
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class Combinatorio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c, factorA = 1, factorB = 1, factorC = 1;
        int combinatorio = 1;
        System.out.println("Introduce un número");//llamado para introducir un número
        a = entrada.nextInt();//el scanner lee el numero introducido por pantalla y lo guarda en la variable a
        System.out.println("Ha introducido " + a); // MONSTRANDO POR PANTALLA EL MENSAJE CON EL NÚMERO INTRODUCIDO +NÚMERO INTRODUCIDO
        System.out.println("Introduce otro número");// llamado para introducir otro número
        b = entrada.nextInt(); //el scanner lee el numero introducido por pantalla y lo guarda en la variable b
        System.out.println("Ha introducido " + a);//MONSTRANDO POR PANTALLA EL MENSAJE CON EL NÚMERO INTRODUCIDO +NÚMERO INTRODUCID0
        c = a - b;//c es el resultado de a-b;

        if (a < b) {// si a menor a b
            System.out.println("El primer número debe ser mayor o igual que el segundo");//leemos  por pantalla el mensaje
        } else {
            factorA = CalcualrFactorial(a); //entra en accion el metodo CalcularFactorial
            factorB = CalcualrFactorial(b);//entra en accion el metodo CalcularFactorial
            factorC = CalcualrFactorial(c);//entra en accion el metodo CalcularFactorial

//Calculamos el combinatorio
            combinatorio = factorA / (factorB * factorC); // a formula para calcular el combinatorio
            System.out.println("El combinatorio de " + a + " y " + b + " es " + combinatorio); //leemos el mensaje + el resultado de combinatorio

        }
    }

    private static int CalcualrFactorial(int num) {// metodo para calcular el factorial
        int factorial = 1;

        //Calculo el factorial de 
        for (int i = 1; i <= num; i++) {//condicion que se tiene que cumplir
         factorial= factorial * i;//la formula para calcular el factorial
        }
        return factorial;
    }
}
