/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cont;

import javax.swing.JOptionPane;

/**
 *
 * @author roxanamanea
 */
public class Uso_bulce_for {
    public static void main(String[] args) {
        Long resultado =1L;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        for(int i=numero; i>0; i--){
            resultado = resultado *i;
        }
        System.out.println("El factorial de  "+ numero + " es "+ resultado);
    }
    
}
