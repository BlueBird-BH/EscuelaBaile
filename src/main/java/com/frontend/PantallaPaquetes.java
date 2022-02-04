package com.frontend;

import com.backend.Paquete;
import com.backend.Curso;
import com.backend.ConexionSQL;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PantallaPaquetes extends javax.swing.JFrame {

    private ArrayList<Paquete> listaPaquetes = new ArrayList<>();
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    private DefaultListModel modeloLista = new DefaultListModel();
    private Curso cursos = new Curso();
    private Paquete paquetes = new Paquete();

    private ConexionSQL conexion = new ConexionSQL();
    private VentanasEmergentes ventanaEmergente = new VentanasEmergentes();

    public PantallaPaquetes() {
        initComponents();
    }

    public void definirConexion(ConexionSQL conexion) {
        this.conexion = conexion;
        paquetes.setConexion(conexion);
        cursos.setConexion(conexion);
    }

    private void mensajePantalla(String ventana) {
        ventanaEmergente.setVisible(true);
        ventanaEmergente.ventanaRequerida(ventana);
    }

    private void cargarPaquetes(javax.swing.JComboBox<String> comboBox) {
        listaPaquetes = paquetes.obtenerPaquetes();
        comboBox.removeAllItems();

        listaPaquetes.forEach(paquete -> {
            comboBox.addItem(paquete.getId());
        });
    }

    private void cargarCursos(javax.swing.JComboBox<String> comboBox) {
        listaCursos = cursos.obtenerCursos();
        comboBox.removeAllItems();

        listaCursos.forEach(curso -> {
            comboBox.addItem(curso.getId());
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
        pantallaVerVentas.setVisible(false);
        pantallaFiltrarFecha.setVisible(false);
    }

    public void pantallaRequerida(String barraRequerida) {
        ocultarPantallas();

        switch (barraRequerida) {
            case "ingresarDatos":
                campoRegistrarCantidadSesiones.setText(null);
                campoRegistrarID.setText(null);
                campoRegistrarVigencia.setText(null);
                cargarCursos(campoRegistrarCurso);
                campoRegistrarPrecio.setText(null);

                pantallaRegistrar.setVisible(true);
                break;

            case "verDatos":
                cargarPaquetes(campoVisualizarID);
                campoVisualizarCantidadSesiones.setText(null);
                campoVisualizarCantidadSesiones.setEditable(false);

                campoVisualizarVigencia.setText(null);
                campoVisualizarVigencia.setEditable(false);

                campoVisualizarCurso.setText(null);
                campoVisualizarCurso.setEditable(false);

                campoVisualizarPrecio.setText(null);
                campoVisualizarPrecio.setEditable(false);

                pantallaVisualizar.setVisible(true);
                break;

            case "modificarDatos":
                cargarPaquetes(campoModificarID);
                campoModificarCantidadSesiones.setText(null);
                campoModificarVigencia.setText(null);
                campoModificarCurso.removeAllItems();
                campoModificarPrecio.setText(null);

                pantallaModificar.setVisible(true);
                break;

            case "eliminarPaquete":
                cargarPaquetes(campoEliminarID);
                campoEliminarCantidadSesiones.setText(null);
                campoEliminarCantidadSesiones.setEditable(false);

                campoEliminarVigencia.setText(null);
                campoEliminarVigencia.setEditable(false);

                campoEliminarCurso.setText(null);
                campoEliminarCurso.setEditable(false);

                campoEliminarPrecio.setText(null);
                campoEliminarPrecio.setEditable(false);

                pantallaEliminar.setVisible(true);
                break;

            case "verVentas":
                cargarPaquetes(campoVerVentasID);
                prepararModeloLista(campoVerVentas);

                pantallaVerVentas.setVisible(true);
                break;

            case "filtrarFechas":
                prepararModeloLista(campoFiltrarFecha);
                cargarPaquetes(campoFiltrarFechaID);
                campoFiltrarFechaRangoInicial.setText(null);
                campoFiltrarFechaRangoFinal.setText(null);

                pantallaFiltrarFecha.setVisible(true);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaRegistrar = new javax.swing.JPanel();
        tituloRegistrarID = new javax.swing.JLabel();
        tituloRegistrarCantidadSesiones = new javax.swing.JLabel();
        tituloRegistrarVigencia = new javax.swing.JLabel();
        tituloRegistrarCurso = new javax.swing.JLabel();
        tituloRegistrarPrecio = new javax.swing.JLabel();
        campoRegistrarID = new javax.swing.JTextField();
        campoRegistrarCantidadSesiones = new javax.swing.JTextField();
        campoRegistrarVigencia = new javax.swing.JTextField();
        campoRegistrarCurso = new javax.swing.JComboBox<>();
        campoRegistrarPrecio = new javax.swing.JTextField();
        botonRegistrarPaquete = new javax.swing.JButton();
        botonCerrarRegistro = new javax.swing.JButton();
        pantallaVisualizar = new javax.swing.JPanel();
        tituloVisualizarID = new javax.swing.JLabel();
        tituloVisualizarCantidadSesiones = new javax.swing.JLabel();
        tituloVisualizarVigencia = new javax.swing.JLabel();
        tituloVisualizarCurso = new javax.swing.JLabel();
        tituloVisualizarPrecio = new javax.swing.JLabel();
        botonCargarVisualizacion = new javax.swing.JButton();
        campoVisualizarID = new javax.swing.JComboBox<>();
        campoVisualizarCantidadSesiones = new javax.swing.JTextField();
        campoVisualizarVigencia = new javax.swing.JTextField();
        campoVisualizarCurso = new javax.swing.JTextField();
        campoVisualizarPrecio = new javax.swing.JTextField();
        botonCerrarVisualizacion = new javax.swing.JButton();
        pantallaModificar = new javax.swing.JPanel();
        tituloModificarID = new javax.swing.JLabel();
        tituloModificarCantidadSesiones = new javax.swing.JLabel();
        tituloModificarVigencia = new javax.swing.JLabel();
        tituloModificarCurso = new javax.swing.JLabel();
        tituloModificarPrecio = new javax.swing.JLabel();
        botonCargarModificacion = new javax.swing.JButton();
        campoModificarID = new javax.swing.JComboBox<>();
        campoModificarCantidadSesiones = new javax.swing.JTextField();
        campoModificarVigencia = new javax.swing.JTextField();
        campoModificarCurso = new javax.swing.JComboBox<>();
        campoModificarPrecio = new javax.swing.JTextField();
        botonModificarPaquete = new javax.swing.JButton();
        botonCerrarModificacion = new javax.swing.JButton();
        pantallaEliminar = new javax.swing.JPanel();
        tituloEliminarPaquete = new javax.swing.JLabel();
        tituloEliminarCantidadSesiones = new javax.swing.JLabel();
        tituloEliminarVigencia = new javax.swing.JLabel();
        tituloEliminarCurso = new javax.swing.JLabel();
        tituloEliminarPrecio = new javax.swing.JLabel();
        botonCargarEliminacion = new javax.swing.JButton();
        campoEliminarID = new javax.swing.JComboBox<>();
        campoEliminarCantidadSesiones = new javax.swing.JTextField();
        campoEliminarVigencia = new javax.swing.JTextField();
        campoEliminarCurso = new javax.swing.JTextField();
        campoEliminarPrecio = new javax.swing.JTextField();
        botonCerrarEliminacion = new javax.swing.JButton();
        botonEliminarPaquete = new javax.swing.JButton();
        pantallaVerVentas = new javax.swing.JPanel();
        tituloVerVentasID = new javax.swing.JLabel();
        campoVerVentasID = new javax.swing.JComboBox<>();
        botonCargarVerVentas = new javax.swing.JButton();
        capsulaVerVentas = new javax.swing.JScrollPane();
        campoVerVentas = new javax.swing.JList<>();
        botonCerrarVerVentas = new javax.swing.JButton();
        pantallaFiltrarFecha = new javax.swing.JPanel();
        tituloFiltrarFechaID = new javax.swing.JLabel();
        tituloFiltrarFechaRangoInicial = new javax.swing.JLabel();
        tituloFiltrarFechaRangoFinal = new javax.swing.JLabel();
        campoFiltrarFechaID = new javax.swing.JComboBox<>();
        botonCargarFiltrarFecha = new javax.swing.JButton();
        campoFiltrarFechaRangoInicial = new javax.swing.JTextField();
        campoFiltrarFechaRangoFinal = new javax.swing.JTextField();
        capsulaFiltrarFecha = new javax.swing.JScrollPane();
        campoFiltrarFecha = new javax.swing.JList<>();
        botonCerrarFiltrarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion - Mis primeros brincos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(453, 411));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pantallaRegistrar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaRegistrar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaRegistrar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloRegistrarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarID.setText("ID del paquete");

        tituloRegistrarCantidadSesiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarCantidadSesiones.setText("Cantidad de sesiones");

        tituloRegistrarVigencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarVigencia.setText("Vigencia (yyyy-MM-dd)");

        tituloRegistrarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarCurso.setText("ID del curso");

        tituloRegistrarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarPrecio.setText("Precio");

        botonRegistrarPaquete.setText("Registrar datos del paquete");
        botonRegistrarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPaqueteActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(tituloRegistrarPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoRegistrarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(tituloRegistrarID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoRegistrarID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(botonRegistrarPaquete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarRegistro))
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloRegistrarVigencia)
                            .addComponent(tituloRegistrarCurso)
                            .addComponent(tituloRegistrarCantidadSesiones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoRegistrarVigencia)
                            .addComponent(campoRegistrarCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoRegistrarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        pantallaRegistrarLayout.setVerticalGroup(
            pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaRegistrarLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarID))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarCantidadSesiones))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarVigencia))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarCurso))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarPrecio))
                .addGap(41, 41, 41)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarRegistro)
                    .addComponent(botonRegistrarPaquete))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaRegistrar, "card4");

        pantallaVisualizar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloVisualizarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarID.setText("ID del paquete");

        tituloVisualizarCantidadSesiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarCantidadSesiones.setText("Cantidad de sesiones");

        tituloVisualizarVigencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarVigencia.setText("Vigencia (yyyy-MM-dd)");

        tituloVisualizarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarCurso.setText("ID del curso");

        tituloVisualizarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarPrecio.setText("Precio");

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
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addComponent(tituloVisualizarPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoVisualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonCerrarVisualizacion)))
                    .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addGap(120, 126, Short.MAX_VALUE)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tituloVisualizarCurso, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloVisualizarID, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tituloVisualizarCantidadSesiones)
                                    .addComponent(tituloVisualizarVigencia))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addComponent(campoVisualizarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoVisualizarVigencia)
                            .addComponent(campoVisualizarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoVisualizarCurso))))
                .addGap(13, 13, 13))
        );
        pantallaVisualizarLayout.setVerticalGroup(
            pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaVisualizarLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarID)
                    .addComponent(botonCargarVisualizacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarCantidadSesiones))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarVigencia))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarCurso))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarPrecio))
                .addGap(41, 41, 41)
                .addComponent(botonCerrarVisualizacion)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaVisualizar, "card4");

        pantallaModificar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloModificarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarID.setText("Id del paquete");

        tituloModificarCantidadSesiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarCantidadSesiones.setText("Cantidad de sesiones");

        tituloModificarVigencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarVigencia.setText("Vigencia (yyyy-MM-dd)");

        tituloModificarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarCurso.setText("ID del curso");

        tituloModificarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarPrecio.setText("Precio");

        botonCargarModificacion.setText("Cargar");
        botonCargarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarModificacionActionPerformed(evt);
            }
        });

        botonModificarPaquete.setText("Guardar cambios");
        botonModificarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPaqueteActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaModificarLayout.createSequentialGroup()
                        .addComponent(tituloModificarPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoModificarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaModificarLayout.createSequentialGroup()
                        .addComponent(botonModificarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarModificacion))
                    .addGroup(pantallaModificarLayout.createSequentialGroup()
                        .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloModificarCantidadSesiones)
                            .addComponent(tituloModificarCurso)
                            .addComponent(tituloModificarID)
                            .addComponent(tituloModificarVigencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaModificarLayout.createSequentialGroup()
                                .addComponent(campoModificarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoModificarVigencia)
                            .addComponent(campoModificarCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoModificarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        pantallaModificarLayout.setVerticalGroup(
            pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaModificarLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarID)
                    .addComponent(botonCargarModificacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarCantidadSesiones))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarVigencia))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarCurso))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarPrecio))
                .addGap(41, 41, 41)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarModificacion)
                    .addComponent(botonModificarPaquete))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaModificar, "card4");

        pantallaEliminar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloEliminarPaquete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarPaquete.setText("ID del paquete");

        tituloEliminarCantidadSesiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarCantidadSesiones.setText("Cantidad de sesiones");

        tituloEliminarVigencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarVigencia.setText("Vigencia (yyyy-MM-dd)");

        tituloEliminarCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarCurso.setText("ID del curso");

        tituloEliminarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarPrecio.setText("Precio");

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

        botonEliminarPaquete.setText("Eliminar paquete");
        botonEliminarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarPaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaEliminarLayout = new javax.swing.GroupLayout(pantallaEliminar);
        pantallaEliminar.setLayout(pantallaEliminarLayout);
        pantallaEliminarLayout.setHorizontalGroup(
            pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addComponent(tituloEliminarPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEliminarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addComponent(botonEliminarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarEliminacion))
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloEliminarVigencia)
                            .addComponent(tituloEliminarCurso)
                            .addComponent(tituloEliminarCantidadSesiones)
                            .addComponent(tituloEliminarPaquete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaEliminarLayout.createSequentialGroup()
                                .addComponent(campoEliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarEliminacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoEliminarVigencia)
                            .addComponent(campoEliminarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEliminarCurso))))
                .addGap(13, 13, 13))
        );
        pantallaEliminarLayout.setVerticalGroup(
            pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarPaquete)
                    .addComponent(botonCargarEliminacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarCantidadSesiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarCantidadSesiones))
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarVigencia))
                .addGap(27, 27, 27)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloEliminarCurso)
                    .addComponent(campoEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarPrecio))
                .addGap(44, 44, 44)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarEliminacion)
                    .addComponent(botonEliminarPaquete))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaEliminar, "card4");

        pantallaVerVentas.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaVerVentas.setMinimumSize(new java.awt.Dimension(300, 300));

        tituloVerVentasID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVerVentasID.setText("ID del paquete");

        botonCargarVerVentas.setText("Cargar");
        botonCargarVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarVerVentasActionPerformed(evt);
            }
        });

        capsulaVerVentas.setViewportView(campoVerVentas);

        botonCerrarVerVentas.setText("Regresar");
        botonCerrarVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarVerVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaVerVentasLayout = new javax.swing.GroupLayout(pantallaVerVentas);
        pantallaVerVentas.setLayout(pantallaVerVentasLayout);
        pantallaVerVentasLayout.setHorizontalGroup(
            pantallaVerVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaVerVentasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pantallaVerVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarVerVentas)
                    .addGroup(pantallaVerVentasLayout.createSequentialGroup()
                        .addComponent(tituloVerVentasID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoVerVentasID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCargarVerVentas))
                    .addComponent(capsulaVerVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pantallaVerVentasLayout.setVerticalGroup(
            pantallaVerVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaVerVentasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pantallaVerVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargarVerVentas)
                    .addComponent(campoVerVentasID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVerVentasID))
                .addGap(18, 18, 18)
                .addComponent(capsulaVerVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarVerVentas)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaVerVentas, "card4");

        pantallaFiltrarFecha.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaFiltrarFecha.setMinimumSize(new java.awt.Dimension(300, 300));

        tituloFiltrarFechaID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFiltrarFechaID.setText("ID del paquete");

        tituloFiltrarFechaRangoInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFiltrarFechaRangoInicial.setText("Rango inicial (yyyy-MM-dd)");

        tituloFiltrarFechaRangoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFiltrarFechaRangoFinal.setText("Rango final (yyyy-MM-dd)");

        botonCargarFiltrarFecha.setText("Cargar");
        botonCargarFiltrarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarFiltrarFechaActionPerformed(evt);
            }
        });

        capsulaFiltrarFecha.setViewportView(campoFiltrarFecha);

        botonCerrarFiltrarFecha.setText("Regresar");
        botonCerrarFiltrarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarFiltrarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaFiltrarFechaLayout = new javax.swing.GroupLayout(pantallaFiltrarFecha);
        pantallaFiltrarFecha.setLayout(pantallaFiltrarFechaLayout);
        pantallaFiltrarFechaLayout.setHorizontalGroup(
            pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaFiltrarFechaLayout.createSequentialGroup()
                .addGroup(pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pantallaFiltrarFechaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCerrarFiltrarFecha)
                            .addGroup(pantallaFiltrarFechaLayout.createSequentialGroup()
                                .addComponent(tituloFiltrarFechaID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoFiltrarFechaID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarFiltrarFecha))
                            .addComponent(capsulaFiltrarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pantallaFiltrarFechaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloFiltrarFechaRangoInicial)
                            .addComponent(tituloFiltrarFechaRangoFinal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoFiltrarFechaRangoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(campoFiltrarFechaRangoFinal))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pantallaFiltrarFechaLayout.setVerticalGroup(
            pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaFiltrarFechaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargarFiltrarFecha)
                    .addComponent(campoFiltrarFechaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFiltrarFechaID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFiltrarFechaRangoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFiltrarFechaRangoInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pantallaFiltrarFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFiltrarFechaRangoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFiltrarFechaRangoFinal))
                .addGap(18, 18, 18)
                .addComponent(capsulaFiltrarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarFiltrarFecha)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaFiltrarFecha, "card4");

        setSize(new java.awt.Dimension(453, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void botonRegistrarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarPaqueteActionPerformed
        boolean camposIncompletos
                = determinarCampoVacio(campoRegistrarID)
                || determinarCampoVacio(campoRegistrarCantidadSesiones)
                || determinarCampoVacio(campoRegistrarVigencia)
                || determinarCampoVacio(campoRegistrarPrecio);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            Paquete paquete = new Paquete(
                    campoRegistrarID.getText(),
                    campoRegistrarCantidadSesiones.getText(),
                    campoRegistrarVigencia.getText(),
                    campoRegistrarPrecio.getText(),
                    String.valueOf(campoRegistrarCurso.getSelectedItem())
            );
            paquetes.registrarPaquete(paquete);

            mensajePantalla(conexion.getMensajeInformativo());
            this.dispose();
        }
    }//GEN-LAST:event_botonRegistrarPaqueteActionPerformed

    private void botonCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarRegistroActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarRegistroActionPerformed

    private void botonCargarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarVisualizacionActionPerformed
        String paqueteSeleccionado = String.valueOf(campoVisualizarID.getSelectedItem());

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                campoVisualizarCantidadSesiones.setText(paquete.getCantidadSesiones());
                campoVisualizarVigencia.setText(paquete.getVigencia());
                campoVisualizarCurso.setText(paquete.getIdCurso());
                campoVisualizarPrecio.setText(paquete.getPrecio());
            }
        }
    }//GEN-LAST:event_botonCargarVisualizacionActionPerformed

    private void botonCerrarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVisualizacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarVisualizacionActionPerformed

    private void botonCargarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarModificacionActionPerformed
        String paqueteSeleccionado = String.valueOf(campoModificarID.getSelectedItem());
        cargarCursos(campoModificarCurso);

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                campoModificarCantidadSesiones.setText(paquete.getCantidadSesiones());
                campoModificarVigencia.setText(paquete.getVigencia());
                campoModificarCurso.setSelectedItem(paquete.getIdCurso());
                campoModificarPrecio.setText(paquete.getPrecio());
            }
        }
    }//GEN-LAST:event_botonCargarModificacionActionPerformed

    private void botonModificarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPaqueteActionPerformed
        String paqueteSeleccionado = String.valueOf(campoModificarID.getSelectedItem());

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                paquete.setCantidadSesiones(campoModificarCantidadSesiones.getText());
                paquete.setVigencia(campoModificarVigencia.getText());
                paquete.setPrecio(campoModificarPrecio.getText());
                paquete.setIdCurso(String.valueOf(campoModificarCurso.getSelectedItem()));

                paquetes.modificarPaquete(paquete);
                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonModificarPaqueteActionPerformed

    private void botonCerrarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarModificacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarModificacionActionPerformed

    private void botonCargarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarEliminacionActionPerformed
        String paqueteSeleccionado = String.valueOf(campoEliminarID.getSelectedItem());

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                campoEliminarCantidadSesiones.setText(paquete.getCantidadSesiones());
                campoEliminarVigencia.setText(paquete.getVigencia());
                campoEliminarCurso.setText(paquete.getIdCurso());
                campoEliminarPrecio.setText(paquete.getPrecio());
            }
        }
    }//GEN-LAST:event_botonCargarEliminacionActionPerformed

    private void botonEliminarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarPaqueteActionPerformed
        String paqueteSeleccionado = String.valueOf(campoEliminarID.getSelectedItem());

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                paquete.setCantidadSesiones(campoEliminarCantidadSesiones.getText());
                paquete.setVigencia(campoEliminarVigencia.getText());
                paquete.setIdCurso(campoEliminarCurso.getText());
                paquete.setPrecio(campoEliminarPrecio.getText());

                paquetes.eliminarPaquete(paquete);
                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonEliminarPaqueteActionPerformed

    private void botonCerrarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarEliminacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarEliminacionActionPerformed

    private void botonCargarVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarVerVentasActionPerformed
        String paqueteSeleccionado = String.valueOf(campoVerVentasID.getSelectedItem());
        prepararModeloLista(campoVerVentas);

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                ArrayList<String> ventasPaquete = paquetes.verVentas(paquete);
                int cantidadVentas = ventasPaquete.size();

                if (cantidadVentas == 0) {
                    modeloLista.addElement("No tiene ninguna venta.");
                } else {
                    modeloLista.addElement("El paquete ha sido vendido " + cantidadVentas + " veces.\n");
                    for (String venta : ventasPaquete) {
                        modeloLista.addElement("ID de la compra: " + venta);
                    }
                }
            }
        }
    }//GEN-LAST:event_botonCargarVerVentasActionPerformed

    private void botonCerrarVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVerVentasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarVerVentasActionPerformed

    private void botonCargarFiltrarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarFiltrarFechaActionPerformed
        prepararModeloLista(campoFiltrarFecha);

        boolean camposIncompletos
                = determinarCampoVacio(campoFiltrarFechaRangoInicial)
                || determinarCampoVacio(campoFiltrarFechaRangoFinal);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            String paqueteSeleccionado = String.valueOf(campoFiltrarFechaID.getSelectedItem());
            String rangoInicial = campoFiltrarFechaRangoInicial.getText();
            String rangoFinal = campoFiltrarFechaRangoFinal.getText();

            for (Paquete paquete : listaPaquetes) {
                if (paquete.getId().equals(paqueteSeleccionado) == true) {
                    ArrayList<String> ventasPaquete = paquetes.filtrarFecha(paquete, rangoInicial, rangoFinal);
                    int cantidadVentas = ventasPaquete.size();

                    if (cantidadVentas == 0) {
                        modeloLista.addElement("El paquete no se ha vendido ni una sola vez entre esas fechas.");
                    } else {
                        modeloLista.addElement("El paquete ha sido vendido " + cantidadVentas + " veces entre " + rangoInicial + " y " + rangoFinal + ".\n");
                        for (String venta : ventasPaquete) {
                            modeloLista.addElement("ID de la compra: " + venta);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_botonCargarFiltrarFechaActionPerformed

    private void botonCerrarFiltrarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarFiltrarFechaActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarFiltrarFechaActionPerformed

    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(PantallaPaquetes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPaquetes().setVisible(true);
            }
        });
    }
    // Metodo Principal - Fin

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarEliminacion;
    private javax.swing.JButton botonCargarFiltrarFecha;
    private javax.swing.JButton botonCargarModificacion;
    private javax.swing.JButton botonCargarVerVentas;
    private javax.swing.JButton botonCargarVisualizacion;
    private javax.swing.JButton botonCerrarEliminacion;
    private javax.swing.JButton botonCerrarFiltrarFecha;
    private javax.swing.JButton botonCerrarModificacion;
    private javax.swing.JButton botonCerrarRegistro;
    private javax.swing.JButton botonCerrarVerVentas;
    private javax.swing.JButton botonCerrarVisualizacion;
    private javax.swing.JButton botonEliminarPaquete;
    private javax.swing.JButton botonModificarPaquete;
    private javax.swing.JButton botonRegistrarPaquete;
    private javax.swing.JTextField campoEliminarCantidadSesiones;
    private javax.swing.JTextField campoEliminarCurso;
    private javax.swing.JComboBox<String> campoEliminarID;
    private javax.swing.JTextField campoEliminarPrecio;
    private javax.swing.JTextField campoEliminarVigencia;
    private javax.swing.JList<String> campoFiltrarFecha;
    private javax.swing.JComboBox<String> campoFiltrarFechaID;
    private javax.swing.JTextField campoFiltrarFechaRangoFinal;
    private javax.swing.JTextField campoFiltrarFechaRangoInicial;
    private javax.swing.JTextField campoModificarCantidadSesiones;
    private javax.swing.JComboBox<String> campoModificarCurso;
    private javax.swing.JComboBox<String> campoModificarID;
    private javax.swing.JTextField campoModificarPrecio;
    private javax.swing.JTextField campoModificarVigencia;
    private javax.swing.JTextField campoRegistrarCantidadSesiones;
    private javax.swing.JComboBox<String> campoRegistrarCurso;
    private javax.swing.JTextField campoRegistrarID;
    private javax.swing.JTextField campoRegistrarPrecio;
    private javax.swing.JTextField campoRegistrarVigencia;
    private javax.swing.JList<String> campoVerVentas;
    private javax.swing.JComboBox<String> campoVerVentasID;
    private javax.swing.JTextField campoVisualizarCantidadSesiones;
    private javax.swing.JTextField campoVisualizarCurso;
    private javax.swing.JComboBox<String> campoVisualizarID;
    private javax.swing.JTextField campoVisualizarPrecio;
    private javax.swing.JTextField campoVisualizarVigencia;
    private javax.swing.JScrollPane capsulaFiltrarFecha;
    private javax.swing.JScrollPane capsulaVerVentas;
    private javax.swing.JPanel pantallaEliminar;
    private javax.swing.JPanel pantallaFiltrarFecha;
    private javax.swing.JPanel pantallaModificar;
    private javax.swing.JPanel pantallaRegistrar;
    private javax.swing.JPanel pantallaVerVentas;
    private javax.swing.JPanel pantallaVisualizar;
    private javax.swing.JLabel tituloEliminarCantidadSesiones;
    private javax.swing.JLabel tituloEliminarCurso;
    private javax.swing.JLabel tituloEliminarPaquete;
    private javax.swing.JLabel tituloEliminarPrecio;
    private javax.swing.JLabel tituloEliminarVigencia;
    private javax.swing.JLabel tituloFiltrarFechaID;
    private javax.swing.JLabel tituloFiltrarFechaRangoFinal;
    private javax.swing.JLabel tituloFiltrarFechaRangoInicial;
    private javax.swing.JLabel tituloModificarCantidadSesiones;
    private javax.swing.JLabel tituloModificarCurso;
    private javax.swing.JLabel tituloModificarID;
    private javax.swing.JLabel tituloModificarPrecio;
    private javax.swing.JLabel tituloModificarVigencia;
    private javax.swing.JLabel tituloRegistrarCantidadSesiones;
    private javax.swing.JLabel tituloRegistrarCurso;
    private javax.swing.JLabel tituloRegistrarID;
    private javax.swing.JLabel tituloRegistrarPrecio;
    private javax.swing.JLabel tituloRegistrarVigencia;
    private javax.swing.JLabel tituloVerVentasID;
    private javax.swing.JLabel tituloVisualizarCantidadSesiones;
    private javax.swing.JLabel tituloVisualizarCurso;
    private javax.swing.JLabel tituloVisualizarID;
    private javax.swing.JLabel tituloVisualizarPrecio;
    private javax.swing.JLabel tituloVisualizarVigencia;
    // End of variables declaration//GEN-END:variables
}
