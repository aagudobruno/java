package primeraClase;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private NIF nif=new NIF();
    
    public Persona(String nombre,String apellido,int edad,String numeroNif,String direccion,String nombrePadre,String nombreMadre){//constructor con todos los parámetros
        this.setNombre(nombre);
        this.apellido=apellido;
        this.edad=edad;
        this.nif.setNumNif(numeroNif);
        this.nif.setDireccion(direccion);
        this.nif.setNombrePadre(nombrePadre);
        this.nif.setNombreMadre(nombreMadre);
    }

    public Persona() {//constructor vacio
    }
    
    public Persona(Persona p1){//constructor copia
        this.nombre=p1.nombre;
        this.apellido=p1.apellido;
        this.edad=p1.edad;
        this.nif=p1.nif;
        
    }
    
    public void setNombre(String nombre){//setter
        this.nombre=nombre.toUpperCase();
    }
    public void setApellido(String apellido){//setter
        this.apellido=apellido;
    }
    public void setNumNif(String numeroNif){//setter
        this.nif.setNumNif(numeroNif);
    }
    public void setDireccion(String direccion){
        this.nif.setDireccion(direccion);
    }
    public void setnombrePadre(String nombrePadre){
        this.nif.setNombrePadre(nombrePadre);
    }
    public void setnombreMadre(String nombreMadre){
        this.nif.setNombreMadre(nombreMadre);
    }
    public void setEdad(int edad){//setter
        this.edad=edad;
    }
    
    public String getNombre(){//getter
        return this.nombre;
    }
    public String getApellido(){//getter
        return this.apellido;
    }
    public String getNumNif(){//getter
        return this.nif.getNumNif();
    }
    public String getDireccion(){//getter
        return this.nif.getDireccion();
    }
    public String getNombrePadre(){//getter
        return this.nif.getNombrePadre();
    }
    public String getNombreMadre(){//getter
        return this.nif.getNombreMadre();
    }
    public int getEdad(){//getter
        return this.edad;
    }
    
    public void solicitarDatos(){
        Scanner lector=new Scanner(System.in);
        System.out.print("Introducir nombre de la persona: ");
        this.setNombre(lector.nextLine());
        System.out.print("Introducir apellido de la persona: ");
        this.setApellido(lector.nextLine());
        System.out.print("Introducir edad de la persona: ");
        this.setEdad(lector.nextInt());
        this.nif.solicitarDatos();
        lector.close();
    }
    
    public void mostrarAtributos(){
        System.out.println("La persona se llama "+this.getNombre());
        System.out.println("La persona se apellida "+this.getApellido());
        this.nif.mostrarAtributos();
        System.out.println("La persona tiene "+this.getEdad()+" años.");
    }
}
