
import java.util.Scanner;

public class Adivar_numero_do_w {

    public static void main(String[] args) {

        int randomNum = (int) (Math.random() * 100);
        int numeroAAdivinar = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduzca un número para adivinar en que numero estoy pensando");
            numeroAAdivinar = entrada.nextInt();
            if (numeroAAdivinar < randomNum) {
                System.out.println("El número que has introducido es menor que el número en que estoy pensando ");
            } else if (numeroAAdivinar > randomNum) {
                System.out.println("El número que has introducido es mayor que el número en que estoy pensando");
            } else {
                System.out.println("Has acertado. Felicidades!");
            }

        } while (numeroAAdivinar != randomNum);
    }
}
