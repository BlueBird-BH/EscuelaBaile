package com.escuelabaile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class conexionSQL {
    private Connection conexion = null;
    
    public conexionSQL() {}

    public void establecerConexion() {
        try {
            String url = "jdbc:mysql://remotemysql.com/EmTvGOXF3P";
            String usuario = "EmTvGOXF3P";
            String clave = "huf5uABmbI";

            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, clave);

        } catch (SQLException | ClassNotFoundException error) {
            System.out.println("La conexion con la base de datos fallo: " + error);
        }

        if (conexion != null) {
            System.out.println("Conexion a base de datos establecida correctamente");
        }
    }

    public void cerrarConexion() {
        conexion = null;
        System.out.println("La conexion con la base de datos fue cerrada");
    }

    public void agregarValor(String id, String nombre) {
        String sentencia = "insert into Usuarios values (" + id + ", " + "'" + nombre + "'" + ")";

        try (PreparedStatement stmt = conexion.prepareStatement(sentencia)) {
            stmt.executeUpdate();
            System.out.println("El valor fue agregado correctamente");

        } catch (SQLException error) {
            System.out.println("Error en la ejecución: " + error.getErrorCode() + " " + error.getMessage());
        }
    }

    public void mostratValores() {
        String sentencia = "select * from Usuarios";

        try (PreparedStatement stmt = conexion.prepareStatement(sentencia)) {
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {
                String id = resultados.getString("ID");
                String nombre = resultados.getString("Nombre");

                System.out.println("ID: " + id + "  " + "Nombre: " + nombre);
            }

        } catch (SQLException error) {
            System.out.println("Error en la ejecución: " + error.getErrorCode() + " " + error.getMessage());
        }
    }
}
