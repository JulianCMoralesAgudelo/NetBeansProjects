/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_cuadrilatero;

/**
 *
 * @author julian
 */
public class Cuadrilatero {

    // Atributos
    private float lado1;
    private float lado2;

    // Constructor
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Constructor para cuadrados
    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    // Getters and setters
    public float getPeremietro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea() {
        float area = lado1 * lado2;
        return area;
    }
}
