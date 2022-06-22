/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author julian
 */
public class Principal {

    public static void main(String[] args) {
        MusicoEstudiante musicoEstudiante = new MusicoEstudiante();

        // Metodos
        System.out.println("");
        musicoEstudiante.hablar();
        musicoEstudiante.tocarMusica();
        musicoEstudiante.estudiar();
        System.out.println("");
    }

}
