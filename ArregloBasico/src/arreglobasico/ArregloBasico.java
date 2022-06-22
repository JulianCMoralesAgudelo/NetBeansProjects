/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobasico;

/**
 *
 * @author julian
 */
public class ArregloBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = new int[]{1, 8, 5, 9, 4};

        int primero = a[0];
        int ultimo = a[a.length - 1];
        int ultimo2 = a.length - 1;

        System.out.println("Primero: " + primero);
        System.out.println("Ultimo: " + ultimo);
        System.out.println("Ultimo2: " + ultimo2);
    }

}
