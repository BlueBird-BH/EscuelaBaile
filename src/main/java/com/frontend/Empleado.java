package com.frontend;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTextField;

public class Empleado extends Persona implements Interfaz {

    // Declaracion de Variables - Inicio
    private String cargoEmpleado, tipoEmpleado, salarioMensual;
    // Declaracion de Variables - Fin

    // Metodos Set - Inicio
    public void set_cargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public void set_tipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public void set_salarioMensual(String salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    // Metodos Set - Fin

    // Metodos Get - Inicio
    public String get_cargoEmpleado() {
        return cargoEmpleado;
    }

    public String get_tipoEmpleado() {
        return tipoEmpleado;
    }

    public String get_salarioMensual() {
        return salarioMensual;
    }
    // Metodos Get - Fin

    // Constructor de la clase Empleado - Inicio
    public Empleado(String determinacionLista, String nombre, String identificacion, String fechaNacimiento, String cargoEmpleado, String tipoEmpleado, String salarioMensual) {
        super(determinacionLista, nombre, identificacion, fechaNacimiento);
        this.set_cargoEmpleado(cargoEmpleado);
        this.set_tipoEmpleado(tipoEmpleado);
        this.set_salarioMensual(salarioMensual);
    }
    // Constructor de la clase Empleado - Fin

    // Funcion que permite registar un empleado nuevo - Inicio
    public void registrarPersona(String determinacionLista, String nombre, String identificacion, String fechaNacimiento, String cargoEmpleado, String tipoEmpleado, String salarioMensual) {
        listaEmpleados.add(new Empleado(
                determinacionLista,
                nombre,
                identificacion,
                fechaNacimiento,
                cargoEmpleado,
                tipoEmpleado,
                salarioMensual
        ));
    }
    // Funcion que permite registar un empleado nuevo - Fin

    // Funcion que permite modificar los detalles de un empleado - Inicio
    public void modificarPersona(String opcionUsuario, JComboBox<String> variableCombo, JTextField datoModificar) {
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem());
        String nuevoValor = datoModificar.getText();

        switch (opcionUsuario) {
            case "cargo":
                for (int n = 0; n < listaEmpleados.size(); n++) {
                    if (listaEmpleados.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                        listaEmpleados.get(n).set_cargoEmpleado(nuevoValor);
                    }
                }
                break;

            case "tipo":
                for (int n = 0; n < listaEmpleados.size(); n++) {
                    if (listaEmpleados.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                        listaEmpleados.get(n).set_tipoEmpleado(nuevoValor);
                    }
                }
                break;

            case "salario":
                for (int n = 0; n < listaEmpleados.size(); n++) {
                    if (listaEmpleados.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                        listaEmpleados.get(n).set_salarioMensual(nuevoValor);
                    }
                }
                break;
        }
    }
    // Funcion que permite modificar los detalles de un empleado - Fin

    // Funcion que permite retirar a un empleado del programa por medio de su documento de identidad - Inicio
    @Override
    public void retirarPersona(JComboBox<String> variableCombo) {
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem());

        for (int n = 0; n < listaEmpleados.size(); n++) {
            if (listaEmpleados.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                listaEmpleados.remove(n);
            }
        }
    }
    // Funcion que permite retirar a un empleado del programa por medio de su documento de identidad - Fin

    // Funcion que permite visualizar los detalles ingresados de un empleado - Inicio
    public void detallesPersona(JComboBox<String> variableCombo, JTextField nombre, JTextField nacimiento, JTextField cargoAsignado, JTextField cargoTipo, JTextField salario, JTextField valor6, JTextField valor7) {
        String criterioBusqueda = String.valueOf(variableCombo.getSelectedItem());

        for (int n = 0; n < listaEmpleados.size(); n++) {
            if (listaEmpleados.get(n).get_identificacion().equals(criterioBusqueda) == true) {
                nombre.setText(listaEmpleados.get(n).get_nombreCompleto());
                nacimiento.setText(listaEmpleados.get(n).get_fechaNacimiento());
                cargoAsignado.setText(listaEmpleados.get(n).get_cargoEmpleado());
                cargoTipo.setText(listaEmpleados.get(n).get_tipoEmpleado());
                salario.setText(listaEmpleados.get(n).get_salarioMensual());
            }
        }
    }
    // Funcion que permite visualizar los detalles ingresados de un empleado - Fin

    // Funcion que permite listar todos los empleados presentes en el programa - Inicio
    @Override
    public void listaPersona(DefaultListModel modelo, JList<String> listaJFrame) {
        listaJFrame.setModel(modelo);
        modelo.removeAllElements();

        for (int n = 0; n < listaEmpleados.size(); n++) {
            modelo.addElement("Nombre: " + listaEmpleados.get(n).get_nombreCompleto());
            modelo.addElement("Tarjeta de Identidad: " + listaEmpleados.get(n).get_identificacion());
            modelo.addElement("Cargo del empleado: " + listaEmpleados.get(n).get_cargoEmpleado());
            modelo.addElement("[==================================================]");   
        }
    }
    // Funcion que permite listar todos los empleados presentes en el programa - Fin

    // Funcion toString que convierte cada valor en String para poder ser guardado y leido correctamente por el programa - Inicio
    @Override
    public String toString() {
        String separador = " - ";
        return get_determinacionLista() + separador
                + get_nombreCompleto() + separador
                + get_identificacion() + separador
                + get_fechaNacimiento() + separador
                + get_cargoEmpleado() + separador
                + get_tipoEmpleado() + separador
                + get_salarioMensual();
    }
    // Funcion toString que convierte cada valor en String para poder ser guardado y leido correctamente por el programa - Fin

    // Funcion parseObjeto que convierte cada valor de texto en un objeto para poder ser leido correctamente por el programa - Inicio
    public static Empleado parseEmpleado(String texto) {
        String[] valorLista = texto.split(" - ");

        String determinacionLista = valorLista[0];
        String nombreCompleto = valorLista[1];
        String identificacion = valorLista[2];
        String fechaNacimiento = valorLista[3];
        String cargoEmpleado = valorLista[4];
        String tipoEmpleado = valorLista[5];
        String salarioMensual = valorLista[6];

        return new Empleado(determinacionLista, nombreCompleto, identificacion, fechaNacimiento, cargoEmpleado, tipoEmpleado, salarioMensual);
    }
    // Funcion parseObjeto que convierte cada valor de texto en un objeto para poder ser leido correctamente por el programa - Fin

    @Override
    public void registrarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
