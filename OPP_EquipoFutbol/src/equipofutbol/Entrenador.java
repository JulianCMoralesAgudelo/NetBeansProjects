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
public class Entrenador extends Persona{    
    
    // Atributos
    
    protected String entrategia;    

    // Constructor
    
    public Entrenador(String entrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.entrategia = entrategia;
    }

    // Getters

    public String getEntrategia() {
        return entrategia;
    }    
    
    // Metodos

    @Override
    public void partidoFutbol(){
        System.out.println("Dirige partido de futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Dirige entrenamiento");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planifica y coordona entrenamiento");
    }    
}
