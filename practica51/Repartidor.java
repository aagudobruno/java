package practica51;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public final class Repartidor extends Empleado{
    private double horas_trabajadas;
    private String zona;

    public Repartidor(double horas_trabajadas, String zona) {
        this.horas_trabajadas = horas_trabajadas;
        this.zona = zona;
    }

    public Repartidor() {
    }
    
    public Repartidor(Repartidor r1){
        this.horas_trabajadas=r1.horas_trabajadas;
        this.zona=r1.zona;
    }
    
    public void setHoras_trabajadas(double horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public String getZona() {
        return zona;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Horas trabajadas: "+this.getHoras_trabajadas());
        System.out.println("Zona: "+this.getZona());
    }
    
    @Override
    public void pedirAlta(){
        Scanner lector=new Scanner(System.in);
        super.pedirAlta();
        System.out.print("Introducir horas trabajadas: ");
        this.setHoras_trabajadas(Integer.parseInt(lector.nextLine()));
        System.out.print("Introducir zona: ");
        this.setZona(lector.nextLine());
    }
}
