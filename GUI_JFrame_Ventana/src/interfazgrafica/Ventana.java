package interfazgrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author julian
 */
public class Ventana extends JFrame {

    // Crear panel
    public JPanel panel = new JPanel();

    public Ventana() {
        // Tamanño de la ventana.
        //setLocation(100, 200);
        this.setSize(1000, 1000);
        // Edste metodo remplaza los dos metodos usados anteriormente.
        // (SetLocation,SetSize)
        //setBounds(100, 200, 500, 500);
        // Establecer ubicacion relativa a         
        setLocationRelativeTo(null);// Centro de la pantalla
        // Cambiar color 
        // this.getContentPane().setBackground(Color.BLUE);

        // Llamar el metodo inciar comonenetes
        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("EJercicio frame");
    }

    private void iniciarComponentes() {
        // Desactivar el diseño del panel por defecto
        panel.setLayout(null);
        // Agregar el panel a la ventana.
        this.getContentPane().add(panel);
        // Llamar metodo de inciar componentes
        // Cambiar color del panel
        // panel.setBackground(Color.GREEN);
        //colocarBotones();
        //colocarEtiquetas();
        //colocarRadioBotones();
        //colocarBotonesDeActivacion();
        //colocarCajasDeTexto();
        //colocarAreasDeTexto();
        //casillasDeVerificacion();
        colocarListasDesplegables();
    }

    private void colocarEtiquetas() {
        // colocarEtiquetas();        
        // Etiquetas
        //JLabel etiqueta = new JLabel("Hola");
        // Posicionar texto etiqueta
        JLabel etiqueta = new JLabel("Hola");
        // Metodo desde la creacion
        // etiqueta = new JLabel("Hola", SwingConstants.CENTER);
        // Metodo despues de la creacion
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        // Posicionar etiqueta
        etiqueta.setBounds(450, 10, 120, 40);
        // Cambiar color letras etiqueta
        etiqueta.setForeground(Color.WHITE);
        // Desactivar el diseño de la etiqueta
        etiqueta.setOpaque(true);
        // Cambiar color fondo etiqueta
        etiqueta.setBackground(Color.DARK_GRAY);
        // Cambiar fuente del texto y el tipo de letra ya sea en numero o por nombre
        etiqueta.setFont(new Font("arial", 3, 40));
        // Agregar etiqueta al panel
        panel.add(etiqueta);

        // Etiqueta 2, se pasa un objeto como string con la imagen
        ImageIcon imagen = new ImageIcon("Perseverancia.jpg");
        JLabel etiqueta2 = new JLabel();
        // Posicionar etiqueta
        etiqueta2.setBounds(100, 80, 800, 800);
        // Cambiar tamaño de la imagen y escalar
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        // Agregar etiqueta2 al panel
        panel.add(etiqueta2);
    }

