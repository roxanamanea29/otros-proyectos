
import java.util.Scanner;

public class adiva_num {

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 100);

        Scanner entrada = new Scanner(System.in);
        int intentos = 0;
        int num = 0;

        do {
            intentos++;
            System.out.println("introduce un número por favor");
            num = entrada.nextInt();
            if (aleatorio > num) {
                System.out.println("Más alto");
            } else if (aleatorio < num) {
                System.out.println("Más bajo");
            }

        } while (num != aleatorio);
        System.out.println("has acertado.Lo has concedido en: " + intentos + " intentos. Felicidades ");

    }
}
