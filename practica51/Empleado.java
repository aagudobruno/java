package practica51;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Empleado {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private double salario;

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }
    
    public Empleado(Empleado e1){
        this.nombre=e1.nombre;
        this.apellido1=e1.apellido1;
        this.apellido2=e1.apellido2;
        this.edad=e1.edad;
        this.nif=e1.nif;
        this.salario=e1.salario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNif() {
        return nif;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void mostrarAtributos(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Primer apellido: "+this.getApellido1());
        System.out.println("Segundo apellido: "+this.getApellido2());
        System.out.println("Introducir edad: "+this.getEdad());
        System.out.println("Introducir nif: "+this.getNif());
        System.out.println("Introducir salario: "+this.getSalario());
    }
    
    public void pedirAlta(){
        Scanner lector=new Scanner(System.in);
        System.out.print("Introducir nombre: ");
        this.setNombre(comprobarCAPS(lector.nextLine()));
        System.out.print("Introducir primer apellido: ");
        this.setApellido1(comprobarCAPS(lector.nextLine()));
        System.out.print("Introducir segundo apellido: ");
        this.setApellido2(comprobarCAPS(lector.nextLine()));
        System.out.print("Introducir nif: ");
        this.setNif(lector.nextLine());
        System.out.print("Introducir edad (mayor que 16): ");
        this.setEdad(ponerEdad(Integer.parseInt(lector.nextLine())));
        System.out.print("Introducir salario: ");
        this.setSalario(Double.parseDouble(lector.nextLine()));
    }
    
    private int ponerEdad(int edad){
        Scanner lector=new Scanner(System.in);
        while (edad<16) {      
             System.out.print("Edad no valida, introducir edad: ");
             edad=Integer.parseInt(lector.nextLine());
        }
        return edad;
    }
    
    private String comprobarCAPS(String comprobar){
        Scanner lector=new Scanner(System.in);
        while (comprobar.charAt(0)!=Character.toUpperCase(comprobar.charAt(0))) {      
             System.out.print("Forma no valida, introducir primera letra en MAYUSCULA: ");
             comprobar=lector.nextLine();
        }
        return comprobar;
    }
}
