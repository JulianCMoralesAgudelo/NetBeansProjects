/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planocartesiano;

import java.util.Scanner;

/**
 *
 * @author julian
 */
public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Tablero t1;
        int x, y, opcion, incremento = 0;

        System.out.print("Digite la coordenada inicial de x: ");
        x = entrada.nextInt();
        System.out.print("Digite la coordenada inicial de y: ");
        y = entrada.nextInt();

        // Posicion inicial del objeto
        t1 = new Tablero(x, y);
        
        System.out.println("");

        do {
            System.out.println("       MENU          ");
            System.out.println("1. Mover hacia arriba");
            System.out.println("2. Mover hacia abajo");
            System.out.println("3. Mover hacia la derecha");
            System.out.println("4. Mover hacia la izquierda");
            System.out.println("5. Salir");
            System.out.print("\nDigite la opcion: ");
            opcion = entrada.nextInt();

            if (opcion != 5) {
                System.out.print("\nDigite la cantidad de espacios a moverse: ");
                incremento = entrada.nextInt();
            }
            
            switch (opcion) {
                case 1:
                    t1.moverArriba(incremento);
                    break;
                case 2:
                    t1.moverAbajo(incremento);
                    break;
                case 3:
                    t1.moverDerecha(incremento);
                    break;
                case 4:
                    t1.moverIzquierda(incremento);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion erronea");            
            }
            
            System.out.println("\nPosicion Actual(X,Y): (" + t1.getX() + " . " + t1.getY() + ")\n");
            
        } while (opcion != 5);

    }

}
