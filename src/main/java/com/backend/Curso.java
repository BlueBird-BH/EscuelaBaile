package com.backend;

public class Curso {
    private String id, nombre, cupo, intensidadHoras;

    public Curso(String id, String nombre, String cupo, String intensidadHoras) {
        this.id = id;
        this.nombre = nombre;
        this.cupo = cupo;
        this.intensidadHoras = intensidadHoras;
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

    public String getIntensidadHoras() {
        return intensidadHoras;
    }

    public void setIntensidadHoras(String intensidadHoras) {
        this.intensidadHoras = intensidadHoras;
    }
}
