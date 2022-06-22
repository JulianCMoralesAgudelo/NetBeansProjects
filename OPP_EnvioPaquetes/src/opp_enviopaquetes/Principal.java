/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_enviopaquetes;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    // Buscar paquete
    public static int buscarPaquete(Paquete paquetex[], int numeroPaquete, int contadorPaquete) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorPaquete; i++) {
            if (paquetex[i].getNumeroPaquete() == numeroPaquete) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    // Buscar sucursal
    public static int buscarSucursal(Sucursal sucursales[], int numeroSucursal, int contadorSucursal) {
        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorSucursal; i++) {
            if (sucursales[i].getNumeroSucursal() == numeroSucursal) {
                encontrado = true;
                indice = i;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lector de datos
        Scanner entrada = new Scanner(System.in);

        // Atributos de la clase sucursal y  paquete
        int numeroSucursal, numeroPaquete = 0, prioridad, opcion, contadorSucursales = 0, contadorPaquetes = 0, indiceSucursal, indicePaquete;
        String direccion, ciudad, cedula;
        double peso, precioPaquete;

        // Creacion de clases
        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];

        // Menu
        do {
            System.out.println("\n\tMENU\n");
            System.out.println("1. Crear nueva sucursal:");
            System.out.println("2. Enviar paquete:");
            System.out.println("3. Consultar sucursal:");
            System.out.println("4. Consultar paquete:");
            System.out.println("5. Mostrar sucursales:");
            System.out.println("6. Mostrar paquetes:");
            System.out.println("7. Salir:");
            System.out.print("\nDigite la opcion del menu: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    // Crear sucursal
                    System.out.print("\nDigite el numero de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    // Limpiar Buffer
                    entrada.nextLine();
                    System.out.print("\nDigite la Ciudad: ");
                    ciudad = entrada.nextLine();
                    System.out.print("\nDigite la direccion: ");
                    direccion = entrada.nextLine();

                    sucursal[contadorSucursales] = new Sucursal(numeroSucursal, direccion, ciudad);
                    contadorSucursales++;
                    break;

                case 2:
                    // Enviar paquete
                    System.out.print("\nDigite el numero de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursales);

                    if (indiceSucursal == -1) {
                        System.out.println("Dicha sucursal no existe");
                    } else {
                        // Caclcular precio paquete
                        System.out.print("\nDigite el numero del paquete: ");
                        numeroPaquete = entrada.nextInt();
                        // Limpiar Buffer
                        entrada.nextLine();
                        System.out.print("\nDigite cedula de la persona: ");
                        cedula = entrada.nextLine();
                        System.out.print("\nDigite peso del paquete: ");
                        peso = entrada.nextDouble();
                        System.out.print("\nDigite prioridad del paquete (0 = Normal, 1 = Alta, 2 = Express ): ");
                        prioridad = entrada.nextInt();

                        paquete[contadorPaquetes] = new Paquete(numeroPaquete, cedula, peso, prioridad);

                        precioPaquete = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquetes]);

                        System.out.print("\nEl precio es: $" + precioPaquete + "\n");
                        contadorPaquetes++;
                    }
                    break;
                case 3:
                    // Consultar sucursal
                    System.out.print("\nDigite el numero de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursales);

                    if (indiceSucursal == -1) {
                        System.out.println("Dicha sucursal no existe");
                    } else {
                        System.out.println("\nLos datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }

                    break;
                case 4:
                    // Consultar Paquete
                    System.out.print("\nDigite el numero de paquete: ");
                    numeroPaquete = entrada.nextInt();

                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquetes);

                    if (indicePaquete == -1) {
                        System.out.println("El paquete no existe");
                    } else {
                        System.out.println("\nLos datos del paquete son: ");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;
                case 5:
                    // Mostrar Sucursales

                    for (int i = 0; i < contadorSucursales; i++) {
                        System.out.println("\nLos datos de la sucursal Nº " + (i + 1) + ":");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break;
                case 6:
                    // Mostrar Paquetes

                    for (int i = 0; i < contadorPaquetes; i++) {
                        System.out.println("\nLos datos de paquete Nº " + (i + 1) + ":");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;
                case 7:
                    System.out.println("Gracias por preferirnos\n");
                    break;
                default:
                    System.out.println("\nOpcion incorrecta");
                    System.out.println("");
                    break;
            }

        } while (opcion != 7);

    }

}
