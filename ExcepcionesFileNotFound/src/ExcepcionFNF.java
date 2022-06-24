/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class ExcepcionFNF {

    public static void leerArchivo() throws FileNotFoundException {
        // Lectura de un archivo de texto.
        File archivo = new File("/home/julian/NetBeansProjects/Excepciones/src/verificadas/archivoPrueba.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() throws IOException {
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Excepcion verificada");
        }
    }

    public static void main(String[] args) throws IOException {
        ExcepcionFNF prueba = new ExcepcionFNF();
        prueba.leerArchivo2();
    }

}
