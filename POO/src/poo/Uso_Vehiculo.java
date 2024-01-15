/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author roxanamanea
 */
public class Uso_Vehiculo {

    public static void main(String[] args) {
        Coche micoche1 = new Coche();

        Furgoneta miFurgoneta1 = new Furgoneta(7, 508);

        miFurgoneta1.establece_color("Azul");

        miFurgoneta1.configura_asientos("si");

        miFurgoneta1.configura_climatizador("si");

        System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
        
        System.out.println(miFurgoneta1.dime_datos_generales() + " " + miFurgoneta1.dimeDatosFurgoneta());

        
    }

}
