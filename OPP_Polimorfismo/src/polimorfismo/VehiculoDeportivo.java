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
public class VehiculoDeportivo extends Vehiculo {

    private int cilindraje;

    public VehiculoDeportivo(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = puertas;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCilindraje: " + cilindraje;
    }
    
}
