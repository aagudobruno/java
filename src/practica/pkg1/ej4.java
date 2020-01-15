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
public class ej4 {

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
}
