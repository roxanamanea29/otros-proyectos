
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class serie_fibonacci {

    public static void main(String[] args) {
        //variabled
        int n;//numero de terminos
        int a;//primer termino
        int b;//segundo termino
        int c;//termino que sigue
        String serie;
        Scanner entrada = new Scanner(System.in);
        //datos
        System.out.println("Valor de n: ");
        n = entrada.nextInt();
        //proceso
        switch (n) {
            case 1:
                serie = "0";
                break;
            case 2:
                serie = "0 1";
                break;
            default:
                serie = "0 1";
                a = 0;
                b = 1;

                for (int i = 3; i <= n; i++) {
                    c = a + b;
                    serie += " " + c;
                    a = b;
                    b = c;
                }
                break;
        }
        //reporte
        System.out.println("La serie de Fibonacci: " + serie);
    }
}
