package practica4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adria
 */
public class APelicula {
    private int Id=0; 
    private String Titulo;
    private String Director;
    private double Duracion;
    private String Genero;
    private int Año;
    private boolean Disponibilidad;
    private int Cantidad_copias_total_pelicula;
    private int Cantidad_copias_reservadas;
    static int Copias_totales_videoclub;
    
    public APelicula(int Id, String Titulo, String Director, double Duracion, String Genero, int Año, boolean Disponibilidad, int Cantidad_copias_total, int Cantidad_copias_reservadas) {
        this.Id = Id;
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
        this.Genero = Genero;
        this.Año = Año;
        this.Disponibilidad = Disponibilidad;
        this.Cantidad_copias_total_pelicula = Cantidad_copias_total;
        this.Cantidad_copias_reservadas = Cantidad_copias_reservadas;
    }
    
    public APelicula() {
    }
    public void setId(int Id) {
        this.Id =Id;
    }
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    public void setDirector(String Director) {
        this.Director = Director;
    }
    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    public void setAño(int Año) {
        this.Año = Año;
    }
    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    public void setCantidad_copias_total_pelicula(int Cantidad_copias_total) {
        this.Cantidad_copias_total_pelicula = Cantidad_copias_total;
    }
    public void setCantidad_copias_reservadas(int Cantidad_copias_reservadas) {
        this.Cantidad_copias_reservadas = Cantidad_copias_reservadas;
    }

