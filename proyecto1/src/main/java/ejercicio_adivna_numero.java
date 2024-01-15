
import java.util.Scanner;





public class ejercicio_adivna_numero {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int numeroAdivinar = 7;
        int numero;
        do {
            System.out.println("ingresa un número para adivinar ");
            numero=entrada.nextInt();         
        }while (numero != numeroAdivinar);
                System.out.println("Felicidades! Has adivinado");
    }
}
