package com.frontend;

import com.backend.Alumno;
import com.backend.ConexionSQL;
import com.backend.Paquete;
import com.formdev.flatlaf.FlatDarkLaf;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PantallaAlumnos extends javax.swing.JFrame {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private ArrayList<Paquete> listaPaquetes = new ArrayList<>();
    private DefaultListModel modeloLista = new DefaultListModel();
    private Alumno alumnos = new Alumno();
    private Paquete paquetes = new Paquete();

    private ConexionSQL conexion = new ConexionSQL();
    private VentanasEmergentes ventanaEmergente = new VentanasEmergentes();

    public PantallaAlumnos() {
        initComponents();
    }

    public void definirConexion(ConexionSQL conexion) {
        this.conexion = conexion;
        alumnos.setConexion(conexion);
        paquetes.setConexion(conexion);
    }

    private void mensajePantalla(String ventana) {
        ventanaEmergente.setVisible(true);
        ventanaEmergente.ventanaRequerida(ventana);
    }

    private void cargarAlumnos(javax.swing.JComboBox<String> comboBox) {
        listaAlumnos = alumnos.obtenerAlumnos();
        comboBox.removeAllItems();

        listaAlumnos.forEach(alumno -> {
            comboBox.addItem(alumno.getCedula());
        });
    }

    private void cargarPaquetes(javax.swing.JComboBox<String> comboBox) {
        listaPaquetes = paquetes.obtenerPaquetes();
        comboBox.removeAllItems();

        listaPaquetes.forEach(paquete -> {
            comboBox.addItem(paquete.getId());
        });
    }

    private void prepararModeloLista(javax.swing.JList<String> campo) {
        campo.setModel(modeloLista);
        modeloLista.removeAllElements();
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

    private void ocultarPantallas() {
        pantallaRegistrar.setVisible(false);
        pantallaVisualizar.setVisible(false);
        pantallaModificar.setVisible(false);
        pantallaEliminar.setVisible(false);
        pantallaComprar.setVisible(false);
        pantallaClasesAsistidas.setVisible(false);
        pantallaPaquetesAdquiridos.setVisible(false);
    }

    public void pantallaRequerida(String barraRequerida) {
        ocultarPantallas();

        switch (barraRequerida) {
            case "ingresarDatos":
                campoRegistrarNombre.setText(null);
                campoRegistrarCedula.setText(null);
                campoRegistrarFechaNacimiento.setText(null);
                cargarGeneros(campoRegistrarGenero);

                pantallaRegistrar.setVisible(true);
                break;

            case "verDatos":
                cargarAlumnos(campoVisualizarCedula);
                campoVisualizarNombre.setText(null);
                campoVisualizarNombre.setEditable(false);

                campoVisualizarFechaNacimiento.setText(null);
                campoVisualizarFechaNacimiento.setEditable(false);

                campoVisualizarGenero.setText(null);
                campoVisualizarGenero.setEditable(false);

                pantallaVisualizar.setVisible(true);
                break;

            case "modificarDatos":
                cargarAlumnos(campoModificarCedula);
                campoModificarNombre.setText(null);
                campoModificarFechaNacimiento.setText(null);
                campoModificarGenero.removeAllItems();

                pantallaModificar.setVisible(true);
                break;

            case "eliminarAlumno":
                cargarAlumnos(campoEliminarCedula);
                campoEliminarNombre.setText(null);
                campoEliminarNombre.setEditable(false);

                campoEliminarFechaNacimiento.setText(null);
                campoEliminarFechaNacimiento.setEditable(false);

                campoEliminarGenero.setText(null);
                campoEliminarGenero.setEditable(false);

                pantallaEliminar.setVisible(true);
                break;

            case "comprarPaquete":
                cargarAlumnos(campoComprarCedula);
                cargarPaquetes(campoComprarPaquete);
                campoComprarPrecio.setText(null);
                campoComprarPrecio.setEditable(false);

                pantallaComprar.setVisible(true);

            case "clasesAsistidas":
                prepararModeloLista(campoListaClases);
                cargarAlumnos(campoListarClasesCedula);
                
                pantallaClasesAsistidas.setVisible(true);
            
            case "paquetesAdquiridos":
                prepararModeloLista(campoListaPaquetes);
                cargarAlumnos(campoPaquetesCedula);
                
                pantallaPaquetesAdquiridos.setVisible(true);
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
        pantallaComprar = new javax.swing.JPanel();
        tituloComprarCedula = new javax.swing.JLabel();
        tituloComprarPaquete = new javax.swing.JLabel();
        tituloComprarPrecio = new javax.swing.JLabel();
        campoComprarCedula = new javax.swing.JComboBox<>();
        botonCargarCompra = new javax.swing.JButton();
        campoComprarPaquete = new javax.swing.JComboBox<>();
        campoComprarPrecio = new javax.swing.JTextField();
        botonCerrarCompra = new javax.swing.JButton();
        botonComprarPaquete = new javax.swing.JButton();
        pantallaClasesAsistidas = new javax.swing.JPanel();
        tituloListarClasesCedula = new javax.swing.JLabel();
        campoListarClasesCedula = new javax.swing.JComboBox<>();
        botonCargarListadoClases = new javax.swing.JButton();
        capsulaListaClases = new javax.swing.JScrollPane();
        campoListaClases = new javax.swing.JList<>();
        botonCerrarListadoClases = new javax.swing.JButton();
        pantallaClasesPendientes = new javax.swing.JPanel();
        tituloListarCedula1 = new javax.swing.JLabel();
        campoListarCedula1 = new javax.swing.JComboBox<>();
        botonCargarListado1 = new javax.swing.JButton();
        capsulalLista1 = new javax.swing.JScrollPane();
        campoLista1 = new javax.swing.JList<>();
        botonCerrarListado1 = new javax.swing.JButton();
        pantallaPaquetesAdquiridos = new javax.swing.JPanel();
        tituloListarPaquetesCedula = new javax.swing.JLabel();
        campoPaquetesCedula = new javax.swing.JComboBox<>();
        botonCargarListadoPaquetes = new javax.swing.JButton();
        capsulaListaPaquetes = new javax.swing.JScrollPane();
        campoListaPaquetes = new javax.swing.JList<>();
        botonCerrarListadoPaquetes = new javax.swing.JButton();

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
                .addContainerGap(13, Short.MAX_VALUE)
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
                .addContainerGap(92, Short.MAX_VALUE)
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
                .addContainerGap(29, Short.MAX_VALUE)
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
                .addContainerGap(62, Short.MAX_VALUE)
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
                .addContainerGap(29, Short.MAX_VALUE)
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
                .addContainerGap(62, Short.MAX_VALUE)
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
                .addGap(30, 30, 30)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloEliminarGenero)
                    .addComponent(campoEliminarGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(pantallaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarEliminacion)
                    .addComponent(botonEliminarAlumno))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaEliminar, "card4");

        pantallaComprar.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaComprar.setMinimumSize(new java.awt.Dimension(300, 300));
        pantallaComprar.setPreferredSize(new java.awt.Dimension(453, 373));

        tituloComprarCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloComprarCedula.setText("Documento de identidad");

        tituloComprarPaquete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloComprarPaquete.setText("ID del paquete");

        tituloComprarPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloComprarPrecio.setText("Precio del paquete");

        botonCargarCompra.setText("Cargar");
        botonCargarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarCompraActionPerformed(evt);
            }
        });

        botonCerrarCompra.setText("Regresar");
        botonCerrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarCompraActionPerformed(evt);
            }
        });

        botonComprarPaquete.setText("Comprar paquete");
        botonComprarPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarPaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaComprarLayout = new javax.swing.GroupLayout(pantallaComprar);
        pantallaComprar.setLayout(pantallaComprarLayout);
        pantallaComprarLayout.setHorizontalGroup(
            pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaComprarLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pantallaComprarLayout.createSequentialGroup()
                        .addComponent(botonComprarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCerrarCompra))
                    .addGroup(pantallaComprarLayout.createSequentialGroup()
                        .addGroup(pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloComprarPrecio)
                            .addComponent(tituloComprarPaquete)
                            .addComponent(tituloComprarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoComprarPrecio)
                            .addComponent(campoComprarCedula, 0, 210, Short.MAX_VALUE)
                            .addGroup(pantallaComprarLayout.createSequentialGroup()
                                .addComponent(campoComprarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCargarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(13, 13, 13))
        );
        pantallaComprarLayout.setVerticalGroup(
            pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaComprarLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoComprarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloComprarCedula))
                .addGap(30, 30, 30)
                .addGroup(pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloComprarPaquete)
                    .addComponent(campoComprarPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargarCompra))
                .addGap(30, 30, 30)
                .addGroup(pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoComprarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloComprarPrecio))
                .addGap(133, 133, 133)
                .addGroup(pantallaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCerrarCompra)
                    .addComponent(botonComprarPaquete))
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaComprar, "card4");

        pantallaClasesAsistidas.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaClasesAsistidas.setMinimumSize(new java.awt.Dimension(300, 300));

        tituloListarClasesCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloListarClasesCedula.setText("Documento de identidad");

        botonCargarListadoClases.setText("Cargar");
        botonCargarListadoClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarListadoClasesActionPerformed(evt);
            }
        });

        capsulaListaClases.setViewportView(campoListaClases);

        botonCerrarListadoClases.setText("Regresar");
        botonCerrarListadoClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarListadoClasesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaClasesAsistidasLayout = new javax.swing.GroupLayout(pantallaClasesAsistidas);
        pantallaClasesAsistidas.setLayout(pantallaClasesAsistidasLayout);
        pantallaClasesAsistidasLayout.setHorizontalGroup(
            pantallaClasesAsistidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaClasesAsistidasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pantallaClasesAsistidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarListadoClases)
                    .addGroup(pantallaClasesAsistidasLayout.createSequentialGroup()
                        .addComponent(tituloListarClasesCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoListarClasesCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCargarListadoClases))
                    .addComponent(capsulaListaClases, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pantallaClasesAsistidasLayout.setVerticalGroup(
            pantallaClasesAsistidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaClasesAsistidasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pantallaClasesAsistidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargarListadoClases)
                    .addComponent(campoListarClasesCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloListarClasesCedula))
                .addGap(18, 18, 18)
                .addComponent(capsulaListaClases, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarListadoClases)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaClasesAsistidas, "card4");

        pantallaClasesPendientes.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaClasesPendientes.setMinimumSize(new java.awt.Dimension(300, 300));

        tituloListarCedula1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloListarCedula1.setText("Documento de identidad");

        botonCargarListado1.setText("Cargar");
        botonCargarListado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarListado1ActionPerformed(evt);
            }
        });

        capsulalLista1.setViewportView(campoLista1);

        botonCerrarListado1.setText("Regresar");
        botonCerrarListado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarListado1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaClasesPendientesLayout = new javax.swing.GroupLayout(pantallaClasesPendientes);
        pantallaClasesPendientes.setLayout(pantallaClasesPendientesLayout);
        pantallaClasesPendientesLayout.setHorizontalGroup(
            pantallaClasesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaClasesPendientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pantallaClasesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarListado1)
                    .addGroup(pantallaClasesPendientesLayout.createSequentialGroup()
                        .addComponent(tituloListarCedula1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoListarCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCargarListado1))
                    .addComponent(capsulalLista1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pantallaClasesPendientesLayout.setVerticalGroup(
            pantallaClasesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaClasesPendientesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pantallaClasesPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargarListado1)
                    .addComponent(campoListarCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloListarCedula1))
                .addGap(18, 18, 18)
                .addComponent(capsulalLista1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarListado1)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaClasesPendientes, "card4");

        pantallaPaquetesAdquiridos.setMaximumSize(new java.awt.Dimension(300, 300));
        pantallaPaquetesAdquiridos.setMinimumSize(new java.awt.Dimension(300, 300));

        tituloListarPaquetesCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloListarPaquetesCedula.setText("Documento de identidad");

        botonCargarListadoPaquetes.setText("Cargar");
        botonCargarListadoPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarListadoPaquetesActionPerformed(evt);
            }
        });

        capsulaListaPaquetes.setViewportView(campoListaPaquetes);

        botonCerrarListadoPaquetes.setText("Regresar");
        botonCerrarListadoPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarListadoPaquetesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaPaquetesAdquiridosLayout = new javax.swing.GroupLayout(pantallaPaquetesAdquiridos);
        pantallaPaquetesAdquiridos.setLayout(pantallaPaquetesAdquiridosLayout);
        pantallaPaquetesAdquiridosLayout.setHorizontalGroup(
            pantallaPaquetesAdquiridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaPaquetesAdquiridosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pantallaPaquetesAdquiridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarListadoPaquetes)
                    .addGroup(pantallaPaquetesAdquiridosLayout.createSequentialGroup()
                        .addComponent(tituloListarPaquetesCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoPaquetesCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCargarListadoPaquetes))
                    .addComponent(capsulaListaPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pantallaPaquetesAdquiridosLayout.setVerticalGroup(
            pantallaPaquetesAdquiridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaPaquetesAdquiridosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pantallaPaquetesAdquiridosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargarListadoPaquetes)
                    .addComponent(campoPaquetesCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloListarPaquetesCedula))
                .addGap(18, 18, 18)
                .addComponent(capsulaListaPaquetes, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarListadoPaquetes)
                .addGap(30, 30, 30))
        );

        getContentPane().add(pantallaPaquetesAdquiridos, "card4");

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
        String alumnoSeleccionado = String.valueOf(campoVisualizarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
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
        String alumnoSeleccionado = String.valueOf(campoModificarCedula.getSelectedItem());
        cargarGeneros(campoModificarGenero);

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
                campoModificarNombre.setText(alumno.getNombre());
                campoModificarFechaNacimiento.setText(alumno.getFechaNacimiento());
                campoModificarGenero.setSelectedItem(alumno.getGenero());
            }
        }
    }//GEN-LAST:event_botonCargarModificacionActionPerformed

    private void botonModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarAlumnoActionPerformed
        String alumnoSeleccionado = String.valueOf(campoModificarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
                alumno.setNombre(campoModificarNombre.getText());
                alumno.setFechaNacimiento(campoModificarFechaNacimiento.getText());
                alumno.setGenero(String.valueOf(campoModificarGenero.getSelectedItem()));
                alumnos.modificarAlumno(alumno);

                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonModificarAlumnoActionPerformed

    private void botonCerrarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarModificacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarModificacionActionPerformed

    private void botonCargarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarEliminacionActionPerformed
        String alumnoSeleccionado = String.valueOf(campoEliminarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
                campoEliminarNombre.setText(alumno.getNombre());
                campoEliminarFechaNacimiento.setText(alumno.getFechaNacimiento());
                campoEliminarGenero.setText(alumno.getGenero());
            }
        }
    }//GEN-LAST:event_botonCargarEliminacionActionPerformed

    private void botonEliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAlumnoActionPerformed
        String alumnoSeleccionado = String.valueOf(campoEliminarCedula.getSelectedItem());

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
                alumno.setNombre(campoEliminarNombre.getText());
                alumno.setFechaNacimiento(campoEliminarFechaNacimiento.getText());
                alumno.setGenero(campoEliminarGenero.getText());
                alumnos.eliminarAlumno(alumno);

                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonEliminarAlumnoActionPerformed

    private void botonCerrarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarEliminacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarEliminacionActionPerformed

    private void botonCerrarListadoClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarListadoClasesActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarListadoClasesActionPerformed

    private void botonCerrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarCompraActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarCompraActionPerformed

    private void botonComprarPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarPaqueteActionPerformed
        String alumnoSeleccionado = String.valueOf(campoComprarCedula.getSelectedItem());
        String paqueteSeleccionado = String.valueOf(campoComprarPaquete.getSelectedItem());
        int indicePaqueteSeleccionado = 0;

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                indicePaqueteSeleccionado = listaPaquetes.indexOf(paquete);
            }
        }

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
                Paquete paquete = listaPaquetes.get(indicePaqueteSeleccionado);
                alumnos.comprarPaquete(paquete, alumno);

                mensajePantalla(conexion.getMensajeInformativo());
            }
        }
        this.dispose();
    }//GEN-LAST:event_botonComprarPaqueteActionPerformed

    private void botonCargarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarCompraActionPerformed
        String paqueteSeleccionado = String.valueOf(campoComprarPaquete.getSelectedItem());

        for (Paquete paquete : listaPaquetes) {
            if (paquete.getId().equals(paqueteSeleccionado) == true) {
                campoComprarPrecio.setText(paquete.getPrecio());
            }
        }
    }//GEN-LAST:event_botonCargarCompraActionPerformed

    private void botonCargarListadoClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarListadoClasesActionPerformed
        String alumnoSeleccionado = String.valueOf(campoListarClasesCedula.getSelectedItem());
        prepararModeloLista(campoListaClases);

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
                ArrayList<String> clasesAsistidas = alumnos.verClasesAsistidas(alumno);
                int cantidadClases = clasesAsistidas.size();
                
                if (cantidadClases == 0) {
                    modeloLista.addElement("No se ha asistido a ninguna sesión");
                } else {
                    modeloLista.addElement(alumno.getNombre() + " ha asistido a " + cantidadClases + " sesión(es).\n");
                    for (String sesion: clasesAsistidas) {
                        modeloLista.addElement("ID de la sesión: " + sesion);
                    }
                }
            }
        }
    }//GEN-LAST:event_botonCargarListadoClasesActionPerformed

    private void botonCargarListado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarListado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCargarListado1ActionPerformed

    private void botonCerrarListado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarListado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCerrarListado1ActionPerformed

    private void botonCargarListadoPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarListadoPaquetesActionPerformed
        String alumnoSeleccionado = String.valueOf(campoPaquetesCedula.getSelectedItem());
        prepararModeloLista(campoListaPaquetes);

        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCedula().equals(alumnoSeleccionado) == true) {
                ArrayList<String> paquetesAdquiridos = alumnos.verPaquetesAdquiridos(alumno);
                int cantidadPaquetes = paquetesAdquiridos.size();
                
                if (cantidadPaquetes == 0) {
                    modeloLista.addElement("No se tiene ningun paquete activo actualmente");
                } else {
                    modeloLista.addElement(alumno.getNombre() + " ha adquirido " + cantidadPaquetes + " paquete(s).\n");
                    for (int paquete = 0; paquete < cantidadPaquetes; paquete++) {
                        int numeroPaquete = paquete + 1;
                        modeloLista.addElement("ID del paquete " + numeroPaquete + ": " + paquetesAdquiridos.get(paquete));
                    }
                }
            }
        }
    }//GEN-LAST:event_botonCargarListadoPaquetesActionPerformed

    private void botonCerrarListadoPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarListadoPaquetesActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarListadoPaquetesActionPerformed

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
    private javax.swing.JButton botonCargarCompra;
    private javax.swing.JButton botonCargarEliminacion;
    private javax.swing.JButton botonCargarListado1;
    private javax.swing.JButton botonCargarListadoClases;
    private javax.swing.JButton botonCargarListadoPaquetes;
    private javax.swing.JButton botonCargarModificacion;
    private javax.swing.JButton botonCargarVisualizacion;
    private javax.swing.JButton botonCerrarCompra;
    private javax.swing.JButton botonCerrarEliminacion;
    private javax.swing.JButton botonCerrarListado1;
    private javax.swing.JButton botonCerrarListadoClases;
    private javax.swing.JButton botonCerrarListadoPaquetes;
    private javax.swing.JButton botonCerrarModificacion;
    private javax.swing.JButton botonCerrarRegistro;
    private javax.swing.JButton botonCerrarVisualizacion;
    private javax.swing.JButton botonComprarPaquete;
    private javax.swing.JButton botonEliminarAlumno;
    private javax.swing.JButton botonModificarAlumno;
    private javax.swing.JButton botonRegistrarAlumno;
    private javax.swing.JComboBox<String> campoComprarCedula;
    private javax.swing.JComboBox<String> campoComprarPaquete;
    private javax.swing.JTextField campoComprarPrecio;
    private javax.swing.JComboBox<String> campoEliminarCedula;
    private javax.swing.JTextField campoEliminarFechaNacimiento;
    private javax.swing.JTextField campoEliminarGenero;
    private javax.swing.JTextField campoEliminarNombre;
    private javax.swing.JList<String> campoLista1;
    private javax.swing.JList<String> campoListaClases;
    private javax.swing.JList<String> campoListaPaquetes;
    private javax.swing.JComboBox<String> campoListarCedula1;
    private javax.swing.JComboBox<String> campoListarClasesCedula;
    private javax.swing.JComboBox<String> campoModificarCedula;
    private javax.swing.JTextField campoModificarFechaNacimiento;
    private javax.swing.JComboBox<String> campoModificarGenero;
    private javax.swing.JTextField campoModificarNombre;
    private javax.swing.JComboBox<String> campoPaquetesCedula;
    private javax.swing.JTextField campoRegistrarCedula;
    private javax.swing.JTextField campoRegistrarFechaNacimiento;
    private javax.swing.JComboBox<String> campoRegistrarGenero;
    private javax.swing.JTextField campoRegistrarNombre;
    private javax.swing.JComboBox<String> campoVisualizarCedula;
    private javax.swing.JTextField campoVisualizarFechaNacimiento;
    private javax.swing.JTextField campoVisualizarGenero;
    private javax.swing.JTextField campoVisualizarNombre;
    private javax.swing.JScrollPane capsulaListaClases;
    private javax.swing.JScrollPane capsulaListaPaquetes;
    private javax.swing.JScrollPane capsulalLista1;
    private javax.swing.JPanel pantallaClasesAsistidas;
    private javax.swing.JPanel pantallaClasesPendientes;
    private javax.swing.JPanel pantallaComprar;
    private javax.swing.JPanel pantallaEliminar;
    private javax.swing.JPanel pantallaModificar;
    private javax.swing.JPanel pantallaPaquetesAdquiridos;
    private javax.swing.JPanel pantallaRegistrar;
    private javax.swing.JPanel pantallaVisualizar;
    private javax.swing.JLabel tituloComprarCedula;
    private javax.swing.JLabel tituloComprarPaquete;
    private javax.swing.JLabel tituloComprarPrecio;
    private javax.swing.JLabel tituloEliminarCedula;
    private javax.swing.JLabel tituloEliminarFechaNacimiento;
    private javax.swing.JLabel tituloEliminarGenero;
    private javax.swing.JLabel tituloEliminarNombre;
    private javax.swing.JLabel tituloListarCedula1;
    private javax.swing.JLabel tituloListarClasesCedula;
    private javax.swing.JLabel tituloListarPaquetesCedula;
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
