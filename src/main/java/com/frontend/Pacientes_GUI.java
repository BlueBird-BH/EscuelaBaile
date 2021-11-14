package com.frontend;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.DefaultListModel;

public class Pacientes_GUI extends javax.swing.JFrame {

    // Metodo que inicia las caracteristicas de la interfaz grafica - Inicio
    public Pacientes_GUI() {
        initComponents();
    }
    // Metodo que inicia las caracteristicas de la interfaz grafica - Fin
    
    // Metodo que determina que mensaje mostrar en la pantalla - Inicio
    private void mensajePantalla(String mensajeRequerido) {
        interfazGrafica_mensajeAlerta.setVisible(true);

        switch (mensajeRequerido) {
            case "vacio": // Mensaje alerta de campos vacios
                interfazGrafica_mensajeAlerta.interfazRequerida(mensajeRequerido);
                break;

            case "modificarDatos": // Mensaje alerta de modificacion de datos
                interfazGrafica_mensajeAlerta.interfazRequerida(mensajeRequerido);
                break;

            case "retirarPersona": // Mensaje alerta de modificacion de datos
                interfazGrafica_mensajeAlerta.interfazRequerida(mensajeRequerido);
                break;
        }
    }
    // Metodo que determina que mensaje mostrar en la pantalla - Fin
    
    // Metodo que carga los valores que tendra la JComboBox - Inicio
    private void cargarCombo() {
        comboCampo_detalles_identificacion.removeAllItems();
        comboCampo_odontologo_identificacion.removeAllItems();
        comboCampo_retirar_identificacion.removeAllItems();

        for (int n = 0; n < Paciente.listaPacientes.size(); n++) {
            comboCampo_detalles_identificacion.addItem(Paciente.listaPacientes.get(n).get_identificacion());
            comboCampo_odontologo_identificacion.addItem(Paciente.listaPacientes.get(n).get_identificacion());
            comboCampo_retirar_identificacion.addItem(Paciente.listaPacientes.get(n).get_identificacion());
        }
    }
    // Metodo que carga los valores que tendra la JComboBox - Fin

