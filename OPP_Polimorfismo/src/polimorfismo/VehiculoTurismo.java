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
// Clase hija
public class VehiculoTurismo extends Vehiculo {

    private int nPuertas;

    public VehiculoTurismo(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = puertas;
    }

    public int getPuertas() {
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nNumero de puertas: " + nPuertas;
    }

}
