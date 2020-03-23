package practica52;

import java.util.Scanner;

public class Autobus extends Vehiculo{
    private int numeroPlazas;
    private int numeroParadas;

    public Autobus(int numeroPlazas, int numeroParadas) {
        this.numeroPlazas = numeroPlazas;
        this.numeroParadas = numeroParadas;
    }

    public Autobus() {
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("numero de paradas"+' '+this.numeroParadas);
        System.out.println("numero de plazas"+' '+this.numeroPlazas);
    }
    
    @Override
    public void DarDeAlta(){
        int cosaAmeter;
        Scanner lector=new Scanner(System.in);
        super.DarDeAlta();
        System.out.print("introducir numero de plazas: ");
        setNumeroPlazas(Integer.parseInt(lector.nextLine()));
        System.out.print("introducir numero de paradas (3-20): ");
        cosaAmeter = Integer.parseInt(lector.nextLine());
        while (cosaAmeter > 20||cosaAmeter < 3) {
            System.out.print("Km de radio de accion no válido, introducir radio válido: ");
             cosaAmeter = Integer.parseInt(lector.nextLine());
        }
        setNumeroParadas(cosaAmeter);
    }
}
