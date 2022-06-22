/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_enviopaquetes;

/**
 *
 * @author julian
 */
public class Paquete {

    // Atributos
    private int numeroPaquete;
    private String cedula;
    private double peso;
    // Prioridad -> 0=normal, 1=alta, 2=express
    private int prioridad;

    // Constructor
    public Paquete(int numeroPaquete, String cedula, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.cedula = cedula;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    // Getters
    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getCedula() {
        return cedula;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Mostrar datos paquete
    
    public String mostrarDatosPaquete() {
        return "Numero paquete: " + numeroPaquete
                + "\nCedula: " + cedula
                + "\nPeso: " + peso
                + "\nPrioridad: " + prioridad;
    }

}
