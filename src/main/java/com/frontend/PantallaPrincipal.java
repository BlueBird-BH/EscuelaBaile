package com.frontend;

import com.backend.ConexionSQL;

import java.awt.Color;
import java.awt.Cursor;

import com.formdev.flatlaf.FlatDarkLaf;

public class PantallaPrincipal extends javax.swing.JFrame {

    private PantallaAlumnos pantallaAlumnos = new PantallaAlumnos();
    private PantallaProfesores pantallaProfesores = new PantallaProfesores();
    private PantallaSesiones pantallaSesiones = new PantallaSesiones();
    private PantallaSalones pantallaSalones = new PantallaSalones();
    private PantallaPaquetes pantallaPaquetes = new PantallaPaquetes();
    private ConexionSQL conexion = new ConexionSQL();

    private Color colorGris = new Color(123, 123, 123);
    private Color colorGrisClaro = new Color(150, 150, 150);
    private Color colorBlanco = new Color(187, 187, 187);
    private Color colorNegro = new Color(69, 72, 75);

    public PantallaPrincipal() {
        realizarConexionSQL();

        initComponents();
        definirCursorBotones();
    }

    private void definirCursorBotones() {
        botonInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonAlumnos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonProfesores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonSesiones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonSalones.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonPaquetes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void realizarConexionSQL() {
        conexion.establecerConexion();
        pantallaAlumnos.definirConexion(conexion);
        pantallaProfesores.definirConexion(conexion);
        pantallaSesiones.definirConexion(conexion);
        pantallaSalones.definirConexion(conexion);
        pantallaPaquetes.definirConexion(conexion);
    }

    private void ocultarPantallas() {
        pantallaAlumnos.setVisible(false);
        pantallaProfesores.setVisible(false);
        pantallaSesiones.setVisible(false);
        pantallaSalones.setVisible(false);
        pantallaPaquetes.setVisible(false);
    }

    private void activarOpcion(String pantalla, String opcion) {
        ocultarPantallas();

        switch (pantalla) {
            case "alumnos":
                pantallaAlumnos.setVisible(true);
                pantallaAlumnos.pantallaRequerida(opcion);
                break;

            case "profesores":
                pantallaProfesores.setVisible(true);
                pantallaProfesores.pantallaRequerida(opcion);
                break;

            case "sesiones":
                pantallaSesiones.setVisible(true);
                pantallaSesiones.pantallaRequerida(opcion);
                break;

            case "salones":
                pantallaSalones.setVisible(true);
                pantallaSalones.pantallaRequerida(opcion);
                break;

            case "paquetes":
                pantallaPaquetes.setVisible(true);
                pantallaPaquetes.pantallaRequerida(opcion);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateral = new javax.swing.JPanel();
        botonInicio = new javax.swing.JPanel();
        tituloBotonInicio = new javax.swing.JLabel();
        botonAlumnos = new javax.swing.JPanel();
        tituloBotonAlumnos = new javax.swing.JLabel();
        botonProfesores = new javax.swing.JPanel();
        tituloBotonProfesores = new javax.swing.JLabel();
        botonSesiones = new javax.swing.JPanel();
        tituloBotonSesiones = new javax.swing.JLabel();
        botonSalones = new javax.swing.JPanel();
        tituloBotonSalones = new javax.swing.JLabel();
        botonPaquetes = new javax.swing.JPanel();
        tituloBotonPaquetes = new javax.swing.JLabel();
        logoPrimerParrafo = new javax.swing.JLabel();
        logoSegundoParrafo = new javax.swing.JLabel();
        barraSeparadora = new javax.swing.JSeparator();
        barraPrincipal = new javax.swing.JPanel();
        barraInicio = new javax.swing.JPanel();
        barraAlumnos = new javax.swing.JPanel();
        botonRegistrarAlumno = new javax.swing.JButton();
        botonVerAlumno = new javax.swing.JButton();
        botonModificarAlumno = new javax.swing.JButton();
        botonComprarPaquete = new javax.swing.JButton();
        botonVerClasesAsistidas = new javax.swing.JButton();
        botonVerClasesPendientes = new javax.swing.JButton();
        botonVerPaquetesAdquiridos = new javax.swing.JButton();
        botonEliminarAlumno = new javax.swing.JButton();
        barraProfesores = new javax.swing.JPanel();
        botonRegistrarProfesor = new javax.swing.JButton();
        botonVerProfesor = new javax.swing.JButton();
        botonModificarProfesor = new javax.swing.JButton();
        botonVerSesionesProgramadas = new javax.swing.JButton();
        botonVerSesionesDictadas = new javax.swing.JButton();
        botonEliminarProfesor = new javax.swing.JButton();
        barraSesiones = new javax.swing.JPanel();
        botonIngresarSesion = new javax.swing.JButton();
        botonVerSesion = new javax.swing.JButton();
        botonModificarSesion = new javax.swing.JButton();
        botonSesionesPorFecha = new javax.swing.JButton();
        botonSesionesPorClase = new javax.swing.JButton();
        botonEliminarSesion = new javax.swing.JButton();
        barraSalones = new javax.swing.JPanel();
        salones_ingresarDatos = new javax.swing.JButton();
        salones_modificarDatos = new javax.swing.JButton();
        salones_verDatos = new javax.swing.JButton();
        salones_verDisponibilidad = new javax.swing.JButton();
        salones_filtrarHora = new javax.swing.JButton();
        salones_eliminarSalon = new javax.swing.JButton();
        barraPaquetes = new javax.swing.JPanel();
        paquetes_ingresarDatos = new javax.swing.JButton();
        paquetes_modificarDatos = new javax.swing.JButton();
        paquetes_verDatos = new javax.swing.JButton();
        paquetes_verVentas = new javax.swing.JButton();
        paquetes_filtrarCompra = new javax.swing.JButton();
        paquetes_eliminarPaquete = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        botonSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion - Mis primeros brincos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        barraLateral.setBackground(new java.awt.Color(102, 102, 102));

        botonInicio.setBackground(new java.awt.Color(69, 72, 75));
        botonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInicioMouseClicked(evt);
            }
        });

