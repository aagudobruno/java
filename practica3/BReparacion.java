package practica3;

import java.util.Scanner;

public class BReparacion {
    private String marca;
    private double pulgadasLlanta;
    private int numeroNeumaticos;
    private String fechaCambio;

    public BReparacion(String marca, int pulgadasLlanta, int numeroNeumaticos, String fechaCambio) {
        this.marca = marca;
        this.pulgadasLlanta = pulgadasLlanta;
        this.numeroNeumaticos = numeroNeumaticos;
        this.fechaCambio = fechaCambio;
    }

    public BReparacion() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPulgadasLlanta(double pulgadasLlanta) {
        this.pulgadasLlanta = pulgadasLlanta;
    }
    public void setNumeroNeumaticos(int numeroNeumaticos) {
        this.numeroNeumaticos = numeroNeumaticos;
    }
    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public String getMarca() {
        return marca;
    }
    public double getPulgadasLlanta() {
        return pulgadasLlanta;
    }
    public int getNumeroNeumaticos() {
        return numeroNeumaticos;
    }
    public String getFechaCambio() {
        return fechaCambio;
    }
    
    public double calcularPrecio(){
        double precioFinal=0;
        //25€ por pulgada de neumatico michelin
        if(this.marca.equals("Michelin")){
            precioFinal=this.pulgadasLlanta*25*this.numeroNeumaticos+this.calcularManoDeObra();
        }
        else if(this.marca.equals("Genericos")){
            //20€ por pulgada de neumatico generico
            precioFinal=this.pulgadasLlanta*20*this.numeroNeumaticos+this.calcularManoDeObra();
        }
        else{
            System.out.println("Marca mal definida, asegurese de contener mayúsculas y sin tíldes");
        }
        return precioFinal;
    }
    
    private double calcularManoDeObra(){
        //2,5€ por minuto (20 min aprox por cada neumatico)
        double precioManoObra=0;
        precioManoObra=this.numeroNeumaticos*20*2.5;
        return precioManoObra;
    }
    
    public void definirNeumaticos(){
        Scanner lector = new Scanner(System.in);
        System.out.print("Introducir fecha cambio de neumáticos: ");
        this.setFechaCambio(lector.nextLine());
        System.out.print("Introducir marca de los neumáticos a cambiar (Michelin o Genericos): ");
        this.setMarca(lector.nextLine());
        System.out.print("Introducir numero neumáticos a cambiar: ");
        this.setNumeroNeumaticos(lector.nextInt());
        System.out.print("Introducir pulgadas de la llanta: ");
        this.setPulgadasLlanta(lector.nextDouble());
    }

    void mostrarNeumaticos() {
        System.out.println("Numero de neumáticos a cambiar: "+this.getNumeroNeumaticos());
        System.out.println("Pulgadas de la llanta a cambiar: "+this.getPulgadasLlanta());
        System.out.println("Fecha de el cambio: "+getFechaCambio());
        System.out.println("Marca de los neumáticos cambiados: "+getMarca());
    }
}
