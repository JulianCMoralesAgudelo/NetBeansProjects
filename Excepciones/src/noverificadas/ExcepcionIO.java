/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noverificadas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author julian
 */
public class ExcepcionIO {    

    public static void main(String[] args) throws IOException {
        // Lectura de un archivo de texto.
        BufferedReader bf = new BufferedReader(new FileReader("/home/julian/NetBeansProjects/Excepciones/src/verificadas/archivoPrueba.txt"));
        String linea;
        System.out.println("");
        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }
        System.out.println("");
    }

}
