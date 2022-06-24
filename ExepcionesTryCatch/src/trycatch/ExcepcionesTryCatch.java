/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

import javax.swing.JOptionPane;
import sun.applet.Main;

/**
 *
 * @author julian
 */
public class ExcepcionesTryCatch {

    public void operaciones() {
        int num1 = 5, num2 = 0;
        int resultado = num1 / num2;
        System.out.println(resultado);
    }

    public void operaciones2() {
        try {
            operaciones();
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Revisa tu operacion artimetica");
        }

        System.out.println("Programa terminado");
    }

    public static void main(String[] args) {
        ExcepcionesTryCatch prueba = new ExcepcionesTryCatch();
        prueba.operaciones2();
    }

}
