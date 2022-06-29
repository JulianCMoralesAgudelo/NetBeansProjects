package codigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel etiqueta;
    private JButton botonRojo, botonVerde, botonAzul;
    private int pulsado = 0, contadorRojo = 0, contadorVerde = 0, contadorAzul = 0;

    public Ventana() {
        setSize(600, 400);
        setTitle("RGB");
        setLocationRelativeTo(null);
        inicarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void inicarComponentes() {
        isertarPanel();
        isertarEtiqueta();
        insertarBoton();
    }

    private void isertarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        eventoRuedaRaton();
    }

    private void isertarEtiqueta() {
        etiqueta = new JLabel("Color (Rojo, Verde, Azul)");
        etiqueta.setBounds(100, 30, 400, 50);
        etiqueta.setFont(new Font("arial", 0, 20));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
    }

    private void insertarBoton() {

        /*
            pulsado = 1 = R
            pulsado = 2 = V
            pulsado = 3 = A
         */
        botonRojo = new JButton("Rojo");
        botonRojo.setBounds(50, 230, 150, 50);
        botonRojo.setForeground(Color.RED);
        botonRojo.setFont(new Font("arial rounded mt bold", 0, 20));
        panel.add(botonRojo);

        botonRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pulsado = 1;
            }
        });

        botonVerde = new JButton("Verde");
        botonVerde.setBounds(230, 230, 150, 50);
        botonVerde.setForeground(Color.GREEN);
        botonVerde.setFont(new Font("arial rounded mt bold", 0, 20));
        panel.add(botonVerde);

        botonVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pulsado = 2;
            }
        });

        botonAzul = new JButton("Azul");
        botonAzul.setBounds(410, 230, 150, 50);
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setFont(new Font("arial rounded mt bold", 0, 20));
        panel.add(botonAzul);

        botonAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pulsado = 3;
            }
        });
    }

    private void eventoRuedaRaton() {
        MouseWheelListener guardiaScroll = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe) {
                if (pulsado != 0) {
                    if (pulsado == 1) {
                        // Rojo
                        contadorRojo += mwe.getWheelRotation();
                        if (contadorRojo < 0) {
                            contadorRojo = 0;
                        }
                        if (contadorRojo > 255) {
                            contadorRojo = 255;
                        }
                    } else if (pulsado == 2) {
                        // Azul
                        contadorVerde += mwe.getWheelRotation();
                        if (contadorVerde < 0) {
                            contadorVerde = 0;
                        }
                        if (contadorVerde > 255) {
                            contadorVerde = 255;
                        }
                    } else {
                        // Verde
                        contadorAzul += mwe.getWheelRotation();
                        if (contadorAzul < 0) {
                            contadorAzul = 0;
                        }
                        if (contadorAzul > 255) {
                            contadorAzul = 255;
                        }
                    }
                }
                etiqueta.setText("Color (Rojo = " + contadorRojo + ", Verde = " + contadorVerde + ", Azul = " + contadorAzul + ")");
                panel.setBackground(new Color(contadorRojo, contadorVerde, contadorAzul));
                String hex = String.format("#%02x%02x%02x", contadorRojo, contadorVerde, contadorAzul);                
            }
        };
        panel.addMouseWheelListener(guardiaScroll);
    }
}
