package interfazgrafica;

import javax.swing.JFrame;

/**
 *
 * @author julian
 */
public class Ventana extends JFrame {

    public Ventana() {
        // Tamanio de la ventana.
        //setLocation(100, 200);
        this.setSize(500, 500);
        // Edste metodo remplaza los dos metodos usados anteriormente.
        // (SetLocation,SetSize)
        //setBounds(100, 200, 500, 500);
        // Establecer ubicacion relativa a         
        setLocationRelativeTo(null);// Centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("EJercicio frame");
    }

}
