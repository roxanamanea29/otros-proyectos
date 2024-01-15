
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class sumaGeometrica {

    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);
        double primerTermino, razon, suma;
        int numTerminos;
        //datos
        System.out.println("Ingrese el primer término de la serie: ");
        primerTermino = entrada.nextDouble();

        System.out.println("Ingrese la razón de la serie: ");
        razon = entrada.nextDouble();

        System.out.println("Ingrese el número de términos a sumar: ");
        numTerminos = entrada.nextInt();
        // proceso
        suma = primerTermino * ((1 - Math.pow(razon, numTerminos)) / (1 - razon));

        // reporte
        System.out.println("La suma de la serie geométrica es: " + suma);
    }
}