    // Metodo que determina que valores y opciones deben mostrarse en la pantalla - Inicio
    public void interfazRequerida(String barraRequerida) {
        barraPacientes_ingresar.setVisible(false);
        barraPacientes_detalles.setVisible(false);
        barraPacientes_odontologo.setVisible(false);
        barraPacientes_retirar.setVisible(false);
        barraPacientes_lista.setVisible(false);

        switch (barraRequerida) {
            case "ingresar": // Registrar paciente
                formatoCampo_ingresar_nombre.setText(null);
                formatoCampo_ingresar_identificacion.setText(null);
                formatoCampo_ingresar_nacimiento.setText(null);
                formatoCampo_ingresar_inicioTratamiento.setText(null);
                formatoCampo_ingresar_finalTratamiento.setText(null);
                formatoCampo_ingresar_tratamientoRealizado.setText(null);
                formatoCampo_ingresar_diagnostico.setText(null);
                formatoCampo_ingresar_odontologo.setText(null);

                barraPacientes_ingresar.setVisible(true);
                break;

            case "historia": // Historia clinica
                formatoCampo_detalles_nombre.setText(null);
                formatoCampo_detalles_nacimiento.setText(null);
                formatoCampo_detalles_inicioTratamiento.setText(null);
                formatoCampo_detalles_finalTratamiento.setText(null);
                formatoCampo_detalles_tratamientoRealizado.setText(null);
                formatoCampo_detalles_diagnostico.setText(null);
                formatoCampo_detalles_odontologo.setText(null);
                cargarCombo();
                
                formatoCampo_detalles_nombre.setEditable(false);
                formatoCampo_detalles_nacimiento.setEditable(false);
                formatoCampo_detalles_inicioTratamiento.setEditable(false);
                formatoCampo_detalles_finalTratamiento.setEditable(false);
                formatoCampo_detalles_tratamientoRealizado.setEditable(false);
                formatoCampo_detalles_diagnostico.setEditable(false);
                formatoCampo_detalles_odontologo.setEditable(false);
                
                barraPacientes_detalles.setVisible(true);
                break;

            case "odontologo": // Cambiar odontologo
                formatoCampo_odontologo_nombre.setText(null);
                formatoCampo_odontologo_odontologoActual.setText(null);
                formatoCampo_odontologo_odontologoNuevo.setText(null);
                cargarCombo();
                
                formatoCampo_odontologo_nombre.setEditable(false);
                formatoCampo_odontologo_odontologoActual.setEditable(false);
                
                barraPacientes_odontologo.setVisible(true);
                break;

            case "retirar": // Retirar paciente
                formatoCampo_retirar_nombre.setText(null);
                formatoCampo_retirar_nacimiento.setText(null);
                formatoCampo_retirar_inicioTratamiento.setText(null);
                formatoCampo_retirar_finalTratamiento.setText(null);
                formatoCampo_retirar_tratamientoRealizado.setText(null);
                formatoCampo_retirar_diagnostico.setText(null);
                formatoCampo_retirar_odontologo.setText(null);
                cargarCombo();
                
                formatoCampo_retirar_nombre.setEditable(false);
                formatoCampo_retirar_nacimiento.setEditable(false);
                formatoCampo_retirar_inicioTratamiento.setEditable(false);
                formatoCampo_retirar_finalTratamiento.setEditable(false);
                formatoCampo_retirar_tratamientoRealizado.setEditable(false);
                formatoCampo_retirar_diagnostico.setEditable(false);
                formatoCampo_retirar_odontologo.setEditable(false);

                barraPacientes_retirar.setVisible(true);
                break;

            case "lista": // Lista de pacientes
                pacientes.listaPersona(listaModelo, formatoCampo_lista);
                barraPacientes_lista.setVisible(true);
                break;
        }
    }
    // Metodo que determina que valores y opciones deben mostrarse en la pantalla - Fin

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraPacientes_ingresar = new javax.swing.JPanel();
        textoCampo_ingresar_nombre = new javax.swing.JLabel();
        textoCampo_ingresar_identificacion = new javax.swing.JLabel();
        textoCampo_ingresar_nacimiento = new javax.swing.JLabel();
        textoCampo_ingresar_inicioTratamiento = new javax.swing.JLabel();
        textoCampo_ingresar_finalTratamiento = new javax.swing.JLabel();
        textoCampo_ingresar_tratamientoRealizado = new javax.swing.JLabel();
        textoCampo_ingresar_diagnostico = new javax.swing.JLabel();
        textoCampo_ingresar_odontologo = new javax.swing.JLabel();
        formatoCampo_ingresar_nombre = new javax.swing.JTextField();
        formatoCampo_ingresar_identificacion = new javax.swing.JTextField();
        formatoCampo_ingresar_nacimiento = new javax.swing.JTextField();
        formatoCampo_ingresar_inicioTratamiento = new javax.swing.JTextField();
        formatoCampo_ingresar_finalTratamiento = new javax.swing.JTextField();
        formatoCampo_ingresar_tratamientoRealizado = new javax.swing.JTextField();
        formatoCampo_ingresar_diagnostico = new javax.swing.JTextField();
        formatoCampo_ingresar_odontologo = new javax.swing.JTextField();
        botonPacientes_registrarDatos = new javax.swing.JButton();
        botonPacientes_ingresarRegresar = new javax.swing.JButton();
        barraPacientes_detalles = new javax.swing.JPanel();
        textoCampo_detalles_identificacion = new javax.swing.JLabel();
        textoCampo_detalles_nombre = new javax.swing.JLabel();
        textoCampo_detalles_nacimiento = new javax.swing.JLabel();
        textoCampo_detalles_inicioTratamiento = new javax.swing.JLabel();
        textoCampo_detalles_finalTratamiento = new javax.swing.JLabel();
        textoCampo_detalles_tratamientoRealizado = new javax.swing.JLabel();
        textoCampo_detalles_diagnostico = new javax.swing.JLabel();
        textoCampo_detalles_odontologo = new javax.swing.JLabel();
        formatoCampo_detalles_nombre = new javax.swing.JTextField();
        formatoCampo_detalles_nacimiento = new javax.swing.JTextField();
        formatoCampo_detalles_inicioTratamiento = new javax.swing.JTextField();
        formatoCampo_detalles_finalTratamiento = new javax.swing.JTextField();
        formatoCampo_detalles_tratamientoRealizado = new javax.swing.JTextField();
        formatoCampo_detalles_diagnostico = new javax.swing.JTextField();
        formatoCampo_detalles_odontologo = new javax.swing.JTextField();
        botonPacientes_detallesRegresar = new javax.swing.JButton();
        comboCampo_detalles_identificacion = new javax.swing.JComboBox<>();
        botonPacientes_consultarDatos = new javax.swing.JButton();
        barraPacientes_odontologo = new javax.swing.JPanel();
        textoCampo_odontologo_identificacion = new javax.swing.JLabel();
        textoCampo_odontologo_nombre = new javax.swing.JLabel();
        textoCampo_odontologo_odontologoActual = new javax.swing.JLabel();
        textoCampo_odontologo_odontologoNuevo = new javax.swing.JLabel();
        formatoCampo_odontologo_nombre = new javax.swing.JTextField();
        formatoCampo_odontologo_odontologoActual = new javax.swing.JTextField();
        formatoCampo_odontologo_odontologoNuevo = new javax.swing.JTextField();
        comboCampo_odontologo_identificacion = new javax.swing.JComboBox<>();
        botonPacientes_consultarOdontologo = new javax.swing.JButton();
        botonPacientes_registrarOdontologo = new javax.swing.JButton();
        botonPacientes_odontologoRegresar = new javax.swing.JButton();
        barraPacientes_retirar = new javax.swing.JPanel();
        textoCampo_retirar_identificacion = new javax.swing.JLabel();
        textoCampo_retirar_nombre = new javax.swing.JLabel();
        textoCampo_retirar_nacimiento = new javax.swing.JLabel();
        textoCampo_retirar_inicioTratamiento = new javax.swing.JLabel();
        textoCampo_retirar_finalTratamiento = new javax.swing.JLabel();
        textoCampo_retirar_tratamientoRealizado = new javax.swing.JLabel();
        textoCampo_retirar_diagnostico = new javax.swing.JLabel();
        textoCampo_retirar_odontologo = new javax.swing.JLabel();
        formatoCampo_retirar_nombre = new javax.swing.JTextField();
        formatoCampo_retirar_nacimiento = new javax.swing.JTextField();
        formatoCampo_retirar_inicioTratamiento = new javax.swing.JTextField();
        formatoCampo_retirar_finalTratamiento = new javax.swing.JTextField();
        formatoCampo_retirar_tratamientoRealizado = new javax.swing.JTextField();
        formatoCampo_retirar_diagnostico = new javax.swing.JTextField();
        formatoCampo_retirar_odontologo = new javax.swing.JTextField();
        botonPacientes_retirarRegresar = new javax.swing.JButton();
        comboCampo_retirar_identificacion = new javax.swing.JComboBox<>();
        botonPacientes_retirar_consultarDatos = new javax.swing.JButton();
        botonPacientes_retirarPaciente = new javax.swing.JButton();
        barraPacientes_lista = new javax.swing.JPanel();
        formatoCampo_lista_scroll = new javax.swing.JScrollPane();
        formatoCampo_lista = new javax.swing.JList<>();
        botonPacientes_listaRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seatora - Sistema Especializado de Atención Oral");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        barraPacientes_ingresar.setMaximumSize(new java.awt.Dimension(300, 300));
        barraPacientes_ingresar.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_ingresar_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_nombre.setText("Nombre del paciente");

