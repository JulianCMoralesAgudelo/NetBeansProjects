/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
        int i = 0, indice = 0;
        boolean encontrado = false;

        // Busqueda secuencial
        while (i < cuentas.length && encontrado == false) {
            if (cuentas[i].getNumeroCuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }

        if (encontrado == false) {
            indice = -1;
        }

        return indice;
    }

    public static void main(String[] args) {
        // lector de datos
        Scanner entrada = new Scanner(System.in);
        // Variables primitivas
        int numeroCuenta, nCuentas, opcion, indiceCuenta;
        double saldo, cantidad;
        // Variables de tipo objeto
        String nombre, apellido, cedula;
        Cuenta cuentas[];
        Cliente cliente;
        
    // Ingreso de datos
        System.out.print("\nDigite nombres del cliente: ");
        nombre = entrada.nextLine();
        System.out.print("\nDigite apellidos del cliente: ");
        apellido = entrada.nextLine();
        System.out.print("\nDigite cedula cliente: ");
        cedula = entrada.nextLine();
        System.out.print("\nDigite cuantas cuentas que posee: ");
        nCuentas = entrada.nextInt();

        cuentas = new Cuenta[nCuentas];

        for (int i = 0; i < cuentas.length; i++) {
            // Crear cuentas
            System.out.println("\nDigite los datos para la cuenta: " + (i + 1));
            System.out.print("\nDigite el numero de cuenta: ");
            numeroCuenta = entrada.nextInt();
            System.out.print("\nDigite el saldo de la cuenta: ");
            saldo = entrada.nextDouble();

            // Se inicializa objeto cuenta
            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }

        // Inicializar objeto cliente
        cliente = new Cliente(nombre, apellido, cedula, cuentas);

        // Menu de operaciones
        do {
            System.out.println("");
            System.out.print("\tMENU ");
            System.out.print("\n1. Ingresar saldo: ");
            System.out.print("\n2. Retirar saldo: ");
            System.out.print("\n3. Consultar saldo: ");
            System.out.print("\n4. Salir:\n");
            System.out.print("\nDigite una opcion del menu: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    // Ingresar saldo
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if (indiceCuenta == -1) {
                        System.out.println("\nNumero de cuenta invalido. ");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero a ingresar en la cuenta: ");
                        cantidad = entrada.nextDouble();
                        cliente.ingresarSaldo(indiceCuenta, cantidad);
                        System.out.println("\nIngreso realizado correctamente");
                        System.out.println("\nSaldo disponible: " + cliente.consultarSaldo(indiceCuenta) + "$\n");
                    }
                    break;
                case 2:
                    // Retirar saldo
                    System.out.print("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        System.out.println("Numero de cuenta invalido. ");
                    } else {
                        System.out.print("\nDigite la cantidad de dinero a retirar: ");
                        cantidad = entrada.nextDouble();
                        if (cantidad > cliente.consultarSaldo(indiceCuenta)) {
                            System.out.println("\nSaldo insuficiencte");
                        } else {
                            cliente.retirarSaldo(indiceCuenta, cantidad);
                            System.out.println("\nRetiro realizado correctamente");
                            System.out.println("\nSaldo disponible: " + cliente.consultarSaldo(indiceCuenta) + "$\n");
                        }
                    }
                    break;
                case 3:
                    // Consultar saldo
                    System.out.println("\nDigite el numero de cuenta: ");
                    numeroCuenta = entrada.nextInt();
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
                    if (indiceCuenta == -1) {
                        System.out.println("Numero de cuenta invalido. ");
                    } else {
                        System.out.println("\nSaldo disponible: " + cliente.consultarSaldo(indiceCuenta) + "$\n");
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("Suerte es que te digo");
                    break;
                default:
                    System.out.println("Numero de cuenta invalido. ");
                    break;
            }
            System.out.println("");
        } while (opcion != 4);
    }
}
