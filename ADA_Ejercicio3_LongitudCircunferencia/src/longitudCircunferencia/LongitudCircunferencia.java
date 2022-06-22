/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longitudCircunferencia;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class LongitudCircunferencia {

    public static void main(String[] args) {
        // Lector de datos
        Scanner entrada = new Scanner(System.in);
        double l, r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r = entrada.nextFloat();
        l = 2 * Math.PI * r;
        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
        System.out.println("");

    }

}
