package com.backend;

public class Paquete {
    private String id, numeroSesiones, vigencia, precio, idCurso;

    public Paquete(String id, String numeroSesiones, String vigencia, String precio, String idCurso) {
        this.id = id;
        this.numeroSesiones = numeroSesiones;
        this.vigencia = vigencia;
        this.precio = precio;
        this.idCurso = idCurso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroSesiones() {
        return numeroSesiones;
    }

    public void setNumeroSesiones(String numeroSesiones) {
        this.numeroSesiones = numeroSesiones;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }
}
