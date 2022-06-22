/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class AreaCirculo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r = entrada.nextFloat();
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
        System.out.println("");
    }

}
