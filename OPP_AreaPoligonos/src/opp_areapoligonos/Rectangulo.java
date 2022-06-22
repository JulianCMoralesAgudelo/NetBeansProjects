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
public class Rectangulo extends Poligono {

    // Atributos
    private double lado1;
    private double lado2;

    // Constructor
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    // ToString
    @Override
    public String toString() {
        return "Rectangulo \n{" + super.toString() + "\nlado1 = " + lado1 + "\nlado2 = " + lado2 ;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }

}
