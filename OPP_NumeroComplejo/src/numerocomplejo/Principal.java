/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerocomplejo;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    public static void main(String[] args) {
        // Lector de datos
        Scanner entrada = new Scanner(System.in);
        // Variables
        NumeroComplejo numero1, numero2, suma, mult;
        double a, b, c, d;
        int opcion = 0, entero = 0;
        // Operaciones
        do {
            System.out.print("\t\nOperaciones con Numeros Complejos: ");
            System.out.print("\n1: Sumar Numeros Complejos: ");
            System.out.print("\n2: Multiplicar Numeros Complejos: ");
            System.out.print("\n3: Comparar Numeros Complejos: ");
            System.out.print("\n4: Multiplicar Numeros Complejos por un entero: ");
            System.out.print("\n5: Salir:\n");
            System.out.print("\nDigite una opcion del menu:");
            opcion = entrada.nextInt();

            System.out.println("\n");

            switch (opcion) {
                case 1:
                    // Sumar Numeros Complejos
                    System.out.println("\nDigite el primer numero complejo: ");
                    System.out.print("\nDigite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("\nDigite la parte imaginaria: ");
                    b = entrada.nextDouble();

                    System.out.println("\nDigite el segundo numero complejo: ");
                    System.out.print("\nDigite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("\nDigite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    suma = numero1.sumarComplejos(numero2);

                    System.out.println("\nLa suma es: " + suma.getA() + " + " + suma.getB() + " i");

                    break;
                case 2:
                    // Multiplicar Numeros Complejos
                    System.out.println("\nDigite el primer numero complejo: ");
                    System.out.print("\nDigite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("\nDigite la parte imaginaria: ");
                    b = entrada.nextDouble();

                    System.out.println("\nDigite el segundo numero complejo: ");
                    System.out.print("\nDigite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("\nDigite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    mult = numero1.productoComplejos(numero2);

                    System.out.println("\nEl producto es: " + mult.getA() + " + " + mult.getB() + " i");

                    break;
                case 3:
                    // Comparar Numeros Complejos
                    System.out.println("\nDigite el primer numero complejo: ");
                    System.out.print("\nDigite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("\nDigite la parte imaginaria: ");
                    b = entrada.nextDouble();

                    System.out.println("\nDigite el segundo numero complejo: ");
                    System.out.print("\nDigite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("\nDigite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new NumeroComplejo(a, b);
                    numero2 = new NumeroComplejo(c, d);

                    if (numero1.compararComplejos(numero2)) {
                        System.out.println("\nLos numeros son iguales.");
                    } else {
                        System.out.println("\nLos numeros no son iguales.");
                    }

                    break;
                case 4:
                    // Multiplicar Numeros Complejos por un entero
                    System.out.println("\nDigite el numero complejo: ");
                    System.out.print("\nDigite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("\nDigite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("\nDigite el numero entero: ");
                    entero = entrada.nextInt();

                    numero1 = new NumeroComplejo(a, b);

                    mult = numero1.multiplicarPorEntero(entero);

                    System.out.println("\nEl producto por el numero entero es: " + mult.getA() + " * " + mult.getB() + " i");
                case 5:
                    System.out.print("Suerte es que te digo\n");
                    break;
                default:
                    System.out.println("Dato inesperado, intente nuevamente");
                    break;
            }
        } while (opcion != 5);
        System.out.println("");
    }
}