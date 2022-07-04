package agendacontactos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {

    private File archivo;

    public void crearArchivo() {
        // Crear archivo
        archivo = new File("agendaContactos.txt");

        try {
            if (archivo.createNewFile()) {
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }

    public void escribitTexto(Persona persona) {
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(persona.getNombre() + "%" + persona.getCorreo()
                    + "%" + persona.getCelular()
                    + "\n");
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }

}
