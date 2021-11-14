package com.frontend;

import java.awt.Color;
import java.awt.Cursor;
import com.formdev.flatlaf.FlatDarkLaf;

public class PantallaPrincipal extends javax.swing.JFrame {

    private Archivos seatoraPersistencia = new Archivos();
    private PantallaAlumnos pantallaAlumnos = new PantallaAlumnos();
    private PantallaProfesores pantallaProfesores = new PantallaProfesores();
    private PantallaSesiones pantallaSesiones = new PantallaSesiones();
    private PantallaSalones pantallaSalones = new PantallaSalones();
    private PantallaPaquetes pantallaPaquetes = new PantallaPaquetes();
    private Color colorGris = new Color(150, 150, 150);
    private Color colorGris = new Color(187, 187, 187);

    public PantallaPrincipal() {
        initComponents();
        seatoraPersistencia.abrirArchivo();

        botonInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonProfesores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonAlumnos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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

        gestionEmpleado_grupoBotones = new javax.swing.ButtonGroup();
        barraLateral = new javax.swing.JPanel();
        botonInicio = new javax.swing.JPanel();
        textoBoton_Inicio = new javax.swing.JLabel();
        botonAlumnos = new javax.swing.JPanel();
        textoBoton_Empleados = new javax.swing.JLabel();
        botonProfesores = new javax.swing.JPanel();
        textoBoton_Pacientes = new javax.swing.JLabel();
        botonSesiones = new javax.swing.JPanel();
        textoBoton_Empleados1 = new javax.swing.JLabel();
        botonSalones = new javax.swing.JPanel();
        textoBoton_Empleados2 = new javax.swing.JLabel();
        botonPaquetes = new javax.swing.JPanel();
        textoBoton_Empleados3 = new javax.swing.JLabel();
        logoPrimerParrafo = new javax.swing.JLabel();
        logoSegundoParrafo = new javax.swing.JLabel();
        barraSeparadora = new javax.swing.JSeparator();
        barraPrincipal = new javax.swing.JPanel();
        barraInicio = new javax.swing.JPanel();
        barraAlumnos = new javax.swing.JPanel();
        alumnos_ingresarDatos = new javax.swing.JButton();
        alumnos_modificarDatos = new javax.swing.JButton();
        alumnos_verInformacion = new javax.swing.JButton();
        alumnos_clasesAsistidas = new javax.swing.JButton();
        alumnos_clasesPendientes = new javax.swing.JButton();
        alumnos_paquetesAdquiridos = new javax.swing.JButton();
        alumnos_retirarAlumno = new javax.swing.JButton();
        barraProfesores = new javax.swing.JPanel();
        profesores_ingresarDatos = new javax.swing.JButton();
        profesores_modificarDatos = new javax.swing.JButton();
        profesores_verInformacion = new javax.swing.JButton();
        profesores_verSesionesProgramadas = new javax.swing.JButton();
        profesores_verSesionesDictadas = new javax.swing.JButton();
        profesores_retirarProfesor = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        botonSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mis primeros brincos");
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

        textoBoton_Inicio.setBackground(new java.awt.Color(187, 187, 187));
        textoBoton_Inicio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoBoton_Inicio.setForeground(new java.awt.Color(150, 150, 150));
        textoBoton_Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBoton_Inicio.setText("Inicio");

        javax.swing.GroupLayout botonInicioLayout = new javax.swing.GroupLayout(botonInicio);
        botonInicio.setLayout(botonInicioLayout);
        botonInicioLayout.setHorizontalGroup(
            botonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonInicioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(textoBoton_Inicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonInicioLayout.setVerticalGroup(
            botonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Inicio)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        botonAlumnos.setBackground(new java.awt.Color(123, 123, 123));
        botonAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAlumnosMouseClicked(evt);
            }
        });

        textoBoton_Empleados.setBackground(new java.awt.Color(187, 187, 187));
        textoBoton_Empleados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoBoton_Empleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBoton_Empleados.setText("Gestionar alumnos");

