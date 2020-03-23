package practica51;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public final class Comercial extends Empleado{
    private int ventas_realizadas;
    private double comision;

    public Comercial(int ventas_realizadas, double comision, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.ventas_realizadas = ventas_realizadas;
        this.comision = comision;
    }

    public Comercial() {
    }
    
    public Comercial(Comercial c1){
        this.ventas_realizadas=c1.ventas_realizadas;
        this.comision=c1.comision;
    }
    
    public void setVentas_realizadas(int ventas_realizadas) {
        this.ventas_realizadas = ventas_realizadas;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getVentas_realizadas() {
        return ventas_realizadas;
    }

    public double getComision() {
        return comision;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Ventas realizadas: "+this.ventas_realizadas);
        System.out.println("Comisión: "+this.comision);
    }
    
    @Override
    public void pedirAlta(){
        super.pedirAlta();
        Scanner lector=new Scanner(System.in);
        System.out.print("Introducir comision: ");
        this.setComision(Double.parseDouble(lector.nextLine()));
        System.out.print("Introducir ventas realizadas: ");
        this.setVentas_realizadas(Integer.parseInt(lector.nextLine()));
    }
}
