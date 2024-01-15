
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class men {
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("bienvenido\n Elija una opción del menú: ");
        System.out.println("1. agregar productos.");
        System.out.println("eliminar productos. ");   
        System.out.println("mostrar el inventario");
        switch (elejir) {
            case 1:
                this.agregarProdcuto();
                break;
            case 2:
                this.eliminarProducto();
                break;
            case 3:
                this.mostrarInventario();  
                break;
          default: 
          System.out.println("no ha leegido bien");
            
        }*/
        Scanner entrada = new Scanner (System.in);
        int n,m,total;
        System.out.println("introduzca  un numero n:");
         n = entrada.nextInt();
        System.out.println("introduzca otro numero m:");
         m = entrada.nextInt();
        total = n* m/(n-m);
        System.out.println("el resultado es: "+ total);
    }
  
           
}

