package com.mycompany.proiecto_contador;


import java.util.Scanner;


public class contador_nombre_edad {

    public static void main(String[] args) {
        int contador = 0;   //creo el contador
        Scanner entrada = new Scanner(System.in);
        boolean seguir= true;
        
        while(seguir){
        System.out.print("Binevenid@!\nIngresa fin para terminar o .\n Ingrese su nombre:  ");
        String nombre = entrada.nextLine();
        
        if(nombre.equalsIgnoreCase("fin")){
            seguir = false;
        }else{
            System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        contador++; 
        System.out.println("La cantidad es: " + contador);//mostrar en pantalla la cantidad
        } 
    }
        System.out.println("!Contador finalizado!"); 
        entrada.close();
}
}