
public class manipula_cadenas2 {
    public static void main(String[] args) {
        String alumno1, alumno2;
        
        alumno1 ="David";//si el nombre en las dos variables seria David daria como resultado true con equals 
        alumno2 ="david";// perp con equalsIgnoreCase no tiene en cuenta que el nombre es sin mayuscula y pone como true.
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
