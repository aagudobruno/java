package practica6;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Esfera implements FigurasGeometricas{
    private double radio;
    
    public Esfera() {
    }

    public Esfera(double radio) {
        this.radio = radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    @Override
    public double calcularArea() {
        double area;
        if (getRadio()==0) {
            pedir_datos();
        }
        area=4*pi*getRadio()*getRadio();
        return area;
    }
    
    @Override
    public double calcularVolumen() {
        double volumen;
        if (getRadio()==0) {
            pedir_datos();
        }
        volumen = (4/3)*pi*getRadio()*getRadio()*getRadio();
        return volumen;
    }
    
    @Override
    public void imprimirCaracteristicas(){
        System.out.println("Características:"
                         + "\nTipo: Esfera"
                         + "\nArea: "+calcularArea()
                         + "\nVolúmen: "+calcularVolumen());
    }
    
    public void pedir_datos()  throws NumberFormatException {
        System.out.print("Introducir longitud del radio: ");
        Scanner lector=new Scanner(System.in);
        setRadio(Double.parseDouble(lector.nextLine()));//excepcion de que lado no puede ser 0
    }
}
