package tarea;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class ej_Invent {

    public static void main(String[] args) {
        Inventario llamarInventario = new Inventario();
        llamarInventario.menu();

    }
}

class Inventario {

    String inventario[] = new String[10];
    int cantidadProductos;

    Scanner entrada = new Scanner(System.in);

    public void menu() {
        System.out.println("Bienvenido\n¿Que quieres hacer?");
        System.out.println("1. Agregar productos.");
        System.out.println("2. Eliminar productos.");
        System.out.println("3. Mostrar el inventario.");
        int elegir = entrada.nextInt();
        switch (elegir) {
            case 1:
                this.agregarProducto();
                break;
            case 2:
                this.eliminarProducto();
                break;
            case 3:
                this.mostrarInventario();
                break;
            default:
                System.out.println("No has elegido una opción valida.");

        }
    }

    public void agregarProducto() {
        System.out.println("Introduzca producto: ");
        String producto = entrada.next();
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = producto;
        }  
      }

      if(proceed()==true){
          agregarProducto();
      }
      
    }
    public void eliminarProducto() {

        System.out.println("Introduzca el producto que queres elliminar: ");
        String producto = entrada.next();
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].equals(producto)) {
                inventario[i] = null;
                break;
            }
        }
        this.menu();
    }

    public void mostrarInventario() {
        System.out.println("El inventario es: ");
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] != null) {
                System.out.println(inventario[i]);
            }
        }
        this.menu();
    }
    public boolean proceed(){
      System.out.println("Quiere seguir agregando productos? S/N");
        if(entrada.nextLine().equalsIgnoreCase("S")){
            return true;
        }else{
            return false;
        }
    }
}
 class CuentaBancaria{
     int numeroDeCuenta;
     String titular;
     double saldo;
     //constructor
     //getter y setter de cada atributo
     //menu
    
}
 class CuentaCorriente extends CuentaBancaria{
      public double tarifa =5.00;
     
     //metodo publico que permita saldo hasta cierto limite
    
 }
class CuentaAhorro extends CuentaBancaria{
    //variable(double daca vrei) de interes ej 0.01 = 1%  0.10 = 10% 1 = 100%
    //por el saldo que tengo en la cuenta, cada mes me añades mi interes y ademas 
    //me creas un metodo que me permita solo un numero limitado(X) por mes  
}
class CuentaInversion extends CuentaBancaria{
    //una inversion cada mes me devuelve un % de beneficio
    // si te pide que sea aleatorio usa Math.Random
    //si es un interes fijo hazlo como en la cuenta ahorro 0.10 = 10% etc
    //aqui debo tener la posibilidad de invertir en varios activos
    //por ejemplo: oro,plata, RON, USD, EUR, etc
    //estaría bie que cada activo tuviese un interés diferente,
    //gen beneficiu % de RON sa nu fie acelasi cu cel de EUR
    
}

// como medimos el paso del tiempo??