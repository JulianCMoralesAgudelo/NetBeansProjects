/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetroisoceles;

import java.time.Period;

/**
 *
 * @author julian
 */
public class TrianguloIsoceles {

    // Atributos
    private double base;
    private double lado;

    // Constructor
    public TrianguloIsoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    // Metodos
    public double obtenerPerimetro() {
        double perimetro = 2 * lado + base;
        return perimetro;
    }

    public double obtenerArea() {
        double area = (base * Math.sqrt(lado * lado - base * base / 4)) / 2;
        return area;
    }

}
