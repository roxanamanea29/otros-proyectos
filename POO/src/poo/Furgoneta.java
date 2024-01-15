/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author roxanamanea
 */
public class Furgoneta extends Coche {
    
    private int capacidad_carga;
   
    private int plazas_extra;
    
    public Furgoneta(int plazas_extra, int capacidad_carga){
        
        super(); //llamar al constructor de la clase psdre
        
        
        this.capacidad_carga=capacidad_carga;
        
        this.plazas_extra=plazas_extra;
        
        
    }
    
    
    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es: "+ capacidad_carga + " y las plazas_extra"+ plazas_extra;
    }
    
  
    
    
    
}
