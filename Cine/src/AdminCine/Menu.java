package AdminCine;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner in = new Scanner(System.in);
    
    public static void menu(ArrayList<Funcion[]> horarios, Funcion[] funciones, Funcion funcion) {
        horarios.add(funciones);
        horarios.add(funciones);
        Cine cine = new Cine("No tiene", "No tiene");
        boolean flag = true;
        int continuar;
      
        while(flag){
            System.out.println("----------MENU----------");
            System.out.println("1. Para Ingresar cine");
            System.out.println("2. Para ver información del cine");
            System.out.println("3. Para actualizar información del cine");
            System.out.println("4. Para agregar una nueva función");
            System.out.println("5. Para modificar funciones");
            System.out.println("6. Para mostrar funciones");
            switch(in.nextInt()){
            case 1:
                in.nextLine();
                cine = crearCine(); break;
            case 2:
                mostrarCine(cine); break;
            case 3:
                modificarCine(cine); break;
            case 4:
                agregarFuncion(horarios, funciones, funcion); break;
            case 5:
//                modificarFuncion(horario); break;
            case 6:
                mostrarFuncion(horarios, funciones, funcion); break;
            default:
                System.out.println("Error, ingrese un valor correcto");
                menu(horarios, funciones, funcion);
            } 
            System.out.println("Presione 1 para continuar");
            continuar = in.nextInt();
            if (continuar == 1){                
            } else{
                System.out.println("Programa finalizado");
                flag = false;
            }
        }
        
    }
    
    public static Cine crearCine(){
        System.out.println("Ingrese nombre del cine:");
        String nombreCine = in.nextLine();
        System.out.println("Presione 1 para ingresar lema, otra tecla para no hacerlo");
        if(in.nextInt() == 1){
            in.nextLine();
            System.out.println("Ingrese lema:");
            String lemaCine = in.nextLine();
            Cine cine = new Cine(nombreCine, lemaCine);
            return cine;
        }else{
            in.nextLine();
            Cine cine = new Cine(nombreCine);
            return cine;
        }
        
        
    }
    
    public static void agregarFuncion(ArrayList<Funcion[]> horarios, Funcion[] funciones, Funcion funcion){
        System.out.println("Ingrese el día a agregar funcion: \n1. Sábado. \n2. Domingo");
        int dia = in.nextInt(); in.nextLine();
        switch(dia){
            case 1:{
                System.out.println("Ingrese la función a agregar (En números del 1 al 3): ");
                int numeroFuncion = in.nextInt(); in.nextLine();
                for (int i = 0; i < horarios.size(); i++){
                    for (int j = 0; j < funciones.length; j++){
                        if(i == dia && j == numeroFuncion){
                            if(funciones[j] == null){
                                System.out.println("Ingrese nombre de la funcion");
                                String nombre = in.nextLine();
                                System.out.println("Ingrese sala de la funcion");
                                int sala = in.nextInt();
                                System.out.println("Ingrese precio de la funcion");
                                double precio = in.nextDouble();
//                                funcion = new Funcion(nombre, sala, precio); 
                                funciones[i] = new Funcion(nombre, sala, precio);
                            } else{
                                System.out.println("Funcion ya ocupada, intente de nuevo");
                                agregarFuncion(horarios, funciones, funcion);
                            }
                        }
                    }
                }
            } break;
            case 2:{
                System.out.println("Ingrese la función a agregar (En números del 1 al 3): ");
                int numeroFuncion = in.nextInt(); in.nextLine();
                for (int i = 0; i < horarios.size(); i++){
                    for (int j = 0; j < funciones.length; j++){
                        if(i == dia && j == numeroFuncion){
                            if(funciones[j] == null){
                                System.out.println("Ingrese nombre de la funcion");
                                String nombre = in.nextLine();
                                System.out.println("Ingrese sala de la funcion");
                                int sala = in.nextInt();
                                System.out.println("Ingrese precio de la funcion");
                                double precio = in.nextDouble();
                                funcion = new Funcion(nombre, sala, precio);
                            } else{
                                System.out.println("Funcion ya ocupada, intente de nuevo");
                                agregarFuncion(horarios, funciones, funcion);
                            }
                        }
                    }
                }
            } break;
            default:{
                System.out.println("ERROR \nIntente de nuevo");
                agregarFuncion(horarios, funciones, funcion);
            }
        }
    }
    
    public static Cine modificarCine(Cine cine){
        System.out.println("1. Para modificar nombre");
        System.out.println("2. Para modificar lema");
        System.out.println("3. Para modificar ambos");
        switch(in.nextInt()){
            case 1:
                in.nextLine();
                System.out.println("Ingrese nombre del cine:");
                cine.setNombreCine(in.nextLine());
                break;
            case 2:
                in.nextLine();
                System.out.println("Ingrese lema del cine:");
                cine.setLemaCine(in.nextLine());
                break;
            case 3:
                in.nextLine();
                System.out.println("Ingrese nombre del cine:");
                cine.setNombreCine(in.nextLine());
                System.out.println("Ingrese lema del cine:");
                cine.setLemaCine(in.nextLine());
                break;
            default:
                in.nextLine();
                System.out.println("Error, ingrese un valor correcto");
                modificarCine(cine);
            } 
        return cine;
    }
    
    public static void mostrarCine(Cine cine){
        if (cine.getLemaCine() == null){
            cine.setLemaCine("No tiene");
        }       
        System.out.println(cine.toString());                
    }
    
    public static void mostrarFuncion(ArrayList<Funcion[]> horarios, Funcion[] funciones, Funcion funcion){       
        for (int i = 0; i < horarios.size(); i++){
                    for (int j = 0; j < funciones.length; j++){
                        if (funciones[j] == null){
                            System.out.println("No hay funcion.");
                        }else{
                            System.out.println(funcion.toString());
                        }
                    }
                }
    }
}

//                System.out.println(funcion[numeroFuncion]);
//                for (int i = 1 ; i < numeroFuncion; i++){
//                    if (funcion[numeroFuncion] != null){
//                        
//                    }
//                }
////                for (int i = 0; i < horarios.get(i).length; i++){
////                    System.out.println(horarios.get(i));
////                }