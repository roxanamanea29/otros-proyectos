/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author roxanamanea
 */
public class Pez extends Animal {

    private String agua;

    public Pez(String comida) {
        super(comida);
        this.agua= agua;
    }

    public void nadar() {
        System.out.println("Nadando");
       
    }

    public void beber(String agua) {
        System.out.println("Bebiendo " + agua);
    }

    /**
     * @return the agua
     */
    public String getAgua() {
        return agua;
    }

    /**
     * @param agua the agua to set
     */
    public void setAgua(String agua) {
        this.agua = agua;
    }
}
