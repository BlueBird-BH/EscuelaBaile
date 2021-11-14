package com.frontend;

import com.formdev.flatlaf.FlatDarkLaf;

public class Mensajes_GUI extends javax.swing.JFrame {

    public Mensajes_GUI() {
        initComponents();
    }

    public void interfazRequerida(String barraRequerida) {
        barraEliminar_Correcto.setVisible(false);
        barraEliminar_Existencia.setVisible(false);
        barraEliminar_Error.setVisible(false);
        barraAlerta_formatosVacios.setVisible(false);
        barraAlerta_datosCambiados.setVisible(false);
        barraAlerta_retirarPersona.setVisible(false);
        barraAlerta_retirarPersona_ocupadoOdontologo.setVisible(false);

        switch (barraRequerida) {
            case "correcto": // Eliminar archivo correctamente
                barraEliminar_Correcto.setVisible(true);
                break;

            case "existencia": // Eliminar archivo inexistente - Error
                barraEliminar_Existencia.setVisible(true);
                break;

            case "error": // Eliminar archivo - Error desconocido
                barraEliminar_Error.setVisible(true);
                break;

            case "vacio": // Formatos de texto estan vacios
                barraAlerta_formatosVacios.setVisible(true);
                break;

            case "modificarDatos": // Formatos de texto estan vacios
                barraAlerta_datosCambiados.setVisible(true);
                break;

            case "retirarPersona": // Retirar persona
                barraAlerta_retirarPersona.setVisible(true);
                
            case "retirarPersona_ocupadoOdontologo": // Retirar Odontologo - Error pues el odontologo tiene pacientes activos
                barraAlerta_retirarPersona_ocupadoOdontologo.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraEliminar_Correcto = new javax.swing.JPanel();
        textoEliminar_Correcto = new javax.swing.JLabel();
        botonEliminar_Correcto = new javax.swing.JButton();
        barraEliminar_Existencia = new javax.swing.JPanel();
        textoEliminar_Existencia = new javax.swing.JLabel();
        botonEliminar_Existencia = new javax.swing.JButton();
        barraEliminar_Error = new javax.swing.JPanel();
        textoEliminar_Error = new javax.swing.JLabel();
        botonEliminar_Error = new javax.swing.JButton();
        barraAlerta_formatosVacios = new javax.swing.JPanel();
        textoAlerta_formatosVacios = new javax.swing.JLabel();
        botonAlerta_formatosVacios = new javax.swing.JButton();
        barraAlerta_datosCambiados = new javax.swing.JPanel();
        textoAlerta_datosCambiados = new javax.swing.JLabel();
        botonAlerta_datosCambiados = new javax.swing.JButton();
        barraAlerta_retirarPersona = new javax.swing.JPanel();
        textoAlerta_retirarPersona = new javax.swing.JLabel();
        botonAlerta_retirarPersona = new javax.swing.JButton();
        barraAlerta_retirarPersona_ocupadoOdontologo = new javax.swing.JPanel();
        textoAlerta_retirarPersona1 = new javax.swing.JLabel();
        botonAlerta_retirarPersona1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aviso");
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new java.awt.CardLayout());

        barraEliminar_Correcto.setMaximumSize(new java.awt.Dimension(265, 74));
        barraEliminar_Correcto.setMinimumSize(new java.awt.Dimension(265, 74));
        barraEliminar_Correcto.setPreferredSize(new java.awt.Dimension(265, 74));

        textoEliminar_Correcto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoEliminar_Correcto.setText("Los datos han sido borrados correctamente");

        botonEliminar_Correcto.setText("Aceptar");
        botonEliminar_Correcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar_CorrectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEliminar_CorrectoLayout = new javax.swing.GroupLayout(barraEliminar_Correcto);
        barraEliminar_Correcto.setLayout(barraEliminar_CorrectoLayout);
        barraEliminar_CorrectoLayout.setHorizontalGroup(
            barraEliminar_CorrectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEliminar_CorrectoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(barraEliminar_CorrectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoEliminar_Correcto, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEliminar_CorrectoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonEliminar_Correcto)))
                .addGap(12, 12, 12))
        );
        barraEliminar_CorrectoLayout.setVerticalGroup(
            barraEliminar_CorrectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEliminar_CorrectoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textoEliminar_Correcto, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminar_Correcto)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraEliminar_Correcto, "card2");

        barraEliminar_Existencia.setMaximumSize(new java.awt.Dimension(265, 74));
        barraEliminar_Existencia.setMinimumSize(new java.awt.Dimension(265, 74));

        textoEliminar_Existencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoEliminar_Existencia.setText("Actualmente no hay datos guardados");

        botonEliminar_Existencia.setText("Aceptar");
        botonEliminar_Existencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar_ExistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEliminar_ExistenciaLayout = new javax.swing.GroupLayout(barraEliminar_Existencia);
        barraEliminar_Existencia.setLayout(barraEliminar_ExistenciaLayout);
        barraEliminar_ExistenciaLayout.setHorizontalGroup(
            barraEliminar_ExistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEliminar_ExistenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoEliminar_Existencia, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEliminar_ExistenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEliminar_Existencia)
                .addGap(12, 12, 12))
        );
        barraEliminar_ExistenciaLayout.setVerticalGroup(
            barraEliminar_ExistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEliminar_ExistenciaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textoEliminar_Existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminar_Existencia)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraEliminar_Existencia, "card2");

        barraEliminar_Error.setMaximumSize(new java.awt.Dimension(228, 74));
        barraEliminar_Error.setMinimumSize(new java.awt.Dimension(228, 74));

        textoEliminar_Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoEliminar_Error.setText("Error desconocido al eliminar los datos");

        botonEliminar_Error.setText("Aceptar");
        botonEliminar_Error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar_ErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEliminar_ErrorLayout = new javax.swing.GroupLayout(barraEliminar_Error);
        barraEliminar_Error.setLayout(barraEliminar_ErrorLayout);
        barraEliminar_ErrorLayout.setHorizontalGroup(
            barraEliminar_ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEliminar_ErrorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(barraEliminar_ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEliminar_Error)
                    .addComponent(textoEliminar_Error))
                .addGap(12, 12, 12))
        );
        barraEliminar_ErrorLayout.setVerticalGroup(
            barraEliminar_ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEliminar_ErrorLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textoEliminar_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEliminar_Error)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraEliminar_Error, "card2");

        barraAlerta_formatosVacios.setMaximumSize(new java.awt.Dimension(372, 74));
        barraAlerta_formatosVacios.setMinimumSize(new java.awt.Dimension(372, 74));

        textoAlerta_formatosVacios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAlerta_formatosVacios.setText("Asegúrese de rellenar todos los campos vacíos antes de continuar ");

        botonAlerta_formatosVacios.setText("Aceptar");
        botonAlerta_formatosVacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlerta_formatosVaciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraAlerta_formatosVaciosLayout = new javax.swing.GroupLayout(barraAlerta_formatosVacios);
        barraAlerta_formatosVacios.setLayout(barraAlerta_formatosVaciosLayout);
        barraAlerta_formatosVaciosLayout.setHorizontalGroup(
            barraAlerta_formatosVaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAlerta_formatosVaciosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(barraAlerta_formatosVaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoAlerta_formatosVacios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAlerta_formatosVaciosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonAlerta_formatosVacios)))
                .addGap(12, 12, 12))
        );
        barraAlerta_formatosVaciosLayout.setVerticalGroup(
            barraAlerta_formatosVaciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAlerta_formatosVaciosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textoAlerta_formatosVacios, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAlerta_formatosVacios)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraAlerta_formatosVacios, "card2");

        barraAlerta_datosCambiados.setMaximumSize(new java.awt.Dimension(280, 74));
        barraAlerta_datosCambiados.setMinimumSize(new java.awt.Dimension(280, 74));

        textoAlerta_datosCambiados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAlerta_datosCambiados.setText("Los datos fueron modificados correctamente");

        botonAlerta_datosCambiados.setText("Aceptar");
        botonAlerta_datosCambiados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlerta_datosCambiadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraAlerta_datosCambiadosLayout = new javax.swing.GroupLayout(barraAlerta_datosCambiados);
        barraAlerta_datosCambiados.setLayout(barraAlerta_datosCambiadosLayout);
        barraAlerta_datosCambiadosLayout.setHorizontalGroup(
            barraAlerta_datosCambiadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAlerta_datosCambiadosLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(botonAlerta_datosCambiados)
                .addGap(12, 12, 12))
            .addComponent(textoAlerta_datosCambiados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraAlerta_datosCambiadosLayout.setVerticalGroup(
            barraAlerta_datosCambiadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAlerta_datosCambiadosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textoAlerta_datosCambiados, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAlerta_datosCambiados)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraAlerta_datosCambiados, "card2");

        barraAlerta_retirarPersona.setMaximumSize(new java.awt.Dimension(265, 74));
        barraAlerta_retirarPersona.setMinimumSize(new java.awt.Dimension(265, 74));

        textoAlerta_retirarPersona.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAlerta_retirarPersona.setText("La persona ha sido retirada correctamente");

        botonAlerta_retirarPersona.setText("Aceptar");
        botonAlerta_retirarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlerta_retirarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraAlerta_retirarPersonaLayout = new javax.swing.GroupLayout(barraAlerta_retirarPersona);
        barraAlerta_retirarPersona.setLayout(barraAlerta_retirarPersonaLayout);
        barraAlerta_retirarPersonaLayout.setHorizontalGroup(
            barraAlerta_retirarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAlerta_retirarPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoAlerta_retirarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAlerta_retirarPersonaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAlerta_retirarPersona)
                .addGap(12, 12, 12))
        );
        barraAlerta_retirarPersonaLayout.setVerticalGroup(
            barraAlerta_retirarPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAlerta_retirarPersonaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textoAlerta_retirarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAlerta_retirarPersona)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraAlerta_retirarPersona, "card2");

        barraAlerta_retirarPersona_ocupadoOdontologo.setMaximumSize(new java.awt.Dimension(587, 74));
        barraAlerta_retirarPersona_ocupadoOdontologo.setMinimumSize(new java.awt.Dimension(587, 74));

        textoAlerta_retirarPersona1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoAlerta_retirarPersona1.setText("El empleado no puede ser eliminado. Asegurese de transferrir sus pacientes antes de realizar la eliminacion");

        botonAlerta_retirarPersona1.setText("Aceptar");
        botonAlerta_retirarPersona1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlerta_retirarPersona1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraAlerta_retirarPersona_ocupadoOdontologoLayout = new javax.swing.GroupLayout(barraAlerta_retirarPersona_ocupadoOdontologo);
        barraAlerta_retirarPersona_ocupadoOdontologo.setLayout(barraAlerta_retirarPersona_ocupadoOdontologoLayout);
        barraAlerta_retirarPersona_ocupadoOdontologoLayout.setHorizontalGroup(
            barraAlerta_retirarPersona_ocupadoOdontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAlerta_retirarPersona_ocupadoOdontologoLayout.createSequentialGroup()
                .addContainerGap(503, Short.MAX_VALUE)
                .addComponent(botonAlerta_retirarPersona1)
                .addGap(12, 12, 12))
            .addComponent(textoAlerta_retirarPersona1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraAlerta_retirarPersona_ocupadoOdontologoLayout.setVerticalGroup(
            barraAlerta_retirarPersona_ocupadoOdontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAlerta_retirarPersona_ocupadoOdontologoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(textoAlerta_retirarPersona1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAlerta_retirarPersona1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraAlerta_retirarPersona_ocupadoOdontologo, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminar_ExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar_ExistenciaActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonEliminar_ExistenciaActionPerformed

    private void botonEliminar_ErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar_ErrorActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonEliminar_ErrorActionPerformed

    private void botonAlerta_formatosVaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlerta_formatosVaciosActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAlerta_formatosVaciosActionPerformed

    private void botonAlerta_datosCambiadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlerta_datosCambiadosActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAlerta_datosCambiadosActionPerformed

    private void botonAlerta_retirarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlerta_retirarPersonaActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAlerta_retirarPersonaActionPerformed

    private void botonAlerta_retirarPersona1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlerta_retirarPersona1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAlerta_retirarPersona1ActionPerformed

    private void botonEliminar_CorrectoActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

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
                new Mensajes_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraAlerta_datosCambiados;
    private javax.swing.JPanel barraAlerta_formatosVacios;
    private javax.swing.JPanel barraAlerta_retirarPersona;
    private javax.swing.JPanel barraAlerta_retirarPersona_ocupadoOdontologo;
    private javax.swing.JPanel barraEliminar_Correcto;
    private javax.swing.JPanel barraEliminar_Error;
    private javax.swing.JPanel barraEliminar_Existencia;
    private javax.swing.JButton botonAlerta_datosCambiados;
    private javax.swing.JButton botonAlerta_formatosVacios;
    private javax.swing.JButton botonAlerta_retirarPersona;
    private javax.swing.JButton botonAlerta_retirarPersona1;
    private javax.swing.JButton botonEliminar_Correcto;
    private javax.swing.JButton botonEliminar_Error;
    private javax.swing.JButton botonEliminar_Existencia;
    private javax.swing.JLabel textoAlerta_datosCambiados;
    private javax.swing.JLabel textoAlerta_formatosVacios;
    private javax.swing.JLabel textoAlerta_retirarPersona;
    private javax.swing.JLabel textoAlerta_retirarPersona1;
    private javax.swing.JLabel textoEliminar_Correcto;
    private javax.swing.JLabel textoEliminar_Error;
    private javax.swing.JLabel textoEliminar_Existencia;
    // End of variables declaration//GEN-END:variables
}
