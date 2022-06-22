/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerordenarray;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class LeerOrdenArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int a[] = new int[10];
        boolean asc = false, des = false;

        System.out.println("Llenar arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite un numero entero: ");
            a[i] = entrada.nextInt();
        }

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                asc = true;
            }

            if (a[i] > a[i + 1]) {
                des = true;
            }
        }

        if (asc && !des) {
            System.out.println("El arreglo es ascendente");
        } else if (!asc && des) {
            System.out.println("El arreglo es descedente");
        } else if (asc && des) {
            System.out.println("El arreglo es desordenado");
        } else if (!asc && !des) {
            System.out.println("Los datos son iguales");
        }

    }

}
