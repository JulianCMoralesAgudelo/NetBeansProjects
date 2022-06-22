/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayoresymenorespromedio;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class MayoresyMenoresPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int suma = 0;
        double promedio;

        System.out.println("Llenar arreglo:\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite un numero entero: ");
            arreglo[i] = entrada.nextInt();
            suma += arreglo[i];
        }

        promedio = suma / arreglo.length;
        System.out.println("\nEl promedio del arreglo es: " + promedio);

        System.out.println("\nLos numeros mayores al promedio son: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                System.out.println(arreglo[i]);
            }
        }

        System.out.println("\nLos numeros menores al promedio son: ");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < promedio) {
                System.out.println(arreglo[i]);
            }
        }
    }

}
