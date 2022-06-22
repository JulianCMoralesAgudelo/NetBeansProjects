/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetroisoceles;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    public static double mayorArea(TrianguloIsoceles triangulos[]) {
        // Variables locales
        double area = triangulos[0].obtenerArea();

        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {

        // Lector de datos
        Scanner entrada = new Scanner(System.in);

        // Variables locales
        double base, lado;
        int nTriangulos;

        System.out.print("\nDigite el numero de triangulos: ");
        nTriangulos = entrada.nextInt();

        // Creacion de objetos
        TrianguloIsoceles triangulos[] = new TrianguloIsoceles[nTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.print("\nDigite el los datos del triangulo: " + (i + 1) + "\n");
            System.out.print("\nDigite la base: ");
            base = entrada.nextDouble();
            System.out.print("\nDigite el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new TrianguloIsoceles(base, lado);
            System.out.println("\nEl perimetro del triangualo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("\nEl area del triangualo es: " + triangulos[i].obtenerArea());
        }
        System.out.println("\nEl area del triangulo de mayor superficie es: " + mayorArea(triangulos));
        System.out.println("");
    }

}
