package practica51;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class practica51 {
    public static void main(String[] args) {
        int opcion=0;
        ArrayList<Empleado> lista=new ArrayList<Empleado>();
        Scanner lector=new Scanner(System.in);
        while (opcion!=3){
            System.out.println("**********MENU**********");
            System.out.println("*1.- Dar de alta *******");
            System.out.println("*2.- Mostrar atributos *");
            System.out.println("*3.- Salir *************");
            System.out.println("************************");
            System.out.println("");
            System.err.print("Introducir opción: ");
            opcion=Integer.parseInt(lector.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("Dar alta a: ");
                    System.out.println("1.- Empleado");
                    System.out.println("2.- Comercial");
                    System.out.println("3.- Repartidor");
                    System.out.println("");
                    System.err.print("Introducir opción: ");
                    opcion=Integer.parseInt(lector.nextLine());
                    switch(opcion){
                        case 1:
                            Empleado e1=new Empleado();
                            e1.pedirAlta();
                            lista.add(e1);
                            break;
                        case 2:
                            Comercial c1=new Comercial();
                            c1.pedirAlta();
                            lista.add(c1);
                            break;
                        case 3:
                            Repartidor r1=new Repartidor();
                            r1.pedirAlta();
                            lista.add(r1);
                    }
                    break;
                case 2:
                    for (int i=0;i<lista.size();i++){
                        System.out.println(i+".-"+' '+lista.get(i).getNombre()+' '+lista.get(i).getApellido1()+' '+lista.get(i).getApellido2());
                    } 
                    System.err.print("Introducir opción: ");
                    opcion=Integer.parseInt(lector.nextLine());
                    System.out.println(' '); 
                    lista.get(opcion).mostrarAtributos();
                    System.out.println(' ');    
            }
        }
    }
}

