/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_herencia;

/**
 *
 * @author julian
 */
public class Estudiante extends Persona {

    // Atributos
    private int codigoEstudiante;
    private float notaFinal;

    // Constructor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    // Metodos
    public void mostrarDatos() {
        System.out.println("\nNombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nEdad: " + getEdad()
                + "\nCodigo Estudiante: " + codigoEstudiante
                + "\nNota final: " + notaFinal + "\n");
    }

}
