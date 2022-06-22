/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayormenorarreglo;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class MayorMenorArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[12];
        int pMayor = 0;
        int pMenor = 0;

        System.out.println("Llenar arreglo:\n");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite un numero entero: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("\nBuscar numero mayor y menor:\n");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > pMayor) {
                pMayor = i;
            } else {
                pMenor = i;
            }
        }

        System.out.println("Número mayor: " + arreglo[pMayor] + " en la posicion: " + pMayor);
        System.out.println("Número mayor: " + arreglo[pMenor] + " en la posicion: " + pMenor);
        
        System.out.println("");

    }

}
