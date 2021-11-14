package com.frontend;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.DefaultListModel;

public class Odontologos_GUI extends javax.swing.JFrame {

    // Metodo que inicia las caracteristicas de la interfaz grafica - Inicio
    public Odontologos_GUI() {
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
        }
    }
    // Metodo que determina que mensaje mostrar en la pantalla - Fin
    
    // Metodo que carga los valores que tendra la JComboBox - Inicio
    private void cargarCombo() {
        comboCampo_detalles_identificacion.removeAllItems();
        comboCampo_retirar_identificacion.removeAllItems();

        for (int n = 0; n < Odontologo.listaOdontologos.size(); n++) {
            comboCampo_detalles_identificacion.addItem(Odontologo.listaOdontologos.get(n).get_identificacion());
            comboCampo_retirar_identificacion.addItem(Odontologo.listaOdontologos.get(n).get_identificacion());
        }
    }
    // Metodo que carga los valores que tendra la JComboBox - Fin

    // Metodo que determina que valores y opciones deben mostrarse en la pantalla - Inicio
    public void interfazRequerida(String barraRequerida) {
        barraOdontologos_ingresar.setVisible(false);
        barraOdontologos_detalles.setVisible(false);
        barraOdontologos_retirar.setVisible(false);
        barraOdontologos_lista.setVisible(false);

        switch (barraRequerida) {
            case "ingresar": // Registrar odontologo
                formatoCampo_ingresar_nombre.setText(null);
                formatoCampo_ingresar_identificacion.setText(null);
                formatoCampo_ingresar_nacimiento.setText(null);
                formatoCampo_ingresar_salario.setText(null);
                formatoCampo_ingresar_numeroTarjeta.setText(null);
                comboCampo_ingresar_especialidad.setSelectedItem("Seleccione una opcion");
                checkCampo_ingresar_planta.setSelected(false);

                barraOdontologos_ingresar.setVisible(true);
                break;

            case "detalles": // Detalles del odontologo
                formatoCampo_detalles_nombre.setText(null);
                formatoCampo_detalles_nacimiento.setText(null);
                formatoCampo_detalles_salario.setText(null);
                formatoCampo_detalles_numeroTarjeta.setText(null);
                formatoCampo_detalles_especialidad.setText(null);
                formatoCampo_detalles_planta.setText(null);
                formatoCampo_detalles_pacientesActuales.setText(null);
                cargarCombo();
                
                formatoCampo_detalles_nombre.setEditable(false);
                formatoCampo_detalles_nacimiento.setEditable(false);
                formatoCampo_detalles_salario.setEditable(false);
                formatoCampo_detalles_numeroTarjeta.setEditable(false);
                formatoCampo_detalles_especialidad.setEditable(false);
                formatoCampo_detalles_planta.setEditable(false);
                formatoCampo_detalles_pacientesActuales.setEditable(false);
                
                barraOdontologos_detalles.setVisible(true);
                break;

            case "retirar": // Retirar odontologo
                formatoCampo_retirar_nombre.setText(null);
                formatoCampo_retirar_nacimiento.setText(null);
                formatoCampo_retirar_salario.setText(null);
                formatoCampo_retirar_numeroTarjeta.setText(null);
                formatoCampo_retirar_especialidad.setText(null);
                formatoCampo_retirar_planta.setText(null);
                formatoCampo_retirar_pacientesActuales.setText(null);
                cargarCombo();
                
                formatoCampo_retirar_nombre.setEditable(false);
                formatoCampo_retirar_nacimiento.setEditable(false);
                formatoCampo_retirar_salario.setEditable(false);
                formatoCampo_retirar_numeroTarjeta.setEditable(false);
                formatoCampo_retirar_especialidad.setEditable(false);
                formatoCampo_retirar_planta.setEditable(false);
                formatoCampo_retirar_pacientesActuales.setEditable(false);

                barraOdontologos_retirar.setVisible(true);
                break;

            case "lista": // Lista de odontologos
                odontologos.listaPersona(listaModelo, formatoCampo_lista);
                barraOdontologos_lista.setVisible(true);
                break;
        }
    }
    // Metodo que determina que valores y opciones deben mostrarse en la pantalla - Fin

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraOdontologos_ingresar = new javax.swing.JPanel();
        textoCampo_ingresar_nombre = new javax.swing.JLabel();
        textoCampo_ingresar_identificacion = new javax.swing.JLabel();
        textoCampo_ingresar_nacimiento = new javax.swing.JLabel();
        textoCampo_ingresar_salario = new javax.swing.JLabel();
        textoCampo_ingresar_numeroTarjeta = new javax.swing.JLabel();
        textoCampo_ingresar_especialidad = new javax.swing.JLabel();
        formatoCampo_ingresar_nombre = new javax.swing.JTextField();
        formatoCampo_ingresar_identificacion = new javax.swing.JTextField();
        formatoCampo_ingresar_nacimiento = new javax.swing.JTextField();
        formatoCampo_ingresar_salario = new javax.swing.JTextField();
        formatoCampo_ingresar_numeroTarjeta = new javax.swing.JTextField();
        checkCampo_ingresar_planta = new javax.swing.JCheckBox();
        botonOdontologos_registrarDatos = new javax.swing.JButton();
        comboCampo_ingresar_especialidad = new javax.swing.JComboBox<>();
        botonOdontologos_ingresarRegresar = new javax.swing.JButton();
        barraOdontologos_detalles = new javax.swing.JPanel();
        textoCampo_detalles_identificacion = new javax.swing.JLabel();
        textoCampo_detalles_nombre = new javax.swing.JLabel();
        textoCampo_detalles_nacimiento = new javax.swing.JLabel();
        textoCampo_detalles_salario = new javax.swing.JLabel();
        textoCampo_detalles_numeroTarjeta = new javax.swing.JLabel();
        textoCampo_detalles_especialidad = new javax.swing.JLabel();
        textoCampo_detalles_planta = new javax.swing.JLabel();
        textoCampo_detalles_pacientesActuales = new javax.swing.JLabel();
        formatoCampo_detalles_nombre = new javax.swing.JTextField();
        formatoCampo_detalles_nacimiento = new javax.swing.JTextField();
        formatoCampo_detalles_salario = new javax.swing.JTextField();
        formatoCampo_detalles_numeroTarjeta = new javax.swing.JTextField();
        formatoCampo_detalles_especialidad = new javax.swing.JTextField();
        formatoCampo_detalles_planta = new javax.swing.JTextField();
        formatoCampo_detalles_pacientesActuales = new javax.swing.JTextField();
        botonOdontologos_detallesRegresar = new javax.swing.JButton();
        comboCampo_detalles_identificacion = new javax.swing.JComboBox<>();
        botonOdontologos_detalles_consultarDatos = new javax.swing.JButton();
        barraOdontologos_retirar = new javax.swing.JPanel();
        textoCampo_retirar_identificacion = new javax.swing.JLabel();
        textoCampo_retirar_nombre = new javax.swing.JLabel();
        textoCampo_retirar_nacimiento = new javax.swing.JLabel();
        textoCampo_retirar_salario = new javax.swing.JLabel();
        textoCampo_retirar_numeroTarjeta = new javax.swing.JLabel();
        textoCampo_retirar_especialidad = new javax.swing.JLabel();
        textoCampo_retirar_planta = new javax.swing.JLabel();
        textoCampo_retirar_pacientesActuales = new javax.swing.JLabel();
        formatoCampo_retirar_nombre = new javax.swing.JTextField();
        formatoCampo_retirar_nacimiento = new javax.swing.JTextField();
        formatoCampo_retirar_salario = new javax.swing.JTextField();
        formatoCampo_retirar_numeroTarjeta = new javax.swing.JTextField();
        formatoCampo_retirar_especialidad = new javax.swing.JTextField();
        formatoCampo_retirar_planta = new javax.swing.JTextField();
        formatoCampo_retirar_pacientesActuales = new javax.swing.JTextField();
        botonOdontologos_retirarRegresar = new javax.swing.JButton();
        comboCampo_retirar_identificacion = new javax.swing.JComboBox<>();
        botonOdontologos_retirar_consultarDatos = new javax.swing.JButton();
        botonOdontologos_retirarOdontologo = new javax.swing.JButton();
        barraOdontologos_lista = new javax.swing.JPanel();
        formatoCampo_lista_scroll = new javax.swing.JScrollPane();
        formatoCampo_lista = new javax.swing.JList<>();
        botonOdontologos_listaRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seatora - Sistema Especializado de Atención Oral");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        barraOdontologos_ingresar.setMaximumSize(new java.awt.Dimension(300, 300));
        barraOdontologos_ingresar.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_ingresar_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_nombre.setText("Nombre del odontologo");

        textoCampo_ingresar_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_identificacion.setText("Documento de identidad");

        textoCampo_ingresar_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_nacimiento.setText("Fecha de nacimiento (dd/MM/yy)");

        textoCampo_ingresar_salario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_salario.setText("Salario mensual actual");

        textoCampo_ingresar_numeroTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_numeroTarjeta.setText("Numero de tarjeta profesional");

        textoCampo_ingresar_especialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_especialidad.setText("Especialidad");

        checkCampo_ingresar_planta.setText("El odontologo pertenece a la planta");

        botonOdontologos_registrarDatos.setText("Registrar datos del odontologo");
        botonOdontologos_registrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_registrarDatosActionPerformed(evt);
            }
        });

        comboCampo_ingresar_especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Prostodoncia", "Ortodoncia", "Endodoncia", "Patologías bucales y maxilofaciales", "Cirugía bucal y maxilofacial", "Radiología bucal y Maxilofacial", "Odontología de Salud Pública", "Odontología Pediátrica" }));

        botonOdontologos_ingresarRegresar.setText("Regresar");
        botonOdontologos_ingresarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_ingresarRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraOdontologos_ingresarLayout = new javax.swing.GroupLayout(barraOdontologos_ingresar);
        barraOdontologos_ingresar.setLayout(barraOdontologos_ingresarLayout);
        barraOdontologos_ingresarLayout.setHorizontalGroup(
            barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraOdontologos_ingresarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkCampo_ingresar_planta)
                    .addGroup(barraOdontologos_ingresarLayout.createSequentialGroup()
                        .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_ingresar_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCampo_ingresar_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_salario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_numeroTarjeta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_especialidad, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_ingresar_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(formatoCampo_ingresar_nombre)
                            .addComponent(formatoCampo_ingresar_identificacion)
                            .addComponent(formatoCampo_ingresar_nacimiento)
                            .addComponent(formatoCampo_ingresar_numeroTarjeta)
                            .addComponent(comboCampo_ingresar_especialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
            .addGroup(barraOdontologos_ingresarLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(botonOdontologos_registrarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonOdontologos_ingresarRegresar)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        barraOdontologos_ingresarLayout.setVerticalGroup(
            barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraOdontologos_ingresarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_identificacion))
                .addGap(12, 12, 12)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_numeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_numeroTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCampo_ingresar_especialidad)
                    .addComponent(comboCampo_ingresar_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(checkCampo_ingresar_planta)
                .addGap(48, 48, 48)
                .addGroup(barraOdontologos_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOdontologos_registrarDatos)
                    .addComponent(botonOdontologos_ingresarRegresar))
                .addGap(12, 12, 12))
        );

        getContentPane().add(barraOdontologos_ingresar, "card4");

        barraOdontologos_detalles.setMaximumSize(new java.awt.Dimension(300, 300));
        barraOdontologos_detalles.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_detalles_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_identificacion.setText("Documento de identidad");

        textoCampo_detalles_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_nombre.setText("Nombre del odontologo");

        textoCampo_detalles_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_nacimiento.setText("Fecha de nacimiento");

        textoCampo_detalles_salario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_salario.setText("Salario mensual actual");

        textoCampo_detalles_numeroTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_numeroTarjeta.setText("Numero de tarjeta profesional");

        textoCampo_detalles_especialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_especialidad.setText("Especialidad");

        textoCampo_detalles_planta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_planta.setText("¿Pertenece a la planta?");

        textoCampo_detalles_pacientesActuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_pacientesActuales.setText("Pacientes a los que trata");

        botonOdontologos_detallesRegresar.setText("Regresar");
        botonOdontologos_detallesRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_detallesRegresarActionPerformed(evt);
            }
        });

        botonOdontologos_detalles_consultarDatos.setText("Consultar datos");
        botonOdontologos_detalles_consultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_detalles_consultarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraOdontologos_detallesLayout = new javax.swing.GroupLayout(barraOdontologos_detalles);
        barraOdontologos_detalles.setLayout(barraOdontologos_detallesLayout);
        barraOdontologos_detallesLayout.setHorizontalGroup(
            barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraOdontologos_detallesLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraOdontologos_detallesLayout.createSequentialGroup()
                        .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_detalles_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_salario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_numeroTarjeta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_especialidad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_planta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_pacientesActuales, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_detalles_salario)
                            .addComponent(formatoCampo_detalles_nombre)
                            .addComponent(formatoCampo_detalles_nacimiento)
                            .addComponent(formatoCampo_detalles_numeroTarjeta)
                            .addComponent(formatoCampo_detalles_especialidad)
                            .addComponent(formatoCampo_detalles_pacientesActuales)
                            .addComponent(formatoCampo_detalles_planta)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraOdontologos_detallesLayout.createSequentialGroup()
                                .addComponent(comboCampo_detalles_identificacion, 0, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonOdontologos_detalles_consultarDatos))))
                    .addComponent(botonOdontologos_detallesRegresar))
                .addGap(32, 32, 32))
        );
        barraOdontologos_detallesLayout.setVerticalGroup(
            barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraOdontologos_detallesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_detalles_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_identificacion)
                    .addComponent(botonOdontologos_detalles_consultarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_nombre))
                .addGap(12, 12, 12)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_numeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_numeroTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_especialidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_planta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_planta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_pacientesActuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_pacientesActuales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonOdontologos_detallesRegresar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraOdontologos_detalles, "card4");

        barraOdontologos_retirar.setMaximumSize(new java.awt.Dimension(300, 300));
        barraOdontologos_retirar.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_retirar_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_identificacion.setText("Documento de identidad");

        textoCampo_retirar_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_nombre.setText("Nombre del odontologo");

        textoCampo_retirar_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_nacimiento.setText("Fecha de nacimiento");

        textoCampo_retirar_salario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_salario.setText("Salario mensual actual");

        textoCampo_retirar_numeroTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_numeroTarjeta.setText("Numero de tarjeta profesional");

        textoCampo_retirar_especialidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_especialidad.setText("Especialidad");

        textoCampo_retirar_planta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_planta.setText("¿Pertenece a la planta?");

        textoCampo_retirar_pacientesActuales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_pacientesActuales.setText("Pacientes a los que trata");

        botonOdontologos_retirarRegresar.setText("Regresar");
        botonOdontologos_retirarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_retirarRegresarActionPerformed(evt);
            }
        });

        botonOdontologos_retirar_consultarDatos.setText("Consultar datos");
        botonOdontologos_retirar_consultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_retirar_consultarDatosActionPerformed(evt);
            }
        });

        botonOdontologos_retirarOdontologo.setText("Retirar odontologo");
        botonOdontologos_retirarOdontologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_retirarOdontologoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraOdontologos_retirarLayout = new javax.swing.GroupLayout(barraOdontologos_retirar);
        barraOdontologos_retirar.setLayout(barraOdontologos_retirarLayout);
        barraOdontologos_retirarLayout.setHorizontalGroup(
            barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraOdontologos_retirarLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraOdontologos_retirarLayout.createSequentialGroup()
                        .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_retirar_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_salario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_numeroTarjeta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_especialidad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_planta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_pacientesActuales, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_retirar_salario)
                            .addComponent(formatoCampo_retirar_nombre)
                            .addComponent(formatoCampo_retirar_nacimiento)
                            .addComponent(formatoCampo_retirar_numeroTarjeta)
                            .addComponent(formatoCampo_retirar_especialidad)
                            .addComponent(formatoCampo_retirar_pacientesActuales)
                            .addComponent(formatoCampo_retirar_planta)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraOdontologos_retirarLayout.createSequentialGroup()
                                .addComponent(comboCampo_retirar_identificacion, 0, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonOdontologos_retirar_consultarDatos))))
                    .addGroup(barraOdontologos_retirarLayout.createSequentialGroup()
                        .addComponent(botonOdontologos_retirarOdontologo)
                        .addGap(6, 6, 6)
                        .addComponent(botonOdontologos_retirarRegresar)))
                .addGap(32, 32, 32))
        );
        barraOdontologos_retirarLayout.setVerticalGroup(
            barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraOdontologos_retirarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_retirar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_identificacion)
                    .addComponent(botonOdontologos_retirar_consultarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_nombre))
                .addGap(12, 12, 12)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_numeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_numeroTarjeta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_especialidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_planta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_planta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_pacientesActuales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_pacientesActuales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraOdontologos_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOdontologos_retirarRegresar)
                    .addComponent(botonOdontologos_retirarOdontologo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(barraOdontologos_retirar, "card4");

        barraOdontologos_lista.setMaximumSize(new java.awt.Dimension(300, 300));
        barraOdontologos_lista.setMinimumSize(new java.awt.Dimension(300, 300));

        formatoCampo_lista_scroll.setViewportView(formatoCampo_lista);

        botonOdontologos_listaRegresar.setText("Regresar");
        botonOdontologos_listaRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOdontologos_listaRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraOdontologos_listaLayout = new javax.swing.GroupLayout(barraOdontologos_lista);
        barraOdontologos_lista.setLayout(barraOdontologos_listaLayout);
        barraOdontologos_listaLayout.setHorizontalGroup(
            barraOdontologos_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraOdontologos_listaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraOdontologos_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonOdontologos_listaRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formatoCampo_lista_scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        barraOdontologos_listaLayout.setVerticalGroup(
            barraOdontologos_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraOdontologos_listaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(formatoCampo_lista_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonOdontologos_listaRegresar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(barraOdontologos_lista, "card4");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Metodo que permite que al presionar botonOdontologos_listaRegresar, este se cierre - Inicio
    private void botonOdontologos_listaRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_listaRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonOdontologos_listaRegresarActionPerformed
    // Metodo que permite que al presionar botonOdontologos_listaRegresar, este se cierre - Fin
    
    // Metodo que toma los valores del formulario para registrar un odontologo y los carga en listaOdontologos - Inicio
    private void botonOdontologos_registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_registrarDatosActionPerformed
        String valorCombo = String.valueOf(comboCampo_ingresar_especialidad.getSelectedItem());
        
        if ((formatoCampo_ingresar_nombre.getText().equals("") == true)
                || (formatoCampo_ingresar_identificacion.getText().equals("") == true)
                || (formatoCampo_ingresar_nacimiento.getText().equals("") == true)
                || (formatoCampo_ingresar_salario.getText().equals("") == true)
                || (formatoCampo_ingresar_numeroTarjeta.getText().equals("") == true)
                || (valorCombo.equals("Seleccione una opcion") == true)) {

            mensajePantalla("vacio");
        } else {
            odontologos.registrarPersona("Odontologo",
                    formatoCampo_ingresar_nombre.getText(),
                    formatoCampo_ingresar_identificacion.getText(),
                    formatoCampo_ingresar_nacimiento.getText(),
                    formatoCampo_ingresar_salario.getText(),
                    formatoCampo_ingresar_numeroTarjeta.getText(),
                    valorCombo,
                    checkCampo_ingresar_planta.isSelected()
            );
            seatoraPersistencia.guardarArchivo();
            this.dispose();
        }
    }//GEN-LAST:event_botonOdontologos_registrarDatosActionPerformed
    // Metodo que toma los valores del formulario para registrar un odontologo y los carga en listaOdontologos - Fin
    
    // Metodo que permite que al presionar botonOdontologos_detallesRegresar, este se cierre - Inicio
    private void botonOdontologos_detallesRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_detallesRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonOdontologos_detallesRegresarActionPerformed
    // Metodo que permite que al presionar botonOdontologos_detallesRegresar, este se cierre - Fin
    
    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del odontologo requerido - Inicio
    private void botonOdontologos_detalles_consultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_detalles_consultarDatosActionPerformed
        odontologos.detallesPersona(comboCampo_detalles_identificacion,
                formatoCampo_detalles_nombre,
                formatoCampo_detalles_nacimiento,
                formatoCampo_detalles_salario,
                formatoCampo_detalles_numeroTarjeta,
                formatoCampo_detalles_especialidad,
                formatoCampo_detalles_planta,
                formatoCampo_detalles_pacientesActuales);
    }//GEN-LAST:event_botonOdontologos_detalles_consultarDatosActionPerformed
    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del odontologo requerido - Fin
    
    // Metodo que permite que al presionar botonOdontologos_retirarRegresar, este se cierre - Inicio
    private void botonOdontologos_retirarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_retirarRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonOdontologos_retirarRegresarActionPerformed
    // Metodo que permite que al presionar botonOdontologos_retirarRegresar, este se cierre - Fin
    
    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del odontologo requerido como prevencion antes de ser retirado de la lista - Inicio
    private void botonOdontologos_retirar_consultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_retirar_consultarDatosActionPerformed
        odontologos.detallesPersona(comboCampo_retirar_identificacion,
                formatoCampo_retirar_nombre,
                formatoCampo_retirar_nacimiento,
                formatoCampo_retirar_salario,
                formatoCampo_retirar_numeroTarjeta,
                formatoCampo_retirar_especialidad,
                formatoCampo_retirar_planta,
                formatoCampo_retirar_pacientesActuales);
    }//GEN-LAST:event_botonOdontologos_retirar_consultarDatosActionPerformed
    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del odontologo requerido como prevencion antes de ser retirado de la lista - Fin
    
    // Metodo que retira al odontologo de listaOdontologos, si y solo si no tiene pacientes activos, y posteriormente guarda los cambios hechos - Inicio
    private void botonOdontologos_retirarOdontologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_retirarOdontologoActionPerformed
        odontologos.retirarPersona(comboCampo_retirar_identificacion);
    }//GEN-LAST:event_botonOdontologos_retirarOdontologoActionPerformed
    // Metodo que retira al odontologo de listaOdontologos, si y solo si no tiene pacientes activos, y posteriormente guarda los cambios hechos - Fin
    
    // Metodo que permite que al presionar botonOdontologos_ingresarRegresar, este se cierre - Inicio
    private void botonOdontologos_ingresarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOdontologos_ingresarRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonOdontologos_ingresarRegresarActionPerformed
    // Metodo que permite que al presionar botonOdontologos_ingresarRegresar, este se cierre - Inicio
    
    // Metodo Principal - Inicio
    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(Odontologos_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Odontologos_GUI().setVisible(true);
            }
        });
    }
    // Metodo Principal - Fin
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraOdontologos_detalles;
    private javax.swing.JPanel barraOdontologos_ingresar;
    private javax.swing.JPanel barraOdontologos_lista;
    private javax.swing.JPanel barraOdontologos_retirar;
    private javax.swing.JButton botonOdontologos_detallesRegresar;
    private javax.swing.JButton botonOdontologos_detalles_consultarDatos;
    private javax.swing.JButton botonOdontologos_ingresarRegresar;
    private javax.swing.JButton botonOdontologos_listaRegresar;
    private javax.swing.JButton botonOdontologos_registrarDatos;
    private javax.swing.JButton botonOdontologos_retirarOdontologo;
    private javax.swing.JButton botonOdontologos_retirarRegresar;
    private javax.swing.JButton botonOdontologos_retirar_consultarDatos;
    private javax.swing.JCheckBox checkCampo_ingresar_planta;
    private javax.swing.JComboBox<String> comboCampo_detalles_identificacion;
    private javax.swing.JComboBox<String> comboCampo_ingresar_especialidad;
    private javax.swing.JComboBox<String> comboCampo_retirar_identificacion;
    private javax.swing.JTextField formatoCampo_detalles_especialidad;
    private javax.swing.JTextField formatoCampo_detalles_nacimiento;
    private javax.swing.JTextField formatoCampo_detalles_nombre;
    private javax.swing.JTextField formatoCampo_detalles_numeroTarjeta;
    private javax.swing.JTextField formatoCampo_detalles_pacientesActuales;
    private javax.swing.JTextField formatoCampo_detalles_planta;
    private javax.swing.JTextField formatoCampo_detalles_salario;
    private javax.swing.JTextField formatoCampo_ingresar_identificacion;
    private javax.swing.JTextField formatoCampo_ingresar_nacimiento;
    private javax.swing.JTextField formatoCampo_ingresar_nombre;
    private javax.swing.JTextField formatoCampo_ingresar_numeroTarjeta;
    private javax.swing.JTextField formatoCampo_ingresar_salario;
    private javax.swing.JList<String> formatoCampo_lista;
    private javax.swing.JScrollPane formatoCampo_lista_scroll;
    private javax.swing.JTextField formatoCampo_retirar_especialidad;
    private javax.swing.JTextField formatoCampo_retirar_nacimiento;
    private javax.swing.JTextField formatoCampo_retirar_nombre;
    private javax.swing.JTextField formatoCampo_retirar_numeroTarjeta;
    private javax.swing.JTextField formatoCampo_retirar_pacientesActuales;
    private javax.swing.JTextField formatoCampo_retirar_planta;
    private javax.swing.JTextField formatoCampo_retirar_salario;
    private javax.swing.JLabel textoCampo_detalles_especialidad;
    private javax.swing.JLabel textoCampo_detalles_identificacion;
    private javax.swing.JLabel textoCampo_detalles_nacimiento;
    private javax.swing.JLabel textoCampo_detalles_nombre;
    private javax.swing.JLabel textoCampo_detalles_numeroTarjeta;
    private javax.swing.JLabel textoCampo_detalles_pacientesActuales;
    private javax.swing.JLabel textoCampo_detalles_planta;
    private javax.swing.JLabel textoCampo_detalles_salario;
    private javax.swing.JLabel textoCampo_ingresar_especialidad;
    private javax.swing.JLabel textoCampo_ingresar_identificacion;
    private javax.swing.JLabel textoCampo_ingresar_nacimiento;
    private javax.swing.JLabel textoCampo_ingresar_nombre;
    private javax.swing.JLabel textoCampo_ingresar_numeroTarjeta;
    private javax.swing.JLabel textoCampo_ingresar_salario;
    private javax.swing.JLabel textoCampo_retirar_especialidad;
    private javax.swing.JLabel textoCampo_retirar_identificacion;
    private javax.swing.JLabel textoCampo_retirar_nacimiento;
    private javax.swing.JLabel textoCampo_retirar_nombre;
    private javax.swing.JLabel textoCampo_retirar_numeroTarjeta;
    private javax.swing.JLabel textoCampo_retirar_pacientesActuales;
    private javax.swing.JLabel textoCampo_retirar_planta;
    private javax.swing.JLabel textoCampo_retirar_salario;
    // End of variables declaration//GEN-END:variables
    private Odontologo odontologos = new Odontologo("", "", "", "", "", "", "", "", "", "", false);
    private Archivos seatoraPersistencia = new Archivos();
    private DefaultListModel listaModelo = new DefaultListModel();
    private Mensajes_GUI interfazGrafica_mensajeAlerta = new Mensajes_GUI();
}
