/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mezclararregos;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class MezclarArregos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int a[], b[], c[];
        int i, j;

        a = new int[12];
        b = new int[12];
        c = new int[a.length + b.length];

        System.out.println("Llenar arreglo A:");
        for (i = 0; i < a.length; i++) {
            System.out.print("Digite un numero entero: ");
            a[i] = entrada.nextInt();
        }

        System.out.println("Llenar arreglo B:");
        for (i = 0; i < b.length; i++) {
            System.out.print("Digite un numero entero: ");
            b[i] = entrada.nextInt();
        }

        i = 0;
        j = 0;

        while (i < 12) {
            // Copiar los tres elementos de a[]
            for (int k = 0; k < 3; k++) {
                c[j] = a[i + k];
                j++;
            }

            // Copiar los tres elementos de b[]
            for (int k = 0; k < 3; k++) {
                c[j] = b[i + k];
                j++;
            }
            i += 3;
        }

        System.out.println("El arreglo A es: ");
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " - ");
        }

        System.out.println("\nEl arreglo B es: ");
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + " - ");
        }

        System.out.println("\nEl arreglo resultante es: ");
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k] + " - ");
        }
    }

}
