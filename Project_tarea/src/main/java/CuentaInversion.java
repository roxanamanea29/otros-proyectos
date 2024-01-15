/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class CuentaInversion extends CuentaBancaria {

    private double inversionInicial;
    private double tasaInteresMensual = 0.03;
    private double tasaIntereesMensual;
   

    public CuentaInversion(int numeroDeCuenta, String titular, double saldo) {
        super(numeroDeCuenta, titular, saldo);
    }
   
    public void ingresarDinero(double valor){
         double cantidadASumar = valor * this.tasaIntereesMensual/100.0;
         double nuevoValor = valor +cantidadASumar;
         this.setSaldo(this.getSaldo() + nuevoValor);

    }   
     public void calcularIntersMensual(int meses) {
        for (int mes = 1; mes <= meses; mes++) {
            double beneficioMensual = saldo * tasaInteresMensual;
            saldo += beneficioMensual;

            System.out.println("Mes " + mes + ":Saldo = " + saldo + "euros");

        }
    }

}
