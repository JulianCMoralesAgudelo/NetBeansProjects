/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desplazararreglo;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class DesplazarArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo = 0, primero = 0;

        ultimo = arreglo.length - 1;
        System.out.println("\nlongitud del arreglo:" + ultimo);
        System.out.println("Llenar arreglo:\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite un numero entero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("\nArreglo original:\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posicion: " + i + " Numero: " + arreglo[i]);
        }

        // Guardar primer elemento array
        primero = arreglo[0];
        System.out.println("\nPrimer numero del arreglo:" + primero);
        
        // Mover elementos una posicion a la derecha
        for (int i = 0; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }

        // Mover mover elemento a a derecha
        arreglo[arreglo.length - 1] = primero;

        System.out.println("\nEl nuevo arreglo:\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posicion: " + i + " Numero: " + arreglo[i]);
        }

        System.out.println("");
    }

}
