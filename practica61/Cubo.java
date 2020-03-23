package practica61;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Cubo implements FigurasGeometricas{
    private double lado;
    
    public Cubo() {
    }

    public Cubo(double lado) {
        this.lado = lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    @Override
    public double calcularArea() throws NumberFormatException {
        double area;
        if (getLado() == 0) {
            pedir_datos();
        }        area=getLado()*getLado()*6;
        return area;
    }
    
    @Override
    public double calcularVolumen() {
        double volumen;
        if (getLado()==0) {
            try {
                pedir_datos();   
            } catch (Exception NumberFormatException) {
                System.err.println("Formato del número erróneo");
                calcularVolumen();
            }
        }
        volumen = getLado()*getLado()*getLado();
        return volumen;
    }
    
    @Override
    public void imprimirCaracteristicas(){
        System.out.println("Características:"
                         + "\nTipo: Cubo"
                         + "\nArea: "+calcularArea()
                         + "\nVolúmen: "+calcularVolumen());
    }
    
    public void pedir_datos() {
        System.out.print("Introducir longitud del lado: ");
        Scanner lector=new Scanner(System.in);
        setLado(Double.parseDouble(lector.nextLine()));//excepcion de que lado no puede ser 0
    }
}
