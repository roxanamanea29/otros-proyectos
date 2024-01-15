
package com.mycompany.pokemon;


public class Pikachu extends pokemon implements iElectrico  {

    public Pikachu() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
       System.out.println("Hola, soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("Hola, soy Pikachu y este es mi ataque Arañazo");

    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Hola, soy Pikachu y este es mi ataque Mordisco");

    }

    @Override
    public void atacarImpactrueno() {
       System.out.println("Hola, soy Pikachu y este es mi ataque Impactruenos");
    }

    @Override
    public void atacarPunioTrueno() {
       System.out.println("Hola, soy Pikachu y este es mi ataque PunioTruenos");
    }
    
}
