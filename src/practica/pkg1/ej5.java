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
public class ej5 {
        
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
}
