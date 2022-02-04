package com.frontend;

import com.backend.Salon;
import com.backend.ConexionSQL;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PantallaSalones extends javax.swing.JFrame {

    private ArrayList<Salon> listaSalones = new ArrayList<>();
    private DefaultListModel modeloLista = new DefaultListModel();
    private Salon salones = new Salon();

    private ConexionSQL conexion = new ConexionSQL();
    private VentanasEmergentes ventanaEmergente = new VentanasEmergentes();

    public PantallaSalones() {
        initComponents();
    }

    public void definirConexion(ConexionSQL conexion) {
        this.conexion = conexion;
        salones.setConexion(conexion);
    }

    private void mensajePantalla(String ventana) {
        ventanaEmergente.setVisible(true);
        ventanaEmergente.ventanaRequerida(ventana);
    }

    private void cargarSalones(javax.swing.JComboBox<String> comboBox) {
        listaSalones = salones.obtenerSalones();
        comboBox.removeAllItems();

        listaSalones.forEach(salon -> {
            comboBox.addItem(salon.getId());
        });
    }

    private boolean determinarCampoVacio(javax.swing.JTextField campo) {
        if (campo.getText().equals("") == true) {
            return true;
        }
        return false;
    }

    private void prepararModeloLista(javax.swing.JList<String> campo) {
        campo.setModel(modeloLista);
        modeloLista.removeAllElements();
    }

    private void ocultarPantallas() {
        pantallaFiltrarDia.setVisible(false);
        pantallaRegistrar.setVisible(false);
        pantallaVisualizar.setVisible(false);
        pantallaModificar.setVisible(false);
        pantallaEliminar.setVisible(false);
        pantallaDisponibilidad.setVisible(false);
    }

    public void pantallaRequerida(String barraRequerida) {
        ocultarPantallas();

        switch (barraRequerida) {
            case "ingresarDatos":
                campoRegistrarID.setText(null);
                campoRegistrarCapacidad.setText(null);

                pantallaRegistrar.setVisible(true);
                break;

            case "verDatos":
                cargarSalones(campoVisualizarID);
                campoVisualizarCapacidad.setText(null);
                campoVisualizarCapacidad.setEditable(false);

                pantallaVisualizar.setVisible(true);
                break;

            case "modificarDatos":
                cargarSalones(campoModificarID);
                campoModificarCapacidad.setText(null);

                pantallaModificar.setVisible(true);
                break;

            case "eliminarSalon":
                cargarSalones(campoEliminarID);
                campoEliminarCapacidad.setText(null);
                campoEliminarCapacidad.setEditable(false);

                pantallaEliminar.setVisible(true);
                break;

            case "filtrarDia":
                prepararModeloLista(campoFiltrarDia);
                cargarSalones(campoFiltrarDiaID);
                campoFiltrarDiaFechaInicial.setText(null);
                campoFiltrarDiaFechaFinal.setText(null);

                pantallaFiltrarDia.setVisible(true);

            case "verDisponibilidad":
                cargarSalones(campoDisponibilidadID);
                campoDisponibilidadFecha.setText(null);
                campoDisponibilidadHoraInicial.setText(null);
                campoDisponibilidadHoraFinal.setText(null);
                campoDisponibilidad.setText(null);
                campoDisponibilidad.setEditable(false);

                pantallaDisponibilidad.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaFiltrarDia = new javax.swing.JPanel();
        tituloFiltrarDiaID = new javax.swing.JLabel();
        tituloFiltrarDiaFechaInicial = new javax.swing.JLabel();
        tituloFiltrarDiaFechaFinal = new javax.swing.JLabel();
        campoFiltrarDiaID = new javax.swing.JComboBox<>();
        botonCargarSalonesDelDia = new javax.swing.JButton();
        campoFiltrarDiaFechaInicial = new javax.swing.JTextField();
        campoFiltrarDiaFechaFinal = new javax.swing.JTextField();
        capsulaFiltrarDia = new javax.swing.JScrollPane();
        campoFiltrarDia = new javax.swing.JList<>();
        botonCerrarFiltrarDia = new javax.swing.JButton();
        pantallaRegistrar = new javax.swing.JPanel();
        tituloRegistrarID = new javax.swing.JLabel();
        tituloRegistrarCapacidad = new javax.swing.JLabel();
        campoRegistrarID = new javax.swing.JTextField();
        campoRegistrarCapacidad = new javax.swing.JTextField();
        botonRegistrarSalon = new javax.swing.JButton();
        botonCerrarRegistro = new javax.swing.JButton();
        pantallaVisualizar = new javax.swing.JPanel();
        tituloVisualizarSalon = new javax.swing.JLabel();
        tituloVisualizarCapacidad = new javax.swing.JLabel();
        botonCargarVisualizacion = new javax.swing.JButton();
        campoVisualizarID = new javax.swing.JComboBox<>();
        campoVisualizarCapacidad = new javax.swing.JTextField();
        botonCerrarVisualizacion = new javax.swing.JButton();
        pantallaModificar = new javax.swing.JPanel();
        tituloModificarID = new javax.swing.JLabel();
        tituloModificarCapacidad = new javax.swing.JLabel();
        botonCargarModificacion = new javax.swing.JButton();
        campoModificarID = new javax.swing.JComboBox<>();
        campoModificarCapacidad = new javax.swing.JTextField();
        botonModificarSalon = new javax.swing.JButton();
        botonCerrarModificacion = new javax.swing.JButton();
        pantallaEliminar = new javax.swing.JPanel();
        tituloEliminarID = new javax.swing.JLabel();
        tituloEliminaCapacidad = new javax.swing.JLabel();
        botonCargarEliminacion = new javax.swing.JButton();
        campoEliminarID = new javax.swing.JComboBox<>();
        campoEliminarCapacidad = new javax.swing.JTextField();
        botonCerrarEliminacion = new javax.swing.JButton();
        botonEliminarSalon = new javax.swing.JButton();
        pantallaDisponibilidad = new javax.swing.JPanel();
        tituloDisponibilidadSalon = new javax.swing.JLabel();
        botonCargarDisponibilidad = new javax.swing.JButton();
        campoDisponibilidadID = new javax.swing.JComboBox<>();
        botonCerrarDisponibilidad = new javax.swing.JButton();
        campoDisponibilidadFecha = new javax.swing.JTextField();
        tituloDisponibilidadHoraFinal = new javax.swing.JLabel();
        tituloDisponibilidadHoraInicial = new javax.swing.JLabel();
        campoDisponibilidadHoraFinal = new javax.swing.JTextField();
        tituloDisponibilidadCapacidad = new javax.swing.JLabel();
        campoDisponibilidadHoraInicial = new javax.swing.JTextField();
        campoDisponibilidad = new javax.swing.JTextField();
        tituloDisponibilidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestion - Mis primeros brincos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(453, 411));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pantallaFiltrarDia.setMaximumSize(new java.awt.Dimension(453, 373));
        pantallaFiltrarDia.setMinimumSize(new java.awt.Dimension(453, 373));
        pantallaFiltrarDia.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloFiltrarDiaID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFiltrarDiaID.setText("ID del salon");

        tituloFiltrarDiaFechaInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFiltrarDiaFechaInicial.setText("Rango inicial (yyyy-MM-dd)");

        tituloFiltrarDiaFechaFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFiltrarDiaFechaFinal.setText("Rango final (yyyy-MM-dd)");

        botonCargarSalonesDelDia.setText("Cargar");
        botonCargarSalonesDelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarSalonesDelDiaActionPerformed(evt);
            }
        });

        capsulaFiltrarDia.setViewportView(campoFiltrarDia);

        botonCerrarFiltrarDia.setText("Regresar");
        botonCerrarFiltrarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarFiltrarDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaFiltrarDiaLayout = new javax.swing.GroupLayout(pantallaFiltrarDia);
        pantallaFiltrarDia.setLayout(pantallaFiltrarDiaLayout);
        pantallaFiltrarDiaLayout.setHorizontalGroup(
            pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaFiltrarDiaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(capsulaFiltrarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaFiltrarDiaLayout.createSequentialGroup()
                        .addGroup(pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloFiltrarDiaID)
                            .addComponent(tituloFiltrarDiaFechaFinal)
                            .addComponent(tituloFiltrarDiaFechaInicial))
                        .addGap(12, 12, 12)
                        .addGroup(pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoFiltrarDiaFechaFinal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoFiltrarDiaFechaInicial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaFiltrarDiaLayout.createSequentialGroup()
                                .addComponent(campoFiltrarDiaID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarSalonesDelDia)
                                .addGap(3, 3, 3)))))
                .addGap(21, 21, 21))
            .addGroup(pantallaFiltrarDiaLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(botonCerrarFiltrarDia)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pantallaFiltrarDiaLayout.setVerticalGroup(
            pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaFiltrarDiaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargarSalonesDelDia)
                    .addComponent(campoFiltrarDiaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFiltrarDiaID))
                .addGap(12, 12, 12)
                .addGroup(pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFiltrarDiaFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFiltrarDiaFechaInicial))
                .addGap(12, 12, 12)
                .addGroup(pantallaFiltrarDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloFiltrarDiaFechaFinal)
                    .addComponent(campoFiltrarDiaFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(capsulaFiltrarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(botonCerrarFiltrarDia)
                .addGap(37, 37, 37))
        );

        getContentPane().add(pantallaFiltrarDia, "card4");

        pantallaRegistrar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaRegistrar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaRegistrar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloRegistrarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarID.setText("ID del salon");

        tituloRegistrarCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloRegistrarCapacidad.setText("Capacidad maxima de personas");

        botonRegistrarSalon.setText("Registrar datos del salon");
        botonRegistrarSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarSalonActionPerformed(evt);
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
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(tituloRegistrarID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoRegistrarID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(tituloRegistrarCapacidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoRegistrarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaRegistrarLayout.createSequentialGroup()
                        .addComponent(botonRegistrarSalon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarRegistro)))
                .addGap(13, 13, 13))
        );
        pantallaRegistrarLayout.setVerticalGroup(
            pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaRegistrarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarID))
                .addGap(30, 30, 30)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoRegistrarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloRegistrarCapacidad))
                .addGap(185, 185, 185)
                .addGroup(pantallaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarRegistro)
                    .addComponent(botonRegistrarSalon))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaRegistrar, "card4");

        pantallaVisualizar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaVisualizar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloVisualizarSalon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarSalon.setText("ID del salon");

        tituloVisualizarCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVisualizarCapacidad.setText("Capacidad maxima de personas");

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
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarVisualizacion)
                    .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloVisualizarCapacidad)
                            .addComponent(tituloVisualizarSalon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaVisualizarLayout.createSequentialGroup()
                                .addComponent(campoVisualizarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarVisualizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoVisualizarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        pantallaVisualizarLayout.setVerticalGroup(
            pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaVisualizarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarSalon)
                    .addComponent(botonCargarVisualizacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaVisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoVisualizarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVisualizarCapacidad))
                .addGap(185, 185, 185)
                .addComponent(botonCerrarVisualizacion)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaVisualizar, "card4");

        pantallaModificar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaModificar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloModificarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarID.setText("ID del salon");

        tituloModificarCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloModificarCapacidad.setText("Capacidad maxima de personas");

        botonCargarModificacion.setText("Cargar");
        botonCargarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarModificacionActionPerformed(evt);
            }
        });

        botonModificarSalon.setText("Guardar cambios");
        botonModificarSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarSalonActionPerformed(evt);
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
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaModificarLayout.createSequentialGroup()
                        .addComponent(botonModificarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarModificacion))
                    .addGroup(pantallaModificarLayout.createSequentialGroup()
                        .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloModificarCapacidad)
                            .addComponent(tituloModificarID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaModificarLayout.createSequentialGroup()
                                .addComponent(campoModificarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoModificarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        pantallaModificarLayout.setVerticalGroup(
            pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaModificarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarID)
                    .addComponent(botonCargarModificacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModificarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloModificarCapacidad))
                .addGap(185, 185, 185)
                .addGroup(pantallaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarModificacion)
                    .addComponent(botonModificarSalon))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaModificar, "card4");

        pantallaEliminar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaEliminar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloEliminarID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminarID.setText("ID del salon");

        tituloEliminaCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloEliminaCapacidad.setText("Capacidad maxima de personas");

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

        botonEliminarSalon.setText("Eliminar salon");
        botonEliminarSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarSalonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaEliminarLayout = new javax.swing.GroupLayout(pantallaEliminar);
        pantallaEliminar.setLayout(pantallaEliminarLayout);
        pantallaEliminarLayout.setHorizontalGroup(
            pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addComponent(botonEliminarSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarEliminacion))
                    .addGroup(pantallaEliminarLayout.createSequentialGroup()
                        .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloEliminaCapacidad)
                            .addComponent(tituloEliminarID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaEliminarLayout.createSequentialGroup()
                                .addComponent(campoEliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarEliminacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(campoEliminarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13))
        );
        pantallaEliminarLayout.setVerticalGroup(
            pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaEliminarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminarID)
                    .addComponent(botonCargarEliminacion))
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEliminarCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloEliminaCapacidad))
                .addGap(185, 185, 185)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarEliminacion)
                    .addComponent(botonEliminarSalon))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaEliminar, "card4");

        pantallaDisponibilidad.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaDisponibilidad.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaDisponibilidad.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloDisponibilidadSalon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDisponibilidadSalon.setText("ID del salon");

        botonCargarDisponibilidad.setText("Cargar");
        botonCargarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarDisponibilidadActionPerformed(evt);
            }
        });

        botonCerrarDisponibilidad.setText("Regresar");
        botonCerrarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarDisponibilidadActionPerformed(evt);
            }
        });

        tituloDisponibilidadHoraFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDisponibilidadHoraFinal.setText("Hora final");

        tituloDisponibilidadHoraInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDisponibilidadHoraInicial.setText("Hora inicial");

        tituloDisponibilidadCapacidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDisponibilidadCapacidad.setText("Fecha (yyyy-MM-dd)");

        tituloDisponibilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloDisponibilidad.setText("Disponibilidad");

        javax.swing.GroupLayout pantallaDisponibilidadLayout = new javax.swing.GroupLayout(pantallaDisponibilidad);
        pantallaDisponibilidad.setLayout(pantallaDisponibilidadLayout);
        pantallaDisponibilidadLayout.setHorizontalGroup(
            pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaDisponibilidadLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarDisponibilidad)
                    .addGroup(pantallaDisponibilidadLayout.createSequentialGroup()
                        .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloDisponibilidadCapacidad)
                            .addComponent(tituloDisponibilidadSalon)
                            .addComponent(tituloDisponibilidadHoraInicial)
                            .addComponent(tituloDisponibilidadHoraFinal)
                            .addComponent(tituloDisponibilidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pantallaDisponibilidadLayout.createSequentialGroup()
                                .addComponent(campoDisponibilidadID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoDisponibilidadFecha)
                            .addComponent(campoDisponibilidadHoraInicial)
                            .addComponent(campoDisponibilidadHoraFinal)
                            .addComponent(campoDisponibilidad))))
                .addGap(13, 13, 13))
        );
        pantallaDisponibilidadLayout.setVerticalGroup(
            pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaDisponibilidadLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDisponibilidadID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloDisponibilidadSalon)
                    .addComponent(botonCargarDisponibilidad))
                .addGap(18, 18, 18)
                .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDisponibilidadFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloDisponibilidadCapacidad))
                .addGap(18, 18, 18)
                .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloDisponibilidadHoraInicial)
                    .addComponent(campoDisponibilidadHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloDisponibilidadHoraFinal)
                    .addComponent(campoDisponibilidadHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pantallaDisponibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloDisponibilidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(botonCerrarDisponibilidad)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaDisponibilidad, "card4");

        setSize(new java.awt.Dimension(453, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarRegistroActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarRegistroActionPerformed

    private void botonRegistrarSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarSalonActionPerformed
        boolean camposIncompletos
                = determinarCampoVacio(campoRegistrarID)
                || determinarCampoVacio(campoRegistrarCapacidad);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            Salon salon = new Salon(
                    campoRegistrarID.getText(),
                    campoRegistrarCapacidad.getText()
            );
            salones.registrarSalon(salon);

            mensajePantalla(conexion.getMensajeInformativo());
            this.dispose();
        }
    }//GEN-LAST:event_botonRegistrarSalonActionPerformed

    private void botonCargarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarVisualizacionActionPerformed
        String salonSeleccionado = String.valueOf(campoVisualizarID.getSelectedItem());

        for (Salon salon : listaSalones) {
            if (salon.getId().equals(salonSeleccionado) == true) {
                campoVisualizarCapacidad.setText(salon.getCapacidad());
            }
        }
    }//GEN-LAST:event_botonCargarVisualizacionActionPerformed

    private void botonCerrarVisualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarVisualizacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarVisualizacionActionPerformed

    private void botonCargarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarModificacionActionPerformed
        String salonSeleccionado = String.valueOf(campoModificarID.getSelectedItem());

        for (Salon salon : listaSalones) {
            if (salon.getId().equals(salonSeleccionado) == true) {
                campoModificarCapacidad.setText(salon.getCapacidad());
            }
        }
    }//GEN-LAST:event_botonCargarModificacionActionPerformed

    private void botonModificarSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarSalonActionPerformed
        String salonSeleccionado = String.valueOf(campoModificarID.getSelectedItem());

        for (Salon salon : listaSalones) {
            if (salon.getId().equals(salonSeleccionado) == true) {
                salon.setCapacidad(campoModificarCapacidad.getText());

                salones.modificarSalon(salon);
                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonModificarSalonActionPerformed

    private void botonCerrarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarModificacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarModificacionActionPerformed

    private void botonCargarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarEliminacionActionPerformed
        String salonSeleccionado = String.valueOf(campoEliminarID.getSelectedItem());

        for (Salon salon : listaSalones) {
            if (salon.getId().equals(salonSeleccionado) == true) {
                campoEliminarCapacidad.setText(salon.getCapacidad());
            }
        }
    }//GEN-LAST:event_botonCargarEliminacionActionPerformed

    private void botonEliminarSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarSalonActionPerformed
        String salonSeleccionado = String.valueOf(campoEliminarID.getSelectedItem());

        for (Salon salon : listaSalones) {
            if (salon.getId().equals(salonSeleccionado) == true) {
                salon.setCapacidad(campoEliminarCapacidad.getText());

                salones.eliminarSalon(salon);
                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonEliminarSalonActionPerformed

    private void botonCerrarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarEliminacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarEliminacionActionPerformed

    private void botonCargarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarDisponibilidadActionPerformed
        String salonSeleccionado = String.valueOf(campoDisponibilidadID.getSelectedItem());

        boolean camposIncompletos
                = determinarCampoVacio(campoDisponibilidadFecha)
                || determinarCampoVacio(campoDisponibilidadHoraInicial)
                || determinarCampoVacio(campoDisponibilidadHoraFinal);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            for (Salon salon : listaSalones) {
                if (salon.getId().equals(salonSeleccionado) == true) {
                    String fecha = campoDisponibilidadFecha.getText();
                    String horaInicial = campoDisponibilidadHoraInicial.getText();
                    String horaFinal = campoDisponibilidadHoraFinal.getText();

                    ArrayList<String> sesionesProgramadas = salones.verDisponibilidad(salon, fecha, horaInicial, horaFinal);
                    boolean salonDisponible = sesionesProgramadas.size() == 0;

                    if (salonDisponible) {
                        System.out.println(sesionesProgramadas.size());
                        campoDisponibilidad.setText("Disponible");
                    } else {
                        campoDisponibilidad.setText("Esta ocupado");
                    }
                }
            }
        }
    }//GEN-LAST:event_botonCargarDisponibilidadActionPerformed

    private void botonCerrarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarDisponibilidadActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarDisponibilidadActionPerformed

    private void botonCerrarFiltrarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarFiltrarDiaActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarFiltrarDiaActionPerformed

    private void botonCargarSalonesDelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarSalonesDelDiaActionPerformed
        prepararModeloLista(campoFiltrarDia);

        boolean camposIncompletos
                = determinarCampoVacio(campoFiltrarDiaFechaInicial)
                || determinarCampoVacio(campoFiltrarDiaFechaFinal);

        if (camposIncompletos) {
            mensajePantalla("camposIncompletos");
        } else {
            String salonSeleccionado = String.valueOf(campoFiltrarDiaID.getSelectedItem());
            String rangoInicial = campoFiltrarDiaFechaInicial.getText();
            String rangoFinal = campoFiltrarDiaFechaFinal.getText();

            for (Salon salon : listaSalones) {
                if (salon.getId().equals(salonSeleccionado) == true) {
                    ArrayList<String> sesionesDictadas = salones.filtrarClasesPorDia(salon, rangoInicial, rangoFinal);
                    int cantidadSesiones = sesionesDictadas.size();

                    if (cantidadSesiones == 0) {
                        modeloLista.addElement("No ha dictado sesiónes entre esas fechas en este salon.");
                    } else {
                        modeloLista.addElement("Se han dictado " + cantidadSesiones + " sesión(es) en este salon entre " + rangoInicial + " y " + rangoFinal + ".\n");
                        for (String sesion : sesionesDictadas) {
                            modeloLista.addElement("ID de la sesión: " + sesion);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_botonCargarSalonesDelDiaActionPerformed

    public static void main(String args[]) {
        /* Set the FlatLaf Dark look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception error) {
            java.util.logging.Logger.getLogger(PantallaSalones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, error);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaSalones().setVisible(true);
            }
        });
    }
    // Metodo Principal - Fin

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarDisponibilidad;
    private javax.swing.JButton botonCargarEliminacion;
    private javax.swing.JButton botonCargarModificacion;
    private javax.swing.JButton botonCargarSalonesDelDia;
    private javax.swing.JButton botonCargarVisualizacion;
    private javax.swing.JButton botonCerrarDisponibilidad;
    private javax.swing.JButton botonCerrarEliminacion;
    private javax.swing.JButton botonCerrarFiltrarDia;
    private javax.swing.JButton botonCerrarModificacion;
    private javax.swing.JButton botonCerrarRegistro;
    private javax.swing.JButton botonCerrarVisualizacion;
    private javax.swing.JButton botonEliminarSalon;
    private javax.swing.JButton botonModificarSalon;
    private javax.swing.JButton botonRegistrarSalon;
    private javax.swing.JTextField campoDisponibilidad;
    private javax.swing.JTextField campoDisponibilidadFecha;
    private javax.swing.JTextField campoDisponibilidadHoraFinal;
    private javax.swing.JTextField campoDisponibilidadHoraInicial;
    private javax.swing.JComboBox<String> campoDisponibilidadID;
    private javax.swing.JTextField campoEliminarCapacidad;
    private javax.swing.JComboBox<String> campoEliminarID;
    private javax.swing.JList<String> campoFiltrarDia;
    private javax.swing.JTextField campoFiltrarDiaFechaFinal;
    private javax.swing.JTextField campoFiltrarDiaFechaInicial;
    private javax.swing.JComboBox<String> campoFiltrarDiaID;
    private javax.swing.JTextField campoModificarCapacidad;
    private javax.swing.JComboBox<String> campoModificarID;
    private javax.swing.JTextField campoRegistrarCapacidad;
    private javax.swing.JTextField campoRegistrarID;
    private javax.swing.JTextField campoVisualizarCapacidad;
    private javax.swing.JComboBox<String> campoVisualizarID;
    private javax.swing.JScrollPane capsulaFiltrarDia;
    private javax.swing.JPanel pantallaDisponibilidad;
    private javax.swing.JPanel pantallaEliminar;
    private javax.swing.JPanel pantallaFiltrarDia;
    private javax.swing.JPanel pantallaModificar;
    private javax.swing.JPanel pantallaRegistrar;
    private javax.swing.JPanel pantallaVisualizar;
    private javax.swing.JLabel tituloDisponibilidad;
    private javax.swing.JLabel tituloDisponibilidadCapacidad;
    private javax.swing.JLabel tituloDisponibilidadHoraFinal;
    private javax.swing.JLabel tituloDisponibilidadHoraInicial;
    private javax.swing.JLabel tituloDisponibilidadSalon;
    private javax.swing.JLabel tituloEliminaCapacidad;
    private javax.swing.JLabel tituloEliminarID;
    private javax.swing.JLabel tituloFiltrarDiaFechaFinal;
    private javax.swing.JLabel tituloFiltrarDiaFechaInicial;
    private javax.swing.JLabel tituloFiltrarDiaID;
    private javax.swing.JLabel tituloModificarCapacidad;
    private javax.swing.JLabel tituloModificarID;
    private javax.swing.JLabel tituloRegistrarCapacidad;
    private javax.swing.JLabel tituloRegistrarID;
    private javax.swing.JLabel tituloVisualizarCapacidad;
    private javax.swing.JLabel tituloVisualizarSalon;
    // End of variables declaration//GEN-END:variables
}
