/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    public static int indiceGanador(Atleta atletas[]) {
        // Variables locales        
        int indice = 0;
        float tiempoCarrera = atletas[indice].getTiempoCarrera();

        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        // Lector de datos
        Scanner entrada = new Scanner(System.in);

        // Variables locales
        String nombre;
        int numeroAtleta, canAtletas, indiceWinner;
        float tiempoCarrera;

        System.out.print("\nDigite la cantidad de atletas a participar en la carrera: ");
        canAtletas = entrada.nextInt();

        // Creacion de objetos
        Atleta atletas[] = new Atleta[canAtletas];

        for (int i = 0; i < atletas.length; i++) {
            System.out.print("\nDigite los datos del atleta: " + (i + 1) + "\n");
            System.out.print("\nIntroduzca numero atleta: ");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("\nIntroduzca nombre atleta: ");
            nombre = entrada.nextLine();
            System.out.print("\nIntroduzca tiempo de carrera: ");
            tiempoCarrera = entrada.nextFloat();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }

        indiceWinner = indiceGanador(atletas);
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(atletas[indiceWinner].mostraDatosGanador());
    }

}
