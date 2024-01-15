
package n;

import java.util.ArrayList;


public class pasoporreferencia {
    public static void main(String[] args) {
       ArrayList<String> lista = new ArrayList <> ();
       lista.add("Manzana");
       lista.add ("Banana");
       modificarLista(lista);
       
       for(String fruta : lista){ 
       System.out.println(fruta);
       }
}
    public static void modificarLista( ArrayList<String> inputLista) {
        inputLista.add("Cereza");
        inputLista.add("Naranja");
    }
}

