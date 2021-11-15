package com.frontend;

import com.backend.Alumno;
import com.backend.ConexionSQL;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;

public class PantallaAlumnos extends javax.swing.JFrame {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private Alumno alumnos = new Alumno();
    private ConexionSQL conexion = new ConexionSQL();
    private VentanasEmergentes ventanaEmergente = new VentanasEmergentes();

    public PantallaAlumnos() {
        initComponents();
    }

    public void definirConexion(ConexionSQL conexion) {
        this.conexion = conexion;
        alumnos.setConexion(conexion);
    }

    private void mensajePantalla(String ventana) {
        ventanaEmergente.setVisible(true);
        ventanaEmergente.ventanaRequerida(ventana);
    }

    private void añadirCedulas(javax.swing.JComboBox<String> comboBox) {
        listaAlumnos = alumnos.obtenerAlumnos();
        comboBox.removeAllItems();

        listaAlumnos.forEach(alumno -> {
            comboBox.addItem(alumno.getCedula());
        });
    }

    private void cargarGeneros(javax.swing.JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("Otro");
        comboBox.addItem("Hombre");
        comboBox.addItem("Mujer");
    }

    private boolean determinarCampoVacio(javax.swing.JTextField campo) {
        if (campo.getText().equals("") == true) {
            return true;
        }
        return false;
    }

