
package com.mycompany.clasabstract;


public class cuadrado implements Figura,dibijable{

    private double lado; 
    
   public cuadrado(){
   }
   
    public cuadrado(double lado){
        this.lado=lado;
    }
    
  
    
    @Override
    public double calcularArea() {
      double resultado =lado *lado;
      return resultado;
      
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujado un cuadrado.");
    }

  
    
}
