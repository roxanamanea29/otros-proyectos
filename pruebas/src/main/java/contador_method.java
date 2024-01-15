
import java.util.Scanner;

public class contador_method {

    static double sumaMethodInt(double num1,double num2) {
        return num1 + num2;
    }

    static double restaMethodInt(double num1,double num2) {
        return num1 - num2;
    }

    static double multiMethodInt(double num1,double num2) {
        return num1 * num2;
    }

    static double diviMethodDouble(double num1,double num2) {
        if(num2 != 0){
            System.out.println("El resultado es: "+ (num1 / num2));
        } else{
            System.out.println("Error,división  por cero.");
        }
        return (num1/num2);
    }
    static double residuoMethodDouble(double num1, double num2){
         if(num2 !=0) {
            System.out.println("El resultado es: "+ (num1 % num2));
        } else{
            System.out.println("Error,división  por cero.");
        }
         return (num1 % num2);
    }
   

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String operacion = null;
        System.out.println("Intriduce el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Introduce el signo aritmetico: "+" +"+" -"+" *"+" /"+" %");
        operacion =entrada.next();
        System.out.println("Introduce el segundo numero");
        num2 = entrada.nextInt();

        switch (operacion) {
            case "+":
                System.out.println("La suma es: " + sumaMethodInt(num1, num2));
                break;
            case "-":
                System.out.println("La resta es: " + restaMethodInt(num1, num2));
                 break;
            case "*":
                System.out.println("La multiplicacion es: " + multiMethodInt(num1, num2));
                 break;
            case "/":
                System.out.println("La division es: " + diviMethodDouble(num1, num2));
                 break;
            case"%":
                System.out.println("El residuo es: "+residuoMethodDouble( num1, num2));
                 break;
            default:
                System.out.println("Opcion no valida");
            
                 
        }
        
    }

}
