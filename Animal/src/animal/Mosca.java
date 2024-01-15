/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author roxanamanea
 */
public class Mosca extends Animal {

    private int largo;

    public Mosca(String comida) {
        super(comida);
        System.out.println("La mosca come "+ comida);
    }

    public void volar(int largo) {
        System.out.println("Vloando " + largo + "metros.");
    }

    public void mirar() {
        System.out.println("Mirando");
    }

    /**
     * @return the largo
     */
    public int getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

}
