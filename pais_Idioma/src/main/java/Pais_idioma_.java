
import java.util.Scanner;

public class Pais_idioma_ {

    public static void main(String[] args) {

        int contador = 0;
        
        Scanner entrada = new Scanner(System.in);

        while (true) {

            System.out.println("Introduzca el nombre del país. o fin para salir");//
            String nombre = entrada.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                return;
            } else {

                System.out.println("Introduzca la población del país ");//
                int poblacion = entrada.nextInt();
     

                entrada.nextLine();

                System.out.println("Introduzca la idioma del país ");//
                String idiomaPrincipal = entrada.nextLine();
                PaisConIdioma paisConIdioma = new PaisConIdioma();
            }
            contador++;
            System.out.println("Numero de datos de estudiantes y notas intruducidas son: " + contador);
        }
    }
}
