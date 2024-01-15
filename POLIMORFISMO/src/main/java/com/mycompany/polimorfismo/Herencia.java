
package com.mycompany.polimorfismo;

public class Herencia {
    public static void main(String[] args) {
     Persona vector[] = new Persona[5];
    vector[0] = new Persona();
    vector[1] = new Empleado();
    vector[2] = new Consultor();
    vector[3] = new jefe();
    
    Persona pers = new Persona();
    Consultor cons= new Consultor();
    
    pers = cons;
    
    }
}


