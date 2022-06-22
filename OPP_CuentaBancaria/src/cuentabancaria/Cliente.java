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
public class Cliente {

    // Atributos
    private String nombre;
    private String apellido;
    private String cedula;
    Cuenta cuentas[];

    // Constructor
    public Cliente(String nombre, String apellido, String cedula, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.cuentas = cuentas;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getCedula() {
        return cedula;
    }

    // Metodos
    // Consultar saldo
    public double consultarSaldo(int indice) {        
        return cuentas[indice].getSaldo();
    }

    // Ingresar saldo
    public void ingresarSaldo(int indice, double cantidad) {
        cuentas[indice].ingresarDinero(cantidad);
    }
    
    // Retirar saldo
    public void retirarSaldo(int indice, double cantidad) {
        cuentas[indice].retirarDinero(cantidad);
    }
    
}
