/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    public static int indiceVehiculo(Vehiculo coches[]) {
        // Variables locales
        int indice = 0;
        float precio = coches[indice].getPrecio();        

        for (int i = 0; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        // Ingreso de datos
        Scanner entrada = new Scanner(System.in);

        // Variables
        String marca, modelo;
        float precio;
        int numVehiculos, indiceCoche;

        // Lectura de datos
        System.out.print("Digite la cantidad de vehiculos: ");
        numVehiculos = entrada.nextInt();

        // Creacion de objetos
        Vehiculo coches[] = new Vehiculo[numVehiculos];

        for (int i = 0; i < coches.length; i++) {
            marca = entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del coche: " + (i + 1));
            System.out.print("\nIntroduzca marca: ");
            marca = entrada.nextLine();
            System.out.print("\nIntroduzca modelo: ");
            modelo = entrada.nextLine();
            System.out.print("\nIntroduzca precio: ");
            precio = entrada.nextFloat();
            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceCoche = indiceVehiculo(coches);

        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceCoche].mostrarDatos());
    }
}
