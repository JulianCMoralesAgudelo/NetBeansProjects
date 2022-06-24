package excepcion0;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class Principal {

    // Atributos
    private int numero;
    private Scanner entrada;

    public void introducirNumeros() throws Excepcion0 {
        entrada = new Scanner(System.in);
        do {
            System.out.print("\nDigite un numero: ");
            numero = entrada.nextInt();

            if (numero == 0) {
                //Producir excecion personalizada
                throw new Excepcion0();
            }
        } while (numero != 0 && numero != 1);
    }

    public static void main(String[] args) {
        Principal excepcion0 = new Principal();
        try {
            excepcion0.introducirNumeros();
        } catch (Excepcion0 ex) {
            System.out.println("Introdujo el numero cero y este no esta permitido");
        }
        System.out.println("Programa terminado\n");
    }

}
