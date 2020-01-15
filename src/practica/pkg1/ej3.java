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
public class ej3 {
        
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
        }
}