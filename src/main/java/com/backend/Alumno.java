package com.backend;

import java.util.ArrayList;

public class Alumno {

    private String cedula, nombre, fechaNacimiento, genero;
    private ConexionSQL conexion;

    public Alumno() {
    }

    public Alumno(String cedula, String nombre, String fechaNacimiento, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
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

    public ConexionSQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionSQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Alumno> obtenerAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<String> cedulas = conexion.obtenerDatosTabla("CCAlumno", "Alumnos");
        ArrayList<String> nombres = conexion.obtenerDatosTabla("NombreAlumno", "Alumnos");
        ArrayList<String> fechasNacimiento = conexion.obtenerDatosTabla("NacimientoAlumno", "Alumnos");
        ArrayList<String> generos = conexion.obtenerDatosTabla("GeneroAlumno", "Alumnos");

        for (int alumno = 0; alumno < cedulas.size(); alumno++) {
            alumnos.add(new Alumno(
                    cedulas.get(alumno),
                    nombres.get(alumno),
                    fechasNacimiento.get(alumno),
                    generos.get(alumno))
            );
        }
        return alumnos;
    }

    public void registrarAlumno(Alumno alumno) {
        String sentencia = "INSERT INTO Alumnos (CCAlumno, NombreAlumno, NacimientoAlumno, GeneroAlumno) VALUES ("
                + alumno.getCedula()
                + ", "
                + "'" + alumno.getNombre() + "'"
                + ", "
                + "'" + alumno.getFechaNacimiento() + "'"
                + ", "
                + "'" + alumno.getGenero() + "'"
                + ");";
        conexion.ejecutarSentencia(sentencia);
    }

    public void modificarAlumno(Alumno alumno) {
        String sentencia = "UPDATE Alumnos SET"
                + " NombreAlumno = "
                + "'" + alumno.getNombre() + "'"
                + ", NacimientoAlumno = "
                + "'" + alumno.getFechaNacimiento() + "'"
                + ", GeneroAlumno = "
                + "'" + alumno.getGenero() + "'"
                + " WHERE CCAlumno = "
                + alumno.getCedula()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public void eliminarAlumno(Alumno alumno) {
        String sentencia = "DELETE FROM Alumnos"
                + " WHERE CCAlumno = "
                + alumno.getCedula()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }
}
