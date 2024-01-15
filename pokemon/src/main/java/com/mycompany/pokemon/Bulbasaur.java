
package com.mycompany.pokemon;

/**
 *
 * @author roxanamanea
 */
public class Bulbasaur extends pokemon implements iPlanta{

    public Bulbasaur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("Hola, soy Bulbasaur y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Hola, soy Bulbasaur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Paralizar");
    }
   
    
   
}
