package com.frontend;

import com.formdev.flatlaf.FlatDarkLaf;

public class VentanasEmergentes extends javax.swing.JFrame {

    public VentanasEmergentes() {
        initComponents();
    }

    public void ventanaRequerida(String ventana) {
        pantallaCamposVacios.setVisible(false);
        pantallaMensajePersonalizado.setVisible(false);

        switch (ventana) {
            case "camposIncompletos":
                pantallaCamposVacios.setVisible(true);
                break;

            default:
                pantallaMensajePersonalizado.setVisible(true);
                tituloPersonalizado.setText(ventana);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaCamposVacios = new javax.swing.JPanel();
        tituloCamposVacios = new javax.swing.JLabel();
        botonCamposVacios = new javax.swing.JButton();
        pantallaMensajePersonalizado = new javax.swing.JPanel();
        tituloPersonalizado = new javax.swing.JLabel();
        botonPersonalizado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aviso");
        setMaximumSize(new java.awt.Dimension(560, 74));
        setMinimumSize(new java.awt.Dimension(280, 74));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.CardLayout());

        pantallaCamposVacios.setMaximumSize(new java.awt.Dimension(265, 74));
        pantallaCamposVacios.setMinimumSize(new java.awt.Dimension(265, 74));
        pantallaCamposVacios.setPreferredSize(new java.awt.Dimension(265, 74));

        tituloCamposVacios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCamposVacios.setText("Debe rellenar todos los campos para continuar");

        botonCamposVacios.setText("Aceptar");
        botonCamposVacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCamposVaciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaCamposVaciosLayout = new javax.swing.GroupLayout(pantallaCamposVacios);
        pantallaCamposVacios.setLayout(pantallaCamposVaciosLayout);
        pantallaCamposVaciosLayout.setHorizontalGroup(
                pantallaCamposVaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaCamposVaciosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(pantallaCamposVaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tituloCamposVacios, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaCamposVaciosLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(botonCamposVacios)))
                                .addGap(12, 12, 12))
        );
        pantallaCamposVaciosLayout.setVerticalGroup(
                pantallaCamposVaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaCamposVaciosLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tituloCamposVacios, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCamposVacios)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(pantallaCamposVacios, "card2");

        pantallaMensajePersonalizado.setMaximumSize(new java.awt.Dimension(560, 74));
        pantallaMensajePersonalizado.setMinimumSize(new java.awt.Dimension(560, 74));
        pantallaMensajePersonalizado.setPreferredSize(new java.awt.Dimension(560, 74));

        tituloPersonalizado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloPersonalizado.setText("Mensaje personalizado");

        botonPersonalizado.setText("Aceptar");
        botonPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaMensajePersonalizadoLayout = new javax.swing.GroupLayout(pantallaMensajePersonalizado);
        pantallaMensajePersonalizado.setLayout(pantallaMensajePersonalizadoLayout);
        pantallaMensajePersonalizadoLayout.setHorizontalGroup(
                pantallaMensajePersonalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaMensajePersonalizadoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(pantallaMensajePersonalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tituloPersonalizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pantallaMensajePersonalizadoLayout.createSequentialGroup()
                                                .addGap(0, 458, Short.MAX_VALUE)
                                                .addComponent(botonPersonalizado)))
                                .addGap(15, 15, 15))
        );
        pantallaMensajePersonalizadoLayout.setVerticalGroup(
                pantallaMensajePersonalizadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaMensajePersonalizadoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(tituloPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonPersonalizado)
                                .addGap(15, 15, 15))
        );

        getContentPane().add(pantallaMensajePersonalizado, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonalizadoActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonPersonalizadoActionPerformed

    private void botonCamposVaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCamposVaciosActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCamposVaciosActionPerformed

    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanasEmergentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCamposVacios;
    private javax.swing.JButton botonPersonalizado;
    private javax.swing.JPanel pantallaCamposVacios;
    private javax.swing.JPanel pantallaMensajePersonalizado;
    private javax.swing.JLabel tituloCamposVacios;
    private javax.swing.JLabel tituloPersonalizado;
    // End of variables declaration//GEN-END:variables
}
