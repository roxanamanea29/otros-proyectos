
package n;

import java.util.Scanner;

public class numeropar {
    public static void main(String[] args) {
        int numero;
        
        Scanner num = new Scanner(System.in);
        System.out.println("introduzca numero");
        numero = num.nextInt();
        if (numero %2 == 0){
            System.out.println(numero + " es par");
        }else {
            System.out.println(numero + " es impar");
        }
           
    }
   
}
