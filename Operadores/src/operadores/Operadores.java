/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        float numero1, numero2, suma, resta, mult, div, resto;

        System.out.println("Ingrese un numero: ");
        numero1 = entrada.nextFloat();
        System.out.println("Ingrese un numero: ");
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion  es: " + mult);
        System.out.println("La division es: " + div);
        System.out.println("El resto es: " + resto);
    }

}
