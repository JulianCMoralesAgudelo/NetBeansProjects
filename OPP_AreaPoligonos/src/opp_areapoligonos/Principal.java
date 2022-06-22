/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_areapoligonos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    // Metodo lector
    static Scanner entrada = new Scanner(System.in);

    // Arreglo de poligonos
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

    public static void main(String[] args) {
        // TODO code application logic here
        llenarPoligono();
        // Mostrar resultados
        mostrarResultados();
    }

    public static void llenarPoligono() {
        int opcion = 0;
        char respuesta;

        do {
            do {
                System.out.println("Digite el tipo de poligono que desea: ");
                System.out.println("1. Triangulo: ");
                System.out.println("2. Rectangulo: ");
                System.out.print("\nOpcion: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    // Llenar un triangulo
                    llenarTriangulo();
                    break;
                case 2:
                    // Llenar un triangulo
                    llenarRectangulo();
                    break;
            }
            System.out.print("\nDesea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.print("\nDesea el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("\nDesea el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("\nDesea el lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Guardamos triangulo dentro del arreglo d epoligonos.
        poligono.add(triangulo);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.print("\nDesea el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("\nDesea el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        // Guardamos triangulo dentro del arreglo d epoligonos.
        poligono.add(rectangulo);
    }

    public static void mostrarResultados() {
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area = " + poli.area());
            System.out.println("");
        }
    }
}
