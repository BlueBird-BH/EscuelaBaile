package com.frontend;

import java.util.ArrayList;

public abstract class Persona {

    // Declaracion de Variables - Inicio
    private String determinacionLista, nombreCompleto, identificacion, fechaNacimiento;
    // Declaracion de Variables - Fin

    // Declaracion de Arreglos - Inicio
    public static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    public static ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
    public static ArrayList<Odontologo> listaOdontologos = new ArrayList<Odontologo>();
    // Declaracion de Arreglos - Fin

    // Metodos Set - Inicio
    public void set_determinacionLista(String determinacionLista) {
        this.determinacionLista = determinacionLista;
    }

    public void set_nombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void set_identificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void set_fechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    // Metodos Set - Fin

    // Metodos Get - Inicio
    public String get_determinacionLista() {
        return determinacionLista;
    }

    public String get_nombreCompleto() {
        return nombreCompleto;
    }

    public String get_identificacion() {
        return identificacion;
    }

    public String get_fechaNacimiento() {
        return fechaNacimiento;
    }
    // Metodos Get - Fin

    // Metodo abstracto que permite registrar una persona - Inicio
    public abstract void registrarPersona();
    // Metodo abstracto que permite registrar una persona - Fin

    // Metodo abstracto que permite modificar los detalles de una persona - Inicio
    public abstract void modificarPersona();
    // Metodo abstracto que permite modificar los detalles de una persona - Fin

    // Constructor - Inicio
    public Persona(String determinacionLista, String nombre, String identificacion, String fecha) {
        this.set_determinacionLista(determinacionLista);
        this.set_nombreCompleto(nombre);
        this.set_identificacion(identificacion);
        this.set_fechaNacimiento(fecha);
    }
    // Constructor - Fin
}
