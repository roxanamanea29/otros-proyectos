
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class Ejercicio {

    public static void main(String[] args) {

        System.out.println("BIENVENID@ A TU BANCO DE CONFIANZA\n\n");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero de cuenta asignado");
        int numeroDeCuenta = (int) Math.random();

        System.out.println("Ingresa el nombre del titular: ");
        String titular = entrada.nextLine();

        System.out.println("Ingresa el saldo de la cuenta: ");
        double saldo = Double.parseDouble(entrada.nextLine());

        System.out.println("Selecciona la cuenta del banco sobre la que quieres realizar las operaciones");
        System.out.println("1. Cuenta Corriente");
        System.out.println("2. Cuenta Ahorro");
        System.out.println("3. Cuenta Inverción");
        System.out.println("Elija una opción: ");

        CuentaBancaria cuentaBancariaSeleccionada = null;

        int elegir = entrada.nextInt();
        switch (elegir) {
            case 1:
                cuentaBancariaSeleccionada = new CuentaCorriente(
                        numeroDeCuenta,
                        titular,
                        saldo
                );
                break;
            case 2:
                cuentaBancariaSeleccionada = new CuentaAhorro(
                        numeroDeCuenta,
                        titular,
                        saldo
                );
                break;
            case 3:
                cuentaBancariaSeleccionada = new CuentaInversion(
                        numeroDeCuenta,
                        titular,
                        saldo
                );
                break;
        }

        if (cuentaBancariaSeleccionada == null) {
            System.out.println("No has elegido una opción valida.");
        } else {
            int opcion = -1;

            while (opcion != 4) {
                System.out.println("¿Que quieres hacer?");
                System.out.println("1. Ingresar saldo.");
                System.out.println("2. Retirar saldo.");
                System.out.println("3. Ingresar inverción");
                System.out.println("4. Ver saldo.");
                System.out.println("5. Salir");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Saldo a ingresar: ");
                        int dinero = entrada.nextInt();
                        double dineroAIngresar = Double.valueOf(dinero);
                        cuentaBancariaSeleccionada.ingresarDinero(dineroAIngresar);
                        break;
                    case 2:
                        System.out.println("Saldo a retirar: ");
                        int dinero2 = entrada.nextInt();
                        double dineroARetirar = Double.valueOf(dinero2);
                        cuentaBancariaSeleccionada.ingresarDinero(dineroARetirar);
                        break;
                    case 3:
                        System.out.println("Ingresar inverción:" + cuentaBancariaSeleccionada.getSaldo());

                    case 4:
                        System.out.println("Saldo en la cuenta: " + cuentaBancariaSeleccionada.getSaldo());
                        break;
                    case 5:
                        System.out.println("Saldo en la cuenta: " + cuentaBancariaSeleccionada.getSaldo());
                        break;
                    default:
                        System.out.println("No has elegido una opción valida.");

                }
            }
        }

    }
}
