package practica3;

import java.util.Scanner;


/**
 *
 * @author adria
 */
public class BMainCoche {
    public static void main(String[] args) {
        BCoche cocheCliente=new BCoche();
        Scanner lector2 = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("*********    MENU TALLER   *********");
            System.out.println("*1.- Registrar Coche de un cliente *");
            System.out.println("*2.- Ver Coche de un cliente       *");
            System.out.println("*3.- Calcular precio final         *");
            System.out.println("*4.- Salir                         *");
            System.out.println("************************************");
            System.out.println(" ");
            System.out.print("Introducir opción: ");
            opcion = lector2.nextInt();
            switch (opcion) {
                case 1:
                    cocheCliente.definirCoche();
                    break;
                case 2:
                    cocheCliente.mostrarCoche();
                    break;
                case 3:
                    System.out.println("El importe total (Mano de obra incluida) es: "+cocheCliente.getBReparacion().calcularPrecio());
                    break;
            }
        }
    }
}
