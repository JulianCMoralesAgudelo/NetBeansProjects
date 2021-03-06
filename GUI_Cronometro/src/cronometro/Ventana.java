/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author julian
 */
public class Ventana extends javax.swing.JFrame {

    private Timer tiempo;
    private int centesimas = 0, segundos = 0, minutos = 0, horas = 0;

    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimas++;
            if (centesimas == 100) {
                segundos++;
                centesimas = 0;
            }
            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }
            actualizarEtiquetaTiempo();
        }
    };

    private void actualizarEtiquetaTiempo() {
        String texto = (horas <= 9 ? "0" : "") + horas + ":" + (minutos <= 9 ? "0" : "") + minutos + ":" + (segundos <= 9 ? "0" : "") + segundos + ":" + (centesimas <= 9 ? "0" : "") + centesimas;
        etiquetaTiempo.setText(texto);
    }

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        tiempo = new Timer(10, acciones);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagenCronometro = new javax.swing.JLabel();
        etiquetaCronometro = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        btnInicar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cron??metro");
        setPreferredSize(new java.awt.Dimension(530, 331));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(530, 331));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagenCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cronmetro.png"))); // NOI18N
        jPanel1.add(imagenCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        etiquetaCronometro.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        etiquetaCronometro.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCronometro.setText("Cron??metro");
        jPanel1.add(etiquetaCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        etiquetaTiempo.setFont(new java.awt.Font("Open Sans Condensed", 1, 36)); // NOI18N
        etiquetaTiempo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTiempo.setText("00:00:00:00");
        jPanel1.add(etiquetaTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        btnInicar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnInicar.setText("Iniciar");
        btnInicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnInicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 100, -1));

        btnPausar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnPausar.setText("Pausar");
        btnPausar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPausar.setPreferredSize(new java.awt.Dimension(80, 30));
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 110, 30));

        btnDetener.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDetener.setText("Detener");
        btnDetener.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDetener.setPreferredSize(new java.awt.Dimension(80, 30));
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 110, 30));

        etiquetaFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicarActionPerformed
        tiempo.start();
        btnInicar.setEnabled(false);
        btnInicar.setText("Reanudar");
        btnPausar.setEnabled(true);
        btnDetener.setEnabled(true);
    }//GEN-LAST:event_btnInicarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        tiempo.stop();
        btnInicar.setEnabled(true);
        btnPausar.setEnabled(false);
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
        if (tiempo.isRunning()) {
            tiempo.stop();
            btnInicar.setEnabled(true);
        }
        btnInicar.setText("Iniciar");
        btnPausar.setEnabled(false);        
        btnDetener.setEnabled(false);
        centesimas = 0;
        segundos = 0;
        minutos = 0;
        horas = 0;
        actualizarEtiquetaTiempo();
    }//GEN-LAST:event_btnDetenerActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnInicar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JLabel etiquetaCronometro;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel imagenCronometro;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
