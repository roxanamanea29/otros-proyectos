
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class numero_primo {

    public static void main(String[] args) {
        //variables
        int numero;
        String mensaje;
        Scanner entrada = new Scanner(System.in);
        //datos
        System.out.println("Ingrese número:");
        numero = entrada.nextInt();
        //proceso
        mensaje = "Este número es un número primo.";
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                mensaje = "Este número no es un número primo.";
                break;
            }
        }
        //reporte
        System.out.println("Mensaje: " + mensaje);
    }
}
