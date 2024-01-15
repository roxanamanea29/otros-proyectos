/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class ArayNoRecomendado {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int nuevoTamaño = original.length + 1;
        int[] nuevo = new int[nuevoTamaño];

        for (int i = 0; i < original.length; i++) {
            nuevo[i] = original[i];
        }
        nuevo[nuevoTamaño - 1] = 6;
        System.out.print("Nuevo arreglo ");
        for (int i = 0; i < nuevo.length; i++) {
            System.out.println(nuevo[i] + " ");
        }
    }

}
