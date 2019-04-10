package AdminCine;

import java.util.ArrayList;

public class AdminCine {
            
    public static void main(String[] args) {
        ArrayList<Funcion[]> horarios = new ArrayList<>();
        Funcion[] funciones = new Funcion[3];
        Funcion funcion = new Funcion();
        Menu.menu(horarios, funciones, funcion);
    }
    
}
