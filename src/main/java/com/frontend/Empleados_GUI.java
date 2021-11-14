package com.frontend;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

public class Empleados_GUI extends javax.swing.JFrame {

    // Metodo que inicia las caracteristicas de la interfaz grafica - Inicio
    public Empleados_GUI() {
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
        comboCampo_modificar_identificacion.removeAllItems();
        comboCampo_retirar_identificacion.removeAllItems();

        for (int n = 0; n < Empleado.listaEmpleados.size(); n++) {
            comboCampo_detalles_identificacion.addItem(Empleado.listaEmpleados.get(n).get_identificacion());
            comboCampo_modificar_identificacion.addItem(Empleado.listaEmpleados.get(n).get_identificacion());
            comboCampo_retirar_identificacion.addItem(Empleado.listaEmpleados.get(n).get_identificacion());
        }
    }
    // Metodo que carga los valores que tendra la JComboBox - Fin

    // Metodo que determina que valores y opciones deben mostrarse en la pantalla - Inicio
    public void interfazRequerida(String barraRequerida) {
        barraEmpleados_ingresar.setVisible(false);
        barraEmpleados_detalles.setVisible(false);
        barraEmpleados_modificar.setVisible(false);
        barraEmpleados_retirar.setVisible(false);
        barraEmpleados_lista.setVisible(false);

        barraEmpleados_modificar_cargoEmpleado.setVisible(false);
        barraEmpleados_modificar_tipoEmpleado.setVisible(false);
        barraEmpleados_modificar_salarioMensual.setVisible(false);

        switch (barraRequerida) {
            case "ingresar": // Registrar empleado
                formatoCampo_ingresar_nombre.setText(null);
                formatoCampo_ingresar_identificacion.setText(null);
                formatoCampo_ingresar_nacimiento.setText(null);
                formatoCampo_ingresar_cargoEmpleado.setText(null);
                formatoCampo_ingresar_tipoEmpleado.setText(null);
                formatoCampo_ingresar_salarioMensual.setText(null);

                barraEmpleados_ingresar.setVisible(true);
                break;

            case "modificar": // Modificar datos del cargo, tipo de empleado, o salario de un empleado
                formatoCampo_modificar_nombre.setText(null);
                formatoCampo_modificar_cargoEmpleado_actual.setText(null);
                formatoCampo_modificar_cargoEmpleado_nuevo.setText(null);
                formatoCampo_modificar_tipoEmpleado_actual.setText(null);
                formatoCampo_modificar_tipoEmpleado_nuevo.setText(null);
                formatoCampo_modificar_salarioMensual_actual.setText(null);
                formatoCampo_modificar_salarioMensual_nuevo.setText(null);
                cargarCombo();

                formatoCampo_modificar_nombre.setEditable(false);
                formatoCampo_modificar_cargoEmpleado_actual.setEditable(false);
                formatoCampo_modificar_tipoEmpleado_actual.setEditable(false);
                formatoCampo_modificar_salarioMensual_actual.setEditable(false);

                barraEmpleados_modificar.setVisible(true);
                break;

            case "detalles": // Detalles de un empleado
                formatoCampo_detalles_nombre.setText(null);
                formatoCampo_detalles_nacimiento.setText(null);
                formatoCampo_detalles_cargoEmpleado.setText(null);
                formatoCampo_detalles_tipoEmpleado.setText(null);
                formatoCampo_detalles_salario.setText(null);
                cargarCombo();

                formatoCampo_detalles_nombre.setEditable(false);
                formatoCampo_detalles_nacimiento.setEditable(false);
                formatoCampo_detalles_cargoEmpleado.setEditable(false);
                formatoCampo_detalles_tipoEmpleado.setEditable(false);
                formatoCampo_detalles_salario.setEditable(false);

                barraEmpleados_detalles.setVisible(true);
                break;

            case "lista": // Lista de empleados
                empleados.listaPersona(listaModelo, formatoCampo_lista);

                barraEmpleados_lista.setVisible(true);
                break;

            case "retirar": // Retirar paciente
                formatoCampo_retirar_nombre.setText(null);
                formatoCampo_retirar_nacimiento.setText(null);
                formatoCampo_retirar_cargoEmpleado.setText(null);
                formatoCampo_retirar_tipoEmpleado.setText(null);
                formatoCampo_retirar_salario.setText(null);
                cargarCombo();

                formatoCampo_retirar_nombre.setEditable(false);
                formatoCampo_retirar_nacimiento.setEditable(false);
                formatoCampo_retirar_cargoEmpleado.setEditable(false);
                formatoCampo_retirar_tipoEmpleado.setEditable(false);
                formatoCampo_retirar_salario.setEditable(false);

                barraEmpleados_retirar.setVisible(true);
                break;
        }
    }
    // Metodo que determina que valores y opciones deben mostrarse en la pantalla - Fin

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraEmpleados_modificar_grupoBotones = new javax.swing.ButtonGroup();
        barraEmpleados_ingresar = new javax.swing.JPanel();
        textoCampo_ingresar_nombre = new javax.swing.JLabel();
        textoCampo_ingresar_identificacion = new javax.swing.JLabel();
        textoCampo_ingresar_nacimiento = new javax.swing.JLabel();
        textoCampo_ingresar_cargoEmpleado = new javax.swing.JLabel();
        textoCampo_ingresar_tipoEmpleado = new javax.swing.JLabel();
        textoCampo_ingresar_salarioMensual = new javax.swing.JLabel();
        formatoCampo_ingresar_nombre = new javax.swing.JTextField();
        formatoCampo_ingresar_identificacion = new javax.swing.JTextField();
        formatoCampo_ingresar_nacimiento = new javax.swing.JTextField();
        formatoCampo_ingresar_cargoEmpleado = new javax.swing.JTextField();
        formatoCampo_ingresar_tipoEmpleado = new javax.swing.JTextField();
        formatoCampo_ingresar_salarioMensual = new javax.swing.JTextField();
        botonEmpleados_registrarDatos = new javax.swing.JButton();
        botonEmpleados_ingresarRegresar = new javax.swing.JButton();
        barraEmpleados_modificar = new javax.swing.JPanel();
        textoCampo_modificar_identificacion = new javax.swing.JLabel();
        textoCampo_modificar_nombre = new javax.swing.JLabel();
        formatoCampo_modificar_nombre = new javax.swing.JTextField();
        comboCampo_modificar_identificacion = new javax.swing.JComboBox<>();
        botonEmpleados_modificar_consultarDatos = new javax.swing.JButton();
        botonEmpleados_modificarRegresar = new javax.swing.JButton();
        barraEmpleados_radioCargo = new javax.swing.JRadioButton();
        barraEmpleados_radioTipo = new javax.swing.JRadioButton();
        barraEmpleados_radioSalario = new javax.swing.JRadioButton();
        textoCampo_modificar_opcionMensaje = new javax.swing.JLabel();
        barraEmpleados_modificar_opcionUsuario = new javax.swing.JPanel();
        barraEmpleados_modificar_cargoEmpleado = new javax.swing.JPanel();
        textoCampo_modificar_cargoEmpleado_actual = new javax.swing.JLabel();
        textoCampo_modificar_cargoEmpleado_nuevo = new javax.swing.JLabel();
        formatoCampo_modificar_cargoEmpleado_actual = new javax.swing.JTextField();
        formatoCampo_modificar_cargoEmpleado_nuevo = new javax.swing.JTextField();
        botonEmpleados_registrarCargo = new javax.swing.JButton();
        barraEmpleados_modificar_tipoEmpleado = new javax.swing.JPanel();
        textoCampo_modificar_tipoEmpleado_actual = new javax.swing.JLabel();
        textoCampo_modificar_tipoEmpleado_nuevo = new javax.swing.JLabel();
        formatoCampo_modificar_tipoEmpleado_actual = new javax.swing.JTextField();
        formatoCampo_modificar_tipoEmpleado_nuevo = new javax.swing.JTextField();
        botonEmpleados_registrarTipo = new javax.swing.JButton();
        barraEmpleados_modificar_salarioMensual = new javax.swing.JPanel();
        textoCampo_modificar_salarioMensual_actual = new javax.swing.JLabel();
        textoCampo_modificar_salarioMensual_nuevo = new javax.swing.JLabel();
        formatoCampo_modificar_salarioMensual_actual = new javax.swing.JTextField();
        formatoCampo_modificar_salarioMensual_nuevo = new javax.swing.JTextField();
        botonEmpleados_registrarSalario = new javax.swing.JButton();
        barraEmpleados_detalles = new javax.swing.JPanel();
        textoCampo_detalles_identificacion = new javax.swing.JLabel();
        textoCampo_detalles_nombre = new javax.swing.JLabel();
        textoCampo_detalles_nacimiento = new javax.swing.JLabel();
        textoCampo_detalles_cargoEmpleado = new javax.swing.JLabel();
        textoCampo_detalles_tipoEmpleado = new javax.swing.JLabel();
        textoCampo_detalles_salario = new javax.swing.JLabel();
        formatoCampo_detalles_nombre = new javax.swing.JTextField();
        formatoCampo_detalles_nacimiento = new javax.swing.JTextField();
        formatoCampo_detalles_cargoEmpleado = new javax.swing.JTextField();
        formatoCampo_detalles_tipoEmpleado = new javax.swing.JTextField();
        formatoCampo_detalles_salario = new javax.swing.JTextField();
        botonEmpleados_detallesRegresar = new javax.swing.JButton();
        comboCampo_detalles_identificacion = new javax.swing.JComboBox<>();
        botonEmpleados_consultarDatos = new javax.swing.JButton();
        barraEmpleados_lista = new javax.swing.JPanel();
        formatoCampo_lista_scroll = new javax.swing.JScrollPane();
        formatoCampo_lista = new javax.swing.JList<>();
        botonEmpleados_listaRegresar = new javax.swing.JButton();
        barraEmpleados_retirar = new javax.swing.JPanel();
        textoCampo_retirar_identificacion = new javax.swing.JLabel();
        textoCampo_retirar_nombre = new javax.swing.JLabel();
        textoCampo_retirar_nacimiento = new javax.swing.JLabel();
        textoCampo_retirar_cargoEmpleado = new javax.swing.JLabel();
        textoCampo_retirar_tipoEmpleado = new javax.swing.JLabel();
        textoCampo_retirar_salario = new javax.swing.JLabel();
        formatoCampo_retirar_nombre = new javax.swing.JTextField();
        formatoCampo_retirar_nacimiento = new javax.swing.JTextField();
        formatoCampo_retirar_cargoEmpleado = new javax.swing.JTextField();
        formatoCampo_retirar_tipoEmpleado = new javax.swing.JTextField();
        formatoCampo_retirar_salario = new javax.swing.JTextField();
        botonEmpleados_retirarRegresar = new javax.swing.JButton();
        comboCampo_retirar_identificacion = new javax.swing.JComboBox<>();
        botonEmpleados_retirar_consultarDatos = new javax.swing.JButton();
        botonEmpleados_retirarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seatora - Sistema Especializado de Atención Oral");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        barraEmpleados_ingresar.setMaximumSize(new java.awt.Dimension(300, 300));
        barraEmpleados_ingresar.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_ingresar_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_nombre.setText("Nombre del empleado");

