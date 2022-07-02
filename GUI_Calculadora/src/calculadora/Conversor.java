/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author julian
 */
public class Conversor extends javax.swing.JFrame {

    private String divisasUno = "";
    private String divisasDos = "";
    private String cantidad = "";
    private double dinero, cambio;
    private boolean punto = true;

    public Conversor() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
    }

    private void obtenerDinero() {
        cantidad = etiquetaCambioUno.getText();
        dinero = Double.parseDouble(cantidad);
        cambioDivisa();
        dinero *= cambio;
        etiquetaCambioDos.setText(String.format("%.2f", dinero));
    }

    private void cambioDivisa() {
        if (divisasUno.equals(divisasDos)) {
            cambio = 1;
        } else if (divisasUno.equals("Estados Unidos - Dólar") && divisasDos.equals("Europa - Euro")) {
            cambio = 0.96;
        } else if (divisasUno.equals("Estados Unidos - Dólar") && divisasDos.equals("Colombia - Pesos")) {
            cambio = 4.205;            
        } else if (divisasUno.equals("Europa - Euro") && divisasDos.equals("Colombia - Pesos")) {
            cambio = 4.385;
        } else if (divisasUno.equals("Europa - Euro") && divisasDos.equals("Estados Unidos - Dólar")) {
            cambio = 1.04;
        } else if (divisasUno.equals("Colombia - Pesos") && divisasDos.equals("Estados Unidos - Dólar")) {
            cambio = 0.00024;
        } else if (divisasUno.equals("Colombia - Pesos") && divisasDos.equals("Europa - Euro")) {
            cambio = 0.00023;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        etiquetaDivisasUno = new javax.swing.JLabel();
        etiquetaCambioUno = new javax.swing.JLabel();
        comboDivisasUno = new javax.swing.JComboBox<>();
        etiquetaDivisasDos = new javax.swing.JLabel();
        etiquetaCambioDos = new javax.swing.JLabel();
        comboDivisasDos = new javax.swing.JComboBox<>();
        botonC = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        calculadoraEstandar = new javax.swing.JMenuItem();
        conversorDivisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        etiquetaDivisasUno.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiquetaDivisasUno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisasUno.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        jPanel1.add(etiquetaDivisasUno, gridBagConstraints);

        etiquetaCambioUno.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiquetaCambioUno.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(etiquetaCambioUno, gridBagConstraints);

        comboDivisasUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboDivisasUno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "Europa - Euro", "Colombia - Pesos" }));
        comboDivisasUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisasUnoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(comboDivisasUno, gridBagConstraints);

        etiquetaDivisasDos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiquetaDivisasDos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisasDos.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        jPanel1.add(etiquetaDivisasDos, gridBagConstraints);

        etiquetaCambioDos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiquetaCambioDos.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(etiquetaCambioDos, gridBagConstraints);

        comboDivisasDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        comboDivisasDos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dólar", "Europa - Euro", "Colombia - Pesos" }));
        comboDivisasDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisasDosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(comboDivisasDos, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(botonC, gridBagConstraints);

        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrar.png"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(botonBorrar, gridBagConstraints);

        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton7, gridBagConstraints);

        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton8, gridBagConstraints);

        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton9, gridBagConstraints);

        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton1, gridBagConstraints);

        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton2, gridBagConstraints);

        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton3, gridBagConstraints);

        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton4, gridBagConstraints);

        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton5, gridBagConstraints);

        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton6, gridBagConstraints);

        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton0, gridBagConstraints);

        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(botonPunto, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        calculadoraEstandar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        calculadoraEstandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora.png"))); // NOI18N
        calculadoraEstandar.setText("calculadora Estandar");
        calculadoraEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraEstandarActionPerformed(evt);
            }
        });
        menu.add(calculadoraEstandar);

        conversorDivisas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        conversorDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Conversor.png"))); // NOI18N
        conversorDivisas.setText("Conversor de Divisas");
        menu.add(conversorDivisas);
        menu.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculadoraEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraEstandarActionPerformed
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
        dispose();
    }//GEN-LAST:event_calculadoraEstandarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void comboDivisasUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisasUnoActionPerformed
        divisasUno = (String) comboDivisasUno.getSelectedItem();
        if (divisasUno.equals("Estados Unidos - Dólar")) {
            etiquetaDivisasUno.setText("$");
        } else if (divisasUno.equals("Europa - Euro")) {
            etiquetaDivisasUno.setText("Є");
        } else if (divisasUno.equals("Colombia - Pesos")) {
            etiquetaDivisasUno.setText("$");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboDivisasUnoActionPerformed

    private void comboDivisasDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisasDosActionPerformed
        divisasDos = (String) comboDivisasDos.getSelectedItem();
        if (divisasDos.equals("Estados Unidos - Dólar")) {
            etiquetaDivisasDos.setText("$");
        } else if (divisasDos.equals("Europa - Euro")) {
            etiquetaDivisasDos.setText("Є");
        } else if (divisasDos.equals("Colombia - Pesos")) {
            etiquetaDivisasDos.setText("$");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboDivisasDosActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "1";
        } else {
            cantidad += "1";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
        System.out.println(dinero);
        System.out.println(cambio);
        System.out.println(cantidad);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "2";
        } else {
            cantidad += "2";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "3";
        } else {
            cantidad += "3";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "4";
        } else {
            cantidad += "4";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "5";
        } else {
            cantidad += "5";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "6";
        } else {
            cantidad += "6";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "7";
        } else {
            cantidad += "7";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "8";
        } else {
            cantidad += "8";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if (etiquetaCambioUno.getText() == "0") {
            cantidad = "9";
        } else {
            cantidad += "9";
        }
        etiquetaCambioUno.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        if (cantidad != "") {
            if (etiquetaCambioUno.getText() == "0") {
                cantidad = "0";
            } else {
                cantidad += "0";
            }
            etiquetaCambioUno.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (punto) {
            if (cantidad == "") {
                cantidad = "0.";
            } else {
                cantidad += ".";
            }
            etiquetaCambioUno.setText(cantidad);
            punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int largo = cantidad.length();
        if (largo > 0) {
            if (largo == 1) {
                cantidad = "0";
            } else {
                cantidad = cantidad.substring(0, cantidad.length() - 1);
            }
            etiquetaCambioUno.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        cantidad = "";
        punto = true;
        etiquetaCambioUno.setText("");
        etiquetaCambioDos.setText("");        
    }//GEN-LAST:event_botonCActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            /* Create and display the form */

            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonPunto;
    private javax.swing.JMenuItem calculadoraEstandar;
    private javax.swing.JComboBox<String> comboDivisasDos;
    private javax.swing.JComboBox<String> comboDivisasUno;
    private javax.swing.JMenuItem conversorDivisas;
    private javax.swing.JLabel etiquetaCambioDos;
    private javax.swing.JLabel etiquetaCambioUno;
    private javax.swing.JLabel etiquetaDivisasDos;
    private javax.swing.JLabel etiquetaDivisasUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
