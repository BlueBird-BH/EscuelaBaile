package com.frontend;

import com.backend.Sesion;
import com.backend.Profesor;
import com.backend.Curso;
import com.backend.Salon;
import com.backend.ConexionSQL;
import com.formdev.flatlaf.FlatDarkLaf;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PantallaSesiones extends javax.swing.JFrame {

    private ArrayList<Sesion> listaSesiones = new ArrayList<>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private ArrayList<Salon> listaSalones = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    private DefaultListModel modeloLista = new DefaultListModel();

    private Sesion sesiones = new Sesion();
    private Profesor profesores = new Profesor();
    private Salon salones = new Salon();
    private Curso cursos = new Curso();

    private ConexionSQL conexion = new ConexionSQL();
    private VentanasEmergentes ventanaEmergente = new VentanasEmergentes();

    public PantallaSesiones() {
        initComponents();
    }

    public void definirConexion(ConexionSQL conexion) {
        this.conexion = conexion;
        sesiones.setConexion(conexion);
        profesores.setConexion(conexion);
        salones.setConexion(conexion);
        cursos.setConexion(conexion);
    }

    private void mensajePantalla(String ventana) {
        ventanaEmergente.setVisible(true);
        ventanaEmergente.ventanaRequerida(ventana);
    }

    private void cargarSesiones(javax.swing.JComboBox<String> comboBox) {
        listaSesiones = sesiones.obtenerSesiones();
        comboBox.removeAllItems();

        listaSesiones.forEach(sesion -> {
            comboBox.addItem(sesion.getId());
        });
    }

    private void cargarProfesores(javax.swing.JComboBox<String> comboBox) {
        listaProfesores = profesores.obtenerProfesores();
        comboBox.removeAllItems();

        listaProfesores.forEach(profesor -> {
            comboBox.addItem(profesor.getCedula());
        });
    }

    private void cargarSalones(javax.swing.JComboBox<String> comboBox) {
        listaSalones = salones.obtenerSalones();
        comboBox.removeAllItems();

        listaSalones.forEach(salon -> {
            comboBox.addItem(salon.getId());
        });
    }

    private void cargarCursos(javax.swing.JComboBox<String> comboBox) {
        listaCursos = cursos.obtenerCursos();
        comboBox.removeAllItems();

        listaCursos.forEach(cursos -> {
            comboBox.addItem(cursos.getId());
        });
    }

    private void prepararModeloLista(javax.swing.JList<String> campo) {
        campo.setModel(modeloLista);
        modeloLista.removeAllElements();
    }

    private boolean determinarCampoVacio(javax.swing.JTextField campo) {
        if (campo.getText().equals("") == true) {
            return true;
        }
        return false;
    }

    private void ocultarPantallas() {
        pantallaRegistrar.setVisible(false);
        pantallaVisualizar.setVisible(false);
        pantallaModificar.setVisible(false);
        pantallaEliminar.setVisible(false);
        pantallaSesionesPorFecha.setVisible(false);
        pantallaSesionesPorCurso.setVisible(false);
    }

    public void pantallaRequerida(String barraRequerida) {
        ocultarPantallas();

        switch (barraRequerida) {
            case "ingresarDatos":
                campoRegistrarID.setText(null);
                campoRegistrarFecha.setText(null);
                campoRegistrarHoraInicio.setText(null);
                campoRegistrarHoraFin.setText(null);
                cargarProfesores(campoRegistrarProfesor);
                cargarSalones(campoRegistrarSalon);
                cargarCursos(campoRegistrarCurso);

                pantallaRegistrar.setVisible(true);
                break;

            case "verDatos":
                cargarSesiones(campoVisualizarID);
                campoVisualizarFecha.setText(null);
                campoVisualizarFecha.setEditable(false);

                campoVisualizarHoraInicio.setText(null);
                campoVisualizarHoraInicio.setEditable(false);

                campoVisualizarHoraFin.setText(null);
                campoVisualizarHoraFin.setEditable(false);

                campoVisualizarProfesor.setText(null);
                campoVisualizarProfesor.setEditable(false);

                campoVisualizarSalon.setText(null);
                campoVisualizarSalon.setEditable(false);

                campoVisualizarCurso.setText(null);
                campoVisualizarCurso.setEditable(false);

                pantallaVisualizar.setVisible(true);
                break;

            case "modificarDatos":
                cargarSesiones(campoModificarID);
                campoModificarFecha.setText(null);
                campoModificarHoraInicio.setText(null);
                campoModificarHoraFin.setText(null);
                cargarProfesores(campoModificarProfesor);
                cargarSalones(campoModificarSalon);
                cargarCursos(campoModificarCurso);

                pantallaModificar.setVisible(true);
                break;

            case "eliminarSesion":
                cargarSesiones(campoEliminarID);
                campoEliminarFecha.setText(null);
                campoEliminarFecha.setEditable(false);

                campoEliminarHoraInicio.setText(null);
                campoEliminarHoraInicio.setEditable(false);

                campoEliminarHoraFin.setText(null);
                campoEliminarHoraFin.setEditable(false);

                campoEliminarProfesor.setText(null);
                campoEliminarProfesor.setEditable(false);

                campoEliminarSalon.setText(null);
                campoEliminarSalon.setEditable(false);

                campoEliminarCurso.setText(null);
                campoEliminarCurso.setEditable(false);

                pantallaEliminar.setVisible(true);
                break;

            case "filtarFecha":
                prepararModeloLista(campoSesionesPorFecha);
                campoSesionPorFecha.setText(null);

                pantallaSesionesPorFecha.setVisible(true);

            case "filtrarClase":
                cargarCursos(campoSesionPorCurso);
                prepararModeloLista(campoSesionesPorFecha);

                pantallaSesionesPorCurso.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaRegistrar = new javax.swing.JPanel();
        tituloRegistrarID = new javax.swing.JLabel();
        tituloRegistrarFecha = new javax.swing.JLabel();
        tituloRegistrarHoraInicio = new javax.swing.JLabel();
        tituloRegistrarHoraFin = new javax.swing.JLabel();
        tituloRegistrarProfesor = new javax.swing.JLabel();
        tituloRegistrarSalon = new javax.swing.JLabel();
        tituloRegistrarCurso = new javax.swing.JLabel();
        campoRegistrarID = new javax.swing.JTextField();
        campoRegistrarFecha = new javax.swing.JTextField();
        campoRegistrarHoraInicio = new javax.swing.JTextField();
        campoRegistrarHoraFin = new javax.swing.JTextField();
        campoRegistrarProfesor = new javax.swing.JComboBox<>();
        campoRegistrarSalon = new javax.swing.JComboBox<>();
        campoRegistrarCurso = new javax.swing.JComboBox<>();
        botonRegistrarSesion = new javax.swing.JButton();
        botonCerrarRegistro = new javax.swing.JButton();
        pantallaVisualizar = new javax.swing.JPanel();
        tituloVisualizarID = new javax.swing.JLabel();
        tituloVisualizarFecha = new javax.swing.JLabel();
        tituloVisualizarHoraInicio = new javax.swing.JLabel();
        tituloVisualizarHoraFin = new javax.swing.JLabel();
        tituloVisualizarProfesor = new javax.swing.JLabel();
        tituloVisualizarSalon = new javax.swing.JLabel();
        tituloVisualizarCurso = new javax.swing.JLabel();
        botonCargarVisualizacion = new javax.swing.JButton();
        campoVisualizarID = new javax.swing.JComboBox<>();
        campoVisualizarFecha = new javax.swing.JTextField();
        campoVisualizarHoraInicio = new javax.swing.JTextField();
        campoVisualizarHoraFin = new javax.swing.JTextField();
        campoVisualizarProfesor = new javax.swing.JTextField();
        campoVisualizarSalon = new javax.swing.JTextField();
        campoVisualizarCurso = new javax.swing.JTextField();
        botonCerrarVisualizacion = new javax.swing.JButton();
        pantallaModificar = new javax.swing.JPanel();
        tituloModificarID = new javax.swing.JLabel();
        tituloModificarFecha = new javax.swing.JLabel();
        tituloModificarHoraInicio = new javax.swing.JLabel();
        tituloModificarHoraFin = new javax.swing.JLabel();
        tituloModificarProfesor = new javax.swing.JLabel();
        tituloModificarSalon = new javax.swing.JLabel();
        tituloModificarCurso = new javax.swing.JLabel();
        botonCargarModificacion = new javax.swing.JButton();
        campoModificarID = new javax.swing.JComboBox<>();
        campoModificarFecha = new javax.swing.JTextField();
        campoModificarHoraInicio = new javax.swing.JTextField();
        campoModificarProfesor = new javax.swing.JComboBox<>();
        campoModificarSalon = new javax.swing.JComboBox<>();
        campoModificarCurso = new javax.swing.JComboBox<>();
        botonModificarSesion = new javax.swing.JButton();
        botonCerrarModificacion = new javax.swing.JButton();
        campoModificarHoraFin = new javax.swing.JTextField();
        pantallaEliminar = new javax.swing.JPanel();
        tituloEliminarID = new javax.swing.JLabel();
        tituloEliminarFecha = new javax.swing.JLabel();
        tituloEliminarHoraInicio = new javax.swing.JLabel();
        tituloEliminarHoraFin = new javax.swing.JLabel();
        tituloEliminarProfesor = new javax.swing.JLabel();
        tituloEliminarSalon = new javax.swing.JLabel();
        tituloEliminarCurso = new javax.swing.JLabel();
        botonCargarEliminacion = new javax.swing.JButton();
        campoEliminarID = new javax.swing.JComboBox<>();
        campoEliminarFecha = new javax.swing.JTextField();
        campoEliminarHoraInicio = new javax.swing.JTextField();
        campoEliminarHoraFin = new javax.swing.JTextField();
        campoEliminarProfesor = new javax.swing.JTextField();
        campoEliminarSalon = new javax.swing.JTextField();
        campoEliminarCurso = new javax.swing.JTextField();
        botonCerrarEliminacion = new javax.swing.JButton();
        botonEliminarAlumno = new javax.swing.JButton();
        pantallaSesionesPorFecha = new javax.swing.JPanel();
        tituloSesionesPorFecha = new javax.swing.JLabel();
        botonCargarSesionesPorFecha = new javax.swing.JButton();
        campoSesionPorFecha = new javax.swing.JTextField();
        capsulaSesionesDictadas = new javax.swing.JScrollPane();
        campoSesionesPorFecha = new javax.swing.JList<>();
        botonCerrarSesionesDictadas = new javax.swing.JButton();
        pantallaSesionesPorCurso = new javax.swing.JPanel();
        capsulaSesionesPorCurso = new javax.swing.JScrollPane();
        campoSesionesPorCurso = new javax.swing.JList<>();
        botonCerrarSesionesPorCurso = new javax.swing.JButton();
        tituloSesionPorCurso = new javax.swing.JLabel();
        campoSesionPorCurso = new javax.swing.JComboBox<>();
        botonCargarSesionesPorCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion - Mis primeros brincos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(453, 411));
        setMinimumSize(new java.awt.Dimension(453, 411));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pantallaRegistrar.setMaximumSize(new java.awt.Dimension(453, 373));
        pantallaRegistrar.setMinimumSize(new java.awt.Dimension(453, 373));
        pantallaRegistrar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloRegistrarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarID.setText("ID de la sesión");

        tituloRegistrarFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarFecha.setText("Fecha (yyyy-MM-dd)");

        tituloRegistrarHoraInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarHoraInicio.setText("Hora a la que empieza");

        tituloRegistrarHoraFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarHoraFin.setText("Hora en la que finaliza");

        tituloRegistrarProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarProfesor.setText("Cedula del profesor a cargo");

        tituloRegistrarSalon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarSalon.setText("ID del salon");

        tituloRegistrarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarCurso.setText("ID del curso");

        botonRegistrarSesion.setText("Registrar datos de sesión");
        botonRegistrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarSesionActionPerformed(evt);
            }
        });

        botonCerrarRegistro.setText("Regresar");
        botonCerrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaRegistrarLayout = new javax.swing.GroupLayout(pantallaRegistrar);
        pantallaRegistrar.setLayout(pantallaRegistrarLayout);
        pantallaRegistrarLayout.setHorizontalGroup(
                pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaRegistrarLayout.createSequentialGroup()
                                .addContainerGap(72, Short.MAX_VALUE)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                                        .addComponent(tituloRegistrarProfesor)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(campoRegistrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                                        .addComponent(tituloRegistrarID)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(campoRegistrarID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                                        .addComponent(botonRegistrarSesion)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(botonCerrarRegistro))
                                                .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                                        .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(tituloRegistrarHoraInicio)
                                                                .addComponent(tituloRegistrarHoraFin)
                                                                .addComponent(tituloRegistrarFecha))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(campoRegistrarHoraInicio)
                                                                .addComponent(campoRegistrarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(campoRegistrarHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                                                .addComponent(tituloRegistrarCurso)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(campoRegistrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                                                .addComponent(tituloRegistrarSalon)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(campoRegistrarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(13, 13, 13))
        );
        pantallaRegistrarLayout.setVerticalGroup(
                pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaRegistrarLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoRegistrarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloRegistrarID))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoRegistrarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloRegistrarFecha))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoRegistrarHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloRegistrarHoraInicio))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tituloRegistrarHoraFin)
                                        .addComponent(campoRegistrarHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tituloRegistrarProfesor)
                                        .addComponent(campoRegistrarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tituloRegistrarSalon)
                                        .addComponent(campoRegistrarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoRegistrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloRegistrarCurso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonCerrarRegistro)
                                        .addComponent(botonRegistrarSesion))
                                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaRegistrar, "card4");

        pantallaVisualizar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloVisualizarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarID.setText("ID de la sesion");

        tituloVisualizarFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarFecha.setText("Fecha (yyyy-MM-dd)");

        tituloVisualizarHoraInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarHoraInicio.setText("Hora a la que empieza");

        tituloVisualizarHoraFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarHoraFin.setText("Hora en la que finaliza");

        tituloVisualizarProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarProfesor.setText("Cedula del profesor a cargo");

        tituloVisualizarSalon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarSalon.setText("ID del salon");

        tituloVisualizarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarCurso.setText("ID del curso");

        botonCargarVisualizacion.setText("Cargar");
        botonCargarVisualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarVisualizacionActionPerformed(evt);
            }
        });

        botonCerrarVisualizacion.setText("Regresar");
        botonCerrarVisualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarVisualizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaVisualizarLayout = new javax.swing.GroupLayout(pantallaVisualizar);
        pantallaVisualizar.setLayout(pantallaVisualizarLayout);
        pantallaVisualizarLayout.setHorizontalGroup(
                pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaVisualizarLayout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                                .addComponent(tituloVisualizarProfesor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoVisualizarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                                .addComponent(tituloVisualizarHoraFin)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoVisualizarHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                                .addComponent(tituloVisualizarSalon)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoVisualizarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                                .addComponent(tituloVisualizarCurso)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoVisualizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tituloVisualizarFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tituloVisualizarID, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tituloVisualizarHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                                                .addComponent(campoVisualizarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(botonCargarVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(campoVisualizarHoraInicio)
                                                        .addComponent(campoVisualizarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(botonCerrarVisualizacion))
                                .addGap(13, 13, 13))
        );
        pantallaVisualizarLayout.setVerticalGroup(
                pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaVisualizarLayout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoVisualizarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloVisualizarID)
                                        .addComponent(botonCargarVisualizacion))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoVisualizarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloVisualizarFecha))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoVisualizarHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloVisualizarHoraInicio))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoVisualizarHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloVisualizarHoraFin))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoVisualizarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloVisualizarProfesor))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoVisualizarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloVisualizarSalon))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoVisualizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloVisualizarCurso))
                                .addGap(37, 37, 37)
                                .addComponent(botonCerrarVisualizacion)
                                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaVisualizar, "card4");

        pantallaModificar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloModificarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarID.setText("ID de la sesión");

        tituloModificarFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarFecha.setText("Fecha (yyyy-MM-dd)");

        tituloModificarHoraInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarHoraInicio.setText("Hora a la que empieza");

        tituloModificarHoraFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarHoraFin.setText("Hora en la que finaliza");

        tituloModificarProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarProfesor.setText("Cedula del profesor a cargo");

        tituloModificarSalon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarSalon.setText("ID del salon");

        tituloModificarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarCurso.setText("ID del curso");

        botonCargarModificacion.setText("Cargar");
        botonCargarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarModificacionActionPerformed(evt);
            }
        });

        botonModificarSesion.setText("Guardar cambios");
        botonModificarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarSesionActionPerformed(evt);
            }
        });

        botonCerrarModificacion.setText("Regresar");
        botonCerrarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarModificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaModificarLayout = new javax.swing.GroupLayout(pantallaModificar);
        pantallaModificar.setLayout(pantallaModificarLayout);
        pantallaModificarLayout.setHorizontalGroup(
                pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaModificarLayout.createSequentialGroup()
                                .addContainerGap(73, Short.MAX_VALUE)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pantallaModificarLayout.createSequentialGroup()
                                                .addComponent(tituloModificarProfesor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoModificarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pantallaModificarLayout.createSequentialGroup()
                                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tituloModificarHoraFin, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tituloModificarFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tituloModificarID, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tituloModificarHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(pantallaModificarLayout.createSequentialGroup()
                                                                .addComponent(campoModificarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(botonCargarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(campoModificarHoraInicio)
                                                        .addComponent(campoModificarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(campoModificarHoraFin)))
                                        .addGroup(pantallaModificarLayout.createSequentialGroup()
                                                .addComponent(botonModificarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(botonCerrarModificacion))
                                        .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pantallaModificarLayout.createSequentialGroup()
                                                        .addComponent(tituloModificarCurso)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(campoModificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(pantallaModificarLayout.createSequentialGroup()
                                                        .addComponent(tituloModificarSalon)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(campoModificarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(13, 13, 13))
        );
        pantallaModificarLayout.setVerticalGroup(
                pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaModificarLayout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoModificarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloModificarID)
                                        .addComponent(botonCargarModificacion))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoModificarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloModificarFecha))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoModificarHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloModificarHoraInicio))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tituloModificarHoraFin)
                                        .addComponent(campoModificarHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tituloModificarProfesor)
                                        .addComponent(campoModificarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoModificarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloModificarSalon))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoModificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloModificarCurso))
                                .addGap(37, 37, 37)
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonCerrarModificacion)
                                        .addComponent(botonModificarSesion))
                                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaModificar, "card4");

        pantallaEliminar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloEliminarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarID.setText("ID de la sesión");

        tituloEliminarFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarFecha.setText("Fecha (yyyy-MM-dd)");

        tituloEliminarHoraInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarHoraInicio.setText("Hora a la que empieza");

        tituloEliminarHoraFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarHoraFin.setText("Hora en la que finaliza");

        tituloEliminarProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarProfesor.setText("Cedula del profesor a cargo");

        tituloEliminarSalon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarSalon.setText("ID del salon");

        tituloEliminarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarCurso.setText("ID del curso");

        botonCargarEliminacion.setText("Cargar");
        botonCargarEliminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarEliminacionActionPerformed(evt);
            }
        });

        botonCerrarEliminacion.setText("Regresar");
        botonCerrarEliminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarEliminacionActionPerformed(evt);
            }
        });

        botonEliminarAlumno.setText("Eliminar profesor");
        botonEliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaEliminarLayout = new javax.swing.GroupLayout(pantallaEliminar);
        pantallaEliminar.setLayout(pantallaEliminarLayout);
        pantallaEliminarLayout.setHorizontalGroup(
                pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                                                .addGap(0, 73, Short.MAX_VALUE)
                                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                                                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tituloEliminarHoraFin, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tituloEliminarFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tituloEliminarID, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(tituloEliminarHoraInicio, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(pantallaEliminarLayout.createSequentialGroup()
                                                                                .addComponent(campoEliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(botonCargarEliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(campoEliminarHoraInicio)
                                                                        .addComponent(campoEliminarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(campoEliminarHoraFin)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                                                                .addComponent(tituloEliminarProfesor)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(campoEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                                                                .addComponent(botonEliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(botonCerrarEliminacion))))
                                        .addGroup(pantallaEliminarLayout.createSequentialGroup()
                                                .addGap(156, 156, 156)
                                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tituloEliminarSalon)
                                                        .addComponent(tituloEliminarCurso))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(campoEliminarSalon)
                                                        .addComponent(campoEliminarCurso))))
                                .addGap(13, 13, 13))
        );
        pantallaEliminarLayout.setVerticalGroup(
                pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                                .addContainerGap(40, Short.MAX_VALUE)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoEliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloEliminarID)
                                        .addComponent(botonCargarEliminacion))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoEliminarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloEliminarFecha))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoEliminarHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloEliminarHoraInicio))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tituloEliminarHoraFin)
                                        .addComponent(campoEliminarHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloEliminarProfesor))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloEliminarSalon))
                                .addGap(15, 15, 15)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tituloEliminarCurso)
                                        .addComponent(campoEliminarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonCerrarEliminacion)
                                        .addComponent(botonEliminarAlumno))
                                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaEliminar, "card4");

        pantallaSesionesPorFecha.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaSesionesPorFecha.setMinimumSize(new java.awt.Dimension(300, 300));

        tituloSesionesPorFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloSesionesPorFecha.setText("Fecha (yyyy-MM-dd)");

        botonCargarSesionesPorFecha.setText("Cargar");
        botonCargarSesionesPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarSesionesPorFechaActionPerformed(evt);
            }
        });

        capsulaSesionesDictadas.setViewportView(campoSesionesPorFecha);

        botonCerrarSesionesDictadas.setText("Regresar");
        botonCerrarSesionesDictadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionesDictadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaSesionesPorFechaLayout = new javax.swing.GroupLayout(pantallaSesionesPorFecha);
        pantallaSesionesPorFecha.setLayout(pantallaSesionesPorFechaLayout);
        pantallaSesionesPorFechaLayout.setHorizontalGroup(
                pantallaSesionesPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaSesionesPorFechaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(pantallaSesionesPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaSesionesPorFechaLayout.createSequentialGroup()
                                                .addComponent(tituloSesionesPorFecha)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoSesionPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(botonCargarSesionesPorFecha))
                                        .addGroup(pantallaSesionesPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(botonCerrarSesionesDictadas)
                                                .addComponent(capsulaSesionesDictadas, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        pantallaSesionesPorFechaLayout.setVerticalGroup(
                pantallaSesionesPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaSesionesPorFechaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pantallaSesionesPorFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoSesionPorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloSesionesPorFecha)
                                        .addComponent(botonCargarSesionesPorFecha))
                                .addGap(18, 18, 18)
                                .addComponent(capsulaSesionesDictadas, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botonCerrarSesionesDictadas)
                                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaSesionesPorFecha, "card4");

        pantallaSesionesPorCurso.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaSesionesPorCurso.setMinimumSize(new java.awt.Dimension(300, 300));

        capsulaSesionesPorCurso.setViewportView(campoSesionesPorCurso);

        botonCerrarSesionesPorCurso.setText("Regresar");
        botonCerrarSesionesPorCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionesPorCursoActionPerformed(evt);
            }
        });

        tituloSesionPorCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloSesionPorCurso.setText("ID del curso");

        botonCargarSesionesPorCurso.setText("Cargar");
        botonCargarSesionesPorCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarSesionesPorCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaSesionesPorCursoLayout = new javax.swing.GroupLayout(pantallaSesionesPorCurso);
        pantallaSesionesPorCurso.setLayout(pantallaSesionesPorCursoLayout);
        pantallaSesionesPorCursoLayout.setHorizontalGroup(
                pantallaSesionesPorCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaSesionesPorCursoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(pantallaSesionesPorCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pantallaSesionesPorCursoLayout.createSequentialGroup()
                                                .addComponent(tituloSesionPorCurso)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoSesionPorCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(botonCargarSesionesPorCurso))
                                        .addComponent(botonCerrarSesionesPorCurso)
                                        .addComponent(capsulaSesionesPorCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        pantallaSesionesPorCursoLayout.setVerticalGroup(
                pantallaSesionesPorCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pantallaSesionesPorCursoLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pantallaSesionesPorCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoSesionPorCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tituloSesionPorCurso)
                                        .addComponent(botonCargarSesionesPorCurso))
                                .addGap(18, 18, 18)
                                .addComponent(capsulaSesionesPorCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botonCerrarSesionesPorCurso)
                                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaSesionesPorCurso, "card4");

        setSize(new java.awt.Dimension(469, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botonRegistrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarSesionActionPerformed
        boolean camposIncompletos
                = determinarCampoVacio(campoRegistrarID)
                || determinarCampoVacio(campoRegistrarFecha)
                || determinarCampoVacio(campoRegistrarHoraInicio)
                || determinarCampoVacio(campoRegistrarHoraFin);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            Sesion sesion = new Sesion(
                    campoRegistrarID.getText(),
                    campoRegistrarFecha.getText(),
                    campoRegistrarHoraInicio.getText(),
                    campoRegistrarHoraFin.getText(),
                    String.valueOf(campoRegistrarProfesor.getSelectedItem()),
                    String.valueOf(campoRegistrarSalon.getSelectedItem()),
                    String.valueOf(campoRegistrarCurso.getSelectedItem())
            );
            sesiones.registrarSesion(sesion);

            mensajePantalla(conexion.getMensajeInformativo());
            this.dispose();
        }
    }//GEN-LAST:event_botonRegistrarSesionActionPerformed

    private void botonCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarRegistroActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarRegistroActionPerformed

    private void botonCargarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarVisualizacionActionPerformed
        String sesionSeleccionada = String.valueOf(campoVisualizarID.getSelectedItem());

        for (Sesion sesion : listaSesiones) {
            if (sesion.getId().equals(sesionSeleccionada) == true) {
                campoVisualizarFecha.setText(sesion.getFecha());
                campoVisualizarHoraInicio.setText(sesion.getHoraInicio());
                campoVisualizarHoraFin.setText(sesion.getHoraFinal());
                campoVisualizarProfesor.setText(sesion.getCedulaProfesor());
                campoVisualizarSalon.setText(sesion.getIdSalon());
                campoVisualizarCurso.setText(sesion.getIdCurso());
            }
        }
    }//GEN-LAST:event_botonCargarVisualizacionActionPerformed

    private void botonCerrarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVisualizacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarVisualizacionActionPerformed

    private void botonCargarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarModificacionActionPerformed
        String sesionSeleccionada = String.valueOf(campoModificarID.getSelectedItem());
        cargarProfesores(campoModificarProfesor);
        cargarSalones(campoModificarSalon);
        cargarCursos(campoModificarCurso);

        for (Sesion sesion : listaSesiones) {
            if (sesion.getId().equals(sesionSeleccionada) == true) {
                campoModificarFecha.setText(sesion.getFecha());
                campoModificarHoraInicio.setText(sesion.getHoraInicio());
                campoModificarHoraFin.setText(sesion.getHoraFinal());
                campoModificarProfesor.setSelectedItem(sesion.getCedulaProfesor());
                campoModificarSalon.setSelectedItem(sesion.getIdSalon());
                campoModificarCurso.setSelectedItem(sesion.getIdCurso());
            }
        }
    }//GEN-LAST:event_botonCargarModificacionActionPerformed

    private void botonModificarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarSesionActionPerformed
        String sesionSeleccionada = String.valueOf(campoModificarID.getSelectedItem());

        for (Sesion sesion : listaSesiones) {
            if (sesion.getId().equals(sesionSeleccionada) == true) {
                sesion.setFecha(campoModificarFecha.getText());
                sesion.setHoraInicio(campoModificarHoraInicio.getText());
                sesion.setHoraFinal(campoModificarHoraFin.getText());
                sesion.setCedulaProfesor(String.valueOf(campoModificarProfesor.getSelectedItem()));
                sesion.setIdSalon(String.valueOf(campoModificarProfesor.getSelectedItem()));
                sesion.setIdCurso(String.valueOf(campoModificarProfesor.getSelectedItem()));

                sesiones.modificarSesion(sesion);
                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonModificarSesionActionPerformed

    private void botonCerrarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarModificacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarModificacionActionPerformed

    private void botonCargarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarEliminacionActionPerformed
        String sesionSeleccionada = String.valueOf(campoEliminarID.getSelectedItem());

        for (Sesion sesion : listaSesiones) {
            if (sesion.getId().equals(sesionSeleccionada) == true) {
                campoEliminarFecha.setText(sesion.getFecha());
                campoEliminarHoraInicio.setText(sesion.getHoraInicio());
                campoEliminarHoraFin.setText(sesion.getHoraFinal());
                campoEliminarProfesor.setText(sesion.getCedulaProfesor());
                campoEliminarSalon.setText(sesion.getIdSalon());
                campoEliminarCurso.setText(sesion.getIdCurso());
            }
        }
    }//GEN-LAST:event_botonCargarEliminacionActionPerformed

    private void botonEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAlumnoActionPerformed
        String sesionSeleccionada = String.valueOf(campoEliminarID.getSelectedItem());

        for (Sesion sesion : listaSesiones) {
            if (sesion.getId().equals(sesionSeleccionada) == true) {
                sesion.setFecha(campoEliminarFecha.getText());
                sesion.setHoraInicio(campoEliminarHoraInicio.getText());
                sesion.setHoraFinal(campoEliminarHoraFin.getText());
                sesion.setCedulaProfesor(campoEliminarProfesor.getText());
                sesion.setIdSalon(campoEliminarProfesor.getText());
                sesion.setIdCurso(campoEliminarProfesor.getText());

                sesiones.eliminarSesion(sesion);
                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonEliminarAlumnoActionPerformed

    private void botonCerrarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarEliminacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarEliminacionActionPerformed

    private void botonCerrarSesionesDictadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionesDictadasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionesDictadasActionPerformed

    private void botonCargarSesionesPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarSesionesPorFechaActionPerformed
        prepararModeloLista(campoSesionesPorFecha);

        boolean camposIncompletos
                = determinarCampoVacio(campoSesionPorFecha);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            String fecha = campoSesionPorFecha.getText();
            ArrayList<String> sesionesDictadas = sesiones.verSesionesPorFecha(fecha);
            int cantidadSesiones = sesionesDictadas.size();

            if (cantidadSesiones == 0) {
                modeloLista.addElement("No han dictado sesiónes en esa fecha.");
            } else {
                modeloLista.addElement("Se dictaron " + cantidadSesiones + " sesión(es) el " + fecha + ".\n");

                for (String sesion : sesionesDictadas) {
                    modeloLista.addElement("ID de la sesión: " + sesion);
                }
            }
        }
    }//GEN-LAST:event_botonCargarSesionesPorFechaActionPerformed

    private void botonCerrarSesionesPorCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionesPorCursoActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionesPorCursoActionPerformed

    private void botonCargarSesionesPorCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarSesionesPorCursoActionPerformed
        String cursoSeleccionado = String.valueOf(campoSesionPorCurso.getSelectedItem());
        prepararModeloLista(campoSesionesPorCurso);

        for (Curso curso : listaCursos) {
            if (curso.getId().equals(cursoSeleccionado) == true) {
                ArrayList<String> sesionesPorCurso = sesiones.verSesionesPorCurso(curso);
                int cantidadSesiones = sesionesPorCurso.size();

                if (cantidadSesiones == 0) {
                    modeloLista.addElement("No tiene sesiónes programadas actualmente.");
                } else {
                    modeloLista.addElement(curso.getId() + " cuenta con " + cantidadSesiones + " sesión(es).\n");
                    for (String sesion : sesionesPorCurso) {
                        modeloLista.addElement("ID de la sesión: " + sesion);
                    }
                }
            }
        }
    }//GEN-LAST:event_botonCargarSesionesPorCursoActionPerformed

    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(PantallaSesiones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaSesiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarEliminacion;
    private javax.swing.JButton botonCargarModificacion;
    private javax.swing.JButton botonCargarSesionesPorCurso;
    private javax.swing.JButton botonCargarSesionesPorFecha;
    private javax.swing.JButton botonCargarVisualizacion;
    private javax.swing.JButton botonCerrarEliminacion;
    private javax.swing.JButton botonCerrarModificacion;
    private javax.swing.JButton botonCerrarRegistro;
    private javax.swing.JButton botonCerrarSesionesDictadas;
    private javax.swing.JButton botonCerrarSesionesPorCurso;
    private javax.swing.JButton botonCerrarVisualizacion;
    private javax.swing.JButton botonEliminarAlumno;
    private javax.swing.JButton botonModificarSesion;
    private javax.swing.JButton botonRegistrarSesion;
    private javax.swing.JTextField campoEliminarCurso;
    private javax.swing.JTextField campoEliminarFecha;
    private javax.swing.JTextField campoEliminarHoraFin;
    private javax.swing.JTextField campoEliminarHoraInicio;
    private javax.swing.JComboBox<String> campoEliminarID;
    private javax.swing.JTextField campoEliminarProfesor;
    private javax.swing.JTextField campoEliminarSalon;
    private javax.swing.JComboBox<String> campoModificarCurso;
    private javax.swing.JTextField campoModificarFecha;
    private javax.swing.JTextField campoModificarHoraFin;
    private javax.swing.JTextField campoModificarHoraInicio;
    private javax.swing.JComboBox<String> campoModificarID;
    private javax.swing.JComboBox<String> campoModificarProfesor;
    private javax.swing.JComboBox<String> campoModificarSalon;
    private javax.swing.JComboBox<String> campoRegistrarCurso;
    private javax.swing.JTextField campoRegistrarFecha;
    private javax.swing.JTextField campoRegistrarHoraFin;
    private javax.swing.JTextField campoRegistrarHoraInicio;
    private javax.swing.JTextField campoRegistrarID;
    private javax.swing.JComboBox<String> campoRegistrarProfesor;
    private javax.swing.JComboBox<String> campoRegistrarSalon;
    private javax.swing.JComboBox<String> campoSesionPorCurso;
    private javax.swing.JTextField campoSesionPorFecha;
    private javax.swing.JList<String> campoSesionesPorCurso;
    private javax.swing.JList<String> campoSesionesPorFecha;
    private javax.swing.JTextField campoVisualizarCurso;
    private javax.swing.JTextField campoVisualizarFecha;
    private javax.swing.JTextField campoVisualizarHoraFin;
    private javax.swing.JTextField campoVisualizarHoraInicio;
    private javax.swing.JComboBox<String> campoVisualizarID;
    private javax.swing.JTextField campoVisualizarProfesor;
    private javax.swing.JTextField campoVisualizarSalon;
    private javax.swing.JScrollPane capsulaSesionesDictadas;
    private javax.swing.JScrollPane capsulaSesionesPorCurso;
    private javax.swing.JPanel pantallaEliminar;
    private javax.swing.JPanel pantallaModificar;
    private javax.swing.JPanel pantallaRegistrar;
    private javax.swing.JPanel pantallaSesionesPorCurso;
    private javax.swing.JPanel pantallaSesionesPorFecha;
    private javax.swing.JPanel pantallaVisualizar;
    private javax.swing.JLabel tituloEliminarCurso;
    private javax.swing.JLabel tituloEliminarFecha;
    private javax.swing.JLabel tituloEliminarHoraFin;
    private javax.swing.JLabel tituloEliminarHoraInicio;
    private javax.swing.JLabel tituloEliminarID;
    private javax.swing.JLabel tituloEliminarProfesor;
    private javax.swing.JLabel tituloEliminarSalon;
    private javax.swing.JLabel tituloModificarCurso;
    private javax.swing.JLabel tituloModificarFecha;
    private javax.swing.JLabel tituloModificarHoraFin;
    private javax.swing.JLabel tituloModificarHoraInicio;
    private javax.swing.JLabel tituloModificarID;
    private javax.swing.JLabel tituloModificarProfesor;
    private javax.swing.JLabel tituloModificarSalon;
    private javax.swing.JLabel tituloRegistrarCurso;
    private javax.swing.JLabel tituloRegistrarFecha;
    private javax.swing.JLabel tituloRegistrarHoraFin;
    private javax.swing.JLabel tituloRegistrarHoraInicio;
    private javax.swing.JLabel tituloRegistrarID;
    private javax.swing.JLabel tituloRegistrarProfesor;
    private javax.swing.JLabel tituloRegistrarSalon;
    private javax.swing.JLabel tituloSesionPorCurso;
    private javax.swing.JLabel tituloSesionesPorFecha;
    private javax.swing.JLabel tituloVisualizarCurso;
    private javax.swing.JLabel tituloVisualizarFecha;
    private javax.swing.JLabel tituloVisualizarHoraFin;
    private javax.swing.JLabel tituloVisualizarHoraInicio;
    private javax.swing.JLabel tituloVisualizarID;
    private javax.swing.JLabel tituloVisualizarProfesor;
    private javax.swing.JLabel tituloVisualizarSalon;
    // End of variables declaration//GEN-END:variables
}
