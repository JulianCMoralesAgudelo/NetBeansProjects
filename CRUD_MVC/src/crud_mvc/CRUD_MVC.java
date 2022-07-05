package crud_mvc;

import controlador.Controlador;
import modelo.Modelo;
import modelo.Persona;
import vista.Vista;

public class CRUD_MVC {

    public static void main(String[] args) {        
        // Crear objetos
        Vista vista = new Vista();
        Persona persona = new Persona();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, persona, modelo);
        
        // Iniciar aplicacion
        controlador.iniciar();
        vista.setVisible(true);
    }

}
