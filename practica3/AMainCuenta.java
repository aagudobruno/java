package practica3;

import java.util.Scanner;

public class AMainCuenta {
    public static void main(String[] args) {
        ACuenta cuenta1=new ACuenta();
        ACuenta cuenta2=new ACuenta();
        Scanner lector=new Scanner(System.in);
        int opcion=0;
        while (opcion!=6) {            
            System.out.println("****  MENU BANCO  ****");
            System.out.println("*1.- Crear Cuenta    *");
            System.out.println("*2.- Ver Cuenta      *");
            System.out.println("*3.- Ingreso         *");
            System.out.println("*4.- Reintegro       *");
            System.out.println("*5.- Transferencia   *");
            System.out.println("*6.- Salir           *");
            System.out.println("**********************");
            System.out.println(" ");
            System.out.print("Introducir opción: ");
            opcion=lector.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("¿Crear cuenta 1 o 2?");
                    opcion=lector.nextInt();
                    if (opcion==1){
                        System.out.print("Introducir nombre del propietario de la cuenta: ");
                        cuenta1.setNombreCliente(lector.next());
                        System.out.print("Introducir numero de la cuenta: ");
                        cuenta1.setNumeroCuenta(lector.next());
                        System.out.print("Introducir interés: ");
                        cuenta1.setInteres(lector.nextDouble());
                        System.out.print("Introducir saldo: ");
                        cuenta1.setSaldo(lector.nextDouble());
                    }
                    else{
                        System.out.print("Introducir nombre del propietario de la cuenta: ");
                        cuenta2.setNombreCliente(lector.next());
                        System.out.print("Introducir numernextLineo de la cuenta: ");
                        cuenta2.setNumeroCuenta(lector.next());
                        System.out.print("Introducir interés: ");
                        cuenta2.setInteres(lector.nextDouble());
                        System.out.print("Introducir saldo: ");
                        cuenta2.setSaldo(lector.nextDouble());
                    } 
                    break;
                case 2:
                    System.out.println("¿Ver cuenta 1 o 2?");
                    opcion=lector.nextInt();
                    if (opcion == 1) {
                        System.out.println("Nombre del propietario de la cuenta: "+cuenta1.getNombreCliente());   
                        System.out.println("Numero de la cuenta: "+cuenta1.getNumeroCuenta());                  
                        System.out.println("Interés: "+cuenta1.getInteres());    
                        System.out.println("Saldo: "+cuenta1.getSaldo());
                    } 
                    else {
                        System.out.println("Nombre del propietario de la cuenta: "+cuenta2.getNombreCliente());   
                        System.out.println("Numero de la cuenta: "+cuenta2.getNumeroCuenta());                  
                        System.out.println("Interés: "+cuenta2.getInteres());    
                        System.out.println("Saldo: "+cuenta2.getSaldo());
                    }
                    break;
                case 3:
                     double ingreso=0;
                     System.out.println("¿Ingresar en cuenta 1 o 2?");
                     opcion=lector.nextInt();
                     System.out.print("Introducir importe a ingresar: ");  
                     ingreso=lector.nextDouble();
                    if ( opcion == 1) {
                        cuenta1.ingreso(ingreso);
                    } 
                    else {                         
                        cuenta2.ingreso(ingreso);
                    }
                    break;
                case 4:
                    double reintegro = 0;
                    System.out.println("¿Reintegro en cuenta 1 o 2?");
                    opcion = lector.nextInt();
                    System.out.print("Introducir importe a reintegrar: ");
                    reintegro = lector.nextDouble();
                    if (opcion == 1) {
                        cuenta1.reintegro(reintegro);
                    } else {
                        cuenta2.reintegro(reintegro);
                    }
                    break;
                case 5:
                    System.out.println("Introducir cuenta que hará la transferencia: ");
                    opcion = lector.nextInt();
                    System.out.print("Introducir importe a transferir: ");
                    double transferencia = lector.nextDouble();
                    if (opcion == 1) {
                        cuenta1.transferencia(cuenta2, transferencia);
                    } 
                    else {
                        cuenta2.transferencia(cuenta1, transferencia);
                    }
                    break;               
            }  
        }
    }   
}
