/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author julian
 */
public class Cuenta {

    // Atributos
    private int numeroCuenta;
    private double saldo;

    // Constructor
    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Getter
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos
    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
    }
    
    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }

}
