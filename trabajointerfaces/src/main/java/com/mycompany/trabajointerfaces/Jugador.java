
package com.mycompany.trabajointerfaces;


public abstract class Jugador { //creamos la clase padre Jugador de la cual heredaran las otras clases hijas
    //declaramos las siguientes vriables 
    protected String nombre; 
    protected int position;
    protected String equipo;
    protected int edad;
    protected int numeroCamiseta;
    //creamos las siguientes métodos que las va ha utilizar las clases hijas
    protected abstract void correr(); 
    protected abstract void pasarBalon();
    protected abstract void hacerGol();
    
}
