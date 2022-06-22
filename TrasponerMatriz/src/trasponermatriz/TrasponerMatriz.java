/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trasponermatriz;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class TrasponerMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int filas = 3;
        int columnas = 4;

        int mOne[][] = new int[filas][columnas];
        int mTwo[][] = new int[columnas][filas];
        
        System.out.println();

       System.out.println("Llenar matriz:\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                mOne[i][j] = entrada.nextInt();
            }
        }

        // Imprimir matriz
        System.out.println("Matriz ingresada:\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mOne[i][j] + " ");
            }
            System.out.println("");
        }

        // Trasponer mOne en mTwo
        System.out.println("Traspuesta:\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mTwo[j][i] = mOne[i][j];
            }
        }

        // Imprimir resultado
        System.out.println("Matriz ingresada:\n");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(mTwo[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
