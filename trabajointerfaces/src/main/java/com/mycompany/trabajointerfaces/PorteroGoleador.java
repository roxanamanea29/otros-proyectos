
package com.mycompany.trabajointerfaces;


public class PorteroGoleador extends Jugador implements iPortero { // creamos la clase pubilca PorteroGleador que hereda de jugador e implementa de la inteface iPorteroGoleador

    public PorteroGoleador() {//creamso el constructor de PorteroGoleador
    }

    @Override
    protected void correr() { //hereda el método correr de la clase Jugador
        System.out.println("Soy portero y mi abilidad es correr "); 
    }

    @Override
    protected void pasarBalon() { //hereda  el método pasarBalón de la clase Jugador
        System.out.println("Soy portero y mi abilidad es pasar balón "); 
    }

    @Override
    protected void hacerGol() { //hereda el método hacerGol de la clase Jugador
        System.out.println("Soy portero y mi abilidad es hacer Gol "); 

    }

    @Override
    public void atajarBalon() { //implemento el método atajarBalón de la interfaz iPorteroGloeador
        System.out.println("Soy portero y mi abilidad es atajar Balón"); 

    }

    @Override
    public void despejarCentro() { //implemento el método despejarCentro de la interfaz iPorteroGloeador
        System.out.println("Soy Portero Goleador y mi abilidad es despejar centro"); 
    }

    @Override
    public void sacarPorteria() { //implemento el método sacarPortería de la interfaz iPorteroGloeador
        System.out.println("Soy Portero Goleador y estoy despejando con precisión"); 

    }
    
}
