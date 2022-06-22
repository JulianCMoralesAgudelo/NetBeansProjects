/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desplazararray;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class DesplazarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[10];
        int numero = 0, posicion = 0;

        System.out.println("Llenar arreglo: ");
        for (int i = 0; i < 8; i++) {
            System.out.print((i) + "Digite un numero entero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("\nDigite un numero entero: ");
        numero = entrada.nextInt();

        System.out.print("\nDigite una posicion: ");
        posicion = entrada.nextInt();

        // Correr los elementos detras de la posicion que el usuario quiere
        for (int i = 7; i >= posicion; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        arreglo[posicion] = numero;

        System.out.println("el nuevo arreglo es: ");
        for (int i = 0; i < 9; i++) {
            System.out.println("Posicion " + i + ": " + arreglo[i]);
        }

    }

}
