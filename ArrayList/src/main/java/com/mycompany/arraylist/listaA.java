package com.mycompany.arraylist;


import java.util.ArrayList;

public class listaA {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        Persona persona1 = new Persona(1, "Roxi", 35);
        lista.add(new Persona(1, "RoxiDeLista", 5));
        // recorrer por indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        System.out.println("---foreach---");
        for (Persona pers : lista) {
            System.out.println("Prueba: " + pers.getNombre());
        }
    }
}
