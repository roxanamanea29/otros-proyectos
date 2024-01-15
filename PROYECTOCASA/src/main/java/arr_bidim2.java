/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class arr_bidim2 {
    public static void main(String[] args) {
           
        int [][]matrix ={
            {10,15,18,4,21},
            {5,25,14,52},
            {45,65,86,97},
            {43,52,65,78},
        };
      
        for(int []fila:matrix){
            System.out.println();//para que de un espacio de linea entre los arrays
          for(int z:fila){
              System.out.print(z + " ");
          }
        }  
    
    }
}
