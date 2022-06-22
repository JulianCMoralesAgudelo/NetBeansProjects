/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenararreglos;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class ConcatenarArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int a[], b[], c[];

        a = new int[10];
        b = new int[10];
        c = new int[a.length + b.length];

        System.out.println("\nDigite lo numeros para llenar los arreglos");
        for (int i = 0; i < c.length; i++) {

            System.out.print("\nDigite un numero entero: ");

            if (i < 10) {
                a[i] = entrada.nextInt();
            } else {
                b[i % 10] = entrada.nextInt();
            }
        }

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        System.out.println("\nArreglo a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println("\nArreglo b: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }

        System.out.println("\nArreglo c: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        System.out.println("");

    }

}
