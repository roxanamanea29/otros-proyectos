
import java.util.Scanner;

public class comparacion_numeros {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        double numero1 =scanner.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        double numero2 =scanner.nextDouble();

        if (numero1 > numero2) {
        System.out.println("El primer numero ("+ numero1 + ") es mayor que el segundo");
        } else if (numero2 > numero1) {
        System.out.println("El segundo numero (" + numero2 + ") es mayor que el primero");
        } else {
        System.out.println("Ambos numeros son iguales");
        }
    }
}
    
