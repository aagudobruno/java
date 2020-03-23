package practica3;

import java.util.Scanner;

public class BCoche {
    private String propietario;
    private String matricula;
    private int añoFabricacion;
    private String tipoCarburador;
    private BReparacion reparacion=new BReparacion();
            
    public BCoche(String propietario, String matricula, int añoFabricacion, String tipoCarburador, int numeroNeumaticos, String marca, double  pulgadasLlanta, String fechaCambio) {
        this.propietario = propietario;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
        this.tipoCarburador = tipoCarburador;
        this.reparacion.setNumeroNeumaticos(numeroNeumaticos);
        this.reparacion.setMarca(marca);
        this.reparacion.setPulgadasLlanta(pulgadasLlanta);
        this.reparacion.setFechaCambio(fechaCambio);
    }

    public BCoche() {
    }

    public String getPropietario() {
        return propietario;
    }
    public String getMatricula() {
        return matricula;
    }
    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    public String getTipoCarburador() {
        return tipoCarburador;
    }
    public BReparacion getBReparacion(){
        return reparacion;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public void setTipoCarburador(String tipoCarburador) {
        this.tipoCarburador = tipoCarburador;
    }
    public void setBReparacion(BReparacion reparacion){
        this.reparacion=reparacion;
    }
    
    public void definirCoche(){
        Scanner lector=new Scanner(System.in);
        System.out.print("Introducir nombre del propietario: ");
        this.setPropietario(lector.nextLine());
        System.out.print("Introducir matrícula: ");
        this.setMatricula(lector.nextLine());
        System.out.print("Introducir tipo de carburador: ");
        this.setTipoCarburador(lector.nextLine());
        System.out.print("Introducir año de fabricación del coche: ");
        this.setAñoFabricacion(lector.nextInt());
        reparacion.definirNeumaticos();
    }
    public void mostrarCoche(){
        System.out.println("Nombre del propietario "+this.getPropietario());
        System.out.println("Matrícula "+this.getMatricula());
        System.out.println("Tipo de carburador: "+getTipoCarburador());
        System.out.println("Año de fabricación del coche: "+getAñoFabricacion());
        reparacion.mostrarNeumaticos();
    }
}
