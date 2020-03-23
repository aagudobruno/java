package primeraClase;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class NIF {
    private String numNif;
    private String direccion;
    private String nombrePadre;
    private String nombreMadre;
   
    public NIF(){
    }

    public NIF(String numNif, String direccion, String nombrePadre, String nombreMadre) {
        this.numNif = numNif;
        this.direccion = direccion;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }
    
    public NIF(NIF n1){
        this.numNif=n1.numNif;
        this.direccion=n1.direccion;
        this.nombrePadre=n1.nombrePadre;
        this.nombreMadre=n1.nombreMadre;
    }

    public void setNumNif(String numNif) {
        this.numNif = numNif;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getNumNif() {
        return numNif;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }
    
     public void solicitarDatos(){
        Scanner lector2=new Scanner(System.in);
        System.out.print("Introducir numero de NIF de la persona: ");
        this.setNumNif(lector2.nextLine());
        System.out.print("Introducir direccion de la persona: ");
        this.setDireccion(lector2.nextLine());
        System.out.print("Introducir nombre del padre de la persona: ");
        this.setNombrePadre(lector2.nextLine());
        System.out.print("Introducir nombre de la madre de la persona: ");
        this.setNombreMadre(lector2.nextLine());
        lector2.close();
    }
    
    public void mostrarAtributos(){
        System.out.println("El NIF es "+this.getNumNif());
        System.out.println("La persona vive en "+this.getDireccion());
        System.out.println("El padre se llama "+this.getNombrePadre());
        System.out.println("La madre se llama "+this.getNombreMadre());
    }
} 

