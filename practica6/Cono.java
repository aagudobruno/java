package practica6;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Cono implements FigurasGeometricas{
    private double radioBase; 
    private double altura;

   
    public Cono() {
    }

    public Cono(double radioBase) {
        this.radioBase = radioBase;
    }
    
    public void setRadioBase(double radioBase) {
        this.radioBase = radioBase;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getRadioBase() {
        return radioBase;
    }
    
     public double getAltura() {
        return altura;
    }
 
    @Override
    public double calcularArea() {
        double area;
        if (getRadioBase()==0) {
            pedir_datos();
        }
        area=pi*getRadioBase()*Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getRadioBase(), 2));
        return area;
    }
    
    @Override
    public double calcularVolumen() {
        double volumen;
        if (getRadioBase()==0) {
            pedir_datos();
        }
        volumen = (1/3)*(pi*getRadioBase()*getRadioBase()*getAltura());
        return volumen;
    }
    
    @Override
    public void imprimirCaracteristicas(){
        System.out.println("Características:"
                         + "\nTipo: Cono"
                         + "\nArea: "+calcularArea()
                         + "\nVolúmen: "+calcularVolumen());
    }
    
    public void pedir_datos() throws NumberFormatException {
        System.out.print("Introducir longitud del radio de la base: ");
        Scanner lector=new Scanner(System.in);
        setRadioBase(Double.parseDouble(lector.nextLine()));//excepcion de que lado no puede ser 0
        System.out.print("Introducir altura: ");
        setAltura(Double.parseDouble(lector.nextLine()));
    }
}
