
package poo;


public class Coche {
    //declaracion de  variables 
 private int ruedas;
 
 private int largo;
 
 private int ancho;
    
 private int motor;
    
 private int peso_plataforma;
 
 private String color;
 
 private int peso_total;
 
 private boolean asientos_cuero, climatizador;
 
//inicializamos  el constructor
  public Coche(){
      ruedas=4;
      
      largo=2000;
      
      ancho=300;
       
      motor=1600;
      
      peso_plataforma=500;
  }
  
  
  //inicializamos metodo getter para pedir los datos generales del objeto
  public String dime_datos_generales(){//metodo getter
    
     return "La plataforma del vehiculo tiene "+ ruedas + " ruedas."+ 
             "\nMide "+ largo/1000 + " metros con un ancho de  "+ ancho +" cm."
             + "\n Y un peso de plataforma de "+ peso_plataforma+ "kg";
             
  }
  
  //inicializamos el metodo setter para establecer el color
  public void establece_color(String color_coche){//metodo setter
     color=color_coche;
  }
  public String dime_color(){
      return "El color del coche es "+ color;
  }
  //inicializamos el metodo configura asientos
  public void configura_asientos(String asientos_cuero){
     if(asientos_cuero.equalsIgnoreCase("si")){
         this.asientos_cuero=true;
     }else{
         this.asientos_cuero =false;
     }
   }
  //inicializamos el metodo dime asientos
  public String dime_asientos(){
      if(asientos_cuero== true){
          return "El coche tinene asientos de cuero";
      }else{
          return"El coche tiene asientos de serie";
      }
  }
  
  //inicializamos el metodo configura climatizador
  public void configura_climatizador(String climatizador){//setter
      if(climatizador.equalsIgnoreCase("si")){
          this.climatizador=true;
      }else{
          this.climatizador=false;
      }
  }
  
  
  public String dime_climatizador(){//getter
      
      if(climatizador==true){
          return "El coche incorpora climatizador";
      }else{
          return "El coche lleva aire acondicionado";
      }
  }
  
  
  
  public String dime_peso_coche(){
      
      int peso_carroceria=500;
      
      peso_total= peso_plataforma + peso_carroceria;
      
      if(asientos_cuero==true){
          peso_total=peso_total+50;
      }
      if(climatizador ==true){
          peso_total= peso_total+20;
      }
      return "El peso del coche es "+ peso_total;
  }
  
  
  
  public int precio_coche(){
      int precio_final=10000;
      if(asientos_cuero=true){
          precio_final +=2000;
      }
      if(climatizador ==true){
          precio_final+=1500;
      }
      return precio_final;
  }
}