        tituloBotonInicio.setBackground(new java.awt.Color(187, 187, 187));
        tituloBotonInicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloBotonInicio.setForeground(new java.awt.Color(150, 150, 150));
        tituloBotonInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonInicio.setText("Inicio");

        javax.swing.GroupLayout botonInicioLayout = new javax.swing.GroupLayout(botonInicio);
        botonInicio.setLayout(botonInicioLayout);
        botonInicioLayout.setHorizontalGroup(
                botonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonInicioLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(tituloBotonInicio)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonInicioLayout.setVerticalGroup(
                botonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonInicioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonInicio)
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        botonAlumnos.setBackground(new java.awt.Color(123, 123, 123));
        botonAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAlumnosMouseClicked(evt);
            }
        });

        tituloBotonAlumnos.setBackground(new java.awt.Color(187, 187, 187));
        tituloBotonAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloBotonAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonAlumnos.setText("Gestionar alumnos");

        javax.swing.GroupLayout botonAlumnosLayout = new javax.swing.GroupLayout(botonAlumnos);
        botonAlumnos.setLayout(botonAlumnosLayout);
        botonAlumnosLayout.setHorizontalGroup(
                botonAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonAlumnosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonAlumnos)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonAlumnosLayout.setVerticalGroup(
                botonAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonAlumnosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonAlumnos)
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        botonProfesores.setBackground(new java.awt.Color(123, 123, 123));
        botonProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProfesoresMouseClicked(evt);
            }
        });

        tituloBotonProfesores.setBackground(new java.awt.Color(187, 187, 187));
        tituloBotonProfesores.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloBotonProfesores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonProfesores.setText("Gestionar profesores");

        javax.swing.GroupLayout botonProfesoresLayout = new javax.swing.GroupLayout(botonProfesores);
        botonProfesores.setLayout(botonProfesoresLayout);
        botonProfesoresLayout.setHorizontalGroup(
                botonProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonProfesoresLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonProfesores)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonProfesoresLayout.setVerticalGroup(
                botonProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonProfesoresLayout.createSequentialGroup()
                                .addContainerGap(7, Short.MAX_VALUE)
                                .addComponent(tituloBotonProfesores)
                                .addContainerGap())
        );

        botonSesiones.setBackground(new java.awt.Color(123, 123, 123));
        botonSesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSesionesMouseClicked(evt);
            }
        });

        tituloBotonSesiones.setBackground(new java.awt.Color(187, 187, 187));
        tituloBotonSesiones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloBotonSesiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonSesiones.setText("Gestionar sesiones");

        javax.swing.GroupLayout botonSesionesLayout = new javax.swing.GroupLayout(botonSesiones);
        botonSesiones.setLayout(botonSesionesLayout);
        botonSesionesLayout.setHorizontalGroup(
                botonSesionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonSesionesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonSesiones)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonSesionesLayout.setVerticalGroup(
                botonSesionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonSesionesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonSesiones)
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        botonSalones.setBackground(new java.awt.Color(123, 123, 123));
        botonSalones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalonesMouseClicked(evt);
            }
        });

        tituloBotonSalones.setBackground(new java.awt.Color(187, 187, 187));
        tituloBotonSalones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloBotonSalones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonSalones.setText("Gestionar salones");

        javax.swing.GroupLayout botonSalonesLayout = new javax.swing.GroupLayout(botonSalones);
        botonSalones.setLayout(botonSalonesLayout);
        botonSalonesLayout.setHorizontalGroup(
                botonSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonSalonesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonSalones)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonSalonesLayout.setVerticalGroup(
                botonSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonSalonesLayout.createSequentialGroup()
                                .addContainerGap(7, Short.MAX_VALUE)
                                .addComponent(tituloBotonSalones)
                                .addContainerGap())
        );

        botonPaquetes.setBackground(new java.awt.Color(123, 123, 123));
        botonPaquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPaquetesMouseClicked(evt);
            }
        });

        tituloBotonPaquetes.setBackground(new java.awt.Color(187, 187, 187));
        tituloBotonPaquetes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tituloBotonPaquetes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonPaquetes.setText("Gestionar paquetes");

        javax.swing.GroupLayout botonPaquetesLayout = new javax.swing.GroupLayout(botonPaquetes);
        botonPaquetes.setLayout(botonPaquetesLayout);
        botonPaquetesLayout.setHorizontalGroup(
                botonPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonPaquetesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonPaquetes)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonPaquetesLayout.setVerticalGroup(
                botonPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonPaquetesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloBotonPaquetes)
                                .addContainerGap(7, Short.MAX_VALUE))
        );

        logoPrimerParrafo.setBackground(new java.awt.Color(187, 187, 187));
        logoPrimerParrafo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        logoPrimerParrafo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoPrimerParrafo.setText("Mis primeros");

        logoSegundoParrafo.setBackground(new java.awt.Color(187, 187, 187));
        logoSegundoParrafo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        logoSegundoParrafo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoSegundoParrafo.setText("brincos");

        javax.swing.GroupLayout barraLateralLayout = new javax.swing.GroupLayout(barraLateral);
        barraLateral.setLayout(barraLateralLayout);
        barraLateralLayout.setHorizontalGroup(
                barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonProfesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(barraLateralLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(logoSegundoParrafo)
                                        .addComponent(barraSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoPrimerParrafo))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(botonSesiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraLateralLayout.setVerticalGroup(
                barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barraLateralLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(logoPrimerParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoSegundoParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(barraSeparadora, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonSalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barraPrincipal.setLayout(new java.awt.CardLayout());

        barraInicio.setMaximumSize(new java.awt.Dimension(300, 300));
        barraInicio.setMinimumSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout barraInicioLayout = new javax.swing.GroupLayout(barraInicio);
        barraInicio.setLayout(barraInicioLayout);
        barraInicioLayout.setHorizontalGroup(
                barraInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 302, Short.MAX_VALUE)
        );
        barraInicioLayout.setVerticalGroup(
                barraInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 350, Short.MAX_VALUE)
        );

        barraPrincipal.add(barraInicio, "card2");

        barraAlumnos.setMaximumSize(new java.awt.Dimension(300, 300));
        barraAlumnos.setMinimumSize(new java.awt.Dimension(300, 300));

        botonRegistrarAlumno.setText("Registrar nuevo alumno");
        botonRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarAlumnoActionPerformed(evt);
            }
        });

        botonVerAlumno.setText("Ver informacion de un alumno");
        botonVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerAlumnoActionPerformed(evt);
            }
        });

        botonModificarAlumno.setText("Modificar datos de un alumno");
        botonModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarAlumnoActionPerformed(evt);
            }
        });

        botonComprarPaquete.setText("Comprar paquete");
        botonComprarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarPaqueteActionPerformed(evt);
            }
        });

        botonVerClasesAsistidas.setText("Sesiónes a las que ha asistido");
        botonVerClasesAsistidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerClasesAsistidasActionPerformed(evt);
            }
        });

        botonVerClasesPendientes.setText("Sesiónes pendientes");
        botonVerClasesPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerClasesPendientesActionPerformed(evt);
            }
        });

        botonVerPaquetesAdquiridos.setText("Paquetes adquiridos");
        botonVerPaquetesAdquiridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPaquetesAdquiridosActionPerformed(evt);
            }
        });

        botonEliminarAlumno.setText("Eliminar un alumno");
        botonEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraAlumnosLayout = new javax.swing.GroupLayout(barraAlumnos);
        barraAlumnos.setLayout(barraAlumnosLayout);
        barraAlumnosLayout.setHorizontalGroup(
                barraAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAlumnosLayout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(barraAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonComprarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonEliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerClasesPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerClasesAsistidas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerPaquetesAdquiridos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonModificarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonRegistrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
        );
        barraAlumnosLayout.setVerticalGroup(
                barraAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barraAlumnosLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(botonRegistrarAlumno)
                                .addGap(12, 12, 12)
                                .addComponent(botonVerAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonModificarAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonComprarPaquete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerClasesAsistidas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerClasesPendientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerPaquetesAdquiridos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarAlumno)
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        barraPrincipal.add(barraAlumnos, "card4");

        barraProfesores.setMaximumSize(new java.awt.Dimension(300, 300));
        barraProfesores.setMinimumSize(new java.awt.Dimension(300, 300));

        botonRegistrarProfesor.setText("Registrar nuevo profesor");
        botonRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarProfesorActionPerformed(evt);
            }
        });

        botonVerProfesor.setText("Ver informacion de un profesor");
        botonVerProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerProfesorActionPerformed(evt);
            }
        });

        botonModificarProfesor.setText("Modificar datos de un profesor");
        botonModificarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarProfesorActionPerformed(evt);
            }
        });

        botonVerSesionesProgramadas.setText("Ver sesiones programadas");
        botonVerSesionesProgramadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerSesionesProgramadasActionPerformed(evt);
            }
        });

        botonVerSesionesDictadas.setText("Ver sesiones dictadas");
        botonVerSesionesDictadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerSesionesDictadasActionPerformed(evt);
            }
        });

        botonEliminarProfesor.setText("Eliminar un profesor");
        botonEliminarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraProfesoresLayout = new javax.swing.GroupLayout(barraProfesores);
        barraProfesores.setLayout(barraProfesoresLayout);
        barraProfesoresLayout.setHorizontalGroup(
                barraProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraProfesoresLayout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(barraProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerSesionesDictadas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerSesionesProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonModificarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonRegistrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
        );
        barraProfesoresLayout.setVerticalGroup(
                barraProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barraProfesoresLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(botonRegistrarProfesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerProfesor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonModificarProfesor)
                                .addGap(12, 12, 12)
                                .addComponent(botonVerSesionesProgramadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerSesionesDictadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarProfesor)
                                .addContainerGap(108, Short.MAX_VALUE))
        );

        barraPrincipal.add(barraProfesores, "card4");

        barraSesiones.setMaximumSize(new java.awt.Dimension(300, 300));
        barraSesiones.setMinimumSize(new java.awt.Dimension(300, 300));

        botonIngresarSesion.setText("Ingresar datos de una sesión");
        botonIngresarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarSesionActionPerformed(evt);
            }
        });

        botonVerSesion.setText("Ver informacion de una sesión");
        botonVerSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerSesionActionPerformed(evt);
            }
        });

        botonModificarSesion.setText("Modificar datos de una sesión");
        botonModificarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarSesionActionPerformed(evt);
            }
        });

        botonSesionesPorFecha.setText("Filtrar sesiónes por fecha");
        botonSesionesPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSesionesPorFechaActionPerformed(evt);
            }
        });

        botonSesionesPorClase.setText("Filtrar sesiónes por clases");
        botonSesionesPorClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSesionesPorClaseActionPerformed(evt);
            }
        });

        botonEliminarSesion.setText("Eliminar una sesión");
        botonEliminarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraSesionesLayout = new javax.swing.GroupLayout(barraSesiones);
        barraSesiones.setLayout(barraSesionesLayout);
        barraSesionesLayout.setHorizontalGroup(
                barraSesionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSesionesLayout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(barraSesionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonEliminarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonSesionesPorClase, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonSesionesPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonModificarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonVerSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonIngresarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
        );
        barraSesionesLayout.setVerticalGroup(
                barraSesionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barraSesionesLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(botonIngresarSesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerSesion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonModificarSesion)
                                .addGap(12, 12, 12)
                                .addComponent(botonSesionesPorFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonSesionesPorClase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarSesion)
                                .addContainerGap(108, Short.MAX_VALUE))
        );

        barraPrincipal.add(barraSesiones, "card4");

        barraSalones.setMaximumSize(new java.awt.Dimension(300, 300));
        barraSalones.setMinimumSize(new java.awt.Dimension(300, 300));

        salones_ingresarDatos.setText("Ingresar datos de un salon");
        salones_ingresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salones_ingresarDatosActionPerformed(evt);
            }
        });

        salones_modificarDatos.setText("Modificar datos de un salon");
        salones_modificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salones_modificarDatosActionPerformed(evt);
            }
        });

        salones_verDatos.setText("Ver informacion de un salon");
        salones_verDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salones_verDatosActionPerformed(evt);
            }
        });

        salones_verDisponibilidad.setText("Ver disponibilidad de un salon");
        salones_verDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salones_verDisponibilidadActionPerformed(evt);
            }
        });

        salones_filtrarHora.setText("Clases dictadas en un tiempo");
        salones_filtrarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salones_filtrarHoraActionPerformed(evt);
            }
        });

        salones_eliminarSalon.setText("Eliminar un salon");
        salones_eliminarSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salones_eliminarSalonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraSalonesLayout = new javax.swing.GroupLayout(barraSalones);
        barraSalones.setLayout(barraSalonesLayout);
        barraSalonesLayout.setHorizontalGroup(
                barraSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSalonesLayout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(barraSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(salones_eliminarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salones_filtrarHora, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salones_verDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salones_modificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salones_verDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(salones_ingresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))
        );
        barraSalonesLayout.setVerticalGroup(
                barraSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barraSalonesLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(salones_ingresarDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salones_modificarDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salones_verDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salones_verDisponibilidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salones_filtrarHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salones_eliminarSalon)
                                .addContainerGap(108, Short.MAX_VALUE))
        );

        barraPrincipal.add(barraSalones, "card4");

        barraPaquetes.setMaximumSize(new java.awt.Dimension(300, 300));
        barraPaquetes.setMinimumSize(new java.awt.Dimension(300, 300));

        paquetes_ingresarDatos.setText("Ingresar datos de un paquete");
        paquetes_ingresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetes_ingresarDatosActionPerformed(evt);
            }
        });

        paquetes_modificarDatos.setText("Modificar datos de un paquete");
        paquetes_modificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetes_modificarDatosActionPerformed(evt);
            }
        });

        paquetes_verDatos.setText("Ver informacion de un paquete");
        paquetes_verDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetes_verDatosActionPerformed(evt);
            }
        });

        paquetes_verVentas.setText("Ver ventas de un paquete");
        paquetes_verVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetes_verVentasActionPerformed(evt);
            }
        });

        paquetes_filtrarCompra.setText("Compras en un rango de tiempo");
        paquetes_filtrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetes_filtrarCompraActionPerformed(evt);
            }
        });

        paquetes_eliminarPaquete.setText("Eliminar un paquete");
        paquetes_eliminarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetes_eliminarPaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraPaquetesLayout = new javax.swing.GroupLayout(barraPaquetes);
        barraPaquetes.setLayout(barraPaquetesLayout);
        barraPaquetesLayout.setHorizontalGroup(
                barraPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPaquetesLayout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(barraPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(paquetes_eliminarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(paquetes_verVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(paquetes_modificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(paquetes_verDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(paquetes_ingresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(paquetes_filtrarCompra))
                                .addGap(49, 49, 49))
        );
        barraPaquetesLayout.setVerticalGroup(
                barraPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(barraPaquetesLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(paquetes_ingresarDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paquetes_modificarDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paquetes_verDatos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paquetes_verVentas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paquetes_filtrarCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paquetes_eliminarPaquete)
                                .addContainerGap(108, Short.MAX_VALUE))
        );

        barraPrincipal.add(barraPaquetes, "card4");

        menuArchivo.setText("Archivo");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(botonSalir);

        barraMenu.add(menuArchivo);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(barraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(barraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(barraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barraPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseClicked
        barraInicio.setVisible(true);
        barraAlumnos.setVisible(false);
        barraProfesores.setVisible(false);
        barraSesiones.setVisible(false);
        barraSalones.setVisible(false);
        barraPaquetes.setVisible(false);

        tituloBotonInicio.setForeground(colorGrisClaro);
        tituloBotonAlumnos.setForeground(colorBlanco);
        tituloBotonProfesores.setForeground(colorBlanco);
        tituloBotonSesiones.setForeground(colorBlanco);
        tituloBotonSalones.setForeground(colorBlanco);
        tituloBotonPaquetes.setForeground(colorBlanco);

        botonInicio.setBackground(colorNegro);
        botonAlumnos.setBackground(colorGris);
        botonProfesores.setBackground(colorGris);
        botonSesiones.setBackground(colorGris);
        botonSalones.setBackground(colorGris);
        botonPaquetes.setBackground(colorGris);
    }//GEN-LAST:event_botonInicioMouseClicked

    private void botonAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAlumnosMouseClicked
        barraInicio.setVisible(false);
        barraAlumnos.setVisible(true);
        barraProfesores.setVisible(false);
        barraSesiones.setVisible(false);
        barraSalones.setVisible(false);
        barraPaquetes.setVisible(false);

        tituloBotonInicio.setForeground(colorBlanco);
        tituloBotonAlumnos.setForeground(colorGrisClaro);
        tituloBotonProfesores.setForeground(colorBlanco);
        tituloBotonSesiones.setForeground(colorBlanco);
        tituloBotonSalones.setForeground(colorBlanco);
        tituloBotonPaquetes.setForeground(colorBlanco);

        botonInicio.setBackground(colorGris);
        botonAlumnos.setBackground(colorNegro);
        botonProfesores.setBackground(colorGris);
        botonSesiones.setBackground(colorGris);
        botonSalones.setBackground(colorGris);
        botonPaquetes.setBackground(colorGris);
    }//GEN-LAST:event_botonAlumnosMouseClicked

    private void botonProfesoresMouseClicked(java.awt.event.MouseEvent evt) {
        barraInicio.setVisible(false);
        barraAlumnos.setVisible(false);
        barraProfesores.setVisible(true);
        barraSesiones.setVisible(false);
        barraSalones.setVisible(false);
        barraPaquetes.setVisible(false);

        tituloBotonInicio.setForeground(colorBlanco);
        tituloBotonAlumnos.setForeground(colorBlanco);
        tituloBotonProfesores.setForeground(colorGrisClaro);
        tituloBotonSesiones.setForeground(colorBlanco);
        tituloBotonSalones.setForeground(colorBlanco);
        tituloBotonPaquetes.setForeground(colorBlanco);

        botonInicio.setBackground(colorGris);
        botonAlumnos.setBackground(colorGris);
        botonProfesores.setBackground(colorNegro);
        botonSesiones.setBackground(colorGris);
        botonSalones.setBackground(colorGris);
        botonPaquetes.setBackground(colorGris);
    }

    private void botonSesionesMouseClicked(java.awt.event.MouseEvent evt) {
        barraInicio.setVisible(false);
        barraAlumnos.setVisible(false);
        barraProfesores.setVisible(false);
        barraSesiones.setVisible(true);
        barraSalones.setVisible(false);
        barraPaquetes.setVisible(false);

        tituloBotonInicio.setForeground(colorBlanco);
        tituloBotonAlumnos.setForeground(colorBlanco);
        tituloBotonProfesores.setForeground(colorBlanco);
        tituloBotonSesiones.setForeground(colorGrisClaro);
        tituloBotonSalones.setForeground(colorBlanco);
        tituloBotonPaquetes.setForeground(colorBlanco);

        botonInicio.setBackground(colorGris);
        botonAlumnos.setBackground(colorGris);
        botonProfesores.setBackground(colorGris);
        botonSesiones.setBackground(colorNegro);
        botonSalones.setBackground(colorGris);
        botonPaquetes.setBackground(colorGris);
    }

    private void botonSalonesMouseClicked(java.awt.event.MouseEvent evt) {
        barraInicio.setVisible(false);
        barraAlumnos.setVisible(false);
        barraProfesores.setVisible(false);
        barraSesiones.setVisible(false);
        barraSalones.setVisible(true);
        barraPaquetes.setVisible(false);

        tituloBotonInicio.setForeground(colorBlanco);
        tituloBotonAlumnos.setForeground(colorBlanco);
        tituloBotonProfesores.setForeground(colorBlanco);
        tituloBotonSesiones.setForeground(colorBlanco);
        tituloBotonSalones.setForeground(colorGrisClaro);
        tituloBotonPaquetes.setForeground(colorBlanco);

        botonInicio.setBackground(colorGris);
        botonAlumnos.setBackground(colorGris);
        botonProfesores.setBackground(colorGris);
        botonSesiones.setBackground(colorGris);
        botonSalones.setBackground(colorNegro);
        botonPaquetes.setBackground(colorGris);
    }

    private void botonPaquetesMouseClicked(java.awt.event.MouseEvent evt) {
        barraInicio.setVisible(false);
        barraAlumnos.setVisible(false);
        barraProfesores.setVisible(false);
        barraSesiones.setVisible(false);
        barraSalones.setVisible(false);
        barraPaquetes.setVisible(true);

        tituloBotonInicio.setForeground(colorBlanco);
        tituloBotonAlumnos.setForeground(colorBlanco);
        tituloBotonProfesores.setForeground(colorBlanco);
        tituloBotonSesiones.setForeground(colorBlanco);
        tituloBotonSalones.setForeground(colorBlanco);
        tituloBotonPaquetes.setForeground(colorGrisClaro);

        botonInicio.setBackground(colorGris);
        botonAlumnos.setBackground(colorGris);
        botonProfesores.setBackground(colorGris);
        botonSesiones.setBackground(colorGris);
        botonSalones.setBackground(colorGris);
        botonPaquetes.setBackground(colorNegro);
    }

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        conexion.cerrarConexion();
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarAlumnoActionPerformed
        activarOpcion("alumnos", "ingresarDatos");
    }//GEN-LAST:event_botonRegistrarAlumnoActionPerformed

    private void botonModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarAlumnoActionPerformed
        activarOpcion("alumnos", "modificarDatos");
    }//GEN-LAST:event_botonModificarAlumnoActionPerformed

    private void botonVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerAlumnoActionPerformed
        activarOpcion("alumnos", "verDatos");
    }//GEN-LAST:event_botonVerAlumnoActionPerformed

    private void botonVerClasesAsistidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerClasesAsistidasActionPerformed
        activarOpcion("alumnos", "clasesAsistidas");
    }//GEN-LAST:event_botonVerClasesAsistidasActionPerformed

    private void botonVerClasesPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerClasesPendientesActionPerformed
        activarOpcion("alumnos", "clasesPendientes");
    }//GEN-LAST:event_botonVerClasesPendientesActionPerformed

    private void botonVerPaquetesAdquiridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPaquetesAdquiridosActionPerformed
        activarOpcion("alumnos", "paquetesAdquiridos");
    }//GEN-LAST:event_botonVerPaquetesAdquiridosActionPerformed

    private void botonEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAlumnoActionPerformed
        activarOpcion("alumnos", "eliminarAlumno");
    }//GEN-LAST:event_botonEliminarAlumnoActionPerformed

    private void botonRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarProfesorActionPerformed
        activarOpcion("profesores", "ingresarDatos");
    }//GEN-LAST:event_botonRegistrarProfesorActionPerformed

    private void botonModificarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarProfesorActionPerformed
        activarOpcion("profesores", "modificarDatos");
    }//GEN-LAST:event_botonModificarProfesorActionPerformed

    private void botonVerProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerProfesorActionPerformed
        activarOpcion("profesores", "verDatos");
    }//GEN-LAST:event_botonVerProfesorActionPerformed

    private void botonVerSesionesProgramadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerSesionesProgramadasActionPerformed
        activarOpcion("profesores", "verSesionesProgramadas");
    }//GEN-LAST:event_botonVerSesionesProgramadasActionPerformed

    private void botonVerSesionesDictadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerSesionesDictadasActionPerformed
        activarOpcion("profesores", "verSesionesDictadas");
    }//GEN-LAST:event_botonVerSesionesDictadasActionPerformed

    private void botonEliminarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProfesorActionPerformed
        activarOpcion("profesores", "eliminarProfesor");
    }//GEN-LAST:event_botonEliminarProfesorActionPerformed

    private void botonIngresarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarSesionActionPerformed
        activarOpcion("sesiones", "ingresarDatos");
    }//GEN-LAST:event_botonIngresarSesionActionPerformed

    private void botonModificarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarSesionActionPerformed
        activarOpcion("sesiones", "modificarDatos");
    }//GEN-LAST:event_botonModificarSesionActionPerformed

    private void botonVerSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerSesionActionPerformed
        activarOpcion("sesiones", "verDatos");
    }//GEN-LAST:event_botonVerSesionActionPerformed

    private void botonSesionesPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSesionesPorFechaActionPerformed
        activarOpcion("sesiones", "filtarFecha");
    }//GEN-LAST:event_botonSesionesPorFechaActionPerformed

    private void botonSesionesPorClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSesionesPorClaseActionPerformed
        activarOpcion("sesiones", "filtrarClase");
    }//GEN-LAST:event_botonSesionesPorClaseActionPerformed

    private void botonEliminarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarSesionActionPerformed
        activarOpcion("sesiones", "eliminarSesion");
    }//GEN-LAST:event_botonEliminarSesionActionPerformed

    private void salones_ingresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salones_ingresarDatosActionPerformed
        activarOpcion("salones", "ingresarDatos");
    }//GEN-LAST:event_salones_ingresarDatosActionPerformed

    private void salones_modificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salones_modificarDatosActionPerformed
        activarOpcion("salones", "modificarDatos");
    }//GEN-LAST:event_salones_modificarDatosActionPerformed

    private void salones_verDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salones_verDatosActionPerformed
        activarOpcion("salones", "verDatos");
    }//GEN-LAST:event_salones_verDatosActionPerformed

    private void salones_verDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salones_verDisponibilidadActionPerformed
        activarOpcion("salones", "verDisponibilidad");
    }//GEN-LAST:event_salones_verDisponibilidadActionPerformed

    private void salones_filtrarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salones_filtrarHoraActionPerformed
        activarOpcion("salones", "filtrarDia");
    }//GEN-LAST:event_salones_filtrarHoraActionPerformed

    private void salones_eliminarSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salones_eliminarSalonActionPerformed
        activarOpcion("salones", "eliminarSalon");
    }//GEN-LAST:event_salones_eliminarSalonActionPerformed

    private void paquetes_ingresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetes_ingresarDatosActionPerformed
        activarOpcion("paquetes", "ingresarDatos");
    }//GEN-LAST:event_paquetes_ingresarDatosActionPerformed

    private void paquetes_modificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetes_modificarDatosActionPerformed
        activarOpcion("paquetes", "modificarDatos");
    }//GEN-LAST:event_paquetes_modificarDatosActionPerformed

    private void paquetes_verDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetes_verDatosActionPerformed
        activarOpcion("paquetes", "verDatos");
    }//GEN-LAST:event_paquetes_verDatosActionPerformed

    private void paquetes_verVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetes_verVentasActionPerformed
        activarOpcion("paquetes", "verVentas");
    }//GEN-LAST:event_paquetes_verVentasActionPerformed

    private void paquetes_filtrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetes_filtrarCompraActionPerformed
        activarOpcion("paquetes", "filtrarFechas");
    }//GEN-LAST:event_paquetes_filtrarCompraActionPerformed

    private void paquetes_eliminarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetes_eliminarPaqueteActionPerformed
        activarOpcion("paquetes", "eliminarPaquete");
    }//GEN-LAST:event_paquetes_eliminarPaqueteActionPerformed

    private void botonComprarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarPaqueteActionPerformed
        activarOpcion("alumnos", "comprarPaquete");
    }//GEN-LAST:event_botonComprarPaqueteActionPerformed

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
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraAlumnos;
    private javax.swing.JPanel barraInicio;
    private javax.swing.JPanel barraLateral;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JPanel barraPaquetes;
    private javax.swing.JPanel barraPrincipal;
    private javax.swing.JPanel barraProfesores;
    private javax.swing.JPanel barraSalones;
    private javax.swing.JSeparator barraSeparadora;
    private javax.swing.JPanel barraSesiones;
    private javax.swing.JPanel botonAlumnos;
    private javax.swing.JButton botonComprarPaquete;
    private javax.swing.JButton botonEliminarAlumno;
    private javax.swing.JButton botonEliminarProfesor;
    private javax.swing.JButton botonEliminarSesion;
    private javax.swing.JButton botonIngresarSesion;
    private javax.swing.JPanel botonInicio;
    private javax.swing.JButton botonModificarAlumno;
    private javax.swing.JButton botonModificarProfesor;
    private javax.swing.JButton botonModificarSesion;
    private javax.swing.JPanel botonPaquetes;
    private javax.swing.JPanel botonProfesores;
    private javax.swing.JButton botonRegistrarAlumno;
    private javax.swing.JButton botonRegistrarProfesor;
    private javax.swing.JMenuItem botonSalir;
    private javax.swing.JPanel botonSalones;
    private javax.swing.JPanel botonSesiones;
    private javax.swing.JButton botonSesionesPorClase;
    private javax.swing.JButton botonSesionesPorFecha;
    private javax.swing.JButton botonVerAlumno;
    private javax.swing.JButton botonVerClasesAsistidas;
    private javax.swing.JButton botonVerClasesPendientes;
    private javax.swing.JButton botonVerPaquetesAdquiridos;
    private javax.swing.JButton botonVerProfesor;
    private javax.swing.JButton botonVerSesion;
    private javax.swing.JButton botonVerSesionesDictadas;
    private javax.swing.JButton botonVerSesionesProgramadas;
    private javax.swing.JLabel logoPrimerParrafo;
    private javax.swing.JLabel logoSegundoParrafo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JButton paquetes_eliminarPaquete;
    private javax.swing.JButton paquetes_filtrarCompra;
    private javax.swing.JButton paquetes_ingresarDatos;
    private javax.swing.JButton paquetes_modificarDatos;
    private javax.swing.JButton paquetes_verDatos;
    private javax.swing.JButton paquetes_verVentas;
    private javax.swing.JButton salones_eliminarSalon;
    private javax.swing.JButton salones_filtrarHora;
    private javax.swing.JButton salones_ingresarDatos;
    private javax.swing.JButton salones_modificarDatos;
    private javax.swing.JButton salones_verDatos;
    private javax.swing.JButton salones_verDisponibilidad;
    private javax.swing.JLabel tituloBotonAlumnos;
    private javax.swing.JLabel tituloBotonInicio;
    private javax.swing.JLabel tituloBotonPaquetes;
    private javax.swing.JLabel tituloBotonProfesores;
    private javax.swing.JLabel tituloBotonSalones;
    private javax.swing.JLabel tituloBotonSesiones;
    // End of variables declaration//GEN-END:variables
}
