/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrocirculo;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class AreaPerimetroCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // Área y radio
        double a, r;
        System.out.print("Introduce el radio de un circulo: ");//
        // Leemos o pedimos el radio
        r = sc.nextDouble();
        // Calculamos el area del circulo
        a = Math.PI * Math.pow(r, 2);
        // Imprimimos el resultado
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);        
        System.out.println("");

    }

}