    public void pantallaRequerida(String barraRequerida) {
        pantallaRegistrar.setVisible(false);
        pantallaVisualizar.setVisible(false);
        pantallaModificar.setVisible(false);
        pantallaEliminar.setVisible(false);

        switch (barraRequerida) {
            case "ingresarDatos":
                campoRegistrarNombre.setText(null);
                campoRegistrarCedula.setText(null);
                campoRegistrarFechaNacimiento.setText(null);
                campoRegistrarGenero.addItem("Seleccione una opcion");
                cargarGeneros(campoRegistrarGenero);

                pantallaRegistrar.setVisible(true);
                break;

            case "verDatos":
                añadirCedulas(campoVisualizarCedula);
                campoVisualizarNombre.setText(null);
                campoVisualizarNombre.setEditable(false);

                campoVisualizarFechaNacimiento.setText(null);
                campoVisualizarFechaNacimiento.setEditable(false);

                campoVisualizarGenero.setText(null);
                campoVisualizarGenero.setEditable(false);

                pantallaVisualizar.setVisible(true);
                break;

            case "modificarDatos":
                añadirCedulas(campoModificarCedula);
                campoModificarNombre.setText(null);
                campoModificarFechaNacimiento.setText(null);
                campoModificarGenero.removeAllItems();

                pantallaModificar.setVisible(true);
                break;

            case "eliminarAlumno":
                añadirCedulas(campoEliminarCedula);
                campoEliminarNombre.setText(null);
                campoEliminarNombre.setEditable(false);

                campoEliminarFechaNacimiento.setText(null);
                campoEliminarFechaNacimiento.setEditable(false);

                campoEliminarGenero.setText(null);
                campoEliminarGenero.setEditable(false);

                pantallaEliminar.setVisible(true);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaRegistrar = new javax.swing.JPanel();
        tituloRegistrarCedula = new javax.swing.JLabel();
        tituloRegistrarNombre = new javax.swing.JLabel();
        tituloRegistrarFechaNacimiento = new javax.swing.JLabel();
        tituloRegistrarGenero = new javax.swing.JLabel();
        campoRegistrarCedula = new javax.swing.JTextField();
        campoRegistrarNombre = new javax.swing.JTextField();
        campoRegistrarFechaNacimiento = new javax.swing.JTextField();
        campoRegistrarGenero = new javax.swing.JComboBox<>();
        botonRegistrarAlumno = new javax.swing.JButton();
        botonCerrarRegistro = new javax.swing.JButton();
        pantallaVisualizar = new javax.swing.JPanel();
        tituloVisualizarCedula = new javax.swing.JLabel();
        tituloVisualizarNombre = new javax.swing.JLabel();
        tituloVisualizarFechaNacimiento = new javax.swing.JLabel();
        tituloVisualizarGenero = new javax.swing.JLabel();
        botonCargarVisualizacion = new javax.swing.JButton();
        campoVisualizarCedula = new javax.swing.JComboBox<>();
        campoVisualizarNombre = new javax.swing.JTextField();
        campoVisualizarFechaNacimiento = new javax.swing.JTextField();
        campoVisualizarGenero = new javax.swing.JTextField();
        botonCerrarVisualizacion = new javax.swing.JButton();
        pantallaModificar = new javax.swing.JPanel();
        tituloModificarCedula = new javax.swing.JLabel();
        tituloModificarNombre = new javax.swing.JLabel();
        tituloModificarFechaNacimiento = new javax.swing.JLabel();
        tituloModificarGenero = new javax.swing.JLabel();
        botonCargarModificacion = new javax.swing.JButton();
        campoModificarCedula = new javax.swing.JComboBox<>();
        campoModificarNombre = new javax.swing.JTextField();
        campoModificarFechaNacimiento = new javax.swing.JTextField();
        campoModificarGenero = new javax.swing.JComboBox<>();
        botonModificarAlumno = new javax.swing.JButton();
        botonCerrarModificacion = new javax.swing.JButton();
        pantallaEliminar = new javax.swing.JPanel();
        tituloEliminarCedula = new javax.swing.JLabel();
        tituloEliminarNombre = new javax.swing.JLabel();
        tituloEliminarFechaNacimiento = new javax.swing.JLabel();
        tituloEliminarGenero = new javax.swing.JLabel();
        botonCargarEliminacion = new javax.swing.JButton();
        campoEliminarCedula = new javax.swing.JComboBox<>();
        campoEliminarNombre = new javax.swing.JTextField();
        campoEliminarFechaNacimiento = new javax.swing.JTextField();
        campoEliminarGenero = new javax.swing.JTextField();
        botonCerrarEliminacion = new javax.swing.JButton();
        botonEliminarAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion - Mis primeros brincos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(453, 411));
        setMinimumSize(new java.awt.Dimension(453, 411));
        setPreferredSize(new java.awt.Dimension(453, 411));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pantallaRegistrar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaRegistrar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaRegistrar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloRegistrarCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarCedula.setText("Documento de identidad");

        tituloRegistrarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarNombre.setText("Nombre del alumno");

        tituloRegistrarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloRegistrarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarGenero.setText("Genero");

        botonRegistrarAlumno.setText("Registrar datos del alumno");
        botonRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarAlumnoActionPerformed(evt);
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
            .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(tituloRegistrarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoRegistrarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(botonRegistrarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarRegistro))
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaRegistrarLayout.createSequentialGroup()
                                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloRegistrarGenero)
                                    .addComponent(tituloRegistrarNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                                .addComponent(tituloRegistrarFechaNacimiento)
                                .addGap(10, 10, 10)))
                        .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoRegistrarFechaNacimiento)
                            .addComponent(campoRegistrarGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoRegistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        pantallaRegistrarLayout.setVerticalGroup(
            pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaRegistrarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarCedula))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarNombre))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarFechaNacimiento))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloRegistrarGenero)
                    .addComponent(campoRegistrarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarRegistro)
                    .addComponent(botonRegistrarAlumno))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaRegistrar, "card4");

        pantallaVisualizar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloVisualizarCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarCedula.setText("Documento de identidad");

        tituloVisualizarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarNombre.setText("Nombre del alumno");

        tituloVisualizarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloVisualizarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarGenero.setText("Genero");

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
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarVisualizacion)
                    .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaVisualizarLayout.createSequentialGroup()
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloVisualizarGenero)
                                    .addComponent(tituloVisualizarNombre)
                                    .addComponent(tituloVisualizarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addComponent(tituloVisualizarFechaNacimiento)
                                .addGap(10, 10, 10)))
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addComponent(campoVisualizarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoVisualizarFechaNacimiento)
                            .addComponent(campoVisualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoVisualizarGenero))))
                .addGap(13, 13, 13))
        );
        pantallaVisualizarLayout.setVerticalGroup(
            pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaVisualizarLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarCedula)
                    .addComponent(botonCargarVisualizacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarNombre))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarFechaNacimiento))
                .addGap(27, 27, 27)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloVisualizarGenero)
                    .addComponent(campoVisualizarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(botonCerrarVisualizacion)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaVisualizar, "card4");

        pantallaModificar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloModificarCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarCedula.setText("Documento de identidad");

        tituloModificarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarNombre.setText("Nombre del alumno");

        tituloModificarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloModificarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarGenero.setText("Genero");

        botonCargarModificacion.setText("Cargar");
        botonCargarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarModificacionActionPerformed(evt);
            }
        });

        botonModificarAlumno.setText("Guardar cambios");
        botonModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarAlumnoActionPerformed(evt);
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
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaModificarLayout.createSequentialGroup()
                        .addComponent(botonModificarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarModificacion))
                    .addGroup(pantallaModificarLayout.createSequentialGroup()
                        .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaModificarLayout.createSequentialGroup()
                                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloModificarGenero)
                                    .addComponent(tituloModificarNombre)
                                    .addComponent(tituloModificarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pantallaModificarLayout.createSequentialGroup()
                                .addComponent(tituloModificarFechaNacimiento)
                                .addGap(10, 10, 10)))
                        .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaModificarLayout.createSequentialGroup()
                                .addComponent(campoModificarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoModificarFechaNacimiento)
                            .addComponent(campoModificarGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoModificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        pantallaModificarLayout.setVerticalGroup(
            pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaModificarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarCedula)
                    .addComponent(botonCargarModificacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarNombre))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarFechaNacimiento))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloModificarGenero)
                    .addComponent(campoModificarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarModificacion)
                    .addComponent(botonModificarAlumno))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaModificar, "card4");

        pantallaEliminar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloEliminarCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarCedula.setText("Documento de identidad");

        tituloEliminarNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarNombre.setText("Nombre del alumno");

        tituloEliminarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloEliminarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarGenero.setText("Genero");

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

        botonEliminarAlumno.setText("Eliminar alumno");
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
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addComponent(botonEliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarEliminacion))
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloEliminarGenero)
                                    .addComponent(tituloEliminarNombre)
                                    .addComponent(tituloEliminarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(pantallaEliminarLayout.createSequentialGroup()
                                .addComponent(tituloEliminarFechaNacimiento)
                                .addGap(10, 10, 10)))
                        .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaEliminarLayout.createSequentialGroup()
                                .addComponent(campoEliminarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarEliminacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoEliminarFechaNacimiento)
                            .addComponent(campoEliminarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEliminarGenero))))
                .addGap(13, 13, 13))
        );
        pantallaEliminarLayout.setVerticalGroup(
            pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarCedula)
                    .addComponent(botonCargarEliminacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarNombre))
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarFechaNacimiento))
                .addGap(27, 27, 27)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloEliminarGenero)
                    .addComponent(campoEliminarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarEliminacion)
                    .addComponent(botonEliminarAlumno))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaEliminar, "card4");

        setSize(new java.awt.Dimension(453, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarRegistroActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarRegistroActionPerformed

    private void botonRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarAlumnoActionPerformed
        boolean camposIncompletos
                = determinarCampoVacio(campoRegistrarCedula)
                || determinarCampoVacio(campoRegistrarNombre)
                || determinarCampoVacio(campoRegistrarFechaNacimiento);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            Alumno alumno = new Alumno(
                    campoRegistrarCedula.getText(),
                    campoRegistrarNombre.getText(),
                    campoRegistrarFechaNacimiento.getText(),
                    String.valueOf(campoRegistrarGenero.getSelectedItem())
            );
            alumnos.registrarAlumno(alumno);

            mensajePantalla(conexion.getMensajeInformativo());
            this.dispose();
        }
    }//GEN-LAST:event_botonRegistrarAlumnoActionPerformed

    private void botonCargarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarVisualizacionActionPerformed
        String cedulaSeleccionada = String.valueOf(campoVisualizarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(cedulaSeleccionada) == true) {
                campoVisualizarNombre.setText(alumno.getNombre());
                campoVisualizarFechaNacimiento.setText(alumno.getFechaNacimiento());
                campoVisualizarGenero.setText(alumno.getGenero());
            }
        }
    }//GEN-LAST:event_botonCargarVisualizacionActionPerformed

    private void botonCerrarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVisualizacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarVisualizacionActionPerformed

    private void botonCargarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarModificacionActionPerformed
        String cedulaSeleccionada = String.valueOf(campoModificarCedula.getSelectedItem());
        cargarGeneros(campoModificarGenero);

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(cedulaSeleccionada) == true) {
                campoModificarNombre.setText(alumno.getNombre());
                campoModificarFechaNacimiento.setText(alumno.getFechaNacimiento());
                campoModificarGenero.setSelectedItem(alumno.getGenero());
            }
        }
    }//GEN-LAST:event_botonCargarModificacionActionPerformed

    private void botonModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarAlumnoActionPerformed
        String cedulaSeleccionada = String.valueOf(campoModificarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(cedulaSeleccionada) == true) {
                alumno.setNombre(campoModificarNombre.getText());
                alumno.setFechaNacimiento(campoModificarFechaNacimiento.getText());
                alumno.setGenero(String.valueOf(campoModificarGenero.getSelectedItem()));
                alumnos.modificarAlumno(alumno);

                mensajePantalla(conexion.getMensajeInformativo());
                this.dispose();
            }
        }
    }//GEN-LAST:event_botonModificarAlumnoActionPerformed

    private void botonCerrarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarModificacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarModificacionActionPerformed

    private void botonCargarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarEliminacionActionPerformed
        String cedulaSeleccionada = String.valueOf(campoEliminarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(cedulaSeleccionada) == true) {
                campoEliminarNombre.setText(alumno.getNombre());
                campoEliminarFechaNacimiento.setText(alumno.getFechaNacimiento());
                campoEliminarGenero.setText(alumno.getGenero());
            }
        }
    }//GEN-LAST:event_botonCargarEliminacionActionPerformed

    private void botonEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAlumnoActionPerformed
        String cedulaSeleccionada = String.valueOf(campoEliminarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(cedulaSeleccionada) == true) {
                alumno.setNombre(campoEliminarNombre.getText());
                alumno.setFechaNacimiento(campoEliminarFechaNacimiento.getText());
                alumno.setGenero(campoEliminarGenero.getText());
                alumnos.eliminarAlumno(alumno);

                mensajePantalla(conexion.getMensajeInformativo());
                this.dispose();
            }
        }
    }//GEN-LAST:event_botonEliminarAlumnoActionPerformed

    private void botonCerrarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarEliminacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarEliminacionActionPerformed

    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(PantallaAlumnos.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAlumnos().setVisible(true);
            }
        });
    }
    // Metodo Principal - Fin

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarEliminacion;
    private javax.swing.JButton botonCargarModificacion;
    private javax.swing.JButton botonCargarVisualizacion;
    private javax.swing.JButton botonCerrarEliminacion;
    private javax.swing.JButton botonCerrarModificacion;
    private javax.swing.JButton botonCerrarRegistro;
    private javax.swing.JButton botonCerrarVisualizacion;
    private javax.swing.JButton botonEliminarAlumno;
    private javax.swing.JButton botonModificarAlumno;
    private javax.swing.JButton botonRegistrarAlumno;
    private javax.swing.JComboBox<String> campoEliminarCedula;
    private javax.swing.JTextField campoEliminarFechaNacimiento;
    private javax.swing.JTextField campoEliminarGenero;
    private javax.swing.JTextField campoEliminarNombre;
    private javax.swing.JComboBox<String> campoModificarCedula;
    private javax.swing.JTextField campoModificarFechaNacimiento;
    private javax.swing.JComboBox<String> campoModificarGenero;
    private javax.swing.JTextField campoModificarNombre;
    private javax.swing.JTextField campoRegistrarCedula;
    private javax.swing.JTextField campoRegistrarFechaNacimiento;
    private javax.swing.JComboBox<String> campoRegistrarGenero;
    private javax.swing.JTextField campoRegistrarNombre;
    private javax.swing.JComboBox<String> campoVisualizarCedula;
    private javax.swing.JTextField campoVisualizarFechaNacimiento;
    private javax.swing.JTextField campoVisualizarGenero;
    private javax.swing.JTextField campoVisualizarNombre;
    private javax.swing.JPanel pantallaEliminar;
    private javax.swing.JPanel pantallaModificar;
    private javax.swing.JPanel pantallaRegistrar;
    private javax.swing.JPanel pantallaVisualizar;
    private javax.swing.JLabel tituloEliminarCedula;
    private javax.swing.JLabel tituloEliminarFechaNacimiento;
    private javax.swing.JLabel tituloEliminarGenero;
    private javax.swing.JLabel tituloEliminarNombre;
    private javax.swing.JLabel tituloModificarCedula;
    private javax.swing.JLabel tituloModificarFechaNacimiento;
    private javax.swing.JLabel tituloModificarGenero;
    private javax.swing.JLabel tituloModificarNombre;
    private javax.swing.JLabel tituloRegistrarCedula;
    private javax.swing.JLabel tituloRegistrarFechaNacimiento;
    private javax.swing.JLabel tituloRegistrarGenero;
    private javax.swing.JLabel tituloRegistrarNombre;
    private javax.swing.JLabel tituloVisualizarCedula;
    private javax.swing.JLabel tituloVisualizarFechaNacimiento;
    private javax.swing.JLabel tituloVisualizarGenero;
    private javax.swing.JLabel tituloVisualizarNombre;
    // End of variables declaration//GEN-END:variables
}
