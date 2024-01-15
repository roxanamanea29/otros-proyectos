
import java.util.Scanner;

public class CALCULADORA_suma_resta_DO_WHILE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Calculadora");
            System.out.println("-------------------");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Salir");
            System.out.println("Selecione una opción");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacion("Suma", entrada);
                    break;
                case 2:
                    realizarOperacion("Resta", entrada);
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no valida. Intentelo de nuevo.");
                    break;
            }
        } while (opcion != 3);

        entrada.close();
     
    }
  

    public static void realizarOperacion(String operacion, Scanner entrada) {

        System.out.println("Ingresa el primer número: ");
        int numero1 = entrada.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int numero2 = entrada.nextInt();
        int resultado = 0;
        switch (operacion) {
            case "Suma":
                resultado = numero1 + numero2;
                break;
            case "Resta":
                resultado = numero1 - numero2;
                break;
           
        }
       
     System.out.println("Resultado de la " + operacion + " es: "+resultado); 
    }
}
