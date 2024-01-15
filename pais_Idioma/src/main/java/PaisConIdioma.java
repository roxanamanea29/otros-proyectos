
public class PaisConIdioma extends Pais {
    
    private String idiomaPrincipal;

    public PaisConIdioma(String nombre, int poblacion, String idiomaPrincipal) {
        super(nombre, poblacion);
        this.idiomaPrincipal = idiomaPrincipal;

    }

    PaisConIdioma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    public String getIdiomaPrincipal() {
        return idiomaPrincipal;   
    }

  
}
