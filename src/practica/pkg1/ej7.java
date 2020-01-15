/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class ej7 {
        public static void main(String[] args)throws Exception{
            System.out.println("****MENU****");
            System.out.println("*1         *");
            System.out.println("*2         *");
            System.out.println("*3         *");
            System.out.println("*4         *");
            System.out.println("*5         *");
            System.out.println("*6         *");
            System.out.println("*7  EXIT   *");
            Scanner escaner=new Scanner(System.in);
            int opcion=escaner.nextInt();
            while (opcion!=7) {     
               if (opcion!=7){ 
                switch (opcion){
                    case 1: 
                        ej1();
                        main(args);
                        break;
                     case 2: 
                         ej2();
                         main(args);
                        break;
                     case 3: 
                         ej3();
                         main(args);
                        break;
                     case 4: 
                         ej4();
                         main(args);
                        break;
                     case 5: 
                         ej5();
                         main(args);
                        break;
                     case 6: 
                         ej6();
                         main(args);
                        break;   
                }
               }        
            }
        }
       
        public static void ej1()throws Exception{
            int[] numeros=new int [5];
            Scanner lector=new Scanner(System.in);
            for (int i=0;i<5;i++){
                System.out.print("Introducir número: ");
               int varAux=lector.nextInt();
               numeros[i]=varAux;
            }    
            for (int i=0;i<numeros.length;i++){
               System.out.println(numeros[i]);
            }
        }
       
        public static void ej2()throws Exception{
             int[] numeros=new int [5];
             Scanner lector=new Scanner(System.in);
             for (int i=0;i<5;i++){
                System.out.print("Introducir número: ");
                int varAux=lector.nextInt();
                numeros[i]=varAux;
            }    
             for (int i=numeros.length-1;i>=0;i--){
                System.out.println(numeros[i]);
            }
        }
        public static void ej3()throws Exception{
            int[] numeros = new int[5];
            int contPositivos = 0;
            int[] Positivos = new int[5];
            int contNegativos = 0;
            int contCero = 0;
            int[] Negativos = new int[5];
            Scanner lector = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.print("Introducir número: ");
                int varAux = lector.nextInt();
                numeros[i] = varAux;
            }
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0) {
                    Positivos[i] = numeros[i];
                    contPositivos++;
                } else if (numeros[i] < 0) {
                    Negativos[i] = numeros[i];
                    contNegativos++;
                } else if (numeros[i] == 0) {
                    contCero++;
                }
            }
            double varAux2 = 0;
            for (int i = 0; i < Positivos.length; i++) {
                varAux2 = varAux2 + Positivos[i];
            }
            System.out.println("La media de los positivos es: " + varAux2 / contPositivos);
            varAux2 = 0;
            for (int i = 0; i < Negativos.length; i++) {
                varAux2 = varAux2 + Negativos[i];
            }
            System.out.println("La media de los negativos es: " + varAux2 / contNegativos);
            System.out.println("El número de ceros es: " + contCero);
        }
       
        public static void ej4()throws Exception{
            int[] numeros = new int[10];
            int i1 = 0;
            int i2 = 9;
            Scanner lector = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.print("Introducir número: ");
                int varAux = lector.nextInt();
                numeros[i] = varAux;
            }
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(numeros[i1]);
                    i1++;
                } else {
                    System.out.println(numeros[i2]);
                    i2--;
                }
            }
        }
       
        public static void ej5()throws Exception{
            int[] numeros1 = new int[10];
            int[] numeros2 = new int[10];
            int[] numeros3 = new int[20];
            int i1 = 0;
            int i2 = 0;
            Scanner lector = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.print("Introducir número tabla 1: ");
                int varAux = lector.nextInt();
                numeros2[i] = varAux;
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("Introducir número tabla 2: ");
                int varAux2 = lector.nextInt();
                numeros1[i] = varAux2;
            }
            System.out.println("");
            for (int i = 0; i < 20; i++) {
                if (i % 2 == 0) {
                    numeros3[i] = numeros2[i1];
                    i1++;
                } else {
                    numeros3[i] = numeros1[i2];
                    i2++;
                }
            }
            for (int i = 0; i < 20; i++) {
                System.out.println(numeros3[i]);
            }

        }
        
        public static void ej6()throws Exception{
         int[] numeros1=new int [12];
         int[] numeros2=new int [12];
         int[] numeros3=new int [24];
         int i1=0;
         int i2=0;
         Scanner lector=new Scanner(System.in);
         for (int i=0;i<12;i++){
             System.out.print("Introducir número tabla 1: ");
             int varAux=lector.nextInt();
             numeros2[i]=varAux;
         }   
         for (int i=0;i<12;i++){
             System.out.print("Introducir número tabla 2: ");
             int varAux2=lector.nextInt();
             numeros1[i]=varAux2;
         }  
         System.out.println("");
         for (int i=0;i<24;i++){
             if (i==3||i==4||i==5||i==9||i==10||i==11||i==15||i==16||i==17||i==21||i==22||i==23){
                 numeros3[i]=numeros2[i1];
                 i1++;
             }
             else{
                 numeros3[i]=numeros1[i2];
                 i2++;
             }
         }
         for (int i=0;i<24;i++){
            System.out.println(numeros3[i]);
         }
         
    }

}
