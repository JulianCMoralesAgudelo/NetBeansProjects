/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author julian
 */

// Clase padre
public class Vehiculo {

    // Atributos
    protected String matricula;
    protected String marca;
    protected String modelo;

    // Constructor
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodos
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Metodos
    public String mostrarDatos() {
        return "Matricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo;
    }

}
