package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.Modelo;
import modelo.Persona;
import vista.Vista;

public class Controlador implements ActionListener {

    // Importar clases
    private final Vista vista;
    private final Persona persona;
    private final Modelo modelo;

    // Constructor
    public Controlador(Vista vista, Persona persona, Modelo modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
        vista.botonModificar.addActionListener(this);
        vista.botonEliminar.addActionListener(this);
    }

    // Metodos
    public void iniciar() {
        vista.setTitle("CRUD MVC");
        vista.setLocationRelativeTo(null);
    }

    // Insertar datos en base de datos
    @Override
    public void actionPerformed(ActionEvent accionRealizada) {
        // Capturar campos de la persona
        if (accionRealizada.getSource() == vista.botonInsertar) {
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreoElectronico(vista.cajaCorreoElectronico.getText());
            persona.setFechaNacimiento(Date.valueOf(vista.cajaFechaNacimiento.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());

            if (modelo.insertar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar registro");
                limpiar();
            }
        }

        // Limpiar datos de la vista
        if (accionRealizada.getSource() == vista.botonLimpiar) {
            limpiar();
        }

        // Buscar
        if (accionRealizada.getSource() == vista.botonBuscar) {
            persona.setClave(vista.cajaBuscar.getText());
            if (modelo.buscar(persona)) {
                vista.cajaIdPersona.setText(String.valueOf(persona.getIdPersona()));
                vista.cajaClave.setText(persona.getClave());
                vista.cajaNombre.setText(persona.getNombre());
                vista.cajaDomicilio.setText(persona.getDomicilio());
                vista.cajaCelular.setText(persona.getCelular());
                vista.cajaCorreoElectronico.setText(persona.getCorreoElectronico());
                vista.cajaFechaNacimiento.setText(String.valueOf(persona.getFechaNacimiento()));
                vista.comboGenero.setSelectedItem(persona.getGenero());
            } else {
                JOptionPane.showMessageDialog(null, "No hay registro con esa clave");
                limpiar();
            }
        }

        if (accionRealizada.getSource() == vista.botonModificar) {
            persona.setIdPersona(Integer.parseInt(vista.cajaIdPersona.getText()));
            persona.setClave(vista.cajaClave.getText());
            persona.setNombre(vista.cajaNombre.getText());
            persona.setDomicilio(vista.cajaDomicilio.getText());
            persona.setCelular(vista.cajaCelular.getText());
            persona.setCorreoElectronico(vista.cajaCorreoElectronico.getText());
            persona.setFechaNacimiento(Date.valueOf(vista.cajaFechaNacimiento.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());

            if (modelo.modificar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar registro");
                limpiar();
            }
        }

        if (accionRealizada.getSource() == vista.botonEliminar) {
            persona.setIdPersona(Integer.parseInt(vista.cajaIdPersona.getText()));
            

            if (modelo.eliminar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar registro");
                limpiar();
            }
        }
    }

    public void limpiar() {
        vista.cajaBuscar.setText(null);
        vista.cajaIdPersona.setText(null);
        vista.cajaClave.setText(null);
        vista.cajaNombre.setText(null);
        vista.cajaDomicilio.setText(null);
        vista.cajaCelular.setText(null);
        vista.cajaCorreoElectronico.setText(null);
        vista.cajaFechaNacimiento.setText(null);
        vista.comboGenero.setSelectedItem(0);
    }
}