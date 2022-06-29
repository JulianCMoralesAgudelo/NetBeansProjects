package codigo;

import java.awt.Button;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel etiqueta, imagen;
    private JRadioButton rb1, rb2, rb3, rb4;

    public Ventana() {
        setSize(700, 400);
        setTitle("RadioButtons");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        insertarPanel();
        insertarEtiqueta();
        insertarRadioButtons();
    }

    private void insertarPanel() {
        panel = new JPanel();
        // Deshabilitar diseño
        panel.setLayout(null);
        // Agregar a la ventana
        this.add(panel);
    }

    private void insertarEtiqueta() {
        etiqueta = new JLabel("Elija su deporte favorito:");
        etiqueta.setBounds(20, 10, 250, 40);
        etiqueta.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(etiqueta);
    }

    private void insertarRadioButtons() {
        rb1 = new JRadioButton("Fútbol");
        rb1.setBounds(20, 80, 80, 40);
        rb1.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb1);

        rb2 = new JRadioButton("Baloncesto");
        rb2.setBounds(20, 140, 130, 40);
        rb2.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb2);

        rb3 = new JRadioButton("Tennis");
        rb3.setBounds(20, 200, 100, 40);
        rb3.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb3);

        rb4 = new JRadioButton("Natación");
        rb4.setBounds(20, 260, 120, 40);
        rb4.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb4);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);

        eventoAccion();
    }

    private void eventoAccion() {

        imagen = new JLabel();
        imagen.setBounds(200, 60, 430, 250);
        panel.add(imagen);
        // Creacion de imagenes
        final ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/imagenes/Futbol.jpg"));
        final ImageIcon imagenBasque = new ImageIcon(getClass().getResource("/imagenes/Basque.jpg"));
        final ImageIcon imagenTennis = new ImageIcon(getClass().getResource("/imagenes/Tennis.jpg"));
        final ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/imagenes/Natacion.jpg"));

        ActionListener eventoUno = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb1.addActionListener(eventoUno);

        ActionListener eventoDos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenBasque.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb2.addActionListener(eventoDos);

        ActionListener eventoTres = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenTennis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb3.addActionListener(eventoTres);

        ActionListener eventoCuatro = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb4.addActionListener(eventoCuatro);
    }

}