        javax.swing.GroupLayout botonAlumnosLayout = new javax.swing.GroupLayout(botonAlumnos);
        botonAlumnos.setLayout(botonAlumnosLayout);
        botonAlumnosLayout.setHorizontalGroup(
            botonAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Empleados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonAlumnosLayout.setVerticalGroup(
            botonAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Empleados)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        botonProfesores.setBackground(new java.awt.Color(123, 123, 123));
        botonProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProfesoresMouseClicked(evt);
            }
        });

        textoBoton_Pacientes.setBackground(new java.awt.Color(187, 187, 187));
        textoBoton_Pacientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoBoton_Pacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBoton_Pacientes.setText("Gestionar profesores");

        javax.swing.GroupLayout botonProfesoresLayout = new javax.swing.GroupLayout(botonProfesores);
        botonProfesores.setLayout(botonProfesoresLayout);
        botonProfesoresLayout.setHorizontalGroup(
            botonProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonProfesoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Pacientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonProfesoresLayout.setVerticalGroup(
            botonProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonProfesoresLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(textoBoton_Pacientes)
                .addContainerGap())
        );

        botonSesiones.setBackground(new java.awt.Color(123, 123, 123));
        botonSesiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSesionesMouseClicked(evt);
            }
        });

        textoBoton_Empleados1.setBackground(new java.awt.Color(187, 187, 187));
        textoBoton_Empleados1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoBoton_Empleados1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBoton_Empleados1.setText("Gestionar sesiones");

        javax.swing.GroupLayout botonSesionesLayout = new javax.swing.GroupLayout(botonSesiones);
        botonSesiones.setLayout(botonSesionesLayout);
        botonSesionesLayout.setHorizontalGroup(
            botonSesionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSesionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Empleados1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonSesionesLayout.setVerticalGroup(
            botonSesionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSesionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Empleados1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        botonSalones.setBackground(new java.awt.Color(123, 123, 123));
        botonSalones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalonesMouseClicked(evt);
            }
        });

        textoBoton_Empleados2.setBackground(new java.awt.Color(187, 187, 187));
        textoBoton_Empleados2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoBoton_Empleados2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBoton_Empleados2.setText("Gestionar salones");

        javax.swing.GroupLayout botonSalonesLayout = new javax.swing.GroupLayout(botonSalones);
        botonSalones.setLayout(botonSalonesLayout);
        botonSalonesLayout.setHorizontalGroup(
            botonSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Empleados2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonSalonesLayout.setVerticalGroup(
            botonSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonSalonesLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(textoBoton_Empleados2)
                .addContainerGap())
        );

        botonPaquetes.setBackground(new java.awt.Color(123, 123, 123));
        botonPaquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPaquetesMouseClicked(evt);
            }
        });

        textoBoton_Empleados3.setBackground(new java.awt.Color(187, 187, 187));
        textoBoton_Empleados3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textoBoton_Empleados3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoBoton_Empleados3.setText("Gestionar paquetes");

        javax.swing.GroupLayout botonPaquetesLayout = new javax.swing.GroupLayout(botonPaquetes);
        botonPaquetes.setLayout(botonPaquetesLayout);
        botonPaquetesLayout.setHorizontalGroup(
            botonPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPaquetesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Empleados3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonPaquetesLayout.setVerticalGroup(
            botonPaquetesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPaquetesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoBoton_Empleados3)
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
                .addContainerGap(16, Short.MAX_VALUE))
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

        alumnos_ingresarDatos.setText("Ingresar datos de un alumno");
        alumnos_ingresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_ingresarDatosActionPerformed(evt);
            }
        });

        alumnos_modificarDatos.setText("Modificar datos de un alumno");
        alumnos_modificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_modificarDatosActionPerformed(evt);
            }
        });

        alumnos_verInformacion.setText("Ver informacion de un alumno");
        alumnos_verInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_verInformacionActionPerformed(evt);
            }
        });

        alumnos_clasesAsistidas.setText("Clases a las que ha asistido");
        alumnos_clasesAsistidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_clasesAsistidasActionPerformed(evt);
            }
        });

        alumnos_clasesPendientes.setText("Clases pendientes");
        alumnos_clasesPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_clasesPendientesActionPerformed(evt);
            }
        });

        alumnos_paquetesAdquiridos.setText("Paquetes adquiridos");
        alumnos_paquetesAdquiridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_paquetesAdquiridosActionPerformed(evt);
            }
        });

        alumnos_retirarAlumno.setText("Retirar un alumno");
        alumnos_retirarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_retirarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraAlumnosLayout = new javax.swing.GroupLayout(barraAlumnos);
        barraAlumnos.setLayout(barraAlumnosLayout);
        barraAlumnosLayout.setHorizontalGroup(
            barraAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraAlumnosLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(barraAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alumnos_retirarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnos_clasesPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnos_clasesAsistidas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnos_paquetesAdquiridos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnos_modificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnos_verInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alumnos_ingresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        barraAlumnosLayout.setVerticalGroup(
            barraAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraAlumnosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(alumnos_ingresarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alumnos_modificarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alumnos_verInformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alumnos_clasesAsistidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alumnos_clasesPendientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alumnos_paquetesAdquiridos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alumnos_retirarAlumno)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        barraPrincipal.add(barraAlumnos, "card4");

        barraProfesores.setMaximumSize(new java.awt.Dimension(300, 300));
        barraProfesores.setMinimumSize(new java.awt.Dimension(300, 300));

        profesores_ingresarDatos.setText("Ingresar datos de un profesor");
        profesores_ingresarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profesores_ingresarDatosMouseClicked(evt);
            }
        });
        profesores_ingresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesores_ingresarDatosActionPerformed(evt);
            }
        });

        profesores_modificarDatos.setText("Modificar datos de un profesor");
        profesores_modificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesores_modificarDatosActionPerformed(evt);
            }
        });

        profesores_verInformacion.setText("Ver informacion de un profesor");
        profesores_verInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesores_verInformacionActionPerformed(evt);
            }
        });

        profesores_verSesionesProgramadas.setText("Ver sesiones programadas");
        profesores_verSesionesProgramadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesores_verSesionesProgramadasActionPerformed(evt);
            }
        });

        profesores_verSesionesDictadas.setText("Ver sesiones dictadas");
        profesores_verSesionesDictadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesores_verSesionesDictadasActionPerformed(evt);
            }
        });

        profesores_retirarProfesor.setText("Retirar un profesor");
        profesores_retirarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profesores_retirarProfesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraProfesoresLayout = new javax.swing.GroupLayout(barraProfesores);
        barraProfesores.setLayout(barraProfesoresLayout);
        barraProfesoresLayout.setHorizontalGroup(
            barraProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraProfesoresLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(barraProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profesores_retirarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profesores_verSesionesDictadas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profesores_verSesionesProgramadas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profesores_modificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profesores_verInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profesores_ingresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        barraProfesoresLayout.setVerticalGroup(
            barraProfesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraProfesoresLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(profesores_ingresarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profesores_modificarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profesores_verInformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profesores_verSesionesProgramadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profesores_verSesionesDictadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profesores_retirarProfesor)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        barraPrincipal.add(barraProfesores, "card4");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        barraEmpleados.setVisible(false);
        barraAlumnos.setVisible(false);

        textoBoton_Inicio.setForeground(new Color(150, 150, 150));
        textoBoton_Pacientes.setForeground(new Color(187, 187, 187));
        textoBoton_Empleados.setForeground(new Color(187, 187, 187));

        botonInicio.setBackground(new Color(69, 72, 75));
        botonProfesores.setBackground(new Color(123, 123, 123));
        botonAlumnos.setBackground(new Color(123, 123, 123));
    }//GEN-LAST:event_botonInicioMouseClicked

    private void botonProfesoresMouseClicked(java.awt.event.MouseEvent evt) {
        barraInicio.setVisible(false);
        barraEmpleados.setVisible(true);
        barraAlumnos.setVisible(false);

        textoBoton_Inicio.setForeground(new Color(187, 187, 187));
        textoBoton_Pacientes.setForeground(new Color(150, 150, 150));
        textoBoton_Empleados.setForeground(new Color(187, 187, 187));

        botonInicio.setBackground(new Color(123, 123, 123));
        botonProfesores.setBackground(new Color(69, 72, 75));
        botonAlumnos.setBackground(new Color(123, 123, 123));
    }//GEN-LAST:event_botonProfesoresMouseClicked

    private void botonAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAlumnosMouseClicked
        barraInicio.setVisible(false);
        barraEmpleados.setVisible(false);
        barraAlumnos.setVisible(true);

        textoBoton_Inicio.setForeground(new Color(187, 187, 187));
        textoBoton_Pacientes.setForeground(new Color(187, 187, 187));
        textoBoton_Empleados.setForeground(new Color(150, 150, 150));

        botonInicio.setBackground(new Color(123, 123, 123));
        botonProfesores.setBackground(new Color(123, 123, 123));
        botonAlumnos.setBackground(new Color(69, 72, 75));
    }//GEN-LAST:event_botonAlumnosMouseClicked

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void alumnos_ingresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_ingresarDatosActionPerformed

    }//GEN-LAST:event_alumnos_ingresarDatosActionPerformed

    private void alumnos_modificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_modificarDatosActionPerformed
    }//GEN-LAST:event_alumnos_modificarDatosActionPerformed

    private void alumnos_verInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_verInformacionActionPerformed


    }//GEN-LAST:event_alumnos_verInformacionActionPerformed

    private void alumnos_paquetesAdquiridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_paquetesAdquiridosActionPerformed

    }//GEN-LAST:event_alumnos_paquetesAdquiridosActionPerformed

    private void alumnos_clasesAsistidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_clasesAsistidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alumnos_clasesAsistidasActionPerformed

    private void alumnos_clasesPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_clasesPendientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alumnos_clasesPendientesActionPerformed

    private void alumnos_retirarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_retirarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alumnos_retirarAlumnoActionPerformed

    private void botonSesionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSesionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSesionesMouseClicked

    private void botonSalonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalonesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalonesMouseClicked

    private void botonPaquetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPaquetesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPaquetesMouseClicked

    private void profesores_retirarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesores_retirarProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesores_retirarProfesorActionPerformed

    private void profesores_verSesionesDictadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesores_verSesionesDictadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesores_verSesionesDictadasActionPerformed

    private void profesores_verSesionesProgramadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesores_verSesionesProgramadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesores_verSesionesProgramadasActionPerformed

    private void profesores_verInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesores_verInformacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesores_verInformacionActionPerformed

    private void profesores_modificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesores_modificarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesores_modificarDatosActionPerformed

    private void profesores_ingresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profesores_ingresarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profesores_ingresarDatosActionPerformed

    private void profesores_ingresarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profesores_ingresarDatosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profesores_ingresarDatosMouseClicked

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
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alumnos_clasesAsistidas;
    private javax.swing.JButton alumnos_clasesPendientes;
    private javax.swing.JButton alumnos_ingresarDatos;
    private javax.swing.JButton alumnos_modificarDatos;
    private javax.swing.JButton alumnos_paquetesAdquiridos;
    private javax.swing.JButton alumnos_retirarAlumno;
    private javax.swing.JButton alumnos_verInformacion;
    private javax.swing.JPanel barraAlumnos;
    private javax.swing.JPanel barraInicio;
    private javax.swing.JPanel barraLateral;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JPanel barraPrincipal;
    private javax.swing.JPanel barraProfesores;
    private javax.swing.JSeparator barraSeparadora;
    private javax.swing.JPanel botonAlumnos;
    private javax.swing.JPanel botonInicio;
    private javax.swing.JPanel botonPaquetes;
    private javax.swing.JPanel botonProfesores;
    private javax.swing.JMenuItem botonSalir;
    private javax.swing.JPanel botonSalones;
    private javax.swing.JPanel botonSesiones;
    private javax.swing.ButtonGroup gestionEmpleado_grupoBotones;
    private javax.swing.JLabel logoPrimerParrafo;
    private javax.swing.JLabel logoSegundoParrafo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JButton profesores_ingresarDatos;
    private javax.swing.JButton profesores_modificarDatos;
    private javax.swing.JButton profesores_retirarProfesor;
    private javax.swing.JButton profesores_verInformacion;
    private javax.swing.JButton profesores_verSesionesDictadas;
    private javax.swing.JButton profesores_verSesionesProgramadas;
    private javax.swing.JLabel textoBoton_Empleados;
    private javax.swing.JLabel textoBoton_Empleados1;
    private javax.swing.JLabel textoBoton_Empleados2;
    private javax.swing.JLabel textoBoton_Empleados3;
    private javax.swing.JLabel textoBoton_Inicio;
    private javax.swing.JLabel textoBoton_Pacientes;
    // End of variables declaration//GEN-END:variables
}
