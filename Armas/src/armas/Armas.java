/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package armas;

/**
 *
 * @author roxanamanea
 */
public class Armas {

   private int numBalas;
   
   public void Balas(int numBalas){
       this.numBalas = numBalas; 
   }
   public Armas(int numBalas){
       System.out.println("Numero de balas "+ numBalas);
   }
}
