package practica52;

import java.util.Scanner;

public class Taxi extends Vehiculo{
    private int numeroLicencia;
    private boolean libre;
    private int numConMismaLicencia;

    public Taxi(int numeroLicencia, boolean libre, int numConMismaLicencia) {
        this.numeroLicencia = numeroLicencia;
        this.libre = libre;
        this.numConMismaLicencia = numConMismaLicencia;
    }

    public Taxi() {
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public void setNumConMismaLicencia(int numConMismaLicencia) {
        this.numConMismaLicencia = numConMismaLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public boolean getLibre() {
        return libre;
    }

    public int getNumConMismaLicencia() {
        return numConMismaLicencia;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("numero de licencia"+' '+this.numeroLicencia);
        System.out.println("numero de taxis con la misma licencia"+' '+this.numConMismaLicencia);
        if (this.libre){
            System.out.println("disponibilidad"+' '+"libre");
        }
        else{
            System.out.println("disponibilidad"+' '+"ocupado");
        }
    }
      
    @Override
    public void DarDeAlta(){
        String libreaux;
        Scanner lector=new Scanner(System.in);
        super.DarDeAlta();
        System.out.print("introducir numero de licencia: ");
        setNumeroLicencia(Integer.parseInt(lector.nextLine()));
        System.out.print("introducir numero de taxis con la misma licencia: ");
        setNumConMismaLicencia(Integer.parseInt(lector.nextLine()));
        System.out.print("¿Libre? y/n: ");
        libreaux=lector.nextLine();
        if (libreaux.equals("y")||libreaux.equals("Y")) {
            setLibre(true);
        }
        else if(libreaux.equals("n")||libreaux.equals("N")){
            setLibre(false);
        }
    }
}
