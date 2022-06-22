/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp_herencia;

/**
 *
 * @author julian
 */
public class Persona {
    
    // Atributos
    
    private String nombre;
    private String apellido;
    private int edad;
    
    // Constructor
    
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    // Metodos

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    
  
}
