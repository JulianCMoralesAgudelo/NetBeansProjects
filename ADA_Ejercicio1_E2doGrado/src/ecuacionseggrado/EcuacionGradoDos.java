/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionseggrado;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class EcuacionGradoDos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a, b, c; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante

        System.out.print("\nIntroduzca primer coeficiente (a): ");
        a = entrada.nextInt();
        System.out.print("\nIntroduzca segundo coeficiente: (b): ");
        b = entrada.nextInt();
        System.out.print("\nIntroduzca tercer coeficiente: (c): ");
        c = entrada.nextInt();

        // calculamos el determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0) {
            System.out.println("\nNo existen soluciones reales");
        } else {
            // queda confirmar que a sea distinto de 0.
            // si a = 0 nos encontramos una división por cero.
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("\nSolución: " + x1);
            System.out.println("\nSolución: " + x2);
            System.out.println("");
        }
    }
}
