/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author roxanamanea
 */
public class Animal {

    private  String comida;

    public void comer(String comida) {
        System.out.println("El animal esta comiendo "+comida);
    }

    public Animal(String comida) {
        System.out.println("Comiendo " + comida);
    }
}
