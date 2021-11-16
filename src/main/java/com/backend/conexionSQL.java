package com.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class ConexionSQL {

    private Connection conexion = null;
    private String mensajeInformativo = "Error desconocido con la conexion";

    public ConexionSQL() {
    }

    public String getMensajeInformativo() {
        return mensajeInformativo;
    }

    public void setMensajeInformativo(String mensajeInformativo) {
        this.mensajeInformativo = mensajeInformativo;
    }
    
    public void establecerConexion() {
        try {
            String url = "jdbc:mysql://remotemysql.com/EmTvGOXF3P";
            String usuario = "EmTvGOXF3P";
            String clave = "huf5uABmbI";

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);

        } catch (SQLException | ClassNotFoundException error) {
            mensajeInformativo = error.getMessage();
            System.out.println("La conexion con la base de datos fallo: " + error.getMessage());
        }

        if (conexion != null) {
            System.out.println("Conexion a base de datos establecida correctamente");
        }
    }

    public void cerrarConexion() {
        conexion = null;
        System.out.println("La conexion con la base de datos fue cerrada");
    }

    public void ejecutarSentencia(String sentencia) {
        try (PreparedStatement stmt = conexion.prepareStatement(sentencia)) {
            stmt.executeUpdate();
            mensajeInformativo = "Los cambios fueron ejecutados exitosamente";

        } catch (SQLException error) {
            mensajeInformativo = error.getMessage();
            System.out.println("Error en la ejecución: " + error.getErrorCode() + " " + error.getMessage());
        }
    }

    public ArrayList<String> obtenerDatosTabla(String datos, String tabla) {
        ArrayList<String> listaDatos = new ArrayList<>();
        String sentencia = "Select " + datos + " from " + tabla + ";";

        try (PreparedStatement stmt = conexion.prepareStatement(sentencia)) {
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {
                listaDatos.add(resultados.getString(datos));
            }

        } catch (SQLException error) {
            mensajeInformativo = error.getMessage();
            System.out.println("Error en la ejecución: " + error.getErrorCode() + " " + error.getMessage());
        }
        return listaDatos;
    }
    
    public ArrayList<String> obtenerDatosSentencia(String sentencia, String columna) {
        ArrayList<String> listaDatos = new ArrayList<>();
        try (PreparedStatement stmt = conexion.prepareStatement(sentencia)) {
            ResultSet resultados = stmt.executeQuery();
            
            while (resultados.next()) {
                listaDatos.add(resultados.getString(columna));
            }

        } catch (SQLException error) {
            System.out.println("Error en la ejecución: " + error.getErrorCode() + " " + error.getMessage());
        }
        return listaDatos;
    }
    
    public int generarValorAleatorio() {
        int valorMinimo = 100000000;
        int valorMaximo = 999999999;
        int valorAleatorio = new Random().nextInt(((valorMaximo - valorMinimo) + 1) + valorMinimo);
        return valorAleatorio;
    }
}
