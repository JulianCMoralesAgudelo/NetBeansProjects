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
public class Triangulo extends Poligono {

    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // ToString
    @Override
    public String toString() {
        return "Triangulo \n{" + super.toString() + "\nlado1 = " + lado1 + "\nlado2 = " + lado2 + "\nlado3 = " + lado3;
    }

    // Area segun Heron
    @Override
    public double area() {
        // Formula de heron
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

}
