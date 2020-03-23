package practica52;

import java.util.Scanner;

public class VTC extends Vehiculo{
    private double numeroMaximoHoras;
    private double kmRadioAccion;
    private String ciudad;

    public VTC(double numeroMaximoHoras, double kmRadioAccion, String ciudad) {
        this.numeroMaximoHoras = numeroMaximoHoras;
        this.kmRadioAccion = kmRadioAccion;
        this.ciudad = ciudad;
    }

    public VTC() {
    }

    public double getNumeroMaximoHoras() {
        return numeroMaximoHoras;
    }

    public double getKmRadioAccion() {
        return kmRadioAccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNumeroMaximoHoras(double numeroMaximoHoras) {
        this.numeroMaximoHoras = numeroMaximoHoras;
    }

    public void setKmRadioAccion(double kmRadioAccion) {
        this.kmRadioAccion = kmRadioAccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("numero maximo de horas"+' '+this.numeroMaximoHoras);
        System.out.println("ciudad"+' '+this.ciudad);
        System.out.println("km de radio de accion"+' '+this.kmRadioAccion);
    }
    
    @Override
    public void DarDeAlta(){
        double cosaAmeter;
        Scanner lector=new Scanner(System.in);
        super.DarDeAlta();
        System.out.print("introducir maximo de horas (<24): ");
        cosaAmeter=Double.parseDouble(lector.nextLine());
        while(cosaAmeter>24){
            System.out.print("Maximo de horas no válido, introducir maximo válido: ");
            cosaAmeter=Double.parseDouble(lector.nextLine());
        }
        setNumeroMaximoHoras(cosaAmeter);
        System.out.print("introducir ciudad: ");
        setCiudad(lector.nextLine());
        System.out.print("introducir km de radio de accion (<50): ");        
         while(cosaAmeter>50){
            System.out.print("Km de radio de accion no válido, introducir radio válido: ");
            cosaAmeter=Double.parseDouble(lector.nextLine());
        }
        setKmRadioAccion(cosaAmeter); 
    }
}
