/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author roxanamanea
 */
public class pruebas {

    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Paco");

        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("Roxana");
        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos()+ "\n"+ trabajador2.devuelveDatos()
               + "\n"+trabajador2.devuelveDatos()+"\n"+trabajador4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());

    }
}

class Empleados {

    public void cambiaSeccion(String seccion) {//setter
        this.seccion = seccion; 
    }

    public void cambiaNombre(String nombre) {
        this.nombre = nombre;
    }

    public String devuelveDatos() {
        return "El nombre es: " + nombre + " y la sección es: " + seccion + " y el Id es: " + Id;
    }
    public static String dameIdSiguiente (){ 
     return "El Id siguiente es: "+ IdSiguiente;
}

    private String nombre;

    private String seccion;

    private int Id;
    private static int IdSiguiente = 1;

    public Empleados(String nom, int Id) {

        this(nom);

    }

    public Empleados(String nom) {
        nombre = nom;
        seccion = "Administración";
        Id = IdSiguiente;
        IdSiguiente++;
    }

}
