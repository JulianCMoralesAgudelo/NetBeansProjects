/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoburbuja;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos: ");
        int elementos = entrada.nextInt();

        int arreglo[] = new int[elementos];
        int aux;

        for (int i = 0; i < elementos; i++) {
            System.out.print("Ingrese la nota numero " + (i + 1) + " : ");
            arreglo[i] = entrada.nextInt();
        }

        // Metodo burbuja
        for (int i = 0; i < elementos - 1; i++) {
            for (int j = 0; j < elementos - 1; j++) {
                // Si numero actual es mayor al siguiente ?
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }

        // Imprimir arreglo ordenado
        System.out.println("");
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("");

    }

}
