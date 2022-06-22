/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta;

/**
 *
 * @author julian
 */
public class Atleta {

    // Atributos    
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    // Constructor
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    // Metodos
    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostraDatosGanador() {
        return "Numero de atleta: " + numeroAtleta + "\nNombre de atleta: " + nombre + "\nTiempo Carrera: " + tiempoCarrera + "\n";
    }

}
