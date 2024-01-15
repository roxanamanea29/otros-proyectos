package com.mycompany.proiecto_contador;


public class contadorRegresivo_sc {

    public static void main(String[] args) {
        
       
        for (int i = 10; i >=0; i--) {
            switch (i) {
                case 0:
                    System.out.println(i + " Despega!");
                    break;
                case 3:
                    System.out.println(i+" Empezamos la cuenta atras!");
                    break;
                case 4:
                    System.out.println(i+" En posiciones! ");
                     break;
                case 6:
                    System.out.println(i+" Preparate");
                     break;
                case 8:
                    System.out.println(i+ " Preparate para despegar!");
                     break;
                default:
                    System.out.println(i);
                    break;                  
            }
        }
    }

}
