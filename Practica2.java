/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        Scanner lectorTeclado=new Scanner (System.in);
        while (opcion!=7) {        
            System.out.println("*****MENU*****");
            System.out.println(' ');
            System.out.println("1.-Ej 2 ");
            System.out.println("2.-Ej 3 ");
            System.out.println("3.-Ej 4 ");
            System.out.println("4.-Ej 5 ");
            System.out.println("5.-Ej 6 ");
            System.out.println("6.-Ej 7 ");
            System.out.println("7.-Salir ");
            System.out.println("Introducir opción: ");
            opcion=lectorTeclado.nextInt();
            switch (opcion){
                case 1: ej2();
                        break;
                case 2: ej3();
                        break;
                case 3: ej4();
                        break;
                case 4: ej5();
                        break;
                case 5: ej6();
                        break;
                case 6: ej7();
            }
        }
    }
    public static void ej2() {
        //Crear una tabla bidimensional de tamaño 5x5 
        //y rellenarla de la siguiente forma: la posición 
        //T[n,m] debe contener n+m. Después se debe mostrar su contenido.
        int array1[][]=new int [5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                array1[i][j]=i+j;
            }
        }
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.println("I+J"+' '+i+' '+j);
                System.out.println("Contenido"+' '+array1[i][j]);
                System.out.println(' ');
            }
        }
    }
    public static void ej3() {
        //Crear y cargar una tabla de tamaño 4x4 y decir si es 
        //simétrica o no, es decir, si se obtiene la misma tabla al 
        //cambiar filas por columnas.    
        int array1[][]=new int[4][4];
        int auxArr[][]=new int[4][4];
        int contador=0;
        int varAux=0;
        Scanner lector=new Scanner(System.in);
        for (int i=0;i<4;i++){
             for (int j=0;j<4;j++){
                 System.out.println("Introducir numero para"+' '+i+' '+j);
                 varAux=lector.nextInt();
                 array1[i][j]=varAux;
             }
        }
        for (int i=0;i<4;i++){
             for (int j=0;j<4;j++){
                 auxArr[i][j]=array1[j][i];
             }
        }
        for (int i=0;i<4;i++){
             for (int j=0;j<4;j++){
                 if (auxArr[i][j]==array1[i][j]){
                    contador++;
                }
             }
        }
        if (contador==16){
            System.out.println("El array SI es simétrico");
        }
        else{
            System.out.println("El array NO es simétrico");
        }
    }
    public static void ej4(){
        int array1[][]=new int[3][3];
        int array2[][]=new int[3][3];
        int arraySuma[][]=new int[4][4];
        int contador=0;
        int varAux=0;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introducir array1: ");
        for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 System.out.println("Indice actual "+i+", "+j);
                 varAux=lector.nextInt();
                 array1[i][j]=varAux;
             }
        }
        System.out.println("Introducir array2: ");
        for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 System.out.println("Indice actual "+i+", "+j);
                 varAux=lector.nextInt();
                 array2[i][j]=varAux;
             }
        }
        for (int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                 arraySuma[i][j]=array1[i][j]+array2[i][j];
             }
        }
        System.out.println("La suma de los 2 arrays introducidos es: "+arraySuma);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arraySuma[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void ej5(){
        //Crear y cargar dos matrices de tamaño 3x3, sumarlas 
        //y mostrar su suma.
        int array1[][]=new int[7][7];
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if (j==i){
                    array1[i][j]=1;
                }
                else{
                    array1[i][j]=0;
                }
            }
        }
        System.out.println("Array creado");
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                System.out.print(array1[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void ej6(){
        //Crear una matriz “marco” de tamaño 8x6: 
        //todos sus elementos deben ser 0 salvo los de 
        //los bordes que deben ser 1. Mostrar la matriz.
        int array1[][]=new int[6][8];
        for (int i=0;i<6;i++){
            for (int j=0;j<8;j++){
                if(i==0||i==5||j==0||j==7){
                    array1[i][j]=1;
                }
                else{
                    array1[i][j]=0;
                }
            }
        }
        System.out.println("El array creado es: ");
        for (int i=0;i<6;i++){
            for (int j=0;j<8;j++){
                System.out.print(array1[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void ej7(){
        //Crear una matriz “marco” cuyo tamaño se pedirá al 
        //usuario por teclado. Todos sus elementos deben ser 0 
        //salvo los de los bordes que deben ser 1. Mostrar la matriz. 
        Scanner lector=new Scanner(System.in);
        System.out.print("Intrducir longitud eje X: ");
        int varAuxX=lector.nextInt();
        System.out.println(' ');
        System.out.print("Intrducir longitud eje Y: ");
        int varAuxY=lector.nextInt();
        System.out.println(' ');
        int array1[][]=new int[varAuxY][varAuxX];
        for (int i=0;i<varAuxY;i++){
            for (int j=0;j<varAuxX;j++){
                if(i==0||i==varAuxY-1||j==0||j==varAuxX-1){
                    array1[i][j]=1;
                }
                else{
                    array1[i][j]=0;
                }
            }
        }
        System.out.println("El array creado es: ");
        for (int i=0;i<varAuxY;i++){
            for (int j=0;j<varAuxX;j++){
                System.out.print(array1[i][j]);
            }
            System.out.println(" ");
        }
    }
}
