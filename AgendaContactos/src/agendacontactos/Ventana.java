/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacontactos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julian
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        correoElectronico = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        telefonoCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mostrarContactos = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 204));
        panel.setForeground(new java.awt.Color(0, 0, 0));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Agenda de Contactos");
        panel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombres y Apellidos:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        panel.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 217, -1));

        correoElectronico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correoElectronico.setText("Correo electrónico:");
        panel.add(correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 147, -1));
        panel.add(cajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 217, -1));

        telefonoCelular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telefonoCelular.setText("Teléfono Celular:");
        panel.add(telefonoCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 147, -1));
        panel.add(cajaCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 217, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        menu.setText("Menú");
        menu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        mostrarContactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agenda.png"))); // NOI18N
        mostrarContactos.setText("Mostrar Contactos");
        mostrarContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarContactosActionPerformed(evt);
            }
        });
        menu.add(mostrarContactos);
        menu.add(separador);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarContactosActionPerformed
        VentanaContactos ventanaContactos = new VentanaContactos(this, true);
        ventanaContactos.setVisible(true);
    }//GEN-LAST:event_mostrarContactosActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Archivo archivo = new Archivo();
        archivo.crearArchivo();

        String nombre, correo, celular;

        // Obtener datos por persona
        nombre = cajaNombre.getText();
        correo = cajaCorreo.getText();
        celular = cajaCelular.getText();
        // Crear objeto persona
        Persona persona = new Persona(nombre, correo, celular);
        // Escribir datos
        archivo.escribitTexto(persona);
        // Limpiar datos
        cajaNombre.setText("");
        cajaCorreo.setText("");
        cajaCelular.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel correoElectronico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem mostrarContactos;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separador;
    private javax.swing.JLabel telefonoCelular;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
