
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class Fol {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);//creamso el escaner para lee el mesaje introudcido por pantalla
        double salarioBase;// declaramos una vaiable de tipo double llamadsa salarioBase;
        double antiguedad;// declaramos una vaiable de tipo double llamada antiguedad;
        double plusDeConvenio;// declaramos una vaiable de tipo double llamada plus De Convenio;
        double numeroDeHorasExtras;// declaramos una vaiable de tipo double llamada número de horas extras;
        double importeDeHorasExtras;// declaramos una vaiable de tipo double llamada importe de horas extras;
        double BaseCotizacionContingenciasCom;// declaramos una vaiable de tipo double llamadabase de cotizacion de contigencias comunes;
        double BaseCotizacionContingenciasProfecionales;// declaramos una vaiable de tipo double llamadabase de cotizacion de contigencias profecionales;
        System.out.println("Introduzca el salario base"); //se pide en pantalla que se introduzca el salario base
        salarioBase = ent.nextDouble();//se guarda en la ent.  el  número introducidopor teclado por el usuario
        System.out.println("Introduzca la antigÜedad");//se pide en pantalla que se introduzca la antiguedad
        antiguedad = ent.nextDouble();//se guarda en la ent.  el  número introducidopor teclado por el usuario
        System.out.println("Introduzca el plus de Convenio");//se pide en pantalla que se introduzca el plus de convenio
        plusDeConvenio = ent.nextDouble();//se guarda en la ent.  el  número introducidopor teclado por el usuario
        System.out.println("Introduzca el número de horas extras");//se pide en pantalla que se introduzca el nnumero de horas extras
        numeroDeHorasExtras = ent.nextDouble();//se guarda en la ent.  el  número introducidopor teclado por el usuario
        System.out.println("Introduzca el importe de horas extras ");//se pide en pantalla que se introduzca el imporgte de horas extras
        importeDeHorasExtras = ent.nextDouble();//se guarda en la ent.  el  número introducidopor teclado por el usuario
        BaseCotizacionContingenciasCom = salarioBase + antiguedad + plusDeConvenio + 2 * (salarioBase + antiguedad) / 12;// la formula de BaseCotizacionContingenciasComunes
        BaseCotizacionContingenciasProfecionales = salarioBase + antiguedad + plusDeConvenio + 2 * (salarioBase + antiguedad) / 12 + (numeroDeHorasExtras * importeDeHorasExtras);//BaseCotizacionContingenciasProfecionales
        System.out.println("BCCC: " + BaseCotizacionContingenciasCom);// se imprime por pantalla el resulatdo de BaseCotizacionContingenciasComunes
        System.out.println("BCCP: " + BaseCotizacionContingenciasProfecionales);// se imprime por pantalla el resulatdo de BaseCotizacionContingenciasProfecionales
    }
}
