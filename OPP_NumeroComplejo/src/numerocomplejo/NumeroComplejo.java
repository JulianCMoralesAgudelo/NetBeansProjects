package numerocomplejo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author julian
 */
public class NumeroComplejo {

    // Atributos
    private double a; // Parte real
    private double b; // Parte imaginaria

    // Constructor
    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metodos getter
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    /*
    Suma Complejos
    numero1 = 3 + 4i
    numero2 = 2 + 5i
    suma = (3+2) + (4i+5i)    
     */
    // Metodos de operaciones de numeros complejos
    public NumeroComplejo sumarComplejos(NumeroComplejo c) {
        NumeroComplejo suma = new NumeroComplejo(a + c.getA(), b + c.getB());
        return suma;
    }

    /*
    Producto Complejos
    numero1 = 3 + 4i
    numero2 = 2 + 5i
    producto = (3*2 - 4*5) + (3*5 + 4*2)i    
     */
    public NumeroComplejo productoComplejos(NumeroComplejo c) {
        NumeroComplejo producto = new NumeroComplejo((a * c.getA() - b * c.getB()), (a * c.getB() + b * c.getA()));
        return producto;
    }

    /*
    Comparrar Complejos
    numero1 = 3 + 4i
    numero2 = 3 + 4i
    producto = (3*2 - 4*5) + (3*5 + 4*2)i
    
     */
    public boolean compararComplejos(NumeroComplejo c) {
        boolean iguales = false;
        if ((a == c.getA()) && (b == c.getB())) {
            iguales = true;
        }
        return iguales;
    }

    /*
    Producto Complejo por entero
    entero = 2
    complejo = 3 + 4i
    producto = (2 * 3) + (2 * 4)i
    
     */
    public NumeroComplejo multiplicarPorEntero(int x) {
        NumeroComplejo enteroxComplejo = new NumeroComplejo(a * x, b * x);
        return enteroxComplejo;
    }

}
