package practica52;

import java.util.ArrayList;
import java.util.Scanner;

public class practica52 {
    public static void main(String[] args) {
        String cosaAbuscar;
        boolean noEncontrado;
        int i;
        int opcion=0;
        ArrayList<Vehiculo> lista=new ArrayList<Vehiculo>();
        Scanner lector=new Scanner(System.in);
        while (opcion!=9) {            
            System.out.println("1- Alta taxis\n" +
                               "2- Alta VTC\n" +
                               "3- Alta Autobuses\n" +
                               "4- Buscar vehículo por id\n" +
                               "5- Buscar vehículo por matrícula\n" +
                               "6- Buscar primer taxi libre\n" +
                               "7- Buscar taxi concreto por id\n" +
                               "8- Mostrar todos los vehículos\n"+
                               "9- Salir");
            System.out.print("Introducir opcion: ");
            opcion=Integer.parseInt(lector.nextLine());
            switch(opcion){
                case 1: 
                    Taxi t1=new Taxi();
                    t1.DarDeAlta();
                    lista.add(t1);
                    break;
                case 2:
                    VTC vt1=new VTC();
                    vt1.DarDeAlta();
                    lista.add(vt1);
                    break;
                case 3:
                    Autobus a1=new Autobus();
                    a1.DarDeAlta();
                    lista.add(a1);
                    break;
                case 4:
                    System.out.print("Introducir id a buscar: ");
                    cosaAbuscar=lector.nextLine();
                    for (i=0;i<lista.size();i++){
                        if (Integer.parseInt(cosaAbuscar)==lista.get(i).getId()){
                            lista.get(i).mostrarAtributos();
                        }
                    }
                    break;
                case 5:
                    System.out.print("Introducir matrícula a buscar: ");
                    cosaAbuscar=lector.nextLine();
                    for (i=0;i<lista.size();i++){
                        if (cosaAbuscar.equals(lista.get(i).getMatricula())){
                            lista.get(i).mostrarAtributos();
                        }
                    }
                    break;
                case 6:
                    noEncontrado=true;
                    i=0;
                    while (noEncontrado && i<lista.size()){
                        if (lista.get(i) instanceof Taxi)  {
                            Taxi taxi=(Taxi) lista.get(i);
                            if (taxi.getLibre()) {
                                System.out.println("El id del primer taxi libre es: "+taxi.getId());
                                taxi.setLibre(false);
                                noEncontrado=false;
                            }
                        }
                        i++;            
                    }
                    break;    
                  case 7:   
                    System.out.print("Introducir id a buscar: ");
                    cosaAbuscar=lector.nextLine();
                    for (i=0;i<lista.size();i++){
                        if (lista.get(i) instanceof Taxi)  {
                            Taxi taxi=(Taxi) lista.get(i);
                            if (Integer.parseInt(cosaAbuscar)==taxi.getId()){
                            lista.get(i).mostrarAtributos();
                            }
                        }
                    }
                   break;  
                case 8:
                   for (i=0;i<lista.size();i++){
                        lista.get(i).mostrarAtributos();
                        System.out.println("");
                    }
                    break;        
            }   

        }
    }    
}
