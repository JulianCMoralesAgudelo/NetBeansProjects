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
public class Sucursal {

    // Atributos
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    // Constructor
    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    // Getters
    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Metodos
    public String mostrarDatosSucursal() {
        return "Numero sucursal: " + numeroSucursal
                + "\nCiudad: " + ciudad
                + "\nDireccion: " + direccion;
    }

    public double calcularPrecio(Paquete pqt) {
        double precio;
        precio = pqt.getPeso();
        if (pqt.getPrioridad() == 1) {
            precio += 10;
        }
        if (pqt.getPrioridad() == 2) {
            precio += 20;
        }
        return precio;
    }

}
