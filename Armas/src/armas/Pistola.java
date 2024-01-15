/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armas;

/**
 *
 * @author roxanamanea
 */
public class Pistola extends Armas{
    double calibre;

    public Pistola(int numBalas) {
        super(numBalas);
        this.calibre=calibre;
    }
    public void calibre (double calibre){
        System.out.println("El calibre es: "+ calibre);
       
    }
    
}
