/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author julian
 */
public class Vehiculo {

    // Atributos
    private String marca;
    private String modelo;
    private float precio;

    // Constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Metodos
    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio + "\n";
    }

}
