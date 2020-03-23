package practica61;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class practica6 {
    public static void main(String[] args) {
        int opcion=0;
        Scanner lector=new Scanner(System.in);
        while (opcion!=4) {            
            System.out.println("MENU");
            System.out.println("1.- Imprimir características Cono");
            System.out.println("2.- Imprimir características Cubo");
            System.out.println("3.- Imprimir características Esfera");
            System.out.print("Introducir opción: ");
            opcion=Integer.parseInt(lector.nextLine());
            switch(opcion){
                case 1:
                    Cono c1=new Cono();
                    try {
                        System.out.println(c1.calcularArea());   
                    } 
                    catch (Exception NumberFormatException) {
                        System.err.println("Formato del número erróneo");
                    }
                    break;
                case 2:
                    Cono c2=new Cono();
                    c2.calcularVolumen();
            }
        }       
    }
}
