package com.frontend;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

public class Paciente extends Persona implements Interfaz {

    // Declaracion de Variables - Inicio
    private String fechaInicio, fechaFin, tratamientoRealizado, diagnosticoRealizado, nombreOdontologo;
    // Declaracion de Variables - Fin

    // Metodos Set - Inicio
    public void set_fechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void set_fechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void set_tratamientoRealizado(String tratamientoRealizado) {
        this.tratamientoRealizado = tratamientoRealizado;
    }

    public void set_diagnosticoRealizado(String diagnosticoRealizado) {
        this.diagnosticoRealizado = diagnosticoRealizado;
    }

    public void set_nombreOdontologo(String nombreOdontologo) {
        this.nombreOdontologo = nombreOdontologo;
    }
    // Metodos Set - Fin

    // Metodos Get - Inicio
    public String get_fechaInicio() {
        return fechaInicio;
    }

    public String get_fechaFin() {
        return fechaFin;
    }

    public String get_tratamientoRealizado() {
        return tratamientoRealizado;
    }

    public String get_diagnosticoRealizado() {
        return diagnosticoRealizado;
    }

    public String get_nombreOdontologo() {
        return nombreOdontologo;
    }
    // Metodos Get - Fin

    // Constructor de la clase Paciente - Inicio
    public Paciente(String determinacionLista, String nombre, String identificacion, String fechaNacimiento, String inicio, String finalizado, String tratamiento, String diagnostico, String odontologo) {
        super(determinacionLista, nombre, identificacion, fechaNacimiento);
        this.set_fechaInicio(inicio);
        this.set_fechaFin(finalizado);
        this.set_tratamientoRealizado(tratamiento);
        this.set_diagnosticoRealizado(diagnostico);
        this.set_nombreOdontologo(odontologo);
    }
    // Constructor de la clase Paciente - Fin

    // Funcion que permite registar un paciente nuevo - Inicio
    public void registrarPersona(String determinacionLista, String nombre, String identificacion, String fechaNacimiento, String inicio, String finalizado, String tratamiento, String diagnostico, String odontologo) {
        listaPacientes.add(new Paciente(
                determinacionLista,
                nombre,
                identificacion,
                fechaNacimiento,
                inicio,
                finalizado,
                tratamiento,
                diagnostico,
                odontologo
        ));
    }
    // Funcion que permite registar un paciente nuevo - Fin

    // Funcion que permite modificar los detalles de un paciente - Inicio
    public void modificarPersona(JComboBox<String> variableCombo, JTextField nombreOdontologo) {
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem());
        String odontologoNuevo = nombreOdontologo.getText();

        for (int n = 0; n < listaPacientes.size(); n++) {
            if (listaPacientes.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                listaPacientes.get(n).set_nombreOdontologo(odontologoNuevo);
            }
        }
    }
    // Funcion que permite modificar los detalles de un paciente - Fin

    // Funcion que permite dar de alta a un paciente del programa por medio de su documento de identidad - Inicio
    @Override
    public void retirarPersona(JComboBox<String> variableCombo) {
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem());

        for (int n = 0; n < listaPacientes.size(); n++) {
            if (listaPacientes.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                listaPacientes.remove(n);
            }
        }
    }
    // Funcion que permite dar de alta a un paciente del programa por medio de su documento de identidad - Fin

    // Funcion que permite visualizar los detalles ingresados de un paciente - Inicio
    @Override
    public void detallesPersona(JComboBox<String> variableCombo, JTextField nombre, JTextField nacimiento, JTextField inicioTratamiento, JTextField finalTratamiento, JTextField tratamientoRealizado, JTextField diagnostico, JTextField odontologo) {
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem());

        for (int n = 0; n < listaPacientes.size(); n++) {
            if (listaPacientes.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                nombre.setText(listaPacientes.get(n).get_nombreCompleto());
                nacimiento.setText(listaPacientes.get(n).get_fechaNacimiento());
                inicioTratamiento.setText(listaPacientes.get(n).get_fechaInicio());
                finalTratamiento.setText(listaPacientes.get(n).get_fechaFin());
                tratamientoRealizado.setText(listaPacientes.get(n).get_tratamientoRealizado());
                diagnostico.setText(listaPacientes.get(n).get_diagnosticoRealizado());
                odontologo.setText(listaPacientes.get(n).get_nombreOdontologo());
            }
        }
    }
    // Funcion que permite visualizar los detalles ingresados de un paciente - Fin

    // Funcion que permite listar todos los pacientes presentes en el programa - Inicio
    @Override
    public void listaPersona(DefaultListModel modelo, JList<String> listaJFrame) {
        listaJFrame.setModel(modelo);
        modelo.removeAllElements();

        for (int n = 0; n < listaPacientes.size(); n++) {
            modelo.addElement("Nombre: " + listaPacientes.get(n).get_nombreCompleto());
            modelo.addElement("Tarjeta de Identidad: " + listaPacientes.get(n).get_identificacion());
            modelo.addElement("[==================================================]");   
        }
    }
    // Funcion que permite listar todos los pacientes presentes en el programa - Fin

    // Funcion toString que convierte cada valor en String para poder ser guardado y leido correctamente por el programa - Inicio
    @Override
    public String toString() {
        String separador = " - ";
        return get_determinacionLista() + separador
                + get_nombreCompleto() + separador
                + get_identificacion() + separador
                + get_fechaNacimiento() + separador
                + get_fechaInicio() + separador
                + get_fechaFin() + separador
                + get_tratamientoRealizado() + separador
                + get_diagnosticoRealizado() + separador
                + get_nombreOdontologo();
    }
    // Funcion toString que convierte cada valor en String para poder ser guardado y leido correctamente por el programa - Fin

    // Funcion parseObjeto que convierte cada valor de texto en un objeto para poder ser leido correctamente por el programa - Inicio
    public static Paciente parsePaciente(String texto) {
        String[] valorLista = texto.split(" - ");

        String determinacionLista = valorLista[0];
        String nombreCompleto = valorLista[1];
        String identificacion = valorLista[2];
        String fechaNacimiento = valorLista[3];
        String fechaInicio = valorLista[4];
        String fechaFin = valorLista[5];
        String tratamientoRealizado = valorLista[6];
        String diagnosticoRealizado = valorLista[7];
        String nombreOdontologo = valorLista[8];

        return new Paciente(determinacionLista, nombreCompleto, identificacion, fechaNacimiento, fechaInicio, fechaFin, tratamientoRealizado, diagnosticoRealizado, nombreOdontologo);
    }
    // Funcion parseObjeto que convierte cada valor de texto en un objeto para poder ser leido correctamente por el programa - Fin

    @Override
    public void registrarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
