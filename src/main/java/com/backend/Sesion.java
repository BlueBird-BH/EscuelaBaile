package com.backend;

import java.util.ArrayList;

public class Sesion {

    private String id, fecha, horaInicio, horaFinal, cedulaProfesor, idSalon, idCurso;
    private ConexionSQL conexion;

    public Sesion() {
    }

    public Sesion(String id, String fecha, String horaInicio, String horaFinal, String cedulaProfesor, String idSalon, String idCurso) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.cedulaProfesor = cedulaProfesor;
        this.idSalon = idSalon;
        this.idCurso = idCurso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getCedulaProfesor() {
        return cedulaProfesor;
    }

    public void setCedulaProfesor(String cedulaProfesor) {
        this.cedulaProfesor = cedulaProfesor;
    }

    public String getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(String idSalon) {
        this.idSalon = idSalon;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public ConexionSQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionSQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Sesion> obtenerSesiones() {
        ArrayList<Sesion> sesiones = new ArrayList<>();
        ArrayList<String> identificaciones = conexion.obtenerDatosTabla("IDSesion", "Sesiones");
        ArrayList<String> fechas = conexion.obtenerDatosTabla("FechaSesion", "Sesiones");
        ArrayList<String> horasInicio = conexion.obtenerDatosTabla("HoraInicio", "Sesiones");
        ArrayList<String> horasFinal = conexion.obtenerDatosTabla("HoraFin", "Sesiones");
        ArrayList<String> cedulasSesiones = conexion.obtenerDatosTabla("CCProfesor", "Sesiones");
        ArrayList<String> idSalones = conexion.obtenerDatosTabla("IDSalon", "Sesiones");
        ArrayList<String> idCursos = conexion.obtenerDatosTabla("IDCurso", "Sesiones");

        for (int sesion = 0; sesion < identificaciones.size(); sesion++) {
            sesiones.add(new Sesion(
                    identificaciones.get(sesion),
                    fechas.get(sesion),
                    horasInicio.get(sesion),
                    horasFinal.get(sesion),
                    cedulasSesiones.get(sesion),
                    idSalones.get(sesion),
                    idCursos.get(sesion))
            );
        }
        return sesiones;
    }

    public void registrarSesion(Sesion sesion) {
        String sentencia = "INSERT INTO Sesiones (IDSesion, FechaSesion, HoraInicio, HoraFin, CCProfesor, IDSalon, IDCurso) VALUES ("
                + sesion.getId()
                + ", "
                + "'" + sesion.getFecha() + "'"
                + ", "
                + "'" + sesion.getHoraInicio() + "'"
                + ", "
                + "'" + sesion.getHoraFinal() + "'"
                + ", "
                + "'" + sesion.getCedulaProfesor() + "'"
                + ", "
                + "'" + sesion.getIdSalon() + "'"
                + ", "
                + "'" + sesion.getIdCurso() + "'"
                + ");";
        conexion.ejecutarSentencia(sentencia);
    }
    
    public void modificarSesion(Sesion sesion) {
        String sentencia = "UPDATE Sesiones SET"
                + " FechaSesion = "
                + "'" + sesion.getFecha() + "'"
                + ", HoraInicio = "
                + "'" + sesion.getHoraInicio() + "'"
                + ", HoraFin = "
                + "'" + sesion.getHoraFinal() + "'"
                + ", CCProfesor = "
                + "'" + sesion.getCedulaProfesor() + "'"
                + ", IDSalon = "
                + "'" + sesion.getIdSalon() + "'"
                + ", IDCurso = "
                + "'" + sesion.getIdCurso() + "'"
                + " WHERE IDSesion = "
                + sesion.getId()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public void eliminarSesion(Sesion sesion) {
        String sentencia = "DELETE FROM Sesiones"
                + " WHERE IDSesion = "
                + sesion.getId()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }
    
    public ArrayList<String> verSesionesPorFecha(String fecha) {
        String columna = "Sesiones.IDSesion";
        String sentencia = "SELECT " + columna
                + " FROM Sesiones"
                + " WHERE (Sesiones.FechaSesion = " + "'" + fecha + "'" + ")"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);     
    }
    
    public ArrayList<String> verSesionesPorCurso(Curso curso) {
        String columna = "Sesiones.IDSesion";
        String sentencia = "SELECT " + columna
                + " FROM Sesiones"
                + " WHERE (Sesiones.IDCurso = " + "'" + curso.getId() + "'" + ")"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);     
    }
}
