package com.backend;

public class Profesor {
    private String cedula, nombre, salario;

    public Profesor(String cedula, String nombre, String salario) {
        this.cedula = cedula;
        this.nombre = nombre;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
