
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roxanamanea
 */
public class uso_Arrays_2 {

    public static void main(String[] args) {
        
       String[] paises = new String[8];// forma elaborada de declarar el array
        /*paises[0] = "España";
        paises[1] = "Mexico";
        paises[2] = "Colombia";
        paises[3] = "Peru";
        paises[4] = "Argentina";
        paises[5] = "Ecuador";
        paises[6] = "Chile";
        paises[7] = "Venezuela";*/
        /*String []paises = {"España", "Mexico", "Colombia", "Peru", "Argentina", "Ecuador", "Chile", "Venezuela"};*/ // una decalracion sencilla de un array
        /*for(int i =0; i<paises.length;i++){ // forma elaborada para declarar el fot
            System.out.println("País "+ (i+1) +" "+ paises [i]);*/
        for(int i=0; i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce país "+ (i+1));
        }
        
        for(String elemento:paises){
            
            System.out.println("País " + elemento);
        }
    
        
    }
}
