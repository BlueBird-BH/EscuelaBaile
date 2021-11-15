package com.frontend;

import com.backend.Profesor;
import com.backend.ConexionSQL;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;

public class PantallaProfesores extends javax.swing.JFrame {

    private ArrayList<Profesor> listaProfesores = new ArrayList<>();
    private Profesor profesores = new Profesor();
    private ConexionSQL conexion = new ConexionSQL();
    private VentanasEmergentes ventanaEmergente = new VentanasEmergentes();

    public PantallaProfesores() {
        initComponents();
    }

    public void definirConexion(ConexionSQL conexion) {
        this.conexion = conexion;
        profesores.setConexion(conexion);
    }

    private void mensajePantalla(String ventana) {
        ventanaEmergente.setVisible(true);
        ventanaEmergente.ventanaRequerida(ventana);
    }

    private void añadirCedulas(javax.swing.JComboBox<String> comboBox) {
        listaProfesores = profesores.obtenerProfesores();
        comboBox.removeAllItems();

        listaProfesores.forEach(profesor -> {
            comboBox.addItem(profesor.getCedula());
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
                campoRegistrarSalario.setText(null);

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

                campoVisualizarSalario.setText(null);
                campoVisualizarSalario.setEditable(false);

                pantallaVisualizar.setVisible(true);
                break;

            case "modificarDatos":
                añadirCedulas(campoModificarCedula);
                campoModificarNombre.setText(null);
                campoModificarFechaNacimiento.setText(null);
                campoModificarGenero.removeAllItems();
                campoModificarSalario.setText(null);

                pantallaModificar.setVisible(true);
                break;

            case "eliminarProfesor":
                añadirCedulas(campoEliminarCedula);
                campoEliminarNombre.setText(null);
                campoEliminarNombre.setEditable(false);

                campoEliminarFechaNacimiento.setText(null);
                campoEliminarFechaNacimiento.setEditable(false);

                campoEliminarGenero.setText(null);
                campoEliminarGenero.setEditable(false);

                campoEliminarSalario.setText(null);
                campoEliminarSalario.setEditable(false);

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
        tituloRegistrarSalario = new javax.swing.JLabel();
        campoRegistrarCedula = new javax.swing.JTextField();
        campoRegistrarNombre = new javax.swing.JTextField();
        campoRegistrarFechaNacimiento = new javax.swing.JTextField();
        campoRegistrarGenero = new javax.swing.JComboBox<>();
        campoRegistrarSalario = new javax.swing.JTextField();
        botonRegistrarAlumno = new javax.swing.JButton();
        botonCerrarRegistro = new javax.swing.JButton();
        pantallaVisualizar = new javax.swing.JPanel();
        tituloVisualizarCedula = new javax.swing.JLabel();
        tituloVisualizarNombre = new javax.swing.JLabel();
        tituloVisualizarFechaNacimiento = new javax.swing.JLabel();
        tituloVisualizarGenero = new javax.swing.JLabel();
        tituloVisualizarSalario = new javax.swing.JLabel();
        botonCargarVisualizacion = new javax.swing.JButton();
        campoVisualizarCedula = new javax.swing.JComboBox<>();
        campoVisualizarNombre = new javax.swing.JTextField();
        campoVisualizarFechaNacimiento = new javax.swing.JTextField();
        campoVisualizarGenero = new javax.swing.JTextField();
        campoVisualizarSalario = new javax.swing.JTextField();
        botonCerrarVisualizacion = new javax.swing.JButton();
        pantallaModificar = new javax.swing.JPanel();
        tituloModificarCedula = new javax.swing.JLabel();
        tituloModificarNombre = new javax.swing.JLabel();
        tituloModificarFechaNacimiento = new javax.swing.JLabel();
        tituloModificarGenero = new javax.swing.JLabel();
        tituloModificarSalario = new javax.swing.JLabel();
        botonCargarModificacion = new javax.swing.JButton();
        campoModificarCedula = new javax.swing.JComboBox<>();
        campoModificarNombre = new javax.swing.JTextField();
        campoModificarFechaNacimiento = new javax.swing.JTextField();
        campoModificarGenero = new javax.swing.JComboBox<>();
        campoModificarSalario = new javax.swing.JTextField();
        botonModificarAlumno = new javax.swing.JButton();
        botonCerrarModificacion = new javax.swing.JButton();
        pantallaEliminar = new javax.swing.JPanel();
        tituloEliminarCedula = new javax.swing.JLabel();
        tituloEliminarNombre = new javax.swing.JLabel();
        tituloEliminarFechaNacimiento = new javax.swing.JLabel();
        tituloEliminarGenero = new javax.swing.JLabel();
        tituloEliminarSalario = new javax.swing.JLabel();
        botonCargarEliminacion = new javax.swing.JButton();
        campoEliminarCedula = new javax.swing.JComboBox<>();
        campoEliminarNombre = new javax.swing.JTextField();
        campoEliminarFechaNacimiento = new javax.swing.JTextField();
        campoEliminarGenero = new javax.swing.JTextField();
        campoEliminarSalario = new javax.swing.JTextField();
        botonCerrarEliminacion = new javax.swing.JButton();
        botonEliminarAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion - Mis primeros brincos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
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
        tituloRegistrarNombre.setText("Nombre del profesor");

        tituloRegistrarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloRegistrarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarGenero.setText("Genero");

        tituloRegistrarSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarSalario.setText("Salario");

        botonRegistrarAlumno.setText("Registrar datos del profesor");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaRegistrarLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(tituloRegistrarSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoRegistrarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(80, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarSalario))
                .addGap(41, 41, 41)
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
        tituloVisualizarNombre.setText("Nombre del profesor");

        tituloVisualizarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloVisualizarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarGenero.setText("Genero");

        tituloVisualizarSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarSalario.setText("Salario");

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
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                        .addComponent(tituloVisualizarSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoVisualizarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonCerrarVisualizacion)
                    .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addComponent(tituloVisualizarFechaNacimiento)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaVisualizarLayout.createSequentialGroup()
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloVisualizarNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloVisualizarCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloVisualizarGenero, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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
                .addContainerGap(50, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarGenero))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarSalario))
                .addGap(41, 41, 41)
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
        tituloModificarNombre.setText("Nombre del profesor");

        tituloModificarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloModificarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarGenero.setText("Genero");

        tituloModificarSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarSalario.setText("Salario");

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
                        .addComponent(tituloModificarSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoModificarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(50, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarSalario))
                .addGap(41, 41, 41)
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
        tituloEliminarNombre.setText("Nombre del profesor");

        tituloEliminarFechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarFechaNacimiento.setText("Fecha de nacimiento (yyyy-MM-dd)");

        tituloEliminarGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarGenero.setText("Genero");

        tituloEliminarSalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarSalario.setText("Salario");

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
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addComponent(tituloEliminarSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEliminarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(50, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarSalario))
                .addGap(44, 44, 44)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarEliminacion)
                    .addComponent(botonEliminarAlumno))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaEliminar, "card4");

        setSize(new java.awt.Dimension(453, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botonRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarAlumnoActionPerformed
        boolean camposIncompletos
                = determinarCampoVacio(campoRegistrarCedula)
                || determinarCampoVacio(campoRegistrarNombre)
                || determinarCampoVacio(campoRegistrarFechaNacimiento)
                || determinarCampoVacio(campoRegistrarSalario);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            Profesor profesor = new Profesor(
                    campoRegistrarCedula.getText(),
                    campoRegistrarNombre.getText(),
                    campoRegistrarFechaNacimiento.getText(),
                    String.valueOf(campoRegistrarGenero.getSelectedItem()),
                    campoRegistrarSalario.getText()
            );
            profesores.registrarProfesor(profesor);

            mensajePantalla(conexion.getMensajeInformativo());
            this.dispose();
        }
    }//GEN-LAST:event_botonRegistrarAlumnoActionPerformed

    private void botonCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarRegistroActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarRegistroActionPerformed

    private void botonCargarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarVisualizacionActionPerformed
        String cedulaSeleccionada = String.valueOf(campoVisualizarCedula.getSelectedItem());

        for (Profesor profesor : listaProfesores) {
            if (profesor.getCedula().equals(cedulaSeleccionada) == true) {
                campoVisualizarNombre.setText(profesor.getNombre());
                campoVisualizarFechaNacimiento.setText(profesor.getFechaNacimiento());
                campoVisualizarGenero.setText(profesor.getGenero());
                campoVisualizarSalario.setText(profesor.getSalario());
            }
        }
    }//GEN-LAST:event_botonCargarVisualizacionActionPerformed

    private void botonCerrarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVisualizacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarVisualizacionActionPerformed

    private void botonCargarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarModificacionActionPerformed
        String cedulaSeleccionada = String.valueOf(campoModificarCedula.getSelectedItem());
        cargarGeneros(campoModificarGenero);

        for (Profesor profesor : listaProfesores) {
            if (profesor.getCedula().equals(cedulaSeleccionada) == true) {
                campoModificarNombre.setText(profesor.getNombre());
                campoModificarFechaNacimiento.setText(profesor.getFechaNacimiento());
                campoModificarGenero.setSelectedItem(profesor.getGenero());
                campoModificarSalario.setText(profesor.getSalario());
            }
        }
    }//GEN-LAST:event_botonCargarModificacionActionPerformed

    private void botonModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarAlumnoActionPerformed
        String cedulaSeleccionada = String.valueOf(campoModificarCedula.getSelectedItem());

        for (Profesor profesor : listaProfesores) {
            if (profesor.getCedula().equals(cedulaSeleccionada) == true) {
                profesor.setNombre(campoModificarNombre.getText());
                profesor.setFechaNacimiento(campoModificarFechaNacimiento.getText());
                profesor.setGenero(String.valueOf(campoModificarGenero.getSelectedItem()));
                profesor.setSalario(campoModificarSalario.getText());
                profesores.modificarProfesor(profesor);

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

        for (Profesor profesor : listaProfesores) {
            if (profesor.getCedula().equals(cedulaSeleccionada) == true) {
                campoEliminarNombre.setText(profesor.getNombre());
                campoEliminarFechaNacimiento.setText(profesor.getFechaNacimiento());
                campoEliminarGenero.setText(profesor.getGenero());
                campoEliminarSalario.setText(profesor.getSalario());
            }
        }
    }//GEN-LAST:event_botonCargarEliminacionActionPerformed

    private void botonEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAlumnoActionPerformed
        String cedulaSeleccionada = String.valueOf(campoEliminarCedula.getSelectedItem());

        for (Profesor profesor : listaProfesores) {
            if (profesor.getCedula().equals(cedulaSeleccionada) == true) {
                profesor.setNombre(campoEliminarNombre.getText());
                profesor.setFechaNacimiento(campoEliminarFechaNacimiento.getText());
                profesor.setGenero(campoEliminarGenero.getText());
                profesor.setSalario(campoEliminarSalario.getText());
                profesores.eliminarProfesor(profesor);

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
            java.util.logging.Logger.getLogger(PantallaProfesores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaProfesores().setVisible(true);
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
    private javax.swing.JTextField campoEliminarSalario;
    private javax.swing.JComboBox<String> campoModificarCedula;
    private javax.swing.JTextField campoModificarFechaNacimiento;
    private javax.swing.JComboBox<String> campoModificarGenero;
    private javax.swing.JTextField campoModificarNombre;
    private javax.swing.JTextField campoModificarSalario;
    private javax.swing.JTextField campoRegistrarCedula;
    private javax.swing.JTextField campoRegistrarFechaNacimiento;
    private javax.swing.JComboBox<String> campoRegistrarGenero;
    private javax.swing.JTextField campoRegistrarNombre;
    private javax.swing.JTextField campoRegistrarSalario;
    private javax.swing.JComboBox<String> campoVisualizarCedula;
    private javax.swing.JTextField campoVisualizarFechaNacimiento;
    private javax.swing.JTextField campoVisualizarGenero;
    private javax.swing.JTextField campoVisualizarNombre;
    private javax.swing.JTextField campoVisualizarSalario;
    private javax.swing.JPanel pantallaEliminar;
    private javax.swing.JPanel pantallaModificar;
    private javax.swing.JPanel pantallaRegistrar;
    private javax.swing.JPanel pantallaVisualizar;
    private javax.swing.JLabel tituloEliminarCedula;
    private javax.swing.JLabel tituloEliminarFechaNacimiento;
    private javax.swing.JLabel tituloEliminarGenero;
    private javax.swing.JLabel tituloEliminarNombre;
    private javax.swing.JLabel tituloEliminarSalario;
    private javax.swing.JLabel tituloModificarCedula;
    private javax.swing.JLabel tituloModificarFechaNacimiento;
    private javax.swing.JLabel tituloModificarGenero;
    private javax.swing.JLabel tituloModificarNombre;
    private javax.swing.JLabel tituloModificarSalario;
    private javax.swing.JLabel tituloRegistrarCedula;
    private javax.swing.JLabel tituloRegistrarFechaNacimiento;
    private javax.swing.JLabel tituloRegistrarGenero;
    private javax.swing.JLabel tituloRegistrarNombre;
    private javax.swing.JLabel tituloRegistrarSalario;
    private javax.swing.JLabel tituloVisualizarCedula;
    private javax.swing.JLabel tituloVisualizarFechaNacimiento;
    private javax.swing.JLabel tituloVisualizarGenero;
    private javax.swing.JLabel tituloVisualizarNombre;
    private javax.swing.JLabel tituloVisualizarSalario;
    // End of variables declaration//GEN-END:variables
}
