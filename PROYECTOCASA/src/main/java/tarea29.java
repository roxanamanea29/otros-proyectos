/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class tarea29 {
    public static void main(String[] args) {
       //definir EL arregol
        int [] arreglo ={1,2,3,4,2,5,2};
        //numero que queramos contae
        int numeroAContar =2;
        //inicializar el contador
        int contador =0;
        // recorrer el array y contar las ocurrencias le numero
        for(int  i=0; i< arreglo.length; i++){
            if (arreglo [i]==numeroAContar) {
                contador++;
            }
        }
         System.out.println("El numero "+ numeroAContar+ " aparece " +contador+" veces en el arreglo." );       
    }
}
