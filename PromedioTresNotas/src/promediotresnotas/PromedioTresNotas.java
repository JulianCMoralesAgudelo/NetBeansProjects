/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promediotresnotas;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class PromedioTresNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        double arreglo[];
        int notas;
        double promedio = 0;

        System.out.print("Ingrese la cantidad de notas a promediar: ");
        notas = entrada.nextInt();

        arreglo = new double[notas];

        System.out.println("\nAlmacenar notas:\n");
        for (int i = 0; i < notas; i++) {
            System.out.print("Ingrese la nota numero " + (i + 1) + " : ");
            arreglo[i] = entrada.nextDouble();
            promedio += arreglo[i];
        }

        promedio /= notas;

        System.out.println("El promedio de notas es: " + promedio);
        
        System.out.println("");
    }

}
