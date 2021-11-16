package com.backend;

import java.util.ArrayList;

public class Profesor {

    private String cedula, nombre, fechaNacimiento, genero, salario;
    private ConexionSQL conexion;

    public Profesor() {
    }

    public Profesor(String cedula, String nombre, String fechaNacimiento, String genero, String salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.salario = salario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public ConexionSQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionSQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Profesor> obtenerProfesores() {
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<String> cedulas = conexion.obtenerDatosTabla("CCProfesor", "Profesores");
        ArrayList<String> nombres = conexion.obtenerDatosTabla("NombreProfesor", "Profesores");
        ArrayList<String> fechasNacimiento = conexion.obtenerDatosTabla("NacimientoProfesor", "Profesores");
        ArrayList<String> generos = conexion.obtenerDatosTabla("GeneroProfesor", "Profesores");
        ArrayList<String> salarios = conexion.obtenerDatosTabla("Salario", "Profesores");

        for (int profesor = 0; profesor < cedulas.size(); profesor++) {
            profesores.add(new Profesor(
                    cedulas.get(profesor),
                    nombres.get(profesor),
                    fechasNacimiento.get(profesor),
                    generos.get(profesor),
                    salarios.get(profesor))
            );
        }
        return profesores;
    }

    public void registrarProfesor(Profesor profesor) {
        String sentencia = "INSERT INTO Profesores (CCProfesor, NombreProfesor, NacimientoProfesor, GeneroProfesor, Salario) VALUES ("
                + profesor.getCedula()
                + ", "
                + "'" + profesor.getNombre() + "'"
                + ", "
                + "'" + profesor.getFechaNacimiento() + "'"
                + ", "
                + "'" + profesor.getGenero() + "'"
                + ", "
                + "'" + profesor.getSalario() + "'"
                + ");";
        conexion.ejecutarSentencia(sentencia);
    }

    public void modificarProfesor(Profesor profesor) {
        String sentencia = "UPDATE Profesores SET"
                + " NombreProfesor = "
                + "'" + profesor.getNombre() + "'"
                + ", NacimientoProfesor = "
                + "'" + profesor.getFechaNacimiento() + "'"
                + ", GeneroProfesor = "
                + "'" + profesor.getGenero() + "'"
                + ", Salario = "
                + "'" + profesor.getSalario() + "'"
                + " WHERE CCProfesor = "
                + profesor.getCedula()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public void eliminarProfesor(Profesor profesor) {
        String sentencia = "DELETE FROM Profesores"
                + " WHERE CCProfesor = "
                + profesor.getCedula()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public ArrayList<String> verSesionesProgramadas(Profesor profesor) {
        String columna = "Sesiones.IDSesion";
        String sentencia = "SELECT " + columna
                + " FROM Sesiones"
                + " WHERE (Sesiones.CCProfesor = " + "'" + profesor.getCedula() + "'" + ")"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);     
    }
    
    public ArrayList<String> verSesionesDictadas(Profesor profesor, String rangoInicial, String rangoFinal) {
        String columna = "Sesiones.IDSesion";
        String sentencia = "SELECT " + columna
                + " FROM Sesiones"
                + " WHERE (Sesiones.CCProfesor = " + "'" + profesor.getCedula() + "'" + ")"
                + " AND (Sesiones.FechaSesion BETWEEN " + "'" + rangoInicial + "'" + " AND " + "'" + rangoFinal + "'"
                + ");";
        return conexion.obtenerDatosSentencia(sentencia, columna);     
    }
}
