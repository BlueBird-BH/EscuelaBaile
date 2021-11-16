package com.backend;

import java.util.ArrayList;

public class Salon {

    private String id, capacidad;
    private ConexionSQL conexion;

    public Salon() {
    }

    public Salon(String id, String capacidad) {
        this.id = id;
        this.capacidad = capacidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public ConexionSQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionSQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Salon> obtenerSalones() {
        ArrayList<Salon> salones = new ArrayList<>();
        ArrayList<String> identificaciones = conexion.obtenerDatosTabla("IDSalon", "Salones");
        ArrayList<String> capacidades = conexion.obtenerDatosTabla("CapacidadPersonas", "Salones");

        for (int salon = 0; salon < identificaciones.size(); salon++) {
            salones.add(new Salon(
                    identificaciones.get(salon),
                    capacidades.get(salon))
            );
        }
        return salones;
    }

    public void registrarSalon(Salon salon) {
        String sentencia = "INSERT INTO Salones (IDSalon, CapacidadPersonas) VALUES ("
                + salon.getId()
                + ", "
                + "'" + salon.getCapacidad() + "'"
                + ");";
        conexion.ejecutarSentencia(sentencia);
    }

    public void modificarSalon(Salon salon) {
        String sentencia = "UPDATE Salones SET"
                + " CapacidadPersonas = "
                + "'" + salon.getCapacidad() + "'"
                + " WHERE IDSalon = "
                + salon.getId()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public void eliminarSalon(Salon salon) {
        String sentencia = "DELETE FROM Salones"
                + " WHERE IDSalon = "
                + salon.getId()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }
}
