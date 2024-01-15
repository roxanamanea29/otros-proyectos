/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armas;

/**
 *
 * @author roxanamanea
 */
public class Tanque extends Armas {
    private int plazas;
    boolean blindaje;

    public Tanque(int numBalas) {
        super(numBalas);
        this.plazas= plazas;
        this.blindaje=blindaje;
    }
    public double plazas (int plazas){
        System.out.println("El número de plazas es "+ plazas);
        return plazas;
    }
    public boolean blindaje(boolean blindaje){
        System.out.println("Blindaje "+ blindaje);
        return blindaje;
    }

}
