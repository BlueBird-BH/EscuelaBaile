package com.frontend;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

public class Odontologo extends Empleado implements Interfaz {

    // Declaracion de Variables - Inicio
    private String tarjetaProfesional, especialidadOdontologo, pacientesOdontologo;
    private boolean plantaOdontologo;
    private Mensajes_GUI interfazGrafica_mensajeAlerta = new Mensajes_GUI();
    private Archivos seatoraPersistencia = new Archivos();
    // Declaracion de Variables - Fin

    // Declaracion de Arreglos - Inicio
    ArrayList<String> odontologosOcupados = new ArrayList<String>();
    // Declaracion de Arreglos - Fin

    // Metodos Set - Inicio
    public void set_tarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public void set_especialidadOdontologo(String especialidadOdontologo) {
        this.especialidadOdontologo = especialidadOdontologo;
    }

    public void set_pacientesOdontologo(String pacientesOdontologo) {
        this.pacientesOdontologo = pacientesOdontologo;
    }

    public void set_plantaOdontologo(boolean plantaOdontologo) {
        this.plantaOdontologo = plantaOdontologo;
    }
    // Metodos Set - Fin

    // Metodos Get - Inicio
    public String get_tarjetaProfesional() {
        return tarjetaProfesional;
    }

    public String get_especialidadOdontologo() {
        return especialidadOdontologo;
    }

    public String get_pacientesOdontologo() {
        return pacientesOdontologo;
    }

    public boolean get_plantaOdontologo() {
        return plantaOdontologo;
    }
    // Metodos Get - Fin

    // Constructor de la clase Odontologo - Inicio
    public Odontologo(String determinacionLista, String nombre, String identificacion, String fechaNacimiento, String cargoEmpleado, String tipoEmpleado,
            String salarioMensual, String tarjetaProfesional, String especialidadOdontologo, String pancientesLista, boolean plantaOdontologo) {

        super(determinacionLista, nombre, identificacion, fechaNacimiento, cargoEmpleado, tipoEmpleado, salarioMensual);
        this.set_tarjetaProfesional(tarjetaProfesional);
        this.set_especialidadOdontologo(especialidadOdontologo);
        this.set_pacientesOdontologo(pancientesLista);
        this.set_plantaOdontologo(plantaOdontologo);
    }
    // Constructor de la clase Odontologo - Fin

    // Funcion que permite registar un empleado nuevo, pero que es odontologo - Inicio
    public void registrarPersona(String determinacionLista, String nombre, String identificacion, String fechaNacimiento, String salario, String numeroTarjeta, String especialidad, boolean planta) {
        listaOdontologos.add(new Odontologo(
                "Odontologo",
                nombre,
                identificacion,
                fechaNacimiento,
                "Odontologo",
                "Odontologo",
                salario,
                numeroTarjeta,
                especialidad,
                "Sin pacientes",
                planta
        ));
    }
    // Funcion que permite registar un empleado nuevo, pero que es odontologo - Fin

    // Funcion que permite retirar a un odontologo del programa por medio de su nombre completo - Inicio
    @Override
    public void retirarPersona(JComboBox<String> variableCombo) {
        interfazGrafica_mensajeAlerta.setVisible(true);
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem()), empleadoEliminar = null;

        for (int n = 0; n < Paciente.listaPacientes.size(); n++) {
            odontologosOcupados.add(Paciente.listaPacientes.get(n).get_nombreOdontologo());
        }

