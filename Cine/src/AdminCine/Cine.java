package AdminCine;

/**
 *
 * @author steve
 */
public class Cine {
    private String nombreCine;
    private String lemaCine;

    public Cine(){
    }
    
    public Cine(String nombreCine) {
        this.nombreCine = nombreCine;
    }
    
    public Cine(String nombreCine, String lemaCine){
        this.nombreCine = nombreCine;
        this.lemaCine = lemaCine;
    }

    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public String getLemaCine() {
        return lemaCine;
    }

    public void setLemaCine(String lemaCine) {
        this.lemaCine = lemaCine;
    }

    @Override
    public String toString() {
        return "Cine: " + nombreCine + ". \nLema: " + lemaCine + "."; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
