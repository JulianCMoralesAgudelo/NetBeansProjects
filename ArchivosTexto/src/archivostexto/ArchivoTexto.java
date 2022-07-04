package archivostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoTexto {

    File archivo;

    private void crearArchivo() {
        archivo = new File("prueba.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            System.out.println("El archivo no se logro crear");
        }
    }

    private void crearDirectorio() {
        archivo = new File("carpetaPrueba");
        if (archivo.mkdir()) {
            System.out.println("Se ha creado el directorio");
        } else {
            System.out.println("No se ha creado el directorio");
        }
    }

    private void escribirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("Prueba de escritura");
            escribir.write("\r\nLinea dos");
            escribir.close();
        } catch (IOException ex) {
            System.out.println("No se pudo escribir");
        }
    }

    private void añadirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write("Prueba de escritura");
            escribir.write("\r\nMas mas mas");
            escribir.close();
        } catch (IOException ex) {
            System.out.println("No se pudo escribir");
        }
    }

    private void leerTexto() {
        String cadena;
        try {
            FileReader lector;
            lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            cadena = lectura.readLine();
            while (cadena != null) {
                cadena = lectura.readLine();
                System.out.println(cadena);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra archivo");
        } catch (IOException ex) {
            System.out.println("Posible error entrada y salida");
        }
    }

    public static void main(String[] args) {
        ArchivoTexto archivo = new ArchivoTexto();
        archivo.crearArchivo();
        //archivo.crearDirectorio();
        //archivo.escribirTexto();
        //archivo.añadirTexto();
        archivo.leerTexto();
    }

}
