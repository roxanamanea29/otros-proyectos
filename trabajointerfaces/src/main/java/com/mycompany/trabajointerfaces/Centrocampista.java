
package com.mycompany.trabajointerfaces;

public class Centrocampista extends Jugador implements iCentrocampista { // creamos la clase pubilca Centro_campista que hereda de jugador e implementa de la inteface iCentroCampista

    public Centrocampista() { //creamso el constructor de Centrocampista
    }

    @Override
    protected void correr() { //hereda el método correr de la clase Jugador
         System.out.println("Soy centrocampista y mi abilidad es correr");   
    }
    @Override
    protected void pasarBalon() {//hereda el método pasarBalón de la clase Jugador
         System.out.println("Soy centro campista y mi abilidad es pasar balón ⚽️♂️");   
    }

    @Override
    protected void hacerGol() {//hereda el método hacerGol de la clase Jugador
                 System.out.println("Soy centro campista y mi abilidad es hacer Gol ⚽️ ");   

    }

    @Override
    public void recuperarBalon() {//implemento el método recuperarBalón de la interfaz iCentroCampista
                 System.out.println("Soy centro campista y mi abilidad es recuperar el balón ⚽️ ");   

    }

    @Override
    public void crearJuego() {//implemento el método crearJuego de la interfaz iCentroCampista
                 System.out.println("Soy centro campista y soy especialozado en crear oprtunidades de gol ⚽️ ");   

    }

    @Override
    public void darAsistencia() {//implemento el método darAsistencia de la interfaz iCentroCampista
                 System.out.println("Soy centro campista y mi abilidad es dar asistencia  ");   

    }
    
    
}
