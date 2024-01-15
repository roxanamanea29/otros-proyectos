
import java.util.Scanner;


public class s {
    static void checkAge(int age) {
        if (age<18){
            System.out.println("Acceso denegado!");
        }else{
            System.out.println("Acceso permitido!");
        }
    }
    
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
        System.out.println("Binevenid@\n\nIngresa tu edad");
       int age = entrada.nextInt();
        System.out.println("Tu edad es: "+ age);
       
        checkAge(age);
    }
   
}