        textoCampo_ingresar_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_identificacion.setText("Documento de identidad");

        textoCampo_ingresar_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_nacimiento.setText("Fecha de nacimiento (dd/MM/yy)");

        textoCampo_ingresar_inicioTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_inicioTratamiento.setText("Inicio del tratamiento (dd/MM/yy)");

        textoCampo_ingresar_finalTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_finalTratamiento.setText("Final del tratamiento (dd/MM/yy)");

        textoCampo_ingresar_tratamientoRealizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_tratamientoRealizado.setText("Tratamiento realizado");

        textoCampo_ingresar_diagnostico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_diagnostico.setText("Diagnostico del paciente");

        textoCampo_ingresar_odontologo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_odontologo.setText("Nombre del odontologo asignado");

        botonPacientes_registrarDatos.setText("Registrar datos del paciente");
        botonPacientes_registrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_registrarDatosActionPerformed(evt);
            }
        });

        botonPacientes_ingresarRegresar.setText("Regresar");
        botonPacientes_ingresarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_ingresarRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraPacientes_ingresarLayout = new javax.swing.GroupLayout(barraPacientes_ingresar);
        barraPacientes_ingresar.setLayout(barraPacientes_ingresarLayout);
        barraPacientes_ingresarLayout.setHorizontalGroup(
            barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPacientes_ingresarLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraPacientes_ingresarLayout.createSequentialGroup()
                        .addComponent(botonPacientes_registrarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonPacientes_ingresarRegresar))
                    .addGroup(barraPacientes_ingresarLayout.createSequentialGroup()
                        .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_ingresar_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCampo_ingresar_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_inicioTratamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_finalTratamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_tratamientoRealizado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_diagnostico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_odontologo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_ingresar_inicioTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(formatoCampo_ingresar_nombre)
                            .addComponent(formatoCampo_ingresar_identificacion)
                            .addComponent(formatoCampo_ingresar_nacimiento)
                            .addComponent(formatoCampo_ingresar_finalTratamiento)
                            .addComponent(formatoCampo_ingresar_tratamientoRealizado)
                            .addComponent(formatoCampo_ingresar_odontologo)
                            .addComponent(formatoCampo_ingresar_diagnostico))))
                .addGap(32, 32, 32))
        );
        barraPacientes_ingresarLayout.setVerticalGroup(
            barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPacientes_ingresarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_identificacion))
                .addGap(12, 12, 12)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_inicioTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_inicioTratamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_finalTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_finalTratamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_tratamientoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_tratamientoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_diagnostico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_odontologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_odontologo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPacientes_registrarDatos)
                    .addComponent(botonPacientes_ingresarRegresar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraPacientes_ingresar, "card4");

        barraPacientes_detalles.setMaximumSize(new java.awt.Dimension(300, 300));
        barraPacientes_detalles.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_detalles_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_identificacion.setText("Documento de identidad");

        textoCampo_detalles_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_nombre.setText("Nombre del paciente");

        textoCampo_detalles_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_nacimiento.setText("Fecha de nacimiento");

        textoCampo_detalles_inicioTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_inicioTratamiento.setText("Fecha inicial del tratamiento");

        textoCampo_detalles_finalTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_finalTratamiento.setText("Fecha final del tratamiento");

        textoCampo_detalles_tratamientoRealizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_tratamientoRealizado.setText("Tratamiento realizado");

        textoCampo_detalles_diagnostico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_diagnostico.setText("Diagnostico del paciente");

        textoCampo_detalles_odontologo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_odontologo.setText("Nombre del odontologo asignado");

        botonPacientes_detallesRegresar.setText("Regresar");
        botonPacientes_detallesRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_detallesRegresarActionPerformed(evt);
            }
        });

        botonPacientes_consultarDatos.setText("Consultar datos");
        botonPacientes_consultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_consultarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraPacientes_detallesLayout = new javax.swing.GroupLayout(barraPacientes_detalles);
        barraPacientes_detalles.setLayout(barraPacientes_detallesLayout);
        barraPacientes_detallesLayout.setHorizontalGroup(
            barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPacientes_detallesLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraPacientes_detallesLayout.createSequentialGroup()
                        .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_detalles_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_inicioTratamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_finalTratamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_tratamientoRealizado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_diagnostico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_odontologo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_detalles_inicioTratamiento)
                            .addComponent(formatoCampo_detalles_nombre)
                            .addComponent(formatoCampo_detalles_nacimiento)
                            .addComponent(formatoCampo_detalles_finalTratamiento)
                            .addComponent(formatoCampo_detalles_tratamientoRealizado)
                            .addComponent(formatoCampo_detalles_odontologo)
                            .addComponent(formatoCampo_detalles_diagnostico)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPacientes_detallesLayout.createSequentialGroup()
                                .addComponent(comboCampo_detalles_identificacion, 0, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonPacientes_consultarDatos))))
                    .addComponent(botonPacientes_detallesRegresar))
                .addGap(32, 32, 32))
        );
        barraPacientes_detallesLayout.setVerticalGroup(
            barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPacientes_detallesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_detalles_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_identificacion)
                    .addComponent(botonPacientes_consultarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_nombre))
                .addGap(12, 12, 12)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_inicioTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_inicioTratamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_finalTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_finalTratamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_tratamientoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_tratamientoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_diagnostico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_odontologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_odontologo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPacientes_detallesRegresar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraPacientes_detalles, "card4");

        barraPacientes_odontologo.setMaximumSize(new java.awt.Dimension(300, 300));
        barraPacientes_odontologo.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_odontologo_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_odontologo_identificacion.setText("Documento de identidad");

        textoCampo_odontologo_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_odontologo_nombre.setText("Nombre del paciente");

        textoCampo_odontologo_odontologoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_odontologo_odontologoActual.setText("Nombre del odontologo asignado");

        textoCampo_odontologo_odontologoNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_odontologo_odontologoNuevo.setText("Nombre del nuevo odontologo ");

        botonPacientes_consultarOdontologo.setText("Consultar datos");
        botonPacientes_consultarOdontologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_consultarOdontologoActionPerformed(evt);
            }
        });

        botonPacientes_registrarOdontologo.setText("Registrar nuevos datos del paciente");
        botonPacientes_registrarOdontologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_registrarOdontologoActionPerformed(evt);
            }
        });

        botonPacientes_odontologoRegresar.setText("Regresar");
        botonPacientes_odontologoRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_odontologoRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraPacientes_odontologoLayout = new javax.swing.GroupLayout(barraPacientes_odontologo);
        barraPacientes_odontologo.setLayout(barraPacientes_odontologoLayout);
        barraPacientes_odontologoLayout.setHorizontalGroup(
            barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPacientes_odontologoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonPacientes_registrarOdontologo)
                    .addComponent(botonPacientes_odontologoRegresar)
                    .addGroup(barraPacientes_odontologoLayout.createSequentialGroup()
                        .addGroup(barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_odontologo_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_odontologo_odontologoActual, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_odontologo_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCampo_odontologo_odontologoNuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_odontologo_odontologoNuevo)
                            .addComponent(formatoCampo_odontologo_nombre)
                            .addComponent(formatoCampo_odontologo_odontologoActual)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPacientes_odontologoLayout.createSequentialGroup()
                                .addComponent(comboCampo_odontologo_identificacion, 0, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonPacientes_consultarOdontologo)))))
                .addGap(32, 32, 32))
        );
        barraPacientes_odontologoLayout.setVerticalGroup(
            barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPacientes_odontologoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_odontologo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_odontologo_identificacion)
                    .addComponent(botonPacientes_consultarOdontologo))
                .addGap(55, 55, 55)
                .addGroup(barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_odontologo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_odontologo_nombre))
                .addGap(12, 12, 12)
                .addGroup(barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_odontologo_odontologoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_odontologo_odontologoActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_odontologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_odontologo_odontologoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_odontologo_odontologoNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPacientes_registrarOdontologo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(botonPacientes_odontologoRegresar)
                .addGap(18, 18, 18))
        );

        getContentPane().add(barraPacientes_odontologo, "card4");

        barraPacientes_retirar.setMaximumSize(new java.awt.Dimension(300, 300));
        barraPacientes_retirar.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_retirar_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_identificacion.setText("Documento de identidad");

        textoCampo_retirar_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_nombre.setText("Nombre del paciente");

        textoCampo_retirar_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_nacimiento.setText("Fecha de nacimiento");

        textoCampo_retirar_inicioTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_inicioTratamiento.setText("Fecha inicial del tratamiento");

        textoCampo_retirar_finalTratamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_finalTratamiento.setText("Fecha final del tratamiento");

        textoCampo_retirar_tratamientoRealizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_tratamientoRealizado.setText("Tratamiento realizado");

        textoCampo_retirar_diagnostico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_diagnostico.setText("Diagnostico del paciente");

        textoCampo_retirar_odontologo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_odontologo.setText("Nombre del odontologo asignado");

        botonPacientes_retirarRegresar.setText("Regresar");
        botonPacientes_retirarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_retirarRegresarActionPerformed(evt);
            }
        });

        botonPacientes_retirar_consultarDatos.setText("Consultar datos");
        botonPacientes_retirar_consultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_retirar_consultarDatosActionPerformed(evt);
            }
        });

        botonPacientes_retirarPaciente.setText("Dar de alta al paciente");
        botonPacientes_retirarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_retirarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraPacientes_retirarLayout = new javax.swing.GroupLayout(barraPacientes_retirar);
        barraPacientes_retirar.setLayout(barraPacientes_retirarLayout);
        barraPacientes_retirarLayout.setHorizontalGroup(
            barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPacientes_retirarLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoCampo_retirar_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoCampo_retirar_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoCampo_retirar_inicioTratamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoCampo_retirar_finalTratamiento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoCampo_retirar_tratamientoRealizado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoCampo_retirar_diagnostico, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoCampo_retirar_odontologo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoCampo_retirar_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(barraPacientes_retirarLayout.createSequentialGroup()
                        .addComponent(botonPacientes_retirarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPacientes_retirarRegresar))
                    .addComponent(formatoCampo_retirar_inicioTratamiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatoCampo_retirar_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatoCampo_retirar_nacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatoCampo_retirar_finalTratamiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatoCampo_retirar_tratamientoRealizado, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatoCampo_retirar_odontologo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formatoCampo_retirar_diagnostico, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraPacientes_retirarLayout.createSequentialGroup()
                        .addComponent(comboCampo_retirar_identificacion, 0, 103, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonPacientes_retirar_consultarDatos)))
                .addGap(32, 32, 32))
        );
        barraPacientes_retirarLayout.setVerticalGroup(
            barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPacientes_retirarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_retirar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_identificacion)
                    .addComponent(botonPacientes_retirar_consultarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_nombre))
                .addGap(12, 12, 12)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_inicioTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_inicioTratamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_finalTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_finalTratamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_tratamientoRealizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_tratamientoRealizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_diagnostico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_odontologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_odontologo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraPacientes_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPacientes_retirarRegresar)
                    .addComponent(botonPacientes_retirarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraPacientes_retirar, "card4");

        barraPacientes_lista.setMaximumSize(new java.awt.Dimension(300, 300));
        barraPacientes_lista.setMinimumSize(new java.awt.Dimension(300, 300));

        formatoCampo_lista_scroll.setViewportView(formatoCampo_lista);

        botonPacientes_listaRegresar.setText("Regresar");
        botonPacientes_listaRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPacientes_listaRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraPacientes_listaLayout = new javax.swing.GroupLayout(barraPacientes_lista);
        barraPacientes_lista.setLayout(barraPacientes_listaLayout);
        barraPacientes_listaLayout.setHorizontalGroup(
            barraPacientes_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPacientes_listaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraPacientes_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPacientes_listaRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formatoCampo_lista_scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        barraPacientes_listaLayout.setVerticalGroup(
            barraPacientes_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPacientes_listaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(formatoCampo_lista_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonPacientes_listaRegresar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(barraPacientes_lista, "card4");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Metodo que permite que al presionar botonPacientes_listaRegresar, este se cierre - Inicio
    private void botonPacientes_listaRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_listaRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonPacientes_listaRegresarActionPerformed
    // Metodo que permite que al presionar botonPacientes_listaRegresar, este se cierre - Fin
    
    // Metodo que toma los valores del formulario para registrar un paciente y los carga en listaPacientes - Inicio
    private void botonPacientes_registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_registrarDatosActionPerformed
        if ((formatoCampo_ingresar_nombre.getText().equals("") == true)
                || (formatoCampo_ingresar_identificacion.getText().equals("") == true)
                || (formatoCampo_ingresar_nacimiento.getText().equals("") == true)
                || (formatoCampo_ingresar_inicioTratamiento.getText().equals("") == true)
                || (formatoCampo_ingresar_finalTratamiento.getText().equals("") == true)
                || (formatoCampo_ingresar_tratamientoRealizado.getText().equals("") == true)
                || (formatoCampo_ingresar_diagnostico.getText().equals("") == true)
                || (formatoCampo_ingresar_odontologo.getText().equals("") == true)) {

            mensajePantalla("vacio");
        } else {
            pacientes.registrarPersona("Paciente",
                    formatoCampo_ingresar_nombre.getText(),
                    formatoCampo_ingresar_identificacion.getText(),
                    formatoCampo_ingresar_nacimiento.getText(),
                    formatoCampo_ingresar_inicioTratamiento.getText(),
                    formatoCampo_ingresar_finalTratamiento.getText(),
                    formatoCampo_ingresar_tratamientoRealizado.getText(),
                    formatoCampo_ingresar_diagnostico.getText(),
                    formatoCampo_ingresar_odontologo.getText()
            );
            seatoraPersistencia.guardarArchivo();
            this.dispose();
        }
    }//GEN-LAST:event_botonPacientes_registrarDatosActionPerformed
    // Metodo que toma los valores del formulario para registrar un paciente y los carga en listaPacientes - Fin
    
    // Metodo que permite que al presionar botonPacientes_detallesRegresar, este se cierre - Inicio
    private void botonPacientes_detallesRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_detallesRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonPacientes_detallesRegresarActionPerformed
    // Metodo que permite que al presionar botonPacientes_detallesRegresar, este se cierre - Fin
    
    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del paciente requerido - Inicio
    private void botonPacientes_consultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_consultarDatosActionPerformed
        pacientes.detallesPersona(comboCampo_detalles_identificacion,
                formatoCampo_detalles_nombre,
                formatoCampo_detalles_nacimiento,
                formatoCampo_detalles_inicioTratamiento,
                formatoCampo_detalles_finalTratamiento,
                formatoCampo_detalles_tratamientoRealizado,
                formatoCampo_detalles_diagnostico,
                formatoCampo_detalles_odontologo);
    }//GEN-LAST:event_botonPacientes_consultarDatosActionPerformed
    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del paciente requerido - Fin
    
    // Metodo que permite que al presionar botonPacientes_odontologoRegresar, este se cierre - Inicio
    private void botonPacientes_odontologoRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_odontologoRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonPacientes_odontologoRegresarActionPerformed
    // Metodo que permite que al presionar botonPacientes_odontologoRegresar, este se cierre - Fin
    
    // Metodo que muestra en pantalla el nombre del paciente y del odontologo que lo esta tratando actualmente - Inicio
    private void botonPacientes_consultarOdontologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_consultarOdontologoActionPerformed
        String criterioBusqueda = String.valueOf(comboCampo_odontologo_identificacion.getSelectedItem());

        for (int n = 0; n < Paciente.listaPacientes.size(); n++) {
            if (Paciente.listaPacientes.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                formatoCampo_odontologo_nombre.setText(Paciente.listaPacientes.get(n).get_nombreCompleto());
                formatoCampo_odontologo_odontologoActual.setText(Paciente.listaPacientes.get(n).get_nombreOdontologo());
            }
        }
    }//GEN-LAST:event_botonPacientes_consultarOdontologoActionPerformed
    // Metodo que muestra en pantalla el nombre del paciente y del odontologo que lo esta tratando actualmente - Fin
    
    // Metodo que determina si el usuario ya registro el nombre del odontologo nuevo del paciente, si es asi, lo modifica y guarda el archivo - Inicio
    private void botonPacientes_registrarOdontologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_registrarOdontologoActionPerformed
        if (formatoCampo_odontologo_odontologoNuevo.getText().equals("") == true) {
            mensajePantalla("vacio");
        } else {
            pacientes.modificarPersona(comboCampo_odontologo_identificacion, formatoCampo_odontologo_odontologoNuevo);
            seatoraPersistencia.guardarArchivo();
            mensajePantalla("modificarDatos");
        }
    }//GEN-LAST:event_botonPacientes_registrarOdontologoActionPerformed
    // Metodo que determina si el usuario ya registro el nombre del odontologo nuevo del paciente, si es asi, lo modifica y guarda el archivo - Fin
    
    // Metodo que permite que al presionar botonPacientes_retirarRegresar, este se cierre - Inicio 
    private void botonPacientes_retirarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_retirarRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonPacientes_retirarRegresarActionPerformed
    // Metodo que permite que al presionar botonPacientes_retirarRegresar, este se cierre - Fin 
    
    // Metodo que toma los valores de los JTextField y JComboBox para ser mostrados en pantalla para permitir al usuario verificar estos datos antes de retirar al paciente - Inicio
    private void botonPacientes_retirar_consultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_retirar_consultarDatosActionPerformed
        pacientes.detallesPersona(comboCampo_retirar_identificacion,
                formatoCampo_retirar_nombre,
                formatoCampo_retirar_nacimiento,
                formatoCampo_retirar_inicioTratamiento,
                formatoCampo_retirar_finalTratamiento,
                formatoCampo_retirar_tratamientoRealizado,
                formatoCampo_retirar_diagnostico,
                formatoCampo_retirar_odontologo);
    }//GEN-LAST:event_botonPacientes_retirar_consultarDatosActionPerformed
    // Metodo que toma los valores de los JTextField y JComboBox para ser mostrados en pantalla para permitir al usuario verificar estos datos antes de retirar al paciente - Fin
   
    // Metodo que retira al paciente de listaPacientes y posteriormente guarda los cambios hechos - Inicio
    private void botonPacientes_retirarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_retirarPacienteActionPerformed
        pacientes.retirarPersona(comboCampo_retirar_identificacion);
        seatoraPersistencia.guardarArchivo();
        mensajePantalla("retirarPersona");
    }//GEN-LAST:event_botonPacientes_retirarPacienteActionPerformed
    // Metodo que retira al paciente de listaPacientes y posteriormente guarda los cambios hechos - Fin
    
    // Metodo que permite que al presionar botonPacientes_ingresarRegresar, este se cierre - Inicio
    private void botonPacientes_ingresarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPacientes_ingresarRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonPacientes_ingresarRegresarActionPerformed
    // Metodo que permite que al presionar botonPacientes_ingresarRegresar, este se cierre - Fin 
    
    // Metodo Principal - Inicio
    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(Pacientes_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes_GUI().setVisible(true);
            }
        });
    }
    // Metodo Principal - Fin
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraPacientes_detalles;
    private javax.swing.JPanel barraPacientes_ingresar;
    private javax.swing.JPanel barraPacientes_lista;
    private javax.swing.JPanel barraPacientes_odontologo;
    private javax.swing.JPanel barraPacientes_retirar;
    private javax.swing.JButton botonPacientes_consultarDatos;
    private javax.swing.JButton botonPacientes_consultarOdontologo;
    private javax.swing.JButton botonPacientes_detallesRegresar;
    private javax.swing.JButton botonPacientes_ingresarRegresar;
    private javax.swing.JButton botonPacientes_listaRegresar;
    private javax.swing.JButton botonPacientes_odontologoRegresar;
    private javax.swing.JButton botonPacientes_registrarDatos;
    private javax.swing.JButton botonPacientes_registrarOdontologo;
    private javax.swing.JButton botonPacientes_retirarPaciente;
    private javax.swing.JButton botonPacientes_retirarRegresar;
    private javax.swing.JButton botonPacientes_retirar_consultarDatos;
    private javax.swing.JComboBox<String> comboCampo_detalles_identificacion;
    private javax.swing.JComboBox<String> comboCampo_odontologo_identificacion;
    private javax.swing.JComboBox<String> comboCampo_retirar_identificacion;
    private javax.swing.JTextField formatoCampo_detalles_diagnostico;
    private javax.swing.JTextField formatoCampo_detalles_finalTratamiento;
    private javax.swing.JTextField formatoCampo_detalles_inicioTratamiento;
    private javax.swing.JTextField formatoCampo_detalles_nacimiento;
    private javax.swing.JTextField formatoCampo_detalles_nombre;
    private javax.swing.JTextField formatoCampo_detalles_odontologo;
    private javax.swing.JTextField formatoCampo_detalles_tratamientoRealizado;
    private javax.swing.JTextField formatoCampo_ingresar_diagnostico;
    private javax.swing.JTextField formatoCampo_ingresar_finalTratamiento;
    private javax.swing.JTextField formatoCampo_ingresar_identificacion;
    private javax.swing.JTextField formatoCampo_ingresar_inicioTratamiento;
    private javax.swing.JTextField formatoCampo_ingresar_nacimiento;
    private javax.swing.JTextField formatoCampo_ingresar_nombre;
    private javax.swing.JTextField formatoCampo_ingresar_odontologo;
    private javax.swing.JTextField formatoCampo_ingresar_tratamientoRealizado;
    private javax.swing.JList<String> formatoCampo_lista;
    private javax.swing.JScrollPane formatoCampo_lista_scroll;
    private javax.swing.JTextField formatoCampo_odontologo_nombre;
    private javax.swing.JTextField formatoCampo_odontologo_odontologoActual;
    private javax.swing.JTextField formatoCampo_odontologo_odontologoNuevo;
    private javax.swing.JTextField formatoCampo_retirar_diagnostico;
    private javax.swing.JTextField formatoCampo_retirar_finalTratamiento;
    private javax.swing.JTextField formatoCampo_retirar_inicioTratamiento;
    private javax.swing.JTextField formatoCampo_retirar_nacimiento;
    private javax.swing.JTextField formatoCampo_retirar_nombre;
    private javax.swing.JTextField formatoCampo_retirar_odontologo;
    private javax.swing.JTextField formatoCampo_retirar_tratamientoRealizado;
    private javax.swing.JLabel textoCampo_detalles_diagnostico;
    private javax.swing.JLabel textoCampo_detalles_finalTratamiento;
    private javax.swing.JLabel textoCampo_detalles_identificacion;
    private javax.swing.JLabel textoCampo_detalles_inicioTratamiento;
    private javax.swing.JLabel textoCampo_detalles_nacimiento;
    private javax.swing.JLabel textoCampo_detalles_nombre;
    private javax.swing.JLabel textoCampo_detalles_odontologo;
    private javax.swing.JLabel textoCampo_detalles_tratamientoRealizado;
    private javax.swing.JLabel textoCampo_ingresar_diagnostico;
    private javax.swing.JLabel textoCampo_ingresar_finalTratamiento;
    private javax.swing.JLabel textoCampo_ingresar_identificacion;
    private javax.swing.JLabel textoCampo_ingresar_inicioTratamiento;
    private javax.swing.JLabel textoCampo_ingresar_nacimiento;
    private javax.swing.JLabel textoCampo_ingresar_nombre;
    private javax.swing.JLabel textoCampo_ingresar_odontologo;
    private javax.swing.JLabel textoCampo_ingresar_tratamientoRealizado;
    private javax.swing.JLabel textoCampo_odontologo_identificacion;
    private javax.swing.JLabel textoCampo_odontologo_nombre;
    private javax.swing.JLabel textoCampo_odontologo_odontologoActual;
    private javax.swing.JLabel textoCampo_odontologo_odontologoNuevo;
    private javax.swing.JLabel textoCampo_retirar_diagnostico;
    private javax.swing.JLabel textoCampo_retirar_finalTratamiento;
    private javax.swing.JLabel textoCampo_retirar_identificacion;
    private javax.swing.JLabel textoCampo_retirar_inicioTratamiento;
    private javax.swing.JLabel textoCampo_retirar_nacimiento;
    private javax.swing.JLabel textoCampo_retirar_nombre;
    private javax.swing.JLabel textoCampo_retirar_odontologo;
    private javax.swing.JLabel textoCampo_retirar_tratamientoRealizado;
    // End of variables declaration//GEN-END:variables
    private Paciente pacientes = new Paciente("Paciente", "", "", "", "", "", "", "", "");
    private Archivos seatoraPersistencia = new Archivos();
    private DefaultListModel listaModelo = new DefaultListModel();
    private Mensajes_GUI interfazGrafica_mensajeAlerta = new Mensajes_GUI();
}
