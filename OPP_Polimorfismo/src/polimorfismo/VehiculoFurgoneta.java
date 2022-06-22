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
public class VehiculoFurgoneta extends Vehiculo {

    private int carga;

    public VehiculoFurgoneta(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = puertas;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCarga: " + carga;
    }
}
