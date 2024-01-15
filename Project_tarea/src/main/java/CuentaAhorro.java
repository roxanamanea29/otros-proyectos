/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class CuentaAhorro extends CuentaBancaria {
    private double interes = 4;
    private double limiteRetirosMensuales = 1;
    private double retirosMensualesRealizados = 0;

    public CuentaAhorro(int numeroDeCuenta, String titular, double saldo) {
        super(numeroDeCuenta, titular, saldo);
    }
    
    public void ingresarDinero(double valor) {
        double cantidadASumar = valor * this.interes / 100.0;
        double nuevoValor = valor + cantidadASumar;
                
        
        this.setSaldo(this.getSaldo() + nuevoValor);
    } 
    
        
    public void retirarDinero(double valor) {
        double nuevoSaldo = this.getSaldo() - valor;
        
        if (this.limiteRetirosMensuales ==  this.retirosMensualesRealizados) {
            System.out.println("Has alcanzado el limite de retiros mensuales");
        }
        
        
       retirosMensualesRealizados++;
       this.setSaldo(nuevoSaldo);
    }

}



