/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author julian
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private boolean casilla[][] = new boolean[3][3];

    public VentanaPrincipal() {
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
    }

    private void llenarCasillas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j] = true;
            }
        }
    }

    private void dibujarX(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.png")));
    }

    private void dibujarO(JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/o.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        reiniciar = new javax.swing.JMenuItem();
        mostrarResultados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));
        jPanel1.add(btn11);
        jPanel1.add(btn12);
        jPanel1.add(btn13);
        jPanel1.add(btn21);
        jPanel1.add(btn22);
        jPanel1.add(btn23);
        jPanel1.add(btn31);

        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });
        jPanel1.add(btn32);
        jPanel1.add(btn33);

        menuJuego.setText("Juego");
        menuJuego.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        reiniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restart.png"))); // NOI18N
        reiniciar.setText("Comenzar de nuevo");
        menuJuego.add(reiniciar);

        mostrarResultados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mostrarResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/result.png"))); // NOI18N
        mostrarResultados.setText("Mostrar tabla de resultados");
        menuJuego.add(mostrarResultados);
        menuJuego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        menuJuego.add(salir);

        barraMenu.add(menuJuego);

        menuAyuda.setText("Ayuda");
        menuAyuda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn32ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem mostrarResultados;
    private javax.swing.JMenuItem reiniciar;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
