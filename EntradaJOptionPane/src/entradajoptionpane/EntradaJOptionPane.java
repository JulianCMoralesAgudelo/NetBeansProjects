/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradajoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class EntradaJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        int entero;
        char letra;
        double decimal;
        cadena = JOptionPane.showInputDialog("Digita una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digita un entero"));
        letra = JOptionPane.showInputDialog("Digita una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digita un decimal"));

        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: " + decimal);

    }

}
