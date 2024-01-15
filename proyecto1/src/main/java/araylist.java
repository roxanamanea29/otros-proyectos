
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author roxanamanea
 */
public class araylist {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(5);
        numeros.add(6);
        numeros.add(8);
        numeros.add(2);

        int primerNumero = numeros.get(0);
        int segundoNumero = numeros.get(1);
        numeros.set(1, 10);
        //numeros.remove(1);
        int tamaño = numeros.size();
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            System.out.println(numero);
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }

}
