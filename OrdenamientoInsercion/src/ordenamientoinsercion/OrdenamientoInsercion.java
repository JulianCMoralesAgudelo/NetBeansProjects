/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoinsercion;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class OrdenamientoInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int elementos = entrada.nextInt();

        int arreglo[] = new int[elementos];
        int pos, aux;

        // Llenar arreglo
        for (int i = 0; i < elementos; i++) {
            System.out.print("Ingrese la nota numero " + (i + 1) + " : ");
            arreglo[i] = entrada.nextInt();
        }

        // Metodo insercion
        for (int i = 0; i < elementos; i++) {
            pos = i;
            aux = arreglo[i];
            // Mientras que la posicion se mayor a cero y el numero a la izquierda sea mayor al actual que esta en pos
            while (pos > 0 && arreglo[pos - 1] > aux) {
                // Intercambio de numeros hacia la izquierda
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            // Actualizar numero actual
            arreglo[pos] = aux;
        }

        // Imprimir arreglo ordenado
        System.out.println("\nOrden ascendente");
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\n");

        // Imprimir arreglo ordenado
        System.out.println("\nOrden descentente");
        for (int i = elementos - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("\n\n");
    }

}
