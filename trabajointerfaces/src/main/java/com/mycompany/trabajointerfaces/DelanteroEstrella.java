
package com.mycompany.trabajointerfaces;

public class DelanteroEstrella extends Jugador implements iDelantero {// creamos la clase pubilca DelanteroEstrella que hereda de jugador e implementa de la inteface iDelanteroEstrella

    public DelanteroEstrella() {//creamso el constructor de DelanteroEstrella
    }
   
    @Override
    protected void correr() { //hereda el método correr de la clase Jugador
        System.out.println("Soy delantero y mi abilidad es correr ⚽️");   
    }

    @Override
    protected void pasarBalon() { //hereda el método pasarBalón de la clase Jugador
        System.out.println("Soy delantero y mi abilidad es pasar el balón ⚽️");   
    }

    @Override
    protected void hacerGol() { //hereda el método hacerGol de la clase Jugador
 System.out.println("Soy delantero y mi abilidad es hacer Gol ⚽️ ");       }

    @Override
    public void rematar()  { //implemento el método rematar de la interfaz iDelanteroEstrella
         System.out.println("Soy Delantero Estrella y estoy atacando con un remate potente ");   
    }

    @Override
    public void hacerRegate() { //implemento el método hacerRegate de la interfaz iDelanteroEstrella
         System.out.println("Soy delantero y mi abilidad es hacer regate");   
    }

    @Override
    public void definirGol() { //implemento el método definirGol de la interfaz iDelanteroEstrella
         System.out.println("Soy delantero y mi abilidad es definir gol ⚽️");   
    }
    
}
