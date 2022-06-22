/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areavolumencilindro;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class AreaVolumenCilindro {

    /**
     * @param args the command line arguments
     */
    static void area_o_volumen_cilindro(double radio, double altura, char opcion) {

        double volumen, area;
        switch (opcion) {
            case 'v':
                volumen = Math.PI * radio * radio * altura; // radio*radio es el radio al cuadrado
                System.out.println("El volumen es de: " + volumen);
                System.out.println("");
                break;
            case 'a':
                area = 2 * Math.PI * radio * altura + 2 * Math.PI * radio * radio;
                System.out.println("El área es de: " + area);
                System.out.println("");
                break;
            default:
                System.out.println("Indicador del cálculo erróneo");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio, alt;
        char tipo_calculo;
        System.out.print("Introduzca radio: ");
        radio = entrada.nextFloat();
        System.out.print("Introduzca altura: ");
        alt = entrada.nextFloat();
        System.out.print("Que desea calcular (a/v): ");
        tipo_calculo = entrada.next().charAt(0);
        System.out.println("");
        area_o_volumen_cilindro(radio, alt, tipo_calculo);
    }

}
