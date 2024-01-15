
import java.util.ArrayList;
import java.util.Scanner;

public class almacenFrutas {

    public static void main(String[] args) {
        //decallra un Arraylist de almacen frutas
        ArrayList<String> almacenFrutas = new ArrayList<>();
        String frutaIngresada;
        Scanner entrada = new Scanner(System.in);
        //pedimos al usuario que ingrese frutas
        do {
            System.out.println("Introduzca la fruta que quieres ingresar. si no escriba 1 para salir");
            
            frutaIngresada = entrada.nextLine();
             
            almacenFrutas.add(frutaIngresada);
        } while (!frutaIngresada.equals("1"));
        // Listamos el array de frutas
        System.out.println("Las frutas del almacen son: \n" + almacenFrutas);
        // Pedimos al usuario que introduzca la fruta que quiere eliminar del Array 

        System.out.println("\n\nIntroduzca  el nombre del producto que quieres eliminar: " + almacenFrutas);
        String frutaParaEliminar = entrada.nextLine();
        //condición 
        if (almacenFrutas.contains(frutaParaEliminar)) {
            almacenFrutas.remove(frutaParaEliminar);
            System.out.println("Fruta eliminada. La nueva lista es: " + almacenFrutas);
        } else {
            System.out.println("El indice intorducido está fuera de rango.");
        }
    }
}
