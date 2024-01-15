                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class condicional {
   /* public static void main(String[] args) {
        Scanner entra = new Scanner (System.in) ;
        int numUser,numSis;
        numSis = (int)(Math.random()*10);
        System.out.println("Ingresa un numero igual o mayor a "+numSis+":");
        numUser= entra.nextInt();
        if (numUser >= numSis){
        System.out.println("Muy bien");
    } else {
            System.out.println("Muy mal ");
                }*/
    public static void main(String[] args) {
        int j=1;
        for(int i=0; i<5; i++) {   
         switch (i){
            case 0:
            case 2:
                j= j+i;
              break;
            case 1:
                j= j*i;
            case 3: 
                j= j-i;
              break;
            default:
                j= i/j;}       }
         System.out.println(j);   
        }
        
    }
    
    
    

