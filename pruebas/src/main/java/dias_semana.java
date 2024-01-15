
public class dias_semana {

    public static void main(String[] args) {
        //Array con los dias de la semana
        
        String[] diasSemana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        //declaramos un indice para recorrer el array
        int i = 0;
        // imprimimos los dias en consola utilizado un while
             
        while (i < diasSemana.length){
            
            System.out.println(diasSemana[i]);
             i++;
        }
        
    }
}
