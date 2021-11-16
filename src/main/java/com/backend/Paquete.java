package com.backend;

import java.util.ArrayList;

public class Paquete {

    private String id, cantidadSesiones, vigencia, precio, idCurso;
    private ConexionSQL conexion;

    public Paquete() {
    }

    public Paquete(String id, String cantidadSesiones, String vigencia, String precio, String idCurso) {
        this.id = id;
        this.cantidadSesiones = cantidadSesiones;
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

    public String getCantidadSesiones() {
        return cantidadSesiones;
    }

    public void setCantidadSesiones(String cantidadSesiones) {
        this.cantidadSesiones = cantidadSesiones;
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

    public ConexionSQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionSQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Paquete> obtenerPaquetes() {
        ArrayList<Paquete> paquetes = new ArrayList<>();
        ArrayList<String> identificaciones = conexion.obtenerDatosTabla("IDPaquete", "Paquetes");
        ArrayList<String> numeroSesiones = conexion.obtenerDatosTabla("NumeroSesiones", "Paquetes");
        ArrayList<String> vigencias = conexion.obtenerDatosTabla("VigenciaPaquete", "Paquetes");
        ArrayList<String> precios = conexion.obtenerDatosTabla("Precio", "Paquetes");
        ArrayList<String> idCursos = conexion.obtenerDatosTabla("IDCurso", "Paquetes");

        for (int paquete = 0; paquete < identificaciones.size(); paquete++) {
            paquetes.add(new Paquete(
                    identificaciones.get(paquete),
                    numeroSesiones.get(paquete),
                    vigencias.get(paquete),
                    precios.get(paquete),
                    idCursos.get(paquete))
            );
        }
        return paquetes;
    }

    public void registrarPaquete(Paquete paquete) {
        String sentencia = "INSERT INTO Paquetes (IDPaquete, NumeroSesiones, VigenciaPaquete, Precio, IDCurso) VALUES ("
                + paquete.getId()
                + ", "
                + "'" + paquete.getCantidadSesiones() + "'"
                + ", "
                + "'" + paquete.getVigencia() + "'"
                + ", "
                + "'" + paquete.getPrecio() + "'"
                + ", "
                + "'" + paquete.getIdCurso() + "'"
                + ");";
        conexion.ejecutarSentencia(sentencia);
    }

    public void modificarPaquete(Paquete paquete) {
        String sentencia = "UPDATE Paquetes SET"
                + " NumeroSesiones = "
                + "'" + paquete.getCantidadSesiones() + "'"
                + " VigenciaPaquete = "
                + "'" + paquete.getVigencia() + "'"
                + " Precio = "
                + "'" + paquete.getPrecio() + "'"
                + " IDCurso = "
                + "'" + paquete.getIdCurso() + "'"
                + " WHERE IDPaquete = "
                + paquete.getId()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public void eliminarPaquete(Paquete paquete) {
        String sentencia = "DELETE FROM Paquetes"
                + " WHERE IDPaquete = "
                + paquete.getId()
                + ";";
        conexion.ejecutarSentencia(sentencia);
    }

    public ArrayList<String> verVentas(Paquete paquete) {
        String columna = "Compras.IDCompra";
        String sentencia = "SELECT " + columna
                + " FROM Paquetes, Compras"
                + " WHERE"
                + " (Compras.IDPaquete = Paquetes.IDPaquete)"
                + " AND"
                + " (Paquetes.IDPaquete = " + "'" + paquete.getId() + "'" + ")"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);
    }
    
    public ArrayList<String> filtrarFecha(Paquete paquete, String rangoInicial, String rangoFinal) {
        String columna = "Compras.IDCompra";
        String sentencia = "SELECT " + columna
                + " FROM Paquetes, Compras"
                + " WHERE"
                + " (Compras.IDPaquete = Paquetes.IDPaquete)"
                + " AND"
                + " (Compras.FechaCompra BETWEEN " + "'" + rangoInicial + "'" + " AND " + "'" + rangoFinal + "'" + ")"
                + " AND"
                + " (Compras.IDPaquete = " + "'" + paquete.getId() + "'" + ")"
                + ";";
        return conexion.obtenerDatosSentencia(sentencia, columna);
    }
    /*
    Select Count(Compra.IDPaquete)
from Paquete, Compra
WHERE (Compra.IDPaquete = Paquete.IDPaquete)
AND Compra.FechaCompra BETWEEN "..." AND "..."
AND Compra.IDPaquete = "..."
     */
}
