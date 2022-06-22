/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_areapoligonos;

/**
 *
 * @author julian
 */
public abstract class Poligono {

    // Atributos
    protected int numeroLados;

    // Constructor
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Getters
    public int getNumeroLados() {
        return numeroLados;
    }

    // ToString
    @Override
    public String toString() {
        return "Numero lados = " + numeroLados+ '}';
    }

    // Metodo area
    public abstract double area();

}
