package com.backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + " NombreAlumno = " + "'" + alumno.getNombre() + "'"
                + ","
                + " NacimientoAlumno = " + "'" + alumno.getFechaNacimiento() + "'"
                + ","
                + " GeneroAlumno = " + "'" + alumno.getGenero() + "'"
                + " WHERE CCAlumno = " + alumno.getCedula() + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public void verPaquetes(Alumno alumno) {
        String sentencia = "SELECT Compras.IDPaquete FROM Alumnos, Compras"
                + " WHERE (Compras.CCAlumno = Alumnos.CCAlumno)"
                + " AND (Alumnos.CCAlumno = '" + alumno.getCedula() + "'"
                + ");";
        conexion.ejecutarSentencia(sentencia);
    }

    public void eliminarAlumno(Alumno alumno) {
        String sentencia = "DELETE FROM Alumnos"
                + " WHERE CCAlumno = " + alumno.getCedula() + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public void comprarPaquete(Paquete paquete, Alumno alumno) {
        String sentencia = "INSERT INTO Compras (IDCompra, FechaCompra, IDPaquete, CCAlumno) VALUES ("
                + conexion.generarValorAleatorio()
                + ", "
                + "CURDATE()"
                + ", "
                + "'" + paquete.getId() + "'"
                + ", "
                + "'" + alumno.getCedula() + "'"
                + ");";
        conexion.ejecutarSentencia(sentencia);
    }

    public ArrayList<String> verClasesAsistidas(Alumno alumno) {
        String columna = "Asistencias.IDSesion";
        String sentencia = "SELECT " + columna
                + " FROM Alumnos, Sesiones, Asistencias"
                + " WHERE (Asistencias.CCAlumno = Alumnos.CCAlumno)"
                + " AND (Asistencias.IDSesion = Sesiones.IDSesion)"
                + " AND (Alumnos.CCAlumno = " + "'" + alumno.getCedula() + "'" + ")"
                + " GROUP by Asistencias.IDSesion"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);
    }

    public ArrayList<String> verClasesPendientes(Alumno alumno) {
        String columna = "Sesiones.IDSesion";
        String sentencia = "SELECT " + columna
                + " FROM Alumnos, Sesiones, Cursos, Compras, Paquetes"
                + " WHERE"
                + " (Alumnos.CCAlumno = " + "'" + alumno.getCedula() + "'" + ")"
                + " AND"
                + " (Sesiones.IDCurso = Cursos.IDCurso)"
                + " AND"
                + " (Sesiones.IDSesion NOT IN ("
                + " SELECT Asistencias.IDSesion"
                + " FROM Alumnos, Sesiones, Cursos, Asistencias"
                + " WHERE"
                + " (Asistencias.CCAlumno = " + "'" + alumno.getCedula() + "'" + ")"
                + " AND (Asistencias.IDSesion = Sesiones.IDSesion)"
                + " AND (Sesiones.IDCurso = Cursos.IDCurso)"
                + " GROUP by Asistencias.IDSesion))"
                + " AND (Compras.CCAlumno = " + "'" + alumno.getCedula() + "'" + ")"
                + " AND (Compras.IDPaquete = Paquetes.IDPaquete)"
                + " AND (Paquetes.IDCurso = Cursos.IDCurso)"
                + " GROUP by Sesiones.IDSesion"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);
    }

    public ArrayList<String> verPaquetesAdquiridos(Alumno alumno) {
        String columna = "Compras.IDPaquete";
        String sentencia = "SELECT " + columna
                + " FROM Alumnos, Compras"
                + " WHERE (Compras.CCAlumno = Alumnos.CCAlumno)"
                + " AND (Alumnos.CCAlumno = " + "'" + alumno.getCedula() + "'" + ")"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);
    }
}
