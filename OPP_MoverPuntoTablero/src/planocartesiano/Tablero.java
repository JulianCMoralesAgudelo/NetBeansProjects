/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocartesiano;

/**
 *
 * @author julian
 */
public class Tablero {

    // Atributos
    private int x;
    private int y;

    // Constructor
    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metodos
    public void moverArriba(int incremento) {
        y += incremento;
    }

    public void moverAbajo(int incremento) {
        y -= incremento;
    }

    public void moverDerecha(int incremento) {
        x += incremento;
    }

    public void moverIzquierda(int incremento) {
        x -= incremento;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
