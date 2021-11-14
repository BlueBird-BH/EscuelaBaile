package com.frontend;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos extends javax.swing.JFrame {

    // Declaracion de Variables - Inicio
    private String nombreArchivo = "seatoraDatos.sdt";
    private Mensajes_GUI interfazGrafica_eliminarArchivo = new Mensajes_GUI();
    // Declaracion de Variables - Fin

    // Abrir archivo - Inicio
    public void abrirArchivo() {
        File archivoAbrir = new File(nombreArchivo);

        if (!archivoAbrir.exists()) {} else {
            abrirArchivo_Proceso(nombreArchivo);
        }
    }

    private void abrirArchivo_Proceso(String archivo) {
        try (FileReader abrirArchivo = new FileReader(archivo);
                BufferedReader abrirArchivoBuff = new BufferedReader(abrirArchivo);) {

            Paciente.listaPacientes.clear();
            Empleado.listaEmpleados.clear();
            Odontologo.listaOdontologos.clear();

            String lineaTexto_abrir;
            while ((lineaTexto_abrir = abrirArchivoBuff.readLine()) != null) {
                String determinanteLista = lineaTexto_abrir.split(" - ")[0];

                switch (determinanteLista) {
                    case "Paciente":
                        Paciente valorPaciente = Paciente.parsePaciente(lineaTexto_abrir);
                        Paciente.listaPacientes.add(valorPaciente);
                        break;

                    case "Empleado":
                        Empleado valorEmpleado = Empleado.parseEmpleado(lineaTexto_abrir);
                        Empleado.listaEmpleados.add(valorEmpleado);
                        break;

                    case "Odontologo":
                        Odontologo valorOdontologo = Odontologo.parseOdontologo(lineaTexto_abrir);
                        Odontologo.listaOdontologos.add(valorOdontologo);
                        break;
                }
            }

        } catch (IOException error) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, error);
        }
    }
    //Abrir archivo - Fin

    // Guardar archivo - Inicio
    public void guardarArchivo() {
        try {
            File archivoGuardar = new File(nombreArchivo);

            if (!archivoGuardar.exists()) {
                archivoGuardar.createNewFile();
            }
            guardarArchivo_Proceso(nombreArchivo);

        } catch (IOException error) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, error);
        }
    }

    public void guardarArchivo_Proceso(String archivo) {
        try (FileWriter guardarArchivo = new FileWriter(archivo);
                BufferedWriter guardarArchivoOutput = new BufferedWriter(guardarArchivo);) {

            for (Paciente lineaTexto_guardar : Paciente.listaPacientes) {
                guardarArchivoOutput.write(lineaTexto_guardar.toString());
                guardarArchivoOutput.newLine();
            }

            for (Empleado lineaTexto_guardar : Empleado.listaEmpleados) {
                guardarArchivoOutput.write(lineaTexto_guardar.toString());
                guardarArchivoOutput.newLine();
            }

            for (Odontologo lineaTexto_guardar : Odontologo.listaOdontologos) {
                guardarArchivoOutput.write(lineaTexto_guardar.toString());
                guardarArchivoOutput.newLine();
            }
            guardarArchivoOutput.close();

        } catch (IOException error) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, error);
        }
    }
    // Guardar archivo - Fin

    // Eliminar archivo - Inicio
    public void eliminarArchivo() {
        File archivoEliminar = new File(nombreArchivo);
        interfazGrafica_eliminarArchivo.setVisible(true);

        if (archivoEliminar.delete()) {
            interfazGrafica_eliminarArchivo.interfazRequerida("correcto");
        } else if (!archivoEliminar.exists()) {
            interfazGrafica_eliminarArchivo.interfazRequerida("existencia");
        } else {
            interfazGrafica_eliminarArchivo.interfazRequerida("error");
        }
    }
    // Eliminar archivo - Fin
}
