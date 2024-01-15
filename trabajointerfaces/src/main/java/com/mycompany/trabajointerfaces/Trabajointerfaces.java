

package com.mycompany.trabajointerfaces;


public class Trabajointerfaces {

    public static void main(String[] args) { //creamso la clase main llamada Trabajointerfaces donnde vamos a ejecutar las clases 
      DelanteroEstrella delantero = new DelanteroEstrella();//creamos el objeto delantero 
      Centrocampista centroCampista = new Centrocampista(); //creamos el objeto centroCampista
      DefensorSolido defensor = new DefensorSolido(); //creamos el objeto defensor
      PorteroGoleador portero = new PorteroGoleador(); //creamos el objeto portero
      
      // para cada objeto llamamos los metodos que le pertenece
      delantero.hacerGol(); 
      centroCampista.crearJuego();
      defensor.cortarPase();
      portero.atajarBalon();
      portero.sacarPorteria();
      delantero.rematar();
    }
}
