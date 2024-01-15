
import java.util.Scanner;

public class do_while_ej {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int numero;
        System.out.println("Ingresa números y yo te los voy sumando");
        do {
            System.out.println("Ingrese un número(ingrese 0 para salir)");
            numero =entrada.nextInt();
            suma +=numero;
        }while(numero !=0);
        System.out.println("La suma de los números ingresado es: " + suma);
    }
} 
