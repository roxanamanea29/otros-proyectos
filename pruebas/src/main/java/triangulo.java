
import java.util.Scanner;

/**
 *
 * @author roxanamanea
 */
public class triangulo {
    public static void main(String[] args){
        var scan = new Scanner(System.in);
        double base, altura;
        System.out.println("Introduce la base del trinágulo");
        base = scan.nextDouble();
        System.out.println("Introduce la altura del triangulo");
        altura = scan.nextDouble();
        double area;
        area= base*altura/2;
        System.out.print(area);
    }
}

  
        
   

   
   
