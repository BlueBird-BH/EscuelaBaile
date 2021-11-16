package com.backend;

import java.util.ArrayList;

public class Curso {

    private String id, nombre, cupo, intensidad;
    private ConexionSQL conexion;

    public Curso() {
    }

    public Curso(String id, String nombre, String cupo, String intensidad) {
        this.id = id;
        this.nombre = nombre;
        this.cupo = cupo;
        this.intensidad = intensidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCupo() {
        return cupo;
    }

    public void setCupo(String cupo) {
        this.cupo = cupo;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(String intensidad) {
        this.intensidad = intensidad;
    }

    public ConexionSQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionSQL conexion) {
        this.conexion = conexion;
    }
    
    public ArrayList<Curso> obtenerCursos() {
        ArrayList<Curso> cursos = new ArrayList<>();

        ArrayList<String> identificaciones = conexion.obtenerDatosTabla("IDCurso", "Cursos");
        ArrayList<String> nombres = conexion.obtenerDatosTabla("NombreCurso", "Cursos");
        ArrayList<String> cupos = conexion.obtenerDatosTabla("CupoCurso", "Cursos");
        ArrayList<String> intensidad = conexion.obtenerDatosTabla("IntensidadCurso", "Cursos");

        for (int salon = 0; salon < identificaciones.size(); salon++) {
            cursos.add(new Curso(
                    identificaciones.get(salon),
                    nombres.get(salon),
                    cupos.get(salon),
                    intensidad.get(salon))
            );
        }
        return cursos;
    }
}
