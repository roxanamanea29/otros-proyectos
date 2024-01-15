
import java.util.Scanner;

class CalculadoraPolaca {

    public static void main(String[] args) {

        double num1;
        double num2;
        String operacion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Introduzca el primer número");
            num1 = entrada.nextDouble();

            System.out.println("Introduzca un signo aritmetico");
            operacion = entrada.next();
        
            System.out.println("Introduzca el segundo número");
            num2 = entrada.nextDouble();

            switch (operacion) {

                case "+":
                    realizarSuma(num1,num2);
                    break;
                case "-":
                    realizarResta(num1,num2);
                    break;
                case "*":
                    realizarMultiplicacion(num1,num2);
                    break;
                case "/":
                    realizarDivision(num1, num2);
                    break;
                case "%":
                    realizarResiduo(num1, num2);
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
            System.out.println("Quiere realizar otra operación?");
        } while (entrada.next().equalsIgnoreCase("S"));
        
    }

    private static void realizarSuma(double num1, double num2) {
        System.out.println("Resultado: " + (num1 + num2));
    }

    private static void realizarResta(double num1, double num2) {
        System.out.println("Resultado: " + (num1 - num2));
    }

    private static void realizarMultiplicacion(double num1, double num2) {
        System.out.println("Resultado: " + (num1 / num2));
    }

    private static void realizarResiduo(double num1, double num2) {
        if (num2 != 0) {
            System.out.println("Resultado: " + (num1 % num2));
        } else {
            System.out.println("Error división por cero.");
        }
    }

    private static void realizarDivision(double num1, double num2) {
        if (num2 != 0) {
            System.out.println("Resultado: " + (num1 / num2));
        } else {
     System.out.println("Error división por cero.");
    }
  }
}


