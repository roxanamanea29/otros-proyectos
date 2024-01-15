/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class USO_ARRAYS {

    public static void main(String[] args) {
        //variables
        /*int[] mi_matriz = new int[5];//esta variate o la de abajo son diferntes tipos de escribir lo mismo

        mi_matriz[0] = 5;
        mi_matriz[1] = 38;
        mi_matriz[2] = -15;
        mi_matriz[3] = 92;
        mi_matriz[1] = 71;*/
        int[]mi_matriz ={5, 38, -15, 92, 71, 56, 85, 65, 25, 14, 78, 65, 45, 34, 24,};

        for (int i = 0; i<mi_matriz.length; i++) {
            System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
        }
    }
}
