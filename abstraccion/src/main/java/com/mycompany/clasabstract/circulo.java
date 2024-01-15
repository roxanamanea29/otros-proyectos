
package com.mycompany.clasabstract;


public class circulo implements Figura,rotable,dibijable {

    private double radio;
     
    public circulo(){
    }
    public circulo (double radio){
    this.radio=radio;
}
    
    @Override
    public double calcularArea() {
    double pi =3.14;
    double resultado =pi*radio*radio;
    return resultado;

    }

    @Override
    public void rotar() {
         System.out.println("Hola, estouy dibujando un círculo");
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy rotando mi circulo");
    }

  
}
 