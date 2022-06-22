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
public class Medico extends Persona{
    
    // Atributos
    private String titulacion;
    private int aniosExperiencia;
    
    // Atributos
    public Medico(String titulacion, int aniosExperiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    // Getters

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Asiste medicamente en partido futbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Asiste medicamentre en entrenamiento");
    }    
    
    public void curarLesion(){
        System.out.println("Atiende las lesiones fisicas de los jugadores");
    }
}
