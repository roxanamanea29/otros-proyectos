
import java.util.Scanner;


public class adivinapar_suma {
    public static void main(String[] args) {
        //variables
        System.out.println("Hola");
        System.out.println("Tvoy a averiguar si el núero que has introducido es o no par");
        Scanner scan = new Scanner(System.in);
        int numeroUsuario = 0;
       int suma =0;
       //datos
        System.out.println("Introduce un número.");
        numeroUsuario = scan.nextInt();
       //proceso
     if ( numeroUsuario%2==0) { System.out.println("YEl número introducido es par.");
  } else { System.out.println("El número introducido no es par");
}
     for(int i=2;i<=numeroUsuario;i+=2){
         suma+=i;
     }
        System.out.println("La suma de todos los numeros pares hasta el número introducido es: "+ numeroUsuario + " es: "+ suma);
     
    }
}
