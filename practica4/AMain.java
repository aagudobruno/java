package practica4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class AMain {
    public static void main(String[] args) {
        APelicula peli=new APelicula();
        ArrayList<APelicula> lista=new ArrayList<APelicula>();
        Scanner lector=new Scanner(System.in);
        int opcion=0;
        while (opcion!=4) {            
            System.out.println("*****  MENU PELÍS  *****");
            System.out.println("*1.- Añadir película   *");
            System.out.println("*2.- Reservar película *");
            System.out.println("*3.- Buscar película   *");
            System.out.println("*4.- Salir             *");
            System.out.println("************************");
            System.out.println(" ");
            System.out.print("Introducir opción: ");
            opcion=Integer.parseInt(lector.nextLine());
            switch (opcion){
                case 1:
                    peli.añadirPelicula(lista);
                    break;
                case 2:
                    APelicula.reservarPelicula(lista);
                    break;
                case 3:
                    APelicula.buscarPelícula(lista);
                    break;
            }  
        }
    }   
}
