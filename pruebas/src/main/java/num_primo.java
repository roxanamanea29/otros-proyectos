
import java.util.Scanner;

public class num_primo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para averiguar si es un número primo.");
        int num = entrada.nextInt();
        boolean esPrimo = true;
          
            if (num <= 1) {

                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                System.out.println(num + " es número primo");
            } else {
                System.out.println(num + " no es numero primo");
            }
        }

    }

