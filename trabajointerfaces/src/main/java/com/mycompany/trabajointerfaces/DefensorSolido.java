
package com.mycompany.trabajointerfaces;


public class DefensorSolido extends Jugador implements iDefensor {// creamos la clase pubilca DefensorSolido que hereda de jugador e implementa de la inteface iDefensor

    public DefensorSolido() { //creamso el constructor de DefensorSolido
    }

    @Override
    protected void correr() {//hereda el método correr de la clase Jugador
       System.out.println("Soy defensor y mi abilidad es correr ");   

    }

    @Override
    protected void pasarBalon() {//hereda el método pasarBalón de la clase Jugador
        System.out.println("Soy defensor y mi abilidad es pasar Balón ⚽️"); 
    }

    @Override
    protected void hacerGol() {//hereda el método hacerGol de la clase Jugador
        System.out.println("Soy defensor y mi abilidad es  hacer Gol ⚽️"); 
    }

    @Override
    public void cortarPase() {//implemento el método cortarPase de la interfaz iDefensor
        System.out.println("Soy defensor y mi abilidad es cortar Pase ⚽"); 
    }

    @Override
    public void despejarBalon() { //implemento el método despejarBalón de la interfaz iDefensor
        System.out.println("Soy defensor y mi abilidad es despejar Balón "); 
    }

    @Override
    public void marcarJugador() { //implemento el método marcasrJugador de la interfaz iDefensor
        System.out.println("Soy defensor y mi abilidad es marcar jugador"); 
    }   
}
