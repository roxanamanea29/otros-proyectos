/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author roxanamanea
 */
public class Uso_Empleado {
    public static void main(String[] args) {
        
        /*Empleado empleado1= new Empleado("Paco Gomez", 85000, 1990,12,17);
        Empleado empleado2= new Empleado("Ana Lopez", 95000, 1995,06,02);
        Empleado empleado3= new Empleado("Roxana Manea ", 105000, 2000,01,12);
        
        
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        
        
        System.out.println("Nombre: "+ empleado1.dame_Nombre()+  "\nSueldo: "+empleado1.dame_sueldo()
        +"\nFecha de alta: "+ empleado1.dameFechaContrato());
        
        System.out.println("");
        System.out.println("Nombre: "+ empleado2.dame_Nombre()+  "\nnSueldo: "+empleado2.dame_sueldo()
        +"\nFecha de alta: "+ empleado2.dameFechaContrato());
        
        
        System.out.println("");
        System.out.println("Nombre: "+ empleado3.dame_Nombre()+  "\nnSueldo: "+empleado3.dame_sueldo()
        +"\nFecha de alta: "+ empleado3.dameFechaContrato());*/
        Jefatura jefeRRHH = new Jefatura("Roxana", 55000, 2012 ,9,25);
        
        jefeRRHH.estableceIncentivo(2570);
        
        
        
        Empleado[] misEmpleados = new Empleado[6];
        
        misEmpleados[0]= new Empleado("Paco Gomez",85000, 1990,12,17);
       
        misEmpleados[1]= new Empleado("Ana Lopez", 95000, 1995,06,02);
       
        misEmpleados[2]= new Empleado("Roxana Manea ", 105000, 2000,01,12);
       
        misEmpleados[3]= new Empleado("Antonio");
       
        misEmpleados[4]= jefeRRHH;//polimorfismo. principio de sustitucion
        
        misEmpleados[5]= new Jefatura("Maria",25000,2013, 5,20);
        
        Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
        
        jefa_Finanzas.estableceIncentivo(5000);
  
        
        
        
        for(Empleado e:misEmpleados){
            e.subeSueldo(5);
            
        }
        for(Empleado e: misEmpleados){
            System.out.println( "Nombre: "+ e.dame_Nombre()+"\n"+
                     "  Sueldo: "+ e.dame_sueldo()+"\n"+
                     "  Fecha de Alta: "+e.dameFechaContrato()+"\n");
        }
    }
}
class Empleado{
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        
         nombre=nom;      
     
         sueldo=sue;
          
         GregorianCalendar calendario =new GregorianCalendar(agno, mes-1,dia);
         
         altaContrato= calendario.getTime();
         
    }
    public Empleado(String nom){
      this(nom,30000,2000,01,01);  
        
        
    }


    private  String nombre;
    private double sueldo;
    private  Date altaContrato;
    private static int IdSiguiente;
    private int Id;
    
    public String dame_Nombre(){//getter
        return nombre;
    }
     public double dame_sueldo(){//getter
        return sueldo;
    }
    public Date dameFechaContrato(){//getter
    return altaContrato;
    
   }
    public void subeSueldo(double porcentaje){//setter
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
}

 class Jefatura extends Empleado{
        
     public Jefatura (String nom, double sue, int agno, int mes,int dia){
         
         super(nom,sue,agno,mes, dia);
         
         
     }
     
     public void estableceIncentivo(double b){//metodo setter
         incentivo=b; 
     }
     public  double dameSueldo(){
         
         double sueldoJefe = super.dame_sueldo() ;
         return sueldoJefe + incentivo; 
     }
     
      private double incentivo;
      
     
}

class Director extends Jefatura{
    
    public  Director(String nom, double sue, int agno, int mes,int dia){
        
        
        
        
        
        super(nom,sue,agno,mes, dia);
    }
}