/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author roxanamanea
 */
public class Conejo extends Animal {

    private double correr;
    private double saltar;

    public Conejo(String comida) {
        super(comida);
    }

    public double correr(int velocidad) {
        System.out.println("Corriendo a " + velocidad + "km/h");
        return 0.0;
    }

    public double saltar() {
        System.out.println("Salteando");
        return 0.0;
    }

    /**
     * @return the correr
     */
    public double getCorrer() {
        return correr;
    }

    /**
     * @param correr the correr to set
     */
    public void setCorrer(double correr) {
        this.correr = correr;
    }

    /**
     * @return the saltar
     */
    public double getSaltar() {
        return saltar;
    }

    /**
     * @param saltar the saltar to set
     */
    public void setSaltar(double saltar) {
        this.saltar = saltar;
    }
}