    private void colocarBotones() {
        // Boton de texto
        JButton boton = new JButton();
        // Establecer texto al boton
        boton.setText("Click");
        // Activar o descativar boton
        boton.setEnabled(true);
        // Establecer atajo de teclado con la letra alt + letra en elejida
        boton.setMnemonic('a');
        // Crear boton
        boton.setBounds(100, 100, 100, 40);
        // Cambiar color letra boton
        boton.setForeground(Color.BLUE);
        // Cambiar fuente boton (nombre, estilo, tamaño) o (nombre, estilo en numero, tamaño)
        boton.setFont(new Font("cooper black", Font.BOLD, 20));
        // Agregar boton al panel
        panel.add(boton);

        // Agregar imagen
        ImageIcon clicAqui = new ImageIcon("boton-clic-aqui.png");
        // Boton de imagen
        // Crear boton
        JButton botonImagen = new JButton();
        // Posicionar boton
        botonImagen.setBounds(100, 200, 100, 40);
        // Agregar color de fondo
        botonImagen.setBackground(Color.WHITE);
        // Habilitar cambio de fondo del boton
        // botonImagen.setOpaque(true);
        // Agregar imagen al boton y escalar al tamaño del boton
        botonImagen.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(botonImagen.getWidth(), botonImagen.getHeight(), Image.SCALE_SMOOTH)));
        // Agregar boton al panel
        panel.add(botonImagen);

        // Crear boton de borde
        JButton botonBordes = new JButton();
        // Establecer texto al boton
        botonBordes.setText("Boton con bordado");
        // Posicionar boton
        botonBordes.setBounds(100, 300, 150, 50);
        // Establecer borde
        botonBordes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        // Agregar boton al panel
        panel.add(botonBordes);
    }

    private void colocarRadioBotones() {
        // Crear Radioboton se marca seleccionado
        JRadioButton radioBoton = new JRadioButton("Opcion 1", true);
        // Posicionar
        radioBoton.setBounds(50, 450, 500, 50);
        // Agregar texto
        radioBoton.setText("Si deseas algo en la vida, lucha por ello.");
        // Modificar fuente
        radioBoton.setFont(new Font("cooper black", 0, 20));
        // Agregar boton al panel
        panel.add(radioBoton);

        // Crear RadiobotonDos y se marca sin seleccionar
        JRadioButton radioBotonDos = new JRadioButton("Opcion 2", false);
        // Posicionar
        radioBotonDos.setBounds(50, 500, 100, 50);
        // Agregar boton al panel
        panel.add(radioBotonDos);

        // Crear RadiobotonTres y se marca sin seleccionar
        JRadioButton radioBotonTres = new JRadioButton("Opcion 3", false);
        // Posicionar
        radioBotonTres.setBounds(50, 550, 100, 50);
        // Agregar boton al panel
        panel.add(radioBotonTres);

        // Crear gupo de botones
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        // Agregar botones al grupo
        grupoRadioBotones.add(radioBoton);
        grupoRadioBotones.add(radioBotonDos);
        grupoRadioBotones.add(radioBotonTres);
    }

    private void colocarBotonesDeActivacion() {
        // Crear botonActivado con false por defecto 
        JToggleButton botonActivacion = new JToggleButton("Opcion 1");
        // Posicionar
        botonActivacion.setBounds(50, 600, 100, 50);
        // Crear botonActivado con false por defecto
        JToggleButton botonActivacionDos = new JToggleButton("Opcion 2");
        // Posicionar
        botonActivacionDos.setBounds(50, 680, 100, 50);
        // Agregar al panel
        panel.add(botonActivacion);
        // Agregar al panel
        panel.add(botonActivacionDos);

        // Crear botonActivado con false por defecto
        JToggleButton botonActivacionTres = new JToggleButton("Opcion 3");
        // Posicionar
        botonActivacionTres.setBounds(50, 750, 100, 50);
        // Agregar al panel
        panel.add(botonActivacionTres);
        // Agregar al panel

        // Crear gupo de botones
        ButtonGroup GrupoBotonesActivacion = new ButtonGroup();
        // Agregar botones al grupo
        GrupoBotonesActivacion.add(botonActivacion);
        GrupoBotonesActivacion.add(botonActivacionDos);
        GrupoBotonesActivacion.add(botonActivacionTres);
    }

    private void colocarCajasDeTexto() {
        // Crear caja
        JTextField cajaTexto = new JTextField();
        // Posicionar caja
        cajaTexto.setBounds(250, 100, 120, 40);
        // Agregar texto como placeholder
        cajaTexto.setText("Leer consola");
        // Introducir texto
        System.out.println("Texto en la caja " + cajaTexto.getText());
        // Agregar caja al panel
        panel.add(cajaTexto);
    }

    private void colocarAreasDeTexto() {
        // Crear area de texto
        JTextArea areaTexto = new JTextArea();
        // Posicionar area
        areaTexto.setBounds(250, 100, 300, 300);
        // Agregar texto como placeholder
        areaTexto.setText("Esciba el texto aqui.");
        // Añadir texto como placeholder
        areaTexto.append("\nEsciba el texto aqui.");
        // Activar edicion o no
        areaTexto.setEditable(false);
        // Introducir texto
        System.out.println("Texto en la caja " + areaTexto.getText());
        // Agregar area al panel
        panel.add(areaTexto);

        // Barras de desplazamiebto
        JScrollPane barrasDezplazamiento = new JScrollPane(areaTexto);
        // Puntos de desplazamiento
        barrasDezplazamiento.setBounds(250, 100, 300, 300);
        // Establecer orientacion Vertical
        barrasDezplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        // Establecer orientacion Horizontal
        barrasDezplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        // Agregar area al panel
        panel.add(barrasDezplazamiento);
    }

    private void casillasDeVerificacion() {
        // Crear casilla de verificacion de texto
        JCheckBox casillaVerificacion = new JCheckBox("Opcion 1");
        // Posicionar area
        casillaVerificacion.setBounds(20, 20, 100, 40);
        // Agregar area al panel
        panel.add(casillaVerificacion);

        // Crear casilla de verificacion de texto
        JCheckBox casillaVerificacionDos = new JCheckBox("Opcion 2");
        // Posicionar area
        casillaVerificacionDos.setBounds(20, 50, 100, 40);
        // Agregar area al panel
        panel.add(casillaVerificacionDos);

        // Crear casilla de verificacion de texto
        JCheckBox casillaVerificacionTres = new JCheckBox("Opcion 3");
        // Posicionar area
        casillaVerificacionTres.setBounds(20, 80, 100, 40);
        // Agregar area al panel
        panel.add(casillaVerificacionTres);

        // Crear casilla de verificacion de texto
        JCheckBox casillaVerificacionCuatro = new JCheckBox("Opcion 4");
        // Posicionar area
        casillaVerificacionCuatro.setBounds(20, 110, 100, 40);
        // Agregar area al panel
        panel.add(casillaVerificacionCuatro);
    }

    private void colocarListasDesplegables() {
        /*
        // Crear arrray de items tipo String
        String paises[] = {"", "Colombia", "Peru", "Ecuador", "Brasil"};
        // Crear Listas Desplegable
        JComboBox listaDesplegable = new JComboBox(paises);
        // Posicionar area
        listaDesplegable.setBounds(20, 20, 100, 30);
        //Agregar items
        listaDesplegable.addItem("Argentina");
        // Seleccionar objetos en la vista incial
        listaDesplegable.setSelectedItem("");
        // Agregar area al panel        
        panel.add(listaDesplegable);
         */

        // Objetos de lc aclase persona
        Persona persona = new Persona("Julian Morales", 38, "Colombiano");
        Persona personaDos = new Persona("Yisela Guzman", 29, "Colombiana");

        // Crear modelo
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JComboBox listaDesplegable = new JComboBox(modelo);
        // Posicionar modelo
        listaDesplegable.setBounds(20, 20, 400, 30);

        // Agregar objeto al modelo
        modelo.addElement(persona);
        // Agregar objeto al modelo
        modelo.addElement(personaDos);

        // Agregar modelo al panel        
        panel.add(listaDesplegable);
    }

}
