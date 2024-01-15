
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class suma_de_3num {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Introduzca el primer número");
        int a = ent.nextInt();
        System.out.println("Introduzca el segundo número");
        int b = ent.nextInt();
        System.out.println("Introduzca el tercer número");
        int c = ent.nextInt();
        ent.close();
        int result1 = a + b;
        int result2 = result1 + c;
        System.out.println("El total es de " + result2);
    }
}
