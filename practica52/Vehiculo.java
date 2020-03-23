package practica52;

import java.util.Scanner;

public  class Vehiculo {
    private int id;
    private String matricula;
    private String modelo;
    private int potencia;
    public static int contador=0;

    public Vehiculo(int id, String matricula, String modelo, int potencia) {
        this.id = id;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        contador++;
    }

    public Vehiculo() {
        contador++;
    }

    public void setId() {
        this.id = contador;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }
    
    public void mostrarAtributos(){
        System.out.println("id"+' '+this.id);
        System.out.println("matricula"+' '+this.matricula);
        System.out.println("modelo"+' '+this.modelo);
        System.out.println("potencia"+' '+this.potencia);
    }
    
    public void DarDeAlta(){
        Scanner lector=new Scanner(System.in);
        setId();
        System.out.print("introducir matricula: " );
        setMatricula(lector.nextLine());
        System.out.print("introducir modelo: ");
        setModelo(lector.nextLine());
        System.out.print("introducir potencia: ");
        setPotencia(Integer.parseInt(lector.nextLine()));
    }
    
}
