package AdminCine;

public class Funcion {
    private String nombreFuncion;
    private int salaFuncion;
    private double precioFuncion;

    public Funcion() {
    }

    public Funcion(String nombreFuncion, int salaFuncion, double precioFuncion) {
        this.nombreFuncion = nombreFuncion;
        this.salaFuncion = salaFuncion;
        this.precioFuncion = precioFuncion;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public int getSalaFuncion() {
        return salaFuncion;
    }

    public void setSalaFuncion(int salaFuncion) {
        this.salaFuncion = salaFuncion;
    }

    public double getPrecioFuncion() {
        return precioFuncion;
    }

    public void setPrecioFuncion(double precioFuncion) {
        this.precioFuncion = precioFuncion;
    }

    @Override
    public String toString() {
        return "Funcion: " + nombreFuncion + ". \nSala: " + salaFuncion + ". \nPrecio: " + precioFuncion + "."; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