        textoCampo_ingresar_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_identificacion.setText("Documento de identidad");

        textoCampo_ingresar_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_nacimiento.setText("Fecha de nacimiento (dd/MM/yy)");

        textoCampo_ingresar_cargoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_cargoEmpleado.setText("Cargo asignado");

        textoCampo_ingresar_tipoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_tipoEmpleado.setText("Tipo de empleado");

        textoCampo_ingresar_salarioMensual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_ingresar_salarioMensual.setText("Salario mensual actual");

        botonEmpleados_registrarDatos.setText("Registrar datos del empleado");
        botonEmpleados_registrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_registrarDatosActionPerformed(evt);
            }
        });

        botonEmpleados_ingresarRegresar.setText("Regresar");
        botonEmpleados_ingresarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_ingresarRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEmpleados_ingresarLayout = new javax.swing.GroupLayout(barraEmpleados_ingresar);
        barraEmpleados_ingresar.setLayout(barraEmpleados_ingresarLayout);
        barraEmpleados_ingresarLayout.setHorizontalGroup(
            barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_ingresarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraEmpleados_ingresarLayout.createSequentialGroup()
                        .addComponent(botonEmpleados_registrarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEmpleados_ingresarRegresar))
                    .addGroup(barraEmpleados_ingresarLayout.createSequentialGroup()
                        .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_ingresar_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCampo_ingresar_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_cargoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_tipoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_ingresar_salarioMensual, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_ingresar_cargoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(formatoCampo_ingresar_nombre)
                            .addComponent(formatoCampo_ingresar_identificacion)
                            .addComponent(formatoCampo_ingresar_nacimiento)
                            .addComponent(formatoCampo_ingresar_tipoEmpleado)
                            .addComponent(formatoCampo_ingresar_salarioMensual))))
                .addGap(32, 32, 32))
        );
        barraEmpleados_ingresarLayout.setVerticalGroup(
            barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_ingresarLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_identificacion))
                .addGap(12, 12, 12)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_cargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_cargoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_tipoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_ingresar_salarioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_ingresar_salarioMensual))
                .addGap(60, 60, 60)
                .addGroup(barraEmpleados_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEmpleados_registrarDatos)
                    .addComponent(botonEmpleados_ingresarRegresar))
                .addGap(12, 12, 12))
        );

        getContentPane().add(barraEmpleados_ingresar, "card4");

        barraEmpleados_modificar.setMaximumSize(new java.awt.Dimension(460, 324));
        barraEmpleados_modificar.setMinimumSize(new java.awt.Dimension(460, 324));
        barraEmpleados_modificar.setPreferredSize(new java.awt.Dimension(460, 324));

        textoCampo_modificar_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_identificacion.setText("Documento de identidad");

        textoCampo_modificar_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_nombre.setText("Nombre del paciente");

        botonEmpleados_modificar_consultarDatos.setText("Consultar datos");
        botonEmpleados_modificar_consultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_modificar_consultarDatosActionPerformed(evt);
            }
        });

        botonEmpleados_modificarRegresar.setText("Regresar");
        botonEmpleados_modificarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_modificarRegresarActionPerformed(evt);
            }
        });

        barraEmpleados_modificar_grupoBotones.add(barraEmpleados_radioCargo);
        barraEmpleados_radioCargo.setText("Cargo");
        barraEmpleados_radioCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraEmpleados_radioCargoActionPerformed(evt);
            }
        });

        barraEmpleados_modificar_grupoBotones.add(barraEmpleados_radioTipo);
        barraEmpleados_radioTipo.setText("Tipo de empleado");
        barraEmpleados_radioTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraEmpleados_radioTipoActionPerformed(evt);
            }
        });

        barraEmpleados_modificar_grupoBotones.add(barraEmpleados_radioSalario);
        barraEmpleados_radioSalario.setText("Salario mensual");
        barraEmpleados_radioSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraEmpleados_radioSalarioActionPerformed(evt);
            }
        });

        textoCampo_modificar_opcionMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoCampo_modificar_opcionMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_opcionMensaje.setText("Seleccione que datos desea modificar:");

        textoCampo_modificar_cargoEmpleado_actual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_cargoEmpleado_actual.setText("Cargo asignado actualmente");

        textoCampo_modificar_cargoEmpleado_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_cargoEmpleado_nuevo.setText("Nuevo cargo asignado");

        botonEmpleados_registrarCargo.setText("Registrar nuevos datos del empleado");
        botonEmpleados_registrarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_registrarCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEmpleados_modificar_cargoEmpleadoLayout = new javax.swing.GroupLayout(barraEmpleados_modificar_cargoEmpleado);
        barraEmpleados_modificar_cargoEmpleado.setLayout(barraEmpleados_modificar_cargoEmpleadoLayout);
        barraEmpleados_modificar_cargoEmpleadoLayout.setHorizontalGroup(
            barraEmpleados_modificar_cargoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_modificar_cargoEmpleadoLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(barraEmpleados_modificar_cargoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEmpleados_registrarCargo)
                    .addGroup(barraEmpleados_modificar_cargoEmpleadoLayout.createSequentialGroup()
                        .addGroup(barraEmpleados_modificar_cargoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_modificar_cargoEmpleado_actual, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_modificar_cargoEmpleado_nuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(barraEmpleados_modificar_cargoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_modificar_cargoEmpleado_actual, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(formatoCampo_modificar_cargoEmpleado_nuevo))))
                .addGap(32, 32, 32))
        );
        barraEmpleados_modificar_cargoEmpleadoLayout.setVerticalGroup(
            barraEmpleados_modificar_cargoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_modificar_cargoEmpleadoLayout.createSequentialGroup()
                .addGroup(barraEmpleados_modificar_cargoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_modificar_cargoEmpleado_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_modificar_cargoEmpleado_actual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_modificar_cargoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_modificar_cargoEmpleado_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_modificar_cargoEmpleado_nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEmpleados_registrarCargo)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        textoCampo_modificar_tipoEmpleado_actual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_tipoEmpleado_actual.setText("Tipo actual de empleado");

        textoCampo_modificar_tipoEmpleado_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_tipoEmpleado_nuevo.setText("Nuevo tipo de empleado");

        botonEmpleados_registrarTipo.setText("Registrar nuevos datos del empleado");
        botonEmpleados_registrarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_registrarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEmpleados_modificar_tipoEmpleadoLayout = new javax.swing.GroupLayout(barraEmpleados_modificar_tipoEmpleado);
        barraEmpleados_modificar_tipoEmpleado.setLayout(barraEmpleados_modificar_tipoEmpleadoLayout);
        barraEmpleados_modificar_tipoEmpleadoLayout.setHorizontalGroup(
            barraEmpleados_modificar_tipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_modificar_tipoEmpleadoLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(barraEmpleados_modificar_tipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEmpleados_registrarTipo)
                    .addGroup(barraEmpleados_modificar_tipoEmpleadoLayout.createSequentialGroup()
                        .addGroup(barraEmpleados_modificar_tipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_modificar_tipoEmpleado_actual, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_modificar_tipoEmpleado_nuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(barraEmpleados_modificar_tipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_modificar_tipoEmpleado_actual, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(formatoCampo_modificar_tipoEmpleado_nuevo))))
                .addGap(32, 32, 32))
        );
        barraEmpleados_modificar_tipoEmpleadoLayout.setVerticalGroup(
            barraEmpleados_modificar_tipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_modificar_tipoEmpleadoLayout.createSequentialGroup()
                .addGroup(barraEmpleados_modificar_tipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_modificar_tipoEmpleado_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_modificar_tipoEmpleado_actual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_modificar_tipoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_modificar_tipoEmpleado_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_modificar_tipoEmpleado_nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEmpleados_registrarTipo)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        textoCampo_modificar_salarioMensual_actual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_salarioMensual_actual.setText("Salario mensual actual");

        textoCampo_modificar_salarioMensual_nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_modificar_salarioMensual_nuevo.setText("Nuevo salario mensual");

        botonEmpleados_registrarSalario.setText("Registrar nuevos datos del empleado");
        botonEmpleados_registrarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_registrarSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEmpleados_modificar_salarioMensualLayout = new javax.swing.GroupLayout(barraEmpleados_modificar_salarioMensual);
        barraEmpleados_modificar_salarioMensual.setLayout(barraEmpleados_modificar_salarioMensualLayout);
        barraEmpleados_modificar_salarioMensualLayout.setHorizontalGroup(
            barraEmpleados_modificar_salarioMensualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_modificar_salarioMensualLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(barraEmpleados_modificar_salarioMensualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEmpleados_registrarSalario)
                    .addGroup(barraEmpleados_modificar_salarioMensualLayout.createSequentialGroup()
                        .addGroup(barraEmpleados_modificar_salarioMensualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_modificar_salarioMensual_actual, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_modificar_salarioMensual_nuevo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)
                        .addGroup(barraEmpleados_modificar_salarioMensualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_modificar_salarioMensual_actual, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(formatoCampo_modificar_salarioMensual_nuevo))))
                .addGap(32, 32, 32))
        );
        barraEmpleados_modificar_salarioMensualLayout.setVerticalGroup(
            barraEmpleados_modificar_salarioMensualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_modificar_salarioMensualLayout.createSequentialGroup()
                .addGroup(barraEmpleados_modificar_salarioMensualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_modificar_salarioMensual_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_modificar_salarioMensual_actual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_modificar_salarioMensualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_modificar_salarioMensual_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_modificar_salarioMensual_nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEmpleados_registrarSalario)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraEmpleados_modificar_opcionUsuarioLayout = new javax.swing.GroupLayout(barraEmpleados_modificar_opcionUsuario);
        barraEmpleados_modificar_opcionUsuario.setLayout(barraEmpleados_modificar_opcionUsuarioLayout);
        barraEmpleados_modificar_opcionUsuarioLayout.setHorizontalGroup(
            barraEmpleados_modificar_opcionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraEmpleados_modificar_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(barraEmpleados_modificar_cargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(barraEmpleados_modificar_salarioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        barraEmpleados_modificar_opcionUsuarioLayout.setVerticalGroup(
            barraEmpleados_modificar_opcionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraEmpleados_modificar_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(barraEmpleados_modificar_cargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(barraEmpleados_modificar_salarioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout barraEmpleados_modificarLayout = new javax.swing.GroupLayout(barraEmpleados_modificar);
        barraEmpleados_modificar.setLayout(barraEmpleados_modificarLayout);
        barraEmpleados_modificarLayout.setHorizontalGroup(
            barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_modificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraEmpleados_modificarLayout.createSequentialGroup()
                        .addGroup(barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_modificar_nombre)
                            .addComponent(textoCampo_modificar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(barraEmpleados_modificarLayout.createSequentialGroup()
                                .addComponent(comboCampo_modificar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEmpleados_modificar_consultarDatos))
                            .addComponent(formatoCampo_modificar_nombre)))
                    .addComponent(botonEmpleados_modificarRegresar)
                    .addComponent(textoCampo_modificar_opcionMensaje)
                    .addGroup(barraEmpleados_modificarLayout.createSequentialGroup()
                        .addComponent(barraEmpleados_radioCargo)
                        .addGap(68, 68, 68)
                        .addComponent(barraEmpleados_radioTipo)
                        .addGap(67, 67, 67)
                        .addComponent(barraEmpleados_radioSalario)))
                .addGap(32, 32, 32))
            .addComponent(barraEmpleados_modificar_opcionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraEmpleados_modificarLayout.setVerticalGroup(
            barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_modificarLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_modificar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEmpleados_modificar_consultarDatos)
                    .addComponent(textoCampo_modificar_identificacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_modificar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_modificar_nombre))
                .addGap(20, 20, 20)
                .addComponent(textoCampo_modificar_opcionMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(barraEmpleados_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barraEmpleados_radioCargo)
                    .addComponent(barraEmpleados_radioTipo)
                    .addComponent(barraEmpleados_radioSalario))
                .addGap(12, 12, 12)
                .addComponent(barraEmpleados_modificar_opcionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEmpleados_modificarRegresar)
                .addGap(18, 18, 18))
        );

        getContentPane().add(barraEmpleados_modificar, "card4");

        barraEmpleados_detalles.setMaximumSize(new java.awt.Dimension(300, 300));
        barraEmpleados_detalles.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_detalles_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_identificacion.setText("Documento de identidad");

        textoCampo_detalles_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_nombre.setText("Nombre del empleado");

        textoCampo_detalles_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_nacimiento.setText("Fecha de nacimiento");

        textoCampo_detalles_cargoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_cargoEmpleado.setText("Cargo asignado");

        textoCampo_detalles_tipoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_tipoEmpleado.setText("Tipo de cargo del empleado");

        textoCampo_detalles_salario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_detalles_salario.setText("Salario mensual actual");

        botonEmpleados_detallesRegresar.setText("Regresar");
        botonEmpleados_detallesRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_detallesRegresarActionPerformed(evt);
            }
        });

        botonEmpleados_consultarDatos.setText("Consultar datos");
        botonEmpleados_consultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_consultarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEmpleados_detallesLayout = new javax.swing.GroupLayout(barraEmpleados_detalles);
        barraEmpleados_detalles.setLayout(barraEmpleados_detallesLayout);
        barraEmpleados_detallesLayout.setHorizontalGroup(
            barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_detallesLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(barraEmpleados_detallesLayout.createSequentialGroup()
                        .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_detalles_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_cargoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_tipoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_salario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_detalles_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_detalles_cargoEmpleado)
                            .addComponent(formatoCampo_detalles_nombre)
                            .addComponent(formatoCampo_detalles_nacimiento)
                            .addComponent(formatoCampo_detalles_tipoEmpleado)
                            .addComponent(formatoCampo_detalles_salario)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_detallesLayout.createSequentialGroup()
                                .addComponent(comboCampo_detalles_identificacion, 0, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEmpleados_consultarDatos))))
                    .addComponent(botonEmpleados_detallesRegresar))
                .addGap(32, 32, 32))
        );
        barraEmpleados_detallesLayout.setVerticalGroup(
            barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_detallesLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_detalles_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_identificacion)
                    .addComponent(botonEmpleados_consultarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_nombre))
                .addGap(12, 12, 12)
                .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_cargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_cargoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_tipoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_detallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_detalles_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_detalles_salario))
                .addGap(60, 60, 60)
                .addComponent(botonEmpleados_detallesRegresar)
                .addGap(12, 12, 12))
        );

        getContentPane().add(barraEmpleados_detalles, "card4");

        barraEmpleados_lista.setMaximumSize(new java.awt.Dimension(300, 300));
        barraEmpleados_lista.setMinimumSize(new java.awt.Dimension(300, 300));

        formatoCampo_lista_scroll.setViewportView(formatoCampo_lista);

        botonEmpleados_listaRegresar.setText("Regresar");
        botonEmpleados_listaRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_listaRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEmpleados_listaLayout = new javax.swing.GroupLayout(barraEmpleados_lista);
        barraEmpleados_lista.setLayout(barraEmpleados_listaLayout);
        barraEmpleados_listaLayout.setHorizontalGroup(
            barraEmpleados_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_listaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(barraEmpleados_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonEmpleados_listaRegresar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formatoCampo_lista_scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        barraEmpleados_listaLayout.setVerticalGroup(
            barraEmpleados_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_listaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(formatoCampo_lista_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEmpleados_listaRegresar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(barraEmpleados_lista, "card4");

        barraEmpleados_retirar.setMaximumSize(new java.awt.Dimension(300, 300));
        barraEmpleados_retirar.setMinimumSize(new java.awt.Dimension(300, 300));

        textoCampo_retirar_identificacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_identificacion.setText("Documento de identidad");

        textoCampo_retirar_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_nombre.setText("Nombre del empleado");

        textoCampo_retirar_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_nacimiento.setText("Fecha de nacimiento");

        textoCampo_retirar_cargoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_cargoEmpleado.setText("Cargo asignado");

        textoCampo_retirar_tipoEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_tipoEmpleado.setText("Tipo de cargo del empleado");

        textoCampo_retirar_salario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCampo_retirar_salario.setText("Salario mensual actual");

        botonEmpleados_retirarRegresar.setText("Regresar");
        botonEmpleados_retirarRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_retirarRegresarActionPerformed(evt);
            }
        });

        botonEmpleados_retirar_consultarDatos.setText("Consultar datos");
        botonEmpleados_retirar_consultarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_retirar_consultarDatosActionPerformed(evt);
            }
        });

        botonEmpleados_retirarEmpleado.setText("Retirar empleado");
        botonEmpleados_retirarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleados_retirarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraEmpleados_retirarLayout = new javax.swing.GroupLayout(barraEmpleados_retirar);
        barraEmpleados_retirar.setLayout(barraEmpleados_retirarLayout);
        barraEmpleados_retirarLayout.setHorizontalGroup(
            barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_retirarLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEmpleados_retirarEmpleado)
                    .addGroup(barraEmpleados_retirarLayout.createSequentialGroup()
                        .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCampo_retirar_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_cargoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_tipoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_salario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoCampo_retirar_identificacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formatoCampo_retirar_cargoEmpleado)
                            .addComponent(formatoCampo_retirar_nombre)
                            .addComponent(formatoCampo_retirar_nacimiento)
                            .addComponent(formatoCampo_retirar_tipoEmpleado)
                            .addComponent(formatoCampo_retirar_salario)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEmpleados_retirarLayout.createSequentialGroup()
                                .addComponent(comboCampo_retirar_identificacion, 0, 103, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEmpleados_retirar_consultarDatos))))
                    .addComponent(botonEmpleados_retirarRegresar))
                .addGap(32, 32, 32))
        );
        barraEmpleados_retirarLayout.setVerticalGroup(
            barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraEmpleados_retirarLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCampo_retirar_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_identificacion)
                    .addComponent(botonEmpleados_retirar_consultarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_nombre))
                .addGap(12, 12, 12)
                .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_cargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_cargoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_tipoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(barraEmpleados_retirarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatoCampo_retirar_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoCampo_retirar_salario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonEmpleados_retirarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botonEmpleados_retirarRegresar)
                .addGap(12, 12, 12))
        );

        getContentPane().add(barraEmpleados_retirar, "card4");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Metodo que permite que al presionar botonEmpleados_listaRegresar, este se cierre - Inicio
    private void botonEmpleados_listaRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_listaRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonEmpleados_listaRegresarActionPerformed
    // Metodo que permite que al presionar botonEmpleados_listaRegresar, este se cierre - Fin

    // Metodo que toma los valores del formulario para registrar un empleado y los carga en listaEmpleados - Inicio
    private void botonEmpleados_registrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_registrarDatosActionPerformed
        if ((formatoCampo_ingresar_nombre.getText().equals("") == true)
                || (formatoCampo_ingresar_identificacion.getText().equals("") == true)
                || (formatoCampo_ingresar_nacimiento.getText().equals("") == true)
                || (formatoCampo_ingresar_cargoEmpleado.getText().equals("") == true)
                || (formatoCampo_ingresar_tipoEmpleado.getText().equals("") == true)
                || (formatoCampo_ingresar_salarioMensual.getText().equals("") == true)) {

            mensajePantalla("vacio");
        } else {
            empleados.registrarPersona("Empleado",
                    formatoCampo_ingresar_nombre.getText(),
                    formatoCampo_ingresar_identificacion.getText(),
                    formatoCampo_ingresar_nacimiento.getText(),
                    formatoCampo_ingresar_cargoEmpleado.getText(),
                    formatoCampo_ingresar_tipoEmpleado.getText(),
                    formatoCampo_ingresar_salarioMensual.getText()
            );
            seatoraPersistencia.guardarArchivo();
            this.dispose();
        }
    }//GEN-LAST:event_botonEmpleados_registrarDatosActionPerformed
    // Metodo que toma los valores del formulario para registrar un empleado y los carga en listaEmpleados - Fin

    // Metodo que permite que al presionar botonEmpleados_detallesRegresar, este se cierre - Inicio
    private void botonEmpleados_detallesRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_detallesRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonEmpleados_detallesRegresarActionPerformed
    // Metodo que permite que al presionar botonEmpleados_detallesRegresar, este se cierre - Fin

    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del empleados requerido - Inicio
    private void botonEmpleados_consultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_consultarDatosActionPerformed
        JTextField variableNula_A = null, variableNula_B = null;
        empleados.detallesPersona(comboCampo_detalles_identificacion,
                formatoCampo_detalles_nombre,
                formatoCampo_detalles_nacimiento,
                formatoCampo_detalles_cargoEmpleado,
                formatoCampo_detalles_tipoEmpleado,
                formatoCampo_detalles_salario,
                variableNula_A, variableNula_B);
    }//GEN-LAST:event_botonEmpleados_consultarDatosActionPerformed
    // Metodo que se encarga de tomar los valores de los JTextField y JComboBox para mostrar los detalles del empleados requerido - Fin

    // Metodo que determina si el usuario ya registro el nuevo salario del empleado, si es asi, lo modifica y guarda el archivo - Inicio
    private void botonEmpleados_registrarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_registrarSalarioActionPerformed
        if (formatoCampo_modificar_salarioMensual_nuevo.getText().equals("") == true) {
            mensajePantalla("vacio");
        } else {
            empleados.modificarPersona("salario", comboCampo_modificar_identificacion, formatoCampo_modificar_salarioMensual_nuevo);
            seatoraPersistencia.guardarArchivo();
            mensajePantalla("modificarDatos");
        }
    }//GEN-LAST:event_botonEmpleados_registrarSalarioActionPerformed
    // Metodo que determina si el usuario ya registro el nuevo salario del empleado, si es asi, lo modifica y guarda el archivo - Fin

    // Metodo que determina si el usuario ya registro el el nuevo tipo de empleado de la persona, si es asi, lo modifica y guarda el archivo - Inicio
    private void botonEmpleados_registrarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_registrarTipoActionPerformed
        if (formatoCampo_modificar_tipoEmpleado_nuevo.getText().equals("") == true) {
            mensajePantalla("vacio");
        } else {
            empleados.modificarPersona("tipo", comboCampo_modificar_identificacion, formatoCampo_modificar_tipoEmpleado_nuevo);
            seatoraPersistencia.guardarArchivo();
            mensajePantalla("modificarDatos");
        }
    }//GEN-LAST:event_botonEmpleados_registrarTipoActionPerformed
    // Metodo que determina si el usuario ya registro el el nuevo tipo de empleado de la persona, si es asi, lo modifica y guarda el archivo - Fin

    // Metodo que determina si el usuario ya registro el nuevo cargo del empleado, si es asi, lo modifica y guarda el archivo - Inicio
    private void botonEmpleados_registrarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_registrarCargoActionPerformed
        if (formatoCampo_modificar_cargoEmpleado_nuevo.getText().equals("") == true) {
            mensajePantalla("vacio");
        } else {
            empleados.modificarPersona("cargo", comboCampo_modificar_identificacion, formatoCampo_modificar_cargoEmpleado_nuevo);
            seatoraPersistencia.guardarArchivo();
            mensajePantalla("modificarDatos");
        }
    }//GEN-LAST:event_botonEmpleados_registrarCargoActionPerformed
    // Metodo que determina si el usuario ya registro el nuevo cargo del empleado, si es asi, lo modifica y guarda el archivo - Fin

    // Metodo que permite que al presionar botonEmpleados_modificarRegresar, este se cierre - Inicio
    private void botonEmpleados_modificarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_modificarRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonEmpleados_modificarRegresarActionPerformed
    // Metodo que permite que al presionar botonEmpleados_modificarRegresar, este se cierre - Fin

    // Metodo que permite mostrar los datos de cargo, tipo de empleado, y salario actual del empleado seleccionado - Inicio
    private void botonEmpleados_modificar_consultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_modificar_consultarDatosActionPerformed
        String criterioBusqueda = String.valueOf(comboCampo_modificar_identificacion.getSelectedItem());

        for (int n = 0; n < Empleado.listaEmpleados.size(); n++) {
            if (Empleado.listaEmpleados.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                formatoCampo_modificar_nombre.setText(Empleado.listaEmpleados.get(n).get_nombreCompleto());
                formatoCampo_modificar_cargoEmpleado_actual.setText(Empleado.listaEmpleados.get(n).get_cargoEmpleado());
                formatoCampo_modificar_tipoEmpleado_actual.setText(Empleado.listaEmpleados.get(n).get_tipoEmpleado());
                formatoCampo_modificar_salarioMensual_actual.setText(Empleado.listaEmpleados.get(n).get_salarioMensual());
            }
        }
    }//GEN-LAST:event_botonEmpleados_modificar_consultarDatosActionPerformed
    // Metodo que permite mostrar los datos de cargo, tipo de empleado, y salario actual del empleado seleccionado - Fin
    
    // Metodo que al presionar barraEmpleados_radioCargo activa solamente la ventana de cargoEmpleado para ingresar los datos correspondientes - Inicio
    private void barraEmpleados_radioCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraEmpleados_radioCargoActionPerformed
        barraEmpleados_modificar_cargoEmpleado.setVisible(true);
        barraEmpleados_modificar_tipoEmpleado.setVisible(false);
        barraEmpleados_modificar_salarioMensual.setVisible(false);
    }//GEN-LAST:event_barraEmpleados_radioCargoActionPerformed
    // Metodo que al presionar barraEmpleados_radioCargo activa solamente la ventana de cargoEmpleado para ingresar los datos correspondientes - Fin

    // Metodo que al presionar barraEmpleados_radioTipo activa solamente la ventana de tipoEmpleado para ingresar los datos correspondientes - Inicio
    private void barraEmpleados_radioTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraEmpleados_radioTipoActionPerformed
        barraEmpleados_modificar_cargoEmpleado.setVisible(false);
        barraEmpleados_modificar_tipoEmpleado.setVisible(true);
        barraEmpleados_modificar_salarioMensual.setVisible(false);
    }//GEN-LAST:event_barraEmpleados_radioTipoActionPerformed
    // Metodo que al presionar barraEmpleados_radioTipo activa solamente la ventana de tipoEmpleado para ingresar los datos correspondientes - Fin

    // Metodo que al presionar barraEmpleados_radioSalario activa solamente la ventana de salarioMensual para ingresar los datos correspondientes - Inicio
    private void barraEmpleados_radioSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraEmpleados_radioSalarioActionPerformed
        barraEmpleados_modificar_cargoEmpleado.setVisible(false);
        barraEmpleados_modificar_tipoEmpleado.setVisible(false);
        barraEmpleados_modificar_salarioMensual.setVisible(true);
    }//GEN-LAST:event_barraEmpleados_radioSalarioActionPerformed
    // Metodo que al presionar barraEmpleados_radioSalario activa solamente la ventana de salarioMensual para ingresar los datos correspondientes - Fin

    // Metodo que permite que al presionar botonEmpleados_retirarRegresar, este se cierre - Inicio
    private void botonEmpleados_retirarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_retirarRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonEmpleados_retirarRegresarActionPerformed
    // Metodo que permite que al presionar botonEmpleados_retirarRegresar, este se cierre - Fin

    // Metodo que toma los valores de los JTextField y JComboBox para ser mostrados en pantalla para permitir al usuario verificar estos datos antes de retirar al paciente - Inicio
    private void botonEmpleados_retirar_consultarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_retirar_consultarDatosActionPerformed
        JTextField variableNula_A = null, variableNula_B = null;
        empleados.detallesPersona(comboCampo_retirar_identificacion,
                formatoCampo_retirar_nombre,
                formatoCampo_retirar_nacimiento,
                formatoCampo_retirar_cargoEmpleado,
                formatoCampo_retirar_tipoEmpleado,
                formatoCampo_retirar_salario,
                variableNula_A, variableNula_B);
    }//GEN-LAST:event_botonEmpleados_retirar_consultarDatosActionPerformed
    // Metodo que toma los valores de los JTextField y JComboBox para ser mostrados en pantalla para permitir al usuario verificar estos datos antes de retirar al paciente - Fin

    // Metodo que retira al paciente de listaEmpleados y posteriormente guarda los cambios hechos - Inicio
    private void botonEmpleados_retirarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_retirarEmpleadoActionPerformed
        empleados.retirarPersona(comboCampo_retirar_identificacion);
        seatoraPersistencia.guardarArchivo();
        mensajePantalla("retirarPersona");
    }//GEN-LAST:event_botonEmpleados_retirarEmpleadoActionPerformed
    // Metodo que retira al paciente de listaEmpleados y posteriormente guarda los cambios hechos - Fin
    
    // Metodo que permite que al presionar botonEmpleados_ingresarRegresar, este se cierre - Inicio
    private void botonEmpleados_ingresarRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleados_ingresarRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonEmpleados_ingresarRegresarActionPerformed
    // Metodo que permite que al presionar botonEmpleados_ingresarRegresar, este se cierre - Fin

    // Metodo Principal - Inicio
    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(Empleados_GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados_GUI().setVisible(true);
            }
        });
    }
    // Metodo Principal - Fin

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraEmpleados_detalles;
    private javax.swing.JPanel barraEmpleados_ingresar;
    private javax.swing.JPanel barraEmpleados_lista;
    private javax.swing.JPanel barraEmpleados_modificar;
    private javax.swing.JPanel barraEmpleados_modificar_cargoEmpleado;
    private javax.swing.ButtonGroup barraEmpleados_modificar_grupoBotones;
    private javax.swing.JPanel barraEmpleados_modificar_opcionUsuario;
    private javax.swing.JPanel barraEmpleados_modificar_salarioMensual;
    private javax.swing.JPanel barraEmpleados_modificar_tipoEmpleado;
    private javax.swing.JRadioButton barraEmpleados_radioCargo;
    private javax.swing.JRadioButton barraEmpleados_radioSalario;
    private javax.swing.JRadioButton barraEmpleados_radioTipo;
    private javax.swing.JPanel barraEmpleados_retirar;
    private javax.swing.JButton botonEmpleados_consultarDatos;
    private javax.swing.JButton botonEmpleados_detallesRegresar;
    private javax.swing.JButton botonEmpleados_ingresarRegresar;
    private javax.swing.JButton botonEmpleados_listaRegresar;
    private javax.swing.JButton botonEmpleados_modificarRegresar;
    private javax.swing.JButton botonEmpleados_modificar_consultarDatos;
    private javax.swing.JButton botonEmpleados_registrarCargo;
    private javax.swing.JButton botonEmpleados_registrarDatos;
    private javax.swing.JButton botonEmpleados_registrarSalario;
    private javax.swing.JButton botonEmpleados_registrarTipo;
    private javax.swing.JButton botonEmpleados_retirarEmpleado;
    private javax.swing.JButton botonEmpleados_retirarRegresar;
    private javax.swing.JButton botonEmpleados_retirar_consultarDatos;
    private javax.swing.JComboBox<String> comboCampo_detalles_identificacion;
    private javax.swing.JComboBox<String> comboCampo_modificar_identificacion;
    private javax.swing.JComboBox<String> comboCampo_retirar_identificacion;
    private javax.swing.JTextField formatoCampo_detalles_cargoEmpleado;
    private javax.swing.JTextField formatoCampo_detalles_nacimiento;
    private javax.swing.JTextField formatoCampo_detalles_nombre;
    private javax.swing.JTextField formatoCampo_detalles_salario;
    private javax.swing.JTextField formatoCampo_detalles_tipoEmpleado;
    private javax.swing.JTextField formatoCampo_ingresar_cargoEmpleado;
    private javax.swing.JTextField formatoCampo_ingresar_identificacion;
    private javax.swing.JTextField formatoCampo_ingresar_nacimiento;
    private javax.swing.JTextField formatoCampo_ingresar_nombre;
    private javax.swing.JTextField formatoCampo_ingresar_salarioMensual;
    private javax.swing.JTextField formatoCampo_ingresar_tipoEmpleado;
    private javax.swing.JList<String> formatoCampo_lista;
    private javax.swing.JScrollPane formatoCampo_lista_scroll;
    private javax.swing.JTextField formatoCampo_modificar_cargoEmpleado_actual;
    private javax.swing.JTextField formatoCampo_modificar_cargoEmpleado_nuevo;
    private javax.swing.JTextField formatoCampo_modificar_nombre;
    private javax.swing.JTextField formatoCampo_modificar_salarioMensual_actual;
    private javax.swing.JTextField formatoCampo_modificar_salarioMensual_nuevo;
    private javax.swing.JTextField formatoCampo_modificar_tipoEmpleado_actual;
    private javax.swing.JTextField formatoCampo_modificar_tipoEmpleado_nuevo;
    private javax.swing.JTextField formatoCampo_retirar_cargoEmpleado;
    private javax.swing.JTextField formatoCampo_retirar_nacimiento;
    private javax.swing.JTextField formatoCampo_retirar_nombre;
    private javax.swing.JTextField formatoCampo_retirar_salario;
    private javax.swing.JTextField formatoCampo_retirar_tipoEmpleado;
    private javax.swing.JLabel textoCampo_detalles_cargoEmpleado;
    private javax.swing.JLabel textoCampo_detalles_identificacion;
    private javax.swing.JLabel textoCampo_detalles_nacimiento;
    private javax.swing.JLabel textoCampo_detalles_nombre;
    private javax.swing.JLabel textoCampo_detalles_salario;
    private javax.swing.JLabel textoCampo_detalles_tipoEmpleado;
    private javax.swing.JLabel textoCampo_ingresar_cargoEmpleado;
    private javax.swing.JLabel textoCampo_ingresar_identificacion;
    private javax.swing.JLabel textoCampo_ingresar_nacimiento;
    private javax.swing.JLabel textoCampo_ingresar_nombre;
    private javax.swing.JLabel textoCampo_ingresar_salarioMensual;
    private javax.swing.JLabel textoCampo_ingresar_tipoEmpleado;
    private javax.swing.JLabel textoCampo_modificar_cargoEmpleado_actual;
    private javax.swing.JLabel textoCampo_modificar_cargoEmpleado_nuevo;
    private javax.swing.JLabel textoCampo_modificar_identificacion;
    private javax.swing.JLabel textoCampo_modificar_nombre;
    private javax.swing.JLabel textoCampo_modificar_opcionMensaje;
    private javax.swing.JLabel textoCampo_modificar_salarioMensual_actual;
    private javax.swing.JLabel textoCampo_modificar_salarioMensual_nuevo;
    private javax.swing.JLabel textoCampo_modificar_tipoEmpleado_actual;
    private javax.swing.JLabel textoCampo_modificar_tipoEmpleado_nuevo;
    private javax.swing.JLabel textoCampo_retirar_cargoEmpleado;
    private javax.swing.JLabel textoCampo_retirar_identificacion;
    private javax.swing.JLabel textoCampo_retirar_nacimiento;
    private javax.swing.JLabel textoCampo_retirar_nombre;
    private javax.swing.JLabel textoCampo_retirar_salario;
    private javax.swing.JLabel textoCampo_retirar_tipoEmpleado;
    // End of variables declaration//GEN-END:variables
    private Paciente pacientes = new Paciente("Paciente", "", "", "", "", "", "", "", "");

    private Empleado empleados = new Empleado("Empleado", "", "", "", "", "", "");
    private Archivos seatoraPersistencia = new Archivos();
    private DefaultListModel listaModelo = new DefaultListModel();
    private Mensajes_GUI interfazGrafica_mensajeAlerta = new Mensajes_GUI();
}
