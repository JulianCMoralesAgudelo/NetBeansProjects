package com.parqueaderoiud.autos_col.vistas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dvn
 */
public class Ent extends javax.swing.JPanel {

	/**
	 * Creates new form Ent
	 */
	public Ent() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEntrada = new javax.swing.JPanel();
        jlCedula = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlPlaca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlColor = new javax.swing.JLabel();
        jlCelda = new javax.swing.JLabel();
        jlHoraIn = new javax.swing.JLabel();
        jlFechaIn = new javax.swing.JLabel();
        jlTarifaxHora = new javax.swing.JLabel();
        jlConsecutivo = new javax.swing.JLabel();
        jtxtCedula = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtPlaca = new javax.swing.JTextField();
        jtxtModelo = new javax.swing.JTextField();
        jtxtColor = new javax.swing.JTextField();
        jtxtCelda = new javax.swing.JTextField();
        jtxtFechaIn = new javax.swing.JTextField();
        jtxtHoraIn = new javax.swing.JTextField();
        jtxtTarifaxHora = new javax.swing.JTextField();
        jtxtConsecutivo = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpEntrada.setBackground(new java.awt.Color(255, 255, 255));

        jlCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCedula.setText("Cedula");

        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombre.setText("Nombre");

        jlPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPlaca.setText("Placa");

        jlModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlModelo.setText("Modelo");

        jlColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlColor.setText("Color");

        jlCelda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCelda.setText("#Celda");

        jlHoraIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHoraIn.setText("Hora Ingreso");

        jlFechaIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFechaIn.setText("Fecha ingreso");

        jlTarifaxHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTarifaxHora.setText("Tarifa por hora");

        jlConsecutivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlConsecutivo.setText("Consecutivo");

        jtxtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEntradaLayout = new javax.swing.GroupLayout(jpEntrada);
        jpEntrada.setLayout(jpEntradaLayout);
        jpEntradaLayout.setHorizontalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlCelda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlHoraIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlFechaIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlTarifaxHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlConsecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtHoraIn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtTarifaxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtConsecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jpEntradaLayout.setVerticalGroup(
            jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpEntradaLayout.createSequentialGroup()
                        .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCedula)
                            .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jlNombre))
                    .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlaca)
                    .addComponent(jtxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpEntradaLayout.createSequentialGroup()
                        .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpEntradaLayout.createSequentialGroup()
                                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpEntradaLayout.createSequentialGroup()
                                        .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jpEntradaLayout.createSequentialGroup()
                                                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jpEntradaLayout.createSequentialGroup()
                                                        .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jlModelo)
                                                            .addComponent(jtxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jlColor))
                                                    .addComponent(jtxtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10)
                                                .addComponent(jlCelda))
                                            .addComponent(jtxtCelda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10)
                                        .addComponent(jlFechaIn))
                                    .addComponent(jtxtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(jlHoraIn))
                            .addComponent(jtxtHoraIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jlTarifaxHora))
                    .addComponent(jtxtTarifaxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlConsecutivo)
                    .addComponent(jtxtConsecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        add(jpEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCelda;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlConsecutivo;
    private javax.swing.JLabel jlFechaIn;
    private javax.swing.JLabel jlHoraIn;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlTarifaxHora;
    private javax.swing.JPanel jpEntrada;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtCelda;
    private javax.swing.JTextField jtxtColor;
    private javax.swing.JTextField jtxtConsecutivo;
    private javax.swing.JTextField jtxtFechaIn;
    private javax.swing.JTextField jtxtHoraIn;
    private javax.swing.JTextField jtxtModelo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtPlaca;
    private javax.swing.JTextField jtxtTarifaxHora;
    // End of variables declaration//GEN-END:variables
}
