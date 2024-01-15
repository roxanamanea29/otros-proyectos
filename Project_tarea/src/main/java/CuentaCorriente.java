

public class CuentaCorriente extends CuentaBancaria {
    private double tarifa = 4;
    private double limite = -50;    

    public CuentaCorriente(int numeroDeCuenta, String titular, double saldo) {
        super(numeroDeCuenta, titular, saldo);
    }
    
    
    @Override
    public void ingresarDinero(double valor) {
        double cantidadARestar = valor * this.tarifa / 100.0;
        double nuevoValor = valor - cantidadARestar;
                
        
        this.setSaldo(this.getSaldo() + nuevoValor);
    }
    
    @Override    
    public void retirarDinero(double valor) {
        double nuevoSaldo = this.getSaldo() - valor;
        
        if (nuevoSaldo < this.limite) {
            System.out.println("No tienes saldo suficiente: " + this.getSaldo() + "quieres retirar: " + valor);
        }
        
       this.setSaldo(nuevoSaldo);
    }
}