        for (int n = 0; n < listaOdontologos.size(); n++) {
            if (listaOdontologos.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                empleadoEliminar = listaOdontologos.get(n).get_nombreCompleto();
            }

            if (odontologosOcupados.contains(empleadoEliminar) == true) {
                interfazGrafica_mensajeAlerta.interfazRequerida("retirarPersona_ocupadoOdontologo");
            } else {
                if (listaOdontologos.get(n).get_nombreCompleto().equals(empleadoEliminar) == true) {
                    listaOdontologos.remove(n);
                    interfazGrafica_mensajeAlerta.interfazRequerida("retirarPersona");
                    seatoraPersistencia.guardarArchivo();
                }
            }
        }
        odontologosOcupados.clear();
    }
    // Funcion que permite retirar a un odontologo del programa por medio de su nombre completo - Fin

    // Funcion que permite visualizar los detalles ingresados de un odontologo - Inicio
    @Override
    public void detallesPersona(JComboBox<String> variableCombo, JTextField nombre, JTextField nacimiento, JTextField salario, JTextField numeroTarjeta, JTextField especialidad, JTextField planta, JTextField pacientes) {
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem()), plantaOdontologo = null;

        for (int n = 0; n < listaOdontologos.size(); n++) {
            listaOdontologos.get(n).set_pacientesOdontologo("Sin pacientes");
            String odontologoNecesario = listaOdontologos.get(n).get_nombreCompleto();
            for (int nP = 0; nP < Paciente.listaPacientes.size(); nP++) {
                if (Paciente.listaPacientes.get(nP).get_nombreOdontologo().equals(odontologoNecesario) == true) {
                    if (listaOdontologos.get(n).get_pacientesOdontologo().equals("Sin pacientes") == true) {
                        listaOdontologos.get(n).set_pacientesOdontologo(Paciente.listaPacientes.get(nP).get_nombreCompleto());
                    } else {
                        if (listaOdontologos.get(n).get_pacientesOdontologo().equals(Paciente.listaPacientes.get(nP).get_nombreCompleto()) == false) {
                            String pacientesB = listaOdontologos.get(n).get_pacientesOdontologo();
                            listaOdontologos.get(n).set_pacientesOdontologo(pacientesB + ", " + Paciente.listaPacientes.get(nP).get_nombreCompleto());
                        }
                    }
                }
            }
        }

        for (int n = 0; n < listaOdontologos.size(); n++) {
            if (listaOdontologos.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                if (listaOdontologos.get(n).get_plantaOdontologo() == true) {
                    plantaOdontologo = "Si";
                } else {
                    plantaOdontologo = "No";
                }

                nombre.setText(listaOdontologos.get(n).get_nombreCompleto());
                nacimiento.setText(listaOdontologos.get(n).get_fechaNacimiento());
                salario.setText(listaOdontologos.get(n).get_salarioMensual());
                numeroTarjeta.setText(listaOdontologos.get(n).get_tarjetaProfesional());
                especialidad.setText(listaOdontologos.get(n).get_especialidadOdontologo());
                planta.setText(plantaOdontologo);
                pacientes.setText(listaOdontologos.get(n).get_pacientesOdontologo());
            }
        }
        seatoraPersistencia.guardarArchivo();
    }
    // Funcion que permite visualizar los detalles ingresados de un odontologo - Fin

    // Funcion que permite listar todos los odontologos presentes en el programa, junto con sus pacientes - Inicio
    @Override
    public void listaPersona(DefaultListModel modelo, JList<String> listaJFrame) {
        listaJFrame.setModel(modelo);
        modelo.removeAllElements();

        for (int n = 0; n < listaOdontologos.size(); n++) {
            modelo.addElement("Nombre: " + listaOdontologos.get(n).get_nombreCompleto());
            modelo.addElement("Tarjeta de Identidad: " + listaOdontologos.get(n).get_identificacion());
            modelo.addElement("Cargo del empleado: " + listaOdontologos.get(n).get_cargoEmpleado());
            modelo.addElement("Pacientes del odontologo: " + listaOdontologos.get(n).get_pacientesOdontologo());
            modelo.addElement("[==================================================]");   
        }
    }
    // Funcion que permite listar todos los odontologos presentes en el programa, junto con sus pacientes - Fin

    // Funcion toString que convierte cada valor en String para poder ser guardado y leido correctamente por el programa - Inicio
    @Override
    public String toString() {
        String separador = " - ";
        return get_determinacionLista() + separador
                + get_nombreCompleto() + separador
                + get_identificacion() + separador
                + get_fechaNacimiento() + separador
                + get_cargoEmpleado() + separador
                + get_tipoEmpleado() + separador
                + get_salarioMensual() + separador
                + get_tarjetaProfesional() + separador
                + get_especialidadOdontologo() + separador
                + get_pacientesOdontologo() + separador
                + get_plantaOdontologo();
    }
    // Funcion toString que convierte cada valor en String para poder ser guardado y leido correctamente por el programa - Fin

    // Funcion parseObjeto que convierte cada valor de texto en un objeto para poder ser leido correctamente por el programa - Inicio
    public static Odontologo parseOdontologo(String texto) {
        String[] valorLista = texto.split(" - ");

        String determinacionLista = valorLista[0];
        String nombreCompleto = valorLista[1];
        String identificacion = valorLista[2];
        String fechaNacimiento = valorLista[3];
        String cargoEmpleado = valorLista[4];
        String tipoEmpleado = valorLista[5];
        String salarioMensual = valorLista[6];
        String tarjetaProfesional = valorLista[7];
        String especialidadOdontologo = valorLista[8];
        String pacientesOdontologo = valorLista[9];
        boolean plantaOdontologo = Boolean.parseBoolean(valorLista[10]);

        return new Odontologo(determinacionLista, nombreCompleto, identificacion, fechaNacimiento, cargoEmpleado, tipoEmpleado, salarioMensual, tarjetaProfesional, especialidadOdontologo, pacientesOdontologo, plantaOdontologo);
    }
    // Funcion parseObjeto que convierte cada valor de texto en un objeto para poder ser leido correctamente por el programa - Fin
}
