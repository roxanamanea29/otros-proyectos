
package com.mycompany.imc;


public class Persona {
     private  String name;
     private  int age;
     private double height;
     private int weight;
     private double imc;


    public Persona(String name, int age, double height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        
        calcularIMC();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calcularIMC();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        calcularIMC();

    }

    public double getImc() {
        return imc;
    }

    private void calcularIMC() {
       imc = this.weight/(this.height * this.height) ;
      
    }
    public String salidaDatos(){
        return String.format("Your name is %s and your IMC is %.2f", name, imc);
    }
     
     
}