    public int getId() {
        return Id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public String getDirector() {
        return Director;
    }
    public double getDuracion() {
        return Duracion;
    }
    public String getGenero() {
        return Genero;
    }
    public int getAño() {
        return Año;
    }
    public boolean getDisponibilidad() {
        return Disponibilidad;
    }
    public int getCantidad_copias_total_pelicula() {
        return Cantidad_copias_total_pelicula;
    }
    public int getCantidad_copias_reservadas() {
        return Cantidad_copias_reservadas;
    }
    
    public void añadirPelicula(ArrayList<APelicula> lista){
            int cantidad;
            APelicula pelicula=new APelicula();
            Scanner lector=new Scanner(System.in);
            System.out.print("Introducir cantidad de copias total de la pelicula: ");
            cantidad=Integer.parseInt(lector.nextLine());
            if (this.Copias_totales_videoclub+cantidad<3001){
                pelicula.setCantidad_copias_total_pelicula(cantidad);
                System.out.print("Introducir título: ");
                pelicula.setTitulo(lector.nextLine());
                System.out.print("Introducir director: ");
                pelicula.setDirector(lector.nextLine());
                System.out.print("Introducir género: ");
                pelicula.setGenero(lector.nextLine());
                System.out.print("Introducir duración: ");
                pelicula.setDuracion(Double.parseDouble(lector.nextLine()));
                System.out.print("Introducir año: ");
                pelicula.setAño(Integer.parseInt(lector.nextLine()));
                pelicula.setCantidad_copias_reservadas(0);             
                pelicula.setDisponibilidad(true);
                pelicula.ponerID(lista);
                lista.add(pelicula);
                this.Copias_totales_videoclub=this.Copias_totales_videoclub+cantidad;
            }
            else{
                System.out.println("Supera la cantidad de copias que puede contener el videoclub");
            }
    }
    
    public static void listarPeliculas(ArrayList<APelicula> lista){
        for (int i=0;i<lista.size();i++){
            System.out.print("Id: "+lista.get(i).getId()+' ');
            System.out.print("Título: "+lista.get(i).getTitulo()+' ');
            System.out.print("Director: "+lista.get(i).getDirector()+' ');
            System.out.print("Género: "+lista.get(i).getGenero()+' ');
            System.out.print("Duración: "+lista.get(i).getDuracion()+' ');
            if (lista.get(i).getDisponibilidad()) {
                System.out.print("Estado: Disponible");
            }
            else{
                System.out.print("Estado: No disponible");
            }
            System.out.println("");
        }
    }
    
    public static void reservarPelicula(ArrayList<APelicula> lista) {
        int id;
        Scanner lector=new Scanner(System.in);
        listarPeliculas(lista);
        System.out.print("Introducir Id de la película a reservar: ");
        id=Integer.parseInt(lector.nextLine());
        if (lista.get(id-1).getDisponibilidad()){
            lista.get(id-1).setCantidad_copias_reservadas(lista.get(id-1).getCantidad_copias_reservadas()+1);
            if (lista.get(id-1).getCantidad_copias_reservadas()==lista.get(id-1).getCantidad_copias_total_pelicula()) {
                lista.get(id-1).setDisponibilidad(false);
            }
            System.out.println("La película fué reservada.");
        }
        else{
            System.out.println("Película no disponible.");
        }
    }
    
    public static void buscarPelícula(ArrayList<APelicula> lista) {
        String cosaAbuscar;
        Scanner lector=new Scanner(System.in);
        int opcion;
        int idAñoDuracion;
        System.out.println("Seleccionar tipo de busqueda");
        System.out.println("1.- ID");
        System.out.println("2.- Título");
        System.out.println("3.- Director");
        System.out.println("4.- Género");
        System.out.println("5.- Duración");
        System.out.println("6.- Año");
        System.out.println("Introducir tipo de busqueda: ");
        opcion=Integer.parseInt(lector.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Introducir ID: ");
                    cosaAbuscar=lector.nextLine();
                    buscadorID(Integer.parseInt(cosaAbuscar),lista);                 
                    break;
                case 2:
                    System.out.println("Introducir Título: ");
                    cosaAbuscar=lector.nextLine();
                    buscadorTitulo(cosaAbuscar,lista);
                    break;
                case 3:
                    System.out.println("Introducir Director: ");
                    cosaAbuscar=lector.nextLine();
                    buscadorDirector(cosaAbuscar,lista); 
                    break;
                case 4:
                    System.out.println("Introducir Género: ");
                    cosaAbuscar=lector.nextLine();
                    buscadorGenero(cosaAbuscar,lista);
                    break;
                case 5:
                    System.out.println("Introducir Duración: ");
                    cosaAbuscar=lector.nextLine();
                    buscadorDuracion(Integer.parseInt(cosaAbuscar),lista);
                    break;
                case 6:
                    System.out.println("Introducir Año: ");
                    cosaAbuscar=lector.nextLine();
                    buscadorAño(Integer.parseInt(cosaAbuscar),lista);  
                    break;
            }
    }
    
    private static void buscadorID(int cosaAbuscar,ArrayList<APelicula> lista){
            for (int i=0;i<lista.size();i++){
                if(lista.get(i).getId()==cosaAbuscar){
                    System.out.println(lista.get(i).getTitulo());
                }
            } 
    }
    
    private static void buscadorTitulo(String cosaAbuscar,ArrayList<APelicula> lista){
            for (int i=0;i<lista.size();i++){
                if(lista.get(i).getTitulo().contains(cosaAbuscar)){
                    System.out.println(lista.get(i).getTitulo());
                }
            } 
        }
    
    private static void buscadorDirector(String cosaAbuscar,ArrayList<APelicula> lista){
            for (int i=0;i<lista.size();i++){
                if(lista.get(i).getDirector().contains(cosaAbuscar)){
                    System.out.println(lista.get(i).getTitulo());
                }
            } 
        }
    
    private static void buscadorGenero(String cosaAbuscar,ArrayList<APelicula> lista){
            for (int i=0;i<lista.size();i++){
                if(lista.get(i).getGenero().contains(cosaAbuscar)){
                    System.out.println(lista.get(i).getTitulo());
                }
            } 
        }
    
    private static void buscadorDuracion(int cosaAbuscar,ArrayList<APelicula> lista){
            for (int i=0;i<lista.size();i++){
                if(lista.get(i).getDuracion()==cosaAbuscar){
                    System.out.println(lista.get(i).getTitulo());
                }
            } 
    }
    
    private static void buscadorAño(int cosaAbuscar,ArrayList<APelicula> lista){
            for (int i=0;i<lista.size();i++){
                if(lista.get(i).getAño()==cosaAbuscar){
                    System.out.println(lista.get(i).getTitulo());
                }
            } 
    }
    private void ponerID(ArrayList<APelicula> lista){
        this.Id=lista.size()+1;
    }
}

