/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipofutbol;

/**
 *
 * @author julian
 */
public class Futbolista extends Persona{
    // Atributos
    private int dorsal;
    private String posicion;

    // Constructor
    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    // Getters

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }
    
    // Metodos propios
    
    @Override
    public void partidoFutbol(){
        System.out.println("Juega el partifo de futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Entrena");
    }
    
    
    public void entrevista(){
        System.out.println("Asiste a una entrevista");
    }
    
    
    
    
}

