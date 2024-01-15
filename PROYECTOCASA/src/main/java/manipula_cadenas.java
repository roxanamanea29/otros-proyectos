
public class manipula_cadenas {
    public static void main(String[] args) {
        String frase ="Hoy es un estupendo día para aprender a programar en Java";// esta es la frase inicial 
        String frase_resumen=frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo..."+ " y " +
                frase.substring(29, 57);// he creado una cadena mas larga concatenar la fraase de arriba con una subcadena ,"irnos a la playa y olvidarnos de todo"
        System.out.println(frase_resumen);
    }
}
