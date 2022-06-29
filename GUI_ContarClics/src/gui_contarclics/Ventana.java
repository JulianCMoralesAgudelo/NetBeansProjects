package gui_contarclics;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    // atributos
    // Panel
    private JPanel panel;
    // Etiqueta
    private JLabel etiqueta;
    // Boton
    JButton boton;
    // Contador
    private int contador = 0;

    // Crear ventana
    public Ventana() throws HeadlessException {
        // Establecer demiensiones
        setSize(400, 250);
        // Titulo
        setTitle("Contador de clics");
        // Centrar en el medio
        setLocationRelativeTo(null);
        // Metodos
        iniciarComponentes();
        // Cerrar al salir
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        // Llamar el panel
        insertarPanel();
        // Llamar etiquetas
        insertarEtiqueta();
        // Agregar boton
        insertarBoton();

    }

    private void insertarPanel() {
        // Instanciar panel
        panel = new JPanel();
        // Deshabilitar plantillas layout
        panel.setLayout(null);
        // Agregar al panel
        this.add(panel);

    }

    private void insertarEtiqueta() {
        // Crear etiqueta
        etiqueta = new JLabel();
        // Posicionar etiqueta
        etiqueta.setBounds(0, 50, 400, 40);
        // Añadir texto a etiqueta
        etiqueta.setText("Pulsa el botón");
        // Centrar etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        // Cambiear fuente
        etiqueta.setFont(new Font("arial", 0, 20));
        // Añadir etiqueta
        panel.add(etiqueta);
    }

    private void insertarBoton() {
        // Crear boton
        boton = new JButton();
        // Establecer posicion y tamaño
        boton.setBounds(125, 90, 150, 50);
        // Agregar texto
        boton.setText("¡Clic Aqui!");
        // Editar fuente
        boton.setFont(new Font("cooper black", 0, 20));
        // Agregar al panel
        panel.add(boton);
        // Llamar evento guardiaEvento
        guardiaEvento();
    }

    private void guardiaEvento() {
        // Añadir evento al boton     
        ActionListener evento = new ActionListener() {
            // Se sobre escribe el metodo de la interface
            @Override
            public void actionPerformed(ActionEvent ae) {
                contador++;
                if (contador == 1) {
                    etiqueta.setText("Has presionado el boton una vez");
                } else {
                    etiqueta.setText("Has presionado el boton " + contador + " veces");
                }
            }
        };
        boton.addActionListener(evento);
    }
}
